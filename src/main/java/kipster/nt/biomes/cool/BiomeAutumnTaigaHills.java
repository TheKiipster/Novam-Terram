package kipster.nt.biomes.cool;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.cool.BiomeAutumnTaigaHills.DiamondGenerator;
import kipster.nt.world.gen.WorldGenPatches;
import kipster.nt.world.gen.trees.WorldGenTreeAutumnTaigaOrange;
import kipster.nt.world.gen.trees.WorldGenTreeAutumnTaigaYellow;
import kipster.nt.world.gen.trees.WorldGenTreeShrubSpruce;
import kipster.nt.world.gen.trees.WorldGenTreeTallSpruce;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeAutumnTaigaHills extends Biome 
{	
	 protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	protected static final WorldGenAbstractTree YELLOW = new WorldGenTreeAutumnTaigaYellow(false, false);
	protected static final WorldGenAbstractTree ORANGE = new WorldGenTreeAutumnTaigaOrange(false, false);
   private final WorldGenTreeTallSpruce spruceGenerator = new WorldGenTreeTallSpruce(true);
	 
	public BiomeAutumnTaigaHills() 
	{
		super(new BiomeProperties("Autumn Taiga Hills").setBaseHeight(Biomes.TAIGA_HILLS.getBaseHeight()).setHeightVariation(Biomes.TAIGA_HILLS.getHeightVariation()).setTemperature(Biomes.TAIGA_HILLS.getDefaultTemperature()).setRainfall(Biomes.TAIGA_HILLS.getRainfall()));
		
		BiomeManager.addVillageBiome(BiomeInit.autumntaigaHillsBiome , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
       this.spawnableCreatureList.clear();
       this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 8, 4, 4));
       this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
       this.decorator.treesPerChunk = 7;
       this.decorator.flowersPerChunk = 2;
       this.decorator.grassPerChunk = 4;

	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
	if (rand.nextInt(2) > 0)
	{
		  return this.spruceGenerator;
	}
	else
	{
	  return (WorldGenAbstractTree)(rand.nextInt(4) == 0 ? YELLOW : ORANGE);
	}
}
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
   {
       return rand.nextInt(5) > 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
   }

   public void decorate(World worldIn, Random rand, BlockPos pos)
   {

       DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.FERN);

       if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
       for (int i1 = 0; i1 < 7; ++i1)
       {
           int j1 = rand.nextInt(16) + 8;
           int k1 = rand.nextInt(16) + 8;
           int l1 = rand.nextInt(worldIn.getHeight(pos.add(j1, 0, k1)).getY() + 32);
           DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j1, l1, k1));
       }
      
       net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
       WorldGenerator diamonds = new DiamondGenerator();
       if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, diamonds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIAMOND))
    	   diamonds.generate(worldIn, rand, pos);
       
       if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
           int boulderChance = rand.nextInt(12);
           if (boulderChance == 0) {
            int k6 = rand.nextInt(16) + 8;
            int l = rand.nextInt(16) + 8;
             BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
             LAKE.generate(worldIn, rand, blockpos);
           }
           
           super.decorate(worldIn, rand, pos);
       }
   }
   
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0xA4BA6B;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0xA4BA6B;
	}
	
		 public static class DiamondGenerator extends WorldGenerator
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
		                    worldIn.setBlockState(blockpos, Blocks.DIAMOND_ORE.getDefaultState(), 16 | 2);
		                }
		            }
		            return true;
		        }
		    }
}