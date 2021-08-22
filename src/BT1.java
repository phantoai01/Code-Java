import java.util.Scanner;

public class BT1 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap gia tri a = " ); double a = sc.nextDouble();
                System.out.print("Nhap gia tri b = ");  double b = sc.nextDouble();
                System.out.print("Nhap gia tri c =");   double c = sc.nextDouble();
                BT1.giaipt(a,b,c);
        }
//        ax2 + bx + c = 0
        public static void giaipt(double a, double b, double c) {
                if(a == 0 ){
                        if(b == 0){
                                System.out.println("Phuong trinh da cho vo nghiem! ");
                        }else{
                                System.out.println("Phuong trinh da cho co 1 nghiem duy nhat x = " + ((-c)/b) );
                        }return;
                }
                //tính đen ta 
                double delta = b*b - 4*a*c;
                double x1,x2;
                //biện luận
                if(delta > 0 ){
                        x1 = (double) ((-b + Math.sqrt(delta))/(2*a));
                        x2 = (double) ((-b - Math.sqrt(delta))/(2*a));
                        System.out.println("Phuong Trinh có 2 nghiem la : X1 = " + x1 + "và X2 = " + x2 ); 
                }else if(delta == 0){
                        x1 = (-b / (2*a));
                        System.out.println("Phuong trinh co nghiem la: X1 = X2 = " + x1);
                }else{
                        System.out.println("Phuong trinh vo nghiem !");
                }
                
        }
        
}