public class Laptop extends Computer{
    boolean rgbKeyboard;
    public Laptop(int battery, boolean powerOn, String model, boolean rgbKeyboard){
        super(battery, powerOn, model);
        this.rgbKeyboard = rgbKeyboard;
    }

    @Override
    public void runProgram() {
        System.out.println("game is running");
    }

    @Override
    public void openBrowser() {
        System.out.println("opening Chrome");
    }

    public void downloadGame(){
        System.out.println("game is downloading");
    }
}