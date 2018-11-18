package com.durhack.sharpshot.nodes;

import com.durhack.sharpshot.Bullet;
import com.durhack.sharpshot.Direction;
import com.durhack.sharpshot.INode;
import com.durhack.sharpshot.gui.Triangle;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class NodeIn implements INode {
    private Direction dir = Direction.UP;
    private int index;
    private BigInteger value;

    public NodeIn(int index) {
        this.index = index;
    }
    
    public void setValue(BigInteger value) {
        this.value = value;
    }

    @Override
    public @NotNull Direction getRotation() {
        return dir;
    }

    @Override
    public void rotateClockwise() {
        dir = Direction.clockwiseOf(dir);
    }

    //@Override
    public @NotNull Map<Direction, BigInteger> into(@NotNull BigInteger val) {
        HashMap<Direction, BigInteger> map = new HashMap<>();
        map.put(dir,val);
        return map;
    }
    @Override
    public @NotNull Map<Direction, BigInteger> run(@NotNull Bullet bullet) {
        HashMap<Direction, BigInteger> map = new HashMap<>();
        map.put(dir, value);
        return map;
    }

    @Override
    public @NotNull Node toGraphic() {
        return new Triangle(getRotation(), Color.web("#FFFF00"), "IN" + index);
    }

    public void reset() {   }

    public int getIndex() {
        return index;
    }
}
