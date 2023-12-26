public class CompositeTest {
    public static void main(String args[]){
        Component hardDrive = new Leaf("HDD", 4000);
        Component mouse = new Leaf("Mouse", 500);
        Component monitor = new Leaf("Monitor", 8000);
        Component ram = new Leaf("RAM", 3000);
        Component cpu = new Leaf("CPU", 6000);

        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherBoard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
