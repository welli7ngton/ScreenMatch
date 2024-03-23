package screenmatch.src;

public class FilmeRecomendacao {
    private String recommendation;

    public void filter(Classificavel classificavel){
        if (classificavel.getReviewNote() >=4){
            System.out.println("HOT");
        } else {
            System.out.println("COLD");
        }
    }
}
