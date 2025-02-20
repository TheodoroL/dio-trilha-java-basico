public  class SmartPhone implements VideoPlayer, MusicPlayer {
    @Override
    public void playerMusic() {
        System.out.println("SmartPhone tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("SmartPhone pausando a música");

    }

    @Override
    public void stopMusic() {
        System.out.println("SmartPhone parando a música");

    }

    @Override
    public void playerVideo() {
        System.out.println("SmartPhone tocando o video");

    }

    @Override
    public void pauseVideo() {
        System.out.println("SmartPhone pausando o video");

    }

    @Override
    public void stopVideo() {
        System.out.println("SmartPhone parando o video");

    }
}
