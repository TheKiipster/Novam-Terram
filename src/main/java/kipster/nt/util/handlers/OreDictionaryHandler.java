package kipster.nt.util.handlers;

import kipster.nt.blocks.BlockInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	
	public static void registerOreDictionary() {
		OreDictionary.registerOre("treeLeaves", BlockInit.CONIFERLEAVESORANGE);
		OreDictionary.registerOre("treeLeaves", BlockInit.CONIFERLEAVESYELLOW);
		OreDictionary.registerOre("treeLeaves", BlockInit.CHERRYLEAVESPINK);
		OreDictionary.registerOre("treeLeaves", BlockInit.CHERRYLEAVESPURPLE);
		OreDictionary.registerOre("treeLeaves", BlockInit.CHERRYLEAVESWHITE);
		OreDictionary.registerOre("treeLeaves", BlockInit.MAPLELEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.SPRUCELEAVESRED);
		OreDictionary.registerOre("treeSapling", BlockInit.CONIFERSAPLINGORANGE);
		OreDictionary.registerOre("treeSapling", BlockInit.CONIFERSAPLINGYELLOW);
		OreDictionary.registerOre("treeSapling", BlockInit.CHERRYSAPLINGPINK);
		OreDictionary.registerOre("treeSapling", BlockInit.CHERRYSAPLINGPURPLE);
		OreDictionary.registerOre("treeSapling", BlockInit.CHERRYSAPLINGWHITE);
		OreDictionary.registerOre("treeSapling", BlockInit.MAPLESAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.SPRUCESAPLINGRED);
	}
}
