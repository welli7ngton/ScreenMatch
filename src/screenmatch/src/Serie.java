package screenmatch.src;

public class Serie extends Titulo{
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    private String type = "Serie";

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes(){
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    @Override
    public void showTitleInfo(){
        System.out.println("Type: "+this.type);
        super.showTitleInfo();
        System.out.println("Seasons: "+this.getSeasons());
        System.out.println("Active: "+this.isActive());
        System.out.println("Epsodes/Season: "+this.getEpisodesPerSeason());
        System.out.println("Minutes/Episode: "+this.getMinutesPerEpisode());
    }

}
