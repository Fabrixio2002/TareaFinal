package hn.uth.tareafinal;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class VideoPlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        videoView = findViewById(R.id.videoView);

        // Obtén la URI del archivo de video en res/raw
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);

        // Configura el controlador multimedia para controlar la reproducción
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Establece la URI del video en el VideoView y comienza la reproducción
        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}
