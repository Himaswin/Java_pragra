
@FunctionalInterface


interface CustomPublisher{
    void publishName(String name);// abstract method
    default void publishEmail(String email){ // default method
        System.out.println("Default Publisher");
    }
}

interface Game{
    String drawGame(String team1, String team2);
}
interface Summarize{
    double summarize(double a, double b);
}
public class Runner {
    public static void main(String[] args){
        CustomPublisher publisher = (String name)->{System.out.println("Anonymous publisher " + name);};
        Game g = (t1, t2)->{return Math.random() > 0.5? t1: t2;};
        Summarize s = (a, b) ->{return a>b?a:b;};
        publisher.publishName("John");
        System.out.println("Winner is " + g.drawGame("john", "jane"));
        System.out.println("Greater is " + s.summarize(4.76, 4.67));
    }
}

