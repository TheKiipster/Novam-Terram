package kipster.nt.proxy;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import kipster.nt.NovamTerram;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy 
{
	 public static ResourceLocation[] novamterramPanorama = new ResourceLocation[] {new ResourceLocation("novamterram:textures/gui/title/background/panorama_0.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_1.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_2.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_3.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_4.png"), new ResourceLocation("novamterram:textures/gui/title/background/panorama_5.png")};
	
	 @Override
	 public final void registerRenderers()
	    {
	           // GuiMainMenu.TITLE_PANORAMA_PATHS = novamterramPanorama;

	}
	 
	@Override
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(NovamTerram.modId, filename), id));
	}
}