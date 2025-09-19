package semana5;

public class Calculadora {

    public int multiplica(int a, int b){
        return a * b;
    }

    public double multiplica(double a, double b){
        return a * b;
    }

    public int multiplica(int... nums){
        int total = 1;
        for(int i = 0; i< nums.length; i++){
            total = total * nums[i];
        }
        return total;
    }

    public static void main(String[] Args){
        Calculadora calc = new Calculadora();
        System.out.println(calc.multiplica(2, 4));
        System.out.println(calc.multiplica(2.5, 4.2));
        System.out.println(calc.multiplica(2, 4, 2, 4));
    }
}
