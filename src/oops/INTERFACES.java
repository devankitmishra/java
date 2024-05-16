package oops;

            
//--------------------------------------------------------------------------------------INTERFACE-----------------------------------------------------------------------------//
            
            // interface Animal {
            //     int eyes = 2;
            //     void walk();

            // }

            // interface Herbivore {

            // }

            // class Horse implements Animal,Herbivore {

            //     public void walk() {
            //        System.out.println("Walks on 4 legs");
                    
            //     }
                
            // } 
//----------------------------------------------------------------------------------STATIC KEYWORD---------------------------------------------------------------------------//
            class Student {
                String name;
                static String school;

                public static void changeSchool(){
                    school = "newschool";
                }
            }

public class INTERFACES {
    public static void main(String[] args) {
        Student.school = "JMV";
        Student student1 = new Student();
        student1.name = "Tony";
        System.out.println(Student.school);

    }
}
