package kipster.nt.biomes.warm;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.warm.BiomeForestedLakes.EmeraldGenerator;
import kipster.nt.world.gen.trees.WorldGenTreeOak;
import kipster.nt.world.gen.trees.WorldGenTreeShrubSpruce;
import kipster.nt.world.gen.trees.WorldGenTreeTallSpruce;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeForestedLakes extends Biome 
{
	
	protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	protected static final WorldGenAbstractTree OAK_TREE = new WorldGenTreeOak(false, false);
	private final WorldGenBirchTree birchGenerator = new WorldGenBirchTree(false, false);
	protected static final IBlockState WATER_LILY = Blocks.WATERLILY.getDefaultState();
	
	public BiomeForestedLakes(BiomeProperties properties)
	{	
		super(properties);
	
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 5;
		this.decorator.flowersPerChunk = 1;
	    this.decorator.grassPerChunk = 6;
	    this.decorator.waterlilyPerChunk = 2;
	    this.decorator.generateFalls = true;
	    
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySheep.class, 5, 2, 6));
		
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
	{
	  return (WorldGenAbstractTree)(rand.nextInt(2) == 0 ? OAK_TREE : this.birchGenerator);
	}
	
	}
	
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
	{
	    return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
	}
	
    
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		 net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
	        WorldGenerator emeralds = new EmeraldGenerator();
	        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, emeralds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.EMERALD))
	            emeralds.generate(worldIn, rand, pos);
	        
		 if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
	         int boulderChance = rand.nextInt(16);
	         if (boulderChance == 0) {
	          int k6 = rand.nextInt(16) + 9;
	          int l = rand.nextInt(16) + 9;
	           BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, 3));
	           LAKE.generate(worldIn, rand, blockpos);
	         }
	   
	        }

	    super.decorate(worldIn, rand, pos);
	        }
	
	 public static class EmeraldGenerator extends WorldGenerator
	    {
	        @Override
	        public boolean generate(World worldIn, Random rand, BlockPos pos)
	        {
	            int count = 5 + rand.nextInt(6);
	            for (int i = 0; i < count; i++)
	            {
	                int offset = net.minecraftforge.common.ForgeModContainer.fixVanillaCascading ? 8 : 0; // MC-114332
	                BlockPos blockpos = pos.add(rand.nextInt(16) + offset, rand.nextInt(28) + 2, rand.nextInt(16) + offset);

	                net.minecraft.block.state.IBlockState state = worldIn.getBlockState(blockpos);
	                if (state.getBlock().isReplaceableOreGen(state, worldIn, blockpos, net.minecraft.block.state.pattern.BlockMatcher.forBlock(Blocks.STONE)))
	                {
	                    worldIn.setBlockState(blockpos, Blocks.EMERALD_ORE.getDefaultState(), 16 | 2);
	                }
	            }
	            return true;
        }
    }
	
	 @Override
	   	public int getModdedBiomeGrassColor(int original) {
	   	    return super.getModdedBiomeGrassColor(0x72B04E);
	   	}

	   	@Override
	   	public int getModdedBiomeFoliageColor(int original) {
	   	    return super.getModdedBiomeFoliageColor(0x72B04E);
	   	}
}