package kipster.nt;

import kipster.nt.blocks.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NovamTerramTab extends CreativeTabs 
{
	public NovamTerramTab(String label) { super("novamterramtab"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.CONIFERLEAVESORANGE);}
}
