public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
        //TODO Auto-generated constructor stub
    }

    public void browseWeb(String s) {
        System.out.println("browsing web "+ s);
    }

    public String findPosiition() {
        return "00.00N 00.00W";
    }

    // @Override
    public void playGame() {
        System.out.println("overriding and playing game");
    }
    
    @Override
    public void call(String number) {
        if(number.startsWith("00")) {
            System.out.println("calling "+ number +" through the internet to save money");
        } else {
            super.call(number);
        }
    }
}
