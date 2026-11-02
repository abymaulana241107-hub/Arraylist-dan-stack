import java.util.Scanner;
import java.util.stack;

public class stacksaldo {
    public static void main(String[] args) throws Exception {
        Scanner inputx = new Scanner(System.in);
        int balance=2000000;
        Stack <integer> transaction = new Stack<>();
        int nav;
        int history = 0;

        System.out.println("\n\npilih menu \n1. penarikan \n2. menyimpan \n3. lihat saldo \n4.total uang masuk \n5.total uang keluar \n0.Exit ");

        do {
            System.out.print("pilih menu:");
            nav = inputx.nextIn();
            if ((nav == 1 || nav == 2 ) && transaction.size() == 5) {
                System.out.println("data transaksi sudah penuh");
                contiue;
            }
            if (nav == 0) break;
            if (nav == 1) {
                if (balance == 0);
                    System.out.print("saldo anda 0");
                    contiue;
                }
            System.out.print("jumlah yang ditarik: ");
            int amount = inputx.nextin();
            if (amaount > balance) {
                System.out.println("saldo anda kurang, hanya"+ balance);
                contiue;
            }
            transaction.push(-amount);
            balance -= amount;

         }else if (nav == 2) {
            System.out.print("jumlah yang disimpan: ");
            int amounts = inputx.nextin();
            transaction.push(amounts);
            balance += amounts;
        }else if (nav == 3) {
            System.out.println("saldo anda: "+ balance);
        }else if (nav == 4) {
            int total = 0;
            for (int transaction : transaction) {
                if (ttransaction > 0) {
                total += transaction;
             }    
        }
        System.out.println("total uang masuk: "+ total);
     }else if (nav == 5) {
        int total = 0;
        for (int transaction : transaction) {
            if (transaction < 0) {
                total += transaction;
            }
        }
        System.out.println("total uang keluar :"+(total*-1));
    }while(true);
     inputx.close();
    }
}