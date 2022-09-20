package home_work_2.arrays;

public class Exercise2_2 {

    public String allArrayDoWhile(int[] pack) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        do {
            str.append(pack[i]).append(" ");
            i++;
        }
        while (i < pack.length);
        return str.toString();
    }

    public String allArrayWhile(int[] pack) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < pack.length) {
            str.append(pack[i]).append(" ");
            i++;
        }
        return str.toString();
    }

    public String allArrayFor(int[] pack) {
        StringBuilder str = new StringBuilder();
        for (int j : pack) {
            str.append(j).append(" ");
        }
        return str.toString();
    }

    public String allArrayForeach(int[] pack) {
        StringBuilder str = new StringBuilder();
        for (int j : pack) {
            str.append(j).append(" ");
        }
        return str.toString();
    }

    public String secondElementsDoWhile(int[] pack) {
        int i = 1;
        StringBuilder str = new StringBuilder();
        do {
            str.append(pack[i]).append(" ");
            i += 2;
        }
        while (i < pack.length);
        return str.toString();
    }

    public String secondElementsWhile(int[] pack) {
        int i = 1;
        StringBuilder str = new StringBuilder();
        while (i < pack.length) {
            str.append(pack[i]).append(" ");
            i += 2;
        }
        return str.toString();
    }

    public String secondElementsFor(int[] pack) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < pack.length; i += 2) {
            str.append(pack[i]).append(" ");
        }
        return str.toString();
    }

    public String secondElementsForeach(int[] pack) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        for (int j : pack) {
            i++;
            if (i % 2 == 0) {
                str.append(j).append(" ");
            }
        }
        return str.toString();
    }

    public String reverseArrayDoWhile(int[] pack) {
        int i = pack.length - 1;
        StringBuilder str = new StringBuilder();
        do {
            str.append(pack[i]).append(" ");
            i--;
        }
        while (i >= 0);
        return str.toString();
    }

    public String reverseArrayWhile(int[] pack) {
        int i = pack.length - 1;
        StringBuilder str = new StringBuilder();
        while (i >= 0) {
            str.append(pack[i]).append(" ");
            i--;
        }
        return str.toString();
    }

    public String reverseArrayFor(int[] pack) {
        StringBuilder str = new StringBuilder();
        for (int i = pack.length - 1; i >= 0; i--) {
            str.append(pack[i]).append(" ");
        }
        return str.toString();
    }

    public String reverseArrayForeach(int[] pack) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        for (int j : pack) {
            i++;
                str.append(pack[pack.length - i]).append(" ");
        }
        return str.toString();
    }

    public void allArray(int[] pack) {
        System.out.print("Перебор массива\n");
        System.out.print("С помощью do  while: ");
        System.out.print(allArrayDoWhile(pack) + "\n");
        System.out.print("С помощью while: ");
        System.out.print(allArrayWhile(pack) + "\n");
        System.out.print("С помощью for: ");
        System.out.print(allArrayFor(pack) + "\n");
        System.out.print("С помощью foreach: ");
        System.out.print(allArrayForeach(pack) + "\n");
    }

    public void secondElements(int[] pack) {
        System.out.print("Каждый второй элемент массива\n");
        System.out.print("С помощью do  while: ");
        System.out.print(secondElementsDoWhile(pack) + "\n");
        System.out.print("С помощью while: ");
        System.out.print(secondElementsWhile(pack) + "\n");
        System.out.print("С помощью for: ");
        System.out.print(secondElementsFor(pack) + "\n");
        System.out.print("С помощью foreach: ");
        System.out.print(secondElementsForeach(pack) + "\n");
    }

    public void reverseArray(int[] pack) {
        System.out.print("Массив в обратном порядке\n");
        System.out.print("С помощью do...while: ");
        System.out.print(reverseArrayDoWhile(pack) + "\n");
        System.out.print("С помощью while: ");
        System.out.print(reverseArrayWhile(pack) + "\n");
        System.out.print("С помощью for: ");
        System.out.print(reverseArrayFor(pack) + "\n");
        System.out.print("С помощью foreach: ");
        System.out.print(reverseArrayForeach(pack) + "\n");
    }
}
