package KingMod.Block;

import KingMod.KingMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by C6H2Cl2 on 2016/08/04.
 */
public class SampleWood extends BlockLog {
    int num;
    public SampleWood(int n){
        super();
        setBlockName("KingWood_"+n);
        setCreativeTab(KingMod.tabKingMod);
        num = n;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        this.field_150167_a = new IIcon[1];
        this.field_150166_b = new IIcon[1];
        this.field_150167_a[0] = register.registerIcon("kingmod:" + "KingWood_" + num);
        this.field_150166_b[0] = register.registerIcon("kingmod:" + "KingWood_" + num + "_top");
    }

    @Override
    public int onBlockPlaced(World p_149660_1_, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
    {
        int j1 = p_149660_9_ & 3;
        byte b0 = 0;

        switch (p_149660_5_)
        {
            case 0:
            case 1:
                b0 = 0;
                break;
            case 2:
            case 3:
                b0 = 8;
                break;
            case 4:
            case 5:
                b0 = 4;
        }

        return j1 | b0;
    }
}
