public abstract class Computer {
    int battery;
    boolean powerOn;
    String model;

    public Computer(int battery, boolean powerOn, String model){
        this.battery = battery;
        this.powerOn = powerOn;
        this.model = model;
    }

    public abstract void runProgram();

    public abstract void openBrowser();
}
