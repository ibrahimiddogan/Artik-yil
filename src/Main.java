import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner alici = new Scanner(System.in);
        System.out.print("Bir yıl giriniz : ");
        yil = alici.nextInt();
        if (yil%4==0){
            if (yil%100==0 && yil%400==0){
                System.out.print(yil+" Artık bir yıldır");
            }
            else {
                System.out.println(yil+" Artık bir yıl değildir");
            }
        }
        else {
            System.out.println(yil  + " Artık bir yıl değildir");
        }

    }
}