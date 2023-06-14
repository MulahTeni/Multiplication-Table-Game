/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20011053_oop;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author MTI
 */
public class Record implements Serializable{                // Oynanan oyunların kaydının tutulacağı ısnıf
    LocalDate Date;
    private int totalTime;
    private int id;
    private final Child child;
    private final Exercise exercise;
    private final ArrayList<Integer> times;
    private final ArrayList<Integer> answers;
    private final ArrayList<String> truth;
    private int score;
    
    public Record(int totalTime, Child child, Exercise exercise, ArrayList<Integer> times, ArrayList<Integer> answers, ArrayList<String> truth, int score) {
        this.child = child;
        this.exercise = exercise;
        this.Date = LocalDate.now();
        Functions.lastRecord++;
        id = Functions.lastRecord;
        this.answers = answers;
        this.truth = truth;
        this.times = times;
        this.totalTime = totalTime;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
        
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getId() {
        return id;
    }

    public Child getChild() {
        return child;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public ArrayList<Integer> getTimes() {
        return times;
    }

    public ArrayList<String> getTruth() {
        return truth;
    }

    public ArrayList<Integer> getAnswers() {
        return answers;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }
    
    
}
