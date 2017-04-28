package com.example.guyrichie.policestations;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Stations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.police_stations);
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
        LatLng sydney = new LatLng(5.648616,-0.189135 );
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Legon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,15));
        LatLng akuafo = new LatLng(5.659087,-0.183456 );
        mMap.addMarker(new MarkerOptions().position(akuafo).title("Marker in Akuafo").icon(BitmapDescriptorFactory.fromResource(R.drawable.goil)));
        LatLng place1 = new LatLng(5.668906,-0.193425 );
        mMap.addMarker(new MarkerOptions().position(place1).title("Marker in Akuafo").icon(BitmapDescriptorFactory.fromResource(R.drawable.goil)));
        LatLng place2 = new LatLng(5.67123,-0.186788 );
        mMap.addMarker(new MarkerOptions().position(place2).title("Marker in Akuafo").icon(BitmapDescriptorFactory.fromResource(R.drawable.goil)));
        LatLng place3 = new LatLng(5.73456,-0.167899 );
        mMap.addMarker(new MarkerOptions().position(place3).title("Marker in Akuafo").icon(BitmapDescriptorFactory.fromResource(R.drawable.goil)));
        LatLng place4 = new LatLng(5.790878,-0.190876 );
        mMap.addMarker(new MarkerOptions().position(place4).title("Marker in Akuafo").icon(BitmapDescriptorFactory.fromResource(R.drawable.goil)));
    }
}
