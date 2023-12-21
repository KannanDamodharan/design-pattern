public class BikeFactory extends VehicleFactory{
    @Override
    protected MotorVehicle createVehicle() {
        return new Bike();
    }
}
