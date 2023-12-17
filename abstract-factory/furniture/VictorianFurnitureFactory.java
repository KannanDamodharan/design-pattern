package furniture;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair crateChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
