package kipster.nt;

import kipster.nt.util.handlers.RegistryHandler;
import net.minecraftforge.common.config.Configuration;

public class Config {

	private static final String CATEGORY_BIOMES_COOL = "Cool Biomes";
	private static final String CATEGORY_BIOMES_DESERT = "Desert Biomes";
	private static final String CATEGORY_BIOMES_ICY = "Icy Biomes";
	private static final String CATEGORY_BIOMES_STUFF = "Other Stuff";
	private static final String CATEGORY_BIOMES_WARM = "Warm Biomes";
	
    //Stuff
    public static boolean disableBoulders = false;
    
    //Cool 
    
    public static boolean disableAutumnTaiga = false;
    public static boolean disableAutumnTaigaHills = false;
    public static boolean disableBlueTaiga = false;
    public static boolean disableBlueTaigaHills = false;
    public static boolean disableCliffs = false;
    public static boolean disableConiferousPlains = false;
    public static boolean disableMapleForest = false;
    public static boolean disableMapleForestHills = false;
    public static boolean disableMegaAutumnTaiga = false;
    public static boolean disableMegaAutumnTaigaHills = false;
    public static boolean disableMegaBlueTaiga = false;
    public static boolean disableMegaBlueTaigaHills = false;
    public static boolean disableMegaMapleForest = false;
    public static boolean disableMegaMapleForestHills = false;
    public static boolean disablePineForest = false;
    public static boolean disablePineland = false;
    public static boolean disableRockyTaiga = false;
    
    //Desert
    
    public static boolean disableClayland = false;
    public static boolean disableGoldenSavanna = false;
    public static boolean disableGoldenSavannaPlateau = false;
    public static boolean disableLushDesert = false;
    public static boolean disableOutback = false;
    public static boolean disableRedSandDune = false;
    public static boolean disableRockland = false;
    public static boolean disableSahel = false;
    public static boolean disableSandDune = false;
    public static boolean disableSandyScrubland = false;
    public static boolean disableScrubland = false;
    public static boolean disableSerengeti = false;
    
    //Icy
    
    public static boolean disableAlps = false;
    public static boolean disableColdBirchForest = false;
    public static boolean disableColdBirchForestHills = false;
    public static boolean disableColdBlueTaiga = false;
    public static boolean disableColdBlueTaigaHills = false;
    public static boolean disableColdFlowerForest = false;
    public static boolean disableColdFlowerForestHills = false;
    public static boolean disableColdForest = false;
    public static boolean disableColdForestHills = false;
    public static boolean disableColdMegaBlueTaiga = false;
    public static boolean disableColdMegaBlueTaigaHills = false;
    public static boolean disableColdMegaSpruceTaiga = false;
    public static boolean disableColdMegaSpruceTaigaHills = false;
    public static boolean disableColdMegaTaiga = false;
    public static boolean disableColdMegaTaigaHills = false;
    public static boolean disableColdRoofedForest = false;
    public static boolean disableColdRoofedForestHills = false;
    public static boolean disableIcyTundra = false;
    public static boolean disableSnowDune = false;
    public static boolean disableSnowyPineForest = false;
    public static boolean disableTundra = false;
    
    //Warm
    
    public static boolean disableAegeanArchipelago = false;
    public static boolean disableAliumMeadow = false;
    public static boolean disableBirchHills = false;
    public static boolean disableBlossomForest = false;
    public static boolean disableBlossomForestHills = false;
    public static boolean disableBog = false;
    public static boolean disableDenseMixedForest = false;
    public static boolean disableDenseMixedForestHills = false;
    public static boolean disableDenseShrubland = false;
    public static boolean disableDryForest = false;
    public static boolean disableDryForestHills = false;
    public static boolean disableEstuary = false;
    public static boolean disableFloralMeadow = false;
    public static boolean disableForestedLakes = false;
    public static boolean disableFungalJungle = false;
    public static boolean disableFungalJungleHills = false;
    public static boolean disableGreenMixedForest = false;
    public static boolean disableGreenMixedForestHills = false;
    public static boolean disableGreenSwamp = false;
    public static boolean disableHighland = false;
    public static boolean disableHills = false;
    public static boolean disableHotSpring = false;
    public static boolean disableLake = false;
    public static boolean disableLowland = false;
    public static boolean disableMeadow = false;
    public static boolean disableMixedForest = false;
    public static boolean disableMixedForestHills = false;
    public static boolean disableMoorland = false;
    public static boolean disableMountains = false;
    public static boolean disableOakForest = false;
    public static boolean disableOakForestHills = false;
    public static boolean disablePoppyMeadow = false;
    public static boolean disableShrubland = false;
    public static boolean disableTallOakForest = false;
    public static boolean disableTallOakForestHills = false;
    
    
    public static void readConfig() {
        Configuration cfg = RegistryHandler.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
          
        } catch (Exception e1) {
          
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
    	cfg.addCustomCategoryComment(CATEGORY_BIOMES_STUFF, "Other Stuff Configuration");
    	
    	disableBoulders = cfg.get(CATEGORY_BIOMES_STUFF, "disableBoulders", disableBoulders).getBoolean();
    	
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_COOL, "Cool Biome Configuration");
        
