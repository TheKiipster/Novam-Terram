package kipster.nt.biomes.warm;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.world.gen.trees.WorldGenTreeBigAutumnTaigaOrange;
import kipster.nt.world.gen.trees.WorldGenTreeDead;
import kipster.nt.world.gen.trees.WorldGenTreeOak;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import kipster.nt.biomes.warm.BiomeBog.EmeraldGenerator;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeBog extends Biome 
{
 protected static final IBlockState WATER_LILY = Blocks.WATERLILY.getDefaultState();
 protected static final WorldGenAbstractTree DEAD = new WorldGenTreeDead(false, false);
	public BiomeBog() 
	{
		super(new BiomeProperties("Bog").setBaseHeight(Biomes.SWAMPLAND.getBaseHeight()).setHeightVariation(Biomes.SWAMPLAND.getHeightVariation()).setTemperature(Biomes.SWAMPLAND.getDefaultTemperature()).setRainfall(Biomes.SWAMPLAND.getRainfall()).setWaterColor(0x523507));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		    this.decorator.treesPerChunk = 3;
	        this.decorator.flowersPerChunk = 1;
	        this.decorator.deadBushPerChunk = 1;
	        this.decorator.mushroomsPerChunk = 10;
	        this.decorator.reedsPerChunk = 13;
	        this.decorator.clayPerChunk = 8;
	        this.decorator.waterlilyPerChunk = 7;
	        this.decorator.sandPatchesPerChunk = 1;
	        this.decorator.gravelPatchesPerChunk = 0;
	        this.decorator.grassPerChunk = 6;
	        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySlime.class, 2, 2, 2));
	    }
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
	if (rand.nextInt(2) > 0)
	{
		  return DEAD;
	}
	else
	{
	  return (WorldGenAbstractTree)(rand.nextInt(4) == 0 ? SWAMP_FEATURE : SWAMP_FEATURE);
	}
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

	        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FOSSIL))
	        if (rand.nextInt(64) == 0)
	        {
	            (new WorldGenFossils()).generate(worldIn, rand, pos);
	        }
	        net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
	        WorldGenerator emeralds = new EmeraldGenerator();
	        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, emeralds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.EMERALD))
	            emeralds.generate(worldIn, rand, pos);
	        
	        net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
	    }
	    
	        @Override
	    	public int getModdedBiomeGrassColor(int original) {
	    	    return 0x747036;
	    	}
	    	@Override
	    	public int getModdedBiomeFoliageColor(int original) {
	    	    return 0x5C803C;
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