package cuceimovile.campuscucei_v2;

import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import cuceimovile.campuscucei_v2.mapsUtil.DijkstraAlgorithm;
import cuceimovile.campuscucei_v2.mapsUtil.Edge;
import cuceimovile.campuscucei_v2.mapsUtil.Graph;
import cuceimovile.campuscucei_v2.mapsUtil.Vertex;

//http://wptrafficanalyzer.in/blog/route-between-two-locations-with-waypoints-in-google-map-android-api-v2/


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener {


    LatLng routeAC[] = {};

    ///////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////
    static final LatLng CUCEI = new LatLng(20.656754, -103.325364); 	// CUCEI
    static final LatLng EDIF_A = new LatLng(20.653969, -103.325785);	// Rectoría
    static final LatLng EDIF_CID = new LatLng(20.654839, -103.325525);	// CID, Biblioteca
    static final LatLng EDIF_AL = new LatLng(20.656449, -103.325216);	// Alpha
    static final LatLng EDIF_BE = new LatLng(20.656251, -103.325208);	// Beta
    static final LatLng EDIF_E = new LatLng(20.655559, -103.325930);	// E
    static final LatLng EDIF_F = new LatLng(20.655850, -103.325929);	// F
    static final LatLng EDIF_G = new LatLng(20.655858, -103.326957); 	// G
    static final LatLng EDIF_H = new LatLng(20.656023, -103.326316); 	// H
    static final LatLng EDIF_I = new LatLng(20.656078, -103.325584); 	// I
    static final LatLng EDIF_J = new LatLng(20.656224, -103.325962); 	// J
    static final LatLng EDIF_K = new LatLng(20.656375, -103.325994); 	// K
    static final LatLng EDIF_L = new LatLng(20.656774, -103.325214); 	// L
    static final LatLng EDIF_M = new LatLng(20.656656, -103.326163);	// M
    static final LatLng EDIF_N = new LatLng(20.656952, -103.326177); 	// N
    static final LatLng EDIF_O = new LatLng(20.657321, -103.326123); 	// O
    static final LatLng EDIF_P = new LatLng(20.657328, -103.325361);	// P
    static final LatLng EDIF_Q = new LatLng(20.657612, -103.324951); 	// Q
    static final LatLng EDIF_R = new LatLng(20.657677, -103.325632); 	// R
    static final LatLng EDIF_S = new LatLng(20.657582, -103.326206); 	// S -
    static final LatLng EDIF_T = new LatLng(20.657881, -103.325469); 	// T
    static final LatLng EDIF_U = new LatLng(20.658074, -103.325461); 	// U
    static final LatLng EDIF_V = new LatLng(20.658302, -103.326233);	// V
    static final LatLng EDIF_V2 = new LatLng(20.658104, -103.326230); 	// V2
    static final LatLng EDIF_W = new LatLng(20.658061, -103.326912); 	// W
    static final LatLng EDIF_X = new LatLng(20.658259, -103.326939);	// X
    static final LatLng EDIF_Z = new LatLng(20.657246, -103.327684); 	// Z

    LatLng pointInitial = new LatLng(20.656754, -103.325364);
    LatLng pointFinal = new LatLng(20.656754, -103.325364);

    LatLng points[] = {new LatLng(20.656754, -103.325364), new LatLng(20.653969, -103.325785), new LatLng(20.654839, -103.325525),
            new LatLng(20.656449, -103.325216), new LatLng(20.656251, -103.325208), new LatLng(20.655559, -103.325930),
            new LatLng(20.655850, -103.325929), new LatLng(20.655858, -103.326957), new LatLng(20.656023, -103.326316),
            new LatLng(20.656078, -103.325584), new LatLng(20.656224, -103.325962), new LatLng(20.656375, -103.325994),
            new LatLng(20.656774, -103.325214), new LatLng(20.656656, -103.326163), new LatLng(20.656952, -103.326177),
            new LatLng(20.657321, -103.326123), new LatLng(20.657328, -103.325361), new LatLng(20.657612, -103.324951),
            new LatLng(20.657677, -103.325632), new LatLng(20.657582, -103.326206), new LatLng(20.657881, -103.325469),
            new LatLng(20.658074, -103.325461), new LatLng(20.658302, -103.326233), new LatLng(20.658104, -103.326230),
            new LatLng(20.658061, -103.326912), new LatLng(20.658259, -103.326939), new LatLng(20.657246, -103.327684)};



    Marker edif_a, edif_al, edif_be, edif_cid, edif_e, edif_f, edif_g,
            edif_h, edif_i, edif_j, edif_k, edif_l, edif_m, edif_n, edif_o,
            edif_p, edif_q, edif_r, edif_s, edif_t, edif_u, edif_v, edif_v2,
            edif_w, edif_x, edif_z;




    Polyline line;



    /// rute drawing data

    private List<Vertex> nodes;

    private List<Edge> edges;




    ///




    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the mMap is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);





        nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();


        Vertex location = new Vertex("edifA", "A",EDIF_A);
        nodes.add(location);

        location = new Vertex("edifCID","CID",EDIF_CID);
        nodes.add(location);

        location = new Vertex("edifALF","ALFA",EDIF_AL);
        nodes.add(location);

        location = new Vertex("edifBET","BETA",EDIF_BE);
        nodes.add(location);

        location = new Vertex("edifE","E",EDIF_E);
        nodes.add(location);

        location = new Vertex("edifF","F",EDIF_F);
        nodes.add(location);

        location = new Vertex("edifG","G",EDIF_G);
        nodes.add(location);

        location = new Vertex("edifH","H",EDIF_H);
        nodes.add(location);

        location = new Vertex("edifI","I",EDIF_I);
        nodes.add(location);

        location = new Vertex("edifJ","J",EDIF_J);
        nodes.add(location);

        location = new Vertex("edifK","K",EDIF_K);
        nodes.add(location);

        location = new Vertex("edifL","L",EDIF_L);
        nodes.add(location);

        location = new Vertex("edifM","M",EDIF_M);
        nodes.add(location);

        location = new Vertex("edifN","N",EDIF_N);
        nodes.add(location);

        location = new Vertex("edifO","O",EDIF_O);
        nodes.add(location);

        location = new Vertex("edifP","P",EDIF_P);
        nodes.add(location);

        location = new Vertex("edifQ","Q",EDIF_Q);
        nodes.add(location);

        location = new Vertex("edifR","R",EDIF_R);
        nodes.add(location);

        location = new Vertex("edifS","S",EDIF_S);
        nodes.add(location);

        location = new Vertex("edifT","T",EDIF_T);
        nodes.add(location);

        location = new Vertex("edifU","U",EDIF_U);
        nodes.add(location);

        location = new Vertex("edifV","V",EDIF_V);
        nodes.add(location);

        location = new Vertex("edifV2","V2",EDIF_V2);
        nodes.add(location);

        location = new Vertex("edifW","W",EDIF_W);
        nodes.add(location);

        location = new Vertex("edifX","X",EDIF_X);
        nodes.add(location);

        location = new Vertex("edifZ","Z",EDIF_Z);
        nodes.add(location);








    }






    private void addLane2Way(String laneId, int sourceLocNo, int destLocNo,
                             int distance) {
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), distance);
        Edge lane2=new Edge(laneId+"_p", nodes.get(destLocNo),nodes.get(sourceLocNo),distance);
        edges.add(lane);
        edges.add(lane2);
    }



    private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration);
        edges.add(lane);
    }


    /**
     * Manipulates the mMap once available.
     * This callback is triggered when the mMap is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        if (mMap != null) {
            mMap.setMyLocationEnabled(true);
        }

        googleMap.setOnMarkerClickListener(this);// for the clic event




        // Add a marker in cucei and move the camera
        LatLng cucei = new LatLng(20.655689, -103.325902);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(cucei));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(17.5f));


        //Blue Icons
        BitmapDescriptor bitmapDescriptorBlue = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE);


        edif_a = mMap.addMarker(new MarkerOptions()
                .position(EDIF_A)
                .title("Rectoría")
                .icon(bitmapDescriptorBlue));

        edif_al = mMap.addMarker(new MarkerOptions()
                .position(EDIF_AL)
                .title("LC1 - Edificio Alpha")
                .icon(bitmapDescriptorBlue));

        edif_be = mMap.addMarker(new MarkerOptions()
                .position(EDIF_BE)
                .title("LC2 - Edificio Beta")
                .icon(bitmapDescriptorBlue));

        edif_cid = mMap.addMarker(new MarkerOptions()
                .position(EDIF_CID)
                .title("Biblioteca - Centro Integral de Documentación")
                .icon(bitmapDescriptorBlue));

        edif_e = mMap.addMarker(new MarkerOptions()
                .position(EDIF_E)
                .title("Edificio E")
                .icon(bitmapDescriptorBlue));

        edif_f = mMap.addMarker(new MarkerOptions()
                .position(EDIF_F)
                .title("Edificio F")
                .icon(bitmapDescriptorBlue));

        edif_g = mMap.addMarker(new MarkerOptions()
                .position(EDIF_G)
                .title("Edificio G")
                .icon(bitmapDescriptorBlue));

        edif_h = mMap.addMarker(new MarkerOptions()
                .position(EDIF_H)
                .title("Edificio H")
                .icon(bitmapDescriptorBlue));

        edif_i = mMap.addMarker(new MarkerOptions()
                .position(EDIF_I)
                .title("Edificio I")
                .icon(bitmapDescriptorBlue));

        edif_j = mMap.addMarker(new MarkerOptions()
                .position(EDIF_J)
                .title("Edificio J")
                .icon(bitmapDescriptorBlue));

        edif_k = mMap.addMarker(new MarkerOptions()
                .position(EDIF_K)
                .title("Edificio K")
                .icon(bitmapDescriptorBlue));

        edif_l = mMap.addMarker(new MarkerOptions()
                .position(EDIF_L)
                .title("Edificio L")
                .icon(bitmapDescriptorBlue));

        edif_m = mMap.addMarker(new MarkerOptions()
                .position(EDIF_M)
                .title("Edificio M")
                .icon(bitmapDescriptorBlue));

        edif_n = mMap.addMarker(new MarkerOptions()
                .position(EDIF_N)
                .title("Edificio N")
                .icon(bitmapDescriptorBlue));

        edif_o = mMap.addMarker(new MarkerOptions()
                .position(EDIF_O)
                .title("Edificio O")
                .icon(bitmapDescriptorBlue));

        edif_p = mMap.addMarker(new MarkerOptions()
                .position(EDIF_P)
                .title("Edificio P")
                .icon(bitmapDescriptorBlue));

        edif_q = mMap.addMarker(new MarkerOptions()
                .position(EDIF_Q)
                .title("Edificio Q")
                .icon(bitmapDescriptorBlue));

        edif_r = mMap.addMarker(new MarkerOptions()
                .position(EDIF_R)
                .title("Edificio R")
                .icon(bitmapDescriptorBlue));

        edif_s = mMap.addMarker(new MarkerOptions()
                .position(EDIF_S)
                .title("Edificio S")
                .icon(bitmapDescriptorBlue));

        edif_t = mMap.addMarker(new MarkerOptions()
                .position(EDIF_T)
                .title("Edificio T")
                .icon(bitmapDescriptorBlue));

        edif_u = mMap.addMarker(new MarkerOptions()
                .position(EDIF_U)
                .title("Edificio U")
                .icon(bitmapDescriptorBlue));

        edif_v = mMap.addMarker(new MarkerOptions()
                .position(EDIF_V)
                .title("Edificio V")
                .icon(bitmapDescriptorBlue));

        edif_v2 = mMap.addMarker(new MarkerOptions()
                .position(EDIF_V2)
                .title("Edificio V2")
                .icon(bitmapDescriptorBlue));

        edif_w = mMap.addMarker(new MarkerOptions()
                .position(EDIF_W)
                .title("Edificio W")
                .icon(bitmapDescriptorBlue));

        edif_x = mMap.addMarker(new MarkerOptions()
                .position(EDIF_X)
                .title("Edificio X")
                .icon(bitmapDescriptorBlue));

        edif_z = mMap.addMarker(new MarkerOptions()
                .position(EDIF_Z)
                .title("Edificio Z")
                .icon(bitmapDescriptorBlue));




    }




    public boolean onMarkerClick(final Marker marker) { //dont know why doesnt  works


        LatLng EdifFinal = null;
        LatLng Post_init = EDIF_G; //change later

        if (marker.equals(edif_a))
        {
            /*
            mMap.addPolyline(new PolylineOptions()
                    .add(EDIF_E , EDIF_A)
                    .width(3)
                    .color(Color.RED));

            */

            // Getting URL to the Google Directions API


            EdifFinal=EDIF_A;

        }

        if (marker.equals(edif_cid))
        {
            EdifFinal=EDIF_CID;
        }

        if (marker.equals(edif_al))
        {
            EdifFinal=EDIF_AL;
        }

        if (marker.equals(edif_be))
        {
            EdifFinal=EDIF_BE;
        }

        if (marker.equals(edif_e))
        {
            EdifFinal=EDIF_E;
        }

        if (marker.equals(edif_f))
        {
            EdifFinal=EDIF_F;
        }

        if (marker.equals(edif_g))
        {
            EdifFinal=EDIF_G;
        }

        if (marker.equals(edif_h))
        {
            EdifFinal=EDIF_H;
        }

        if (marker.equals(edif_i))
        {
            EdifFinal=EDIF_I;
        }

        if (marker.equals(edif_j))
        {
            EdifFinal=EDIF_J;
        }

        if (marker.equals(edif_k))
        {
            EdifFinal=EDIF_K;
        }

        if (marker.equals(edif_l))
        {
            EdifFinal=EDIF_L;
        }

        if (marker.equals(edif_m))
        {
            EdifFinal=EDIF_M;
        }

        if (marker.equals(edif_n))
        {
            EdifFinal=EDIF_N;
        }

        if (marker.equals(edif_o))
        {
            EdifFinal=EDIF_O;
        }

        if (marker.equals(edif_p))
        {
            EdifFinal=EDIF_P;
        }

        if (marker.equals(edif_q))
        {
            EdifFinal=EDIF_Q;
        }

        if (marker.equals(edif_r))
        {
            EdifFinal=EDIF_R;
        }

        if (marker.equals(edif_s))
        {
            EdifFinal=EDIF_S;
        }

        if (marker.equals(edif_t))
        {
            EdifFinal=EDIF_T;
        }

        if (marker.equals(edif_u))
        {
            EdifFinal=EDIF_U;
        }

        if (marker.equals(edif_v))
        {
            EdifFinal=EDIF_V;
        }

        if (marker.equals(edif_v2))
        {
            EdifFinal=EDIF_V2;
        }

        if (marker.equals(edif_w))
        {
            EdifFinal=EDIF_W;
        }

        if (marker.equals(edif_x))
        {
            EdifFinal=EDIF_X;
        }

        if (marker.equals(edif_z))
        {
            EdifFinal=EDIF_Z;
        }



        if(EdifFinal!=null) {


            String url = getDirectionsUrl(Post_init, EdifFinal);

            DownloadTask downloadTask = new DownloadTask();

            // Start downloading json data from Google Directions API
            downloadTask.execute(url);

            Log.e("Edif", EdifFinal.toString());
        }







        return false;
    }



    private String getDirectionsUrl(LatLng origin,LatLng dest){

        // Origin of route
        String str_origin = "origin="+origin.latitude+","+origin.longitude;

        // Destination of route
        String str_dest = "destination="+dest.latitude+","+dest.longitude;

        String Mode= "mode=walking";


        String KEY = "AIzaSyAbZ2FEYLPlqyUcvei2h_wUOjqMEeMDshY";// kew for paths

        // Building the parameters to the web service
        String parameters = str_origin+"&"+str_dest+"&"+Mode+"&"+KEY;

        // Output format
        String output = "json";

        // Building the url to the web service
        String url = "https://maps.googleapis.com/maps/api/directions/"+output+"?"+parameters;

        Log.e("Json_Url: ",url);

        return url;
    }

    /** A method to download json data from url */
    private String downloadUrl(String strUrl) throws IOException {
        String data = "";
        InputStream iStream = null;
        HttpURLConnection urlConnection = null;
        try{
            URL url = new URL(strUrl);

            // Creating an http connection to communicate with url
            urlConnection = (HttpURLConnection) url.openConnection();

            // Connecting to url
            urlConnection.connect();

            // Reading data from url
            iStream = urlConnection.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));

            StringBuffer sb  = new StringBuffer();

            String line = "";
            while( ( line = br.readLine())  != null){
                sb.append(line);
            }

            data = sb.toString();

            br.close();

        }catch(Exception e){
            Log.d("Exception url", e.toString());
        }finally{
            iStream.close();
            urlConnection.disconnect();
        }
        return data;
    }





    // Fetches data from url passed
    private class DownloadTask extends AsyncTask<String, Void, String> {

        // Downloading data in non-ui thread
        @Override
        protected String doInBackground(String... url) {

            // For storing data from web service

            String data = "";

            try{
                // Fetching the data from web service
                data = downloadUrl(url[0]);
            }catch(Exception e){
                Log.d("Background Task",e.toString());
            }
            return data;
        }

        // Executes in UI thread, after the execution of
        // doInBackground()
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            ParserTask parserTask = new ParserTask();

            // Invokes the thread for parsing the JSON data
            parserTask.execute(result);
        }
    }

    /** A class to parse the Google Places in JSON format */
    private class ParserTask extends AsyncTask<String, Integer, List<List<HashMap<String,String>>> >{

        // Parsing the data in non-ui thread
        @Override
        protected List<List<HashMap<String, String>>> doInBackground(String... jsonData) {

            JSONObject jObject;
            List<List<HashMap<String, String>>> routes = null;

            try{
                jObject = new JSONObject(jsonData[0]);
                DirectionsJSONParser parser = new DirectionsJSONParser();

                // Starts parsing data
                routes = parser.parse(jObject);
            }catch(Exception e){
                e.printStackTrace();
            }
            return routes;
        }

        // Executes in UI thread, after the parsing process
        @Override
        protected void onPostExecute(List<List<HashMap<String, String>>> result) {

            ArrayList<LatLng> points = null;
            PolylineOptions lineOptions = null;

            // Traversing through all the routes
            for(int i=0;i<result.size();i++){
                points = new ArrayList<LatLng>();
                lineOptions = new PolylineOptions();

                // Fetching i-th route
                List<HashMap<String, String>> path = result.get(i);

                // Fetching all the points in i-th route
                for(int j=0;j<path.size();j++){
                    HashMap<String,String> point = path.get(j);

                    double lat = Double.parseDouble(point.get("lat"));
                    double lng = Double.parseDouble(point.get("lng"));
                    LatLng position = new LatLng(lat, lng);

                    points.add(position);
                }

                // Adding all the points in the route to LineOptions
                lineOptions.addAll(points);
                lineOptions.width(2);
                lineOptions.color(Color.RED);
            }

            // Drawing polyline in the Google Map for the i-th route
            mMap.addPolyline(lineOptions);
        }
    }



}
