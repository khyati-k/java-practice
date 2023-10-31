public class PhoneLauncher {

    public void launch() {
        SmartPhone phone = new SmartPhone("nokia");
        //oldphone
        phone.getBrand();
        phone.call("001234");
        //mobile phone
        phone.ringAlarm("wake up");
        phone.playGame();
        phone.printLastNumbers();
        //SmartPhone
        phone.browseWeb("google");
        phone.findPosiition();

    }
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }    
}
