package com.durhack.sharpshot.nodes.routing;

import com.durhack.sharpshot.Bullet;
import com.durhack.sharpshot.Direction;
import com.durhack.sharpshot.INode;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class RotateNode implements INode {
    private Direction dir = Direction.UP;

    @Override
    public @NotNull Direction getRotation() {
        return dir;
    }

    @Override
    public void rotateClockwise() {
        dir = Direction.clockwiseOf(dir);
    }

    @Override
    public @NotNull Map<Direction, BigInteger> run(@NotNull Bullet bullet) {
        HashMap<Direction, BigInteger> map = new HashMap<>();
        map.put(bullet.getDirection().clockwise(), bullet.getValue());
        return map;
    }

    @Override
    public String toString() {
        return "Rotate Clockwise";
    }

    @Override
    public @NotNull Node toGraphic() {
        Rectangle rectangle = new Rectangle(32.0, 32.0, Color.PALEVIOLETRED);
        Label label = new Label("CW");
        return new StackPane(rectangle, label);
    }

    public void reset() {}
}
