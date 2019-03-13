package kipster.nt.biomes.warm;

import java.util.Random;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.warm.BiomeHeath.EmeraldGenerator;
import kipster.nt.world.gen.WorldGenPatches;
import kipster.nt.world.gen.trees.WorldGenTreeShrubAcacia;
import kipster.nt.world.gen.trees.WorldGenTreeShrubDarkOak;
import kipster.nt.world.gen.trees.WorldGenTreeShrubJacaranda;
import kipster.nt.world.gen.trees.WorldGenTreeShrubOak;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeHeath extends Biome 
{
	protected static final WorldGenPatches SAND_PATCHES = new WorldGenPatches(Blocks.SAND.getDefaultState(), 6);
	protected static final WorldGenAbstractTree SHRUB_JACARANDA = new WorldGenTreeShrubJacaranda();
	protected static final WorldGenAbstractTree SHRUB_DARKOAK = new WorldGenTreeShrubDarkOak();
	protected static final WorldGenAbstractTree SHRUB_OAK = new WorldGenTreeShrubOak();
	protected static final WorldGenAbstractTree SHRUB_ACACIA = new WorldGenTreeShrubAcacia();
	
	public BiomeHeath(BiomeProperties properties)
	{	
		super(properties);
	
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.extraTreeChance = 2F;
		this.decorator.treesPerChunk = 3;
        this.decorator.flowersPerChunk = 10;
        this.decorator.grassPerChunk = 11;
        this.decorator.deadBushPerChunk = 25;
        this.decorator.sandPatchesPerChunk = 10;
	    
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityDonkey.class, 1, 1, 3));
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPig.class, 5, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityCow.class, 8, 4, 4));
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
	if (rand.nextInt(2) > 0)
	{
		return SHRUB_JACARANDA;
	}
	else if (rand.nextInt(3) == 0)
	 {
	     return SHRUB_ACACIA;
	 }
	else
	{
		return (WorldGenAbstractTree)(rand.nextInt(4) == 0 ? SHRUB_OAK : SHRUB_DARKOAK);
		
		}
	}
	
	public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
    {
		if (rand.nextInt(2) > 0)
		{
			return BlockFlower.EnumFlowerType.HOUSTONIA;
		}
		else
		{
        return BlockFlower.EnumFlowerType.ALLIUM;
    }
    }
	
	
	public void addDoublePlants(World p_185378_1_, Random p_185378_2_, BlockPos p_185378_3_, int p_185378_4_)
	{
	    for (int i = 0; i < p_185378_4_; ++i)
	    {
	        int j = p_185378_2_.nextInt(3);

	        if (j == 0)
	        {
	            DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SYRINGA);
	        }

	        for (int k = 0; k < 5; ++k)
	        {
	            int l = p_185378_2_.nextInt(16) + 8;
	            int i1 = p_185378_2_.nextInt(16) + 8;
	            int j1 = p_185378_2_.nextInt(p_185378_1_.getHeight(p_185378_3_.add(l, 0, i1)).getY() + 32);

	            if (DOUBLE_PLANT_GENERATOR.generate(p_185378_1_, p_185378_2_, new BlockPos(p_185378_3_.getX() + l, j1, p_185378_3_.getZ() + i1)))
	            {
	                break;
	            }
	        }
	    }
	}
	
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		int grasspatchChance = rand.nextInt(6);
		if (grasspatchChance == 0) {
			int k6 = rand.nextInt(16) + 8;
			int l = rand.nextInt(16) + 8;
			BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
			SAND_PATCHES.generate(worldIn, rand, blockpos);
			}
		 if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
		 { // no tab for patch
		 int i = rand.nextInt(5) - 3;
		 {
		     i += 2;
		 }

		 this.addDoublePlants(worldIn, rand, pos, i);
		 }
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
	    public void addDefaultFlowers()
	    {
	        addFlower(Blocks.RED_FLOWER.getDefaultState().withProperty(Blocks.RED_FLOWER.getTypeProperty(), BlockFlower.EnumFlowerType.ALLIUM), 20);
	    }
	    
	 @Override
	    public int getGrassColorAtPos(BlockPos pos)
	    {
	        double d0 = GRASS_COLOR_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
	        return d0 < -0.1D ? super.getModdedBiomeGrassColor(0x9FB068) : super.getModdedBiomeGrassColor(0xAFC568);
	    }

	 @Override
	 public int getModdedBiomeFoliageColor(int original) {
		    return super.getModdedBiomeFoliageColor(0xAFC568);
	   	}

}