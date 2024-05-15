package MultilevelInheritance;

public class Driver extends ford{
    @Override
    public  void car(){
        System.out.println("driver class");
    }
    public static void main(String [] args){
        Driver d = new Driver();
        d.car();
    }
}
