public class Main {
    public static void main(String[] args) {
        Computer musicPlayer = new Computer();
        runMusic(musicPlayer);
        runVideo(musicPlayer);
        System.out.println(musicPlayer.getClass());
    }
    public static  void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playerVideo();
    }public static  void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playerMusic();
    }
}