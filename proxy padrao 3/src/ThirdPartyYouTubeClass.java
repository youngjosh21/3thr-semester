import java.util.List;

// A implementação concreta de um serviço conector.
public class ThirdPartyYouTubeClass implements Main {

    @Override
    public List<String> listVideos() {
        // Simula uma requisição API para o YouTube.
        System.out.println("Fetching video list from YouTube...");
        return List.of("Video1", "Video2", "Video3");
    }

    @Override
    public String getVideoInfo(String id) {
        // Obtém metadados sobre algum vídeo.
        System.out.println("Fetching video info for: " + id);
        return "Info of video " + id;
    }

    @Override
    public void downloadVideo(String id) {
        // Baixa um arquivo de vídeo do YouTube.
        System.out.println("Downloading video: " + id);
    }
}
