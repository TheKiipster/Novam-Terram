package kipster.nt.biomes;

import java.util.ArrayList;
import java.util.Set;

import kipster.nt.biomes.icy.*;
import kipster.nt.Config;
import kipster.nt.biomes.cool.*;
import kipster.nt.biomes.desert.*;
import kipster.nt.biomes.warm.*;
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
	
	public static void registerBiomes() {
		
		//WARM
		initBiome(oakForestBiome, "Oak_Forest", 8, Config.disableOakForest, false, BiomeType.WARM, Type.FOREST);
		initBiome(tallOakforestBiome, "Tall_Oak_Forest", 2, Config.disableTallOakForest, false, BiomeType.WARM, Type.FOREST);
		initBiome(greenSwampBiome, "Green_Swamp", 8, Config.disableGreenSwamp, false, BiomeType.WARM, Type.SWAMP);
		initBiome(bogBiome, "Bog", 4, Config.disableBog, false, BiomeType.WARM, Type.SWAMP);
		initBiome(shrublandBiome, "Shrubland", 8, Config.disableShrubland, false, BiomeType.WARM, Type.PLAINS);
		initBiome(denseShrublandBiome, "Dense_Shrubland", 2, Config.disableDenseShrubland, false, BiomeType.WARM, Type.PLAINS);
		initBiome(highlandsBiome, "Highlands", 8, Config.disableHighlands, false, BiomeType.WARM, Type.HILLS);
		initBiome(pinelandsBiome, "Pinelands", 4, Config.disablePinelands, false, BiomeType.WARM, Type.HILLS);
		initBiome(lowlandsBiome, "Lowlands", 6, Config.disableLowlands, false, BiomeType.WARM, Type.PLAINS);
		initBiome(dryForestBiome, "Dry_Forest", 5, Config.disableDryForest, false, BiomeType.WARM, Type.FOREST);
		initBiome(dryforestHillsBiome, "Dry_Forest_Hills", 2, Config.disableDryForestHills, false, BiomeType.WARM, Type.FOREST);
		
		//DESERT
		initBiome(sandDunesBiome, "Sand_Dunes", 5, Config.disableSandDunes, true, BiomeType.DESERT, Type.SANDY);
		initBiome(redsandDunesBiome, "Red_Sand_Dunes", 5, Config.disableRedSandDunes, true, BiomeType.DESERT, Type.SANDY);
		initBiome(sahelBiome, "Sahel", 7, Config.disableSahel, true, BiomeType.DESERT, Type.SANDY);
		
		//COOL
		initBiome(taigaPlainsBiome, "Taiga_Plains", 6, Config.disableTaigaPlains, true, BiomeType.COOL, Type.PLAINS);
		initBiome(autumnTaigaBiome, "Autumn_Taiga", 7, Config.disableAutumnTaiga ,true, BiomeType.COOL, Type.CONIFEROUS);
		initBiome(autumntaigaHillsBiome, "Autumn_Taiga_Hills", 2, Config.disableAutumnTaigaHills, true, BiomeType.COOL, Type.CONIFEROUS);
		initBiome(cliffsBiome, "Cliffs", 7, Config.disableCliffs, true, BiomeType.COOL, Type.HILLS);
		initBiome(megaautumnTaigaBiome, "Mega_Autumn_Taiga", 2, Config.disableMegaAutumnTaiga ,true, BiomeType.COOL, Type.CONIFEROUS);
		
		//ICY
		
	}
	
	private static Biome initBiome(Biome biome, String name, int weight, boolean disabled, boolean canSpawn, BiomeType biomeType, Type... types)	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, weight));
		BiomeManager.addVillageBiome(biome, canSpawn);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addStrongholdBiome(biome);

		System.out.println("Biome Added");
		
		return biome;

	}
	
}
