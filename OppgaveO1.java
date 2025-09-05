import java.util.Scanner;

public class OppgaveO1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv inn din bruttoinntekt: ");
        double brutto = sc.nextDouble();

        double prosent = 0;

        if(brutto <= 217401){
            System.out.println("Inntekten er under trinnskatten");
            return;
        }else if(brutto>=217401 && brutto<=306050){
            prosent = 1.7;

        }else if(brutto>=306050 && brutto<=697150){
            prosent = 4.0;

        }else if(brutto>=697150 && brutto<=942400){
            prosent = 13.7;

        }else if(brutto>=942400 && brutto<=1410750){
            prosent =  16.7;

        }else {
            prosent =  17.7;
        }

        double skatt = (prosent * brutto) / 100;

        System.out.println("Før skatt: " + brutto + "kr");
        System.out.println("Skatt som må betalest: " + skatt + "kr");

        sc.close();
    }
}
