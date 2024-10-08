import java.util.List;

// Classe YouTubeManager, usada para trabalhar com o serviço
public class YouTubeManager {

    protected Main service;

    public YouTubeManager(Main service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        String info = service.getVideoInfo(id);
        System.out.println("Rendering video page for: " + info);
    }

    public void renderListPanel() {
        List<String> list = service.listVideos();
        System.out.println("Rendering video list: " + list);
    }

    public void reactOnUserInput() {
        renderVideoPage("Video1");
        renderListPanel();
    }
}
