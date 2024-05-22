interface bicycle{
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);

}
// to use interfaces, the class name must change
//all methods defined in interfaces must appear in the class's source code or implementation will fail
class ACMEBicycle{
    int gears=1;
    int speed=0;
    int cadence=0;
    void changeCadence(int newValue){
        cadence = newValue;
    }
    void changeGear(int newValue){
        gears = newValue;
    }
    void speedUp(int increment){
        speed=speed+increment;
    }
    void applyBrakes(int decrement){
        speed=speed-decrement;
    }
    void printStates(){
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gears);
    }
}
//interfaces promise a behaviour that the class will provide