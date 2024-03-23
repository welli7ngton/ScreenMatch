package screenmatch.src;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;

public class Main {
    public static void main(String[] args) {

        Filme deadpool = new Filme();
        deadpool.setName("Deadpool");
        deadpool.setDiretor("Marvel");
        deadpool.setDurationInMinutes(180);
        deadpool.setLaunchYear(2012);
        deadpool.setIncludedPrime(true);

        Serie mrRobot = new Serie();
        mrRobot.setName("Mr. Robot");
        mrRobot.setSeasons(4);
        mrRobot.setIncludedPrime(false);
        mrRobot.setLaunchYear(2015);
        mrRobot.setEpisodesPerSeason(12);
        mrRobot.setActive(true);
        mrRobot.setMinutesPerEpisode(45);

        System.out.println("A duração de "+mrRobot.getName()+" em minutos é: "+ mrRobot.getDurationInMinutes());
        System.out.println("A duração de "+deadpool.getName()+" minutos é: "+ deadpool.getDurationInMinutes());
        deadpool.setClassification(10);
        deadpool.setClassification(10);
        deadpool.setClassification(10);
        deadpool.setClassification(10);
        mrRobot.setClassification(10);
        mrRobot.setClassification(5);
        mrRobot.setClassification(8);
        mrRobot.setClassification(9);
        mrRobot.setClassification(4);
        mrRobot.setClassification(9);

        mrRobot.showTitleInfo();
        deadpool.showTitleInfo();

        Episodio ep1 = new Episodio();
        ep1.setName("Episódio 1");
        ep1.setSerie(mrRobot);
        ep1.setNumber(1);
        ep1.setReviewNote(3);
        System.out.println(ep1.getReviewNote());

        FilmeRecomendacao filter = new FilmeRecomendacao();
        filter.filter(ep1);
        filter.filter(deadpool);
    }
}