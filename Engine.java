
public class Engine {
    private double mileage;
    private boolean started;
    private double engineVolume;
    
    public Engine(double mileage) {
        this.mileage = mileage;
        this.engineVolume = 1.5;
    }

    public Engine(double mileage, double engineVolume){
        this.mileage = mileage;
        this.engineVolume = engineVolume;
    }

    public double getSpentFuel(){
        return mileage * (engineVolume * 3);
    }

    public double getSpentFuel(double forLastMiles){
        return forLastMiles * (engineVolume * 3);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getMileage() {
        return mileage;
    }
    
    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }
    
    public boolean isStarted() {
        return started;
    }
    
    public void turnOn() {
        started = true;
    }
    
    public void turnOff() {
        started = false;
    }
}
