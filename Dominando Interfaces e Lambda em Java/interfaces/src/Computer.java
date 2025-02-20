public  class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playerMusic() {
        System.out.println("Computador tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Computador pausando a música");

    }

    @Override
    public void stopMusic() {
        System.out.println("Computador parando a música");

    }

    @Override
    public void playerVideo() {
        System.out.println("Computador tocando o video");

    }

    @Override
    public void pauseVideo() {
        System.out.println("Computador pausando o video");

    }

    @Override
    public void stopVideo() {
        System.out.println("Computador parando o video");

    }
}
