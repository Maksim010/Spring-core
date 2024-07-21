package org.drobysh.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    List<Music> musicList=new ArrayList<>();

    private String name;
    private  int volume;
    private Music music;
//IoC
    public MusicPlayer(Music music){
        this.music=music;
    }
    public MusicPlayer(){
    }
    public void setMusic(Music music){
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
    public void playMusicList(){
        musicList.forEach(music -> System.out.println("Playing: "+music.getSong()));
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicList=" + musicList +
                '}';
    }
}
