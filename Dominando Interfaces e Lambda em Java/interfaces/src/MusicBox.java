public  class MusicBox implements MusicPlayer {
    @Override
    public void playerMusic() {
        System.out.println("Caixa de música tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Caixa de música pausando a música");

    }

    @Override
    public void stopMusic() {
        System.out.println("Caixa de música parando a música");

    }


}
