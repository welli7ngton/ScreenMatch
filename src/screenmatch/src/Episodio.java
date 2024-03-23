package screenmatch.src;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Episodio implements Classificavel{
    private int number;
    private String name;
    private Serie serie;

    private int reviewNote;

    public void setReviewNote(int reviewNote) {
        this.reviewNote = reviewNote;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getReviewNote() {
        return this.reviewNote;
    }
}
