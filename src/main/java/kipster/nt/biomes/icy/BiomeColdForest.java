package kipster.nt.biomes.icy;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.icy.BiomeColdForest.LapisGenerator;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeColdForest extends BiomeForest
{
		public BiomeColdForest(BiomeForest.Type type, String name) {
	        super(type, new BiomeProperties(name).setTemperature(Biomes.ICE_PLAINS.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()).setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setSnowEnabled());
	    }
		
		public void decorate(World worldIn, Random rand, BlockPos pos)
		{
			  net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
		       WorldGenerator lapis = new LapisGenerator();
		       if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, lapis, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.LAPIS))
		    	   lapis.generate(worldIn, rand, pos);
		  
		    super.decorate(worldIn, rand, pos);
			}
		
		public static class LapisGenerator extends WorldGenerator
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
	                    worldIn.setBlockState(blockpos, Blocks.LAPIS_ORE.getDefaultState(), 16 | 2);
	                }
	                net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
	            }
	            return true;
	        }
	    }
	    @Override
	    public int getModdedBiomeGrassColor(int original) {
	        return super.getModdedBiomeGrassColor(0xA1B269);
	    }
	    @Override
	    public int getModdedBiomeFoliageColor(int original) {
	        return super.getModdedBiomeFoliageColor(0xA1B269);
	    }
	}