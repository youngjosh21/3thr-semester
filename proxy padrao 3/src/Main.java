import java.util.List;

// A interface de um serviço remoto.
public interface Main {
    List<String> listVideos();
    String getVideoInfo(String id);
    void downloadVideo(String id);
}

