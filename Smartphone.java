public class Smartphone extends Computer{
    boolean hasCase;
    public Smartphone(int battery, boolean powerOn, String model, boolean hasCase){
        super(battery, powerOn, model);
        this.hasCase = hasCase;
    }

    @Override
    public void runProgram() {
        System.out.println("alarm app is running");
    }

    @Override
    public void openBrowser() {
        System.out.println("opening Safari");
    }

    public void downloadApp(){
        System.out.println("app downloading");
    }
}