import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String hoTen = "";
        String email = "";
        String sdt = "";
        String matKhau = "";

        int choice;

        do {

            System.out.println("**************** QUẢN LÝ NGƯỜI DÙNG ****************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhập họ tên: ");
                    hoTen = sc.nextLine();

                    System.out.print("Nhập email: ");
                    email = sc.nextLine();

                    System.out.print("Nhập số điện thoại: ");
                    sdt = sc.nextLine();

                    System.out.print("Nhập mật khẩu: ");
                    matKhau = sc.nextLine();

                    break;

                case 2:

                    hoTen = hoTen.trim().toLowerCase();

                    String[] words = hoTen.split("\\s+");

                    String result = "";

                    for (String word : words) {
                        result += Character.toUpperCase(word.charAt(0))
                                + word.substring(1) + " ";
                    }

                    System.out.println("Họ tên chuẩn hóa: " + result.trim());

                    break;

                case 3:

                    String regexEmail = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";

                    if (email.matches(regexEmail)) {
                        System.out.println("Email hợp lệ");
                    } else {
                        System.out.println("Email không hợp lệ");
                    }

                    break;

                case 4:

                    String regexPhone = "^(03|05|07|08|09)\\d{8}$";

                    if (sdt.matches(regexPhone)) {
                        System.out.println("Số điện thoại hợp lệ");
                    } else {
                        System.out.println("Số điện thoại không hợp lệ");
                    }

                    break;

                case 5:

                    String regexPassword =
                            "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%]).{8,}$";

                    if (matKhau.matches(regexPassword)) {
                        System.out.println("Mật khẩu hợp lệ");
                    } else {
                        System.out.println("Mật khẩu không hợp lệ");
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

