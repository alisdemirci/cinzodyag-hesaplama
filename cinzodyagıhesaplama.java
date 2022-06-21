import java.util.Scanner;

public class  cinzodyagıhesaplama {
        public static void main(String[] args) {

                int year;
                Scanner input = new Scanner(System.in);
                System.out.println("Lütfen yaşınızı giriniz:");
                year = input.nextInt();

                if (year % 12 == 0) {
                        System.out.println("Maymun yılında doğdunuz");

                } else if (year % 12 == 1) {
                        System.out.println("Horoz yılında doğdunuz");


                } else if (year % 12 == 2) {
                        System.out.println("Kopek yilinda dogdunuz");


                } else if (year % 12 == 3) {
                        System.out.println("Domuz yilinda dogdunuz");

                } else if (year % 12 == 4) {
                        System.out.println("Fare yilinda dogdunuz");

                } else if (year % 12 == 5) {
                        System.out.println("Okuz yilinda dogdunuz");

                } else if (year % 12 == 6) {
                        System.out.println("Kaplan yilinda dogdunuz");

                } else if (year % 12 == 7) {
                        System.out.println("Tavsan yilinda dogdunuz");
                } else if (year % 12 == 8) {
                        System.out.println("Ejderha yilinda dogdunuz");
                } else if (year % 12 == 9) {
                        System.out.println("Yilan yilinda dogdunuz");
                } else if (year % 12 == 10) {
                        System.out.println("At yilinda dogdunuz");

                } else if (year % 12 == 11) {
                        System.out.println("Koyun yilinda dogdunuz");


                } else {
                                System.out.println("Hatali veri girdiniz");

                }

        }

}








