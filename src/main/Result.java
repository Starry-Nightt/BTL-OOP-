package main;

import java.util.Date;

public class Result {
    private String podcastName;
    private int level;
    private double podcastLength;
    private double completionTime;
    private double score;
    private Date date;


    public Result(String podcastName, int level, double podcastLength, double completionTime){
        this.podcastName = podcastName;
        this.level = level;
        this.podcastLength = podcastLength;
        this.completionTime = completionTime;
        date = new Date();
    }

    public String getPodcastName(){
        return podcastName;
    }

    public int getLevel() {
        return level;
    }

    public double getPodcastLength() {
        return podcastLength;
    }

    public double getCompletionTime() {
        return completionTime;
    }

    public Date getDate() {
        return date;
    }

    public double getScore() {
        score = 10 * (11 - getCompletionTime()/getPodcastLength());
        return score;
    }

    public String getDetails(){
        String tmp = "";
        tmp += "Date: " + getDate() + "\n";
        tmp += "Podcast Name: " + getPodcastName() + "\n";
        tmp += "Level: " + getLevel() + "\n";
        tmp += "Podcast Length: " + getPodcastLength() + "\n";
        tmp += "Completion Time: " + getCompletionTime() + "\n";
        tmp += "Score: " + getScore() + "\n";
        return  tmp;
    }
}
