import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Abstract class
        //Interface
        //declaring a variable i;
        //primitive --> 8 -> byte,short,int,long->integer numbers
        // float(F),double,-->decimal
        // char,-->Character
        // boolean--> true or false
        // non-primitive--> String,Array,Class
        //declaring integer
        int i;
        i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);
        //Declaring and initialing array
        int[] arr;
        arr = new int[5];

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));
        //declaring
        String myName;
        //initializing
        myName = "Mohan";
        System.out.println(myName);
        String name = "Phani";
        //Object of a class --> instance of a class --> initializing a class
//        StudentA s1 = new StudentA();
//        s1.age=25;
//        s1.name="Shyam";
//        s1.rollNo='A';
//        s1.score=74.25;
//        System.out.println(s1.StudentDetails());
//        String report=s1.StudentReport();
//        System.out.println(report);
        StudentA s2=new StudentA("Krishna",25,75.6,'B');
        System.out.println(s2.toString());


    }
}

    //class
    abstract class Student {
        //data members
        //state and behaviour
        //attributes and methods
        String name;
        int age;
        double score;
        char rollNo;

        //constructor

        public Student(String name, int age, double score, char rollNo) {
            this.name = name;
            this.age = age;
            this.score = score;
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    ", rollNo=" + rollNo +
                    '}';
        }

        //    public Student(String name, int age, double score, char rollNo) {
//        this.name = name;
//        this.age = age;
//        this.score = score;
//        this.rollNo = rollNo;
//    }
//abstract method
        abstract String StudentDetails();

        //non-abstract method
        public String StudentReport() {
            return "This is a sample statement ";
        }
    }
    class StudentA extends Student{

        public StudentA(String name, int age, double score, char rollNo) {
            super(name, age, score, rollNo);
        }

        @Override
        String StudentDetails() {
            return "I am an implementation of StudentDetails ";
        }
    }




