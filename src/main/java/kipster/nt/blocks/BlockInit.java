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
	
	//CREATIVEONLYSAPLING
	public static final Block SHRUBSAPLINGACACIA = new BlockSaplingShrubAcacia("shrub_sapling_acacia", Material.LEAVES);
	public static final Block SHRUBSAPLINGBIRCH = new BlockSaplingShrubBirch("shrub_sapling_birch", Material.LEAVES);
	public static final Block SHRUBSAPLINGBLUESPRUCE = new BlockSaplingShrubBlueSpruce("shrub_sapling_bluespruce", Material.LEAVES);
	public static final Block SHRUBSAPLINGCHERRYPINK = new BlockSaplingShrubCherryPink("shrub_sapling_cherrypink", Material.LEAVES);
	public static final Block SHRUBSAPLINGCHERRYPURPLE = new BlockSaplingShrubCherryPurple("shrub_sapling_cherrypurple", Material.LEAVES);
	public static final Block SHRUBSAPLINGCHERRYWHITE = new BlockSaplingShrubCherryWhite("shrub_sapling_cherrywhite", Material.LEAVES);
	public static final Block SHRUBSAPLINGCONIFERORANGE = new BlockSaplingShrubConiferOrange("shrub_sapling_coniferorange", Material.LEAVES);
	public static final Block SHRUBSAPLINGCONIFERYELLOW = new BlockSaplingShrubConiferYellow("shrub_sapling_coniferyellow", Material.LEAVES);
	public static final Block SHRUBSAPLINGDARKOAK = new BlockSaplingShrubDarkOak("shrub_sapling_darkoak", Material.LEAVES);
	public static final Block SHRUBSAPLINGJACARANDA = new BlockSaplingShrubJacaranda("shrub_sapling_jacaranda", Material.LEAVES);
	public static final Block SHRUBSAPLINGJUNGLE = new BlockSaplingShrubJungle("shrub_sapling_jungle", Material.LEAVES);
	public static final Block SHRUBSAPLINGMAPLE = new BlockSaplingShrubMaple("shrub_sapling_maple", Material.LEAVES);
	public static final Block SHRUBSAPLINGOAK = new BlockSaplingShrubOak("shrub_sapling_oak", Material.LEAVES);
	public static final Block SHRUBSAPLINGREDOAK = new BlockSaplingShrubRedOak("shrub_sapling_redoak", Material.LEAVES);
	public static final Block SHRUBSAPLINGREDSPRUCE = new BlockSaplingShrubRedSpruce("shrub_sapling_redspruce", Material.LEAVES);
	public static final Block SHRUBSAPLINGSPRUCE = new BlockSaplingShrubSpruce("shrub_sapling_spruce", Material.LEAVES);
	public static final Block SAPLINGPINE = new BlockSaplingPine("sapling_pine", Material.LEAVES);
	public static final Block SAPLINGPOPlAR = new BlockSaplingPoplar("sapling_poplar", Material.LEAVES);
	public static final Block SAPLINGTALLSPRUCE = new BlockSaplingTallSpruce("sapling_tallspruce", Material.LEAVES);

	//SANDS
	public static final Block WHITESAND = new BlockSands("white_sand", Material.SAND);
	public static final Block WHITESANDSTONE = new BlockSandstone("white_sandstone", Material.ROCK);
	public static final Block WHITESANDSTONESMOOTH = new BlockSandstoneSmooth("white_sandstone_smooth", Material.ROCK);
	public static final Block WHITESANDSTONECARVED = new BlockSandstoneCarved("white_sandstone_carved", Material.ROCK);
	public static final Block WHITESANDSTONEFACE = new BlockSandstoneFace("white_sandstone_face", Material.ROCK);
	public static final Block WHITESANDSTONEGLYPH = new BlockSandstoneGlyph("white_sandstone_glyph", Material.ROCK);
}
