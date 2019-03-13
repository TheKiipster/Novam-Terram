package kipster.nt.proxy;

import kipster.nt.NovamTerram;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
  public static ResourceLocation[] novamterramPanorama = new ResourceLocation[] {
      new ResourceLocation("novamterram:textures/gui/title/background/panorama_0.png"),
      new ResourceLocation("novamterram:textures/gui/title/background/panorama_1.png"),
      new ResourceLocation("novamterram:textures/gui/title/background/panorama_2.png"),
      new ResourceLocation("novamterram:textures/gui/title/background/panorama_3.png"),
      new ResourceLocation("novamterram:textures/gui/title/background/panorama_4.png"),
      new ResourceLocation("novamterram:textures/gui/title/background/panorama_5.png") };

  @Override
  public final void registerRenderers() {
    // GuiMainMenu.TITLE_PANORAMA_PATHS = novamterramPanorama;

  }

  @Override
  public void registerItemRenderer(Item item, int meta, String id) {
    ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
  }

  @Override
  public void registerVariantRenderer(Item item, int meta, String filename, String id) {
    ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(NovamTerram.modId, filename), id));
  }

  public void preInit(FMLPreInitializationEvent event) {
    super.preInit(event);
  }

  public void init(FMLInitializationEvent event) {
    super.init(event);
  }

  public void postInit(FMLPostInitializationEvent event) {
    super.postInit(event);
  }
}