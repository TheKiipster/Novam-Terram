package kipster.nt.biomes;

import java.util.ArrayList;
import java.util.Set;

import kipster.nt.biomes.icy.*;
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
	
	
	public static void registerBiomes() {
		
		//WARM
		initBiome(oakForestBiome, "Oak_Forest", 9, false, BiomeType.WARM, Type.FOREST);
		initBiome(tallOakforestBiome, "Tall_Oak_Forest", 2, false, BiomeType.WARM, Type.FOREST);
		initBiome(greenSwampBiome, "Green_Swamp", 9, false, BiomeType.WARM, Type.SWAMP);
		
		//DESERT
		initBiome(sandDunesBiome, "Sand_Dunes", 5, true, BiomeType.DESERT, Type.SANDY);
		initBiome(redsandDunesBiome, "Red_Sand_Dunes", 5, true, BiomeType.DESERT, Type.SANDY);
		
		//COOL
		
		//ICY
		
	}
	
	private static Biome initBiome(Biome biome, String name, int weight, boolean canSpawn, BiomeType biomeType, Type... types)	{
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
