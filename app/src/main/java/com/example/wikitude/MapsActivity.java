package com.example.wikitude;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        //mMap.setMyLocationEnabled(true);
        Antut(googleMap);

    }

    private void Antut(GoogleMap googleMap) {
        // Add a marker in Sydney and move the camera
        LatLng Loja = new LatLng(-3.9750011, -79.2080661);
        mMap.addMarker(new MarkerOptions().position(Loja).title("Instituto Tecnologico Loja")
                .snippet("Oficinas del Instutito superior Loja"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Loja));

        LatLng Bcueva = new LatLng(3.9962364, -79.198834);
        mMap.addMarker(new MarkerOptions().position(Bcueva).title("Instituto Tecnologico Loja")
                .snippet("Aulas (Software, P. alimentos, Mecanica.) del instituto "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bcueva));

        LatLng Ivalle = new LatLng(-3.9961018, -79.23166513);
        mMap.addMarker(new MarkerOptions().position(Ivalle).title("Instituto Tecnologico Loja")
                .snippet("Aulas de las carreras de ingles del instituto "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ivalle));
    }

}