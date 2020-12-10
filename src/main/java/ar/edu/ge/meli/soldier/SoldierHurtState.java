package ar.edu.ge.meli.soldier;

public class SoldierHurtState implements SoldierHealthState {
    @Override
    public void soldierReceivedBullet(Soldier soldier) {
        soldier.blood = 0.0;
        soldier.bulletHoles = soldier.bulletHoles + 1;
        soldier.healthState = new SoldierDeadState();
    }

    @Override
    public void soldierReceivedHealing(Soldier soldier) {
        soldier.bulletHoles = soldier.bulletHoles - 1;
        soldier.healthState = new SoldierHealthyState();
    }
}
