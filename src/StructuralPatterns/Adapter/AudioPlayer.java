package StructuralPatterns.Adapter;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter adapter;

    public AudioPlayer(){
    }

    @Override
    public void play(String name) {
        adapter = new MediaAdapter(name);
        adapter.play(name);
    }
}
