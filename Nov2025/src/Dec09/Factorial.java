package Dec09;

public class Factorial {
    public static void main(String[] args) {
        int res = 1;
        for(int i = 5; i >=1; i--){
            res *=i;
        }
        System.out.println(res);
    }
}
