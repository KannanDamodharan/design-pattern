public class FutureCompanyCorporation extends Corporation{
    @Override
    public MotorVehicle createBike() {
        return new FutureCompanyBike();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new FutureCompanyElectricCar();
    }
}
