package furniture;

public class AbstractFactoryMain {
    public static void main(String args[]){
        FurnitureFactory factory = new ModernFurnitureFactory();
        factory.crateChair().sitOn();
        factory.createSofa().relaxOn();
    }
}
