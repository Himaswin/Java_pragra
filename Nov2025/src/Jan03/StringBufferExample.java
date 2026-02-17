package Jan03;

public class StringBufferExample {
    public static void main(String[] args) {
        String s = "ABC";
//        String ss = "Pragra";
//        ss.concat(" Inc");
//        System.out.println(ss);
        StringBuilder sb = new StringBuilder("Pragra");
//        sb.append(" Inc");
//        System.out.println(sb);
//
        StringBuffer strb = new StringBuffer("Pragra");
//        strb.append(" Inc");
//        System.out.println(strb);

        long StartTime = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            sb.append(i);
        }
        long EndTime = System.nanoTime();
        System.out.println(EndTime-StartTime + "ns\n");

        long StartTime1 = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            strb.append(i);
        }
        long EndTime1 = System.nanoTime();
        System.out.println(EndTime1-StartTime1 + "ns\n");

        long StartTime2 = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            s += i;
        }
        long EndTime2 = System.nanoTime();
        System.out.println(EndTime2-StartTime2 + "ns\n");


    }
}
