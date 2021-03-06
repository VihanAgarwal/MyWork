package edu.macalester.comp124.breakout;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.util.RandomGenerator;

import java.awt.*;

/**
 * Created by Vihan on 3/6/2016.
 */
public class Brick extends GRect{

    private static final double BRICK_HEIGHT=25;
    private static final double BRICK_WIDTH=67.5;

    /**
     * Constructor that creates a new brick
     */
    public Brick(){
        super(BRICK_WIDTH,BRICK_HEIGHT);
        RandomGenerator rgen = new RandomGenerator();
        Color brickColor = rgen.nextColor();
        setColor(brickColor);
        setFilled(true);
        setFillColor(brickColor);
    }

    /**
     * Getter for the brick height
     * @return the brick height
     */
    public static double getBrickHeight() {
        return BRICK_HEIGHT;
    }

    /**
     * Getter for the brick width
     * @return the brick width
     */
    public static double getBrickWidth() {
        return BRICK_WIDTH;
    }
}
