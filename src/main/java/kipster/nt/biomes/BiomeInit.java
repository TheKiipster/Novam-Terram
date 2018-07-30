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
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {
	
	public static Set<Biome> presentBiomes;
	
	public static Biome oakForestBiome = new BiomeOakForest();
	public static Biome tallOakforestBiome = new BiomeOakForestTall();
	public static Biome sandDunesBiome = new BiomeSandDunes();
	public static Biome redsandDunesBiome = new BiomeRedSandDunes();
	public static Biome greenSwampBiome = new BiomeGreenSwamp();
	public static Biome taigaPlainsBiome = new BiomeTaigaPlains();
	public static Biome autumnTaigaBiome = new BiomeAutumnTaiga();
	public static Biome autumntaigaHillsBiome = new BiomeAutumnTaigaHills();
	public static Biome cliffsBiome = new BiomeCliffs();
	public static Biome megaautumnTaigaBiome = new BiomeMegaAutumnTaiga();
	public static Biome shrublandBiome = new BiomeShrubland();
	public static Biome denseShrublandBiome = new BiomeDenseShrubland();
	public static Biome highlandsBiome = new BiomeHighlands();
	public static Biome pinelandsBiome = new BiomePinelands();
	public static Biome lowlandsBiome = new BiomeLowlands();
	public static Biome sahelBiome = new BiomeSahel();
	public static Biome bogBiome = new BiomeBog();
	public static Biome dryForestBiome = new BiomeDryForest();
	public static Biome dryforestHillsBiome = new BiomeDryForestHills();
	public static Biome springsBiome = new BiomeSprings();
	public static Biome tundraBiome = new BiomeTundra();
	public static Biome icyTundraBiome = new BiomeIcyTundra();
	public static Biome mixedForestBiome = new BiomeMixedForest();
	public static Biome densemixedForestBiome = new BiomeDenseMixedForest();
	public static Biome pineForestBiome = new BiomePineForest();
	public static Biome snowypineForestBiome = new BiomeSnowyPineForest();
	public static Biome coldForestBiome = new BiomeColdForest(BiomeForest.Type.NORMAL, "Cold Forest");
	public static Biome coldbirchForestBiome = new BiomeColdForest(BiomeForest.Type.BIRCH, "Cold Birch Forest");
	public static Biome coldroofedForestBiome = new BiomeColdForest(BiomeForest.Type.ROOFED, "Cold Roofed Forest");
	public static Biome coldmegaTaigaBiome = new BiomeColdMegaTaiga(BiomeTaiga.Type.MEGA, "Cold Mega Taiga");
	public static Biome coldmegaSpruceBiome = new BiomeColdMegaTaiga(BiomeTaiga.Type.MEGA_SPRUCE, "Cold Mega Spruce Taiga");
	public static Biome alpsBiome = new BiomeAlps();
	public static Biome blossomForestBiome = new BiomeBlossomForest();
	public static Biome blossomforestHillsBiome = new BiomeBlossomForestHills();
	public static Biome outbackBiome = new BiomeOutback();
	public static Biome estuaryBiome = new BiomeEstuary();
	public static Biome meadowBiome = new BiomeMeadow();
	public static Biome birchHillsBiome = new BiomeBirchHills();
	public static Biome fungalJungleBiome = new BiomeFungalJungle();
	public static Biome lakeBiome = new BiomeLake();
	public static Biome savannaScrubBiome = new BiomeSavannaScrub();
	public static Biome claylandsBiome = new BiomeClaylands();
	public static Biome rocklandsBiome = new BiomeRocklands();
	
	public static void registerBiomes() {
		
		//WARM
		initBiome(oakForestBiome, "Oak_Forest", 8, Config.disableOakForest, BiomeType.WARM, Type.FOREST);
		initBiome(tallOakforestBiome, "Tall_Oak_Forest", 2, Config.disableTallOakForest, BiomeType.WARM, Type.FOREST);
		initBiome(greenSwampBiome, "Green_Swamp", 6, Config.disableGreenSwamp, BiomeType.WARM, Type.SWAMP);
		initBiome(bogBiome, "Bog", 4, Config.disableBog, BiomeType.WARM, Type.SWAMP);
		initBiome(shrublandBiome, "Shrubland", 8, Config.disableShrubland, BiomeType.WARM, Type.PLAINS);
		initBiome(denseShrublandBiome, "Dense_Shrubland", 2, Config.disableDenseShrubland, BiomeType.WARM, Type.PLAINS);
		initBiome(highlandsBiome, "Highlands", 8, Config.disableHighlands, BiomeType.WARM, Type.HILLS);
		initBiome(lowlandsBiome, "Lowlands", 6, Config.disableLowlands, BiomeType.WARM, Type.PLAINS);
		initBiome(dryForestBiome, "Dry_Forest", 5, Config.disableDryForest, BiomeType.WARM, Type.FOREST);
		initBiome(dryforestHillsBiome, "Dry_Forest_Hills", 2, Config.disableDryForestHills, BiomeType.WARM, Type.FOREST);
		initBiome(springsBiome, "Springs", 1, Config.disableSprings, BiomeType.WARM, Type.WET);
		initBiome(mixedForestBiome, "Mixed_Forest", 6, Config.disableMixedForest, BiomeType.WARM, Type.FOREST);
		initBiome(densemixedForestBiome, "Dense_Mixed_Forest", 2, Config.disableDenseMixedForest, BiomeType.WARM, Type.FOREST);
		initBiome(blossomForestBiome, "Blossom Forest", 7, Config.disableBlossomForest, BiomeType.WARM, Type.FOREST);
		initBiome(blossomforestHillsBiome, "Blossom Forest Hills", 2, Config.disableBlossomForestHills, BiomeType.WARM, Type.FOREST);
		initBiome(estuaryBiome, "Estuary", 4, Config.disableEstuary, BiomeType.WARM, Type.SWAMP, Type.WATER, Type.RIVER);
		initBiome(meadowBiome, "Meadow", 7, Config.disableMeadow, BiomeType.WARM, Type.PLAINS);
		initBiome(birchHillsBiome, "Birch_Hills", 4, Config.disableBirchHills, BiomeType.WARM, Type.HILLS);
		initBiome(fungalJungleBiome, "Fungal_Jungle", 4, Config.disableFungalJungle, BiomeType.WARM, Type.JUNGLE, Type.MUSHROOM);
		initBiome(lakeBiome, "Lake", 2, Config.disableLake, BiomeType.WARM, Type.CONIFEROUS, Type.WATER);
		
		//DESERT
		initBiome(sandDunesBiome, "Sand_Dunes", 5, Config.disableSandDunes, BiomeType.DESERT, Type.SANDY);
		initBiome(redsandDunesBiome, "Red_Sand_Dunes", 5, Config.disableRedSandDunes, BiomeType.DESERT, Type.SANDY);
		initBiome(sahelBiome, "Sahel", 7, Config.disableSahel, BiomeType.DESERT, Type.SANDY);
		initBiome(outbackBiome, "Outback", 6, Config.disableOutback, BiomeType.DESERT, Type.SAVANNA);
		initBiome(savannaScrubBiome, "Savanna_Scrub", 6, Config.disableOutback, BiomeType.DESERT, Type.SAVANNA);
		initBiome(claylandsBiome, "Claylands", 6, Config.disableClaylands, BiomeType.DESERT, Type.SAVANNA);
		initBiome(rocklandsBiome, "Rocklands", 5, Config.disableRocklands, BiomeType.DESERT, Type.SAVANNA);
		
		//COOL
		initBiome(taigaPlainsBiome, "Taiga_Plains", 6, Config.disableTaigaPlains, BiomeType.COOL, Type.PLAINS);
		initBiome(autumnTaigaBiome, "Autumn_Taiga", 7, Config.disableAutumnTaiga, BiomeType.COOL, Type.CONIFEROUS);
		initBiome(autumntaigaHillsBiome, "Autumn_Taiga_Hills", 2, Config.disableAutumnTaigaHills, BiomeType.COOL, Type.CONIFEROUS);
		initBiome(cliffsBiome, "Cliffs", 7, Config.disableCliffs, BiomeType.COOL, Type.HILLS);
		initBiome(megaautumnTaigaBiome, "Mega_Autumn_Taiga", 2, Config.disableMegaAutumnTaiga, BiomeType.COOL, Type.CONIFEROUS);
		initBiome(pineForestBiome, "Pine_Forest", 6, Config.disablePineForest, BiomeType.COOL, Type.CONIFEROUS);
		initBiome(pinelandsBiome, "Pinelands", 4, Config.disablePinelands, BiomeType.COOL, Type.HILLS);
		
		//ICY
		initBiome(tundraBiome, "Tundra", 6, Config.disableTundra, BiomeType.ICY, Type.COLD);
		initBiome(coldForestBiome, "Cold_Forest", 6, Config.disableColdForest, BiomeType.ICY, Type.FOREST);
		initBiome(coldbirchForestBiome, "Cold_Birch_Forest", 6, Config.disableColdBirchForest, BiomeType.ICY, Type.FOREST);
		initBiome(coldroofedForestBiome, "Cold_Roofed_Forest", 6, Config.disableColdRoofedForest, BiomeType.ICY, Type.FOREST);
		initBiome(coldmegaTaigaBiome, "Cold_Mega_Taiga", 4, Config.disableColdMegaTaiga, BiomeType.ICY, Type.CONIFEROUS);
		initBiome(coldmegaSpruceBiome, "Cold_Mega_Spruce_Taiga", 4, Config.disableColdMegaSpruceTaiga, BiomeType.ICY, Type.CONIFEROUS);
		initBiome(icyTundraBiome, "Tundra_Icy", 2, Config.disableIcyTundra, BiomeType.ICY, Type.COLD);
		initBiome(snowypineForestBiome, "Snowy_Pine_Forest", 3, Config.disableSnowyPineForest, BiomeType.ICY, Type.CONIFEROUS);
		initBiome(alpsBiome, "Alps", 5, Config.disableAlps, BiomeType.ICY, Type.MOUNTAIN);
		
		
		//OTHER
		BiomeManager.addVillageBiome(meadowBiome, true);
		BiomeManager.addVillageBiome(taigaPlainsBiome, true);
		BiomeManager.addVillageBiome(shrublandBiome, true);
		BiomeManager.addVillageBiome(denseShrublandBiome, true);
		BiomeManager.addVillageBiome(highlandsBiome, true);
		BiomeManager.addVillageBiome(lowlandsBiome, true);
		BiomeManager.addVillageBiome(outbackBiome, true);
		BiomeManager.addVillageBiome(sahelBiome, true);
		BiomeManager.addVillageBiome(sandDunesBiome, true);
		BiomeManager.addVillageBiome(redsandDunesBiome, true);
		BiomeManager.addVillageBiome(tundraBiome, true);
		BiomeManager.addVillageBiome(icyTundraBiome, true);
		BiomeManager.addVillageBiome(pinelandsBiome, true);
		BiomeManager.addVillageBiome(fungalJungleBiome, true);
		BiomeManager.addVillageBiome(blossomForestBiome, true);
		BiomeManager.addVillageBiome(autumnTaigaBiome, true);
		BiomeManager.addVillageBiome(birchHillsBiome, true);
		BiomeManager.addVillageBiome(savannaScrubBiome, true);
		BiomeManager.addVillageBiome(claylandsBiome, true);
		BiomeManager.addVillageBiome(rocklandsBiome, true);
		BiomeManager.addVillageBiome(Biomes.EXTREME_HILLS, true);
	}
	
	private static Biome initBiome(Biome biome, String name, int weight, boolean disabled, BiomeType biomeType, Type... types)	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, weight));
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addStrongholdBiome(biome);
		System.out.println("Biome Added");
		
		return biome;

	}
	
}
