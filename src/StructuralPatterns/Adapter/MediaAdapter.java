package StructuralPatterns.Adapter;

public class MediaAdapter implements MediaPlayer{
    protected AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(String name){
        if (name.equalsIgnoreCase("vlc")){
            mediaPlayer = new VlcPlayer();
        }else if (name.equalsIgnoreCase("mp4")){
            mediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String name) {
        if (name.equalsIgnoreCase("vlc")){
            mediaPlayer.playVlc();
        }else if (name.equalsIgnoreCase("mp4")){
            mediaPlayer.playMp4();
        }
    }
}
