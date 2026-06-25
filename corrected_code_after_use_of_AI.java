import java.util.Scanner;

public class corrected_code_after_use_of_AI {
    public static void main(String[] args) {

        int balance = 100;
        int para = 0;        // ← moved here (was inside case 1)
        int withdraw;
        int deposit;
        int yes = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("mirsevini ne banken tone.me 1 mund te terhqni para\n,me 2 mund te depositoni para\n,me 3 mund te kontrolloni bilancin\n me 4 mund te dilni");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                System.out.println("sa para doni te terhiqni?");
                para = sc.nextInt();  // ← removed 'int'

                if (para > balance) {
                    System.out.println("nuk keni aq para ne llogari\n provoni perseri");
                } else {
                    balance = balance - para;  // ← added
                    System.out.println("shuma juaj eshte: " + para);
                }

                while (true) {
                    System.out.println("diten e mire");
                    break;
                }
                break;
        }

        switch (choice) {
            case 2:

                System.out.println("sa para doni te dpositoni?");
                deposit = sc.nextInt();

                if ((balance >= deposit) || (balance <= deposit)) {
                    System.out.println("parate qe i deposituat jane: " + deposit + " ,ndersa bilanci juaj eshte: " + (balance + deposit));
                    balance = balance + deposit;
                } else {
                    System.out.println("keni shtypur gabim!!!");
                }

                while (true) {
                    System.out.println(" a doni te vazhdoni?\n po =1, jo =0");
                    yes = sc.nextInt();

                    if (yes == 1) {
                        System.out.print("mirsevini ne banken tone.\nme 1 mund te terhqni para\n,me 2 mund te depositoni para\n,me 3 mund te kontrolloni bilancin\n me 4 mund te dilni");
                        choice = sc.nextInt();

                        switch (choice) {

                            case 1:
                                System.out.println("sa para doni te terhiqni?");
                                para = sc.nextInt();

                                if (para > balance) {
                                    System.out.println("nuk keni aq para ne llogari\n provoni perseri");
                                } else {
                                    balance = balance - para;  // ← added
                                    System.out.println("shuma juaj eshte: " + para);
                                }

                                while (true) {
                                    System.out.println("diten e mire");
                                    break;  // ← added (infinite loop fix)
                                }
                                break;  // ← added

                            case 2:
                                System.out.println("sa para doni te dpositoni?");
                                deposit = sc.nextInt();

                                if ((balance >= deposit) || (balance <= deposit)) {
                                    System.out.println("parate qe i deposituat jane: " + deposit + " ,ndersa bilanci juaj eshte: " + (balance + deposit));
                                    balance = balance + deposit;
                                } else {
                                    System.out.println("keni shtypur gabim!!!");
                                }
                                break;

                            case 3:  // ← removed illegal { } wrapping
                                System.out.println("bilanci juaj eshte :" + balance);
                                break;

                            case 4:
                                System.out.println("Exit");
                                break;

                            default:
                                System.out.println("keni shtypur gabim,ju lutem provoni perseri!");
                                break;
                        }
                    } else {
                        System.out.println("ju lutem mereni kartelen tuaj!");
                    }

                    break;
                }
                break;
        }

        switch (choice) {
            case 3:

                System.out.println("bilanci juaj eshte :" + balance);  // ← show balance first
                System.out.println("a deshironi te vazhdoni?\n po =1, jo =0");  // ← added po/jo hint
                yes = sc.nextInt();  // ← replaced Scanner sc1 + boolean po

                if (yes == 1) {
                    System.out.println("bilanci juaj eshte :" + balance);
                } else {
                    System.out.println("ne rregull\nditen e mire\nju lutem merni kartelen tuaj! ");
                }
                break;
        }

        switch (choice) {
            case 4:
                System.out.println("shtypni" + 0 + " te dilni");
                System.out.println("mereni kartelen tuaj\n\n\n");
                System.out.println("diten e mire");
                break;
        }
    }
}
