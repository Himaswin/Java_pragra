package Feb12;


@FunctionalInterface
public interface ICalculator {

    int add(int a , int b);

    static int sum(int a, int b){
        return 0;
    }
    int a = 10;

    default void printName(){

    }
}


