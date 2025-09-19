package semana5;

public class Geometria {
    public double area(double lado){
        return lado * 2;
    }

    public double area(double base, double altura){
        return base * altura;
    }

    public double area(double raio, boolean circulo){
        if(circulo){
            return Math.pow(raio, 2) * 3.14;
        }
        return 0;
    }

    public static void main(String[] Args){
        Geometria geo = new Geometria();
        System.out.println(geo.area(2));
        System.out.println(geo.area(10, 2));
        System.out.println(geo.area(10, true));
    }
}
