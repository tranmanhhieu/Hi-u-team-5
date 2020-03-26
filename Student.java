
import java.util.ArrayList;

public class Student {
    private String idStudent;
    private String firstName;
    private String lastName;
    private String idClass;
    private String yearOfBirth;
    private String sex;
    private ArrayList<Point> listTerm;
    private float point;

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setListTerm(ArrayList<Point> listTerm) {
        this.listTerm = listTerm;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public float getPoint() {
        return point;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdClass() {
        return idClass;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public ArrayList<Point> getListTerm() {
        return listTerm;
    }
    public Student(){

    }

    public Student(String idStudent, String firstName, String lastName,
                   String idClass, String yearOfBirth, String sex, ArrayList<Point> listTerm, Float point) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idClass = idClass;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.listTerm = listTerm;
        this.point = point;
    }
    public String toString(){
        return "Sinh viên [ Mã sinh viên :"+idStudent+", Họ đệm : "+firstName+
                ", Tên : "+lastName+", Mã lớp học : "+idClass+", Năm sinh: "
                +yearOfBirth+", Điểm tổng kết : "+point+"]";
    }
}
