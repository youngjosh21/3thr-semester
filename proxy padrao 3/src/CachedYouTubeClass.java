import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Classe proxy com cache
public class CachedYouTubeClass implements Main {

    private Main service;
    private List<String> listCache;
    private Map<String, String> videoCache = new HashMap<>();
    private boolean needReset = false;

    // Construtor
    public CachedYouTubeClass(Main service) {
        this.service = service;
    }

    @Override
    public List<String> listVideos() {
        if (listCache == null || needReset) {
            listCache = service.listVideos();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(String id) {
        if (!videoCache.containsKey(id) || needReset) {
            videoCache.put(id, service.getVideoInfo(id));
        }
        return videoCache.get(id);
    }

    @Override
    public void downloadVideo(String id) {
        if (!downloadExists(id) || needReset) {
            service.downloadVideo(id);
        }
    }

    private boolean downloadExists(String id) {
        // Simula a verificação de se o vídeo já foi baixado.
        System.out.println("Checking if video " + id + " is already downloaded...");
        return false; // Simulação de que o vídeo não está baixado.
    }
}
