public class Main {
    public static void main(String[] args) {
        int start = 300; // сумма у клиента на счете
        int popolnenie = 2550; // сумма пополнения
        int bonus = popolnenie / 100;  // количество начисляемых бонусов
        int rezult;    // общая сумма на счету после пополнения и начисления бонусов
        if (popolnenie > 1000) {
            rezult = start + bonus + popolnenie;
        } else {
            rezult = start + popolnenie;
        }
        int ball; // количество начисленных баллов
        if (popolnenie > 1000) {
            ball = bonus;
        } else {
            ball = 0;
        }

        System.out.println("Итоговый счет:  " + rezult);
        System.out.println("Количество начисленных баллов: " + ball);


    }
}