import java.util.Scanner;

public class CongNhan extends CanBo {
       protected String Bac;
        
       public CongNhan(){

       }
       public CongNhan(String hoten, String gioitinh, String diachi, int namsinh, String Bac){
                super(hoten,gioitinh,diachi,namsinh);
                this.Bac = Bac;
       }
       public void nhap(){
                super.nhap();
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap Bac Cua Cong Nhan : ");
                Bac = sc.nextLine();
       }
       public void xuat(){
                super.xuat();
                System.out.println("Bac Cua Cong Nhan :" + Bac);
       }
       public static void main(String[] args) {
                CongNhan a = new CongNhan();
                a.nhap();
                a.xuat();
       }
}
