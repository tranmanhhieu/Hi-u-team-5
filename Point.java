public class Point {
    private String idTerm;
    private String nameOfTerm;
    private String numberOfTerm;
    private String pointTerm;

    public void setIdTerm(String idTerm) {
        this.idTerm = idTerm;
    }

    public void setNameOfTerm(String nameOfTerm) {
        this.nameOfTerm = nameOfTerm;
    }

    public void setNumberOfTerm(String numberOfTerm) {
        this.numberOfTerm = numberOfTerm;
    }

    public void setPointTerm(String pointTerm) {
        this.pointTerm = pointTerm;
    }

    public String getIdTerm() {
        return idTerm;
    }

    public String getNameOfTerm() {
        return nameOfTerm;
    }

    public String getNumberOfTerm() {
        return numberOfTerm;
    }

    public String getPointTerm() {
        return pointTerm;
    }
    public Point(){

    }
    public Point(String idTerm, String nameOfTerm, String numberOfTerm, String pointTerm) {
        this.idTerm = idTerm;
        this.nameOfTerm = nameOfTerm;
        this.numberOfTerm = numberOfTerm;
        this.pointTerm = pointTerm;
    }
    public int getIntumberOfTerm(){
        int numberOfTerm = Integer.parseInt(this.numberOfTerm);
        return numberOfTerm;
    }
    public float getFloatPointTerm(){
        float pointTerm = Float.parseFloat(this.pointTerm);
        return pointTerm;
    }
    public String toString(){
        return "Point [Mã học phần : " + idTerm + ", Tên học phần : "+ nameOfTerm+ ", Số tín chỉ " +
                numberOfTerm+", Điểm kết thúc học phần : "+pointTerm+"]";
    }
}
