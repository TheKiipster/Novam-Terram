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
    
    //Icy
    
    
    //Desert
    
    public static boolean disableSandDunes = false;
    public static boolean disableRedSandDunes = false;
    public static boolean disableSahel = false;
    
    //Warm
	
    public static boolean disableGreenSwamp = false;
    public static boolean disableOakForest = false;
    public static boolean disableTallOakForest = false;
    public static boolean disableShrubland = false;
    public static boolean disableDenseShrubland = false;
    public static boolean disableHighlands = false;
    public static boolean disablePinelands = false;
    public static boolean disableLowlands = false;
    public static boolean disableBog = false;
    public static boolean disableDryForest = false;
    public static boolean disableDryForestHills = false;
    public static boolean disableSprings = false;

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
        
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_ICY, "Icy Biome configuration");
        
        
        
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_DESERT, "Desert Biome configuration");
        
        disableSandDunes = cfg.get(CATEGORY_BIOMES_DESERT, "disableSandDunes", disableSandDunes).getBoolean();
        disableRedSandDunes = cfg.get(CATEGORY_BIOMES_DESERT, "disableRedSandDunes", disableRedSandDunes).getBoolean();
        disableSahel = cfg.get(CATEGORY_BIOMES_DESERT, "disableSahel", disableSahel).getBoolean();
        
        cfg.addCustomCategoryComment(CATEGORY_BIOMES_WARM, "Warm Biome configuration");
        
        disableGreenSwamp = cfg.get(CATEGORY_BIOMES_WARM, "disableGreenSwamp", disableGreenSwamp).getBoolean();
        disableOakForest = cfg.get(CATEGORY_BIOMES_WARM, "disableOakForest", disableOakForest).getBoolean();
        disableTallOakForest = cfg.get(CATEGORY_BIOMES_WARM, "disableTallOakForest", disableTallOakForest).getBoolean();
        disableShrubland = cfg.get(CATEGORY_BIOMES_WARM, "disableShrubland", disableShrubland).getBoolean();
        disableDenseShrubland = cfg.get(CATEGORY_BIOMES_WARM, "disableDenseShrubland", disableDenseShrubland).getBoolean();
        disableHighlands = cfg.get(CATEGORY_BIOMES_WARM, "disableHighlands", disableHighlands).getBoolean();
        disablePinelands = cfg.get(CATEGORY_BIOMES_WARM, "disablePinelands", disablePinelands).getBoolean();
        disableLowlands = cfg.get(CATEGORY_BIOMES_WARM, "disableLowlands", disableLowlands).getBoolean();
        disableBog = cfg.get(CATEGORY_BIOMES_WARM, "disableBog", disableBog).getBoolean();
        disableDryForest = cfg.get(CATEGORY_BIOMES_WARM, "disableDryForest", disableDryForest).getBoolean();
        disableDryForestHills = cfg.get(CATEGORY_BIOMES_WARM, "disableDryForestHills", disableDryForestHills).getBoolean();
        disableSprings = cfg.get(CATEGORY_BIOMES_WARM, "disableSprings", disableSprings).getBoolean();
		
    }
 
}