public class Main {



        public static void main(String[] args) {


            Student student1 = new Student();
            student1.name = "Polina";
            student1.surname = "Meshchanova";
            student1.yearOfBirth = 2003;
            student1.increateTmp2();
            System.out.println(student1.getTmp2());
            student1.increateTmp2();
            System.out.println(student1.getTmp2());


            Student student2 = new Student();
            student1.name ="Petia";
            student1.surname ="Pupkin";
            student1.yearOfBirth = 2000;


            Student[] students = new Student[2];
            students[0] = student1;
            students[1] = student1;


            System.out.println("zadanie 2:");

            printStaticHello();
            new Main().printHello();



        }



        public void printHello(){
            System.out.println("Hello");
            // metoda musi wychodzić przez klasę

        }

        public static void printStaticHello(){

            System.out.println("Hello");
            //ta metoda nie wymaga klasy
        }
    }

