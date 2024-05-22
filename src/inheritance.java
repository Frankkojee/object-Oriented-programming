public class inheritance {
    
}
class bicycle{
    int cadence=0;
    int gear=1;
    int speed=0;
    void changeCadence(int newValue){
        cadence=newValue;
    }
    void changeGear(int newValue){
        gear=newValue;
    }
    void speedUp(int increment){
        speed=speed+increment;
    }
    void applyBrakes(int decrement){
        speed=speed-decrement;
    }
    void printStates(){
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
class MountainBike extends bicycle{
    String handlebarShape= "straight";
    int gears=8;
    void handlebarShape(String shape){
        handlebarShape=shape;
    }
}
class tandemBike extends bicycle{
    int pedalsNumber=4;
    void pedalsNumber(int NumPedals){
        System.out.println("Number of pedals in tandem is 4");
    }
}