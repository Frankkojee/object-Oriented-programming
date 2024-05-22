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
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //create two objects
        bicycle bike1=new bicycle();
        bicycle bike2=new bicycle();

        //invoke the methods on those two objects
        bike1.changeCadence(50);
        bike1.printStates();
        bike2.changeCadence(20);
        bike2.printStates();      
    }
}//classes and objects
