public class Teacher {
    private String idTeacher;
    private String idClass;
    private String nameTeacher;
    private String yearOfBirth;
    private String sex;

    public String getIdTeacher() {
        return idTeacher;
    }

    public String getIdClass() {
        return idClass;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Teacher(){

    }

    public Teacher(String idTeacher, String idClass, String nameTeacher, String yearOfBirth, String sex) {
        this.idTeacher = idTeacher;
        this.idClass = idClass;
        this.nameTeacher = nameTeacher;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
    }
    @Override
    public String toString(){

        return "Giaovien [Mã giáo viên : " +idTeacher+ ", Mã lớp :" + idClass +", Tên giáo viên : "+
                nameTeacher+", Tuổi : " + ", Giới tính : "+ sex + "]";
    }
}
