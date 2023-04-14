import java.util.Scanner;
public class MaxMinNum {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int max=0,min=0,i=0,n=0;
        boolean ilkSayi=true;
        System.out.print("sayi giriniz:");
        n=scan.nextInt();
        while (i<n){
            i++;
            System.out.print(i+".Sayıyı giriniz:");
            int sayi=scan.nextInt();
            if(ilkSayi){
                max=sayi;
                min=sayi;
                ilkSayi=false;
            }else{
                if(sayi>max){
                    max=sayi;
                }if (sayi<min){
                    min=sayi;
                }
            }
        }
        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);
        }
    }

