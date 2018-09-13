package kipster.nt.blocks;

import java.util.ArrayList;
import java.util.List;

import kipster.nt.blocks.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//LEAVES
	public static final Block CONIFERLEAVESYELLOW = new BlockLeavesConiferYellow("conifer_leaves_yellow", Material.LEAVES);
	public static final Block CONIFERLEAVESORANGE = new BlockLeavesConiferOrange("conifer_leaves_orange", Material.LEAVES);
	public static final Block CHERRYLEAVESPURPLE = new BlockLeavesCherryPurple("cherry_leaves_purple", Material.LEAVES);
	public static final Block CHERRYLEAVESWHITE = new BlockLeavesCherryWhite("cherry_leaves_white", Material.LEAVES);
	public static final Block CHERRYLEAVESPINK = new BlockLeavesCherryPink("cherry_leaves_pink", Material.LEAVES);
	public static final Block MAPLELEAVES = new BlockLeavesMaple("maple_leaves", Material.LEAVES);
	public static final Block JACARANDALEAVES= new BlockLeavesJacaranda("jacaranda_leaves", Material.LEAVES);
	public static final Block SPRUCELEAVESRED = new BlockLeavesRedSpruce("spruce_leaves_red", Material.LEAVES);
	public static final Block SPRUCELEAVESBLUE = new BlockLeavesBlueSpruce("spruce_leaves_blue", Material.LEAVES);
	public static final Block OAKLEAVESRED = new BlockLeavesRedOak("oak_leaves_red", Material.LEAVES);
	
	
	//SAPLING
	public static final Block CONIFERSAPLINGYELLOW = new BlockSaplingConiferYellow("conifer_sapling_yellow", Material.LEAVES);
	public static final Block CONIFERSAPLINGORANGE = new BlockSaplingConiferOrange("conifer_sapling_orange", Material.LEAVES);
	public static final Block CHERRYSAPLINGPURPLE = new BlockSaplingCherryPurple("cherry_sapling_purple", Material.LEAVES);
	public static final Block CHERRYSAPLINGWHITE = new BlockSaplingCherryWhite("cherry_sapling_white", Material.LEAVES);
	public static final Block CHERRYSAPLINGPINK = new BlockSaplingCherryPink("cherry_sapling_pink", Material.LEAVES);
	public static final Block MAPLESAPLING = new BlockSaplingMaple("maple_sapling", Material.LEAVES);
	public static final Block JACARANDASAPLING = new BlockSaplingJacaranda("jacaranda_sapling", Material.LEAVES);
	public static final Block SPRUCESAPLINGRED = new BlockSaplingRedSpruce("spruce_sapling_red", Material.LEAVES);
	public static final Block SPRUCESAPLINGBLUE = new BlockSaplingBlueSpruce("spruce_sapling_blue", Material.LEAVES);
	public static final Block OAKSAPLINGRED = new BlockSaplingRedOak("oak_sapling_red", Material.LEAVES);

}
