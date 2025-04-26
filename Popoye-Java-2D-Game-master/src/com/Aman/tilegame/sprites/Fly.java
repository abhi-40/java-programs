/*
 * This file is part of the Popoye Java 2D Game.
 * 
 * Description: Defines behavior for the flying enemy type.
 * 
 * Author: Original Author (if known)
 * Date: (Add date if needed)
 */

package com.Aman.tilegame.sprites;

import com.Aman.graphics.Animation;

/**
    A Fly is a Creature that fly slowly in the air.
*/
public class Fly extends Creature {

    public Fly(Animation left, Animation right,
        Animation deadLeft, Animation deadRight)
    {
        super(left, right, deadLeft, deadRight);
    }


    public float getMaxSpeed() {
        return 0.2f;
    }


    public boolean isFlying() {
        return isAlive();
    }

}
