public class ServiceStation {
    public void check(Car car) {
        if (car != null) {
            internalCheck(car);
            car.checkEngine();
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            internalCheck(truck);
            truck.checkEngine();
            truck.checkTrailer();

        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            internalCheck(bicycle);
            bicycle.updateTyre();
        }
    }

    public void internalCheck(Machine machine) {
        System.out.println("Обслуживаем " + machine.getModelName());
        for (int i = 0; i < machine.getWheelsCount(); i++) {
            machine.updateTyre();

        }
    }
}