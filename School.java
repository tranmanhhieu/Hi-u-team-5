import com.sun.org.apache.bcel.internal.generic.SWITCH;
import jdk.nashorn.internal.objects.Global;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class School {
    static ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
    static ArrayList<Student> listStudent = new ArrayList<Student>();
    static ArrayList<Point> listPoint = new ArrayList<Point>();

    public static void main(String[] args) {
        while(true) {
            menu();
        }
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Nhập thông tin sinh viên");
        System.out.println("2.Nhập ,Thêm thông tin giáo viên");
        System.out.println("3.Hiển thị sinh viên vừa tạo");
        System.out.println("4.Hiển thị danh sách giáo viên");
        System.out.println("5.Hiển thị dách sách sinh viên và giáo viên chủ nhiệm theo lớp");
        System.out.println("6.Thêm sinh viên");
        System.out.println("7.Sửa thông tin");
        System.out.println("8.Xóa thông tin");
        System.out.println("0.Kết thúc");
        System.out.println("Mời bạn chọn chức năng : ");
        int n = scanner.nextInt();
        switch (n) {
            case 1: {
                enterStudentInfor();
                break;
            }
            case 2: {
                enterTeacherInfor();
                break;
            }
            case 3: {
                showListStudent();
                break;
            }
            case 4: {
                showListTeacher();
                break;
            }
            case 5: {
                classList();
                break;
            }
            case 6: {
                insertStudent();
                break;
            }
            case 7: {
                System.out.println("===========================");
                System.out.println("1.Sửa thông tin sinh viên");
                System.out.println("2.Sửa thông tin giáo viên");
                System.out.println("3.Sửa điểm sinh viên");
                int num = new Scanner(System.in).nextInt();
                switch (num) {
                    case 1:
                        changeStudent();
                        break;
                    case 2:
                        changesTeacher();
                        break;
                    case 3:
                        changesPointTerm();
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại : ");
                        break;
                }
                break;
            }
            case 8: {
                removeStudent();
            }
            case 0: {
                exit();
            }
            default:
                break;
        }

    }

    private static void enterTeacherInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập mã giáo viên : ");
        String idTeacher = scanner.nextLine();
        System.out.println("Mời nhập mã lớp : ");
        String idClass = scanner.nextLine();
        System.out.println("Mời nhập tên giáo viên : ");
        String nameTeacher = scanner.nextLine();
        System.out.println("Mời nhập năm sinh : ");
        String yearOfBirth = scanner.nextLine();
        System.out.println("Mời nhập giới tính : ");
        String sex = scanner.nextLine();
        Teacher teacher = new Teacher(idTeacher, idClass, nameTeacher, yearOfBirth, sex);
        listTeacher.add(teacher);
        System.out.println("Nhập thông tin giáo viên thành công !");

    }

    private static void showListTeacher() {
        System.out.println(listTeacher);
    }

    private static void exit() {
        System.out.println("Cảm ơn và hẹn gặp lại !");
        System.exit(0);
    }

    private static void enterStudentInfor() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Mời nhập mã sinh viên : ");
        String idStudent = scanner.nextLine();
        System.out.println("Mời nhập mã lớp : ");
        String idClass = scanner.nextLine();
        System.out.println("Mời nhập họ đệm : ");
        String firstName = scanner.nextLine();
        System.out.println("Mời nhập tên : ");
        String lastName = scanner.nextLine();
        System.out.println("Mời nhập năm sinh : ");
        String years = scanner.nextLine();
        System.out.println("Mời nhập giới tính : ");
        String sex = scanner.nextLine();
        System.out.println("Mời nhập số tín chỉ đã học");
        int num = scanner.nextInt();
        scanner.nextLine();
        float sumPoint = 0, pointFinal;
        int sumTerm = 0;
        for (int i = 0; i < num; i++) {
            Point term = new Point();
            System.out.println("Mời bạn nhập mã học phần môn " + (i + 1) + " : ");
            String id = scanner.nextLine();
            System.out.println("Mời bạn nhập tên học phần môn " + (i + 1) + " : ");
            String name = scanner.nextLine();
            System.out.println("Mời bạn số tín chỉ môn " + (i + 1) + " : ");
            String number = scanner.nextLine();
            System.out.println("Mời bạn điểm kết thúc học phần môn " + (i + 1) + " : ");
            String point = scanner.nextLine();
            term.setIdTerm(id);
            term.setNameOfTerm(name);
            term.setNumberOfTerm(number);
            term.setPointTerm(point);
            sumPoint += term.getFloatPointTerm() * term.getIntumberOfTerm();
            sumTerm += term.getIntumberOfTerm();
            listPoint.add(term);
        }
        pointFinal = sumPoint / sumTerm;
        student.setIdStudent(idStudent);
        student.setIdClass(idClass);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setListTerm(listPoint);
        student.setSex(sex);
        student.setYearOfBirth(years);
        student.setPoint(pointFinal);
        listStudent.add(student);
        System.out.println("Nhập thông tin thành công !");
    }

    private static void showListStudent() {
        System.out.println(listStudent);
    }

    private static void removeStudent() {
        System.out.println("Mời bạn mã sinh viên cần xóa : ");
        String id = new Scanner(System.in).nextLine();
        for (Student i : listStudent) {
            if (i.getIdStudent().equals(id)) {
                listStudent.remove(i);
            }
        }
    }

    private static void classList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập mã lớp : ");
        String id = scanner.nextLine();
        for (Student student : listStudent) {
            if (student.getIdStudent().equals(id)) {
                System.out.println(student);
            }
        }
        for (Teacher teacher : listTeacher) {
            if (teacher.getIdClass().equals(id)) {
                System.out.println(teacher);
            }
        }
    }

    private static void changesPointTerm() {
        System.out.println("Mời bạn nhập mã sinh viên muôn sửa điểm : ");
        String id = new Scanner(System.in).nextLine();
        for (Student student : listStudent) {
            if (student.getIdStudent().equals(id)) {
                changesPoint(student);
                break;
            }

        }
    }

    private static void changesPoint(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập mã học phần cần sửa điểm : ");
        String id = scanner.nextLine();
        for (Point point : student.getListTerm()) {
            if (point.getIdTerm().equals(id)) {
                System.out.println("Nhập số điểm muốn sửa : ");
                String finalPoint = new Scanner(System.in).nextLine();
                point.setPointTerm(finalPoint);
                break;
            }
        }
    }

    private static void changesTeacher() {
        System.out.println("Mời nhập mã giáo viên cần sửa đổi : ");
        String id = new Scanner(System.in).nextLine();
        for (Teacher i : listTeacher) {
            if (i.getIdTeacher().equals(id)) {
                changesTeacherInFor(i);
            }
        }

    }

    private static void changesTeacherInFor(Teacher teacher) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("1.Thay đổi tên");
        System.out.println("2.Thay đổi năm sinh");
        System.out.println("3.Thay đổi giới tính");
        System.out.println("Mời chọn thông tin cần thay đổi : ");
        int n = scanner.nextInt();
        switch (n) {
            case 1: {
                System.out.println("Tên sau khi được sửa là : ");
                String name = scanner.nextLine();
                teacher.setNameTeacher(name);
                break;
            }
            case 2: {
                System.out.println("Năm sinh được sửa thành : ");
                String years = scanner.nextLine();
                teacher.setYearOfBirth(years);
                break;
            }
            case 3: {
                System.out.println("Giới tính được sửa thành : ");
                String sex = scanner.nextLine();
                teacher.setSex(sex);
                break;
            }
            default: {
                break;
            }
        }

    }

    private static void changeStudent() {
        System.out.println("Mời nhập mã sinh viên cần sửa đổi : ");
        String id = new Scanner(System.in).nextLine();
        for (Student i : listStudent) {
            if (i.getIdStudent().equals(id)) {
                changeStudentInfor(i);
            }
        }
    }

    private static void changeStudentInfor(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("1.Thay đổi họ đệm");
        System.out.println("2.Thay đổi tên");
        System.out.println("3.Thay đổi năm sinh");
        System.out.println("4.Thay đổi giới tính");
        System.out.println("Mời chọn thông tin cần thay đổi : ");
        int n = scanner.nextInt();
        switch (n) {
            case 1: {
                System.out.println("Họ đệm sau khi được sửa là : ");
                String firstName = scanner.nextLine();
                student.setFirstName(firstName);
                break;
            }
            case 2: {
                System.out.println("Tên được sửa thành : ");
                String name = scanner.nextLine();
                student.setLastName(name);
                break;
            }
            case 3: {
                System.out.println("Năm sinh được sửa thành : ");
                String years = scanner.nextLine();
                student.setYearOfBirth(years);
                break;
            }
            case 4: {
                System.out.println("Giới tính đươc sửa sửa thành : ");
                String name = scanner.nextLine();
                student.setLastName(name);
                break;
            }
            default: {
                break;
            }
        }
    }

    private static void insertStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Thông tin sinh viên bổ sung ");
        System.out.println("Mời nhập mã sinh viên : ");
        String idStudent = scanner.nextLine();
        System.out.println("Mời nhập mã lớp : ");
        String idClass = scanner.nextLine();
        System.out.println("Mời nhập họ đệm : ");
        String firstName = scanner.nextLine();
        System.out.println("Mời nhập tên : ");
        String lastName = scanner.nextLine();
        System.out.println("Mời nhập năm sinh : ");
        String years = scanner.nextLine();
        System.out.println("Mời nhập giới tính : ");
        String sex = scanner.nextLine();
        System.out.println("Mời nhập số tín chỉ đã học");
        int num = scanner.nextInt();
        float sumPoint = 0, pointFinal;
        int sumTerm = 0;
        for (int i = 0; i < num; i++) {
            Point term = new Point();
            System.out.println("Mời bạn nhập mã học phần môn " + (i + 1) + " : ");
            String id = scanner.nextLine();
            System.out.println("Mời bạn nhập tên học phần môn " + (i + 1) + " : ");
            String name = scanner.nextLine();
            System.out.println("Mời bạn số tín chỉ môn " + (i + 1) + " : ");
            String number = scanner.nextLine();
            System.out.println("Mời bạn điểm kết thúc học phần môn " + (i + 1) + " : ");
            String point = scanner.nextLine();
            term.setIdTerm(id);
            term.setNameOfTerm(name);
            term.setNumberOfTerm(number);
            term.setPointTerm(point);
            sumPoint += term.getFloatPointTerm() * term.getIntumberOfTerm();
            sumTerm += term.getIntumberOfTerm();
            listPoint.add(term);
        }
        pointFinal = sumPoint / sumTerm;
        student.setIdStudent(idStudent);
        student.setIdClass(idClass);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setListTerm(listPoint);
        student.setSex(sex);
        student.setYearOfBirth(years);
        student.setPoint(pointFinal);
        listStudent.add(student);
        System.out.println("Nhập bổ sung sinh viên thành công !");

    }
}