package screenmatch.src;

public class Filme extends Titulo implements Classificavel{
    private String diretor;
    private  String type = "Movie";

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public void showTitleInfo(){
        System.out.println("Type: "+this.type);
        super.showTitleInfo();
        System.out.println("Director: "+this.getDiretor());
    }

    @Override
    public int getReviewNote() {
        return (int) this.getClassification();
    }
}
