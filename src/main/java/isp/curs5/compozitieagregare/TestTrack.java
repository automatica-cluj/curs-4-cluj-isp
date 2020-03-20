package isp.curs5.compozitieagregare;

class Engine{
    private boolean status;

    void startStopEngine(){
        status=!status;
        System.out.println("Engine has been "+(status==true?"started":"stopped"));
    }

    public boolean getStatus(){
        return status;
    }
}//.................................................................

class GearBox{
    private int currentGear;

    public GearBox() {
        currentGear = 0;
    }

    void changeUP(){
        if(currentGear<8)
            currentGear++;
        System.out.println("Changing gear. Current = "+currentGear);
    }

    void changeDown(){
        if(currentGear>=0)
            currentGear--;
        System.out.println(" Engine e1 = new Engine();\n" +
                "        GearBox g1 = new GearBox();\n" +
                "        Car c1 = new Car(e1,g1); gear. Current = "+currentGear);
    }

    int getCurrentGear(){
        return currentGear;
    }
}//..................................................................

class Car{
    private Engine engine;
    private GearBox gearBox;
    private int speed;

    public Car(Engine engine, GearBox gearBox) {
        this.engine = engine;
        this.gearBox = gearBox;
    }

    public void startCar(){
        if(engine.getStatus()==false){
            System.out.println("Starting car...");
            engine.startStopEngine();
            gearBox.changeUP();
        }else{
            System.out.println("Car is already started!");
        }
    }

}//.................................................................

class CarFactory{
    public Car createCar(){
        Engine e1 = new Engine();
        GearBox g1 = new GearBox();
        Car c1 = new Car(e1,g1);
        return c1;
    }
}

public class TestTrack {
    public static void main(String[] args) {
//        Engine e1 = new Engine();
//        GearBox g1 = new GearBox();
//        Car c1 = new Car(e1,g1);
//
//        c1.startCar();
//
//        Car c2 = new Car(e1,g1);

        CarFactory f = new CarFactory();

        Car x1 = f.createCar();

        x1.startCar();
       // Car x2 = f.createCar();

    }
}//..................................................................
