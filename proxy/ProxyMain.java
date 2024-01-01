public class ProxyMain {
    public static void main(String args[]){
        Image realImage = new RealImage("realImage.jpg");
        realImage.display();

        Image proxyImage = new ProxyImage("realImage.jpg");
        proxyImage.display();
    }
}
