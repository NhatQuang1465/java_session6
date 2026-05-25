import java.util.Arrays;
import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bienSo = new String[100];
        int n = 0;
        int choice;

        do {

            System.out.println("**************** QUẢN LÝ BIỂN SỐ XE ****************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhập số lượng biển số xe: ");
                    n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {

                        while (true) {

                            System.out.print("Nhập biển số xe thứ " + (i + 1) + ": ");
                            String bs = sc.nextLine();

                            String regex = "^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$";

                            if (bs.matches(regex)) {
                                bienSo[i] = bs;
                                break;
                            } else {
                                System.out.println("Biển số không hợp lệ");
                            }
                        }
                    }

                    break;

                case 2:

                    System.out.println("Danh sách biển số xe:");

                    for (int i = 0; i < n; i++) {
                        System.out.println(bienSo[i]);
                    }

                    break;

                case 3:

                    System.out.print("Nhập biển số cần tìm: ");
                    String tim = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < n; i++) {

                        if (bienSo[i].equalsIgnoreCase(tim)) {
                            System.out.println("Đã tìm thấy: " + bienSo[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy biển số");
                    }

                    break;

                case 4:

                    System.out.print("Nhập mã tỉnh: ");
                    String maTinh = sc.nextLine();

                    boolean check = false;

                    System.out.println("Các biển số thuộc mã tỉnh " + maTinh + ":");

                    for (int i = 0; i < n; i++) {

                        if (bienSo[i].startsWith(maTinh)) {
                            System.out.println(bienSo[i]);
                            check = true;
                        }
                    }

                    if (!check) {
                        System.out.println("Không có biển số nào");
                    }

                    break;

                case 5:

                    Arrays.sort(bienSo, 0, n);

                    System.out.println("Danh sách biển số sau khi sắp xếp:");

                    for (int i = 0; i < n; i++) {
                        System.out.println(bienSo[i]);
                    }

                    break;

                case 6:

                    System.out.println("Thoát chương trình");
                    break;

                default:

                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 6);
    }
}

