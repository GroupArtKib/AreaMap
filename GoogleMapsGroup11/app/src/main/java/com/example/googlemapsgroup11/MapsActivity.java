package com.example.googlemapsgroup11;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

        // Add a marker in Sydney and move the camera
        LatLng cabi = new LatLng(16.018656, 120.540809);
        mMap.addMarker(new MarkerOptions().position(cabi).title("Cabilaoan, Laoac Pangasinan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cabi));


        LatLng dal = new LatLng(16.018786, 120.548686);
        mMap.addMarker(new MarkerOptions().position(dal).title("D. Alarcio, Laoac Pangasinan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dal));

        LatLng pin = new LatLng(15.980460, 120.516089);
        mMap.addMarker(new MarkerOptions().position(pin).title("Pinmaludpod, Urdaneta City Pangasinan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pin));

        LatLng vil = new LatLng(15.899699, 120.583413);
        mMap.addMarker(new MarkerOptions().position(vil).title("Mapurac, Capulaan, Villasis Pangasinan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vil));

        LatLng ucu = new LatLng(15.981798, 120.560119);
        mMap.addMarker(new MarkerOptions().position(ucu).title("Urdaneta City University"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ucu));


        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.980633, 120.560624))
                .radius(10000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.018656, 120.540809),
                        new LatLng(16.017310, 120.515127),
                        new LatLng(15.981798, 120.560119))
                .width(10)
                .color(Color.BLUE));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.018786, 120.548686),
                        new LatLng(16.017310, 120.515127),
                        new LatLng(15.981798, 120.560119))
                .width(5)
                .color(Color.YELLOW));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.980460, 120.516089),
                        new LatLng(15.975591, 120.563726),
                        new LatLng(15.979999, 120.563407),
                        new LatLng(15.981798, 120.560119))
                .width(10)
                .color(Color.WHITE));


        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.899699, 120.583413),
                        new LatLng(15.901697, 120.587501),
                        new LatLng(15.979294, 120.570948),
                        new LatLng(15.981798, 120.560119))
                .width(10)
                .color(Color.RED));

    }
}