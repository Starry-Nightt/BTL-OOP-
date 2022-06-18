package main;


import java.util.ArrayList;
import java.util.List;

public class PodcastManager {
    private List<Podcast> podcastList;

    public PodcastManager(Podcast... podcasts){
        podcastList = new ArrayList<Podcast>();
        for (int i = 0;i < podcasts.length;i++){
            podcastList.add(podcasts[i]);
        }
    }

    public void addPodcast (Podcast... podcasts){
        for (int i = 0;i < podcasts.length;i++)
            podcastList.add(podcasts[i]);
    }

    public boolean removePodcast (String podcastID){
        for (int i = 0;i < podcastList.size();i++){
            if (podcastList.get(i).getPodcastID().equals(podcastID)){
                podcastList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Podcast> getPodcastsAtLevel(int level){
        List<Podcast> podcasts = new ArrayList<Podcast>();
        for (int i = 0; i < podcastList.size();i++){
            if (podcastList.get(i).getLevel() == level)
                podcasts.add(podcastList.get(i));
        }
        return podcasts;
    }

    public Podcast getPodcastByID (String podcastID){
        for (int i = 0;i < podcastList.size();i++){
            if (podcastList.get(i).getPodcastID().equals(podcastID)){
                return  podcastList.get(i);
            }
        }
        return null;
    }
    public List<Podcast> getPodcastsByName(String podcastName){
        List<Podcast> podcasts = new ArrayList<Podcast>();
        for (int i = 0; i < podcastList.size();i++){
            if (podcastList.get(i).getPodcastName().indexOf(podcastName) != -1)
                podcasts.add(podcastList.get(i));
        }
        return podcasts;
    }

    public static void displayPodcast (List<Podcast> podcasts){
        for (int i = 0;i < podcasts.size();i++)
            System.out.println(podcasts.get(i).getDetails());
    }
}
