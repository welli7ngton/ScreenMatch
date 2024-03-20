package exercicies;

public class Aluno {
    private String name;
    private double noteOne;
    private double noteTwo;
    private double noteThree;

    public void setName(String name) {
        this.name = name;
    }

    public void setNoteOne(double noteOne) {
        this.noteOne = noteOne;
    }

    public void setNoteTwo(double noteTwo) {
        this.noteTwo = noteTwo;
    }

    public void setNoteThree(double noteThree) {
        this.noteThree = noteThree;
    }

    public String getName() {
        return name;
    }

    public double getNoteOne() {
        return noteOne;
    }

    public double getNoteTwo() {
        return noteTwo;
    }

    public double getNoteThree() {
        return noteThree;
    }

    public double calculateFinalNote(){
        return (noteOne + noteTwo + noteThree) / 3;
    }

    public void verifyIfPassed(){
        if (this.calculateFinalNote() > 7){
            System.out.println("Congrats, " + this.name + ", u have passed.");
        } else {
            System.out.println("Im sorry " + this.name + ", u need to study a little more.");
        }
    }
}