        disableAutumnTaiga = cfg.get(CATEGORY_BIOMES_COOL, "disableAutumnTaiga", disableAutumnTaiga).getBoolean();
        disableAutumnTaigaHills = cfg.get(CATEGORY_BIOMES_COOL, "disableAutumnTaigaHills", disableAutumnTaigaHills).getBoolean();
        disableBlueTaigaHills = cfg.get(CATEGORY_BIOMES_COOL, "disableBlueTaigaHills", disableBlueTaigaHills).getBoolean();
        disableCliffs = cfg.get(CATEGORY_BIOMES_COOL, "disableCliffs", disableCliffs).getBoolean();
        disableConiferousPlains = cfg.get(CATEGORY_BIOMES_COOL, "disableConiferousPlains", disableConiferousPlains).getBoolean();
        disableMapleForest = cfg.get(CATEGORY_BIOMES_WARM, "disableMapleForest", disableMapleForest).getBoolean();
        disableMapleForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableMapleForestHills", disableMapleForestHills).getBoolean();
        disableMegaAutumnTaiga = cfg.get(CATEGORY_BIOMES_COOL, "disableMegaAutumnTaiga", disableMegaAutumnTaiga).getBoolean();
        disableMegaAutumnTaigaHills = cfg.get(CATEGORY_BIOMES_COOL, "disableMegaAutumnTaigaHills", disableMegaAutumnTaigaHills).getBoolean(); disableBlueTaiga = cfg.get(CATEGORY_BIOMES_COOL, "disableBlueTaiga", disableBlueTaiga).getBoolean();
        disableMegaBlueTaiga = cfg.get(CATEGORY_BIOMES_COOL, "disableMegaBlueTaiga", disableMegaBlueTaiga).getBoolean();
        disableMegaBlueTaigaHills = cfg.get(CATEGORY_BIOMES_COOL, "disableMegaBlueTaigaHills", disableMegaBlueTaigaHills).getBoolean();
        disableMegaMapleForest = cfg.get(CATEGORY_BIOMES_WARM, "disableMegaMapleForest", disableMegaMapleForest).getBoolean();
        disableMegaMapleForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableMegaMapleForestHills", disableMegaMapleForestHills).getBoolean();
        disablePineForest = cfg.get(CATEGORY_BIOMES_COOL, "disablePineForest", disablePineForest).getBoolean();
        disablePineland = cfg.get(CATEGORY_BIOMES_WARM, "disablePineland", disablePineland).getBoolean();
        disableRockyTaiga = cfg.get(CATEGORY_BIOMES_WARM, "disableRockyTaiga", disableRockyTaiga).getBoolean();
        
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_DESERT, "Desert Biome Configuration");
        
        disableClayland = cfg.get(CATEGORY_BIOMES_DESERT, "disableClayland", disableClayland).getBoolean();
        disableGoldenSavanna = cfg.get(CATEGORY_BIOMES_DESERT, "disableGoldenSavanna", disableGoldenSavanna).getBoolean();
        disableGoldenSavannaPlateau = cfg.get(CATEGORY_BIOMES_DESERT, "disableGoldenSavannaPlateau", disableGoldenSavannaPlateau).getBoolean();
        disableLushDesert = cfg.get(CATEGORY_BIOMES_DESERT, "disableLushDesert", disableLushDesert).getBoolean();
        disableOutback = cfg.get(CATEGORY_BIOMES_DESERT, "disableOutback", disableOutback).getBoolean();
        disableRedSandDune = cfg.get(CATEGORY_BIOMES_DESERT, "disableRedSandDune", disableRedSandDune).getBoolean();
        disableRockland = cfg.get(CATEGORY_BIOMES_DESERT, "disableRockland", disableRockland).getBoolean();
        disableSahel = cfg.get(CATEGORY_BIOMES_DESERT, "disableSahel", disableSahel).getBoolean();
        disableSandDune = cfg.get(CATEGORY_BIOMES_DESERT, "disableSandDune", disableSandDune).getBoolean();
        disableSandyScrubland = cfg.get(CATEGORY_BIOMES_DESERT, "disableSandyScrubland", disableSandyScrubland).getBoolean();
        disableScrubland = cfg.get(CATEGORY_BIOMES_DESERT, "disableScrubland", disableScrubland).getBoolean();
        disableSerengeti = cfg.get(CATEGORY_BIOMES_DESERT, "disableSerengeti", disableSerengeti).getBoolean();
        
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_ICY, "Icy Biome Configuration");
        
        disableAlps = cfg.get(CATEGORY_BIOMES_ICY, "disableAlps", disableAlps).getBoolean();
        disableColdBirchForest = cfg.get(CATEGORY_BIOMES_ICY, "disableColdBirchForest", disableColdBirchForest).getBoolean();
        disableColdBirchForestHills = cfg.get(CATEGORY_BIOMES_ICY, "disableColdBirchForestHills", disableColdBirchForestHills).getBoolean();
        disableColdBlueTaiga = cfg.get(CATEGORY_BIOMES_ICY, "disableColdBlueTaiga", disableColdBlueTaiga).getBoolean();
        disableColdBlueTaigaHills = cfg.get(CATEGORY_BIOMES_ICY, "disableColdBlueTaigaHills", disableColdBlueTaigaHills).getBoolean();
        disableColdFlowerForest = cfg.get(CATEGORY_BIOMES_ICY, "disableColdFlowerForest", disableColdFlowerForest).getBoolean();
        disableColdFlowerForestHills = cfg.get(CATEGORY_BIOMES_ICY, "disableColdFlowerForestHills", disableColdFlowerForestHills).getBoolean();
        disableColdForest = cfg.get(CATEGORY_BIOMES_ICY, "disableColdForest", disableColdForest).getBoolean();
        disableColdForestHills = cfg.get(CATEGORY_BIOMES_ICY, "disableColdForestHills", disableColdForestHills).getBoolean();
        disableColdMegaBlueTaiga = cfg.get(CATEGORY_BIOMES_ICY, "disableColdMegaBlueTaiga", disableColdMegaBlueTaiga).getBoolean();
        disableColdMegaBlueTaigaHills = cfg.get(CATEGORY_BIOMES_ICY, "disableColdMegaBlueTaigaHills", disableColdMegaBlueTaigaHills).getBoolean();
        disableColdMegaSpruceTaiga = cfg.get(CATEGORY_BIOMES_ICY, "disableColdMegaSpruceTaiga", disableColdMegaSpruceTaiga).getBoolean();
        disableColdMegaSpruceTaigaHills = cfg.get(CATEGORY_BIOMES_ICY, "disableColdMegaSpruceTaigaHills", disableColdMegaSpruceTaigaHills).getBoolean();
        disableColdMegaTaiga = cfg.get(CATEGORY_BIOMES_ICY, "disableColdMegaTaiga", disableColdMegaTaiga).getBoolean();
        disableColdMegaTaigaHills = cfg.get(CATEGORY_BIOMES_ICY, "disableColdMegaTaigaHills", disableColdMegaTaigaHills).getBoolean();
        disableColdRoofedForest = cfg.get(CATEGORY_BIOMES_ICY, "disableColdRoofedForest", disableColdRoofedForest).getBoolean();
        disableColdRoofedForestHills = cfg.get(CATEGORY_BIOMES_ICY, "disableColdRoofedForestHills", disableColdRoofedForestHills).getBoolean();
        disableIcyTundra = cfg.get(CATEGORY_BIOMES_ICY, "disableIcyTundra", disableIcyTundra).getBoolean();
        disableSnowDune = cfg.get(CATEGORY_BIOMES_ICY, "disableSnowDune", disableSnowDune).getBoolean();
        disableSnowyPineForest = cfg.get(CATEGORY_BIOMES_ICY, "disableSnowyPineForest", disableSnowyPineForest).getBoolean();
        disableTundra = cfg.get(CATEGORY_BIOMES_ICY, "disableTundra", disableTundra).getBoolean();
       
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_WARM, "Warm Biome Configuration");
        
        disableAegeanArchipelago = cfg.get(CATEGORY_BIOMES_WARM, "disableAegeanArchipelago", disableAegeanArchipelago).getBoolean();
        disableAliumMeadow = cfg.get(CATEGORY_BIOMES_WARM, "disableAliumMeadow", disableAliumMeadow).getBoolean();
        disableBirchHills = cfg.get(CATEGORY_BIOMES_WARM, "disableBirchHills", disableBirchHills).getBoolean();
        disableBlossomForest = cfg.get(CATEGORY_BIOMES_WARM, "disableBlossomForest", disableBlossomForest).getBoolean();
        disableBlossomForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableBlossomForestHills", disableBlossomForestHills).getBoolean();
        disableBog = cfg.get(CATEGORY_BIOMES_WARM, "disableBog", disableBog).getBoolean();
        disableDenseMixedForest = cfg.get(CATEGORY_BIOMES_WARM, "disableDenseMixedForest", disableDenseMixedForest).getBoolean();
        disableDenseMixedForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableDenseMixedForestHills", disableDenseMixedForestHills).getBoolean();
        disableDenseShrubland = cfg.get(CATEGORY_BIOMES_WARM, "disableDenseShrubland", disableDenseShrubland).getBoolean();
        disableDryForest = cfg.get(CATEGORY_BIOMES_WARM, "disableDryForest", disableDryForest).getBoolean();
        disableDryForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableDryForestHills", disableDryForestHills).getBoolean();
        disableEstuary = cfg.get(CATEGORY_BIOMES_WARM, "disableEstuary", disableEstuary).getBoolean();
        disableFloralMeadow = cfg.get(CATEGORY_BIOMES_WARM, "disableFloralMeadow", disableFloralMeadow).getBoolean();
        disableForestedLakes = cfg.get(CATEGORY_BIOMES_WARM, "disableForestedLakes", disableForestedLakes).getBoolean();
        disableFungalJungle = cfg.get(CATEGORY_BIOMES_WARM, "disableFungalJungle", disableFungalJungle).getBoolean();
        disableFungalJungleHills = cfg.get(CATEGORY_BIOMES_WARM, "disableFungalJungleHills", disableFungalJungleHills).getBoolean();
        disableGreenMixedForest = cfg.get(CATEGORY_BIOMES_WARM, "disableGreenMixedForest", disableGreenMixedForest).getBoolean();
        disableGreenMixedForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableGreenMixedForestHills", disableGreenMixedForestHills).getBoolean();
        disableGreenSwamp = cfg.get(CATEGORY_BIOMES_WARM, "disableGreenSwamp", disableGreenSwamp).getBoolean();
        disableHighland = cfg.get(CATEGORY_BIOMES_WARM, "disableHighland", disableHighland).getBoolean();
        disableHills = cfg.get(CATEGORY_BIOMES_WARM, "disableHills", disableHills).getBoolean();
        disableHotSpring = cfg.get(CATEGORY_BIOMES_WARM, "disableHotSpring", disableHotSpring).getBoolean();
        disableLake = cfg.get(CATEGORY_BIOMES_WARM, "disableLake", disableLake).getBoolean();
        disableLowland = cfg.get(CATEGORY_BIOMES_WARM, "disableLowland", disableLowland).getBoolean();
        disableMeadow = cfg.get(CATEGORY_BIOMES_WARM, "disableMeadow", disableMeadow).getBoolean();
        disableMixedForest = cfg.get(CATEGORY_BIOMES_WARM, "disableMixedForest", disableMixedForest).getBoolean();
        disableMixedForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableMixedForestHills", disableMixedForestHills).getBoolean();
        disableMoorland = cfg.get(CATEGORY_BIOMES_WARM, "disableMoorland", disableMoorland).getBoolean();
        disableMountains = cfg.get(CATEGORY_BIOMES_WARM, "disableMountains", disableMountains).getBoolean();
        disableOakForest = cfg.get(CATEGORY_BIOMES_WARM, "disableOakForest", disableOakForest).getBoolean();
        disableOakForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableOakForestHills", disableOakForestHills).getBoolean();
        disablePoppyMeadow = cfg.get(CATEGORY_BIOMES_WARM, "disablePoppyMeadow", disablePoppyMeadow).getBoolean();
        disableShrubland = cfg.get(CATEGORY_BIOMES_WARM, "disableShrubland", disableShrubland).getBoolean();
        disableTallOakForest = cfg.get(CATEGORY_BIOMES_WARM, "disableTallOakForest", disableTallOakForest).getBoolean();
        disableTallOakForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableTallOakForestHills", disableTallOakForestHills).getBoolean();
        
    }
 
}