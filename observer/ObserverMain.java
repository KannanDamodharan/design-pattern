public class ObserverMain {
    public static void main(String args[]){
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel fox = new NewsChannel("Fox");
        NewsChannel cnn = new NewsChannel("CNN");

        newsAgency.add(cnn);
        newsAgency.add(fox);

        newsAgency.setLatestNews("Breaking news: Observer Pattern in Action!!!");

        newsAgency.remove(cnn);
        newsAgency.setLatestNews("Another Breaking news: Observer Pattern in Action updated!!!");
    }
}
