import java.util.Scanner;
public class lapwhile2 {
       public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String luachon;
                int a,b;
                        System.out.println("***********************************************");
                        System.out.println("**            1. Tinh Tong 2 so a va b.      **");
                        System.out.println("**            2. Tinh hieu 2 so a va b.      **");
                        System.out.println("**            3. Tinh Thuong 2 so a va b.    **");
                        System.out.println("**            n. Chon n de thoat.            **");
                        System.out.println("***********************************************");
                        
                        System.out.print("Nhap lua chon cua ban: ");
                        luachon =  sc.nextLine();
                while(true){
                        if(luachon.equals("n")){
                                break;
                        }else{
                                System.out.print("Nhap gia tri cua a = ");
                                a = sc.nextInt();
                                System.out.print("Nhap gia tri cua b = ");
                                b = sc.nextInt();
                                switch (luachon) {
                                case "1":
                                        System.out.println("1. Tong cua a va b la: S = " + (a + b)); 
                                        break;
                                case "2":
                                        System.out.println("1. Hieu cua a va b la: S = " + (a - b)); 
                                        break;
                                case "3":
                                        System.out.println("1. Thuong cua a va b la: S = " + ((double)a / b)); 
                                        break;
                                default:
                                        System.out.println("lua chon sai khong co chuc nang nay vui long chon lai!");
                                        break;
                                }
                        }
                        System.out.println("***********************************************");
                        System.out.println("**            1. Tinh Tong 2 so a va b.      **");
                        System.out.println("**            2. Tinh hieu 2 so a va b.      **");
                        System.out.println("**            3. Tinh Thuong 2 so a va b.    **");
                        System.out.println("**            n. Chon n de thoat.            **");
                        System.out.println("***********************************************");
                        
                        System.out.print("Nhap lua chon cua ban: ");
                        sc.nextLine();
                        luachon =  sc.nextLine();
                }
                        
       } 
}
