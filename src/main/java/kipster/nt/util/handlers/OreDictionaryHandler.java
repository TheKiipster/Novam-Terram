package kipster.nt.util.handlers;

import kipster.nt.blocks.BlockInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	
	public static void registerOreDictionary() {
		OreDictionary.registerOre("treeLeaves", BlockInit.CONIFERLEAVESORANGE);
		OreDictionary.registerOre("treeLeaves", BlockInit.CONIFERLEAVESYELLOW);
		OreDictionary.registerOre("treeSapling", BlockInit.CONIFERSAPLINGORANGE);
		OreDictionary.registerOre("treeSapling", BlockInit.CONIFERSAPLINGYELLOW);
	}
}
