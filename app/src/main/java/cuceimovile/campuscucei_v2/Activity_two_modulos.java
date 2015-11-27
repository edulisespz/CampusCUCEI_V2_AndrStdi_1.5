package cuceimovile.campuscucei_v2;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import cuceimovile.campuscucei_v2.AndroidAR.activity.Demo;

public class Activity_two_modulos extends AppCompatActivity {




    Context context;
    int select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_modulos);

        setTitle("Modulos");

        setImage();

        loadListView();
        RegisterClic();





    }

    private void setImage(){
       Random Ran = new Random();



        RelativeLayout layout= (RelativeLayout)findViewById(R.id.activity_two_layout);



        select= Ran.nextInt(3);
        Log.e("entered", Integer.toString(select ) );
        switch (select){
            case 0:

                layout.setBackgroundResource(R.drawable.alberca);
                break;
            case 1:
                layout.setBackgroundResource(R.drawable.quimicas);
                break;
            case 2:
                layout.setBackgroundResource(R.drawable.rectoria);

                break;

        }


    }


    public void loadListView(){
        String[] listaMod = {"Modulo A","Modulo AB","Modulo D","Modulo E","Modulo F","Modulo G","Modulo H","Modulo I","Modulo J"
                ,"Modulo K","Modulo L","Modulo M","Modulo N","Modulo O","Modulo Otro","Modulo P"
                ,"Modulo Q","Modulo R","Modulo S","Modulo T","Modulo U","Modulo V","Modulo W","Modulo X","Modulo Z"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.modulos_list_item,listaMod){

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView text = (TextView) view.findViewById(R.id.activity_two_list_items);

                switch (select){
                    case 0:
                        text.setTextColor(Color.parseColor("#e3d35a"));
                        break;
                    case 1:
                        text.setTextColor(Color.parseColor("#F7931E"));
                        break;
                    case 2:
                        text.setTextColor(Color.WHITE);
                        break;

                }

                return view;
            }
        };

        ListView lista= (ListView) findViewById(R.id.listViewModulos);




        lista.setAdapter(adapter);
    }

    private void RegisterClic() {
        ListView lista = (ListView) findViewById(R.id.listViewModulos);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                //selectModulo( position );// Position starts in 0

                Intent intent = new Intent(getApplicationContext(), ModulosView.class);
                intent.putExtra("IDnumModulo",position);
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
