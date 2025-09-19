package semana_1;

public class IncrExplo {
    public static void main ( String[] args )
    {
        int a, b, c;
        b = c = 10;
        a = b++ + b++;
        System.out.println("valor de a = " + a );
        System.out.println("valor de b = " + b );
        a = ++c + ++c;
        System.out.println("valor de a = " + a );
        System.out.println("valor de c = " + c );
        a = 10;
        b = 5;
        boolean x = a > b || b++ > 3;
        System.out.println("valor de x = " + x );
        System.out.println("valor de b = " + b );
        a = b++ + b;
        System.out.println("valor de a = " + a );
        System.out.println("valor de b = " + b );
    }
}
