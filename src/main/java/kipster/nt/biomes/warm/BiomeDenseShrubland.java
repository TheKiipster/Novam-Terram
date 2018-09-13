package kipster.nt.biomes.warm;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.warm.BiomeDenseShrubland.EmeraldGenerator;
import kipster.nt.world.gen.WorldGenPatches;
import kipster.nt.world.gen.trees.WorldGenTreeShrubBirch;
import kipster.nt.world.gen.trees.WorldGenTreeShrubOak;
import kipster.nt.world.gen.trees.WorldGenTreeShrubSpruce;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeDenseShrubland extends Biome 
{
	
	protected static final WorldGenAbstractTree SHRUB_OAK = new WorldGenTreeShrubOak();
	protected static final WorldGenAbstractTree SHRUB_SPRUCE = new WorldGenTreeShrubSpruce();
	protected static final WorldGenAbstractTree SHRUB_BIRCH = new WorldGenTreeShrubBirch();
	
	public BiomeDenseShrubland(BiomeProperties properties)
	{	
		super(properties);
	
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 2;
        this.decorator.flowersPerChunk = 2;
        this.decorator.grassPerChunk = 5;
	    this.decorator.generateFalls = true;
	    this.spawnableCreatureList.clear();
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySheep.class, 5, 2, 6));
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPig.class, 5, 2, 6));
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
	if (rand.nextInt(3) > 0)
	{
		return SHRUB_BIRCH;
	}
	else
	{
		return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? SHRUB_OAK : SHRUB_SPRUCE);
		
		}
	}
	
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		 net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
	        WorldGenerator emeralds = new EmeraldGenerator();
	        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, emeralds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.EMERALD))
	            emeralds.generate(worldIn, rand, pos);

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
	                net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
	            }
	            return true;
	        }
	    }
	 
	 @Override
	 public int getModdedBiomeGrassColor(int original) {
		    return super.getModdedBiomeGrassColor(0x89BA60);
		}
	 
	 @Override
	 public int getModdedBiomeFoliageColor(int original) {
		    return super.getModdedBiomeFoliageColor(0x89BA60);
		    
	}
}