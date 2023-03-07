import java.util.Scanner;
public class Main {

       static int toplama() {
           Scanner toplam = new Scanner(System.in);
           int result =0;
           System.out.println("Sonucu Göstermek İçin Q bas");

           while(true) {

               System.out.print("Sayı:");
               String deger = toplam.nextLine();
               if (deger.equals("Q")) {
                   return result;
               } else {
                   result += Integer.parseInt(deger);
               }
           }

       }

    static int cikarma() {
        Scanner cikarma = new Scanner(System.in);
        System.out.println("Sonuç İçin Q Basın");
        System.out.print("Sayı Giriniz:");
        String gecicisayi = cikarma.nextLine();
        int result =Integer.parseInt(gecicisayi);
        while(true) {
            System.out.print("Sayı Giriniz:");
            String sayi = cikarma.nextLine();
            if(sayi.equals("Q")){
                return result;
            }
            else{
                result -=Integer.parseInt(sayi);
            }
        }
    }
    static int carpma(){
           Scanner carpma = new Scanner(System.in);
        int result =1;
        System.out.println("Sonuç İçin Q Basın");
           while(true){
            System.out.print("Sayı:");
            String sayi = carpma.nextLine();
            if(sayi.equals("Q")){
                return result;
            }
            else{
                result *=Integer.parseInt(sayi);
            }
        }

    }
    static double bolme(){
           Scanner bolme = new Scanner(System.in);
           double result = 1;
             System.out.println("Sonuç İçin Q Basın");
           System.out.print("Sayı:");
           String gecicisayi = bolme.nextLine();
           if(gecicisayi.equals("0")){

               System.out.println("0'a Bölüm Olmaz");
           }
           else
               result *=Double.parseDouble(gecicisayi);

           while(true){
               System.out.print("Sayı:");
               String sayi = bolme.nextLine();
               if(sayi.equals("Q")){
                   return result;
               }

               else{
                   result /=Double.parseDouble(sayi);

               }
           }
    }
    static double uslu(){
        Scanner us = new Scanner(System.in);

        System.out.print("Taban:");
        double taban = us.nextInt();
        System.out.print("Üs:");
        double uss = us.nextInt();
        return Math.pow(taban,uss);
    }
    static int faktoriyel(){
        Scanner fak = new Scanner(System.in);
        int result =1;
        System.out.print("Sayı:");
        int sayi = fak.nextInt();
        for(int i=1;i<=sayi;i++){
            result *=i;
        }
        return result;
    }
    static int modAlma(){
           Scanner modd = new Scanner(System.in);
        System.out.print("Sayı:");
        int sayi = modd.nextInt();
        System.out.print("Modu:");
        int mod = modd.nextInt();
        int result = sayi%mod;
        return result;
    }
    static int alanvecevre(){

           Scanner alanhesap = new Scanner(System.in);
        System.out.println("1-Alan Hesabı\n2-Çevre Hesabı");
        System.out.print("Lütfen İşlem Seçiniz:");
        int islem = alanhesap.nextInt();
        System.out.print("Kısa Kenar:");
        int kisa = alanhesap.nextInt();
        System.out.print("Uzun Kenar:");
        int uzun = alanhesap.nextInt();
        int alan = kisa*uzun;
        int cevre = (kisa+uzun)*2;
           if(islem ==1){
               return alan;
           }
           else{
               return cevre;
           }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("1-Menü\n2-Çıkış");
            System.out.print("Lütfen Seçiniz:");
            int secim = input.nextInt();
            if(secim ==1){
                System.out.println("1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme işlemi\n5-Üslü Sayı Hesaplama\n6-Faktoriyel Hesaplama\n7-Mod Alma\n8-Dikdörtgen Alan ve Çevre Hesabı\n9-Çıkış");

                System.out.print("İşlem Seçiniz:");
                int islem = input.nextInt();
                switch(islem){
                    case 1:
                        System.out.println("Toplam Sonuç:"+toplama());
                        break;
                    case 2:
                        System.out.println("Toplam Sonuç:"+cikarma());
                        break;
                    case 3:
                        System.out.println("Toplam Sonuç:"+carpma());
                        break;
                    case 4:
                        System.out.println("Toplam Sonuç:"+bolme());
                        break;
                    case 5:
                        System.out.println("Toplam Sonuç:"+(int)uslu());
                        break;
                    case 6:
                        System.out.println("Toplam Sonuç:"+faktoriyel());
                        break;
                    case 7:
                        System.out.println("Toplam Sonuç:"+modAlma());
                        break;
                    case 8:
                        System.out.println(alanvecevre());
                        break;
                    case 9:
                        System.out.println("Tekrar bekleriz");
                        break;
                }
            }
            else{
                System.out.println("Tekrar Bekleriz");
                break;

            }
            
        }

    }

}





            






