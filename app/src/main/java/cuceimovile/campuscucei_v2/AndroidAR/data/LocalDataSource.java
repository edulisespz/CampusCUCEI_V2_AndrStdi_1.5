package cuceimovile.campuscucei_v2.AndroidAR.data;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;


import cuceimovile.campuscucei_v2.AndroidAR.ui.IconMarker;
import cuceimovile.campuscucei_v2.AndroidAR.ui.Marker;
import cuceimovile.campuscucei_v2.R;

/**
 * This class should be used as a example local data source. It is an example of
 * how to add data programatically. You can add data either programatically,
 * SQLite or through any other source.
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class LocalDataSource extends DataSource {

    private List<Marker> cachedMarkers = new ArrayList<Marker>();
    private static Bitmap icon = null;

    public LocalDataSource(Resources res) {
        if (res == null) throw new NullPointerException();

        createIcon(res);
    }

    protected void createIcon(Resources res) {
        if (res == null) throw new NullPointerException();

        icon = BitmapFactory.decodeResource(res, R.drawable.icon);
    }

    public List<Marker> getMarkers() {
        Marker atl = new IconMarker("ATL ICON", 39.931268, -75.051262, 0, Color.DKGRAY, icon);
        cachedMarkers.add(atl);

        Marker home = new Marker("ATL CIRCLE", 39.931269, -75.051231, 0, Color.YELLOW);
        cachedMarkers.add(home);


        /*codigo Agregado, no parte del fraework original */



        Marker moduloA = new Marker("Modulo A", 20.654287,-103.325914, 0, Color.BLUE);
        cachedMarkers.add(moduloA);

        Marker moduloC = new Marker("M—dulo C", 20.654222,-103.325145, 0, Color.BLUE);
        cachedMarkers.add(moduloC);
        Marker moduloD = new Marker("M—dulo D", 20.654506,-103.325413, 0, Color.BLUE);
        cachedMarkers.add(moduloD);

        Marker northE = new Marker("northE", 20.655663,-103.325922,0,Color.BLACK);
        Marker eastE = new Marker("eastE", 20.655658,-103.325237,0,Color.BLACK);
        Marker southE = new Marker("southE", 20.655487,-103.325901,0,Color.BLACK);
        Marker westE = new Marker("westE", 20.655503,-103.327223,0,Color.BLACK);
        Marker moduloE = new Marker("M—dulo E", 20.655575,-103.325898, 0, Color.BLUE);
        cachedMarkers.add(moduloE);
        //Building edificioModuloE = new Building("M—dulo E", northE,eastE,southE,westE,moduloE);
        //cachedBuildings.add(edificioModuloE);

        Marker moduloF = new Marker("M—dulo F", 20.655879,-103.325941, 1558.229, Color.CYAN);
        cachedMarkers.add(moduloF);
        Marker moduloG = new Marker("M—dulo G", 20.655861,-103.326942, 0, Color.BLUE);
        cachedMarkers.add(moduloG);
        Marker moduloH = new Marker("M—dulo H", 20.656037,-103.326309, 0, Color.BLUE);
        cachedMarkers.add(moduloH);
        Marker moduloI = new Marker("M—dulo I", 20.656099,-103.32555, 0, Color.BLUE);
        cachedMarkers.add(moduloI);
        Marker moduloJ = new Marker("M—dulo J", 20.656236,-103.325955, 0, Color.BLUE);
        cachedMarkers.add(moduloJ);
        Marker moduloK = new Marker("M—dulo K", 20.656383,-103.325991, 0, Color.BLUE);
        cachedMarkers.add(moduloK);
        Marker moduloL = new Marker("M—dulo L", 20.656739,-103.325358, 0, Color.BLUE);
        cachedMarkers.add(moduloL);

        Marker northM = new Marker("northM", 20.656795,-103.326155,0,Color.BLACK);
        Marker eastM = new Marker("eastM", 20.65668,-103.325839,0,Color.BLACK);
        Marker southM = new Marker("southM", 20.656488,-103.326136,0,Color.BLACK);
        Marker westM = new Marker("westM", 20.656636,-103.326488,0,Color.BLACK);
        Marker moduloM = new Marker("M—dulo M", 20.656675,-103.326169, 0, Color.GRAY);
        cachedMarkers.add(moduloM);


        Marker northN = new Marker("northN", 20.657077,-103.326209,0,Color.BLACK);
        Marker eastN = new Marker("eastN", 20.656979,-103.32588,0,Color.BLACK);
        Marker southN = new Marker("southN", 20.656795,-103.326155,0,Color.BLACK);
        Marker westN = new Marker("westN", 20.65692,-103.326507,0,Color.BLACK);
        Marker moduloN = new Marker("M—dulo N", 20.656962,-103.32614, 0, Color.GRAY);
        cachedMarkers.add(moduloN);


        Marker moduloO = new Marker("M—dulo O", 20.657314,-103.32613, 0, Color.BLUE);
        cachedMarkers.add(moduloO);
        Marker moduloP = new Marker("M—dulo P", 20.65734,-103.325526, 0, Color.BLUE);
        cachedMarkers.add(moduloP);
        Marker moduloQ = new Marker("M—dulo Q", 20.657617,-103.324964, 0, Color.BLUE);
        cachedMarkers.add(moduloQ);
        Marker moduloR = new Marker("M—dulo R", 20.657658,-103.32568, 0, Color.BLUE);
        cachedMarkers.add(moduloR);
        Marker moduloS = new Marker("M—dulo S", 20.65763,-103.326349, 0, Color.BLUE);
        cachedMarkers.add(moduloS);
        Marker moduloT = new Marker("M—dulo T", 20.65789,-103.325472, 0, Color.BLUE);
        cachedMarkers.add(moduloT);
        Marker moduloU = new Marker("M—dulo U", 20.658106,-103.325477, 0, Color.BLUE);
        cachedMarkers.add(moduloU);
        Marker moduloV1 = new Marker("M—dulo V1", 20.658309,-103.326248, 0, Color.BLUE);
        cachedMarkers.add(moduloV1);
        Marker moduloV2 = new Marker("M—dulo V2", 20.658101,-103.326248, 0, Color.BLUE);
        cachedMarkers.add(moduloV2);
        Marker moduloW = new Marker("M—dulo W", 20.658073,-103.326824, 0, Color.BLUE);
        cachedMarkers.add(moduloW);
        Marker moduloX = new Marker("M—dulo X", 20.658265,-103.326956, 0, Color.BLUE);
        cachedMarkers.add(moduloX);
        Marker moduloZ1 = new Marker("M—dulo Z1", 20.657258,-103.327685, 0, Color.BLUE);
        cachedMarkers.add(moduloZ1);
        Marker moduloZ2 = new Marker("M—dulo Z2", 20.657292,-103.327862, 0, Color.BLUE);
        cachedMarkers.add(moduloZ2);
        Marker moduloAlfa = new Marker("M—dulo Alfa", 20.656446,-103.325324, 0, Color.RED);
        cachedMarkers.add(moduloAlfa);
        //*/
        Marker moduloBeta = new Marker("M—dulo Beta", 20.656242,-103.325324, 0, Color.RED);
        cachedMarkers.add(moduloBeta);

        /* FIN codigo Agregado, no parte del fraework original */



        /*
         * Marker lon = new IconMarker(
         * "I am a really really long string which should wrap a number of times on the screen."
         * , 39.95335, -74.9223445, 0, Color.MAGENTA, icon);
         * cachedMarkers.add(lon); Marker lon2 = new IconMarker(
         * "2: I am a really really long string which should wrap a number of times on the screen."
         * , 39.95334, -74.9223446, 0, Color.MAGENTA, icon);
         * cachedMarkers.add(lon2);
         */

        /*
         * float max = 10; for (float i=0; i<max; i++) { Marker marker = null;
         * float decimal = i/max; if (i%2==0) marker = new Marker("Test-"+i,
         * 39.99, -75.33+decimal, 0, Color.LTGRAY); marker = new
         * IconMarker("Test-"+i, 39.99+decimal, -75.33, 0, Color.LTGRAY, icon);
         * cachedMarkers.add(marker); }
         */

        return cachedMarkers;
    }
}
