package ar.edu.ge.meli.soldier;

public class SoldierHealthyState implements SoldierHealthState {
    @Override
    public void soldierReceivedBullet(Soldier soldier) {
        soldier.bulletHoles = soldier.bulletHoles + 1;
        soldier.blood = soldier.blood - 100;
        soldier.healthState = new SoldierHurtState();
    }

    @Override
    public void soldierReceivedHealing(Soldier soldier) {
        // do nothing
    }
}
