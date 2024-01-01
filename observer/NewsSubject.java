public interface NewsSubject {
    void add(NewsObserver newsObserver);
    void remove(NewsObserver newsObserver);
    void notify(String news);
}
