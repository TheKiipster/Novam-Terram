package kipster.nt.blocks.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import kipster.nt.NovamTerram;
import kipster.nt.blocks.BlockInit;
import kipster.nt.items.ItemInit;
import kipster.nt.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockSandstoneSlabs extends BlockNovamTerramSlabs implements IHasModel{

	public BlockSandstoneSlabs(String name) {
        super(name, Material.ROCK, SoundType.STONE);
        setHarvestLevel("axe", 0);
        setHardness(2.0F);
        setResistance(15);
    }

  

    public static class Double extends BlockSandstoneSlabs {
        public Double(String name, Block half) {
            super(name);
            this.halfslab = half;
        }

        public boolean isDouble() {
            return true;
        }
    }

    public static class Half extends BlockSandstoneSlabs {
        public Half(String name) {
            super(name);
        }

        public boolean isDouble() {
            return false;
        }
    }

    @Override
	public void registerModels() 
	{
		NovamTerram.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
