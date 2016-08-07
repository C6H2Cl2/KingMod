package KingMod.World;

import KingMod.KingBlocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

/**
 * Created by C6H2Cl2 on 2016/08/06.
 */
public class WorldGenKingTree extends WorldGenAbstractTree {
    private final int minTreeHeight = 8;

    public WorldGenKingTree(boolean doBlockNotify) {
        super(doBlockNotify);
    }

    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
        //原木を先に生成
        //木の高さ
        int treeHeight = random.nextInt(10) + minTreeHeight;
        //1<=y<255
        if(y < 1 || y + treeHeight > 255) return false;
        for (int i=-1;i<=1;++i){
            for (int j=-1;j<=1;++j){
                for (int k=0;k<=treeHeight;++k){
                    setBlockAndNotifyAdequately(world,x+i,y+k,z+j, KingBlocks.kingWood,0);
                }
            }
        }
        //ここに葉ブロックの設置処理書いて

        return true;
    }
}
