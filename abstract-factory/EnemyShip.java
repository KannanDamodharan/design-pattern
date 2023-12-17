public abstract class EnemyShip {
    private String name;
    ESWeapon weapon;
    ESEngine engine;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    abstract void makeShip();
    public String toString(){
        String infoOnShip = "The " + name + " has top speed of " + engine + " and an attack power of " + weapon;
        return infoOnShip;
    }

    public void displayEnemyShip() {
    }

    public void followHeroShip() {
    }

    public void enemyShipShoots() {
    }
}
