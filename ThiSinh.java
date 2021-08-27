import java.util.Scanner;

public class ThiSinh {
       private
       String ht,dc,gt;
       int ns;
       
       public ThiSinh(){

       }
       public ThiSinh(String a,int b,String c,String d)
       {
               this.ht = a;
               this.ns = b;
               this.dc = c;
               this.gt = d; 
       }
       public void nhap(){
               Scanner sc = new Scanner(System.in);
               System.out.print("Nhap Ho Va Ten: ");
               this.ht = sc.nextLine();    
               System.out.print("Nhap Gioi Tinh: ");
               this.gt = sc.nextLine();
               System.out.print("Nhap Dia chi: ");
               this.dc = sc.nextLine();
               System.out.print("Nhap Nam Sinh: ");
               this.ns = sc.nextInt();
       }
       public void xuat(){
               System.out.println("\t\t\tThong Tin Thi Sinh da nhap la:");
               System.out.println("Ho va Ten Thi Sinh: " + ht);
               System.out.println("Gioi Tinh: " + gt);
               System.out.println("Dia Chi: " + dc);
               System.out.println("Nam Sinh: " + ns);
       }
       public static void main(String[] args) {
               ThiSinh a = new ThiSinh();
               a.nhap();
               a.xuat();
       }
}
