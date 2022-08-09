package home_work_1;

public class Exercise300 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100)  , b = (int)(Math.random()*100), c = (int)(Math.random()*100);
        double d = 6.99;
        System.out.println("Радиус закрывающий прямоугольник размерами " + a + "*" + b +" = " + Math.hypot(a,b));

        System.out.println("Десятичный логарифм перемноженных сторон прямоугольника " + c + "*" + b +" = " + Math.log(a*b));

        System.out.println("И если это значение округлить, то мы получим = " + Math.round(Math.log(a*b)));

        System.out.println("В прямоугольнике со сторонами " + b + " и " + c +" большая сторона = " + Math.max(c,b));

        System.out.println("Если у нас " + a + " свободных мест для 0 и 1, то исходя из принципов комбинаторики количество возможных вариантов будет равно = " + Math.pow(2,a));

        System.out.println("Если за домашнюю работу у меня будет выходить " + d + ", то для преподавателя, как ни прискорбно, это будет " + Math.floor(d));
    }
}
