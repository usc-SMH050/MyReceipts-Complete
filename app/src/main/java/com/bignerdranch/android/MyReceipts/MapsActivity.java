package com.bignerdranch.android.MyReceipts;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.bignerdranch.android.criminalintent.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.UUID;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final String ARG_RECEIPT_ID = "receipt_id";
    private double mLatitude;
    private double mLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Bundle b = getIntent().getExtras();
        if (b != null){
            mLatitude = b.getDouble("lat");
            mLongitude = b.getDouble("lon");
        }


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        updateUI();
    }

    public void updateUI(){



        LatLng myPoint = new LatLng(mLatitude, mLongitude);

        MarkerOptions myMarker = new MarkerOptions().position(myPoint).title("Receipt location");

        mMap.clear();
        mMap.addMarker(myMarker);

        int zoomLevel = 10;

        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(myPoint, zoomLevel);
        mMap.animateCamera(update);
    }
}
