package ar.edu.ge.meli.soldier;

public class SoldierDeadState implements SoldierHealthState {
    @Override
    public void soldierReceivedBullet(Soldier soldier) {
        soldier.bulletHoles = soldier.bulletHoles + 1;
    }

    @Override
    public void soldierReceivedHealing(Soldier soldier) {
        soldier.bulletHoles = 0;
        soldier.blood = 1000.0;
        soldier.healthState = new SoldierHealthyState();
    }
}
