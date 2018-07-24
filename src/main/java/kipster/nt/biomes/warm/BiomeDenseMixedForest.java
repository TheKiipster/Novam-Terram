package kipster.nt.biomes.warm;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.warm.BiomeDenseMixedForest.EmeraldGenerator;
import kipster.nt.world.gen.trees.WorldGenTreeOak;
import kipster.nt.world.gen.trees.WorldGenTreeShrubBirch;
import kipster.nt.world.gen.trees.WorldGenTreeShrubDarkOak;
import kipster.nt.world.gen.trees.WorldGenTreeShrubOak;
import kipster.nt.world.gen.trees.WorldGenTreeShrubSpruce;
import kipster.nt.world.gen.trees.WorldGenTreeTallSpruce;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeDenseMixedForest extends Biome 
{
	
	protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	protected static final WorldGenBirchTree BIRCH_TREE = new WorldGenBirchTree(false, false);
	protected static final WorldGenBirchTree SUPER_BIRCH_TREE = new WorldGenBirchTree(false, true);
	protected static final WorldGenTreeOak OAK_TREE = new WorldGenTreeOak(false, false);
	private final WorldGenTaiga1 otherspruceGenerator = new WorldGenTaiga1();
	private final WorldGenTreeTallSpruce spruceGenerator = new WorldGenTreeTallSpruce(true);
	protected static final WorldGenCanopyTree ROOF_TREE = new WorldGenCanopyTree(false);
	protected static final WorldGenAbstractTree SHRUB_OAK = new WorldGenTreeShrubOak();
	protected static final WorldGenAbstractTree SHRUB_SPRUCE = new WorldGenTreeShrubSpruce();
	protected static final WorldGenAbstractTree SHRUB_BIRCH = new WorldGenTreeShrubBirch();
	protected static final WorldGenAbstractTree SHRUB_DARKOAK = new WorldGenTreeShrubDarkOak();
	
	public BiomeDenseMixedForest() 
	{
		super(new BiomeProperties("Dense Mixed Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 8;
		this.decorator.flowersPerChunk = 1;
	    this.decorator.grassPerChunk = 3;
	    this.decorator.generateFalls = true;
	    this.spawnableCreatureList.clear();
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
		
	}
	
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
		  if (rand.nextInt(3) > 0)
	        {
	    return (WorldGenAbstractTree)(rand.nextInt(3) > 0 ? this.spruceGenerator : super.getRandomTreeFeature(rand));
	        }
	    else if (rand.nextInt(5) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? BIG_TREE_FEATURE : SUPER_BIRCH_TREE);
        }
	    else if (rand.nextInt(5) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? SHRUB_OAK : SHRUB_SPRUCE);
        }
	    else if (rand.nextInt(5) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? SHRUB_BIRCH : SHRUB_DARKOAK);
        }
	    else if (rand.nextInt(5) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? ROOF_TREE : ROOF_TREE);
        }
	    else if (rand.nextInt(4) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? this.otherspruceGenerator : TREE_FEATURE);
        }
        else
        {
            return OAK_TREE;
        }
}
    
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		 net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
	        WorldGenerator emeralds = new EmeraldGenerator();
	        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, emeralds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.EMERALD))
	            emeralds.generate(worldIn, rand, pos);
	        
		 if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
	         int boulderChance = rand.nextInt(12);
	         if (boulderChance == 0) {
	          int k6 = rand.nextInt(16) + 8;
	          int l = rand.nextInt(16) + 8;
	           BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
	           LAKE.generate(worldIn, rand, blockpos);
	         }
	         net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
	        }

	    super.decorate(worldIn, rand, pos);
	        }
	
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x8BAB3A;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x8BAB3A;
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
}