package Dec20;

public class StaticVar {

    // when we say the static it belongs to the class and shared varible
    static int count = 10;//shared memory- optmized memory
    int count2 = 10;

    StaticVar(){
        System.out.print(count + " ");
        System.out.print(count2 +"\n");
        count++;
        count2++;
    }

    public static void main(String[] args) {
        new StaticVar(); // count2 belongs to this only then new copy is generated for other objects
        new StaticVar();
        new StaticVar();

    }
}
