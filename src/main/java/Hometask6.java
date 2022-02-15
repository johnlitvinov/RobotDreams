public class Hometask6 {

    // 1.Присваивает значения 4 полям типа int.
    static int a = 6;
    static int b = 2;
    static int c = 3;
    static int d = 4;

    // 2.Суммирует их попарно.
    static int sumAB = a + b;
    static int sumCD = c + d;


    public static void main(String[] args) {

        // 3.Выводит результат сравнения сумм (true если первая сумма больше)
        System.out.println(sumAB > sumCD);

        // 4.Увеличивает первую сумму на 1.
        System.out.println(sumAB += 1);

        // 5.Вторую сумму уменьшает на 2.
        System.out.println(sumCD -= 2);

        // 6.Выводит результат сравнения сумм (true если первая сумма больше)
        System.out.println(sumAB > sumCD);

        // 7.Выводит true если хотя б одна сумма кратна 2, в противном случае — false.
        System.out.println(sumCD % 2 == 0 || sumAB % 2 == 0);
    }
}
