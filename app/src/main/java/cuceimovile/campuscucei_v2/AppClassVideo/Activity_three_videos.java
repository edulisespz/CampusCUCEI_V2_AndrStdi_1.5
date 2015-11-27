package cuceimovile.campuscucei_v2.AppClassVideo;

import android.app.ProgressDialog;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import cuceimovile.campuscucei_v2.R;

public class Activity_three_videos extends AppCompatActivity {

    ImageView BtnLink;
    ImageView BtnLink2;

    VideoView videoViewlink;
    MediaController mediaController;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_videos);
        setupModulos();

        BtnLink = (ImageView) findViewById(R.id.imageView );
        BtnLink2= (ImageView) findViewById(R.id.imageView2);


        videoViewlink = (VideoView) findViewById(R.id.videoViewlink);

        BtnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            playvideo("http://dcc.cucei.udg.mx/videoscuceitur/cucei.mp4");

            }
        });

        BtnLink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playvideo("http://dcc.cucei.udg.mx/videoscuceitur/cucei2.mp4");
            }
        });


    }



    private void setupModulos()
    {

    }

    public void playvideo(String videopath) {


        Log.e("entered", "playvideo");
        Log.e("path is", "" + videopath);
        try {
            progressDialog = ProgressDialog.show(Activity_three_videos.this, "",
                    "Buffering video...", false);
            progressDialog.setCancelable(true);
            getWindow().setFormat(PixelFormat.TRANSLUCENT);

            mediaController = new MediaController(Activity_three_videos.this);

            Uri video = Uri.parse(videopath);
            videoViewlink.setMediaController(mediaController);
            videoViewlink.setVideoURI(video);

            videoViewlink.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

                public void onPrepared(MediaPlayer mp) {
                    progressDialog.dismiss();
                    videoViewlink.start();
                }
            });

        } catch (Exception e) {
            progressDialog.dismiss();
            System.out.println("Video Play Error :" + e.getMessage());
        }

        /*
        Uri vidPath = Uri.parse(videopath);

        videoViewlink.setVideoURI(vidPath);
        videoViewlink.start();
        */
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
