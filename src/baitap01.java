import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Quan ly thong tin cua 1 sinh vien
 * =====Bài tâp===
 * 1. Nhap vao ma sinh vien
 * 2. Nhap vao ho ten
 * 3. so diejnd thoại
 * 4. Nhập vào ngày tháng năm sinh
 * 5. In thông tin sinh vien
 * <p>
 * Validate dữ liệu nhập vào
 * mã sinh viên phải bắt đầu bằng chữ B sau là 3 số (VD : B200)
 * Ho ten khong chua ky tu dac biet trừ khoảng trắng có tối thiểu 10 ký tự
 * Phone Đúng định dạng Đông Lào
 * Năm sinh phải đúng yy/mmm/dd (05/10/1994)
 */
public class baitap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentCode = "";
        String studentName = "";
        String studentPhone = "";
        String studentBirth = "";
        do {
            System.out.println("==========Student Management==========");
            System.out.println("1. Enter student code");
            System.out.println("2. Enter student name");
            System.out.println("3. Enter student phone number");
            System.out.println("4. Enter student birthday");
            System.out.println("5. Print out student information");
            System.out.println("6. Exit");

            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1. Enter student code: ");
                    studentCode = scanner.nextLine();
                    Pattern codeRegex = Pattern.compile("^B[0-9]{3}$");
                    Matcher codeCheck = codeRegex.matcher(studentCode);
                    if (codeCheck.matches()) {
                        System.out.println("Code is saved.");
                        break;
                    } else {
                        System.err.println("Wrong format code");
                        break;
                    }

                case 2:
                    System.out.println("2. Enter student name: ");
                    studentName = scanner.nextLine();
                    Pattern nameRegex = Pattern.compile("^[a-zA-Z ]{8,}$");
                    Matcher nameCheck = nameRegex.matcher(studentName);
                    if (nameCheck.matches()) {
                        System.out.println("Name is saved.");
                        break;
                    } else {
                        System.err.println("Wrong format code");
                        break;
                    }
                case 3:
                    System.out.println("3. Enter student phone number: ");
                    studentPhone = scanner.nextLine();
                    Pattern phoneRegex = Pattern.compile("(0)[379][0-9]{8}");
                    Matcher phoneCheck = phoneRegex.matcher(studentPhone);
                    if (phoneCheck.matches()) {
                        System.out.println("Phone number is saved.");
                        break;
                    } else {
                        System.err.println("Wrong format code");
                        break;
                    }
                case 4:
                    System.out.println("4. Enter student birthday: ");
                    studentBirth = scanner.nextLine();
                    Pattern birthRegex = Pattern.compile("[0-3][0-9]/[0-1][0-9]/(19|20)[0-9]{2}");
                    Matcher birthCheck = birthRegex.matcher(studentBirth);
                    if (birthCheck.matches()) {
                        System.out.println("Birthday is saved.");
                        break;
                    } else {
                        System.err.println("Wrong format code");
                        break;
                    }
                case 5:
                    System.out.println("5. Printing out student information...");
                    System.out.println("Student Code: " + studentCode);
                    System.out.println("Student Name: " + studentName);
                    System.out.println("Student Phone: " + studentPhone);
                    System.out.println("Student Birthday: " + studentBirth);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Non existent option");
                    break;
            }
        } while (true);
    }
}

