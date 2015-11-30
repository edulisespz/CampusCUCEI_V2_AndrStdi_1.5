package cuceimovile.campuscucei_v2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


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


    Marker edif_a, edif_al, edif_be, edif_cid, edif_e, edif_f, edif_g,
            edif_h, edif_i, edif_j, edif_k, edif_l, edif_m, edif_n, edif_o,
            edif_p, edif_q, edif_r, edif_s, edif_t, edif_u, edif_v, edif_v2,
            edif_w, edif_x, edif_z;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the mMap is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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



        // Add a marker in cucei and move the camera
        LatLng cucei = new LatLng(20.655689, -103.325902);
        //mMap.addMarker(new MarkerOptions().position(cucei).title("CUCEI"));
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



}
