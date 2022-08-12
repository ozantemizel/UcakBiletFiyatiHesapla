import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int mesafe,yas, yolculukTipi;
        double yasIndirimi= 0.5;
        double gencIndirimi=0.1;
        double yasliIndirimi= 0.3;
        double ciftYonIndirimi=0.2;
        double totalUcret=0;
        double kmBasiUcret=0.1;
        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz mesafeyi Km cinsinden yazınız: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınız kaç: ");
        yas=input.nextInt();

        System.out.println("Yolculuk tipini giriş yapınız.\nTek Yön:1 \nÇift Yön:2");
        yolculukTipi=input.nextInt();



        if((yas>=0)&&(mesafe>=0)&&((yolculukTipi==1)||(yolculukTipi==2))){
            totalUcret=mesafe*kmBasiUcret;
            if(yolculukTipi==2) {
                totalUcret+=totalUcret;
                totalUcret -= totalUcret * ciftYonIndirimi;
                if(yas<=12){
                    totalUcret-=totalUcret*yasIndirimi;
                } else if((yas>=12)&&(yas<=24)){
                    totalUcret-=totalUcret*gencIndirimi;
                } else if(yas>=65){
                    totalUcret-=totalUcret*yasliIndirimi;
                } else{
                    totalUcret+=0;
                }
            }else {
                if (yas <= 12) {
                    totalUcret -= totalUcret * yasIndirimi;
                } else if ((yas >= 12) && (yas <= 24)) {
                    totalUcret -= totalUcret * gencIndirimi;
                } else if (yas >= 65) {
                    totalUcret -= totalUcret * yasliIndirimi;
                } else {
                    totalUcret += 0;
                }
            }
        }else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }
        System.out.println(totalUcret);
    }
}
