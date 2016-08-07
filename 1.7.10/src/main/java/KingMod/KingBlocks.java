package KingMod;

import KingMod.Block.BlockKingSapling;
import KingMod.Block.BlockKingWood;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by C6H2Cl2 on 2016/08/04.
 */
public class KingBlocks {
    public static final BlockKingWood kingWood = new BlockKingWood();
    public static final BlockKingSapling kingSapling = new BlockKingSapling();

    static void registerBlocks(){
        GameRegistry.registerBlock(kingWood,kingWood.getUnlocalizedName());
        GameRegistry.registerBlock(kingSapling,kingSapling.getUnlocalizedName());
    }
}
