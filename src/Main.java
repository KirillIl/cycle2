public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задание 2");
        double totalWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i < 12; i++) {
            totalWithPercent = (totalWithPercent + salary) * (1 + percent);
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalWithPercent + " рублей");
        }


    }
}