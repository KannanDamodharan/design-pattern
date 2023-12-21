public abstract class VehicleFactory {

    public MotorVehicle create(){
        MotorVehicle motorVehicle = createVehicle();
        motorVehicle.build();
        return motorVehicle;
    }

    protected abstract MotorVehicle createVehicle();
}
