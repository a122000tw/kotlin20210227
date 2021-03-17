package com.homePRC.day1;






import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account acc = new Account();
        menu(acc);
    }
    public static void menu(Account acc) {
        System.out.println("-------------------------------");
        System.out.println("1. 設定帳戶名稱");
        System.out.println("2. 帳戶存款");
        System.out.println("3. 帳戶提款");
        System.out.println("4. 餘額查詢");
        System.out.println("5. 離開系統");
        System.out.println("-------------------------------");
        System.out.print("請選擇服務項目(1~5): ");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt(); // 取得使用者輸入的數值
        switch (item) {
            case 1: // 設定帳戶名稱
                System.out.println("請輸入帳戶名稱: ");
                String name = sc.next();
                acc.setName(name);
                break;

            case 2: // 帳戶存款
                System.out.println("請輸入存款金額: ");
                int deposit_money = sc.nextInt();
                acc.deposit(deposit_money);
                break;

            case 3: // 帳戶提款
                System.out.println("請輸入提款金額: ");
                int withdraw_money = sc.nextInt();
                acc.withdraw(withdraw_money);
                break;

            case 4: // 餘額查詢
                acc.print();

            case 5: // 離開系統
                return;
        }
        menu(acc);

    }



}
