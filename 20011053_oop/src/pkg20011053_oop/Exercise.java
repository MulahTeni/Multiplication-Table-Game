/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20011053_oop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author MTI
 */
public class Exercise implements Serializable{              // Egzersizlerin kaydında kullanılacak sınıf
    private final int aMin;
    private final int aMax;
    private final int bMin;
    private final int bMax;
    private final int N;
    public int[][] questions;  // A, B, A*B
    private int id;
    private List<LeaderBoard> leaderBoard;

    public Exercise(int aMin, int aMax, int bMin, int bMax, int N) {
        this.leaderBoard = new ArrayList<>();
        this.aMin = aMin;
        this.aMax = aMax;
        this.bMin = bMin;
        this.bMax = bMax;
        this.N = N;
        //LeaderBoard nullFix = new LeaderBoard(0, 0);
        //leaderBoard.add(nullFix);
        Functions.lastExercise++;
        id = Functions.lastExercise;
        generateQuestions();
    }
    
    private void generateQuestions() {
        questions = new int[N][3];
        int randomA, randomB;
        for (int i = 0; i < N; i++) {
            Random rand = new Random();
            randomA = rand.nextInt(getAMax()-getAMin()) + getAMin();
            randomB = rand.nextInt(getBMax()-getBMin()) + getBMin();
            questions[i][0] = randomA;
            questions[i][1] = randomB;
            questions[i][2] = randomA * randomB;
        }
    }

    public List<LeaderBoard> getLeaderBoard() {
        return leaderBoard;
    }

    public void setLeaderBoard(List<LeaderBoard> leaderBoard) {
        this.leaderBoard = leaderBoard;
    }

    public int getAMin() {
        return aMin;
    }

    public int getAMax() {
        return aMax;
    }

    public int getBMin() {
        return bMin;
    }

    public int getBMax() {
        return bMax;
    }

    public int getN() {
        return N;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}