package KingMod.Block;

import KingMod.KingMod;
import KingMod.World.WorldGenKingTree;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.event.terraingen.TerrainGen;

import java.util.List;
import java.util.Random;

/**
 * Created by C6H2Cl2 on 2016/08/04.
 */
public class BlockKingSapling extends BlockSapling {
    private IIcon IconSapling;
    public BlockKingSapling(){
        super();
        setCreativeTab(KingMod.tabKingMod);
        setBlockName("KingSapling");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return IconSapling;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register){
        IconSapling = register.registerIcon("kingmod:KingWoodSapling");
    }

    @Override
    public void func_149879_c(World world, int x, int y, int z, Random random){
        int l = world.getBlockMetadata(x,y,z);
        if((l & 8) == 0){
            l = l|8;
            world.setBlockMetadataWithNotify(x,y,z,l,4);
        }else {
            growTree(world, x, y, z, random);
        }
    }

    private void growTree(World world, int x, int y, int z, Random random){
        if(!TerrainGen.saplingGrowTree(world,random,x,y,z)) return;
        int meta = world.getBlockMetadata(x,y,z);
        WorldGenKingTree kingTree = new WorldGenKingTree(true);
        kingTree.generate(world, random, x, y, z);
    }
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_){
        p_149666_3_.add(new ItemStack(p_149666_1_,1,0));
    }
}
