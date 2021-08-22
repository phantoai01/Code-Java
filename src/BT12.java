import java.util.Scanner;
public class BT12 {
        public static void main(String[] args){
	                        Scanner sc = new Scanner(System.in);
				System.out.println("NHAP PHAN TU TRONG MANG");
				int n =sc.nextInt();
				double a[] = new double[n];
				int i,j;
				int k=0;
				int m=0;
				for( i =0; i<n; i++){
				    System.out.println("NHAP VAO PHAN TU  THU "+i);
				    a[i] = sc.nextDouble();
				}
				System.out.println("PHAN TU PHU DINH CUOI CUNG CUA DAY");
				for(i =0; i<n;i++){
				    if(a[i]<0){
				        m = m+1;
				    }
				}
				for(j=0;j<n;j++){
				    if(a[j] <0){
				        k = k+1;
				        if(k == m){
				            System.out.println("SO AM ="+ a[j]);
				        }
				    }
				}
	}
}


