package StructuralPatterns.Adapter;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playMp4() {
        System.out.println("In Mp4");
    }
}
