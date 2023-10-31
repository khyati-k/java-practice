public class PhoneLauncher {

    public void launch() {
        SmartPhone phone = new SmartPhone("nokia");
        phone.browseWeb("google");
        phone.call("001234");
    }
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }    
}
