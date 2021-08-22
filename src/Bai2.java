
import java.util.Scanner;

public class Bai2 {
        public static void main(String[] args) {
                int luachon;
                
                do{
                        
                        Scanner sc = new Scanner(System.in);
                        int a,b;
                        System.out.print("gia tri cua a = "); a = sc.nextInt();
                        System.out.print("gia tri cua b = "); b = sc.nextInt();
                        System.out.println("**********************************************************");
                        System.out.println("**                        Menu                          **");
                        System.out.println("**   1. Tinh Tong 2 so a va b.                          **");
                        System.out.println("**   2. Tinh hieu 2 so a va b.                          **");
                        System.out.println("**********************************************************");
                        System.out.print("lua chon cua ban la: ");luachon = sc.nextInt();
                        switch (luachon) {
                                case 1:

                                        System.out.println("Tong cua 2 so la:" + (a + b));
                                        break;
                                case 2:
                                        System.out.println("Hieu cua 2 so la:" + (a - b));
                                        break;
                                default:
                                        System.out.println("Khong co chuc nang vui long nhap lai!");
                                        break;
                        }      
                }while(luachon !=1 || luachon != 2);  
        }       
}