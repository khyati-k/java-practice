public class RestrictedSmartPhone extends SmartPhone {

    public RestrictedSmartPhone(String brand) {
        super(brand);
        //TODO Auto-generated constructor stub
    }
    
    // @Override
    private void playGame(String s) {
        System.out.println("Can't play game");
    }
    
}
