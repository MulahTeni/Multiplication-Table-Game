/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20011053_oop;

/**
 *
 * @author MTI
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Functions {                                // Farklı classlarda dosya işlemlerini yapabilmek için oluşturuğum class
    public static int lastChild = 0;
    public static int lastExercise = 0;
    public static int lastRecord = 0;
    
    public static void saveChildren(List<Child> children, String path) {
        try (FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(children);
        } catch (IOException e) {
            System.out.println("Child to ser hata!");
        }
    }

    public static List<Child> loadChildren(String path) {
        List<Child> children = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            children = (List<Child>) objectIn.readObject();
            for(Child ch : children){
                lastChild = ch.getId();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Load Child hata!");
        }
        return children;
    }

    public static void saveExercises(List<Exercise> exercises, String path) {
        try (FileOutputStream fileOut = new FileOutputStream(path);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(exercises);
        } catch (IOException e) {
            System.out.println("Exercise to ser hata");
        }
    }
    
    public static List<Exercise> loadExercises(String path) {
        List<Exercise> exercises = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(path);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            exercises = (List<Exercise>) objectIn.readObject();
            for(Exercise ex : exercises){
                lastExercise = ex.getId();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Load Exercise hata!");
        }
        return exercises;
    }
    
    public static void saveRecords(List<Record> records, String path) {
        try (FileOutputStream fileOut = new FileOutputStream(path);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(records);
            if(path.equals("records.ser")){
                saveRecordsCSV(records, "records.csv");
            }else{
                saveRecordsCSV(records, "recordsTest.csv");
            }
        } catch (IOException e) {
            System.out.println("Record to ser hata!");
        }
    }
    
    public static List<Record> loadRecords(String path) {
        List<Record> records = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(path);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            records = (List<Record>) objectIn.readObject();
            for(Record rec : records){
                lastRecord = rec.getId();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Load Record hata!");
        }
        return records;
    }

    public static void saveRecordsCSV(List<Record> records, String filename) {
        File file = new File(filename);
        if(file.exists()) file.delete();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for(Record rec : records){
                writer.write("Kayit Id    :," + rec.getId()+ "\n");
                writer.write("Cocuk Adi   :," + rec.getChild().getFullName() + "\n");
                writer.write("Egzersiz Id :," + rec.getExercise().getId() + "\n");
                writer.write("Toplam Sure :," + rec.getTotalTime() + "\n");
                writer.write("Cevap,Sure,Dogruluk\n");
                int size = Math.min(Math.min(rec.getAnswers().size(), rec.getTimes().size()), rec.getTruth().size());
                for (int i=0; i<size; i++) {
                    writer.append(rec.getAnswers().get(i) + ",");
                    writer.append(rec.getTimes().get(i) + ",");
                    writer.append(rec.getTruth().get(i) + "\n");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Record to csv hata!");
        }
    }
}