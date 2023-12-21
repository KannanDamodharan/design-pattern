public class CarFactory extends VehicleFactory{
    @Override
    protected MotorVehicle createVehicle() {
        return new Car();
    }
}
