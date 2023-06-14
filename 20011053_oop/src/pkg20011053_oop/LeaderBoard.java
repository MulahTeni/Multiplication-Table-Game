/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20011053_oop;

import java.io.Serializable;

/**
 *
 * @author MTI
 */
public class LeaderBoard implements Serializable{                   // Egzersizin derece tablosu için sınıf
    private final float timePoint;
    private final float truthPoint;
    private final float totalPoint;
    private final String childName;
    private final int recordID;

    public LeaderBoard(float timePoint, float truthPoint, String childName, int recordID) {
        this.timePoint = timePoint;
        this.truthPoint = truthPoint;
        this.childName = childName;
        this.recordID = recordID;
        this.totalPoint = (timePoint + 3*truthPoint)/4;
    }

    public int getRecordID() {
        return recordID;
    }
    
    public float getTimePoint() {
        return timePoint;
    }
    
    public float getTruthPoint() {
        return truthPoint;
    }

    public String getChildName() {
        return childName;
    }

    public float getTotalPoint() {
        return totalPoint;
    }
    
}
