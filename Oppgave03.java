import java.util.Scanner;
public class Oppgave03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv et tall: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Tallet må være større en null");
        }else if (n > 0) {
                int fakultet = 1;

                for (int i = 1; i <= n; i++) {
                fakultet = fakultet * i;
            }

            System.out.println(n + "!= "+fakultet);
        }

        sc.close();
    }
}
