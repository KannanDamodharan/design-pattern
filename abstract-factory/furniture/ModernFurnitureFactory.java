package furniture;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair crateChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
