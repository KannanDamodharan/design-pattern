public class UFOEnemyShipBuilding extends EnemyShipBuilding{

    protected EnemyShip makeEnemyShip(String typeOfShip){
        EnemyShip theEnemyShip = null;

        if(typeOfShip == "UFO"){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        }
        else if(typeOfShip == "UFO BOSS"){
            EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Ship");
            theEnemyShip.setMissile(theEnemyShip.getMissile());
        }
        return theEnemyShip;
    }
}
