package ar.edu.ge.meli.soldier;

public class Soldier {
    public Double blood; // cm3
    public Integer bulletHoles;
    public SoldierHealthState healthState;

    public Soldier() {
        blood = 1000.0;
        bulletHoles = 0;
        healthState = new SoldierHealthyState();
    }

    public void getShot() {
        healthState.soldierReceivedBullet(this);
    }

    public void receiveHealing() {
        healthState.soldierReceivedHealing(this);
    }

    public boolean isHurt() {
        return healthState.getClass() == SoldierHurtState.class;
    }

    public boolean isDead() {
        return healthState.getClass() == SoldierDeadState.class;
    }

    public boolean isHealthy() {
        return healthState.getClass() == SoldierHealthyState.class;
    }
}
