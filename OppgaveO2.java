import java.util.Scanner;

public class OppgaveO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {


            System.out.print("Skriv inn karakterpoeng (0-100): ");
            int karakter = sc.nextInt();

            if (karakter > 100 || karakter < 0) {
                System.out.println("Skriv inn på nytt, ugyldig karakter");
                continue;

                }else if (karakter <= 100 && karakter >= 90) {
                    System.out.println("Karakteren din er A");

                } else if (karakter <= 89 && karakter >= 80) {
                    System.out.println("Karakteren din er B");

                } else if (karakter <= 79 && karakter >= 60) {
                    System.out.println("Karakteren din er C");

                } else if (karakter <= 59 && karakter >= 50) {
                    System.out.println("Karakteren din er D");

                } else if (karakter <= 49 && karakter >= 40) {
                    System.out.println("Karakteren din er E");

                } else if (karakter <= 39 && karakter >= 0) {
                    System.out.println("Karakteren din er F");

                }
            }



        sc.close();
        }
       
}