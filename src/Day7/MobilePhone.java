public class MobilePhone extends OldPhone {
    public MobilePhone(String brand) {
        super(brand);
        //TODO Auto-generated constructor stub
    }

    private int[] lastTenNumbers = {};
    public void ringAlarm(String s) {
        System.out.println("ringing alarm" + s);
    }

    private void playGame(String s) {
        System.out.println("playin game" + s);
    }

    public void printLastNumbers() {
        System.out.println(lastTenNumbers);
    }
}