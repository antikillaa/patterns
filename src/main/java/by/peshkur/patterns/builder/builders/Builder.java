package by.peshkur.patterns.builder.builders;

import by.peshkur.patterns.builder.cars.Type;
import by.peshkur.patterns.builder.components.Engine;
import by.peshkur.patterns.builder.components.GPSNavigator;
import by.peshkur.patterns.builder.components.Transmission;
import by.peshkur.patterns.builder.components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
