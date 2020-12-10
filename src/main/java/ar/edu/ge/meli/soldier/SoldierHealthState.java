package ar.edu.ge.meli.soldier;

public interface SoldierHealthState {
    public void soldierReceivedBullet(Soldier soldier);
    public void soldierReceivedHealing(Soldier soldier);
}
