/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20011053_oop;

import java.util.List;
/**
 *
 * @author MTI
 */
public class _deneme {
     
   
    
    public static void main(String[] args) {
        
        List<Exercise> loadedExercises = Functions.loadExercises("exercises.ser");
        List<Child> loadedChildren = Functions.loadChildren("children.ser");
        List<Record> loadedRecords = Functions.loadRecords("records.ser");
        
        //Child Child1 = new Child("asdasd", "123");
        //loadedChildren.add(Child1);
        //Functions.saveChildren(loadedChildren,"children.ser");
        
        //Exercise exercise1 = new Exercise(1, 5, 2, 4, 3);
        //loadedExercises.add(exercise1);
        //Functions.saveExercises(loadedExercises);
        //Record newRecord;
        //exercise1.addRecord(newRecord);
        // Çocuğa Bildir
        
        //loadedExercises = Functions.loadExercises();
        //loadedChildren = Functions.loadChildren();
        
        //System.out.println("Cocuklar:");
        //System.out.println(loadedChildren);
        System.out.println("Cocuklar:");
        for (Child child : loadedChildren) {
            System.out.println("ID: " + child.getId() + ", Ad-Soyad: " + child.getFullName() + ", Kullanıcı Adi: " + child.getUserName());
        }

        System.out.println("Egzersizler:");
        for (Exercise exercise : loadedExercises) {
            System.out.println("ID: " + exercise.getId() + ", A: " + exercise.getAMax() + ", B: " + exercise.getBMax() + ", N: " + exercise.getN());
            System.out.println(exercise.getAMax());
            System.out.println(exercise.getBMax());
            System.out.println(exercise.getId());
        }
        
        System.out.println("Kayitlar:");
        for (Record r : loadedRecords) {
            System.out.println("Child: " + r.getChild() + ", Exer: " + r.getChild() + ", truth: " + r.getTruth());
        }
    }
}
