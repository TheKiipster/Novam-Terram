package kipster.nt.biomes.cool;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.cool.BiomeStoneFields.DiamondGenerator;
import kipster.nt.config.*;
import kipster.nt.world.gen.WorldGenLine;
import kipster.nt.world.gen.trees.WorldGenTreeShrubSpruce;
import kipster.nt.world.gen.trees.WorldGenTreeTallSpruce;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeCliffs extends Biome 
{	
	protected static final WorldGenAbstractTree TREE = new WorldGenTreeShrubSpruce();
	private static final WorldGenTreeTallSpruce SPRUCE_GENERATOR = new WorldGenTreeTallSpruce(true);
	protected static final WorldGenBlockBlob COBBLESTONE_BOULDER_FEATURE = new WorldGenBlockBlob(Blocks.COBBLESTONE, 1);
	protected static final WorldGenLine COBBLESTONE_LINE = new WorldGenLine(Blocks.COBBLESTONE, 1);
	
	 public BiomeCliffs(BiomeProperties properties)
	  	{	
	  		super(properties);
	  	
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.generateFalls = true; 
		this.decorator.gravelPatchesPerChunk = 4;
		this.decorator.treesPerChunk = 3;
        this.decorator.flowersPerChunk = 1;
        this.decorator.grassPerChunk = 1;
        
        
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLlama.class, 5, 4, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	}
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        
            return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? SPRUCE_GENERATOR : TREE);
        
    }
	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {

		 net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
	       WorldGenerator diamonds = new DiamondGenerator();
	       if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, diamonds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIAMOND))
	    	   diamonds.generate(worldIn, rand, pos);
	   
	       net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));

	       if (!MiscConfig.disableBouldersInCliffs && net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
	            int genChance = rand.nextInt(3);
	            if (genChance == 0) {
	                int k6 = rand.nextInt(16) + 8;
	                int l = rand.nextInt(16) + 8;
	                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
	                COBBLESTONE_BOULDER_FEATURE.generate(worldIn, rand, blockpos);
	            }
	       }
	            if (!MiscConfig.disableBouldersInCliffs && net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
		            int genChance1 = rand.nextInt(3);
		            if (genChance1 == 0) {
		                int k6 = rand.nextInt(16) + 8;
		                int l = rand.nextInt(16) + 8;
		                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
		                COBBLESTONE_LINE.generate(worldIn, rand, blockpos);
		            }
	            }
	super.decorate(worldIn, rand, pos);
		
	}
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return super.getModdedBiomeGrassColor(0x8cb06b);
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return super.getModdedBiomeFoliageColor(0x8cb06b);
	}

	 public static class DiamondGenerator extends WorldGenerator
	    {
	        @Override
	        public boolean generate(World worldIn, Random rand, BlockPos pos)
	        {
	            int count = 10 + rand.nextInt(6);
	            for (int i = 0; i < count; i++)
	            {
	                int offset = net.minecraftforge.common.ForgeModContainer.fixVanillaCascading ? 8 : 0; // MC-114332
	                BlockPos blockpos = pos.add(rand.nextInt(16) + offset, rand.nextInt(28) + 2, rand.nextInt(16) + offset);

	                net.minecraft.block.state.IBlockState state = worldIn.getBlockState(blockpos);
	                if (state.getBlock().isReplaceableOreGen(state, worldIn, blockpos, net.minecraft.block.state.pattern.BlockMatcher.forBlock(Blocks.STONE)))
	                {
	                    worldIn.setBlockState(blockpos, Blocks.DIAMOND_ORE.getDefaultState(), 16 | 2);
	                }
	            }
	            return true;
	        }
	    }
} 