/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg20011053_oop;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MTI
 */
public class FunctionsTest {
    Child nC;
    Exercise nE;
    Record nR;
    List<Child> children;
    List<Exercise> exercises;
    List<Record> records;
    ArrayList<Integer> times;
    ArrayList<Integer> answers;
    ArrayList<String> truth;
    
    public FunctionsTest() {
        children = new ArrayList<>();
        exercises = new ArrayList<>();
        records = new ArrayList<>();
        times = new ArrayList<>();
        answers = new ArrayList<>();
        truth = new ArrayList<>();
    }
    
    @Before
    public void setUp() {
        nC = new Child("Deneme deneme", "deneme123");
        children.add(nC);
        nE = new Exercise(1, 5,2,4,4);
        exercises.add(nE);
        times.add(5);        times.add(4);        times.add(3);
        answers.add(5);      answers.add(4);      answers.add(3);
        truth.add("D");      truth.add("D");      truth.add("Y");
        nR = new Record(10, nC, nE, times, answers, truth, 2);
        records.add(nR);
    }
    
    @After
    public void tearDown() {
        children.clear();
        exercises.clear();
        records.clear();
        times.clear();
        answers.clear();
        truth.clear();
    }

    /**
     * Test of saveChildren method, of class Functions.
     */
    @Test
    public void testSaveChildren() {
        System.out.println("saveChildren");
        try{
            Functions.saveChildren(children, "childrenTest.ser");
        }catch(Exception e){
            fail("testSaveChildren fail "+e.getMessage());
        }
    }

    /**
     * Test of loadChildren method, of class Functions.
     */
    @Test
    public void testLoadChildren() {
        System.out.println("loadChildren");
        Functions.saveChildren(children, "childrenTest.ser");
        try{
            List<Child> result = Functions.loadChildren("childrenTest.ser");
            assertEquals(children.get(0).getId(), result.get(0).getId());
        }catch(Exception e){
            fail("testLoadChildren fail "+e.getMessage());
        }
    }

    /**
     * Test of saveExercises method, of class Functions.
     */
    @Test
    public void testSaveExercises() {
        System.out.println("saveExercises");
        try{
            Functions.saveExercises(exercises, "exercisesTest.ser");
        }catch(Exception e){
            fail("testSaveExercises fail "+e.getMessage());
        }
    }

    /**
     * Test of loadExercises method, of class Functions.
     */
    @Test
    public void testLoadExercises() {
        System.out.println("loadExercises");
        Functions.saveExercises(exercises, "exercisesTest.ser");
        try{
            List<Exercise> result = Functions.loadExercises("exercisesTest.ser");
            assertEquals(exercises.get(0).getId(), result.get(0).getId());
        }catch(Exception e){
            fail("testLoadExercises fail "+e.getMessage());
        }
    }

    /**
     * Test of saveRecords method, of class Functions.
     */
    @Test
    public void testSaveRecords() {
        System.out.println("saveRecords");
        try{
            Functions.saveRecords(records, "recordsTest.ser");
        }catch(Exception e){
            fail("testSaveRecords fail "+e.getMessage());
        }
    }

    /**
     * Test of loadRecords method, of class Functions.
     */
    @Test
    public void testLoadRecords() {
        System.out.println("loadRecords");
        Functions.saveRecords(records, "recordsTest.ser");
        try{
            List<Record> result = Functions.loadRecords("recordsTest.ser");
            assertEquals(records.get(0).getId(), result.get(0).getId());
        }catch(Exception e){
            fail("testLoadRecords fail "+e.getMessage());
        }
    }
    
}
