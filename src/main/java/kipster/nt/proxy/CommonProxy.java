package kipster.nt.proxy;

import kipster.nt.biomes.BiomeInit;
import kipster.nt.biomes.BiomeInit.IBiomeDetails;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
  public void registerRenderers() {
  }

  public void registerItemRenderer(Item item, int meta, String id) {
  }

  public void registerVariantRenderer(Item item, int meta, String filename, String id) {
  }

  public void preInit(FMLPreInitializationEvent event) {

  }

  public void init(FMLInitializationEvent event) {
    for (IBiomeDetails biomeDetails : BiomeInit.BIOMES) {
      BiomeManager.addBiome(biomeDetails.getBiomeType(), biomeDetails.getBiomeEntry());
      if (biomeDetails.hasVillages()) {
        BiomeManager.addVillageBiome(biomeDetails.getBiome(), true);
      }
      BiomeManager.addSpawnBiome(biomeDetails.getBiome());
      BiomeManager.addStrongholdBiome(biomeDetails.getBiome());
      BiomeProvider.allowedBiomes.add(biomeDetails.getBiome());
    }
  }

  public void postInit(FMLPostInitializationEvent event) {

  }

}