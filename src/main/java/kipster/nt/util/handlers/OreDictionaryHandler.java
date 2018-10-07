package kipster.nt.util.handlers;

import kipster.nt.blocks.BlockInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	
	public static void registerOreDictionary() {
		
		//Leaves
		OreDictionary.registerOre("treeLeaves", BlockInit.CONIFERLEAVESORANGE);
		OreDictionary.registerOre("treeLeaves", BlockInit.CONIFERLEAVESYELLOW);
		OreDictionary.registerOre("treeLeaves", BlockInit.CHERRYLEAVESPINK);
		OreDictionary.registerOre("treeLeaves", BlockInit.CHERRYLEAVESPURPLE);
		OreDictionary.registerOre("treeLeaves", BlockInit.CHERRYLEAVESWHITE);
		OreDictionary.registerOre("treeLeaves", BlockInit.MAPLELEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.SPRUCELEAVESRED);
		OreDictionary.registerOre("treeLeaves", BlockInit.SPRUCELEAVESBLUE);
		OreDictionary.registerOre("treeLeaves", BlockInit.JACARANDALEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.OAKLEAVESRED);
		
		//Saplings
		OreDictionary.registerOre("treeSapling", BlockInit.CONIFERSAPLINGORANGE);
		OreDictionary.registerOre("treeSapling", BlockInit.CONIFERSAPLINGYELLOW);
		OreDictionary.registerOre("treeSapling", BlockInit.CHERRYSAPLINGPINK);
		OreDictionary.registerOre("treeSapling", BlockInit.CHERRYSAPLINGPURPLE);
		OreDictionary.registerOre("treeSapling", BlockInit.CHERRYSAPLINGWHITE);
		OreDictionary.registerOre("treeSapling", BlockInit.MAPLESAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.SPRUCESAPLINGRED);
		OreDictionary.registerOre("treeSapling", BlockInit.SPRUCESAPLINGBLUE);
		OreDictionary.registerOre("treeSapling", BlockInit.JACARANDASAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.OAKSAPLINGRED);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGACACIA);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGBIRCH);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGBLUESPRUCE);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGCHERRYPINK);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGCHERRYPURPLE);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGCHERRYWHITE);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGCONIFERORANGE);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGCONIFERYELLOW);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGDARKOAK);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGJACARANDA);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGJUNGLE);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGMAPLE);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGOAK);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGREDOAK);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGREDSPRUCE);
		OreDictionary.registerOre("treeSapling", BlockInit.SHRUBSAPLINGSPRUCE);
		
		//Sands
		OreDictionary.registerOre("sand", BlockInit.WHITESAND);
		OreDictionary.registerOre("sandstone", BlockInit.WHITESANDSTONE);
		OreDictionary.registerOre("sandstone", BlockInit.WHITESANDSTONECARVED);
		OreDictionary.registerOre("sandstone", BlockInit.WHITESANDSTONEFACE);
		OreDictionary.registerOre("sandstone", BlockInit.WHITESANDSTONEGLYPH);
		OreDictionary.registerOre("sandstone", BlockInit.WHITESANDSTONESMOOTH);
	}
}
