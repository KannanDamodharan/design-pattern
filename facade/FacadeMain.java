public class FacadeMain {
    public static void main(String args[]){
        DVDPlayer dvdPlayer = new DVDPlayer();
        AudioSystem audioSystem =  new AudioSystem();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer,audioSystem,projector);
        homeTheater.watchMovie("Titanic");
        homeTheater.endMovie();
    }
}
