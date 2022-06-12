package StructuralPatterns.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc() {
        System.out.println("In Vlc");
    }

    @Override
    public void playMp4() {
        throw new UnsupportedOperationException();
    }
}
