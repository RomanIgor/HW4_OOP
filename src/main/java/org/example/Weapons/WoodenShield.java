package org.example.Weapons;

import java.util.Random;

public class WoodenShield implements Shield {
    @Override
    public int getProtection() {
        return new Random().nextInt(2, 20);
    }

    @Override
    public String toString() {
        return "WoodenShield";
    }
}
