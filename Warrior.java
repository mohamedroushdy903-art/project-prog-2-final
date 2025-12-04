package com.example.game;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Warrior extends com.example.game.Fighter {
    public Warrior(double x, double y, Pane root, com.example.game.Weapon startingWeapon) {
        super(x, y, root, Color.RED, startingWeapon);
    }

    @Override
    public com.example.game.Projectile shoot(double dirX, Pane root) {
        double px = getX() + width / 2.0 + dirX * (width / 2.0 + 2);
        double py = getY() + height / 2.0;
        double speed = weapon.getProjectileSpeed() * dirX;
        return new com.example.game.Projectile(px, py, speed, 0, weapon, root, Color.DARKRED, 6);
    }
}
