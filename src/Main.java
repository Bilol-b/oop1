//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Person student = new Student("Ali","UZB","EWW","QWER","WSWS");
     Person staff = new Staff("Ali","UZB","EWW",23);

        System.out.println(student.toString());
        System.out.println(staff.toString());
    }
}