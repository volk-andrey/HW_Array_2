import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int sumPay = 0;
        int [] arrayAccountingBook = {11_200,22_500,33_798,55_000,10_000};
        for (final int i : arrayAccountingBook)  {
            sumPay += i;
        }
        System.out.println("Сумма трат за месяц составила " + sumPay + " рублей");

        System.out.println("----------------\nTask  2");
        int [] arrAccountingBook  =  {11_700,22_500,33_798,5_000,19_000};
        int minPay = arrAccountingBook[0];
        int maxPay  =  arrAccountingBook[0];
        for  (final int i  : arrAccountingBook)   {
            if (i > maxPay)   {
                maxPay  = i;
            } else if  (i  < minPay)  {
                minPay  = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxPay  + " рублей");

        System.out.println("----------------\nTask  3");
        float  avgPay   = 0;
        float []  accountingBook   =   {11_700,22_500,33_798,5_000,19_000};
        for  (final float i  : accountingBook)   {
            avgPay  +=  i;
        }
        avgPay   /=  accountingBook.length;
        System.out.println("Средняя сумма трат за месяц составила  "  + avgPay  +  " рублей");

        System.out.println("----------------\nTask  4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--)   {
        System.out.print(reverseFullName[i-1]);
        }
    }
}