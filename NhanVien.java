import java.util.Scanner;

public class NhanVien extends CanBo {
       protected String cong_viec;

       public NhanVien(){

       }
       public NhanVien(String hoten,String gioitinh,String diachi,int namsinh,String cong_viec){
                super(hoten,gioitinh,diachi,namsinh);
                this.cong_viec = cong_viec;
       }
       public void nhap(){
                super.nhap();
                Scanner in = new Scanner(System.in);
                System.out.print("Nhap Cong Viec Cua Nhan Vien: ");
                cong_viec = in.nextLine();
       }
       public void xuat(){
                super.xuat();
                System.out.println("Cong Viec :" + cong_viec);
       }
       public static void main(String[] args) {
                NhanVien a = new NhanVien();    
                a.nhap();
                a.xuat();
       }
}
