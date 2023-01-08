import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        int toplam=0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Lütfen Değer Giriniz: ");
            number = inp.nextInt();

            for (int i=1; i<number; i++){
                if (number % i == 0){
                    toplam += i;
                }
            }
            if (toplam == number){
                System.out.println(number + " Mükkemmel sayıdır");
            }else {
                System.out.println(number + " Mükkemmel sayı değildir");
            }

        }while (number > 0);
    }
}