package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
//        char ch = '"';
//        char ch1 = '"';
//        char ch2 = '"';
//        System.out.print(ch1);
//        System.out.print(ch2);
//        System.out.println(ch);
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j <= i) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        System.out.print(ch1);
//        System.out.print(ch2);
//        System.out.println(ch);
    }
}
