import java.util.Scanner;

public class BT3 {
        public static void main(String[] args) {
                // viết chương trình nhập vào 1 số nguyên rồi in ra các ước của số đó
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap vao so nguyen a = ");
                int a = sc.nextInt();
                for(int i = 1; i <= a;i++ ){
                        if(a % i == 0){
                                System.out.print( "Cac uoc cua " + a +"la :" + i + " ");
                        }
                }

        }
        
        
}
