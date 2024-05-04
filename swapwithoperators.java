public class swapwithoperators {
    public static void main(String[] args) {
    int a = 5;
    int b= 8;
    System.out.println("value of a before swap :"+a);System.out.println("value of b before swap:"+b);


    a=a+b;b=a-b;a=a-b;

    System.out.println("value of a after swap :"+a);System.out.println("value of b after swap:"+b);

    }
}
