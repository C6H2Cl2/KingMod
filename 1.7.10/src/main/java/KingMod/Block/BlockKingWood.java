package KingMod.Block;

import KingMod.KingMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by C6H2Cl2 on 2016/08/04.
 */
public class BlockKingWood extends BlockLog {
    public BlockKingWood(){
        super();
        setCreativeTab(KingMod.tabKingMod);
        setBlockName("KingWood");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        this.field_150167_a = new IIcon[1];
        this.field_150166_b = new IIcon[1];
        this.field_150167_a[0] = register.registerIcon("kingmod:" + "KingWood");
        this.field_150166_b[0] = register.registerIcon("kingmod:" + "KingWood" + "_top");
    }
}
