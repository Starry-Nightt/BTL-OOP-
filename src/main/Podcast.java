package main;

import java.util.ArrayList;
import java.util.List;

public class Podcast {
    private String podcastID;
    private String podcastName;
    private int level;
    private List<Part> partList;

    public Podcast(String podcastID, String podcastName, int level, Part... parts){
        this.podcastID = podcastID;
        this.podcastName = podcastName;
        this.level = level;
        partList = new ArrayList<Part>();
        for (int i = 0;i < parts.length;i++)
            partList.add(parts[i]);
    }

     public String getPodcastID(){
        return podcastID;
     }
     public String getPodcastName(){
        return podcastName;
     }
    public int getLevel() {
        return level;
    }
    public void setPodcastID(String podcastID) {
        this.podcastID = podcastID;
    }

    public void setPodcastName(String podcastName) {
        this.podcastName = podcastName;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public boolean addPart (Part part){
        if (level <= 2){
            if (part.getDuration() <= 0 || part.getDuration() > 15)
                return false;
            partList.add(part);
            return true;
        }
        else {
            if (part.getDuration() < 30)
                return false;
            partList.add(part);
            return true;
        }
    }

    public boolean removePart (int index){
        if (index < 0 || index >= partList.size())
            return false;
        partList.remove(index);
        return true;
    }

    public Part getPart (int index){
        return partList.get(index);
    }
    public double getLength(){
        double length = 0;
        for (int i = 0; i < partList.size();i++)
            length += partList.get(i).getDuration();
        return length;
    }

    public String getDetails() {
        String tmp = "";
        tmp += "ID: " + getPodcastID() + "\n";
        tmp += "Name: " + getPodcastName() + "\n";
        tmp += "Length: " + getLength() + "\n";
        tmp += "Desc: ";
        for (int i = 0;i < 2 && i < partList.size();i++)
            tmp += partList.get(i).getAnswer() + ", ";
        tmp += "...\n";
        return tmp;
    }
}
