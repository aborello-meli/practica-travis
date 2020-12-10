package ar.edu.ge.meli;

import ar.edu.ge.meli.soldier.Soldier;
import ar.edu.ge.meli.soldier.SoldierDeadState;
import ar.edu.ge.meli.soldier.SoldierHealthyState;
import ar.edu.ge.meli.soldier.SoldierHurtState;
import org.junit.Assert;
import org.junit.Test;

public class TestSoldier {
    @Test
    public void soldierGetsShotOnceAgain() {
        Double expectedBlood = 800.0;
        Integer expectedBulletHoles = 1;
        Soldier soldier = new Soldier();

        soldier.getShot();

        Assert.assertEquals(expectedBlood, soldier.blood);
        Assert.assertEquals(true, soldier.isHurt());
        Assert.assertEquals(expectedBulletHoles, soldier.bulletHoles);
    }

    @Test
    public void soldierGetsShotOnce() {
        Double expectedBlood = 900.0;
        Integer expectedBulletHoles = 1;
        Soldier soldier = new Soldier();

        soldier.getShot();

        Assert.assertEquals(expectedBlood, soldier.blood);
        Assert.assertEquals(true, soldier.isHurt());
        Assert.assertEquals(expectedBulletHoles, soldier.bulletHoles);
    }

    @Test
    public void soldierGetsShotTwice() {
        Double expectedBlood = 0.0;
        Integer expectedBulletHoles = 2;
        Soldier soldier = new Soldier();

        soldier.getShot();
        soldier.getShot();

        Assert.assertEquals(expectedBlood, soldier.blood);
        Assert.assertEquals(expectedBulletHoles, soldier.bulletHoles);
        Assert.assertEquals(true, soldier.isDead());
    }

    @Test
    public void soldierGetsShotAndThenIsHealed() {
        Double expectedBlood = 900.0;
        Soldier soldier = new Soldier();
        Integer expectedBulletHoles = 0;

        soldier.getShot();
        soldier.receiveHealing();

        Assert.assertEquals(expectedBlood, soldier.blood);
        Assert.assertEquals(true, soldier.isHealthy());
        Assert.assertEquals(expectedBulletHoles, soldier.bulletHoles);
    }

    @Test
    public void soldierGetsShotTwiceAndThenIsHealed() {
        Double expectedBlood = 900.0;
        Integer expectedBulletHoles = 0;
        Soldier soldier = new Soldier();

        soldier.getShot();
        soldier.receiveHealing();

        Assert.assertEquals(expectedBlood, soldier.blood);
        Assert.assertEquals(true, soldier.isHealthy());
        Assert.assertEquals(expectedBulletHoles, soldier.bulletHoles);
    }
}
