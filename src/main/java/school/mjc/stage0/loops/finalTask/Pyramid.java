package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int i2 = i;
            for (int j = 1; j <= cathetusLength * 2; j++) {
                if (i + j >= cathetusLength + 1) {
                    if (j < cathetusLength)
                        System.out.print(i2--);
                    else {
                        if (i2 == i + 1)
                            System.out.print(" ");
                        else
                            System.out.print(i2++);
                    }
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
