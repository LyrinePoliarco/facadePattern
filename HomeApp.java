class HomeApp {
private HomeInterface homeInterface;

public HomeApp(HomeInterface homeinterface){
    this.homeInterface = homeinterface;
}
public void activateAllServices(){
    System.out.println("");
    homeInterface.turnOnAll();
}
public void deactivateAllServices(){
    System.out.println("");
    homeInterface.turnOffAll();
}

public static void main (String args[]){ 
Light light = new Light();
TV tv = new TV();
AirConditioning airconditioning = new AirConditioning();
HomeInterface homeInterface = new HomeInterface(light, tv, airconditioning);
HomeApp homeApp = new HomeApp(homeInterface); 
homeApp.activateAllServices();
homeApp.deactivateAllServices();
}
}