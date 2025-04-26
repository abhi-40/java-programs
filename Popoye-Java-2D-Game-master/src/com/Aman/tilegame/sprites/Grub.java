/*
 * This file is part of the Popoye Java 2D Game.
 * 
 * Description: Defines behavior for the grub enemy type.
 * 
 * Author: Original Author (if known)
 * Date: (Add date if needed)
 */

package com.Aman.tilegame.sprites;

import com.Aman.graphics.Animation;

/**
    A Grub is a Creature that moves slowly on the ground.
*/
public class Grub extends Creature {

    public Grub(Animation left, Animation right,
        Animation deadLeft, Animation deadRight)
    {
        super(left, right, deadLeft, deadRight);
    }


    public float getMaxSpeed() {
        return 0.05f;
    }

}
