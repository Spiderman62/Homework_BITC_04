import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("\nChương trình làm việc với chuỗi!\n");
            System.out.println("1: Kiểm tra có chuỗi cần tìm?");
            System.out.println("2: Đếm số lần xuất hiện chuỗi cần tìm");
            System.out.println("3: Chuyển đổi chuỗi thành chuỗi hoa");
            System.out.println("4: Kiểm tra chuỗi đối xứng");
            System.out.println("Nhập số phía trên để thực hiện chương trình (hoặc ấn n để thoát)");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")) {
                running = false;
            } else {
                StringApp stringApp = new StringApp();

                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.print("Nhập chuỗi: ");
                        String data = scanner.nextLine();
                        System.out.print("Nhập chuỗi cần tìm: ");
                        String check = scanner.nextLine();
                        boolean result = stringApp.checkSubString(data,check);
                        System.out.print("Kết quả là: "+result);
                        break;
                    case 2:
                        System.out.print("Nhập chuỗi: ");
                        String data_1 = scanner.nextLine();
                        System.out.print("Nhập chuỗi cần đếm: ");
                        String check_1 = scanner.nextLine();
                        int result_1 = stringApp.countCharlnString(data_1,check_1);
                        System.out.print("Kết quả là: "+result_1);
                        break;
                    case 3:
                        System.out.print("Nhập chuỗi: ");
                        String data_2 = scanner.nextLine();
                        String result_2 = stringApp.UpperCaseToString(data_2);
                        System.out.print("Kết quả là: "+result_2);
                        break;
                    case 4:
                        System.out.print("Nhập chuỗi: ");
                        String data_3 = scanner.nextLine();
                        Boolean result_3 = stringApp.isPalindrome(data_3);
                        System.out.print("Kết quả là: "+result_3);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                        break;
                }
            }
        }

        scanner.close();
    }
}