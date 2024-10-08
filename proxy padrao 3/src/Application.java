// Classe principal da aplicação
public class Application {

    public static void main(String[] args) {
        Main aYouTubeService = new ThirdPartyYouTubeClass();
        Main aYouTubeProxy = new CachedYouTubeClass(aYouTubeService);
        YouTubeManager manager = new YouTubeManager(aYouTubeProxy);
        manager.reactOnUserInput();
    }
}
