package com.example.game;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Archer extends com.example.game.Fighter {
    public Archer(double x, double y, Pane root, com.example.game.Weapon startingWeapon) {
        super(x, y, root, Color.GREEN, startingWeapon);
    }

    @Override
    public com.example.game.Projectile shoot(double dirX, Pane root) {
        double px = getX() + width / 2.0 + dirX * (width / 2.0 + 3);
        double py = getY() + height / 2.0;
        double speed = weapon.getProjectileSpeed() * dirX;
        return new com.example.game.Projectile(px, py, speed, 0, weapon, root, Color.LIGHTGREEN, 5);
    }
}
