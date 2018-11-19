package com.durhack.sharpshot.nodes.routing;

import com.durhack.sharpshot.gui.Triangle;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import org.jetbrains.annotations.NotNull;

public class IfPositiveNode extends ConditionalNode {
    @Override
    public boolean branchingCondition(int signum) {
        return (signum == 1);
    }

    @Override
    public String toString() {
        return "Branch if Positive";
    }

    @Override
    public @NotNull Node toGraphic() {
        return new Triangle(getRotation(), Color.web("#FF9900"), ">0");
    }
}
