package Jan03;

public class StringExample {
    public static void main(String[] args) {
        char[] arr = {'p', 'r', 'a', 'g', 'a'};

        String s = "pragra";
        String ns = "";

        for(int i = s.length()-1; i >=0; i--){
            ns  += s.charAt(i);
        }
        System.out.println(ns);

//        for(char c : arr){
//            System.out.println(c);
//        }
    }
}
