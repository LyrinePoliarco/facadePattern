class HomeInterface{
    private Light light;
    private TV tv;
    private AirConditioning airconditioning;

    public HomeInterface(Light light, TV tv, AirConditioning airconditioning){

    this.light = light;
    this.tv = tv;
    this.airconditioning = airconditioning;
}
public void turnOnAll(){
    tv.turnOn();
    airconditioning.turnOn();
    light.turnOn();
}
public void turnOffAll(){
    
    tv.turnOff();
    airconditioning.turnOff();
    light.turnOff();
}
}