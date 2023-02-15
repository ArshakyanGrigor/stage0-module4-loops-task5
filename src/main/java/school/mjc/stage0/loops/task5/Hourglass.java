package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int k = height;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else if (j >= k) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            }
            System.out.println();
            if (i == (height - 1) / 2) {
                break;
            }
            k--;
        }
        for (int i = 1; i < height / 2 + 1; i++) {
            for (int n = (height / 2) - i; n > 0; n--) {
                System.out.print(" ");
            }
            if (height % 2 == 0) {
                for (int m = 0; m <= ((2 * i) - 1); m++) {
                    System.out.print("8");
                }
            } else {
                for (int m = 0; m <= ((2 * i)); m++) {
                    System.out.print("8");
                }
            }if(height % 2 == 0) {
                for (int j = (height) - i; j > height / 2; j--) {
                    System.out.print(" ");
                }
            }else {
                for (int j = (height) - i; j > height / 2 + 1; j--) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}