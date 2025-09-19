package semana5;

public class Logger {

    public String log(String msg){
        return String.format(msg);
    }

    public String log(String msg, int nivel){
        return String.format("mensagem = "+ msg + " nivel = "+nivel);
    }

    public String log(String msg, Throwable t){
        return String.format("mensagem = "+msg+" throw = "+t.getMessage());
    }

    public String log(String format, Object... args){
        String teste = String.format("mensagem = "+format +", args = ");
        for(int i = 0; i<args.length; i++){
            teste = (teste + ", args: " + args[i]);
        }
        return teste;
    }

    public static void main(String[] Args) {
        Logger logger = new Logger();
        System.out.println(logger.log("teste aqui"));
        System.out.println(logger.log("teste aqui 2", 2));
        try {
            int erro = 1000 / 0;
        } catch (Exception e) {
            System.out.println(logger.log("teste aqui 3", e.getMessage()));
        }
        System.out.println(logger.log("teste aqui 4", "teste 1", "teste 2", "teste 3"));
    }
}
