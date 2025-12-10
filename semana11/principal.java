package semana11;

import java.util.Random;

import static java.lang.String.join;
import static java.lang.Thread.sleep;

class MinhaThread extends Thread{
    public void run(){
        try{
            for(int i =0; i < 5; i++) {
                System.out.println("executando a t1: " + (1 + i));
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("error t1: "+e.getMessage());
        }
    }
}

class MinhaThread2 extends Thread{
    public void run(){
        try{
            for(int i =0; i < 8; i++) {
                System.out.println("executando a t2: " + (i+1));
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("error t1: "+e.getMessage());
        }
    }
}

class Corrida{
    private int chegada = 0;

    public int getChegada(){
        return chegada;
    }

    public int getAndIncrement(){
        return chegada++;
    }
}

public class principal {
    public static void main(String [] args) throws InterruptedException{
        int chegada = 1;
        Random random = new Random();
        Corrida corrida = new Corrida();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int voltas = random.nextInt(10) + 1;
                for(int i = 0; i < voltas; i++) {
                    System.out.println("t1 na volta: " + (i+1));
                }
                corrida.getAndIncrement();
                System.out.println("t1 chogou em " + corrida.getChegada());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int voltas = random.nextInt(10) + 1;
                for(int i = 0; i < voltas; i++) {
                    System.out.println("t2 na volta: " + (i+1));
                }
                corrida.getAndIncrement();
                System.out.println("t2 chogou em " + corrida.getChegada());
            }
        });

        Thread t3 = new Thread(new Runnable(){
            public void run(){
                int voltas = random.nextInt(10) + 1;
                for(int i = 0; i < voltas; i++) {
                    System.out.println("t3 na volta: " + (i+1));
                }
                corrida.getAndIncrement();
                System.out.println("t3 chogou em " + corrida.getChegada());
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("terminou a corrida");
    }
}
