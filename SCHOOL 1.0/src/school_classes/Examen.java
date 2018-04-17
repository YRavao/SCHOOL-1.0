/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_classes;

/**
 *
 * @author Yolive
 */
public class Examen {
    
    private int idExam;
    private int note;

    public Examen() {
    }

    public Examen(int idExam, int note) {
        this.idExam = idExam;
        this.note = note;
    }

   
    public int getIdExamen() {
        return idExam;
    }

    public void setIdExamen(int idExam) {
        this.idExam = idExam;
    }

   
    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
