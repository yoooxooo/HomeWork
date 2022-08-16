package home_work_2.loops;

public class Exercise6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int z = 2; z <= 5; z++) {
                if (i * z < 10 && i != 10) {
                    System.out.print(z + " * " + i + " = " + z * i + "   | ");
                } else if (i * z >= 10 && i != 10) {
                    System.out.print(z + " * " + i + " = " + z * i + "  | ");
                } else {
                    System.out.print(z + " * " + i + " = " + z * i + " | ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("-------------------------------------------------------");
            for (int j = 1; j <= 10; j++) {
                for (int x = 6; x < 10; x++) {
                    if (j * x < 10 && j != 10) {
                        System.out.print(x + " * " + j + " = " + x * j + "   | ");
                    } else if (j * x >= 10 && j != 10) {
                        System.out.print(x + " * " + j + " = " + x * j + "  | ");
                    } else {
                        System.out.print(x + " * " + j + " = " + x * j + " | ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
