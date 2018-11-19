package com.durhack.sharpshot.nodes;

import com.durhack.sharpshot.Bullet;
import com.durhack.sharpshot.Direction;
import com.durhack.sharpshot.INode;
import com.durhack.sharpshot.gui.App;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class HaltNode implements INode {
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
    public String toString() {
        return "Halt";
    }

    @Override
    public @NotNull Map<Direction, BigInteger> run(@NotNull Bullet bullet) {
        // halt checking is done within Container
        return new HashMap<>();
    }

    @Override
    public @NotNull Node toGraphic() {
        Rectangle rectangle = new Rectangle(32.0, 32.0, Color.GHOSTWHITE);
        Label label = new Label("HLT");
        return new StackPane(rectangle, label);
    }

    public void reset() {}
}
