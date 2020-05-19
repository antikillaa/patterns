package by.peshkur.patterns.builder.builders;

import by.peshkur.patterns.builder.cars.Manual;
import by.peshkur.patterns.builder.cars.Type;
import by.peshkur.patterns.builder.components.Engine;
import by.peshkur.patterns.builder.components.GPSNavigator;
import by.peshkur.patterns.builder.components.Transmission;
import by.peshkur.patterns.builder.components.TripComputer;

public class CarManualBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setType(Type type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
