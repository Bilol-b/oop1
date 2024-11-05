public class Student extends Person{
    private String program;
    private String year;
    private String fee;

    public Student(String name, String address, String program, String year, String fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                ", year='" + year + '\'' +
                ", fee='" + fee + '\'' +
                '}';
    }
}
