public class Constructors {
    public static void main(String[] args) {
        int[] marks = {70, 65, 73};
        Student s1 = new Student("Yash", 71, marks);
        Student s2 = new Student(s1);
        s2.marks[0] = 30;
        System.out.println("s1 marks");
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
        System.out.println();
        System.out.println("s2 marks");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    int[] marks;

    Student(String name, int roll, int[] marks) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    Student(Student old) {
        this.name = old.name;
        this.roll = old.roll;
        this.marks = old.marks;
    }
}
