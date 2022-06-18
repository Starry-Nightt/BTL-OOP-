package main;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Part {
    private String partID;
    private String fileAudio;
    private String answer;

    public Part (String partID, String fileAudio, String answer){
        this.partID = partID;
        this.fileAudio = fileAudio;
        this.answer = answer;
    }

     public String getPartID(){
        return partID;
     }

    public String getFileAudio() {
        return fileAudio;
    }

    public String getAnswer() {
        return answer;
    }

    public void setPartID(String partID) {
        this.partID = partID;
    }

    public void setFileAudio(String fileAudio) {
        this.fileAudio = fileAudio;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public double getDuration(){
        Media media = new Media(fileAudio);
        MediaPlayer player = new MediaPlayer(media);
        return player.getTotalDuration().toSeconds();
    }
}
