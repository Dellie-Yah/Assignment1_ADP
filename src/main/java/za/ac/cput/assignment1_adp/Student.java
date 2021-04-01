/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1_adp;

/**
 *
 * @author CPUT
 */
public class Student {
    private static String Studentname;
    private static String Gender;
    private static String Race;

    public Student() {
    }

    public static String getStudentname() {
        return Studentname;
    }

    public static String getGender() {
        return Gender;
    }

    public static String getRace() {
        return Race;
    }

    public static void setStudentname(String Studentname) {
        Student.Studentname = Studentname;
    }

    public static void setGender(String Gender) {
        Student.Gender = Gender;
    }

    public static void setRace(String Race) {
        Student.Race = Race;
    }

    @Override
    public String toString() {
        return "Program{" + '}';
    }
    
}
