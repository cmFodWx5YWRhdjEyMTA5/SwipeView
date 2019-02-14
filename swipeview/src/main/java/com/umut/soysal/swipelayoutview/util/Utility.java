package com.umut.soysal.swipelayoutview.util;

public class Utility
{
    /**
     * stack view default count
     */
    public static final int DEFAULT_SHOW_ITEM = 3;
    /**
     * Default scale
     */
    public static final float DEFAULT_SCALE = 0.1f;
    /*
    * When the stack Y axis offset is calculated according to chapter 14
    *
    * */
    public static final int DEFAULT_TRANSLATE_Y = 14;
    /**
     * Bending angle of the card by default when the stack is shifting
     */
    public static final float DEFAULT_ROTATE_DEGREE = 15f;
    /**
     * Bending angle of the card by default when the stack is shifting
     */
    public static final int SWIPING_NONE = 1;
    /**
     * when the stack item is shifted to the left
     */
    public static final int SWIPING_LEFT = 1 << 2;
    /**
     * when the stack item is shifted to the rigt
     */
    public static final int SWIPING_RIGHT = 1 << 3;
    /**
     * heap slides out from left
     */
    public static final int SWIPED_LEFT = 1;
    /**
     * heap slides out from right
     */
    public static final int SWIPED_RIGHT = 1 << 2;

}
