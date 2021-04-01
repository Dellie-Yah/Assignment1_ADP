/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1_adp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Ammaar
 */
public class Student {
    private Student Student1;
    private Student Student2;
    private Student Student3;
    public Student() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        Student1 = new Student();
        Student2 = new Student();
        Student3 = new Student();
        Student1 = Student3;
    }
    
    @Test
    void testIdentity()
    {
        assertSame(Student1, Student3);
    }

    @Test
     void testEquality()
    {
        assertEquals(Student1, Student3);

    }

    @Disabled
    @Test
    void testEqualitys()
    {
        assertEquals(Student1, Student3);

    }

    @Test
    void FailTest()
    {
        assertSame(Student2, Student3);
    }


    @Test
    @Timeout(7)
    void timeoutCheck()
    {
        for (int i =0 ; i<20 ; i++)
            System.out.println(i);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
