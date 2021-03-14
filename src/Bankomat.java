import java.util.Scanner;

public class Bankomat
{
    Konto konto;

    public Bankomat(Konto konto)
    {
        this.konto = konto;
    }

    public void MainMenu()
    {
        int x;
        do {
            System.out.println("Menu główne");
            System.out.println("1: Sprawdź saldo");
            System.out.println("2: Wypłać pieniądze");
            System.out.println("3: Wpłać pieniądze");
            System.out.println("4: WYJDŹ");
            System.out.println("Wybierz opcję: ");

            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();

            switch (x) {
                case 1:
                    konto.ShowAccountValue();
                    break;
                case 2:
                    System.out.println("Ile chcesz wypłacić? ");
                    int a = scan.nextInt();
                    konto.WithdrawFunds(a);
                    break;
                case 3:
                    System.out.println("Ile chcesz wpłacić? ");
                    int b = scan.nextInt();
                    konto.DepositFunds(b);
                    break;
            }
        }while (x !=4);
    }
}
