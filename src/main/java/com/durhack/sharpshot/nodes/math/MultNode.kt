package com.durhack.sharpshot.nodes.math

import com.durhack.sharpshot.gui.Triangle
import javafx.scene.Node
import javafx.scene.paint.Color

import java.math.BigInteger

class MultNode : MathNode() {

    public override fun operation(val1: BigInteger, val2: BigInteger): BigInteger? {
        return val1.multiply(val2)
    }

    override fun toString(): String {
        return "Multiply"
    }

    override fun toGraphic(): Node {
        return Triangle(rotation, Color.web("#8df8e6"), "x")
    }
}