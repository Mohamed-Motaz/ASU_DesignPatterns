package StructuralPatterns.Adapter;

public class Main {
    public static void main(String[] args){
        AudioPlayer player = new AudioPlayer();
        player.play("mp4");
        player.play("vlc");
    }
}
