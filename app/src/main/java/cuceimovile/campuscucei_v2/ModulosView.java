package cuceimovile.campuscucei_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class ModulosView extends AppCompatActivity {

    WebView webView;

    ImageView imageViewModulospart1;
    ImageView imageViewModulospart2;
    ImageView imageViewModulospart3;
    ImageView imageViewModulospart4;
    ImageView imageViewModulospart5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulos_view);

        int position=0;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("IDnumModulo");
        }

        selectModulo(position);
    }



    private void selectModulo(int PositionID) {
        webView = (WebView) findViewById(R.id.webView1);


        imageViewModulospart1 = (ImageView) findViewById(R.id.imageView_part1);
        imageViewModulospart2 = (ImageView) findViewById(R.id.imageView_part2);
        imageViewModulospart3 = (ImageView) findViewById(R.id.imageView_part3);
        imageViewModulospart4 = (ImageView) findViewById(R.id.imageView_part4);
        imageViewModulospart5 = (ImageView) findViewById(R.id.imageView_part5);
        String cad = Integer.toString(PositionID);



        Log.e("_", cad);

        switch (PositionID){
            case 0:
                webView.loadUrl("file:///android_asset/moduloA.html");

                setTitle("Modulo A");

                imageViewModulospart1.setImageResource(R.drawable.moduloa_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloa_part2);
                imageViewModulospart3.setImageResource(R.drawable.moduloa_part3);
                imageViewModulospart4.setImageResource(R.drawable.moduloa_part4);
                imageViewModulospart5.setImageResource(R.drawable.moduloa_part5);
                break;

            case 1:
                webView.loadUrl("file:///android_asset/moduloAB.html");

                setTitle("Modulo A&B");

                imageViewModulospart1.setImageResource(R.drawable.moduloab_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloab_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 2:
                webView.loadUrl("file:///android_asset/moduloD.html");

                setTitle("Modulo D");
                imageViewModulospart1.setImageResource(R.drawable.modulod_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulod_part2);
                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 3:
                webView.loadUrl("file:///android_asset/moduloE.html");
                setTitle("Modulo E");
                imageViewModulospart1.setImageResource(R.drawable.moduloe_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloe_part2);
                imageViewModulospart3.setImageResource(R.drawable.moduloe_part3);
                imageViewModulospart4.setImageResource(R.drawable.moduloe_part4);
                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 4:
                webView.loadUrl("file:///android_asset/moduloF.html");
                setTitle("Modulo F");
                imageViewModulospart1.setImageResource(R.drawable.modulof_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulof_part2);
                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 5:
                webView.loadUrl("file:///android_asset/moduloG.html");
                setTitle("Modulo G");
                imageViewModulospart1.setImageResource(R.drawable.modulog_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulog_part2);
                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 6:
                webView.loadUrl("file:///android_asset/moduloH.html");
                setTitle("Modulo H");
                imageViewModulospart1.setImageResource(R.drawable.moduloh_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloh_part2);
                imageViewModulospart3.setImageResource(R.drawable.moduloh_part3);

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 7:
                webView.loadUrl("file:///android_asset/moduloI.html");
                setTitle("Modulo I");
                imageViewModulospart1.setImageResource(R.drawable.moduloi_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloi_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 8:
                webView.loadUrl("file:///android_asset/moduloJ.html");
                setTitle("Modulo J");
                imageViewModulospart1.setImageResource(R.drawable.moduloj_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloj_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 9:
                webView.loadUrl("file:///android_asset/moduloK.html");
                setTitle("Modulo K");
                imageViewModulospart1.setImageResource(R.drawable.modulok_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulok_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 10:
                webView.loadUrl("file:///android_asset/moduloL.html");
                setTitle("Modulo L");
                imageViewModulospart1.setImageResource(R.drawable.modulol_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulol_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 11:
                webView.loadUrl("file:///android_asset/moduloM.html");
                setTitle("Modulo M");
                imageViewModulospart1.setImageResource(R.drawable.modulom_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulom_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 12:
                webView.loadUrl("file:///android_asset/moduloN.html");
                setTitle("Modulo N");
                imageViewModulospart1.setImageResource(R.drawable.modulon_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulon_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 13:
                webView.loadUrl("file:///android_asset/moduloO.html");
                setTitle("Modulo O");
                imageViewModulospart1.setImageResource(R.drawable.moduloo_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloo_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 14:
                webView.loadUrl("file:///android_asset/moduloOtro.html");
                setTitle("Modulo Otro");
                imageViewModulospart1.setImageResource(R.drawable.modulootros_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulootros_part2);
                imageViewModulospart3.setImageResource(R.drawable.modulootros_part3);
                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();
                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 15:
                webView.loadUrl("file:///android_asset/moduloP.html");
                setTitle("Modulo P");
                imageViewModulospart1.setImageResource(R.drawable.modulop_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulop_part2);
                imageViewModulospart3.setImageResource(R.drawable.modulop_part3);

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 16:
                webView.loadUrl("file:///android_asset/moduloQ.html");
                setTitle("Modulo Q");
                imageViewModulospart1.setImageResource(R.drawable.moduloq_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloq_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 17:
                webView.loadUrl("file:///android_asset/moduloR.html");
                setTitle("Modulo R");
                imageViewModulospart1.setImageResource(R.drawable.modulor_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulor_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 18:
                webView.loadUrl("file:///android_asset/moduloS.html");
                setTitle("Modulo S");
                imageViewModulospart1.setImageResource(R.drawable.modulos_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulos_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 19:
                webView.loadUrl("file:///android_asset/moduloT.html");
                setTitle("Modulo T");
                imageViewModulospart1.setImageResource(R.drawable.modulot_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulot_part2);

                imageViewModulospart3.setImageResource(R.drawable.modulot_part3);

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 20:
                webView.loadUrl("file:///android_asset/moduloU.html");
                setTitle("Modulo U");
                imageViewModulospart1.setImageResource(R.drawable.modulou_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulou_part2);
                imageViewModulospart3.setImageResource(R.drawable.modulou_part3);

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 21:
                webView.loadUrl("file:///android_asset/moduloV.html");
                setTitle("Modulo V");
                imageViewModulospart1.setImageResource(R.drawable.modulov_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulov_part2);
                imageViewModulospart3.setImageResource(R.drawable.modulov_part3);
                imageViewModulospart4.setImageResource(R.drawable.modulov_part4);
                imageViewModulospart5.setImageResource(R.drawable.modulov_part5);

                break;

            case 22:
                webView.loadUrl("file:///android_asset/moduloW.html");
                setTitle("Modulo W");
                imageViewModulospart1.setImageResource(R.drawable.modulow_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulow_part2);
                imageViewModulospart3.setImageResource(R.drawable.modulow_part3);

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 23:
                webView.loadUrl("file:///android_asset/moduloX.html");
                setTitle("Modulo X");
                imageViewModulospart1.setImageResource(R.drawable.modulox_part1);
                imageViewModulospart2.setImageResource(R.drawable.modulox_part2);
                imageViewModulospart3.setImageResource(R.drawable.modulox_part3);

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;

            case 24:
                webView.loadUrl("file:///android_asset/moduloZ.html");
                setTitle("Modulo Z");
                imageViewModulospart1.setImageResource(R.drawable.moduloz_part1);
                imageViewModulospart2.setImageResource(R.drawable.moduloz_part2);

                imageViewModulospart3.getLayoutParams().width=0;
                imageViewModulospart3.requestLayout();

                imageViewModulospart4.getLayoutParams().width=0;
                imageViewModulospart4.requestLayout();

                imageViewModulospart5.getLayoutParams().width=0;
                imageViewModulospart5.requestLayout();
                break;
        }





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_modulos_view, menu);
        return true;
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
