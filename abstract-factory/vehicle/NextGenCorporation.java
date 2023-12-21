public class NextGenCorporation extends Corporation{
    @Override
    public MotorVehicle createBike() {
        return new NextGenBike();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new NextGenElectricCar();
    }
}
