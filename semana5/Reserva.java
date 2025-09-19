package semana5;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String nome;
    private int noites;
    private int pessoas;
    private boolean cafeIncluso;

    private static List<String> mensagem = new ArrayList<>();

    public Reserva(){ }

    public Reserva(String nome){
        this.nome = nome;
        efetuarAReserva("RESERVA = NOME: " + nome);
    }

    public Reserva(String nome, int noites){
        this.nome = nome;
        this.noites = noites;
        efetuarAReserva("RESERVA = NOME: " + nome + " NOITES: " + noites);
    }

    public Reserva(String nome, int noites, int pessoas){
        this.nome = nome;
        this.noites = noites;
        this.pessoas = pessoas;
        efetuarAReserva("RESERVA = NOME: " + nome + " NOITES: " + noites + " PESSOAS: " + pessoas);
    }

    public Reserva(String nome, int noites, int pessoas, boolean cafeIncluso){
        this.nome = nome;
        this.noites = noites;
        this.pessoas = pessoas;
        this.cafeIncluso = cafeIncluso;
        efetuarAReserva("RESERVA = NOME: " + nome + " NOITES: " + noites + " PESSOAS: " + pessoas + " CAFE INCLUSO: " + cafeIncluso);
    }

    public List<String> efetuarAReserva(String valores){
        mensagem.add(valores);
        return mensagem;
    }

    public static List<String> getMensagem() {
        return mensagem;
    }

    public static void main(String[] args){
        Reserva reserva1 = new Reserva("Vitor");
        Reserva reserva2 = new Reserva("Vitor 2", 2);
        Reserva reserva3 = new Reserva("Vitor 3", 3, 3);
        Reserva reserva4 = new Reserva("Vitor 4", 2, 4, true);

        System.out.println(Reserva.getMensagem());
    }
}
