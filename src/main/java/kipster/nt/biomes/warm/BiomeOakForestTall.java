package kipster.nt.biomes.warm;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.world.gen.trees.WorldGenTreeOak;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeOakForestTall extends Biome 
{
	
	protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	protected static final WorldGenTreeOak OAK_TREE = new WorldGenTreeOak(false, false);
	protected static final WorldGenTreeOak TALL_OAK_TREE = new WorldGenTreeOak(false, true);
	
	public BiomeOakForestTall() 
	{
		super(new BiomeProperties("Tall Oak Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 10;
		this.decorator.flowersPerChunk = 1;
	    this.decorator.grassPerChunk = 3;
	    this.decorator.generateFalls = true;
	    this.spawnableCreatureList.clear();
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
		
	}
	
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
		
            return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? TALL_OAK_TREE : OAK_TREE);
      
            
    }
    
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		
		 if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
	         int boulderChance = rand.nextInt(12);
	         if (boulderChance == 0) {
	          int k6 = rand.nextInt(16) + 8;
	          int l = rand.nextInt(16) + 8;
	           BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
	           LAKE.generate(worldIn, rand, blockpos);
	         }
	   
	        }

	    super.decorate(worldIn, rand, pos);
	        }
	
}