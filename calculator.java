public class calculator{

    public calculator(){

    }
    
    public int add(int a, int b){
        return a + b;
    }

    public int substraction(int a, int b){
        return a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public int division(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {

        calculator myCalculator = new calculator();
        int a = myCalculator.add(7, 6);
        int s = myCalculator.substraction(80, 10);
        int m = myCalculator.multiplication(100, 5);
        int d = myCalculator.division(850, 5);

        System.out.println(a);
        System.out.println(s);
        System.out.println(m);
        System.out.println(d);

    }



}
