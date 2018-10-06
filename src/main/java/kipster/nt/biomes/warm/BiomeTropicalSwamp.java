package kipster.nt.biomes.warm;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.world.gen.trees.WorldGenTreeOak;
import kipster.nt.world.gen.trees.WorldGenTreeShrubBirch;
import kipster.nt.world.gen.trees.WorldGenTreeShrubJacaranda;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import kipster.nt.biomes.warm.BiomeTropicalSwamp.EmeraldGenerator;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeTropicalSwamp extends Biome 
{
	protected static final WorldGenTreeShrubJacaranda SHRUB_JACARANDA = new WorldGenTreeShrubJacaranda();
	protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	protected static final IBlockState WATER_LILY = Blocks.WATERLILY.getDefaultState();
	private static final IBlockState JUNGLE_LOG = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
    private static final IBlockState JUNGLE_LEAF = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
	
	public BiomeTropicalSwamp(BiomeProperties properties)
	{	
		super(properties);
	
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		    this.decorator.treesPerChunk = 3;
		    this.decorator.bigMushroomsPerChunk = 1;
	        this.decorator.flowersPerChunk = 3;
	        this.decorator.deadBushPerChunk = 1;
	        this.decorator.mushroomsPerChunk = 10;
	        this.decorator.reedsPerChunk = 15;
	        this.decorator.clayPerChunk = 2;
	        this.decorator.waterlilyPerChunk = 5;
	        this.decorator.sandPatchesPerChunk = 1;
	        this.decorator.gravelPatchesPerChunk = 0;
	        this.decorator.grassPerChunk = 7;
	        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySlime.class, 1, 1, 1));
	    }
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
	 if (rand.nextInt(2) == 0)
	 {
	     return SWAMP_FEATURE;
	 }
	 else if (rand.nextInt(2) == 0)
	 {
	     return new WorldGenShrub(JUNGLE_LOG, JUNGLE_LEAF);
	 }
	 else if (rand.nextInt(1) == 0)
	 {
	     return SHRUB_JACARANDA;
	 }

	 else
	 {
	     return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? new WorldGenTrees(false, 4 + rand.nextInt(7), JUNGLE_LOG, JUNGLE_LEAF, true) : new WorldGenTrees(false, 4 + rand.nextInt(7), JUNGLE_LOG, JUNGLE_LEAF, true));
	 }
	}

	    
	    public WorldGenerator getRandomWorldGenForGrass(Random rand)
	    {
	        return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
	    }

	    public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
	    {
	        return BlockFlower.EnumFlowerType.BLUE_ORCHID;
	    }

	    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
	    {
	        double d0 = GRASS_COLOR_NOISE.getValue((double)x * 0.25D, (double)z * 0.25D);

	        if (d0 > 0.0D)
	        {
	            int i = x & 15;
	            int j = z & 15;

	            for (int k = 255; k >= 0; --k)
	            {
	                if (chunkPrimerIn.getBlockState(j, k, i).getMaterial() != Material.AIR)
	                {
	                    if (k == 62 && chunkPrimerIn.getBlockState(j, k, i).getBlock() != Blocks.WATER)
	                    {
	                        chunkPrimerIn.setBlockState(j, k, i, WATER);

	                        if (d0 < 0.12D)
	                        {
	                            chunkPrimerIn.setBlockState(j, k + 1, i, WATER_LILY);
	                        }
	                    }

	                    break;
	                }
	            }
	        }

	        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	    }

	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {
	        super.decorate(worldIn, rand, pos);

	        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
		         int boulderChance = rand.nextInt(16);
		         if (boulderChance == 0) {
		          int k6 = rand.nextInt(16) + 9;
		          int l = rand.nextInt(16) + 9;
		           BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, 3));
		           LAKE.generate(worldIn, rand, blockpos);
		         }
		         
	        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FOSSIL))
	        if (rand.nextInt(64) == 0)
	        {
	            (new WorldGenFossils()).generate(worldIn, rand, pos);
	        }
	        net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
	        WorldGenerator emeralds = new EmeraldGenerator();
	        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, emeralds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.EMERALD))
	            emeralds.generate(worldIn, rand, pos);
	        
	        int i = rand.nextInt(16) + 8;
	        int j = rand.nextInt(16) + 8;
	        int height = worldIn.getHeight(pos.add(i, 0, j)).getY() * 2; // could == 0, which crashes nextInt
	        if (height < 1) height = 1;
	        int k = rand.nextInt(height);
	        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), pos.add(i, k, j), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.PUMPKIN))
	        (new WorldGenMelon()).generate(worldIn, rand, pos.add(i, k, j));
	        WorldGenVines worldgenvines = new WorldGenVines();

	        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
	        for (int j1 = 0; j1 < 50; ++j1)
	        {
	            k = rand.nextInt(16) + 8;
	            int l = 128;
	            int i1 = rand.nextInt(16) + 8;
	            worldgenvines.generate(worldIn, rand, pos.add(k, 128, i1));
	        }
	        net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
	    }
	    }
	        @Override
	    	public int getModdedBiomeGrassColor(int original) {
	    	    return super.getModdedBiomeGrassColor(0x88D43B);
	    	}
	    	@Override
	    	public int getModdedBiomeFoliageColor(int original) {
	    	    return super.getModdedBiomeFoliageColor(0x88D43B);
	    }

	    @Override
	    public void addDefaultFlowers()
	    {
	        addFlower(Blocks.RED_FLOWER.getDefaultState().withProperty(Blocks.RED_FLOWER.getTypeProperty(), BlockFlower.EnumFlowerType.BLUE_ORCHID), 10);
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