package bai2_Vong_lap_trong_java.bai_tap;

public class Hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
             for(int n=2; n<100; n++) {
                int dem = 0;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        dem++;
                    }
                }
                if (dem == 0) {
                    System.out.print(n + " ");

                }
            }
    }
}
