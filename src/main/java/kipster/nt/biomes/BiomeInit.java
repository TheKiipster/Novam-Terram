package kipster.nt.biomes;

import java.util.ArrayList;
import java.util.Set;

import kipster.nt.biomes.icy.*;
import kipster.nt.Config;
import kipster.nt.biomes.cool.*;
import kipster.nt.biomes.desert.*;
import kipster.nt.biomes.warm.*;
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
		public static Biome floralmeadow = new BiomeFloralMeadow(new BiomeProperties("Floral Meadow").setBaseHeight(0.1F).setHeightVariation(0.020F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome forestedlakes = new BiomeForestedLakes(new BiomeProperties("Forested Lakes").setBaseHeight(-0.25F).setHeightVariation(0.4F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome fungaljungle = new BiomeFungalJungle(new BiomeProperties("Fungal Jungle").setBaseHeight(Biomes.JUNGLE.getBaseHeight()).setHeightVariation(Biomes.JUNGLE.getHeightVariation()).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(Biomes.JUNGLE.getRainfall()));
		public static Biome fungaljunglehills = new BiomeFungalJungle(new BiomeProperties("Fungal Jungle Hills").setBaseHeight(Biomes.JUNGLE.getBaseHeight()).setHeightVariation(0.70F).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(Biomes.JUNGLE.getRainfall()));
		public static Biome greenmixedforest = new BiomeGreenMixedForest(new BiomeProperties("Green Mixed Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome greenmixedforesthills = new BiomeGreenMixedForest(new BiomeProperties("Green Mixed Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome greenswamp = new BiomeGreenSwamp(new BiomeProperties("Green Swamp").setBaseHeight(Biomes.SWAMPLAND.getBaseHeight()).setHeightVariation(Biomes.SWAMPLAND.getHeightVariation()).setTemperature(Biomes.SWAMPLAND.getDefaultTemperature()).setRainfall(Biomes.SWAMPLAND.getRainfall()).setWaterColor(0x379A3E));
		public static Biome highland = new BiomeHighland(new BiomeProperties("Highland").setBaseHeight(0.97F).setHeightVariation(0.5F).setTemperature(0.7F).setRainfall(0.2F));
		public static Biome hills = new BiomeNHills(new BiomeProperties("Hills").setBaseHeight(1.15F).setHeightVariation(0.558F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome hotspring = new BiomeHotSpring(new BiomeProperties("Hot Spring").setBaseHeight(-0.1F).setHeightVariation(0.172F).setTemperature(1F).setRainfall(0.5F).setWaterColor(0x008904));
		public static Biome lake = new BiomeLake(new BiomeProperties("Lake").setBaseHeight(-0.7F).setHeightVariation(0.1F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome lowland = new BiomeLowland(new BiomeProperties("Lowland").setBaseHeight(-0.1F).setHeightVariation(0.175F).setTemperature(0.4F).setRainfall(1F));
		public static Biome meadow = new BiomeMeadow(new BiomeProperties("Meadow").setBaseHeight(0.1F).setHeightVariation(0.020F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome mixedforest = new BiomeMixedForest(new BiomeProperties("Mixed Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome mixedforesthills = new BiomeMixedForest(new BiomeProperties("Mixed Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome moorland = new BiomeMoorland(new BiomeProperties("Moorland").setBaseHeight(1F).setHeightVariation(0.5F).setTemperature(0.4F).setRainfall(1F));
		public static Biome mountains = new BiomeNHills(new BiomeProperties("Mountains").setBaseHeight(1.5F).setHeightVariation(0.69F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome oakforest = new BiomeOakForest(new BiomeProperties("Oak Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome oakforesthills = new BiomeOakForest(new BiomeProperties("Oak Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome poppymeadow = new BiomePoppyMeadow(new BiomeProperties("Poppy Meadow").setBaseHeight(0.11F).setHeightVariation(0.025F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome shrubland = new BiomeShrubland(new BiomeProperties("Shrubland").setBaseHeight(0.11F).setHeightVariation(0.025F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome stonemountains = new BiomeStoneMountains(new BiomeProperties("Stone Mountains").setBaseHeight(1.58F).setHeightVariation(0.69F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome talloakforest = new BiomeOakForestTall(new BiomeProperties("Tall Oak Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome talloakforesthills = new BiomeOakForestTall(new BiomeProperties("Tall Oak Forest Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		public static Biome tropicalswamp = new BiomeTropicalSwamp(new BiomeProperties("Tropical Swamp").setBaseHeight(Biomes.SWAMPLAND.getBaseHeight()).setHeightVariation(Biomes.SWAMPLAND.getHeightVariation()).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(Biomes.SWAMPLAND.getRainfall()).setWaterColor(0x22AC20));
		
		
		//COOL
		public static Biome autumntaiga = new BiomeAutumnTaiga(new BiomeProperties("Autumn Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome autumntaigahills = new BiomeAutumnTaiga(new BiomeProperties("Autumn Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome bluetaiga = new BiomeBlueTaiga(new BiomeProperties("Blue Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome bluetaigahills = new BiomeBlueTaiga(new BiomeProperties("Blue Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		public static Biome cliffs = new BiomeCliffs(new BiomeProperties("Cliffs").setBaseHeight(3.4F).setHeightVariation(0.4F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
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
		
		//DESERT
		public static Biome clayland = new BiomeClayland(new BiomeProperties("Clayland").setBaseHeight(0.82F).setHeightVariation(0.48F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome goldensavanna = new BiomeGoldenSavanna(new BiomeProperties("Golden Savanna").setBaseHeight(Biomes.SAVANNA.getBaseHeight()).setHeightVariation(Biomes.SAVANNA.getHeightVariation()).setTemperature(Biomes.SAVANNA.getDefaultTemperature()).setRainfall(Biomes.SAVANNA.getRainfall()));
		public static Biome goldensavannaplateau = new BiomeGoldenSavanna(new BiomeProperties("Golden Savanna Plateau").setBaseHeight(Biomes.SAVANNA_PLATEAU.getBaseHeight()).setHeightVariation(Biomes.SAVANNA_PLATEAU.getHeightVariation()).setTemperature(Biomes.SAVANNA_PLATEAU.getDefaultTemperature()).setRainfall(Biomes.SAVANNA_PLATEAU.getRainfall()));
		public static Biome lushdesert = new BiomeLushDesert(new BiomeProperties("Lush Desert").setBaseHeight(0.123F).setHeightVariation(0.044F).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(0.9F).setWaterColor(0x00b8ff));
		public static Biome outback = new BiomeOutback(new BiomeProperties("Outback").setBaseHeight(0.123F).setHeightVariation(0.044F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(0.9F));
		public static Biome redsanddune = new BiomeRedSandDune(new BiomeProperties("Red Sand Dune").setBaseHeight(0.35F).setHeightVariation(0.49F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		public static Biome rockland = new BiomeRockland(new BiomeProperties("Rockland").setBaseHeight(0.82F).setHeightVariation(0.48F).setTemperature(0.8F).setRainfall(0.4F));
		public static Biome sahel = new BiomeSahel(new BiomeProperties("Sahel").setBaseHeight(0.125F).setHeightVariation(0.046F).setTemperature(0.95F).setRainfall(0.9F));
		public static Biome sanddune = new BiomeSandDune(new BiomeProperties("Sand Dune").setBaseHeight(0.35F).setHeightVariation(0.49F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		public static Biome sandyscrubland = new BiomeSandyScrubland(new BiomeProperties("Sandy Scrubland").setBaseHeight(0.123F).setHeightVariation(0.044F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(0.9F));
		public static Biome scrubland = new BiomeScrubland(new BiomeProperties("Scrubland").setBaseHeight(Biomes.SAVANNA.getBaseHeight()).setHeightVariation(Biomes.SAVANNA.getHeightVariation()).setTemperature(Biomes.SAVANNA.getDefaultTemperature()).setRainfall(Biomes.SAVANNA.getRainfall()));
		public static Biome serengeti = new BiomeSerengeti(new BiomeProperties("Serengeti").setBaseHeight(Biomes.SAVANNA.getBaseHeight()).setHeightVariation(Biomes.SAVANNA.getHeightVariation()).setTemperature(Biomes.SAVANNA.getDefaultTemperature()).setRainfall(Biomes.SAVANNA.getRainfall()));
		
		//ICY
		public static Biome alps = new BiomeAlps(new BiomeProperties("Alps").setBaseHeight(5F).setHeightVariation(0.8F).setTemperature(Biomes.EXTREME_HILLS.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		public static Biome coldbirchforest = new BiomeColdForest(BiomeForest.Type.BIRCH, "Cold Birch Forest");
		public static Biome coldbirchforesthills = new BiomeColdForestHills(BiomeForest.Type.BIRCH, "Cold Birch Forest Hills");
		public static Biome coldbluetaiga = new BiomeColdBlueTaiga(new BiomeProperties("Cold Blue Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()).setSnowEnabled());
		public static Biome coldbluetaigahills = new BiomeColdBlueTaiga(new BiomeProperties("Cold Blue Taiga Hills").setBaseHeight(0.98F).setHeightVariation(0.37F).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()).setSnowEnabled());
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
		public static Biome icytundra = new BiomeIcyTundra(new BiomeProperties("Icy Tundra").setBaseHeight(Biomes.PLAINS.getBaseHeight()).setHeightVariation(Biomes.PLAINS.getHeightVariation()).setTemperature(-1).setRainfall(Biomes.FROZEN_OCEAN.getRainfall()).setSnowEnabled());
		public static Biome snowdune = new BiomeSnowDune(new BiomeProperties("Snow Dune").setBaseHeight(0.35F).setHeightVariation(0.49F).setTemperature(Biomes.FROZEN_OCEAN.getDefaultTemperature()).setRainfall(Biomes.FROZEN_OCEAN.getRainfall()));
		public static Biome snowypineforest = new BiomeSnowyPineForest(new BiomeProperties("Snowy Pine Forest").setBaseHeight(Biomes.TAIGA.getBaseHeight()).setHeightVariation(Biomes.TAIGA.getHeightVariation()).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()).setSnowEnabled());
		public static Biome tundra = new BiomeTundra(new BiomeProperties("Tundra").setBaseHeight(Biomes.PLAINS.getBaseHeight()).setHeightVariation(Biomes.PLAINS.getHeightVariation()).setTemperature(0.20F).setRainfall(Biomes.FROZEN_OCEAN.getRainfall()));
		
		public static void initBiomes()
		{
		
			//WARM
			registerBiome(aegeanarchipelago, "aegean_archipelago", 1, Config.disableAegeanArchipelago, false, BiomeType.WARM, Type.WATER, Type.OCEAN);
			registerBiome(aliummeadow, "alium_meadow", 2, Config.disableAliumMeadow, true, BiomeType.WARM, Type.PLAINS, Type.MAGICAL, Type.RARE);
			registerBiome(birchhills, "birch_hills", 5, Config.disableBirchHills, true, BiomeType.WARM, Type.HILLS);
			registerBiome(blossomforest, "blossom_forest", 8, Config.disableBlossomForest, true, BiomeType.WARM, Type.FOREST, Type.MAGICAL);
			registerBiome(blossomforesthills, "blossom_forest_hills", 2, Config.disableBlossomForestHills, false, BiomeType.WARM, Type.FOREST, Type.MAGICAL);
			registerBiome(bog, "bog", 4, Config.disableBog, false, BiomeType.WARM, Type.SWAMP);
			registerBiome(denseshrubland, "dense_shrubland", 3, Config.disableDenseShrubland, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(dryforest, "dry_forest", 4, Config.disableDryForest, false, BiomeType.WARM, Type.FOREST, Type.DRY);
			registerBiome(dryforesthills, "dry_forest_hills", 2, Config.disableDryForestHills, false, BiomeType.WARM, Type.FOREST, Type.DRY);
			registerBiome(estuary, "estuary", 4, Config.disableEstuary, false, BiomeType.WARM, Type.RIVER, Type.SWAMP);
			registerBiome(floralmeadow, "floral_meadow", 2, Config.disableMeadow, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(forestedlakes, "forested_lakes", 3, Config.disableHills, true, BiomeType.WARM, Type.FOREST, Type.WATER);
			registerBiome(fungaljungle, "fungal_jungle", 3, Config.disableFungalJungle, true, BiomeType.WARM, Type.JUNGLE, Type.MUSHROOM, Type.MAGICAL, Type.RARE);
			registerBiome(fungaljunglehills, "fungal_jungle_hills", 1, Config.disableFungalJungleHills, false, BiomeType.WARM, Type.JUNGLE, Type.MUSHROOM, Type.MAGICAL, Type.RARE);
			registerBiome(greenmixedforest, "green_mixed_forest", 5, Config.disableMixedForest, false, BiomeType.WARM, Type.FOREST);
			registerBiome(greenmixedforesthills, "green_mixed_forest_hills", 2, Config.disableMixedForestHills, false, BiomeType.WARM, Type.FOREST);
			registerBiome(greenswamp, "green_swamp", 6, Config.disableGreenSwamp, false, BiomeType.WARM, Type.SWAMP);
			registerBiome(highland, "highland", 6, Config.disableHighland, true, BiomeType.WARM, Type.HILLS);
			registerBiome(hills, "hills", 6, Config.disableHills, true, BiomeType.WARM, Type.HILLS);
			registerBiome(hotspring, "hotspring", 1, Config.disableHotSpring, false, BiomeType.WARM, Type.WET);
			registerBiome(lake, "lake", 1, Config.disableLake, false, BiomeType.WARM, Type.WATER, Type.CONIFEROUS);
			registerBiome(lowland, "lowland", 5, Config.disableLowland, true, BiomeType.WARM, Type.CONIFEROUS ,Type.WET);
			registerBiome(meadow, "meadow", 8, Config.disableMeadow, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(mixedforest, "mixed_forest", 6, Config.disableMixedForest, false, BiomeType.WARM, Type.FOREST);
			registerBiome(mixedforesthills, "mixed_forest_hills", 2, Config.disableMixedForestHills, false, BiomeType.WARM, Type.FOREST);
			registerBiome(moorland, "moorland", 4, Config.disableMoorland, true, BiomeType.WARM, Type.HILLS);
			registerBiome(mountains, "mountains", 4, Config.disableMountains, true, BiomeType.WARM, Type.HILLS);
			registerBiome(oakforest, "oak_forest", 8, Config.disableOakForest, false, BiomeType.WARM, Type.FOREST);
			registerBiome(oakforesthills, "oak_forest_hills", 2, Config.disableOakForestHills, false, BiomeType.WARM, Type.FOREST);
			registerBiome(poppymeadow, "poppy_meadow", 2, Config.disablePoppyMeadow, true, BiomeType.WARM, Type.PLAINS, Type.MAGICAL, Type.RARE);
			registerBiome(shrubland, "shrubland", 7, Config.disableShrubland, true, BiomeType.WARM, Type.PLAINS);
			registerBiome(stonemountains, "stone_mountains", 3, Config.disableMountains, true, BiomeType.WARM, Type.HILLS);
			registerBiome(talloakforest, "tall_oak_forest", 4, Config.disableTallOakForest, false, BiomeType.WARM, Type.FOREST);
			registerBiome(talloakforesthills, "tall_oak_forest_hills", 2, Config.disableTallOakForestHills, false, BiomeType.WARM, Type.FOREST);
			registerBiome(tropicalswamp, "tropical_swamp", 4, Config.disableGreenSwamp, false, BiomeType.WARM, Type.SWAMP, Type.JUNGLE);
			
			//COOL
			registerBiome(autumntaiga, "autumn_taiga", 8, Config.disableAutumnTaiga, true, BiomeType.COOL, Type.FOREST);
			registerBiome(autumntaigahills, "autumn_taiga_hills", 2, Config.disableAutumnTaigaHills, false, BiomeType.COOL, Type.FOREST);
			registerBiome(bluetaiga, "blue_taiga", 8, Config.disableBlueTaiga, false, BiomeType.COOL, Type.FOREST);
			registerBiome(bluetaigahills, "blue_taiga_hills", 2, Config.disableBlueTaigaHills, false, BiomeType.COOL, Type.FOREST);
			registerBiome(cliffs, "cliffs", 7, Config.disableCliffs, false, BiomeType.COOL, Type.MOUNTAIN ,Type.CONIFEROUS);
			registerBiome(coniferousplains, "coniferous_plains", 5, Config.disableConiferousPlains, true, BiomeType.COOL, Type.PLAINS, Type.CONIFEROUS);
			registerBiome(mapleforest, "maple_forest", 8, Config.disableMapleForest, true, BiomeType.COOL, Type.FOREST);
			registerBiome(mapleforesthills, "maple_forest_hills", 2, Config.disableMapleForestHills, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megaautumntaiga, "mega_autumn_taiga", 4, Config.disableMegaAutumnTaiga, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megaautumntaigahills, "mega_autumn_taiga_hills", 2, Config.disableMegaAutumnTaigaHills, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megabluetaiga, "mega_blue_taiga", 4, Config.disableMegaAutumnTaiga, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megabluetaigahills, "mega_blue_taiga_hills", 2, Config.disableMegaBlueTaigaHills, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megamapleforest, "mega_maple_forest", 4, Config.disableMegaMapleForest, false, BiomeType.COOL, Type.FOREST);
			registerBiome(megamapleforesthills, "mega_maple_forest_hills", 2, Config.disableMegaMapleForestHills, false, BiomeType.COOL, Type.FOREST);
			registerBiome(pineforest, "pine_forest", 5, Config.disablePineForest, false, BiomeType.COOL, Type.CONIFEROUS);
			registerBiome(pineland, "pineland", 6, Config.disablePineland, true, BiomeType.COOL, Type.HILLS, Type.CONIFEROUS);
			registerBiome(rockytaiga, "rocky_taiga", 8, Config.disableRockyTaiga, true, BiomeType.COOL, Type.FOREST);
			
			//DESERT
			registerBiome(clayland, "clayland", 5, Config.disableClayland, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(goldensavanna, "golden_savanna", 5, Config.disableGoldenSavanna, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(goldensavannaplateau, "golden_savanna_plateau", 1, Config.disableGoldenSavannaPlateau, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(lushdesert, "lush_desert", 4, Config.disableLushDesert, true, BiomeType.DESERT, Type.SAVANNA, Type.LUSH, Type.JUNGLE);
			registerBiome(outback, "outback", 5, Config.disableOutback, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(redsanddune, "red_sand_dune", 3, Config.disableRedSandDune, false, BiomeType.DESERT, Type.SANDY);
			registerBiome(rockland, "rockland", 5, Config.disableRockland, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(sahel, "sahel", 6, Config.disableSahel, true, BiomeType.DESERT, Type.SANDY);
			registerBiome(sanddune, "sand_dune", 5, Config.disableSandDune, false, BiomeType.DESERT, Type.SANDY);
			registerBiome(sandyscrubland, "sandy_scrubland", 3, Config.disableSandyScrubland, true, BiomeType.DESERT, Type.SANDY);
			registerBiome(scrubland, "scrubland", 5, Config.disableScrubland, true, BiomeType.DESERT, Type.SAVANNA);
			registerBiome(serengeti, "serengeti", 5, Config.disableSerengeti, true, BiomeType.DESERT, Type.SAVANNA);
			
			//ICY
			registerBiome(alps, "alps", 6, Config.disableAlps, false, BiomeType.ICY, Type.MOUNTAIN, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldbirchforest, "cold_birch_forest", 7, Config.disableColdBirchForest, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldbirchforesthills, "cold_birch_forest_hills", 2, Config.disableColdBirchForestHills, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldbluetaiga, "cold_blue_taiga", 7, Config.disableColdBlueTaiga, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldbluetaigahills, "cold_blue_taiga_hills", 2, Config.disableColdBlueTaigaHills, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldflowerforest, "cold_flower_forest", 1, Config.disableColdFlowerForest, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldflowerforesthills, "cold_flower_forest_hills", 1, Config.disableColdFlowerForestHills, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldforest, "cold_forest", 7, Config.disableColdForest, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldforesthills, "cold_forest_hills", 7, Config.disableColdForestHills, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldmegabluetaiga, "cold_mega_blue_taiga", 5, Config.disableColdMegaBlueTaiga, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegabluetaigahills, "cold_mega_blue_taiga_hills", 2, Config.disableColdMegaBlueTaigaHills, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegasprucetaiga, "cold_mega_spruce_taiga", 4, Config.disableColdMegaSpruceTaiga, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegasprucetaigahills, "cold_mega_spruce_taiga_hills", 2, Config.disableColdMegaSpruceTaigaHills, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegataiga, "cold_mega_taiga", 5, Config.disableColdMegaTaiga, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldmegataigahills, "cold_mega_taiga_hills", 2, Config.disableColdMegaTaigaHills, false, BiomeType.ICY, Type.CONIFEROUS, Type.SNOWY);
			registerBiome(coldroofedforest, "cold_roofed_forest", 6, Config.disableColdRoofedForest, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(coldroofedforesthills, "cold_roofed_forest_hills", 2, Config.disableColdRoofedForestHills, false, BiomeType.ICY, Type.FOREST, Type.SNOWY);
			registerBiome(icytundra, "icy_tundra", 5, Config.disableIcyTundra, false, BiomeType.ICY, Type.COLD, Type.SNOWY);
			registerBiome(snowdune, "snowdune", 2, Config.disableSnowDune, false, BiomeType.ICY, Type.COLD, Type.SNOWY);
			registerBiome(snowypineforest, "snowy_pine_forest", 6, Config.disableSnowyPineForest, false, BiomeType.ICY, Type.CONIFEROUS ,Type.SNOWY);
			registerBiome(tundra, "tundra", 6, Config.disableTundra, true, BiomeType.ICY, Type.COLD);
			
			BiomeManager.addVillageBiome(Biomes.JUNGLE_EDGE, true);
			BiomeManager.addVillageBiome(Biomes.MESA, true);
			BiomeManager.addVillageBiome(Biomes.EXTREME_HILLS, true);
			BiomeManager.addVillageBiome(Biomes.ICE_PLAINS, true);
			
			
		}
		
		public static void registerBiome(Biome biome, String name, int weight, boolean disabled, boolean hasVillages, BiomeType biomeType, Type... types)
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