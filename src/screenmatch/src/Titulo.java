package screenmatch.src;

public class Titulo {
    private String name;
    private int launchYear;
    private boolean includedPrime;
    private double classification;
    private int reviewsAmount;
    private int durationInMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public boolean isIncludedPrime() {
        return includedPrime;
    }

    public void setIncludedPrime(boolean includedPrime) {
        this.includedPrime = includedPrime;
    }

    public double getClassification() {
        return classification/reviewsAmount;
    }

    public void setClassification(double classification) {
        this.reviewsAmount +=1;
        this.classification += classification;
    }

    public int getReviewsAmount() {
        return reviewsAmount;
    }


    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    public void showTitleInfo(){
        System.out.println("Name: "+this.getName());
        System.out.println("Launch Year: "+this.getLaunchYear());
        System.out.println("Included Prime: "+this.isIncludedPrime());
        System.out.println("Classification: "+this.getClassification());
        System.out.println("Reviews: "+this.getReviewsAmount());
    }
}
