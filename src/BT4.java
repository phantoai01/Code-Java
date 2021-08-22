import java.util.Scanner;

public class BT4 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a,b,c;
                System.out.print("Nhap gia tri cua a = ");
                a = sc.nextInt();
                System.out.print("Nhap gia tri cua b = ");
                b = sc.nextInt();
                System.out.print("Nhap gia tri cua c = ");
                c = sc.nextInt();

               if((a < b + c) && (b < a + c) && (c < a + b)){
                        System.out.print("Day la 3 canh cua 1 tam giac va tam giac do la: ");

                        if(((a * a) == (b * b) + (c * c)) || ((b*b)==(a*a)+(c*c)) || ((c*c)== (a*a)+(b*b)) ){
                                System.out.println("Tam giac vuong.");
                        }else if(a == b && b == c){
                                System.out.println("Tam giac deu. ");
                        }else if(a == b || a == c || b == c){
                                System.out.println("Tam giac can.");
                        }else if(a * a > b * b+c * c || b * b > a * a+ c * c || c * c > a * a + b * b ){
                                System.out.println("Tam giac tu.");
                        }else{
                                System.out.println("Tam giac nhon.");
                        }               
               }else{
                        System.out.println("Ba canh a, b, c khong phai la canh cua 1 tam giac!");
                }   

       }
}