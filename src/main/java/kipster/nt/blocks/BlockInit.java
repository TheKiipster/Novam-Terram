package kipster.nt.blocks;

import java.util.ArrayList;
import java.util.List;

import kipster.nt.blocks.blocks.BlockLeavesConiferOrange;
import kipster.nt.blocks.blocks.BlockLeavesConiferYellow;
import kipster.nt.blocks.blocks.BlockSaplingConiferOrange;
import kipster.nt.blocks.blocks.BlockSaplingConiferYellow;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//LEAVES
	public static final Block CONIFERLEAVESYELLOW = new BlockLeavesConiferYellow("conifer_leaves_yellow", Material.LEAVES);
	public static final Block CONIFERLEAVESORANGE = new BlockLeavesConiferOrange("conifer_leaves_orange", Material.LEAVES);
	
	//SAPLING
	public static final Block CONIFERSAPLINGYELLOW = new BlockSaplingConiferYellow("conifer_sapling_yellow", Material.LEAVES);
	public static final Block CONIFERSAPLINGORANGE = new BlockSaplingConiferOrange("conifer_sapling_orange", Material.LEAVES);
	
}
