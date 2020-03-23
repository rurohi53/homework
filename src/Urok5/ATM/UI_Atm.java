package Urok5.ATM;

import java.util.Scanner;

public class UI_Atm {
    private static Scanner in;
    private static int anotherTransaction;
    public static  float balance = 10000;
    public static float amount;
    static void transaction() {
        in = new Scanner(System.in);
        int choice;
        System.out.println("Выберите действие");
        System.out.println("1. Снятие");
        System.out.println("2. Пополнение банкомата");
        System.out.println("3. Посмотреть доступные средства в банкомате");
        System.out.println("4. Выйти");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Пожалуйста введите сумму для снятия: ");
                amount = in.nextInt();
                if (amount > balance || balance == 0) {
                    System.out.println("Недостаточно средств в банкомате\n\n");
                    anotherTransaction();
                } else if (Service_Atm.service() == false) {

                    System.out.println("Ошибка. В банкомате имеются следующие банкноты: '20', '50' '100'.");
                    transaction();

                } else if (Service_Atm.service() == true) {
                    balance = balance - amount;
                    System.out.println("Отдаю деньги. Вы сняли " + amount + "\nВозможные средства для снятия: " + balance + "\n");
                    transaction();
                } else {
                    balance = balance - amount;
                    System.out.println("Вы сняли " + amount + "\nВозможные средства для снятия: " + balance + "\n");
                    anotherTransaction();
                }
                break;
            case 2:
                float deposit;
                System.out.println("Введите сумму которую хотите внести в банкомат");
                deposit = in.nextFloat();
                balance = deposit + balance;
                System.out.println("Вы внесли сумму " + deposit + "в банкомате теперь " + balance);
                anotherTransaction();
                break;
            case 3:
                System.out.println("Средства для снятия " + balance);
                anotherTransaction();
                break;
            case 4:
                System.out.println("Спасибо. Хорошего вам дня!");
                break;
            default:
                System.out.println("Ошибка ввода. Попробуйте еще раз");
                transaction();
                break;
        }
    }

    private static void anotherTransaction() {
        System.out.println("Хотите совершить еще одну транзакцию?\n\n Введите '1' для еще одной транзакции\n Введите '2' чтобы выйти ");
        anotherTransaction = in.nextInt();
        if (anotherTransaction == 1) {
            transaction();
        } else if (anotherTransaction == 2) {
            System.out.println("Спасибо. Хорошего вам дня");
        } else {
            System.out.println("Ошибка ввода. Попробуйте еще раз.");
            transaction();
        }
    }
}