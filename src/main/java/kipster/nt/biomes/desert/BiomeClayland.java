package kipster.nt.biomes.desert;

import java.util.Iterator;
import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.desert.BiomeClayland.GoldGenerator;
import kipster.nt.config.*;
import kipster.nt.world.gen.WorldGenLine;
import kipster.nt.world.gen.trees.WorldGenTreeShrubOak;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeClayland extends Biome 
{
	

	protected static final WorldGenBlockBlob CLAY_BOULDER_FEATURE = new WorldGenBlockBlob(Blocks.HARDENED_CLAY, 1);
	protected static final WorldGenLine CLAY = new WorldGenLine(Blocks.HARDENED_CLAY, 1);
	protected static final WorldGenLakes LAVA_LAKE_FEATURE = new WorldGenLakes(Blocks.LAVA);
	protected static final WorldGenTreeShrubOak SHRUB_OAK = new WorldGenTreeShrubOak();
	
	public BiomeClayland(BiomeProperties properties)
	{	
		super(properties);
	
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 1;
		this.decorator.grassPerChunk = 10;
		this.decorator.deadBushPerChunk = 7;
		this.decorator.flowersPerChunk = 2;
		this.decorator.cactiPerChunk = 3;
		this.decorator.gravelPatchesPerChunk = 10;
		this.decorator.sandPatchesPerChunk = 10;
		
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHorse.class, 1, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityDonkey.class, 1, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        Iterator<Biome.SpawnListEntry> iterator = this.spawnableMonsterList.iterator();

        while (iterator.hasNext())
        {
            Biome.SpawnListEntry biome$spawnlistentry = iterator.next();

            if (biome$spawnlistentry.entityClass == EntityZombie.class || biome$spawnlistentry.entityClass == EntityZombieVillager.class)
            {
                iterator.remove();
            }
        }

        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombie.class, 19, 4, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombieVillager.class, 1, 1, 1));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityHusk.class, 80, 4, 4));

	}
	
	@Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        if (noiseVal > 1.9D) {
            this.topBlock = Blocks.HARDENED_CLAY.getDefaultState();
            this.fillerBlock = Blocks.HARDENED_CLAY.getDefaultState();  } 
        else {
         this.topBlock = Blocks.GRASS.getDefaultState();
            this.fillerBlock = Blocks.DIRT.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
        
		
	}
	
	  public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	     {
	         return (WorldGenAbstractTree)(rand.nextInt(5) > 0 ? SHRUB_OAK : TREE_FEATURE);
	     }
	
	        public void decorate(World worldIn, Random rand, BlockPos pos)
	        {
	            super.decorate(worldIn, rand, pos);

	            net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
		 	       WorldGenerator gold = new GoldGenerator();
		 	       if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, gold, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GOLD))
		 	    	   gold.generate(worldIn, rand, pos);
	            
	            if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.DESERT_WELL))
	            if (rand.nextInt(1000) == 0)
	            {
	                int i = rand.nextInt(16) + 8;
	                int j = rand.nextInt(16) + 8;
	                BlockPos blockpos = worldIn.getHeight(pos.add(i, 0, j)).up();
	                (new WorldGenDesertWells()).generate(worldIn, rand, blockpos);
	            }

	            if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FOSSIL))
	            if (rand.nextInt(64) == 0)
	            {
	                (new WorldGenFossils()).generate(worldIn, rand, pos);
	            }
	            if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_LAVA)) {
     	           int boulderChance = rand.nextInt(12);
     	           if (boulderChance == 0) {
     	            int k6 = rand.nextInt(16) + 8;
     	            int l = rand.nextInt(16) + 8;
     	             BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
     	             LAVA_LAKE_FEATURE.generate(worldIn, rand, blockpos);
     	           }
	            net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
	        }
	            if (!MiscConfig.disableBouldersInClayland && net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
		            int genChance = rand.nextInt(3);
		            if (genChance == 0) {
		                int k6 = rand.nextInt(16) + 8;
		                int l = rand.nextInt(16) + 8;
		                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
		                CLAY_BOULDER_FEATURE.generate(worldIn, rand, blockpos);
		            }
		            if (!MiscConfig.disableBouldersInClayland && net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
			            int genChance1 = rand.nextInt(3);
			            if (genChance1 == 0) {
			                int k6 = rand.nextInt(16) + 8;
			                int l = rand.nextInt(16) + 8;
			                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
			                CLAY.generate(worldIn, rand, blockpos);
			            }
		            }
	            }
	          }
	        
	        @Override
	  			public int getModdedBiomeGrassColor(int original) {
	  			    return super.getModdedBiomeGrassColor(0xCCC566);
	  			}
	  			@Override
	  			public int getModdedBiomeFoliageColor(int original) {
	  			    return super.getModdedBiomeFoliageColor(0xB9CC66);
	  	}
	  			@Override
	  			public int getSkyColorByTemp(float currentTemperature) {
	  				
	  					return 0x83BFBD;
	  			}
	        
		   	 public static class GoldGenerator extends WorldGenerator
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
		   	                    worldIn.setBlockState(blockpos, Blocks.GOLD_ORE.getDefaultState(), 16 | 2);
		   	                }
		   	            }
		   	            return true;
		   	        }
		   	    }
	    }