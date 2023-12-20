public abstract class EnemyShip {
    private String name;
    ESWeapon weapon;
    ESEngine engine;

    ESMissile missile;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public ESMissile getMissile(){
         return new ESUFOBossMissile();
    }

    public void setMissile(ESMissile esMissile){
        missile = esMissile;
    }

    abstract void makeShip();
    public String toString(){
        String infoOnShip = "The " + name + " has top speed of " + engine + " and an attack power of " + weapon + " Missile "
                + missile;
        return infoOnShip;
    }

    public void displayEnemyShip() {
    }

    public void followHeroShip() {
    }

    public void enemyShipShoots() {
    }
}
