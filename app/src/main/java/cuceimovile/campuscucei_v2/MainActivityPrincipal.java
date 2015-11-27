package cuceimovile.campuscucei_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import cuceimovile.campuscucei_v2.AndroidAR.activity.Demo;
import cuceimovile.campuscucei_v2.AppClassVideo.Activity_three_videos;

public class MainActivityPrincipal extends AppCompatActivity {

        ImageView Btncampus;
        ImageView BtnVideo;
        ImageView BtnMaps;
        ImageView BtnAugAR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_principal);


        Btncampus=(ImageView) findViewById(R.id.Boton_campus);

        Btncampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_two_modulos.class);
                startActivity(intent);

            }
        });

        BtnVideo=(ImageView) findViewById(R.id.imageVideos);

        BtnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_three_videos.class);
                startActivity(intent);
            }
        });


        BtnMaps =(ImageView) findViewById(R.id.imageMap);

        BtnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                Log.e("entered", "Maps");
                startActivity(intent);
            }
        });


        BtnAugAR= (ImageView) findViewById(R.id.imageAugReal);

        BtnAugAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Demo.class);
                Log.e("entered", "AR");
                startActivity(intent);
            }
        });



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

