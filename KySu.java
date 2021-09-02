import java.util.Scanner;

public class KySu extends CanBo {
       protected String nganh_dao_tao;
        
       public KySu(){

       }
       public KySu(String hoten, String gioitinh, String diachi, int namsinh, String nganh_dao_tao){
                super(hoten,gioitinh,diachi,namsinh);
                this.nganh_dao_tao = nganh_dao_tao;
       }
       public void nhap(){
               super.nhap();
               Scanner sc = new Scanner(System.in);
                System.out.print("Nhap Nganh Dao Tao Cua Ky Su: ");
                nganh_dao_tao = sc.nextLine();
       }
       public void xuat(){
                super.xuat();
                System.out.println("Nganh Dao Tao Cua Ky Su La:" + nganh_dao_tao);
       }
       public static void main(String[] args) {
               KySu a = new KySu();
               a.nhap();
               a.xuat();
       }
}
