public class NewsChannel implements NewsObserver{

    private String channelName;

    public NewsChannel(String channelName){
        this.channelName = channelName;
    }
    public void notify(String news){
        System.out.println("News received by" + channelName + " ---> "+ news);
    }
}
