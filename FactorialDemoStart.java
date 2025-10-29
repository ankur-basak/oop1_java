public class FactorialDemoStart{
    public static void main(String[] args){

        FactorialDemo fd = new FactorialDemo();
        int result = fd.fact(5);
        System.out.println("Factorial: " + result);

        result = fd.fact(4);
        System.out.println("Factorial: " + result);
    }
}
