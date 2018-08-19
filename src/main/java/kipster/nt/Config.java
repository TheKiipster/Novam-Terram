package kipster.nt;

import kipster.nt.util.handlers.RegistryHandler;
import net.minecraftforge.common.config.Configuration;

public class Config {

    private static final String CATEGORY_BIOMES_COOL = "Cool Biomes";
    private static final String CATEGORY_BIOMES_ICY = "Icy Biomes";
    private static final String CATEGORY_BIOMES_DESERT = "Desert Biomes";
    private static final String CATEGORY_BIOMES_WARM = "Warm Biomes";

    //Cool 
    
    public static boolean disableAutumnTaiga = false;
    public static boolean disableAutumnTaigaHills = false;
    public static boolean disableTaigaPlains = false;
    public static boolean disableCliffs = false;
    public static boolean disableMegaAutumnTaiga = false;
    public static boolean disablePineForest = false;
    public static boolean disablePinelands = false;
    public static boolean disableMapleWoods = false;
    public static boolean disableMapleWoodsHills = false;
        
    //Icy
    
    public static boolean disableTundra = false;
    public static boolean disableIcyTundra = false;
    public static boolean disableSnowyPineForest = false;
    public static boolean disableColdForest = false;
    public static boolean disableColdBirchForest = false;
    public static boolean disableColdRoofedForest = false;
    public static boolean disableColdMegaTaiga = false;
    public static boolean disableColdMegaSpruceTaiga = false;
    public static boolean disableAlps = false;
    
    //Desert
    
    public static boolean disableSandDunes = false;
    public static boolean disableRedSandDunes = false;
    public static boolean disableSahel = false;
    public static boolean disableOutback = false;
    public static boolean disableSavannaScrub = false;
    public static boolean disableClaylands = false;
    public static boolean disableRocklands = false;
    
    //Warm
	
