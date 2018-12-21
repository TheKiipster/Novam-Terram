package kipster.nt.biomes;

import java.util.ArrayList;
import java.util.Set;

import kipster.nt.biomes.icy.*;
import kipster.nt.biomes.cool.*;
import kipster.nt.biomes.desert.*;
import kipster.nt.biomes.warm.*;
import kipster.nt.config.BiomeWeightConfig;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit 
	{
		public static final ArrayList<Biome> BIOMES = new ArrayList<Biome>();
		
		//WARM
		///public static Biome hills = new BiomeNHills(new BiomeProperties("Hills").setBaseHeight(1.44F).setHeightVariation(0.64F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome aegeanarchipelago = new BiomeAegeanArchipelago(new BiomeProperties("Aegean Archipelago").setBaseHeight(-1.8F).setHeightVariation(0.85F).setTemperature(0.5F).setRainfall(0.3F).setWaterColor(0x00b8ff));
		public static Biome aliummeadow = new BiomeAliumMeadow(new BiomeProperties("Alium Meadow").setBaseHeight(0.11F).setHeightVariation(0.025F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome birchhills = new BiomeBirchHills(new BiomeProperties("Birch Hills").setBaseHeight(0.62F).setHeightVariation(0.5F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome blossomforest = new BiomeBlossomForest(new BiomeProperties("Blossom Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome blossomforesthills = new BiomeBlossomForest(new BiomeProperties("Blossom Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome bog = new BiomeBog(new BiomeProperties("Bog").setBaseHeight(Biomes.SWAMPLAND.getBaseHeight()).setHeightVariation(Biomes.SWAMPLAND.getHeightVariation()).setTemperature(Biomes.SWAMPLAND.getDefaultTemperature()).setRainfall(Biomes.SWAMPLAND.getRainfall()).setWaterColor(0x523507));
		public static Biome denseshrubland = new BiomeDenseShrubland(new BiomeProperties("Dense Shrubland").setBaseHeight(0.11F).setHeightVariation(0.025F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome dryforest = new BiomeDryForest(new BiomeProperties("Dry Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome dryforesthills = new BiomeDryForest(new BiomeProperties("Dry Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome estuary = new BiomeEstuary(new BiomeProperties("Estuary").setBaseHeight(-0.28F).setHeightVariation(0.11F).setTemperature(Biomes.SWAMPLAND.getDefaultTemperature()).setRainfall(Biomes.SWAMPLAND.getRainfall()));
		public static Biome fen = new BiomeFen(new BiomeProperties("Fen").setBaseHeight(-0.28F).setHeightVariation(0F).setTemperature(0.8F).setRainfall(0.9F).setWaterColor(14745518));
		public static Biome floralmeadow = new BiomeFloralMeadow(new BiomeProperties("Floral Meadow").setBaseHeight(0.1F).setHeightVariation(0.020F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome forestedextremehills = new BiomeForestedExtremeHills(new BiomeProperties("Forested Extreme Hills").setBaseHeight(Biomes.EXTREME_HILLS.getBaseHeight()).setHeightVariation(Biomes.EXTREME_HILLS.getHeightVariation()).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome forestedlakes = new BiomeForestedLakes(new BiomeProperties("Forested Lakes").setBaseHeight(-0.25F).setHeightVariation(0.4F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome fungaljungle = new BiomeFungalJungle(new BiomeProperties("Fungal Jungle").setBaseHeight(Biomes.JUNGLE.getBaseHeight()).setHeightVariation(Biomes.JUNGLE.getHeightVariation()).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(Biomes.JUNGLE.getRainfall()));
		public static Biome fungaljunglehills = new BiomeFungalJungle(new BiomeProperties("Fungal Jungle Hills").setBaseHeight(Biomes.JUNGLE.getBaseHeight()).setHeightVariation(0.70F).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(Biomes.JUNGLE.getRainfall()));
		public static Biome grasshills = new BiomeGrassHills(new BiomeProperties("Grass Hills").setBaseHeight(0.08F).setHeightVariation(0.25F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome greenmixedforest = new BiomeGreenMixedForest(new BiomeProperties("Green Mixed Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome greenmixedforesthills = new BiomeGreenMixedForest(new BiomeProperties("Green Mixed Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome greenswamp = new BiomeGreenSwamp(new BiomeProperties("Green Swamp").setBaseHeight(Biomes.SWAMPLAND.getBaseHeight()).setHeightVariation(Biomes.SWAMPLAND.getHeightVariation()).setTemperature(Biomes.SWAMPLAND.getDefaultTemperature()).setRainfall(Biomes.SWAMPLAND.getRainfall()).setWaterColor(0x379A3E));
		public static Biome heath = new BiomeHeath(new BiomeProperties("Heath").setBaseHeight(0.2F).setHeightVariation(0.046F).setTemperature(0.9F).setRainfall(0.5F));
		public static Biome highland = new BiomeHighland(new BiomeProperties("Highland").setBaseHeight(0.97F).setHeightVariation(0.5F).setTemperature(0.7F).setRainfall(0.2F));
		public static Biome hills = new BiomeNHills(new BiomeProperties("Hills").setBaseHeight(1.15F).setHeightVariation(0.558F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome hotspring = new BiomeHotSpring(new BiomeProperties("Hot Spring").setBaseHeight(-0.1F).setHeightVariation(0.172F).setTemperature(1F).setRainfall(0.5F).setWaterColor(0x008904));
		public static Biome lake = new BiomeLake(new BiomeProperties("Lake").setBaseHeight(-0.7F).setHeightVariation(0.1F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome lowland = new BiomeLowland(new BiomeProperties("Lowland").setBaseHeight(-0.1F).setHeightVariation(0.175F).setTemperature(0.4F).setRainfall(1F));
		public static Biome meadow = new BiomeMeadow(new BiomeProperties("Meadow").setBaseHeight(0.1F).setHeightVariation(0.020F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome mixedforest = new BiomeMixedForest(new BiomeProperties("Mixed Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome mixedforesthills = new BiomeMixedForest(new BiomeProperties("Mixed Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome monsoonforest = new BiomeMonsoonForest(new BiomeProperties("Monsoon Forest").setBaseHeight(0.15F).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(2F).setWaterColor(0x00CDF9));
		public static Biome moorland = new BiomeMoorland(new BiomeProperties("Moorland").setBaseHeight(1F).setHeightVariation(0.5F).setTemperature(0.4F).setRainfall(1F));
		public static Biome mountains = new BiomeNHills(new BiomeProperties("Mountains").setBaseHeight(1.74F).setHeightVariation(0.78F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome oakforest = new BiomeOakForest(new BiomeProperties("Oak Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome oakforesthills = new BiomeOakForest(new BiomeProperties("Oak Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome poppymeadow = new BiomePoppyMeadow(new BiomeProperties("Poppy Meadow").setBaseHeight(0.11F).setHeightVariation(0.025F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome praire = new BiomePraire(new BiomeProperties("Praire").setBaseHeight(0.03F).setHeightVariation(0.05F).setTemperature(1F).setRainfall(0.4F));
		public static Biome royalforest = new BiomeRoyalForest(new BiomeProperties("Royal Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome royalforesthills = new BiomeRoyalForest(new BiomeProperties("Royal Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome shrubland = new BiomeShrubland(new BiomeProperties("Shrubland").setBaseHeight(0.11F).setHeightVariation(0.025F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome talloakforest = new BiomeOakForestTall(new BiomeProperties("Tall Oak Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome talloakforesthills = new BiomeOakForestTall(new BiomeProperties("Tall Oak Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome tropicalswamp = new BiomeTropicalSwamp(new BiomeProperties("Tropical Swamp").setBaseHeight(Biomes.SWAMPLAND.getBaseHeight()).setHeightVariation(Biomes.SWAMPLAND.getHeightVariation()).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(Biomes.SWAMPLAND.getRainfall()).setWaterColor(0x22AC20));
		public static Biome whiteorchard = new BiomeWhiteOrchard(new BiomeProperties("White Orchard").setBaseHeight(0.026F).setHeightVariation(0.03F).setTemperature(1F).setRainfall(0.4F));

		//COOL
		public static Biome autumnforest = new BiomeAutumnForest(new BiomeProperties("Autumn Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome autumnforesthills = new BiomeAutumnForest(new BiomeProperties("Autumn Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome autumntaiga = new BiomeAutumnTaiga(new BiomeProperties("Autumn Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome autumntaigahills = new BiomeAutumnTaiga(new BiomeProperties("Autumn Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome bluetaiga = new BiomeBlueTaiga(new BiomeProperties("Blue Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome bluetaigahills = new BiomeBlueTaiga(new BiomeProperties("Blue Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome cliffs = new BiomeCliffs(new BiomeProperties("Cliffs").setBaseHeight(3.2F).setHeightVariation(0.45F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome coniferousplains = new BiomeConiferousPlains(new BiomeProperties("Coniferous Plains").setBaseHeight(Biomes.PLAINS.getBaseHeight()).setHeightVariation(Biomes.PLAINS.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome mapleforest = new BiomeMapleForest(new BiomeProperties("Maple Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome mapleforesthills = new BiomeMapleForest(new BiomeProperties("Maple Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome megaautumntaiga = new BiomeMegaAutumnTaiga(new BiomeProperties("Mega Autumn Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome megaautumntaigahills = new BiomeMegaAutumnTaiga(new BiomeProperties("Mega Autumn Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome megabluetaiga = new BiomeMegaBlueTaiga(new BiomeProperties("Mega Blue Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome megabluetaigahills = new BiomeMegaBlueTaiga(new BiomeProperties("Mega Blue Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome megamapleforest = new BiomeMegaMapleForest(new BiomeProperties("Mega Maple Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome megamapleforesthills = new BiomeMegaMapleForest(new BiomeProperties("Mega Maple Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome pineforest = new BiomePineForest(new BiomeProperties("Pine Forest").setBaseHeight(Biomes.TAIGA.getBaseHeight()).setHeightVariation(Biomes.TAIGA.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome pineland = new BiomePineland(new BiomeProperties("Pineland").setBaseHeight(0.98F).setHeightVariation(0.54F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome rockytaiga = new BiomeRockyTaiga(new BiomeProperties("Rocky Taiga").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome stonemountains = new BiomeStoneMountains(new BiomeProperties("Stone Mountains").setBaseHeight(1.74F).setHeightVariation(0.78F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		
		//DESERT
		public static Biome clayland = new BiomeClayland(new BiomeProperties("Clayland").setBaseHeight(0.82F).setHeightVariation(0.48F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome goldensavanna = new BiomeGoldenSavanna(new BiomeProperties("Golden Savanna").setBaseHeight(Biomes.SAVANNA.getBaseHeight()).setHeightVariation(Biomes.SAVANNA.getHeightVariation()).setTemperature(Biomes.SAVANNA.getDefaultTemperature()).setRainfall(Biomes.SAVANNA.getRainfall()));
		public static Biome goldensavannaplateau = new BiomeGoldenSavanna(new BiomeProperties("Golden Savanna Plateau").setBaseHeight(Biomes.SAVANNA_PLATEAU.getBaseHeight()).setHeightVariation(Biomes.SAVANNA_PLATEAU.getHeightVariation()).setTemperature(Biomes.SAVANNA_PLATEAU.getDefaultTemperature()).setRainfall(Biomes.SAVANNA_PLATEAU.getRainfall()));
		public static Biome hotdesert = new BiomeHotDesert(new BiomeProperties("Hot Desert").setBaseHeight(0.40F).setHeightVariation(0.49F).setTemperature(5F).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		public static Biome lushdesert = new BiomeLushDesert(new BiomeProperties("Lush Desert").setBaseHeight(0.123F).setHeightVariation(0.044F).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(0.9F).setWaterColor(0x00b8ff));
		public static Biome outback = new BiomeOutback(new BiomeProperties("Outback").setBaseHeight(0.123F).setHeightVariation(0.044F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(0.9F));
		public static Biome redsanddune = new BiomeRedSandDune(new BiomeProperties("Red Sand Dune").setBaseHeight(0.35F).setHeightVariation(0.49F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		public static Biome rockland = new BiomeRockland(new BiomeProperties("Rockland").setBaseHeight(0.82F).setHeightVariation(0.48F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome sahel = new BiomeSahel(new BiomeProperties("Sahel").setBaseHeight(0.125F).setHeightVariation(0.046F).setTemperature(0.95F).setRainfall(0.9F));
		public static Biome sanddune = new BiomeSandDune(new BiomeProperties("Sand Dune").setBaseHeight(0.35F).setHeightVariation(0.49F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		public static Biome sandymountains = new BiomeSandyMountains(new BiomeProperties("Sandy Mountains").setBaseHeight(1.74F).setHeightVariation(0.78F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		public static Biome sandyscrubland = new BiomeSandyScrubland(new BiomeProperties("Sandy Scrubland").setBaseHeight(0.123F).setHeightVariation(0.044F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(0.9F));
		public static Biome scrubland = new BiomeScrubland(new BiomeProperties("Scrubland").setBaseHeight(Biomes.SAVANNA.getBaseHeight()).setHeightVariation(Biomes.SAVANNA.getHeightVariation()).setTemperature(Biomes.SAVANNA.getDefaultTemperature()).setRainfall(Biomes.SAVANNA.getRainfall()));
		public static Biome serengeti = new BiomeSerengeti(new BiomeProperties("Serengeti").setBaseHeight(Biomes.SAVANNA.getBaseHeight()).setHeightVariation(Biomes.SAVANNA.getHeightVariation()).setTemperature(Biomes.SAVANNA.getDefaultTemperature()).setRainfall(Biomes.SAVANNA.getRainfall()));
		public static Biome tropicaldesert = new BiomeTropicalDesert(new BiomeProperties("Tropical Desert").setBaseHeight(0.1F).setHeightVariation(0.038F).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(1F).setWaterColor(0x00CDF9));
		
		//ICY
		public static Biome alps = new BiomeAlps(new BiomeProperties("Alps").setBaseHeight(5F).setHeightVariation(0.8F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome coldbirchforest = new BiomeColdForest(BiomeForest.Type.BIRCH, "Cold Birch Forest");
		public static Biome coldbirchforesthills = new BiomeColdForestHills(BiomeForest.Type.BIRCH, "Cold Birch Forest Hills");
		public static Biome coldbluetaiga = new BiomeColdBlueTaiga(new BiomeProperties("Cold Blue Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()).setSnowEnabled());
		public static Biome coldbluetaigahills = new BiomeColdBlueTaiga(new BiomeProperties("Cold Blue Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()).setSnowEnabled());
		public static Biome colddesert = new BiomeColdDesert(new BiomeProperties("Cold Desert").setBaseHeight(Biomes.ROOFED_FOREST.getBaseHeight()).setHeightVariation(Biomes.ROOFED_FOREST.getHeightVariation()).setTemperature(-2).setRainfall(Biomes.ROOFED_FOREST.getRainfall()).setSnowEnabled());
		public static Biome coldflowerforest = new BiomeColdForest(BiomeForest.Type.FLOWER, "Cold Flower Forest");
		public static Biome coldflowerforesthills = new BiomeColdForestHills(BiomeForest.Type.FLOWER, "Cold Flower Forest Hills");
		public static Biome coldforest = new BiomeColdForest(BiomeForest.Type.NORMAL, "Cold Forest");
		public static Biome coldforesthills = new BiomeColdForestHills(BiomeForest.Type.NORMAL, "Cold Forest Hills");
		public static Biome coldmegabluetaiga = new BiomeColdMegaBlueTaiga(new BiomeProperties("Cold Mega Blue Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()).setSnowEnabled());
		public static Biome coldmegabluetaigahills = new BiomeColdMegaBlueTaiga(new BiomeProperties("Cold Mega Blue Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()).setSnowEnabled());
		public static Biome coldmegasprucetaiga = new BiomeColdMegaTaiga(BiomeTaiga.Type.MEGA_SPRUCE, "Cold Mega Spruce Taiga");
		public static Biome coldmegasprucetaigahills = new BiomeColdMegaTaigaHills(BiomeTaiga.Type.MEGA_SPRUCE, "Cold Mega Spruce Taiga Hills");
		public static Biome coldmegataiga = new BiomeColdMegaTaiga(BiomeTaiga.Type.MEGA, "Cold Mega Taiga");
		public static Biome coldmegataigahills = new BiomeColdMegaTaigaHills(BiomeTaiga.Type.MEGA, "Cold Mega Taiga Hills");
		public static Biome coldroofedforest = new BiomeColdForest(BiomeForest.Type.ROOFED, "Cold Roofed Forest");
		public static Biome coldroofedforesthills = new BiomeColdForestHills(BiomeForest.Type.ROOFED, "Cold Roofed Forest Hills");
		public static Biome glacier = new BiomeGlacier(new BiomeProperties("Glacier").setBaseHeight(0.35F).setHeightVariation(0.49F).setTemperature(Biomes.FROZEN_OCEAN.getDefaultTemperature()).setRainfall(Biomes.FROZEN_OCEAN.getRainfall()));
		public static Biome icytundra = new BiomeIcyTundra(new BiomeProperties("Icy Tundra").setBaseHeight(Biomes.PLAINS.getBaseHeight()).setHeightVariation(Biomes.PLAINS.getHeightVariation()).setTemperature(-1).setRainfall(Biomes.FROZEN_OCEAN.getRainfall()).setSnowEnabled());
		public static Biome snowdune = new BiomeSnowDune(new BiomeProperties("Snow Dune").setBaseHeight(0.35F).setHeightVariation(0.49F).setTemperature(Biomes.FROZEN_OCEAN.getDefaultTemperature()).setRainfall(Biomes.FROZEN_OCEAN.getRainfall()));
		public static Biome snowypineforest = new BiomeSnowyPineForest(new BiomeProperties("Snowy Pine Forest").setBaseHeight(Biomes.TAIGA.getBaseHeight()).setHeightVariation(Biomes.TAIGA.getHeightVariation()).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()).setSnowEnabled());
		public static Biome tundra = new BiomeTundra(new BiomeProperties("Tundra").setBaseHeight(Biomes.PLAINS.getBaseHeight()).setHeightVariation(Biomes.PLAINS.getHeightVariation()).setTemperature(0.20F).setRainfall(Biomes.FROZEN_OCEAN.getRainfall()));

		public static void initBiomes()
		{
		
			//WARM
			registerBiome(aegeanarchipelago, "aegean_archipelago", BiomeWeightConfig.aegeanarchipelagoWeight, false, BiomeType.WARM, Type.WATER, Type.OCEAN);
			registerBiome(aliummeadow, "alium_meadow", BiomeWeightConfig.aliummeadowWeight, true, BiomeType.WARM, Type.PLAINS, Type.MAGICAL, Type.RARE);
			registerBiome(birchhills, "birch_hills", BiomeWeightConfig.birchhillsWeight, true, BiomeType.WARM, Type.HILLS);
			registerBiome(blossomforest, "blossom_forest", BiomeWeightConfig.blossomforestWeight, true, BiomeType.WARM, Type.FOREST, Type.MAGICAL);
			registerBiome(blossomforesthills, "blossom_forest_hills", BiomeWeightConfig.blossomforesthillsWeight, false, BiomeType.WARM, Type.FOREST, Type.MAGICAL);
			registerBiome(bog, "bog", BiomeWeightConfig.bogWeight, false, BiomeType.WARM, Type.SWAMP);
			registerBiome(denseshrubland, "dense_shrubland", BiomeWeightConfig.denseshrublandWeight, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(dryforest, "dry_forest", BiomeWeightConfig.dryforestWeight, false, BiomeType.WARM, Type.FOREST, Type.DRY);
			registerBiome(dryforesthills, "dry_forest_hills", BiomeWeightConfig.dryforesthillsWeight, false, BiomeType.WARM, Type.FOREST, Type.DRY);
			registerBiome(estuary, "estuary", BiomeWeightConfig.estuaryWeight, false, BiomeType.WARM, Type.RIVER, Type.SWAMP);
			registerBiome(fen, "fen", BiomeWeightConfig.fenWeight, false, BiomeType.WARM, Type.SWAMP ,Type.WET);
			registerBiome(floralmeadow, "floral_meadow", BiomeWeightConfig.floralmeadowWeight, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(forestedextremehills, "forestedextremehills", BiomeWeightConfig.forestedextremehillsWeight, true, BiomeType.WARM, Type.HILLS);
			registerBiome(forestedlakes, "forested_lakes", BiomeWeightConfig.forestedlakesWeight, true, BiomeType.WARM, Type.FOREST, Type.WATER);
			registerBiome(fungaljungle, "fungal_jungle", BiomeWeightConfig.fungaljungleWeight, true, BiomeType.WARM, Type.JUNGLE, Type.MUSHROOM, Type.MAGICAL, Type.RARE);
			registerBiome(fungaljunglehills, "fungal_jungle_hills", BiomeWeightConfig.fungaljunglehillsWeight, false, BiomeType.WARM, Type.JUNGLE, Type.MUSHROOM, Type.MAGICAL, Type.RARE);
			registerBiome(grasshills, "grass_hills", BiomeWeightConfig.grasshillsWeight, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(greenmixedforest, "green_mixed_forest", BiomeWeightConfig.greenmixedforestWeight, false, BiomeType.WARM, Type.FOREST);
			registerBiome(greenmixedforesthills, "green_mixed_forest_hills", BiomeWeightConfig.greenmixedforesthillsWeight, false, BiomeType.WARM, Type.FOREST);
			registerBiome(greenswamp, "green_swamp", BiomeWeightConfig.greenswampWeight, false, BiomeType.WARM, Type.SWAMP);
			registerBiome(heath, "heath", BiomeWeightConfig.heathWeight, true, BiomeType.WARM, Type.PLAINS, Type.SAVANNA);
			registerBiome(highland, "highland", BiomeWeightConfig.highlandWeight, true, BiomeType.WARM, Type.HILLS);
			registerBiome(hills, "hills", BiomeWeightConfig.highlandWeight, true, BiomeType.WARM, Type.HILLS);
			registerBiome(hotspring, "hotspring", BiomeWeightConfig.hotspringWeight, false, BiomeType.WARM, Type.WET);
			registerBiome(lake, "lake", BiomeWeightConfig.lakeWeight, false, BiomeType.WARM, Type.WATER, Type.CONIFEROUS);
			registerBiome(lowland, "lowland", BiomeWeightConfig.lowlandWeight, false, BiomeType.WARM, Type.CONIFEROUS ,Type.WET);
			registerBiome(meadow, "meadow", BiomeWeightConfig.meadowWeight, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(mixedforest, "mixed_forest", BiomeWeightConfig.mixedforestWeight, false, BiomeType.WARM, Type.FOREST);
			registerBiome(mixedforesthills, "mixed_forest_hills", BiomeWeightConfig.mixedforesthillsWeight, false, BiomeType.WARM, Type.FOREST);
			registerBiome(monsoonforest, "monsoon_forest", BiomeWeightConfig.monsoonforestWeight, true, BiomeType.WARM, Type.SWAMP, Type.BEACH, Type.JUNGLE, Type.WET);
			registerBiome(moorland, "moorland", BiomeWeightConfig.moorlandWeight, true, BiomeType.WARM, Type.HILLS);
			registerBiome(mountains, "mountains", BiomeWeightConfig.mountainsWeight, true, BiomeType.WARM, Type.MOUNTAIN);
			registerBiome(oakforest, "oak_forest", BiomeWeightConfig.oakforestWeight, false, BiomeType.WARM, Type.FOREST);
			registerBiome(oakforesthills, "oak_forest_hills", BiomeWeightConfig.oakforesthillsWeight, false, BiomeType.WARM, Type.FOREST);
			registerBiome(poppymeadow, "poppy_meadow", BiomeWeightConfig.poppymeadowWeight, true, BiomeType.WARM, Type.PLAINS, Type.MAGICAL, Type.RARE);
			registerBiome(praire, "praire", BiomeWeightConfig.praireWeight, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(royalforest, "royal_forest", BiomeWeightConfig.royalforestWeight, true, BiomeType.WARM, Type.FOREST, Type.MAGICAL);
			registerBiome(royalforesthills, "royal_forest_hills", BiomeWeightConfig.royalforesthillsWeight, false, BiomeType.WARM, Type.FOREST, Type.MAGICAL);
			registerBiome(shrubland, "shrubland", BiomeWeightConfig.shrublandWeight, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(talloakforest, "tall_oak_forest", BiomeWeightConfig.talloakforestWeight, false, BiomeType.WARM, Type.FOREST);
			registerBiome(talloakforesthills, "tall_oak_forest_hills", BiomeWeightConfig.talloakforesthillsWeight, false, BiomeType.WARM, Type.FOREST);
			registerBiome(tropicalswamp, "tropical_swamp", BiomeWeightConfig.tropicalswampWeight, false, BiomeType.WARM, Type.SWAMP, Type.JUNGLE);
			registerBiome(whiteorchard, "white_orchard", BiomeWeightConfig.whiteorchardWeight, true, BiomeType.WARM, Type.PLAINS);
			
			//COOL
			registerBiome(autumnforest, "autumn_forest", BiomeWeightConfig.autumnforestWeight, true, BiomeType.COOL, Type.FOREST);
			registerBiome(autumnforesthills, "autumn_forest_hills", BiomeWeightConfig.autumnforesthillsWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(autumntaiga, "autumn_taiga", BiomeWeightConfig.autumntaigaWeight, true, BiomeType.COOL, Type.FOREST);
			registerBiome(autumntaigahills, "autumn_taiga_hills", BiomeWeightConfig.autumntaigahillsWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(bluetaiga, "blue_taiga", BiomeWeightConfig.bluetaigaWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(bluetaigahills, "blue_taiga_hills", BiomeWeightConfig.bluetaigahillsWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(cliffs, "cliffs", BiomeWeightConfig.cliffsWeight, false, BiomeType.COOL, Type.MOUNTAIN ,Type.CONIFEROUS);
			registerBiome(coniferousplains, "coniferous_plains", BiomeWeightConfig.coniferousplainsWeight, true, BiomeType.COOL, Type.PLAINS, Type.CONIFEROUS);
			registerBiome(mapleforest, "maple_forest", BiomeWeightConfig.mapleforestWeight, true, BiomeType.COOL, Type.FOREST);
			registerBiome(mapleforesthills, "maple_forest_hills", BiomeWeightConfig.mapleforesthillsWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megaautumntaiga, "mega_autumn_taiga", BiomeWeightConfig.megaautumntaigaWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megaautumntaigahills, "mega_autumn_taiga_hills", BiomeWeightConfig.megaautumntaigahillsWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megabluetaiga, "mega_blue_taiga", BiomeWeightConfig.megabluetaigaWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megabluetaigahills, "mega_blue_taiga_hills", BiomeWeightConfig.megabluetaigahillsWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megamapleforest, "mega_maple_forest", BiomeWeightConfig.megamapleforestWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megamapleforesthills, "mega_maple_forest_hills", BiomeWeightConfig.megamapleforesthillsWeight, false, BiomeType.COOL, Type.FOREST);
			registerBiome(pineforest, "pine_forest", BiomeWeightConfig.pineforestWeight, false, BiomeType.COOL, Type.CONIFEROUS);
			registerBiome(pineland, "pineland", BiomeWeightConfig.pinelandWeight, true, BiomeType.COOL, Type.HILLS, Type.CONIFEROUS);
			registerBiome(rockytaiga, "rocky_taiga", BiomeWeightConfig.rockytaigaWeight, true, BiomeType.COOL, Type.FOREST);
			registerBiome(stonemountains, "stone_mountains", BiomeWeightConfig.stonemountainsWeight, false, BiomeType.COOL, Type.MOUNTAIN);
			
			//DESERT
			registerBiome(clayland, "clayland", BiomeWeightConfig.claylandWeight, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(goldensavanna, "golden_savanna", BiomeWeightConfig.goldensavannaWeight, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(goldensavannaplateau, "golden_savanna_plateau", BiomeWeightConfig.goldensavannaplateauWeight, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(hotdesert, "hot_desert", BiomeWeightConfig.hotdesertWeight, true, BiomeType.DESERT, Type.HOT, Type.SANDY);
			registerBiome(lushdesert, "lush_desert", BiomeWeightConfig.lushdesertWeight, true, BiomeType.DESERT, Type.SAVANNA, Type.LUSH, Type.JUNGLE);
			registerBiome(outback, "outback", BiomeWeightConfig.outbackWeight, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(redsanddune, "red_sand_dune", BiomeWeightConfig.redsandduneWeight, false, BiomeType.DESERT, Type.SANDY);
			registerBiome(rockland, "rockland", BiomeWeightConfig.rocklandWeight, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(sahel, "sahel", BiomeWeightConfig.sahelWeight, true, BiomeType.DESERT, Type.SANDY);
			registerBiome(sanddune, "sand_dune", BiomeWeightConfig.sandduneWeight, false, BiomeType.DESERT, Type.SANDY);
			registerBiome(sandymountains, "sandy_mountains", BiomeWeightConfig.sandymountainsWeight, false, BiomeType.DESERT, Type.SANDY, Type.MOUNTAIN);
			registerBiome(sandyscrubland, "sandy_scrubland", BiomeWeightConfig.sandyscrublandWeight, true, BiomeType.DESERT, Type.SANDY);
			registerBiome(scrubland, "scrubland", BiomeWeightConfig.scrublandWeight, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(serengeti, "serengeti", BiomeWeightConfig.serengetiWeight, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(tropicaldesert, "tropical_desert", BiomeWeightConfig.tropicaldesertWeight, true, BiomeType.DESERT, Type.SAVANNA, Type.LUSH, Type.JUNGLE);
		
			//ICY
			registerBiome(alps, "alps", BiomeWeightConfig.alpsWeight, false, BiomeType.ICY, Type.MOUNTAIN, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldbirchforest, "cold_birch_forest", BiomeWeightConfig.coldbirchforestWeight, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldbirchforesthills, "cold_birch_forest_hills", BiomeWeightConfig.coldbirchforesthillsWeight, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldbluetaiga, "cold_blue_taiga", BiomeWeightConfig.coldbluetaigaWeight, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldbluetaigahills, "cold_blue_taiga_hills", BiomeWeightConfig.coldbluetaigahillsWeight, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(colddesert, "cold_desert", BiomeWeightConfig.colddesertWeight, true, BiomeType.ICY, Type.COLD);
			registerBiome(coldflowerforest, "cold_flower_forest", BiomeWeightConfig.coldflowerforestWeight, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldflowerforesthills, "cold_flower_forest_hills", BiomeWeightConfig.coldflowerforesthillsWeight, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldforest, "cold_forest", BiomeWeightConfig.coldforestWeight, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldforesthills, "cold_forest_hills", BiomeWeightConfig.coldforesthillsWeight, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldmegabluetaiga, "cold_mega_blue_taiga", BiomeWeightConfig.coldmegabluetaigaWeight, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegabluetaigahills, "cold_mega_blue_taiga_hills", BiomeWeightConfig.coldmegabluetaigahillsWeight, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegasprucetaiga, "cold_mega_spruce_taiga", BiomeWeightConfig.coldmegasprucetaigaWeight, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegasprucetaigahills, "cold_mega_spruce_taiga_hills", BiomeWeightConfig.coldmegasprucetaigahillsWeight, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegataiga, "cold_mega_taiga", BiomeWeightConfig.coldmegataigaWeight, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegataigahills, "cold_mega_taiga_hills", BiomeWeightConfig.coldmegataigahillsWeight, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldroofedforest, "cold_roofed_forest", BiomeWeightConfig.coldroofedforestWeight, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldroofedforesthills, "cold_roofed_forest_hills", BiomeWeightConfig.coldroofedforesthillsWeight, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(glacier, "glacier", BiomeWeightConfig.glacierWeight, false, BiomeType.ICY, Type.COLD, Type.SNOWY);
			registerBiome(icytundra, "icy_tundra", BiomeWeightConfig.icytundraWeight, false, BiomeType.ICY, Type.COLD, Type.SNOWY);
			registerBiome(snowdune, "snowdune", BiomeWeightConfig.snowduneWeight, false, BiomeType.ICY, Type.COLD, Type.SNOWY);
			registerBiome(snowypineforest, "snowy_pine_forest", BiomeWeightConfig.snowypineforestWeight, false, BiomeType.ICY, Type.CONIFEROUS ,Type.SNOWY);
			registerBiome(tundra, "tundra", BiomeWeightConfig.tundraWeight, true, BiomeType.ICY, Type.COLD);
			
			BiomeManager.addVillageBiome(Biomes.JUNGLE, true);
			BiomeManager.addVillageBiome(Biomes.FOREST, true);
			BiomeManager.addVillageBiome(Biomes.BIRCH_FOREST, true);
			BiomeManager.addVillageBiome(Biomes.ROOFED_FOREST, true);
			BiomeManager.addVillageBiome(Biomes.JUNGLE_EDGE, true);
			BiomeManager.addVillageBiome(Biomes.MESA, true);
			BiomeManager.addVillageBiome(Biomes.EXTREME_HILLS, true);
			BiomeManager.addVillageBiome(Biomes.ICE_PLAINS, true);
			
			
		}
		
		public static void registerBiome(Biome biome, String name, int weight, boolean hasVillages, BiomeType biomeType, Type... types)
		{
			if(weight > 0)
			{
			biome.setRegistryName(name);
			System.out.println("Biome Registered");
			ForgeRegistries.BIOMES.register(biome);
			BiomeDictionary.addTypes(biome, types);
			BiomeManager.addBiome(biomeType, new BiomeEntry(biome, weight));
			BiomeManager.addStrongholdBiome(biome);
			BiomeManager.addSpawnBiome(biome);
			if(hasVillages)
				BiomeManager.addVillageBiome(biome, true);
			System.out.println("Biome Added");
		}
	}
	}