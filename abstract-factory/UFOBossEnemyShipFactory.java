public class UFOBossEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }

    /*@Override
    public ESMissile addESEngine() {
        return new ESUFOBossMissile();
    }*/
}
