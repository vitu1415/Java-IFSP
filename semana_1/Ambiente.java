package semana_1;

public class Ambiente {
    public static void main(String[] args) {
        String env = "PROD";
        if(args.length > 0 && args[0].toUpperCase().equals(env)){
            System.out.printf("semana_1.Ambiente de Produçao");
        } else {
            System.out.printf("semana_1.Ambiente de Desenvolvimento");
        }
    }
}