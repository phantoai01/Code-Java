import java.util.Scanner;

public class CanBo {
        public String hoten,gioitinh,diachi;
        public int namsinh;
        public Scanner sc = new Scanner(System.in);

        public CanBo(){

        }
        public CanBo(String hoten, String gioitinh, String diachi, int namsinh){
                this.hoten = hoten;
                this.gioitinh = gioitinh;
                this.diachi = diachi;
                this.namsinh = namsinh;
        }
        public void nhap(){
                System.out.print("Nhap vao Ho Va Ten: ");
                this.hoten = sc.nextLine();
                System.out.print("Nhap vao Gioi Tinh: ");
                this.gioitinh = sc.nextLine();
                System.out.print("Nhap vao Dia Chi: ");
                this.diachi = sc.nextLine();
                System.out.print("Nhap vao Nam Sinh: ");
                this.namsinh = sc.nextInt();
        }
        public void xuat(){
                System.out.println("Ho va Ten: " + this.hoten);
                System.out.println("Gioi Tinh: " + this.gioitinh);
                System.out.println("Dia Chi: " + this.diachi);
                System.out.println("Nam Sinh: " + this.namsinh);
        }
        public static void main(String[] args) {
                System.out.println("Nhap thong Tin Cua Can Bo.");
                CanBo a = new CanBo();
                a.nhap();
                a.xuat();
                System.out.println("Nhap thong Tin Cua Nhan Vien.");
                
                NhanVien b = new NhanVien();
                b.nhap();
                b.xuat();
                System.out.println("Nhap thong Tin Cua Cong Nhan.");
                CongNhan c = new CongNhan();
                c.nhap();
                c.xuat();
                System.out.println("Nhap thong Tin Cua Ky Su.");
                KySu d = new KySu();
                d.nhap();
                d.xuat();
        }
}