    public static boolean disableGreenSwamp = false;
    public static boolean disableOakForest = false;
    public static boolean disableTallOakForest = false;
    public static boolean disableShrubland = false;
    public static boolean disableDenseShrubland = false;
    public static boolean disableHighlands = false;
    public static boolean disableLowlands = false;
    public static boolean disableBog = false;
    public static boolean disableDryForest = false;
    public static boolean disableDryForestHills = false;
    public static boolean disableSprings = false;
    public static boolean disableDenseMixedForest = false;
    public static boolean disableMixedForest = false;
    public static boolean disableBlossomForest = false;
    public static boolean disableBlossomForestHills = false;
    public static boolean disableEstuary = false;
    public static boolean disableMeadow = false;
    public static boolean disableBirchHills = false;
    public static boolean disableFungalJungle = false;
    public static boolean disableLake = false;
    public static boolean disableFungalJungleHills = false;
    
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
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_COOL, "Cool Biome configuration");
        
        disableAutumnTaiga = cfg.get(CATEGORY_BIOMES_COOL, "disableAutumnTaiga", disableAutumnTaiga).getBoolean();
        disableAutumnTaigaHills = cfg.get(CATEGORY_BIOMES_COOL, "disableAutumnTaigaHills", disableAutumnTaigaHills).getBoolean();
        disableTaigaPlains = cfg.get(CATEGORY_BIOMES_COOL, "disableTaigaPlains", disableTaigaPlains).getBoolean();
        disableCliffs = cfg.get(CATEGORY_BIOMES_COOL, "disableCliffs", disableCliffs).getBoolean();
        disableMegaAutumnTaiga = cfg.get(CATEGORY_BIOMES_COOL, "disableMegaAutumnTaiga", disableMegaAutumnTaiga).getBoolean();
        disablePineForest = cfg.get(CATEGORY_BIOMES_COOL, "disablePineForest", disablePineForest).getBoolean();
        disablePinelands = cfg.get(CATEGORY_BIOMES_WARM, "disablePinelands", disablePinelands).getBoolean();
        disableMapleWoods = cfg.get(CATEGORY_BIOMES_WARM, "disableMapleWoods", disableMapleWoods).getBoolean();
        disableMapleWoodsHills = cfg.get(CATEGORY_BIOMES_WARM, "disableMapleWoodsHills", disableMapleWoodsHills).getBoolean(); 
        
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_ICY, "Icy Biome configuration");
        
        disableTundra = cfg.get(CATEGORY_BIOMES_ICY, "disableTundra", disableTundra).getBoolean();
        disableIcyTundra = cfg.get(CATEGORY_BIOMES_ICY, "disableIcyTundra", disableIcyTundra).getBoolean();
        disableSnowyPineForest = cfg.get(CATEGORY_BIOMES_ICY, "disableSnowyPineForest", disableSnowyPineForest).getBoolean();
        disableTundra = cfg.get(CATEGORY_BIOMES_ICY, "disableTundra", disableTundra).getBoolean();
        disableColdForest = cfg.get(CATEGORY_BIOMES_ICY, "disableColdForest", disableColdForest).getBoolean();
        disableColdBirchForest = cfg.get(CATEGORY_BIOMES_ICY, "disableColdBirchForest", disableColdBirchForest).getBoolean();
        disableColdRoofedForest = cfg.get(CATEGORY_BIOMES_ICY, "disableColdRoofedForest", disableColdRoofedForest).getBoolean();
        disableColdMegaTaiga = cfg.get(CATEGORY_BIOMES_ICY, "disableColdMegaTaiga", disableColdMegaTaiga).getBoolean();
        disableColdMegaSpruceTaiga = cfg.get(CATEGORY_BIOMES_ICY, "disableColdMegaSpruceTaiga", disableColdMegaSpruceTaiga).getBoolean();
        disableAlps = cfg.get(CATEGORY_BIOMES_ICY, "disableAlps", disableAlps).getBoolean();
        
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_DESERT, "Desert Biome configuration");
        
        disableSandDunes = cfg.get(CATEGORY_BIOMES_DESERT, "disableSandDunes", disableSandDunes).getBoolean();
        disableRedSandDunes = cfg.get(CATEGORY_BIOMES_DESERT, "disableRedSandDunes", disableRedSandDunes).getBoolean();
        disableSahel = cfg.get(CATEGORY_BIOMES_DESERT, "disableSahel", disableSahel).getBoolean();
        disableOutback = cfg.get(CATEGORY_BIOMES_DESERT, "disableOutback", disableOutback).getBoolean();
        disableSavannaScrub = cfg.get(CATEGORY_BIOMES_DESERT, "disableSavannaScrub", disableSavannaScrub).getBoolean();
        disableClaylands = cfg.get(CATEGORY_BIOMES_DESERT, "disableClaylands", disableClaylands).getBoolean();
        disableRocklands = cfg.get(CATEGORY_BIOMES_DESERT, "disableRocklands", disableRocklands).getBoolean();
        
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_WARM, "Warm Biome configuration");
        
        disableGreenSwamp = cfg.get(CATEGORY_BIOMES_WARM, "disableGreenSwamp", disableGreenSwamp).getBoolean();
        disableOakForest = cfg.get(CATEGORY_BIOMES_WARM, "disableOakForest", disableOakForest).getBoolean();
        disableTallOakForest = cfg.get(CATEGORY_BIOMES_WARM, "disableTallOakForest", disableTallOakForest).getBoolean();
        disableShrubland = cfg.get(CATEGORY_BIOMES_WARM, "disableShrubland", disableShrubland).getBoolean();
        disableDenseShrubland = cfg.get(CATEGORY_BIOMES_WARM, "disableDenseShrubland", disableDenseShrubland).getBoolean();
        disableHighlands = cfg.get(CATEGORY_BIOMES_WARM, "disableHighlands", disableHighlands).getBoolean();
        disableLowlands = cfg.get(CATEGORY_BIOMES_WARM, "disableLowlands", disableLowlands).getBoolean();
        disableBog = cfg.get(CATEGORY_BIOMES_WARM, "disableBog", disableBog).getBoolean();
        disableDryForest = cfg.get(CATEGORY_BIOMES_WARM, "disableDryForest", disableDryForest).getBoolean();
        disableDryForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableDryForestHills", disableDryForestHills).getBoolean();
        disableSprings = cfg.get(CATEGORY_BIOMES_WARM, "disableSprings", disableSprings).getBoolean();
        disableMixedForest = cfg.get(CATEGORY_BIOMES_WARM, "disableMixedForest", disableMixedForest).getBoolean();
        disableDenseMixedForest = cfg.get(CATEGORY_BIOMES_WARM, "disableDenseMixedForest", disableDenseMixedForest).getBoolean();
        disableBlossomForest = cfg.get(CATEGORY_BIOMES_WARM, "disableBlossomForest", disableBlossomForest).getBoolean();
        disableBlossomForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableBlossomForestHills", disableBlossomForestHills).getBoolean();
        disableEstuary = cfg.get(CATEGORY_BIOMES_WARM, "disableEstuary", disableEstuary).getBoolean();
        disableMeadow = cfg.get(CATEGORY_BIOMES_WARM, "disableMeadow", disableMeadow).getBoolean();
        disableBirchHills = cfg.get(CATEGORY_BIOMES_WARM, "disableBirchHills", disableBirchHills).getBoolean();
        disableFungalJungle = cfg.get(CATEGORY_BIOMES_WARM, "disableFungalJungle", disableFungalJungle).getBoolean();
        disableFungalJungleHills = cfg.get(CATEGORY_BIOMES_WARM, "disableFungalJungleHills", disableFungalJungleHills).getBoolean();
        disableLake = cfg.get(CATEGORY_BIOMES_WARM, "disableLake", disableLake).getBoolean();
        
    }
 
}