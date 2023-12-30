public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private AudioSystem audioSystem;
    private Projector projector;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, AudioSystem audioSystem, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.audioSystem = audioSystem;
        this.projector = projector;
    }

    public void watchMovie(String movie){
        System.out.println("Get Ready to watch movie");
        dvdPlayer.on();
        audioSystem.on();
        projector.on();
        dvdPlayer.play(movie);
    }
    public void endMovie(){
        System.out.println("Ending a movie");
        dvdPlayer.off();
        audioSystem.off();
        projector.off();
    }
}
