package com.company.andrzej.rolki.wroclawnarolkach;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.company.andrzej.rolki.wroclawnarolkach.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float cameraZoom = 10.5f;
        LatLng wroclaw = new LatLng(51.110, 17.030);
        mMap.addMarker(new MarkerOptions().position(wroclaw).title("Marker in Wrocław"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wroclaw));
        Circle circle = mMap.addCircle(new CircleOptions()
                .center(new LatLng(51.110, 17.030))
                .radius(10000)
                .strokeColor(Color.RED));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(cameraZoom));
        final LatLngBounds wroclawVisibleArea = new LatLngBounds(
                new LatLng(51.011864, 16.886831), new LatLng(51.225803, 17.147227));
        mMap.setLatLngBoundsForCameraTarget(wroclawVisibleArea);
    }
}
