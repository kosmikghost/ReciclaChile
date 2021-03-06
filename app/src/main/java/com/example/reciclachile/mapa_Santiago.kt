package com.piratedog.reciclachile

import android.annotation.SuppressLint
import android.app.Activity
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.*

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class mapa_Santiago : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private val LOCATION_PERMISSION_REQUEST = 1
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var locationRequest: LocationRequest
    private lateinit var locationCallback: LocationCallback

    private fun getLocationAccess() {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.isMyLocationEnabled = true
            getLocationUpdates()
            startLocationUpdates()

        }
        else
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST)
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (requestCode == LOCATION_PERMISSION_REQUEST) {
            if (grantResults.contains(PackageManager.PERMISSION_GRANTED)) {
                mMap.isMyLocationEnabled = true
                getLocationAccess()
            }
            else {
                Toast.makeText(this, "Usuario no ha permitido uso de ubicación", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa__santiago)



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)



    }

    private fun getLocationUpdates() {
        locationRequest = LocationRequest()
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY

        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                if (locationResult.locations.isNotEmpty()) {
                    val location = locationResult.lastLocation
                    if (location != null) {
                        val latLng = LatLng(location.latitude, location.longitude)
                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15f))
                    }
                }
            }
        }
    }

    private fun startLocationUpdates() {
        fusedLocationClient.requestLocationUpdates(
                locationRequest,
                locationCallback,
                null
        )
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
    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap

        getLocationAccess()

        //val santiago = LatLng(-33.448760060942966, -70.6524823222668)
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santiago, 11f))

        val point1 = LatLng(-33.586319, -70.629181)
        mMap.addMarker(
            MarkerOptions().position(point1).title("Av. Santa Rosa 13015").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point2 = LatLng(-33.584889, -70.623267)
        mMap.addMarker(
            MarkerOptions().position(point2).title("Avenida Gabriela 02710").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point3 = LatLng(-33.586719, -70.636233)
        mMap.addMarker(
            MarkerOptions().position(point3).title("Ciudad de México 1589").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point4 = LatLng(-33.564418, -70.630132)
        mMap.addMarker(
            MarkerOptions().position(point4).title("Avenida Santa Rosa 10934")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point5 = LatLng(-33.577687, -70.642512)
        mMap.addMarker(
            MarkerOptions().position(point5).title("Iquique 1130").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point6 = LatLng(-33.585254, -70.609536)
        mMap.addMarker(
            MarkerOptions().position(point6).title("Miguel Angel / La Serena").snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point7 = LatLng(-33.574051, -70.604156)
        mMap.addMarker(
            MarkerOptions().position(point7).title("Creta Norte 3980")
                .snippet("Vidrio, Papel, Metal, Plástico, Cartón, Cartón para Bebida")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point8 = LatLng(-33.562678, -70.635263)
        mMap.addMarker(
            MarkerOptions().position(point8).title("SantaTrinidad 10977").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point9 = LatLng(-33.564016, -70.644928)
        mMap.addMarker(
            MarkerOptions().position(point9).title("Avenida Observatorio 1885")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point10 = LatLng(-33.586265, -70.593379)
        mMap.addMarker(
            MarkerOptions().position(point10).title("Piguchén 2788")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point11 = LatLng(-33.58415520, -70.66086440)
        mMap.addMarker(
            MarkerOptions().position(point11).title("Domingo Sta Cruz 648-622")
                .snippet("Punto Limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point12 = LatLng(-33.58051300, -70.66944500)
        mMap.addMarker(
            MarkerOptions().position(point12).title("Vecinal Sur 1453-1493")
                .snippet("Vidrio, Papel, Cartón, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point13 = LatLng(-33.57689550, -70.66980030)
        mMap.addMarker(
            MarkerOptions().position(point13).title("Nva Imperial 761").snippet("Celular, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point14 = LatLng(-33.57117600, -70.67321200)
        mMap.addMarker(
            MarkerOptions().position(point14).title("Av. Padre Hurtado 11694").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point15 = LatLng(-33.58000300, -70.68189400)
        mMap.addMarker(
            MarkerOptions().position(point15)
                .title("Av. Lo Blanco #550, paradero 39 de Gran Avenida").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point16 = LatLng(-33.57061340, -70.67979670)
        mMap.addMarker(
            MarkerOptions().position(point16).title("Los Boldos 12436").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point17 = LatLng(-33.57028700, -70.68073500)
        mMap.addMarker(
            MarkerOptions().position(point17).title("Av. Central 498")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point18 = LatLng(-33.57063570, -70.68769710)
        mMap.addMarker(
            MarkerOptions().position(point18).title("Gran Avenida Jose Miguel Carrera 12552 (Escuela Marcial Martínez de Ferrari)")
                .snippet("Celular, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point19 = LatLng(-33.57145600, -70.68844100)
        mMap.addMarker(
            MarkerOptions().position(point19).title("Card José María Caro").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point20 = LatLng(-33.57439800, -70.69081800)
        mMap.addMarker(
            MarkerOptions().position(point20).title("Gran Avenida Jose Miguel Carrera 13065-13119")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point21 = LatLng(-33.59258590, -70.68711520)
        mMap.addMarker(
            MarkerOptions().position(point21).title("María Graham 682-662").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point22 = LatLng(-33.58930130, -70.69438360)
        mMap.addMarker(
            MarkerOptions().position(point22).title("José Miguel Carrera 0227").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point23 = LatLng(-33.59204410, -70.70084150)
        mMap.addMarker(
            MarkerOptions().position(point23).title("Bulnes 343, San Bernardo")
                .snippet("Celular, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point24 = LatLng(-33.592009, -70.703339)
        mMap.addMarker(
            MarkerOptions().position(point24).title("O'Higgins 432-498").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point25 = LatLng(-33.592954, -70.704076)
        mMap.addMarker(
            MarkerOptions().position(point25).title("Arturo Prat 571").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point26 = LatLng(-33.589653, -70.697876)
        mMap.addMarker(
            MarkerOptions().position(point26).title("José Toribio Medina 197-149").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point27 = LatLng(-33.594031, -70.699707)
        mMap.addMarker(
            MarkerOptions().position(point27).title("Arturo Prat 178").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point28 = LatLng(-33.595560, -70.700564)
        mMap.addMarker(
            MarkerOptions().position(point28).title("José Joaquín Pérez 617")
                .snippet("Celular, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point29 = LatLng(-33.595517, -70.700855)
        mMap.addMarker(
            MarkerOptions().position(point29).title("Covadonga 234").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point30 = LatLng(-33.573288, -70.710396)
        mMap.addMarker(
            MarkerOptions().position(point30).title("La Quebrada 1274-1364").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point31 = LatLng(-33.565853, -70.706970)
        mMap.addMarker(
            MarkerOptions().position(point31).title("Arturo Gordon 12061-12251").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point32 = LatLng(-33.55877040, -70.71240560)
        mMap.addMarker(
            MarkerOptions().position(point32).title("Av. Las Acacias 184").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point33 = LatLng(-33.567548, -70.660695)
        mMap.addMarker(
            MarkerOptions().position(point33).title("Sta Inés 1317").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point34 = LatLng(-33.563382, -70.663343)
        mMap.addMarker(
            MarkerOptions().position(point34).title("Los Olivos 10974")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point35 = LatLng(-33.557268, -70.664593)
        mMap.addMarker(
            MarkerOptions().position(point35).title("Javiera Carrera 323-327")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point36 = LatLng(-33.556093, -70.657536)
        mMap.addMarker(
            MarkerOptions().position(point36).title("Almirante Riveros 10123-10135")
                .snippet("Celular, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point37 = LatLng(-33.554049, -70.676963)
        mMap.addMarker(
            MarkerOptions().position(point37).title("Open Plaza El Bosque")
                .snippet("Punto Limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point38 = LatLng(-33.551917, -70.675822)
        mMap.addMarker(
            MarkerOptions().position(point38).title("Luis Barros Borgoño 167-201")
                .snippet("Celular, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point39 = LatLng(-33.550363, -70.672121)
        mMap.addMarker(
            MarkerOptions().position(point39).title("Gran Avenida Jose Miguel Carrera")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point40 = LatLng(-33.541989, -70.684320)
        mMap.addMarker(
            MarkerOptions().position(point40).title("Dieciocho de Septiembre 1066-1080")
                .snippet("Celular, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point41 = LatLng(-33.538255, -70.666586)
        mMap.addMarker(
            MarkerOptions().position(point41).title("Av. Ossa 101-149").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point42 = LatLng(-33.548489, -70.649033)
        mMap.addMarker(
            MarkerOptions().position(point42).title("Aníbal Zañartu 9567")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point43 = LatLng(-33.556080, -70.620081)
        mMap.addMarker(
            MarkerOptions().position(point43).title("Las Parcelas 10558-10510")
                .snippet("Celular, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point44 = LatLng(-33.586265, -70.593379)
        mMap.addMarker(
            MarkerOptions().position(point44).title("Piguchén 2788")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point45 = LatLng(-33.586521, -70.586341)
        mMap.addMarker(
            MarkerOptions().position(point45).title("Luis Matte Larraín 2084").snippet("Plastico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point46 = LatLng(-33.58102300, -70.58122400)
        mMap.addMarker(
            MarkerOptions().position(point46).title("Av. Concha Y Toro 3101-3181").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point47 = LatLng(-33.57854880, -70.58181350)
        mMap.addMarker(
            MarkerOptions().position(point47).title("Av. Concha Y Toro 3459")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point48 = LatLng(-33.58018300, -70.57601900)
        mMap.addMarker(
            MarkerOptions().position(point48).title("Nemesio Vicuña 3205").snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point49 = LatLng(-33.57489800, -70.57947500)
        mMap.addMarker(
            MarkerOptions().position(point49).title("Vizcachas 0252").snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point50 = LatLng(-33.57852380, -70.56954440)
        mMap.addMarker(
            MarkerOptions().position(point50).title("Nonato Coo 3265")
                .snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )

        val point51 = LatLng(-33.57572600, -70.56147000)
        mMap.addMarker(
            MarkerOptions().position(point51).title("Avenida Gabriela Oriente 1762")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point52 = LatLng(-33.57245540, -70.58329920)
        mMap.addMarker(
            MarkerOptions().position(point52).title("Avenida Concha y Toro 3854")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point53 = LatLng(-33.57233100, -70.58389300)
        mMap.addMarker(
            MarkerOptions().position(point53).title("Avenida Concha y Toro 3854").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point54 = LatLng(-33.56872830, -70.58339170)
        mMap.addMarker(
            MarkerOptions().position(point54).title("Concha Y Toro 3800").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point55 = LatLng(-33.56844100, -70.58370400)
        mMap.addMarker(
            MarkerOptions().position(point55).title("Avenida Concha y Toro 4115").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point56 = LatLng(-33.56602200, -70.58454500)
        mMap.addMarker(
            MarkerOptions().position(point56).title("Avenida Vicuña Mackenna 12321")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point57 = LatLng(-33.56399500, -70.58248100)
        mMap.addMarker(
            MarkerOptions().position(point57).title("José Victorino Lastarria 11501")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point58 = LatLng(-33.56222500, -70.58499900)
        mMap.addMarker(
            MarkerOptions().position(point58).title("Vicuña Mackenna 11324").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point59 = LatLng(-33.56139330, -70.59174340)
        mMap.addMarker(
            MarkerOptions().position(point59).title("Maria Elena 437").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point60 = LatLng(-33.56390400, -70.59236100)
        mMap.addMarker(
            MarkerOptions().position(point60).title("Lientur 4436")
                .snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point61 = LatLng(-33.56523500, -70.59748800)
        mMap.addMarker(
            MarkerOptions().position(point61).title("Rafael Matus 1070").snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point62 = LatLng(-33.56189300, -70.59741200)
        mMap.addMarker(
            MarkerOptions().position(point62).title("María Elena 861").snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point63 = LatLng(-33.56252300, -70.60328700)
        mMap.addMarker(
            MarkerOptions().position(point63).title("María Elena 1310")
                .snippet("Cartón para Bebida")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point64 = LatLng(-33.56047000, -70.60196000)
        mMap.addMarker(
            MarkerOptions().position(point64).title("Lago Chungará 1301").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point65 = LatLng(-33.55796100, -70.59234600)
        mMap.addMarker(
            MarkerOptions().position(point65).title("Gral Arriagada 600").snippet("Papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point66 = LatLng(-33.55556900, -70.60901600)
        mMap.addMarker(
            MarkerOptions().position(point66).title("Lapislazuli 1560").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point67 = LatLng(-33.55397400, -70.60324600)
        mMap.addMarker(
            MarkerOptions().position(point67).title("José de la Estrella 1392").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point68 = LatLng(-33.54518500, -70.60559100)
        mMap.addMarker(
            MarkerOptions().position(point68).title("Las Anémonas 1404")
                .snippet("Papel ,Cartón para Bebida")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point69 = LatLng(-33.54512800, -70.60452300)
        mMap.addMarker(
            MarkerOptions().position(point69).title("Las Camelias 9843")
                .snippet("Papel ,Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point70 = LatLng(-33.54505950, -70.60300370)
        mMap.addMarker(
            MarkerOptions().position(point70).title("Remanso Quieto 1273")
                .snippet("Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point71 = LatLng(-33.53829600, -70.60547600)
        mMap.addMarker(
            MarkerOptions().position(point71).title("Sotero del Rio 980")
                .snippet("Papel ,Cartón para Bebida")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point72 = LatLng(-33.54156900, -70.59872400)
        mMap.addMarker(
            MarkerOptions().position(point72).title("Venus 9487")
                .snippet("Vidrio, Papel ,Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point73 = LatLng(-33.53944899, -70.59807082)
        mMap.addMarker(
            MarkerOptions().position(point73).title("Dr. Sotero del Rio con Valentina Leppe")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point74 = LatLng(-33.53953900, -70.59662600)
        mMap.addMarker(
            MarkerOptions().position(point74).title("Sotero del Rio 520").snippet("Papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point75 = LatLng(-33.53943300, -70.59130700)
        mMap.addMarker(
            MarkerOptions().position(point75).title("Avenida Vicuña Mackenna 9090")
                .snippet("Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point76 = LatLng(-33.54657000, -70.59225500)
        mMap.addMarker(
            MarkerOptions().position(point76).title("Oblonera 504").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point77 = LatLng(-33.55335200, -70.58526600)
        mMap.addMarker(
            MarkerOptions().position(point77).title("Joaquín Tocornal 10504")
                .snippet("Cartón, Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point78 = LatLng(-33.55003000, -70.58120700)
        mMap.addMarker(
            MarkerOptions().position(point78).title("José Miguel Carrera 550")
                .snippet("Papel, Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point79 = LatLng(-33.54556700, -70.58203100)
        mMap.addMarker(
            MarkerOptions().position(point79).title("Cali 527").snippet("Vidrio, Papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point80 = LatLng(-33.54362100, -70.57929400)
        mMap.addMarker(
            MarkerOptions().position(point80).title("Tineo 9501").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point81 = LatLng(-33.54838200, -70.57670600)
        mMap.addMarker(
            MarkerOptions().position(point81).title("Central Oriente 875")
                .snippet("Papel, Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point82 = LatLng(-33.54839600, -70.57580700)
        mMap.addMarker(
            MarkerOptions().position(point82).title("El Pelícano 10021").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point83 = LatLng(-33.55718200, -70.58002500)
        mMap.addMarker(
            MarkerOptions().position(point83).title("Blest Gana 10841")
                .snippet("Papel, Cartón para Bebida")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point84 = LatLng(-33.56158100, -70.57234200)
        mMap.addMarker(
            MarkerOptions().position(point84).title("Diego Portales 1070").snippet("Plastico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point85 = LatLng(-33.55780473, -70.57103958)
        mMap.addMarker(
            MarkerOptions().position(point85).title("San Jorge 901")
                .snippet("Vidrio, Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point86 = LatLng(-33.56755100, -70.55594040)
        mMap.addMarker(
            MarkerOptions().position(point86).title("Avenida Los Toros 5441")
                .snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point87 = LatLng(-33.56655490, -70.55693930)
        mMap.addMarker(
            MarkerOptions().position(point87).title("Camilo Henríquez 3767")
                .snippet("Punto limpio - vidrio, papel, cartón")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point88 = LatLng(-33.55983930, -70.56321606)
        mMap.addMarker(
            MarkerOptions().position(point88).title("Los Plátanos 11463").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point89 = LatLng(-33.55716300, -70.55963400)
        mMap.addMarker(
            MarkerOptions().position(point89).title("Valle del Sol 5556").snippet("Plastico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point90 = LatLng(-33.55259300, -70.56987000)
        mMap.addMarker(
            MarkerOptions().position(point90).title("San José de la Estrella 2300")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point91 = LatLng(-33.55036900, -70.56847400)
        mMap.addMarker(
            MarkerOptions().position(point91).title("José Miguel Carrera 1417")
                .snippet("Vidrio, Papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point92 = LatLng(-33.55142830, -70.56463330)
        mMap.addMarker(
            MarkerOptions().position(point92).title("Lago Todos Los Santos 5223").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point93 = LatLng(-33.54525000, -70.56884000)
        mMap.addMarker(
            MarkerOptions().position(point93).title("Avenida La Florida 9742")
                .snippet("Vidrio, Papel, Cartón, Cartón para Bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point94 = LatLng(-33.54213900, -70.56167600)
        mMap.addMarker(
            MarkerOptions().position(point94).title("Sta Inés 1940").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point95 = LatLng(-33.53903852, -70.56342746)
        mMap.addMarker(
            MarkerOptions().position(point95).title("Sta Florencia 1800").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point96 = LatLng(-33.53800200, -70.55474900)
        mMap.addMarker(
            MarkerOptions().position(point96).title("Sta Victoria 9518")
                .snippet("Vidrio, Papel, Cartón, Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point97 = LatLng(-33.53450320, -70.55983510)
        mMap.addMarker(
            MarkerOptions().position(point97).title("Tamarugal 3490").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point98 = LatLng(-33.53561400, -70.56971000)
        mMap.addMarker(
            MarkerOptions().position(point98).title("Rojas Magallanes 2243").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point99 = LatLng(-33.53536200, -70.57301700)
        mMap.addMarker(
            MarkerOptions().position(point99).title("Rojas Magallanes 185").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point100 = LatLng(-33.53388200, -70.57491300)
        mMap.addMarker(
            MarkerOptions().position(point100).title("Los Mapuches 1256")
                .snippet("Papel, Cartón para Bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point101 = LatLng(-33.5735453, -70.6062057)
        mMap.addMarker(
            MarkerOptions().position(point101).title("Calle Creta Nte. 3940")
                .snippet("Punto limpio - vidrio, papel, cartón")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )

        //Lo Barnnechea

        //Lo Barnnechea
        val point102 = LatLng(-33.355445, -70.538539)
        mMap.addMarker(
            MarkerOptions().position(point102).title("Av. Jose Alcalde Delano 10628-10638")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point103 = LatLng(-33.353063, -70.520642)
        mMap.addMarker(
            MarkerOptions().position(point103).title("El Rodeo 12850").snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point104 = LatLng(-33.350845, -70.519394)
        mMap.addMarker(
            MarkerOptions().position(point104).title("Avenida La Dehesa 2245").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point105 = LatLng(-33.351106, -70.506084)
        mMap.addMarker(
            MarkerOptions().position(point105).title("Bertait College").snippet("vidrio, papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point106 = LatLng(-33.351303, -70.505157)
        mMap.addMarker(
            MarkerOptions().position(point106).title("Avenida El Rodeo 13710").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point107 = LatLng(-33.353633, -70.507911)
        mMap.addMarker(
            MarkerOptions().position(point107).title("Avenida Lo Barnechea 1648")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point108 = LatLng(-33.363783, -70.498180)
        mMap.addMarker(
            MarkerOptions().position(point108).title("Mons Escrivá de Balaguer Nte")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point109 = LatLng(-33.366788, -70.500581)
        mMap.addMarker(
            MarkerOptions().position(point109).title("El Sauce 14237")
                .snippet("vidrio, papel, cartón, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point110 = LatLng(-33.368765, -70.502243)
        mMap.addMarker(
            MarkerOptions().position(point110).title("Av. las Condes 14141")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point111 = LatLng(-33.369813, -70.512323)
        mMap.addMarker(
            MarkerOptions().position(point111).title("Avenida Las Condes 12916")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point112 = LatLng(-33.371906, -70.514687)
        mMap.addMarker(
            MarkerOptions().position(point112).title("Avenida Las Condes 12000")
                .snippet("vidrio, papel, cartón, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point113 = LatLng(-33.372829, -70.517700)
        mMap.addMarker(
            MarkerOptions().position(point113).title("Avenida Las Condes 12000").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point114 = LatLng(-33.373527, -70.519228)
        mMap.addMarker(
            MarkerOptions().position(point114).title("Av. las Condes 12201-12235")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point115 = LatLng(-33.372815, -70.519922)
        mMap.addMarker(
            MarkerOptions().position(point115).title("Av. las Condes 12250")
                .snippet("Punto limpio - vidrio, papel, cartón, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )

        val point116 = LatLng(-33.391988, -70.500420)
        mMap.addMarker(
            MarkerOptions().position(point116).title("Av Plaza 680")
                .snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point117 = LatLng(-33.394015, -70.516663)
        mMap.addMarker(
            MarkerOptions().position(point117).title("Francisco Bulnes Correa 1212-1223")
                .snippet("Punto limpio - vidrio, papel, cartón, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point118 = LatLng(-33.401428, -70.514320)
        mMap.addMarker(
            MarkerOptions().position(point118).title("Avenida Camino El Alba 11969")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point119 = LatLng(-33.401404, -70.516546)
        mMap.addMarker(
            MarkerOptions().position(point119).title("Camino El Alba 11865")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point120 = LatLng(-33.385056, -70.533424)
        mMap.addMarker(
            MarkerOptions().position(point120).title("Avenida Las Condes 10295")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point121 = LatLng(-33.368597, -70.519052)
        mMap.addMarker(
            MarkerOptions().position(point121).title("Avenida Raúl Labbé 12099")
                .snippet("Punto limpio - vidrio, papel, cartón, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point122 = LatLng(-33.378915, -70.551857)
        mMap.addMarker(
            MarkerOptions().position(point122).title("Calle Padre de Veuster 2215")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point123 = LatLng(-33.382218, -70.553743)
        mMap.addMarker(
            MarkerOptions().position(point123).title("Calle Lo Beltrán 8751").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point124 = LatLng(-33.381676, -70.561905)
        mMap.addMarker(
            MarkerOptions().position(point124).title("Lo Beltran 2500").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point125 = LatLng(-33.381524, -70.578679)
        mMap.addMarker(
            MarkerOptions().position(point125).title("Borde Río, Monseñor Escriva De Balaguer 6400")
                .snippet("papel, cartón")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point126 = LatLng(-33.518197, -70.588310)
        mMap.addMarker(
            MarkerOptions().position(point126).title("Alonso de Ercilla 6698")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point127 = LatLng(-33.553352, -70.585266)
        mMap.addMarker(
            MarkerOptions().position(point127).title("San José de La Estrella 153")
                .snippet("artón, cartón para bebida, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point128 = LatLng(-33.524506, -70.583748)
        mMap.addMarker(
            MarkerOptions().position(point128).title("García Hurtado de Mendoza 7709")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point129 = LatLng(-33.504780, -70.609833)
        mMap.addMarker(
            MarkerOptions().position(point129).title("Mauricio Rugendas 2151").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point130 = LatLng(-33.522537, -70.583771)
        mMap.addMarker(
            MarkerOptions().position(point130).title("Walker Martinez 1336")
                .snippet("vidrio, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point131 = LatLng(-33.519509, -70.585236)
        mMap.addMarker(
            MarkerOptions().position(point131).title("Rolando Frooden con Real Alicante")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point132 = LatLng(-33.543621, -70.579294)
        mMap.addMarker(
            MarkerOptions().position(point132).title("Santa Amalia con Tineo").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point133 = LatLng(-33.503606, -70.629967)
        mMap.addMarker(
            MarkerOptions().position(point133).title("Salvador Allende 503").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point134 = LatLng(-33.503423, -70.629995)
        mMap.addMarker(
            MarkerOptions().position(point134).title("Pintor Murillo 5295").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point135 = LatLng(-33.556093, -70.657536)
        mMap.addMarker(
            MarkerOptions().position(point135).title("Almirante Riveros 10122")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point136 = LatLng(-33.523926, -70.660767)
        mMap.addMarker(
            MarkerOptions().position(point136).title("Gran Avenida Jose Miguel Carrera 7409")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point137 = LatLng(-33.501784, -70.625697)
        mMap.addMarker(
            MarkerOptions().position(point137).title("Gustavo Campaña Gandarillas 4966")
                .snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point138 = LatLng(-33.500923, -70.621955)
        mMap.addMarker(
            MarkerOptions().position(point138).title("San Lorenzo 4450").snippet("vidrio, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point139 = LatLng(-33.504386, -70.601102)
        mMap.addMarker(
            MarkerOptions().position(point139).title("Las Codornices 3093").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point140 = LatLng(-33.518025, -70.658924)
        mMap.addMarker(
            MarkerOptions().position(point140).title("Gran Avenida 6610")
                .snippet("vidrio, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point141 = LatLng(-33.513435, -70.655464)
        mMap.addMarker(
            MarkerOptions().position(point141).title("Avenida Centenario 994").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point142 = LatLng(-33.522377, -70.579007)
        mMap.addMarker(
            MarkerOptions().position(point142).title("Avenida Walker Martínez 1786")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point143 = LatLng(-33.530618, -70.665474)
        mMap.addMarker(
            MarkerOptions().position(point143).title("Santa Anselma 240").snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point144 = LatLng(-33.548382, -70.576706)
        mMap.addMarker(
            MarkerOptions().position(point144).title("Central Oriente 875")
                .snippet("papel, cartón para bebida, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point145 = LatLng(-33.538255, -70.666586)
        mMap.addMarker(
            MarkerOptions().position(point145).title("Avenida Ossa 146").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point146 = LatLng(-33.528000, -70.575996)
        mMap.addMarker(
            MarkerOptions().position(point146).title("Avenida La Florida 8220").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point147 = LatLng(-33.504647, -70.644734)
        mMap.addMarker(
            MarkerOptions().position(point147).title("Montreal 5393").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point148 = LatLng(-33.574051, -70.604156)
        mMap.addMarker(
            MarkerOptions().position(point148).title("Creta Norte 3980")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point149 = LatLng(-33.548396, -70.575807)
        mMap.addMarker(
            MarkerOptions().position(point149).title("El Pelícano 10021").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point150 = LatLng(-33.513822, -70.583720)
        mMap.addMarker(
            MarkerOptions().position(point150).title("Reina Luisa 6350")
                .snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )

        val point151 = LatLng(-33.503505, -70.643250)
        mMap.addMarker(
            MarkerOptions().position(point151).title("Calle Darío Salas 5201")
                .snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal, pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point152 = LatLng(-33.503234, -70.643309)
        mMap.addMarker(
            MarkerOptions().position(point152).title("Piramide 633").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point153 = LatLng(-33.500813, -70.637117)
        mMap.addMarker(
            MarkerOptions().position(point153).title("Ureta Cox 470").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point154 = LatLng(-33.498651, -70.626775)
        mMap.addMarker(
            MarkerOptions().position(point154).title("Gabriela Mistral 4624")
                .snippet("vidrio, plástico.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point155 = LatLng(-33.498394, -70.623692)
        mMap.addMarker(
            MarkerOptions().position(point155).title("Ingeniero Budge 158").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point156 = LatLng(-33.509692, -70.587122)
        mMap.addMarker(
            MarkerOptions().position(point156).title("Avenida José Pedro Alessandri 6402")
                .snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point157 = LatLng(-33.509613, -70.587099)
        mMap.addMarker(
            MarkerOptions().position(point157).title("Avenida José Pedro Alessandri 6402")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point158 = LatLng(-33.498228, -70.627884)
        mMap.addMarker(
            MarkerOptions().position(point158).title("Gabriela Mistral 199").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point159 = LatLng(-33.506859, -70.589211)
        mMap.addMarker(
            MarkerOptions().position(point159).title("Avenida Américo Vespucio 5372")
                .snippet("papel, cartón, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point160 = LatLng(-33.505611, -70.589790)
        mMap.addMarker(
            MarkerOptions().position(point160).title("Avenida Américo Vespucio 5601")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point161 = LatLng(-33.563995, -70.582481)
        mMap.addMarker(
            MarkerOptions().position(point161).title("José Victorino Lastarria 11651")
                .snippet("vidrio, papel, cartón para bebida, plástico.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point162 = LatLng(-33.497917, -70.608071)
        mMap.addMarker(
            MarkerOptions().position(point162).title("Avenida Vicuña Mackenna 4860")
                .snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point163 = LatLng(-33.531123, -70.669555)
        mMap.addMarker(
            MarkerOptions().position(point163).title("Brisas del Maipo 0509")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point164 = LatLng(-33.557268, -70.664593)
        mMap.addMarker(
            MarkerOptions().position(point164).title("Javiera Carrera / Mayor Valladares")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point165 = LatLng(-33.500465, -70.598717)
        mMap.addMarker(
            MarkerOptions().position(point165).title("Juan Bagynka 3434").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point166 = LatLng(-33.501242, -70.645133)
        mMap.addMarker(
            MarkerOptions().position(point166).title("San Nicolás 753").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point167 = LatLng(-33.496108, -70.627370)
        mMap.addMarker(
            MarkerOptions().position(point167).title("Concepción 4272").snippet("vidrio ")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point168 = LatLng(-33.535614, -70.569710)
        mMap.addMarker(
            MarkerOptions().position(point168).title("Rojas Magallanes 2243").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point169 = LatLng(-33.495568, -70.627246)
        mMap.addMarker(
            MarkerOptions().position(point169).title("Concepción 4185").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point170 = LatLng(-33.562847, -70.663552)
        mMap.addMarker(
            MarkerOptions().position(point170).title("Plaza De los Sauces").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point171 = LatLng(-33.563382, -70.663343)
        mMap.addMarker(
            MarkerOptions().position(point171).title("Antonio Varas / Los Olivos")
                .snippet("papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point172 = LatLng(-33.494438, -70.629091)
        mMap.addMarker(
            MarkerOptions().position(point172).title("1 de Septiembre 308").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point173 = LatLng(-33.493955, -70.625238)
        mMap.addMarker(
            MarkerOptions().position(point173).title("Río Cisnes 3772").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point174 = LatLng(-33.494166, -70.629258)
        mMap.addMarker(
            MarkerOptions().position(point174).title("Av. Las Industrias 4119").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point175 = LatLng(-33.495253, -70.636103)
        mMap.addMarker(
            MarkerOptions().position(point175).title("San Gregorio").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point176 = LatLng(-33.493211, -70.622981)
        mMap.addMarker(
            MarkerOptions().position(point176).title("Castelar Sur 150").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point177 = LatLng(-33.550363, -70.672121)
        mMap.addMarker(
            MarkerOptions().position(point177).title("Gran Avenida Jose Miguel Carrera 9863")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point178 = LatLng(-33.567548, -70.660695)
        mMap.addMarker(
            MarkerOptions().position(point178).title("Calle Las Perlas Con Pasaje Aguas Marinas")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point179 = LatLng(-33.567548, -70.660695)
        mMap.addMarker(
            MarkerOptions().position(point179).title("Calle Las Perlas").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point180 = LatLng(-33.552593, -70.569870)
        mMap.addMarker(
            MarkerOptions().position(point180).title("San José de la Estrella 2347")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point181 = LatLng(-33.492878, -70.620557)
        mMap.addMarker(
            MarkerOptions().position(point181).title("Corelli 3671-3693").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point182 = LatLng(-33.492806, -70.625213)
        mMap.addMarker(
            MarkerOptions().position(point182).title("Río Cisnes 3684-3670").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point183 = LatLng(-33.492746, -70.625200)
        mMap.addMarker(
            MarkerOptions().position(point183).title("Pasaje Río Cisne 3693")
                .snippet("vidrio, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point184 = LatLng(-33.550369, -70.568474)
        mMap.addMarker(
            MarkerOptions().position(point184).title("José Miguel Carrera 1420")
                .snippet("vidrio, papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point185 = LatLng(-33.491906, -70.619207)
        mMap.addMarker(
            MarkerOptions().position(point185).title("San Juan").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point186 = LatLng(-33.557805, -70.571040)
        mMap.addMarker(
            MarkerOptions().position(point186).title("San Jorge 930")
                .snippet("vidrio, cartón para bebida, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point187 = LatLng(-33.491881, -70.614513)
        mMap.addMarker(
            MarkerOptions().position(point187).title("General Baquedano 4192")
                .snippet("Punto limpio - vidrio, papel, cartón, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point188 = LatLng(-33.561581, -70.572342)
        mMap.addMarker(
            MarkerOptions().position(point188).title("Diego Portales 1073").snippet("plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point189 = LatLng(-33.533188, -70.676704)
        mMap.addMarker(
            MarkerOptions().position(point189).title("Avenida Americo Vespucio Sur 1173")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point190 = LatLng(-33.584889, -70.623267)
        mMap.addMarker(
            MarkerOptions().position(point190).title("Avenida Gabriela 2710").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point191 = LatLng(-33.490426, -70.622138)
        mMap.addMarker(
            MarkerOptions().position(point191).title("Arquitecto Brunelleschi 3496")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point192 = LatLng(-33.539039, -70.563428)
        mMap.addMarker(
            MarkerOptions().position(point192).title("Santa Viviana / Santa Florencia")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point193 = LatLng(-33.519714, -70.567444)
        mMap.addMarker(
            MarkerOptions().position(point193).title("Paicavi 2880")
                .snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point194 = LatLng(-33.490319, -70.631136)
        mMap.addMarker(
            MarkerOptions().position(point194).title("Los Copihues").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point195 = LatLng(-33.585254, -70.609536)
        mMap.addMarker(
            MarkerOptions().position(point195).title("Miguel Angel / La Serena").snippet("plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point196 = LatLng(-33.551428, -70.564633)
        mMap.addMarker(
            MarkerOptions().position(point196).title("Lago Todos Los Santos 5220-5208")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point197 = LatLng(-33.490581, -70.606429)
        mMap.addMarker(
            MarkerOptions().position(point197).title("Escuela Agrícola 2586-2572").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point198 = LatLng(-33.496283, -70.588640)
        mMap.addMarker(
            MarkerOptions().position(point198).title("Campo Lindo 4391-4451").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point199 = LatLng(-33.542139, -70.561676)
        mMap.addMarker(
            MarkerOptions().position(point199).title("Sta Inés 1940").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point201 = LatLng(-33.53514861, -70.62267775)
        mMap.addMarker(
            MarkerOptions().position(point201).title("2 Poniente 8177").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point202 = LatLng(-33.53468662, -70.62489821)
        mMap.addMarker(
            MarkerOptions().position(point202).title("El Tabo 8143").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point203 = LatLng(-33.53086100, -70.62314600)
        mMap.addMarker(
            MarkerOptions().position(point203).title("Cardenal Raul Silva Henriquez 7940")
                .snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point204 = LatLng(-33.52950870, -70.62226010)
        mMap.addMarker(
            MarkerOptions().position(point204).title("Combarbala 575").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point205 = LatLng(-33.52930134, -70.62156708)
        mMap.addMarker(
            MarkerOptions().position(point205).title("Quipue 7897").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point206 = LatLng(-33.53133354, -70.61304435)
        mMap.addMarker(
            MarkerOptions().position(point206).title("Calle 8 6447").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point207 = LatLng(-33.52827042, -70.62178473)
        mMap.addMarker(
            MarkerOptions().position(point207).title("Quipue 7852").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point208 = LatLng(-33.54287820, -70.63230480)
        mMap.addMarker(
            MarkerOptions().position(point208).title("Avenida Americo Vespucio, Municipalidad 2")
                .snippet("Punto Limpio - Vidrio, Papel, Cartón")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point209 = LatLng(-33.54564914, -70.62997141)
        mMap.addMarker(
            MarkerOptions().position(point209).title("Diagonal Sur Oriente 351")
                .snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point210 = LatLng(-33.54930006, -70.61908651)
        mMap.addMarker(
            MarkerOptions().position(point210).title("Manuel Plaza 880").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point211 = LatLng(-33.52976644, -70.63147150)
        mMap.addMarker(
            MarkerOptions().position(point211).title("Illapel 7875").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point212 = LatLng(-33.52655835, -70.61408626)
        mMap.addMarker(
            MarkerOptions().position(point212).title("Linares 875").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point213 = LatLng(-33.53829600, -70.60547600)
        mMap.addMarker(
            MarkerOptions().position(point213).title("Sotero del Rio 980")
                .snippet("Papel, Cartón para bebida")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point214 = LatLng(-33.54778869, -70.63048548)
        mMap.addMarker(
            MarkerOptions().position(point214).title("Pasaje Pedro Ignacio Gatica")
                .snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point215 = LatLng(-33.55075679, -70.62628688)
        mMap.addMarker(
            MarkerOptions().position(point215).title("Canto General 501").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point216 = LatLng(-33.52403247, -70.62242701)
        mMap.addMarker(
            MarkerOptions().position(point216).title("Yungay 641").snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point217 = LatLng(-33.54518500, -70.60559100)
        mMap.addMarker(
            MarkerOptions().position(point217).title("Las Anémonas 1404")
                .snippet("Papel, Cartón para bebida")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point218 = LatLng(-33.53310000, -70.60360700)
        mMap.addMarker(
            MarkerOptions().position(point218).title("Santa Raquel 8459")
                .snippet("Vidrio, Papel, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point219 = LatLng(-33.54512800, -70.60452300)
        mMap.addMarker(
            MarkerOptions().position(point219).title("Las Camelias 9953")
                .snippet("Papel, Cartón para bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point220 = LatLng(-33.55066811, -70.63097040)
        mMap.addMarker(
            MarkerOptions().position(point220).title("Avenida El Parque 9330")
                .snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point221 = LatLng(-33.52802100, -70.63548200)
        mMap.addMarker(
            MarkerOptions().position(point221).title("Avenida Santa Rosa 7668").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point222 = LatLng(-33.54505950, -70.60300370)
        mMap.addMarker(
            MarkerOptions().position(point222).title("Remanso Quieto con Pte. Del Río")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point223 = LatLng(-33.54505950, -70.60300370)
        mMap.addMarker(
            MarkerOptions().position(point223).title("Remanso Quieto con Pte. Del Río")
                .snippet("Cartón para bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point224 = LatLng(-33.52784900, -70.60433400)
        mMap.addMarker(
            MarkerOptions().position(point224).title("Geronimo de Alderete 800").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point225 = LatLng(-33.52178672, -70.62794081)
        mMap.addMarker(
            MarkerOptions().position(point225).title("Presidente Alessandri 616")
                .snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point226 = LatLng(-33.52197300, -70.60969500)
        mMap.addMarker(
            MarkerOptions().position(point226).title("Los Vilos 1081")
                .snippet("Papel, Cartón para bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point227 = LatLng(-33.55608030, -70.62008100)
        mMap.addMarker(
            MarkerOptions().position(point227).title("Las Parcelas 10520").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point228 = LatLng(-33.54156900, -70.59872400)
        mMap.addMarker(
            MarkerOptions().position(point228).title("Venus 9484")
                .snippet("Vidrio, Papel, Cartón para bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point229 = LatLng(-33.53944899, -70.59807082)
        mMap.addMarker(
            MarkerOptions().position(point229).title("Dr. Sotero del Rio con Valentina Leppe")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point230 = LatLng(-33.51875050, -70.61563470)
        mMap.addMarker(
            MarkerOptions().position(point230).title("Punta arenas, Centro de Acopio 6711")
                .snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point231 = LatLng(-33.53953900, -70.59662600)
        mMap.addMarker(
            MarkerOptions().position(point231).title("Sotero del Rio 520").snippet("Papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point232 = LatLng(-33.55556900, -70.60901600)
        mMap.addMarker(
            MarkerOptions().position(point232).title("Lapislazuli 1560").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point233 = LatLng(-33.52721650, -70.59919850)
        mMap.addMarker(
            MarkerOptions().position(point233).title("Don Pepe 250").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point234 = LatLng(-33.51847800, -70.61124100)
        mMap.addMarker(
            MarkerOptions().position(point234).title("Punta Arenas 6711").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point235 = LatLng(-33.52398670, -70.60169170)
        mMap.addMarker(
            MarkerOptions().position(point235).title("Avenida Américo Vespucio 7607")
                .snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point236 = LatLng(-33.51787550, -70.62922640)
        mMap.addMarker(
            MarkerOptions().position(point236).title("Lo Ovalle 347").snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point237 = LatLng(-33.55397400, -70.60324600)
        mMap.addMarker(
            MarkerOptions().position(point237).title("José de la Estrella 1392").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point238 = LatLng(-33.52073300, -70.60420200)
        mMap.addMarker(
            MarkerOptions().position(point238).title("Rupanco 120")
                .snippet("Vidrio, Papel, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point239 = LatLng(-33.51617210, -70.62819330)
        mMap.addMarker(
            MarkerOptions().position(point239).title("Sebastopol 328").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point240 = LatLng(-33.52913970, -70.59549050)
        mMap.addMarker(
            MarkerOptions().position(point240).title("Carrera").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point241 = LatLng(-33.52116330, -70.60097050)
        mMap.addMarker(
            MarkerOptions().position(point241).title("Avenida Vicuña Mackenna 7210")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point242 = LatLng(-33.51426690, -70.61989360)
        mMap.addMarker(
            MarkerOptions().position(point242).title("Vecinal").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point243 = LatLng(-33.52130010, -70.60053602)
        mMap.addMarker(
            MarkerOptions().position(point243).title("Avenida Vicuña Mackenna 7320")
                .snippet("Vidrio, Papel, Cartón para bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point244 = LatLng(-33.53943300, -70.59130700)
        mMap.addMarker(
            MarkerOptions().position(point244).title("Avenida Vicuña Mackenna 9090")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point245 = LatLng(-33.51810100, -70.60292100)
        mMap.addMarker(
            MarkerOptions().position(point245).title("Pudeto 6931")
                .snippet("Vidrio, Papel, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point246 = LatLng(-33.53027850, -70.59243870)
        mMap.addMarker(
            MarkerOptions().position(point246).title("Punto Verde - Vidrio").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point247 = LatLng(-33.53342800, -70.59102600)
        mMap.addMarker(
            MarkerOptions().position(point247).title("Estados Unidos 8654").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point248 = LatLng(-33.54657000, -70.59225500)
        mMap.addMarker(
            MarkerOptions().position(point248).title("La Oblonera 500").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point249 = LatLng(-33.51281300, -70.62539700)
        mMap.addMarker(
            MarkerOptions().position(point249).title("Avenida Las Industrias").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point250 = LatLng(-33.51293050, -70.61391200)
        mMap.addMarker(
            MarkerOptions().position(point250).title("Av. Estadio 6041").snippet("Vidrio, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point251 = LatLng(-33.51440120, -70.63410210)
        mMap.addMarker(
            MarkerOptions().position(point251).title("Berlioz").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point252 = LatLng(-33.54848900, -70.64903300)
        mMap.addMarker(
            MarkerOptions().position(point252).title("Anibal Zañartu 9567")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point253 = LatLng(-33.51166980, -70.62248150)
        mMap.addMarker(
            MarkerOptions().position(point253).title("Hayden 5910").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point254 = LatLng(-33.51367544, -70.60664330)
        mMap.addMarker(
            MarkerOptions().position(point254).title("Avenida Vicuña Mackenna 6331")
                .snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point255 = LatLng(-33.51144060, -70.62740160)
        mMap.addMarker(
            MarkerOptions().position(point255).title("Graciano 334").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point256 = LatLng(-33.52055500, -70.59544330)
        mMap.addMarker(
            MarkerOptions().position(point256).title("Julio Vildósola, supermercado Monserrat")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point257 = LatLng(-33.51986200, -70.59570800)
        mMap.addMarker(
            MarkerOptions().position(point257).title("Tottus Metro Vicuña Mackena")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point258 = LatLng(-33.56047000, -70.60196000)
        mMap.addMarker(
            MarkerOptions().position(point258).title("María Elena 258").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point259 = LatLng(-33.51979400, -70.59551000)
        mMap.addMarker(
            MarkerOptions().position(point259).title("Avenida Américo Vespucio 7310")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point260 = LatLng(-33.56267800, -70.63526300)
        mMap.addMarker(
            MarkerOptions().position(point260).title("SantaTrinidad 10977").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point261 = LatLng(-33.56441830, -70.63013160)
        mMap.addMarker(
            MarkerOptions().position(point261).title("Avenida Santa Rosa 10934")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point262 = LatLng(-33.51215700, -70.63424400)
        mMap.addMarker(
            MarkerOptions().position(point262).title("Pasaje Aníbal 5973").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point263 = LatLng(-33.50954940, -70.62122120)
        mMap.addMarker(
            MarkerOptions().position(point263).title("Piramide 414").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point264 = LatLng(-33.50948800, -70.62080300)
        mMap.addMarker(
            MarkerOptions().position(point264).title("Plaza Haydn").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point265 = LatLng(-33.50930410, -70.62421210)
        mMap.addMarker(
            MarkerOptions().position(point265).title("Carmen Mena 230").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point266 = LatLng(-33.56252300, -70.60328700)
        mMap.addMarker(
            MarkerOptions().position(point266).title("María Elena 1310")
                .snippet("Cartón para bebida")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point267 = LatLng(-33.51451000, -70.60026900)
        mMap.addMarker(
            MarkerOptions().position(point267).title("Avenida Froilan Roa / Pje. El Membrillar")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point268 = LatLng(-33.51031100, -70.63196800)
        mMap.addMarker(
            MarkerOptions().position(point268).title("Juan Planas 5726").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point269 = LatLng(-33.50969700, -70.63003100)
        mMap.addMarker(
            MarkerOptions().position(point269).title("Pedro Sarmiento").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point270 = LatLng(-33.51008180, -70.63212220)
        mMap.addMarker(
            MarkerOptions().position(point270).title("Pedro Sarmiento").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point271 = LatLng(-33.53576900, -70.58504060)
        mMap.addMarker(
            MarkerOptions().position(point271).title("Avenida Rojas Magallanes por Colombia")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point272 = LatLng(-33.50728200, -70.62318600)
        mMap.addMarker(
            MarkerOptions().position(point272).title("Avenida Departamental").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point273 = LatLng(-33.53114700, -70.58462500)
        mMap.addMarker(
            MarkerOptions().position(point273).title("Alonso de Ercilla 8597")
                .snippet("Papel, Cartón para bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point274 = LatLng(-33.51873398, -70.64974213)
        mMap.addMarker(
            MarkerOptions().position(point274).title("Iquique esq. Fuenzalida Urrejola 6502")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point275 = LatLng(-33.52535200, -70.58681500)
        mMap.addMarker(
            MarkerOptions().position(point275).title("Juan de Pineda 7583").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point276 = LatLng(-33.56189300, -70.59741200)
        mMap.addMarker(
            MarkerOptions().position(point276).title("María Elena 861").snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point277 = LatLng(-33.55796100, -70.59234600)
        mMap.addMarker(
            MarkerOptions().position(point277).title("General Arriagada 600").snippet("Papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point278 = LatLng(-33.50687800, -70.63222500)
        mMap.addMarker(
            MarkerOptions().position(point278).title("Avenida Departamental 285")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point279 = LatLng(-33.50549700, -70.62401600)
        mMap.addMarker(
            MarkerOptions().position(point279).title("Huara 5319").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point280 = LatLng(-33.50620000, -70.61037700)
        mMap.addMarker(
            MarkerOptions().position(point280).title("Jorge Quevedo con esquina Alonso Leng")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point281 = LatLng(-33.50496340, -70.61910590)
        mMap.addMarker(
            MarkerOptions().position(point281).title("Parque Maihue (Ex Loico) 5307")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point282 = LatLng(-33.50496340, -70.61910590)
        mMap.addMarker(
            MarkerOptions().position(point282).title("Pasaje Corelli 3676").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point283 = LatLng(-33.50486720, -70.61889370)
        mMap.addMarker(
            MarkerOptions().position(point283).title("Parque Maihue").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point284 = LatLng(-33.56401580, -70.64492780)
        mMap.addMarker(
            MarkerOptions().position(point284).title("Avenida Observatorio 1885")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point285 = LatLng(-33.522023, -70.564370)
        mMap.addMarker(
            MarkerOptions().position(point285).title("Walker Martínez 3142").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point286 = LatLng(-33.488630, -70.628151)
        mMap.addMarker(
            MarkerOptions().position(point286).title("Calle Magdalena").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point287 = LatLng(-33.514843, -70.673388)
        mMap.addMarker(
            MarkerOptions().position(point287).title("Lincoln").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point288 = LatLng(-33.554049, -70.676963)
        mMap.addMarker(
            MarkerOptions().position(point288)
                .title("Avenida Gran Avenida Jose Miguel Carrera 10375")
                .snippet("Punto limpio vidrio, papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point289 = LatLng(-33.501900, -70.578606)
        mMap.addMarker(
            MarkerOptions().position(point289).title("Avenida Las Torres 5490").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point290 = LatLng(-33.502373, -70.663345)
        mMap.addMarker(
            MarkerOptions().position(point290).title("Primera Avenida 1600").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point291 = LatLng(-33.510623, -70.671314)
        mMap.addMarker(
            MarkerOptions().position(point291)
                .title("Avenida José Joaquín Prieto esquina Lo Ovalle").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point292 = LatLng(-33.560860, -70.674404)
        mMap.addMarker(
            MarkerOptions().position(point292).title("Augusto D'halmar / Mariano Latorre")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point293 = LatLng(-33.522324, -70.678207)
        mMap.addMarker(
            MarkerOptions().position(point293).title("Parque Violeta Parra")
                .snippet("vidrio, papel, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point294 = LatLng(-33.574898, -70.579475)
        mMap.addMarker(
            MarkerOptions().position(point294).title("Rotonda Av. La Vizcachas").snippet("plastico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point295 = LatLng(-33.499803, -70.660881)
        mMap.addMarker(
            MarkerOptions().position(point295).title("Calle Carlos Edwards 1373")
                .snippet("Punto limpio - vidrio, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point296 = LatLng(-33.534503, -70.559835)
        mMap.addMarker(
            MarkerOptions().position(point296).title("Tamarugal 3238-A").snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point297 = LatLng(-33.522481, -70.678853)
        mMap.addMarker(
            MarkerOptions().position(point297).title("Adolfo López Mateo 2000").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point298 = LatLng(-33.493778, -70.651939)
        mMap.addMarker(
            MarkerOptions().position(point298).title("Gran Avenida Jose Miguel Carrera 4310")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point299 = LatLng(-33.518510, -70.563369)
        mMap.addMarker(
            MarkerOptions().position(point299).title("Ongolmo 7238-7222").snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )


        //300


        //300
        val point300 = LatLng(-33.486300, -70.623212)
        mMap.addMarker(
            MarkerOptions().position(point300).title("Arqto Arturo Bianchi").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point301 = LatLng(-33.502316, -70.575081)
        mMap.addMarker(
            MarkerOptions().position(point301).title("Avenida Las Torres 6108")
                .snippet("Punto limpio - vidrio, papel, cartón, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point302 = LatLng(-33.578549, -70.581814)
        mMap.addMarker(
            MarkerOptions().position(point302).title("Avenida Concha y Toro 3459")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point303 = LatLng(-33.516617, -70.678268)
        mMap.addMarker(
            MarkerOptions().position(point303).title("Caren 7298-7116").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point304 = LatLng(-33.492180, -70.651815)
        mMap.addMarker(
            MarkerOptions().position(point304).title("Gran Avenida Jose Miguel Carrera")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point305 = LatLng(-33.516052, -70.678144)
        mMap.addMarker(
            MarkerOptions().position(point305).title("Lucila Godoy 2000")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point306 = LatLng(-33.559839, -70.563216)
        mMap.addMarker(
            MarkerOptions().position(point306).title("Los Plátanos 11490")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point307 = LatLng(-33.516685, -70.562622)
        mMap.addMarker(
            MarkerOptions().position(point307).title("Volcán Osorno 3494")
                .snippet("vidrio, plastico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point308 = LatLng(-33.489917, -70.593807)
        mMap.addMarker(
            MarkerOptions().position(point308).title("Luis Valenzuela Aris")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point309 = LatLng(-33.541989, -70.684320)
        mMap.addMarker(
            MarkerOptions().position(point309).title("Dieciocho de Septiembre (Escuela Básica José Martí) 1080")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point310 = LatLng(-33.489689, -70.592613)
        mMap.addMarker(
            MarkerOptions().position(point310).title("Arturo Gordon (Esq Luis Valenzuela)")
                .snippet("vidro")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point311 = LatLng(-33.586265, -70.593379)
        mMap.addMarker(
            MarkerOptions().position(point311).title("Piguchén 2788")
                .snippet("vidrio, papel, cartón, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point312 = LatLng(-33.484858, -70.631495)
        mMap.addMarker(
            MarkerOptions().position(point312).title("Gandarillas 326")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point313 = LatLng(-33.491680, -70.586960)
        mMap.addMarker(
            MarkerOptions().position(point313).title("Los Evangelistas 3990")
                .snippet("papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point314 = LatLng(-33.519943, -70.559349)
        mMap.addMarker(
            MarkerOptions().position(point314).title("Andalién 7270")
                .snippet("vidrio, papel, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point315 = LatLng(-33.499641, -70.574371)
        mMap.addMarker(
            MarkerOptions().position(point315).title("Los Cerezos 6130")
                .snippet("Punto limpio - vidrio, papel, cartón, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )

        val point316 = LatLng(-33.581023, -70.581224)
        mMap.addMarker(
            MarkerOptions().position(point316).title("Avenida Concha y Toro 3193")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point317 = LatLng(-33.557163, -70.559634)
        mMap.addMarker(
            MarkerOptions().position(point317).title("Valle del Sol 05549")
                .snippet("plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point318 = LatLng(-33.571176, -70.673212)
        mMap.addMarker(
            MarkerOptions().position(point318).title("Av. Lo Martínez 596")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point319 = LatLng(-33.493618, -70.660867)
        mMap.addMarker(
            MarkerOptions().position(point319).title("Real Audiencia 1490")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point320 = LatLng(-33.482895, -70.631804)
        mMap.addMarker(
            MarkerOptions().position(point320).title("Sierra Bella, San Joaquín")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point321 = LatLng(-33.508503, -70.677536)
        mMap.addMarker(
            MarkerOptions().position(point321).title("Avenida Lo Ovalle 2356")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point322 = LatLng(-33.484968, -70.599003)
        mMap.addMarker(
            MarkerOptions().position(point322).title("Avenida José Pedro Alessandri 3389")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point323 = LatLng(-33.482483, -70.631332)
        mMap.addMarker(
            MarkerOptions().position(point323).title("Sierra Bella 2816")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point324 = LatLng(-33.482509, -70.609418)
        mMap.addMarker(
            MarkerOptions().position(point324).title("Los Plátanos con esq Castillo Urizar")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point325 = LatLng(-33.580183, -70.576019)
        mMap.addMarker(
            MarkerOptions().position(point325).title("Nemesio Vicuña 3205")
                .snippet("plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point326 = LatLng(-33.489032, -70.654727)
        mMap.addMarker(
            MarkerOptions().position(point326).title("Eduardo Ruiz Valledor 3899")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point327 = LatLng(-33.576896, -70.669800)
        mMap.addMarker(
            MarkerOptions().position(point327).title("Nueva Imperial 939")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point328 = LatLng(-33.488169, -70.653889)
        mMap.addMarker(
            MarkerOptions().position(point328).title("Rey Alberto 3790")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point329 = LatLng(-33.590405, -70.594238)
        mMap.addMarker(
            MarkerOptions().position(point329).title("Obpo Enrique Alvear 2678")
                .snippet("papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point330 = LatLng(-33.486138, -70.649975)
        mMap.addMarker(
            MarkerOptions().position(point330).title("Gran Avenida Jose Miguel Carrera 3506")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point331 = LatLng(-33.586302, -70.583726)
        mMap.addMarker(
            MarkerOptions().position(point331).title("Luis Matte Larraín 245")
                .snippet("plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point332 = LatLng(-33.486292, -70.589755)
        mMap.addMarker(
            MarkerOptions().position(point332).title("El Libano")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point333 = LatLng(-33.490236, -70.660091)
        mMap.addMarker(
            MarkerOptions().position(point333).title("Av. Salesianos 1555")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point334 = LatLng(-33.590107, -70.591011)
        mMap.addMarker(
            MarkerOptions().position(point334).title("Los Manios 978")
                .snippet("papel, cartón, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point335 = LatLng(-33.489969, -70.660023)
        mMap.addMarker(
            MarkerOptions().position(point335).title("Valle Central 1037")
                .snippet("Punto limpio -  vidrio, papel, cartón, cartón para bebida, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )

        val point336 = LatLng(-33.580513, -70.669445)
        mMap.addMarker(
            MarkerOptions().position(point336).title("Avenida Vecinal Sur (Colegio Batalla de La Concepción) 1380")
                .snippet("vidrio, papel, cartón para bebida, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point337 = LatLng(-33.570613, -70.679797)
        mMap.addMarker(
            MarkerOptions().position(point337).title("Avenida Central, Villa El Esfuerzo 555")
                .snippet("papel, cartón, cartón para bebida, plástico, metal.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point338 = LatLng(-33.480002, -70.638119)
        mMap.addMarker(
            MarkerOptions().position(point338).title("Rivas 752")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point339 = LatLng(-33.570287, -70.680735)
        mMap.addMarker(
            MarkerOptions().position(point339).title("Avenida Central con Los Cipreses")
                .snippet("vidrio, papel, cartón para bebida, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point340 = LatLng(-33.517052, -70.553429)
        mMap.addMarker(
            MarkerOptions().position(point340).title("Maria Angelica 3800")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point341 = LatLng(-33.491112, -70.575508)
        mMap.addMarker(
            MarkerOptions().position(point341).title("Avenida Quilín 5473")
                .snippet("Punto limpio - vidrio, papel, cartón, plástico, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point342 = LatLng(-33.509976, -70.684517)
        mMap.addMarker(
            MarkerOptions().position(point342).title("Av. la Feria 6739-6799")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point343 = LatLng(-33.485371, -70.585267)
        mMap.addMarker(
            MarkerOptions().position(point343).title("Madreselva (esq Ramón Cruz)")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point344 = LatLng(-33.480358, -70.599190)
        mMap.addMarker(
            MarkerOptions().position(point344).title("Avenida Macul 2795")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point345 = LatLng(-33.503335, -70.561496)
        mMap.addMarker(
            MarkerOptions().position(point345).title("Avenida Tobalaba 13959")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point346 = LatLng(-33.503476, -70.561092)
        mMap.addMarker(
            MarkerOptions().position(point346).title("Avenida Tobalaba 13949")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point347 = LatLng(-33.525739, -70.691668)
        mMap.addMarker(
            MarkerOptions().position(point347).title("Venus 2856-2836")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point348 = LatLng(-33.566555, -70.556939)
        mMap.addMarker(
            MarkerOptions().position(point348).title("Los Toros 5526")
                .snippet("Punto limpio - vidrio, papel, cartón")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point349 = LatLng(-33.485612, -70.657317)
        mMap.addMarker(
            MarkerOptions().position(point349).title("Ramón Barros Luco 3599")
                .snippet("vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point350 = LatLng(-33.519054, -70.551506)
        mMap.addMarker(
            MarkerOptions().position(point350).title("Paseo Mayor 3825")
                .snippet("vidrio, plastico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point351 = LatLng(-33.585522, -70.575547)
        mMap.addMarker(
                MarkerOptions().position(point351).title("Miguel Covarrubias 2811")
                        .snippet("vidrio, papel, cartón, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point352 = LatLng(-33.525635, -70.692139)
        mMap.addMarker(
                MarkerOptions().position(point352).title("Venus 2910-2858")
                        .snippet("vidrio, papel, cartón, plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point353 = LatLng(-33.478087, -70.635543)
        mMap.addMarker(
                MarkerOptions().position(point353).title("Casablanca 2498")
                        .snippet("vidrio, plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point354 = LatLng(-33.589646, -70.581990)
        mMap.addMarker(
                MarkerOptions().position(point354).title("Ángel Pimentel 150")
                        .snippet("plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point355 = LatLng(-33.492729, -70.670395)
        mMap.addMarker(
                MarkerOptions().position(point355).title("La Marina 2500")
                        .snippet("vidrio, plastico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point356 = LatLng(-33.478069, -70.637882)
        mMap.addMarker(
                MarkerOptions().position(point356).title("Francisco de California 2452")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point357 = LatLng(-33.477995, -70.637848)
        mMap.addMarker(
                MarkerOptions().position(point357).title("San Francisco de California, San Joaquín")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point358 = LatLng(-33.482092, -70.651965)
        mMap.addMarker(
                MarkerOptions().position(point358).title("Ricardo Morales 3120")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point359 = LatLng(-33.567518, -70.555918)
        mMap.addMarker(
                MarkerOptions().position(point359).title("Avenida Camilo Henríquez 3686")
                        .snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point360 = LatLng(-33.501158, -70.680344)
        mMap.addMarker(
                MarkerOptions().position(point360).title("Caren 6049")
                        .snippet("metal, pila")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point361 = LatLng(-33.485976, -70.579348)
        mMap.addMarker(
                MarkerOptions().position(point361).title("Américo Vespucio Mall Quilín")
                        .snippet("papel, cartón, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point362 = LatLng(-33.582558, -70.568544)
        mMap.addMarker(
                MarkerOptions().position(point362).title("Nonato Coo 2971")
                        .snippet("vidrio, papel, cartón, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point363 = LatLng(-33.475522, -70.626317)
        mMap.addMarker(
                MarkerOptions().position(point363).title("Diagonal Sta Elena 2654-2518")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point364 = LatLng(-33.478746, -70.645063)
        mMap.addMarker(
                MarkerOptions().position(point364).title("Chiloé, San Miguel")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point366 = LatLng(-33.499981, -70.560860)
        mMap.addMarker(
                MarkerOptions().position(point366).title("Avenida Tobalaba 13651")
                        .snippet("Punto limpio - vidrio, papel, cartón, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point367 = LatLng(-33.519582, -70.546940)
        mMap.addMarker(
                MarkerOptions().position(point367).title("Las Perdices 6811-6851")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point368 = LatLng(-33.570636, -70.687697)
        mMap.addMarker(
                MarkerOptions().position(point368).title("Gran Avenida Jose Miguel Carrera 12552")
                        .snippet("pila, celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point369 = LatLng(-33.475365, -70.643917)
        mMap.addMarker(
                MarkerOptions().position(point369).title("Placer 795-819")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point370 = LatLng(-33.571456, -70.688441)
        mMap.addMarker(
                MarkerOptions().position(point370).title("Card José María Caro, El Bosque")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point371 = LatLng(-33.580003, -70.681894)
        mMap.addMarker(
                MarkerOptions().position(point371).title("Av. Lo Blanco # 550")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point372 = LatLng(-33.472562, -70.606399)
        mMap.addMarker(
                MarkerOptions().position(point372).title("Av. Pedro de Valdivia 5305-5399")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point373 = LatLng(-33.474601, -70.644989)
        mMap.addMarker(
                MarkerOptions().position(point373).title("Bío Bío 835")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point374 = LatLng(-33.475365, -70.643917)
        mMap.addMarker(
                MarkerOptions().position(point374).title("Placer 1198-1100")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point375 = LatLng(-33.472454, -70.635616)
        mMap.addMarker(
                MarkerOptions().position(point375).title("Carmen 2100")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point376 = LatLng(-33.604202, -70.625813)
        mMap.addMarker(
                MarkerOptions().position(point376).title("Belén 14010-14017")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point377 = LatLng(-33.473826, -70.597844)
        mMap.addMarker(
                MarkerOptions().position(point377).title("Rodrigo de Araya 3265")
                        .snippet("pila, celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point378 = LatLng(-33.474813, -70.648173)
        mMap.addMarker(
                MarkerOptions().position(point378).title("San Diego 2230")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point379 = LatLng(-33.593552, -70.575632)
        mMap.addMarker(
                MarkerOptions().position(point379).title("Pto Mayor 2039")
                        .snippet("vidrio, papel, cartón, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point380 = LatLng(-33.506279, -70.692001)
        mMap.addMarker(
                MarkerOptions().position(point380).title("Buenaventura 3812-3790")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point381 = LatLng(-33.471258, -70.634546)
        mMap.addMarker(
                MarkerOptions().position(point381).title("Arauco 452")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point382 = LatLng(-33.470600, -70.629474)
        mMap.addMarker(
                MarkerOptions().position(point382).title("Av. Portugal 2001")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point383 = LatLng(-33.585738, -70.563311)
        mMap.addMarker(
                MarkerOptions().position(point383).title("Av. Mexico 2701-2791")
                        .snippet("plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point384 = LatLng(-33.508122, -70.693804)
        mMap.addMarker(
                MarkerOptions().position(point384).title("Card José María Caro")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point385 = LatLng(-33.508122, -70.693804)
        mMap.addMarker(
                MarkerOptions().position(point385).title("Santa Rosa 2055")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point386 = LatLng(-33.469700, -70.621069)
        mMap.addMarker(
                MarkerOptions().position(point386).title("Vía Doce 920")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point387 = LatLng(-33.514393, -70.697662)
        mMap.addMarker(
                MarkerOptions().position(point387).title("Diecinueve Sur 3875-3899")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point388 = LatLng(-33.593546, -70.573272)
        mMap.addMarker(
                MarkerOptions().position(point388).title("Nemesio Vicuña 2036-2000")
                        .snippet("vidrio, papel, cartón, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point389 = LatLng(-33.589867, -70.567254)
        mMap.addMarker(
                MarkerOptions().position(point389).title("Portal Andino")
                        .snippet("plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point390 = LatLng(-33.508122, -70.693804)
        mMap.addMarker(
                MarkerOptions().position(point390).title("Fraternal 3765")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point391 = LatLng(-33.593601, -70.572739)
        mMap.addMarker(
                MarkerOptions().position(point391).title("Av. Las Nieves Ote., Puente Alto")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point392 = LatLng(-33.600896, -70.588098)
        mMap.addMarker(
                MarkerOptions().position(point392).title("Juan de Dios Malebrán, Puente Alto")
                        .snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point393 = LatLng(-33.493882, -70.684094)
        mMap.addMarker(
                MarkerOptions().position(point393).title("Centro América 4208-4150")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point394 = LatLng(-33.574398, -70.690818)
        mMap.addMarker(
                MarkerOptions().position(point394).title("Gran Avenida Jose Miguel Carrera 13065-13109")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point395 = LatLng(-33.518982, -70.700485)
        mMap.addMarker(
                MarkerOptions().position(point395).title("Pío XII 8061-8085")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point396 = LatLng(-33.517227, -70.700470)
        mMap.addMarker(
                MarkerOptions().position(point396).title("Pdte Eduardo Frei Montalva 3943-3991")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point397 = LatLng(-33.596961, -70.576342)
        mMap.addMarker(
                MarkerOptions().position(point397).title("Av. Concha Y Toro 1477")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point398 = LatLng(-33.476280, -70.580170)
        mMap.addMarker(
                MarkerOptions().position(point398).title("Padre Fernando Cifuentes Grez 4834")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point399 = LatLng(-33.505130, -70.695347)
        mMap.addMarker(
                MarkerOptions().position(point399).title("Buenaventura 3972")
                        .snippet("vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // 400

        val point400 = LatLng(-33.41211900, -70.57155300)
        mMap.addMarker(
            MarkerOptions().position(point400).title("UV C7 Plaza del Inca La Capitania N°255")
                .snippet("Vidrio, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point401 = LatLng(-33.43641030, -70.74866440)
        mMap.addMarker(
            MarkerOptions().position(point401).title("San Francisco 8586").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point402 = LatLng(-33.40645820, -70.64317300)
        mMap.addMarker(
            MarkerOptions().position(point402).title("Recoleta").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point403 = LatLng(-33.41616800, -70.69910600)
        mMap.addMarker(
            MarkerOptions().position(point403).title("Plaza Diego Portales").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point404 = LatLng(-33.41486700, -70.56313300)
        mMap.addMarker(
            MarkerOptions().position(point404).title("Martin de Zamora 6395")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point405 = LatLng(-33.42089800, -70.54386900)
        mMap.addMarker(
            MarkerOptions().position(point405)
                .title("UV C- 15 Colón 8000 Alonso De Camargo Nº 8671").snippet("Vidrio, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point406 = LatLng(-33.41761300, -70.55465600)
        mMap.addMarker(
            MarkerOptions().position(point406).title("Rotonda Atenas (costado supermercado Líder)")
                .snippet("Punto limpio - Vidrio, Papel, Cartón, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point407 = LatLng(-33.41844000, -70.55205300)
        mMap.addMarker(
            MarkerOptions().position(point407).title("Avenida IV Centenario 1016").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point408 = LatLng(-33.41853700, -70.55236220)
        mMap.addMarker(
            MarkerOptions().position(point408).title("Rotonda Atenas")
                .snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point409 = LatLng(-33.40993200, -70.66553000)
        mMap.addMarker(
            MarkerOptions().position(point409).title("Armando Quesada esq. Hector Boccardo")
                .snippet("Vidrio, Papel")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point410 = LatLng(-33.41158000, -70.67466300)
        mMap.addMarker(
            MarkerOptions().position(point410).title("Faustino Gazziero").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point411 = LatLng(-33.41172290, -70.67495230)
        mMap.addMarker(
            MarkerOptions().position(point411)
                .title("Padre Faustino Gazziero, entre Las Cañas y Nueva Cinco").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point412 = LatLng(-33.42245800, -70.71412200)
        mMap.addMarker(
            MarkerOptions().position(point412).title("Plaza Lo Amor").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point413 = LatLng(-33.41743000, -70.69800500)
        mMap.addMarker(
            MarkerOptions().position(point413).title("Plazoleta Gonzalo Bulnes").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point414 = LatLng(-33.40795100, -70.63630700)
        mMap.addMarker(
            MarkerOptions().position(point414).title("Mexico 260")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point415 = LatLng(-33.41698100, -70.56145500)
        mMap.addMarker(
            MarkerOptions().position(point415).title("Avenida Cristobal Colón 6465")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point416 = LatLng(-33.66855710, -70.73940030)
        mMap.addMarker(
            MarkerOptions().position(point416).title("Eliodoro Yáñez 1900").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point417 = LatLng(-33.42243440, -70.76031460)
        mMap.addMarker(
            MarkerOptions().position(point417).title("Federico Errázuriz con Rodoviario")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point418 = LatLng(-33.40671200, -70.73719800)
        mMap.addMarker(
            MarkerOptions().position(point418).title("Jose Miguel Infante 6098")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point419 = LatLng(-33.42333380, -70.75896240)
        mMap.addMarker(
            MarkerOptions().position(point419).title("Mapocho Sur / Riachuelo").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point420 = LatLng(-33.42948200, -70.76499900)
        mMap.addMarker(
            MarkerOptions().position(point420).title("Serrano 1384")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point421 = LatLng(-33.39840460, -70.71915440)
        mMap.addMarker(
            MarkerOptions().position(point421).title("Ave. El cerro").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point422 = LatLng(-33.41697280, -70.74906540)
        mMap.addMarker(
            MarkerOptions().position(point422).title("Salvador Gutierrez frente al 7950")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point423 = LatLng(-33.41697280, -70.74906540)
        mMap.addMarker(
            MarkerOptions().position(point423).title("La Estrella con Mapocho").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point424 = LatLng(-33.38779200, -70.54911700)
        mMap.addMarker(
            MarkerOptions().position(point424).title("Padre Hurtado 1150").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point425 = LatLng(-33.38899600, -70.54576900)
        mMap.addMarker(
            MarkerOptions().position(point425).title("Avenida Kennedy 9001")
                .snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point426 = LatLng(-33.38779540, -70.54941460)
        mMap.addMarker(
            MarkerOptions().position(point426).title("Avenida Padre Hurtado Norte 1150")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point427 = LatLng(-33.40941200, -70.73783900)
        mMap.addMarker(
            MarkerOptions().position(point427).title("Tocopalma 6215")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point428 = LatLng(-33.62566880, -70.78252160)
        mMap.addMarker(
            MarkerOptions().position(point428).title("Paradero 13 de Avenida Calera de Tango")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point429 = LatLng(-33.40494500, -70.72928600)
        mMap.addMarker(
            MarkerOptions().position(point429).title("Condell 1370")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point430 = LatLng(-33.37737700, -70.61661500)
        mMap.addMarker(
            MarkerOptions().position(point430).title("La Piramide (Universidad Mayor) 5750")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point431 = LatLng(-33.40526160, -70.72895660)
        mMap.addMarker(
            MarkerOptions().position(point431).title("Arturo Prat c/ Condell").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point432 = LatLng(-33.38521957, -70.67978668)
        mMap.addMarker(
            MarkerOptions().position(point432).title("Avenida Independencia Esq. Calle Vecinal")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point433 = LatLng(-33.38152380, -70.57867920)
        mMap.addMarker(
            MarkerOptions().position(point433).title("Borde Río, Monseñor Escriva De Balaguer 6400")
                .snippet("Papel, Cartón")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point434 = LatLng(-33.40313000, -70.72393800)
        mMap.addMarker(
            MarkerOptions().position(point434).title("Nueva Uno 1488")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point435 = LatLng(-33.42168000, -70.75225300)
        mMap.addMarker(
            MarkerOptions().position(point435).title("La Estrella (Esquina Mapocho Norte)")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point436 = LatLng(-33.40132500, -70.72023800)
        mMap.addMarker(
            MarkerOptions().position(point436).title("Avenida José Manuel Balmaceda 4883")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point437 = LatLng(-33.38347626, -70.66376495)
        mMap.addMarker(
            MarkerOptions().position(point437).title("Diego Silva , Balneareo Municipal 1309")
                .snippet("Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point438 = LatLng(-33.38006400, -70.64901000)
        mMap.addMarker(
            MarkerOptions().position(point438).title("Juan Cristóbal").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point439 = LatLng(-33.56907330, -70.80769730)
        mMap.addMarker(
            MarkerOptions().position(point439).title("Buenos Aires Esq. El Manzano")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point440 = LatLng(-33.64125640, -70.76464650)
        mMap.addMarker(
            MarkerOptions().position(point440).title("Esquina Santa Inés con Alfonso Ruiz Tagle")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point441 = LatLng(-33.38265810, -70.58632470)
        mMap.addMarker(
            MarkerOptions().position(point441).title("Avenida Monsenior Escriba de Balaguer 5960")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point442 = LatLng(-33.40517000, -70.72303800)
        mMap.addMarker(
            MarkerOptions().position(point442).title("Calle Dos 5116")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point443 = LatLng(-33.39329900, -70.69644900)
        mMap.addMarker(
            MarkerOptions().position(point443).title("Puerto Montt 3594")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point444 = LatLng(-33.38205500, -70.64835300)
        mMap.addMarker(
            MarkerOptions().position(point444).title("Almirante Gomez Carreño").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point445 = LatLng(-33.43275200, -70.76101140)
        mMap.addMarker(
            MarkerOptions().position(point445).title("Copiapó 1270").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point446 = LatLng(-33.38695160, -70.56799690)
        mMap.addMarker(
            MarkerOptions().position(point446).title("Buenaventura 1770").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point447 = LatLng(-33.40210300, -70.71457200)
        mMap.addMarker(
            MarkerOptions().position(point447).title("Jose Manuel Balmaceda 4569").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point448 = LatLng(-33.64158000, -70.76154500)
        mMap.addMarker(
            MarkerOptions().position(point448).title("Santa Inés, Esquina Alfonso Ruiz Tagle")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point449 = LatLng(-33.38997300, -70.55922000)
        mMap.addMarker(
            MarkerOptions().position(point449).title("Avenida Las Hualtatas 7440").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point450 = LatLng(-33.41096490, -70.72967300)
        mMap.addMarker(
            MarkerOptions().position(point450).title("Totoral Bajo")
                .snippet("Vidrio, Papel, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point451 = LatLng(-33.41843750, -70.74102800)
        mMap.addMarker(
            MarkerOptions().position(point451).title("Huelen con Salvador Gutierrez")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point452 = LatLng(-33.41090000, -70.72910300)
        mMap.addMarker(
            MarkerOptions().position(point452).title("Totoral Bajo 1023")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point453 = LatLng(-33.38655900, -70.57600400)
        mMap.addMarker(
            MarkerOptions().position(point453).title("Avenida Luis Pasteur 6076")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point454 = LatLng(-33.41145710, -70.72908600)
        mMap.addMarker(
            MarkerOptions().position(point454)
                .title("Av. Presidente Salvador Allende /Totoral Bajo").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point455 = LatLng(-33.40243100, -70.71148700)
        mMap.addMarker(
            MarkerOptions().position(point455).title("Avenida José Manuel Balmaceda 4495")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point456 = LatLng(-33.38366699, -70.64099121)
        mMap.addMarker(
            MarkerOptions().position(point456)
                .title("Recoleta (Fundación de las Familias de Recoleta) 4290").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point457 = LatLng(-33.41090000, -70.72910300)
        mMap.addMarker(
            MarkerOptions().position(point457).title("Totoral Bajo 1023")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point458 = LatLng(-33.42325120, -70.74562050)
        mMap.addMarker(
            MarkerOptions().position(point458).title("Los Conquistadores / karlovack")
                .snippet("Punto Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point459 = LatLng(-33.39859000, -70.70154600)
        mMap.addMarker(
            MarkerOptions().position(point459).title("Las Margaritas 4020")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point460 = LatLng(-33.38474670, -70.64113070)
        mMap.addMarker(
            MarkerOptions().position(point460).title("Avenida Recoleta 4290")
                .snippet("Punto limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point461 = LatLng(-33.38804500, -70.57964030)
        mMap.addMarker(
            MarkerOptions().position(point461).title("Lago Villarrica").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point462 = LatLng(-33.38806800, -70.57963400)
        mMap.addMarker(
            MarkerOptions().position(point462).title("Calle Lo Arcaya 1850").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point463 = LatLng(-33.38804440, -70.57983810)
        mMap.addMarker(
            MarkerOptions().position(point463).title("Lo Arcaya 1970").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point464 = LatLng(-33.39406200, -70.55622100)
        mMap.addMarker(
            MarkerOptions().position(point464).title("Reina Astrid 879").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point465 = LatLng(-33.42503160, -70.74539290)
        mMap.addMarker(
            MarkerOptions().position(point465).title("Karlovack con Milovan D'jilas")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point466 = LatLng(-33.39106270, -70.67411750)
        mMap.addMarker(
            MarkerOptions().position(point466)
                .title("El Olivo (Escuela Especial 940 Hermanas Agazzi) 1752")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point467 = LatLng(-33.38548500, -70.59955800)
        mMap.addMarker(
            MarkerOptions().position(point467).title("Vía Morada 5400").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point468 = LatLng(-33.39130520, -70.67473110)
        mMap.addMarker(
            MarkerOptions().position(point468)
                .title("Avenida Independencia (Colegio Libertador San Martín) 4009")
                .snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point469 = LatLng(-33.40504100, -70.71172300)
        mMap.addMarker(
            MarkerOptions().position(point469).title("Avenida Domingo Santa María 4463")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point470 = LatLng(-33.62750200, -70.76926900)
        mMap.addMarker(
            MarkerOptions().position(point470)
                .title("Avenida Calera de Tango, Shell Calera De Tango 1").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point471 = LatLng(-33.42547900, -70.74497100)
        mMap.addMarker(
            MarkerOptions().position(point471).title("José Joaquín Pérez con Estados Unidos")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point472 = LatLng(-33.40473600, -70.71021300)
        mMap.addMarker(
            MarkerOptions().position(point472).title("Domingo Santa María 4383")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point473 = LatLng(-33.42277960, -70.74029710)
        mMap.addMarker(
            MarkerOptions().position(point473).title("Mapocho con Huelen").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point474 = LatLng(-33.56551460, -70.79960860)
        mMap.addMarker(
            MarkerOptions().position(point474)
                .title("Primera Transversal Esq. Ignacio Carrera Pinto").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point475 = LatLng(-33.38857370, -70.58938200)
        mMap.addMarker(
            MarkerOptions().position(point475).title("Franciso de Aguirre").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point476 = LatLng(-33.39966300, -70.54706300)
        mMap.addMarker(
            MarkerOptions().position(point476).title("Chesterton 8520").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point477 = LatLng(-33.42080630, -70.73475230)
        mMap.addMarker(
            MarkerOptions().position(point477).title("Violeta Parra con Jorge Giles")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point478 = LatLng(-33.40403210, -70.53740720)
        mMap.addMarker(
            MarkerOptions().position(point478)
                .title("Camino al Observatorio, al lado Colegio San Francisco del alba")
                .snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point479 = LatLng(-33.41698220, -70.72864770)
        mMap.addMarker(
            MarkerOptions().position(point479).title("18 de marzo con 5 de febrero")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point480 = LatLng(-33.40354670, -70.53895450)
        mMap.addMarker(
            MarkerOptions().position(point480)
                .title("Camino al Observatorio (costado colegio San Francisco del Alba)")
                .snippet("Punto limpio - Vidrio, Papel, Cartón, Plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point481 = LatLng(-33.40327510, -70.70131780)
        mMap.addMarker(
            MarkerOptions().position(point481).title("Caupolicán 1439").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point482 = LatLng(-33.39222300, -70.57589700)
        mMap.addMarker(
            MarkerOptions().position(point482).title("Avenida Vitacura 5708").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point483 = LatLng(-33.39762100, -70.68563620)
        mMap.addMarker(
            MarkerOptions().position(point483)
                .title("Avenida Presidente Eduardo Frei Montalva 3092")
                .snippet("Punto limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point484 = LatLng(-33.38947010, -70.59213070)
        mMap.addMarker(
            MarkerOptions().position(point484).title("Manuela Cañas").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point485 = LatLng(-33.39690000, -70.68296100)
        mMap.addMarker(
            MarkerOptions().position(point485).title("Carlos Salas Herrera (Empresa AFE) 3680")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point486 = LatLng(-33.40456300, -70.53776300)
        mMap.addMarker(
            MarkerOptions().position(point486).title("Camino El Alba 9200").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point487 = LatLng(-33.40526700, -70.70452300)
        mMap.addMarker(
            MarkerOptions().position(point487).title("Avenida Domingo Santa María 4112")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point488 = LatLng(-33.63026400, -70.76194000)
        mMap.addMarker(
            MarkerOptions().position(point488).title("Avenida Calera de Tango, Municipalidad 345")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point489 = LatLng(-33.39537000, -70.56557400)
        mMap.addMarker(
            MarkerOptions().position(point489).title("Parque Cuauhtémoc").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point490 = LatLng(-33.40546400, -70.70391100)
        mMap.addMarker(
            MarkerOptions().position(point490).title("Avenida Jaime Guzman 1365")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point491 = LatLng(-33.42735890, -70.74091650)
        mMap.addMarker(
            MarkerOptions().position(point491).title("Los Placeres con teniente Cruz")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point492 = LatLng(-33.41128400, -70.71473500)
        mMap.addMarker(
            MarkerOptions().position(point492).title("Santa Edelmira").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point493 = LatLng(-33.40463300, -70.70043900)
        mMap.addMarker(
            MarkerOptions().position(point493).title("Caupolicán 1554-1400")
                .snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point494 = LatLng(-33.41989540, -70.72922840)
        mMap.addMarker(
            MarkerOptions().position(point494).title("Salvador Gutiérrez con 3 de Julio")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point495 = LatLng(-33.41144600, -70.71452260)
        mMap.addMarker(
            MarkerOptions().position(point495).title("Sta. Edelmira/Pje. Elqui").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point496 = LatLng(-33.39060278, -70.59766111)
        mMap.addMarker(
            MarkerOptions().position(point496).title("Avenida Américo Vespucio 3098")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point497 = LatLng(-33.39062900, -70.59756300)
        mMap.addMarker(
            MarkerOptions().position(point497).title("Avenida Americo Vespucio 3098")
                .snippet("Punto limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal, Pila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point498 = LatLng(-33.38948715, -70.61626220)
        mMap.addMarker(
            MarkerOptions().position(point498).title("Avenida El Parque 4951")
                .snippet("Punto limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point499 = LatLng(-33.38952200, -70.61637500)
        mMap.addMarker(
            MarkerOptions().position(point499)
                .title("Avenida El Parque (Interior Punto Limpio triciclos Ciudad Empresarial) 4951")
                .snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // 500

        val point500 = LatLng(-33.39132300, -70.64862900)
        mMap.addMarker(
                MarkerOptions().position(point500).title("Avenida Raúl Montt").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point501 = LatLng(-33.39073000, -70.59774500)
        mMap.addMarker(
                MarkerOptions().position(point501).title("Calle Bicentenario").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point502 = LatLng(-33.39611816, -70.67097473)
        mMap.addMarker(
                MarkerOptions().position(point502).title("Avenida Independencia 3499").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point503 = LatLng(-33.40647600, -70.70155400)
        mMap.addMarker(
                MarkerOptions().position(point503).title("Avenida Domingo Santa María 3962").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point504 = LatLng(-33.39394100, -70.58176900)
        mMap.addMarker(
                MarkerOptions().position(point504).title("Avenida Luis Pasteur 5418").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point505 = LatLng(-33.44664980, -70.75937430)
        mMap.addMarker(
                MarkerOptions().position(point505).title("Calle Corona Sueca 8852").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point506 = LatLng(-33.52733200, -70.79687500)
        mMap.addMarker(
                MarkerOptions().position(point506).title("El Conquistador 1561").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point507 = LatLng(-33.43641030, -70.74866440)
        mMap.addMarker(
                MarkerOptions().position(point507).title("San Francisco 8586").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point508 = LatLng(-33.40578700, -70.54271800)
        mMap.addMarker(
                MarkerOptions().position(point508).title("Camino El Alba N° 8990").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point509 = LatLng(-33.39501953, -70.65798950)
        mMap.addMarker(
                MarkerOptions().position(point509).title("Avenida Dorsal 1201 (Unimarc)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point510 = LatLng(-33.55394000, -70.79454700)
        mMap.addMarker(
                MarkerOptions().position(point510).title("Avenida Parque Central Oriente 200").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point511 = LatLng(-33.45298100, -70.76288600)
        mMap.addMarker(
                MarkerOptions().position(point511).title("Isla Portezuelo 615").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point512 = LatLng(-33.39856500, -70.56894100)
        mMap.addMarker(
                MarkerOptions().position(point512).title("Nuestra Señora del Rosario 850").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point513 = LatLng(-33.55422240, -70.79430050)
        mMap.addMarker(
                MarkerOptions().position(point513).title("Parque Central Oriente 100").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point514 = LatLng(-33.39826965, -70.67012024)
        mMap.addMarker(
                MarkerOptions().position(point514).title("Avenida Dorsal 1904 (Juzgado de Policia Local)").snippet("Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point515 = LatLng(-33.52023580, -70.79390140)
        mMap.addMarker(
                MarkerOptions().position(point515).title("Campanario 2679").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point516 = LatLng(-33.51941250, -70.79341770)
        mMap.addMarker(
                MarkerOptions().position(point516).title("Avenida Portales 2471").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point517 = LatLng(-33.39392100, -70.64277600)
        mMap.addMarker(
                MarkerOptions().position(point517).title("Avenida Recoleta 3500").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point518 = LatLng(-33.40790800, -70.54329900)
        mMap.addMarker(
                MarkerOptions().position(point518).title("Camino El Alba 8600").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point519 = LatLng(-33.39365760, -70.63693660)
        mMap.addMarker(
                MarkerOptions().position(point519).title("Salitre 3431").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point520 = LatLng(-33.40818480, -70.54336350)
        mMap.addMarker(
                MarkerOptions().position(point520).title("Los Dominicos").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point521 = LatLng(-33.41102600, -70.70362600)
        mMap.addMarker(
                MarkerOptions().position(point521).title("Platón 5060").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point522 = LatLng(-33.39658220, -70.65695210)
        mMap.addMarker(
                MarkerOptions().position(point522).title("O´Higgins 98").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point523 = LatLng(-33.56255140, -70.79137790)
        mMap.addMarker(
                MarkerOptions().position(point523).title("La Pirámide 952").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point524 = LatLng(-33.40840950, -70.54389670)
        mMap.addMarker(
                MarkerOptions().position(point524).title("Parque Los Domínicos (lado oriente sector Feria Chacareros)").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point525 = LatLng(-33.39961900, -70.57068000)
        mMap.addMarker(
                MarkerOptions().position(point525).title("Avenida Manquehue 1700").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point526 = LatLng(-33.39520120, -70.64655010)
        mMap.addMarker(
                MarkerOptions().position(point526).title("Santa Silvia").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point527 = LatLng(-33.39481680, -70.59951770)
        mMap.addMarker(
                MarkerOptions().position(point527).title("Mestizo Restaurante").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point528 = LatLng(-33.40683830, -70.54883610)
        mMap.addMarker(
                MarkerOptions().position(point528).title("Parque Montegrande").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point529 = LatLng(-33.40733880, -70.54809900)
        mMap.addMarker(
                MarkerOptions().position(point529).title("Parque Monte Grande (Zanzíbar con Apoquindo)").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point530 = LatLng(-33.41279800, -70.70549700)
        mMap.addMarker(
                MarkerOptions().position(point530).title("Lazo de La Vega 5098").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point531 = LatLng(-33.41284650, -70.70544460)
        mMap.addMarker(
                MarkerOptions().position(point531).title("L. de la Vega/Los Suspiros").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point532 = LatLng(-33.406616, -70.5508428)
        mMap.addMarker(
                MarkerOptions().position(point532).title("Av. Chesterton Nº 7159 Junta de Vecinos C12 Jardines de Apoquindo").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point533 = LatLng(-33.52342140, -70.79174330)
        mMap.addMarker(
                MarkerOptions().position(point533).title("Cuatro poniente frente a PV N°543").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point534 = LatLng(-33.55813570, -70.79031240)
        mMap.addMarker(
                MarkerOptions().position(point534).title("Parque Central Poniente").snippet("Vidrio, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point535 = LatLng(-33.44430300, -70.74996600)
        mMap.addMarker(
                MarkerOptions().position(point535).title("San Pablo 8563").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point536 = LatLng(-33.40318867, -70.67726153)
        mMap.addMarker(
                MarkerOptions().position(point536).title("Reina Maria esq. Angol").snippet("Vidrio, Papel")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point537 = LatLng(-33.41731300, -70.52922800)
        mMap.addMarker(
                MarkerOptions().position(point537).title("Vital Apoquindo 1200").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point538 = LatLng(-33.41618510, -70.70972620)
        mMap.addMarker(
                MarkerOptions().position(point538).title("La Rioja/Pje. 4 (Villa O. Bonilla)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point539 = LatLng(-33.42067750, -70.71770900)
        mMap.addMarker(
                MarkerOptions().position(point539).title("Neptuno 1997").snippet("Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point540 = LatLng(-33.41215800, -70.54136200)
        mMap.addMarker(
                MarkerOptions().position(point540).title("Av. Padre Hurtado Sur Nº 535 UV C- 22 Horizontes de Apoquindo").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point541 = LatLng(-33.41764800, -70.71067500)
        mMap.addMarker(
                MarkerOptions().position(point541).title("Calle Uno 5951").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point542 = LatLng(-33.43708400, -70.73957100)
        mMap.addMarker(
                MarkerOptions().position(point542).title("Nicaragua 8131").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point543 = LatLng(-33.58790000, -70.77926900)
        mMap.addMarker(
                MarkerOptions().position(point543).title("Condominio El Kiwal").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point544 = LatLng(-33.39677400, -70.62690700)
        mMap.addMarker(
                MarkerOptions().position(point544).title("Avenida El Salto 3300").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point545 = LatLng(-33.41848170, -70.71075660)
        mMap.addMarker(
                MarkerOptions().position(point545).title("Calle 7 frente Nº 5911 V. Catamarca").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point546 = LatLng(-33.41849700, -70.71067300)
        mMap.addMarker(
                MarkerOptions().position(point546).title("Calle 7 5911").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point547 = LatLng(-33.49094630, -70.78008000)
        mMap.addMarker(
                MarkerOptions().position(point547).title("Avenida Ingeniero Eduardo Dominguez 920").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point548 = LatLng(-33.40220900, -70.57492900)
        mMap.addMarker(
                MarkerOptions().position(point548).title("Parque Araucano (costado entrada principal)").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point549 = LatLng(-33.40304050, -70.57155250)
        mMap.addMarker(
                MarkerOptions().position(point549).title("Parque Araucano").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point550 = LatLng(-33.56097310, -70.78677200)
        mMap.addMarker(
                MarkerOptions().position(point550).title("Parque Central Poniente con Las Diademas").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point551 = LatLng(-33.40010300, -70.65099730)
        mMap.addMarker(
                MarkerOptions().position(point551).title("Calle Muñoz Gamero 972").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point552 = LatLng(-33.51198080, -70.78563620)
        mMap.addMarker(
                MarkerOptions().position(point552).title("Avenida Las Naciones 2020").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point553 = LatLng(-33.50750400, -70.78451500)
        mMap.addMarker(
                MarkerOptions().position(point553).title("Pje. La Lechería 2021").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point554 = LatLng(-33.45359200, -70.75465500)
        mMap.addMarker(
                MarkerOptions().position(point554).title("Oceania 553").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point555 = LatLng(-33.40223870, -70.66122130)
        mMap.addMarker(
                MarkerOptions().position(point555).title("Gaspar Olea esq. Tristan Cornejo").snippet("Vidrio, Papel")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point556 = LatLng(-33.44998200, -70.75051100)
        mMap.addMarker(
                MarkerOptions().position(point556).title("General Bonilla 8593").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point557 = LatLng(-33.43069600, -70.72748890)
        mMap.addMarker(
                MarkerOptions().position(point557).title("Ñancu con Las Lomas").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point558 = LatLng(-33.42245800, -70.71412200)
        mMap.addMarker(
                MarkerOptions().position(point558).title("Plaza Lo Amor").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point559 = LatLng(-33.42404200, -70.52637500)
        mMap.addMarker(
                MarkerOptions().position(point559).title("Avenida Fleming 9840").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point560 = LatLng(-33.41616800, -70.69910600)
        mMap.addMarker(
                MarkerOptions().position(point560).title("Plaza Diego Portales").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point561 = LatLng(-33.44566990, -70.74400570)
        mMap.addMarker(
                MarkerOptions().position(point561).title("San Pablo 8444").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point562 = LatLng(-33.54406730, -70.78564510)
        mMap.addMarker(
                MarkerOptions().position(point562).title("Capellán Florencio Infante con Periodista Hernán Solis").snippet("Vidrio, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point563 = LatLng(-33.56375340, -70.78277140)
        mMap.addMarker(
                MarkerOptions().position(point563).title("Lago Albano. Entre parque central oriente y parque central poniente").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point564 = LatLng(-33.48930130, -70.77506700)
        mMap.addMarker(
                MarkerOptions().position(point564).title("La Farfana Esq. El Rosal").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point565 = LatLng(-33.40453600, -70.58021000)
        mMap.addMarker(
                MarkerOptions().position(point565).title("Cerro Colorado 5051").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point566 = LatLng(-33.40170700, -70.64362300)
        mMap.addMarker(
                MarkerOptions().position(point566).title("Avenida Recoleta 2774").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point567 = LatLng(-33.58530800, -70.46608000)
        mMap.addMarker(
                MarkerOptions().position(point567).title("Camino El Volcán 9831").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point568 = LatLng(-33.40797300, -70.56866600)
        mMap.addMarker(
                MarkerOptions().position(point568).title("Alonso de Córdova (costado supermercado Líder, al llegar a O'Connell)").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point569 = LatLng(-33.43500200, -70.72889920)
        mMap.addMarker(
                MarkerOptions().position(point569).title("Del Consistorial 6645-6671 (Del Consistorial con Igualdad)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point570 = LatLng(-33.40807730, -70.56871410)
        mMap.addMarker(
                MarkerOptions().position(point570).title("Alonso de Córdova").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point571 = LatLng(-33.44076500, -70.73609900)
        mMap.addMarker(
                MarkerOptions().position(point571).title("Gabriela Mistral 991").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point572 = LatLng(-33.40722700,-70.66899900)
        mMap.addMarker(
                MarkerOptions().position(point572).title("Altamirano 2210").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point573 = LatLng(-33.41743000, -70.69800500)
        mMap.addMarker(
                MarkerOptions().position(point573).title("Plazoleta Gonzalo Bulnes").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point574 = LatLng(-33.58223000, -70.77538300)
        mMap.addMarker(
                MarkerOptions().position(point574).title("Camino Lonquén Norte 6782").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point575 = LatLng(-33.41627600, -70.54665900)
        mMap.addMarker(
                MarkerOptions().position(point575).title("Tolten N° 8115 UV C- 16 Parque Los Dominicos").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point576 = LatLng(-33.41627600, -70.54665900)
        mMap.addMarker(
                MarkerOptions().position(point576).title("Tolten N° 8115 UV C- 16 Parque Los Dominicos").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point577 = LatLng(-33.56450550, -70.78062260)
        mMap.addMarker(
                MarkerOptions().position(point577).title("El Aromo Esq. El Arroyo 1700, Ciudad Satélitel").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point578 = LatLng(-33.40681200, -70.66430800)
        mMap.addMarker(
                MarkerOptions().position(point578).title("Avenida Hipodromo Chile 1715").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point579 = LatLng(-33.42048500, -70.70255680)
        mMap.addMarker(
                MarkerOptions().position(point579).title("Carrascal con Lo Espinoza").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point580 = LatLng(-33.42044900, -70.70233500)
        mMap.addMarker(
                MarkerOptions().position(point580).title("Lo Espinoza 2203").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point581 = LatLng(-33.42531600, -70.52995300)
        mMap.addMarker(
                MarkerOptions().position(point581).title("Vital Apoquindo 1750").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point582 = LatLng(-33.40902040, -70.56992860)
        mMap.addMarker(
                MarkerOptions().position(point582).title("Apoquindo 5784").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point583 = LatLng(-33.40480520, -70.64873990)
        mMap.addMarker(
                MarkerOptions().position(point583).title("Avenida Einstein 784").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point584 = LatLng(-33.49985330, -70.77602280)
        mMap.addMarker(
                MarkerOptions().position(point584).title("Asunción 1440").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point585 = LatLng(-33.44384000, -70.73669400)
        mMap.addMarker(
                MarkerOptions().position(point585).title("Avenida San Pablo 8011").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point586 = LatLng(-33.43091520, -70.71864370)
        mMap.addMarker(
                MarkerOptions().position(point586).title("Avenida José Joaquín Pérez 6015").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point587 = LatLng(-33.42966070, -70.71624100)
        mMap.addMarker(
                MarkerOptions().position(point587).title("Plaza Garín S. Izquierdo/Janequeo").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point588 = LatLng(-33.42961000, -70.71615200)
        mMap.addMarker(
                MarkerOptions().position(point588).title("Janequeo").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point589 = LatLng(-33.42903500, -70.71502700)
        mMap.addMarker(
                MarkerOptions().position(point589).title("Calle Samuel Izquierdo 1653").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point590 = LatLng(-33.41158000, -70.67466300)
        mMap.addMarker(
                MarkerOptions().position(point590).title("Faustino Gazziero").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point591 = LatLng(-33.41172290, -70.67495230)
        mMap.addMarker(
                MarkerOptions().position(point591).title("Padre Faustino Gazziero, entre Las Cañas y Nueva Cinco").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point592 = LatLng(-33.40418600, -70.62972600)
        mMap.addMarker(
                MarkerOptions().position(point592).title("Julio Cordero").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point593 = LatLng(-33.44637700, -70.73780100)
        mMap.addMarker(
                MarkerOptions().position(point593).title("Calle Waldo Taff 8124").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point594 = LatLng(-33.41023600, -70.57243800)
        mMap.addMarker(
                MarkerOptions().position(point594).title("Avenida Apoquindo 7700").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point595 = LatLng(-33.42497200, -70.70612900)
        mMap.addMarker(
                MarkerOptions().position(point595).title("Jujuy 1866").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point596 = LatLng(-33.42089800, -70.54386900)
        mMap.addMarker(
                MarkerOptions().position(point596).title("Alonso De Camargo Nº 8671 UV C- 15 Colón 8000").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point597 = LatLng(-33.40993200, -70.66553000)
        mMap.addMarker(
                MarkerOptions().position(point597).title("Armando Quesada esq. Hector Boccardo").snippet("Vidrio, Papel")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point598 = LatLng(-33.44454780, -70.73470320)
        mMap.addMarker(
                MarkerOptions().position(point598).title("Caletera San Pablo").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point599 = LatLng(-33.52438420, -70.77957000)
        mMap.addMarker(
                MarkerOptions().position(point599).title("Carmen Esq. Nueva San Martin 1500").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // 600

        val point600 = LatLng(-33.42152900, -70.69834400)
        mMap.addMarker(
                MarkerOptions().position(point600).title("Carrascal 4696").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point601 = LatLng(-33.42152900, -70.69834400)
        mMap.addMarker(
                MarkerOptions().position(point601).title("Carascal 4696").snippet("Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point602 = LatLng(-33.42154400, -70.69818160)
        mMap.addMarker(
                MarkerOptions().position(point602).title("Carascal 4696").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point603 = LatLng(-33.40645820, -70.64317300)
        mMap.addMarker(
                MarkerOptions().position(point603).title("Av. Einstein 590, Recoleta").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point604 = LatLng(-33.41844000, -70.55205300)
        mMap.addMarker(
                MarkerOptions().position(point604).title("Avenida IV Centenario 1016").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point605 = LatLng(-33.41658000, -70.68425000)
        mMap.addMarker(
                MarkerOptions().position(point605).title("Anibal Zañartu 2870").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point606 = LatLng(-33.41761300, -70.55465600)
        mMap.addMarker(
                MarkerOptions().position(point606).title("Rotonda Atenas (costado supermercado Líder) ").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point607 = LatLng(-33.41211900, -70.57155300)
        mMap.addMarker(
                MarkerOptions().position(point607).title("La Capitania N°255 UV C7 Plaza del Inca").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point608 = LatLng(-33.41853700, -70.55236220)
        mMap.addMarker(
                MarkerOptions().position(point608).title("Rotonda Atenas").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Pila")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point609 = LatLng(-33.41453720, -70.67779580)
        mMap.addMarker(
                MarkerOptions().position(point609).title("Avenida Domingo Sta María esq. Salomón Sack").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point610 = LatLng(-33.42168400, -70.69607500)
        mMap.addMarker(
                MarkerOptions().position(point610).title("Carrascal 4503").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point611 = LatLng(-33.41486700, -70.56313300)
        mMap.addMarker(
                MarkerOptions().position(point611).title("Martin de Zamora 6395").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point612 = LatLng(-33.49846300, -70.77137800)
        mMap.addMarker(
                MarkerOptions().position(point612).title("Blanco Encalada 1111").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point613 = LatLng(-33.51223350, -70.77558510)
        mMap.addMarker(
                MarkerOptions().position(point613).title("El Olimpo frente al 1973").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point614 = LatLng(-33.41087570, -70.66200230)
        mMap.addMarker(
                MarkerOptions().position(point614).title("Los Nidos esq Maruri").snippet("Vidrio, Papel")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point615 = LatLng(-33.49851790, -70.77122390)
        mMap.addMarker(
                MarkerOptions().position(point615).title("Avenida Blanco Encalada 1111").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point616 = LatLng(-33.50032110, -70.77164970)
        mMap.addMarker(
                MarkerOptions().position(point616).title("Guayaquil con Los Huemules").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point617 = LatLng(-33.41003080, -70.65702100)
        mMap.addMarker(
                MarkerOptions().position(point617).title("Hacienda Montalbán 1810").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point618 = LatLng(-33.53895600, -70.77806900)
        mMap.addMarker(
                MarkerOptions().position(point618).title("Glorias Navales 2040").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point619 = LatLng(-33.41506622, -70.67624268)
        mMap.addMarker(
                MarkerOptions().position(point619).title("Longitudinal 6 esq. Moises Rios").snippet("Vidrio, Papel")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point620 = LatLng(-33.41506622, -70.67624268)
        mMap.addMarker(
                MarkerOptions().position(point620).title("Longitudinal 6 esq. Moises Rios").snippet("Vidrio, Papel")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point621 = LatLng(-33.41028100, -70.65698700)
        mMap.addMarker(
                MarkerOptions().position(point621).title("Rodriguez 1230").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point622 = LatLng(-33.52833970, -70.77747410)
        mMap.addMarker(
                MarkerOptions().position(point622).title("Supermercado Lider, 3 Poniente").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point623 = LatLng(-33.44449414, -70.73097760)
        mMap.addMarker(
                MarkerOptions().position(point623).title("San Pablo Esq. Las Torres").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point624 = LatLng(-33.44974900, -70.73659500)
        mMap.addMarker(
                MarkerOptions().position(point624).title("Calle Paula Jara Quemada 7912").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point625 = LatLng(-33.41698100, -70.56145500)
        mMap.addMarker(
                MarkerOptions().position(point625).title("Avenida Cristobal Colón 6465").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point626 = LatLng(-33.51854450, -70.77528390)
        mMap.addMarker(
                MarkerOptions().position(point626).title("Olimpo Esq. Portales").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point627 = LatLng(-33.44366100, -70.72866800)
        mMap.addMarker(
                MarkerOptions().position(point627).title("Los Crisantemos 6667").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point628 = LatLng(-33.42284500, -70.69396100)
        mMap.addMarker(
                MarkerOptions().position(point628).title("Carrascal 4447").snippet("Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point629 = LatLng(-33.42823900, -70.70412560)
        mMap.addMarker(
                MarkerOptions().position(point629).title("Radal Nº 1621/Mapocho").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point630 = LatLng(-33.44952400, -70.73448200)
        mMap.addMarker(
                MarkerOptions().position(point630).title("Calle Tupungato 503").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point631 = LatLng(-33.42282100, -70.54897100)
        mMap.addMarker(
                MarkerOptions().position(point631).title("Tezcuco Nº 1283 UV C- 15 Santa Rosa de Apoquindo").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point632 = LatLng(-33.42845400, -70.70396000)
        mMap.addMarker(
                MarkerOptions().position(point632).title("Radal 1621").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point633 = LatLng(-33.50478120, -70.77092380)
        mMap.addMarker(
                MarkerOptions().position(point633).title("Pelantaro/Puren").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point634 = LatLng(-33.42115600, -70.55314100)
        mMap.addMarker(
                MarkerOptions().position(point634).title("Tomas Moro N°1172 UV C- 15 Los Volcanes").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point635 = LatLng(-33.45128600, -70.73558800)
        mMap.addMarker(
                MarkerOptions().position(point635).title("Miltón Rossel 7191").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point636 = LatLng(-33.41356670, -70.66268670)
        mMap.addMarker(
                MarkerOptions().position(point636).title("Escanilla esq. Central").snippet("Vidrio, Papel")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point637 = LatLng(-33.41357516, -70.66249206)
        mMap.addMarker(
                MarkerOptions().position(point637).title("Escanilla esq. Leonor Cepeda").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point638 = LatLng(-33.45067600, -70.73462700)
        mMap.addMarker(
                MarkerOptions().position(point638).title("Calle Tupungato 310").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point639 = LatLng(-33.42816300, -70.54012500)
        mMap.addMarker(
                MarkerOptions().position(point639).title("Avenida Francisco Bilbao 8750").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point640 = LatLng(-33.44449520, -70.72673380)
        mMap.addMarker(
                MarkerOptions().position(point640).title("Avenida San Pablo/Gral Juan Buendía").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point641 = LatLng(-33.42246000, -70.55261100)
        mMap.addMarker(
                MarkerOptions().position(point641).title("Alonso de Camargo 7550").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point642 = LatLng(-33.53178100, -70.77472300)
        mMap.addMarker(
                MarkerOptions().position(point642).title("Alfredo Silva Carvallo 1414").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point643 = LatLng(-33.42268300, -70.55252450)
        mMap.addMarker(
                MarkerOptions().position(point643).title("Plaza Filipinas").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Pila")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point644 = LatLng(-33.45151120, -70.73435670)
        mMap.addMarker(
                MarkerOptions().position(point644).title("Miltón Rossel 7191").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point645 = LatLng(-33.42875300, -70.54058800)
        mMap.addMarker(
                MarkerOptions().position(point645).title("Avenida Francisco Bilbao 8750").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point646 = LatLng(-33.41217000, -70.59256700)
        mMap.addMarker(
                MarkerOptions().position(point646).title("Avenida Presidente Riesco 3700").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point647 = LatLng(-33.47929287, -70.75655220)
        mMap.addMarker(
                MarkerOptions().position(point647).title("Avenida El Rosal 6361").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point648 = LatLng(-33.42256300, -70.55535690)
        mMap.addMarker(
                MarkerOptions().position(point648).title("Plaza Filipinas (Cañumanqui con Alonso de Camargo)").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point649 = LatLng(-33.52956800, -70.77317800)
        mMap.addMarker(
                MarkerOptions().position(point649).title("Avenida Olimpo 650").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point650 = LatLng(-33.41428900, -70.58470900)
        mMap.addMarker(
                MarkerOptions().position(point650).title("Subcentro Escuela Militar").snippet("Pila")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point651 = LatLng(-33.44701000, -70.72687500)
        mMap.addMarker(
                MarkerOptions().position(point651).title("General Buendía 513").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point652 = LatLng(-33.42414700, -70.68812600)
        mMap.addMarker(
                MarkerOptions().position(point652).title("Lope de Ulloa/Av. Carrascal").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point653 = LatLng(-33.41885176, -70.67211778)
        mMap.addMarker(
                MarkerOptions().position(point653).title("Enrique Soro esq. Salomon Sack").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point654 = LatLng(-33.41682000, -70.66395200)
        mMap.addMarker(
                MarkerOptions().position(point654).title("Fermín Vivaceta esq Avenida Fermín Vivaceta").snippet("Papel, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point655 = LatLng(-33.44227820, -70.71962760)
        mMap.addMarker(
                MarkerOptions().position(point655).title("Calle San German 839").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point656 = LatLng(-33.42484940, -70.55345310)
        mMap.addMarker(
                MarkerOptions().position(point656).title("Tomás Moro 1590").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point657 = LatLng(-33.43557400, -70.70903800)
        mMap.addMarker(
                MarkerOptions().position(point657).title("Gaspar de Toro").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point658 = LatLng(-33.49960350, -70.76425270)
        mMap.addMarker(
                MarkerOptions().position(point658).title("San Martín (frente al 3031)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point659 = LatLng(-33.41930011, -70.67068199)
        mMap.addMarker(
                MarkerOptions().position(point659).title("Salomón Sack 331").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point660 = LatLng(-33.44972910, -70.72796190)
        mMap.addMarker(
                MarkerOptions().position(point660).title("General Buendía 350").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point661 = LatLng(-33.42188100, -70.56291800)
        mMap.addMarker(
                MarkerOptions().position(point661).title("Doctora Eloisa Diaz N°6471 UV C14 Bilbao Alto").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point662 = LatLng(-33.44979100, -70.72795100)
        mMap.addMarker(
                MarkerOptions().position(point662).title("General Buendía 350").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point663 = LatLng(-33.45210300, -70.73017900)
        mMap.addMarker(
                MarkerOptions().position(point663).title("Akron 6662 - Junta de Vecinos N°23").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point664 = LatLng(-33.44278000, -70.71827700)
        mMap.addMarker(
                MarkerOptions().position(point664).title("Avenida San Pablo 5959").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point665 = LatLng(-33.53548030, -70.77072780)
        mMap.addMarker(
                MarkerOptions().position(point665).title("Tres Poniente con Camino Melipilla").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point666 = LatLng(-33.41979600, -70.67024000)
        mMap.addMarker(
                MarkerOptions().position(point666).title("Salomon Sack 351").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point667 = LatLng(-33.41984470, -70.67028600)
        mMap.addMarker(
                MarkerOptions().position(point667).title("Salomon Sack 351").snippet("Punto Limpio - Vidrio, Papel, Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point668 = LatLng(-33.41382980, -70.63906097)
        mMap.addMarker(
                MarkerOptions().position(point668).title("Avenida Valdivieso esq Puma").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point669 = LatLng(-33.45233460, -70.72976260)
        mMap.addMarker(
                MarkerOptions().position(point669).title("Calle Miltón Rossel").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point670 = LatLng(-33.45234980, -70.72974100)
        mMap.addMarker(
                MarkerOptions().position(point670).title("Junta De Vecinos Villa Kennedy, Milton Rossel 240").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point671 = LatLng(-33.43928900, -70.71244800)
        mMap.addMarker(
                MarkerOptions().position(point671).title("Calle 9 de Julio 5564").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point672 = LatLng(-33.42211900, -70.67662800)
        mMap.addMarker(
                MarkerOptions().position(point672).title("Juana Atala de Hirmas 2460").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point673 = LatLng(-33.44843150, -70.72476440)
        mMap.addMarker(
                MarkerOptions().position(point673).title("Av. NEPTUNO ESQUINA CALLE TERRITORIO ANTARTICO").snippet("Punto Limpio - Vidrio, Papel, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point674 = LatLng(-33.41553680, -70.59203060)
        mMap.addMarker(
                MarkerOptions().position(point674).title("Apoquindo 3650").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point675 = LatLng(-33.41469900, -70.59850800)
        mMap.addMarker(
                MarkerOptions().position(point675).title("Plaza Perú (Isidora Goyenechea 3051)").snippet("Pila")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point676 = LatLng(-33.41412800, -70.63517400)
        mMap.addMarker(
                MarkerOptions().position(point676).title("Francisco Silva 1480").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point677 = LatLng(-33.42968290, -70.54746170)
        mMap.addMarker(
                MarkerOptions().position(point677).title("Francisco de Bilbao con Duqueco, Bandejón Central Francisco Bilbao").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point678 = LatLng(-33.42981620, -70.54784620)
        mMap.addMarker(
                MarkerOptions().position(point678).title("Bandejón Central Francisco Bilbao frente a entrada Parque Alberto Hurtado").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point679 = LatLng(-33.42965060, -70.54821600)
        mMap.addMarker(
                MarkerOptions().position(point679).title("Bandejón Central Francisco Bilbao").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Pila")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point680 = LatLng(-33.50988700, -70.76543200)
        mMap.addMarker(
                MarkerOptions().position(point680).title("Templo de Maipú, Camino Rinconada").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point681 = LatLng(-33.44840700, -70.72319100)
        mMap.addMarker(
                MarkerOptions().position(point681).title("Territorio Antártico/Neptuno").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point682 = LatLng(-33.42996300, -70.69317800)
        mMap.addMarker(
                MarkerOptions().position(point682).title("Juan Barros/Mendoza").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point683 = LatLng(-33.42996300, -70.69317800)
        mMap.addMarker(
                MarkerOptions().position(point683).title("Juan Barros").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point684 = LatLng(-33.43003420, -70.69276430)
        mMap.addMarker(
                MarkerOptions().position(point684).title("Juan Barros/Mendoza").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point685 = LatLng(-33.44044500, -70.71144100)
        mMap.addMarker(
                MarkerOptions().position(point685).title("Calle Los Tamarindos 5467").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point686 = LatLng(-33.43973200, -70.70999900)
        mMap.addMarker(
                MarkerOptions().position(point686).title("9 de Julio 5300").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point687 = LatLng(-33.43744600, -70.70593910)
        mMap.addMarker(
                MarkerOptions().position(point687).title("Plaza José Besa V. Rozas/G. de Toro").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point688 = LatLng(-33.43754500, -70.70578200)
        mMap.addMarker(
                MarkerOptions().position(point688).title("Martínez de Rozas 5093").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point689 = LatLng(-33.42094900, -70.66524600)
        mMap.addMarker(
                MarkerOptions().position(point689).title("Fidel Monje esq. Bajeles").snippet("Vidrio, Papel")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point690 = LatLng(-33.43969530, -70.53250600)
        mMap.addMarker(
                MarkerOptions().position(point690).title("Leonardo Murialdo 248").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point691 = LatLng(-33.41523300, -70.61745050)
        mMap.addMarker(
                MarkerOptions().position(point691).title("Avenida Parque Metropolitano acceso Pedro Valdivia Norte").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point692 = LatLng(-33.41692000, -70.64137300)
        mMap.addMarker(
                MarkerOptions().position(point692).title("Las Galaxias 1274").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point693 = LatLng(-33.41696300, -70.64044700)
        mMap.addMarker(
                MarkerOptions().position(point693).title("Pasaje El sol").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point694 = LatLng(-33.44173800, -70.71068600)
        mMap.addMarker(
                MarkerOptions().position(point694).title("Calle Los Copihues 5462").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point695 = LatLng(-33.42215777, -70.66557606)
        mMap.addMarker(
                MarkerOptions().position(point695).title("Gamero esq. Salomon Sack").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point696 = LatLng(-33.44473300, -70.71441700)
        mMap.addMarker(
                MarkerOptions().position(point696).title("Scala 751").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point697 = LatLng(-33.41885800, -70.64820900)
        mMap.addMarker(
                MarkerOptions().position(point697).title("Avenida Unión 796").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point698 = LatLng(-33.42845100, -70.68305300)
        mMap.addMarker(
                MarkerOptions().position(point698).title("Lucas Sierra 3557").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point699 = LatLng(-33.41818900, -70.64196800)
        mMap.addMarker(
                MarkerOptions().position(point699).title("Plaza Villa San Cristóbal").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // 700

        val point700 = LatLng(-33.44062100, -70.53497500)
        mMap.addMarker(
                MarkerOptions().position(point700).title("Avenida Principe de Gales 9140").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point701 = LatLng(-33.42877150, -70.68254000)
        mMap.addMarker(
                MarkerOptions().position(point701).title("Avenida Matucana / Mapocho").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point702 = LatLng(-33.43394800, -70.69379200)
        mMap.addMarker(
                MarkerOptions().position(point702).title("Andes 4320").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point703 = LatLng(-33.44158700, -70.53488700)
        mMap.addMarker(
                MarkerOptions().position(point703).title("Avenida Principe de Gales 9200").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point704 = LatLng(-33.62930300, -70.71329500)
        mMap.addMarker(
                MarkerOptions().position(point704).title("Jorge Alessandri con ruta 5 20005").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point705 = LatLng(-33.44117800, -70.53616390)
        mMap.addMarker(
                MarkerOptions().position(point705).title("Avenida Principe de Gales 9140").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point706 = LatLng(-33.51084100, -70.75991600)
        mMap.addMarker(
                MarkerOptions().position(point706).title("Avenida 5 de Abril 216").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point707 = LatLng(-33.44004700, -70.70193800)
        mMap.addMarker(
                MarkerOptions().position(point707).title("San Pablo 4870").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point708 = LatLng(-33.42262600, -70.65542600)
        mMap.addMarker(
                MarkerOptions().position(point708).title("Independencia 740").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point709 = LatLng(-33.50250600, -70.75665200)
        mMap.addMarker(
                MarkerOptions().position(point709).title("Avenida Pajaritos 2689").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point710 = LatLng(-33.44021520, -70.70163000)
        mMap.addMarker(
                MarkerOptions().position(point710).title("San Pablo 4870").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point711 = LatLng(-33.47133020, -70.73830960)
        mMap.addMarker(
                MarkerOptions().position(point711).title("Avenida Pajarito 9130").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point712 = LatLng(-33.43492500, -70.55042990)
        mMap.addMarker(
                MarkerOptions().position(point712).title("Valenzuela Puelma 7541").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point713 = LatLng(-33.63998000, -70.69213900)
        mMap.addMarker(
                MarkerOptions().position(point713).title("Camino Los Morros 1480").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point714 = LatLng(-33.43024030, -70.67959280)
        mMap.addMarker(
                MarkerOptions().position(point714).title("Chacabuco/Chañarcillo").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point715 = LatLng(-33.43028000, -70.67964900)
        mMap.addMarker(
                MarkerOptions().position(point715).title("Chacabuco").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point716 = LatLng(-33.45093200, -70.71666000)
        mMap.addMarker(
                MarkerOptions().position(point716).title("Avenida Dorsal 6001").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point717 = LatLng(-33.42138700, -70.59668000)
        mMap.addMarker(
                MarkerOptions().position(point717).title("Mariano Sanchez Fontecilla 498").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point718 = LatLng(-33.47831070, -70.74298120)
        mMap.addMarker(
                MarkerOptions().position(point718).title("Avenida Los Pajaritos 4760").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point719 = LatLng(-33.50829110, -70.75756350)
        mMap.addMarker(
                MarkerOptions().position(point719).title("Av. Los Pajaritos 2100").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point720 = LatLng(-33.42694800, -70.57279200)
        mMap.addMarker(
                MarkerOptions().position(point720).title("Juan Esteban Montero Nº 4760 UV C- 4 Francisco Bilbao").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point721 = LatLng(-33.51628900, -70.75948300)
        mMap.addMarker(
                MarkerOptions().position(point721).title("Avenida Portales 205").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point722 = LatLng(-33.42591900, -70.66382800)
        mMap.addMarker(
                MarkerOptions().position(point722).title("Calle Uno 721").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point723 = LatLng(-33.42157745, -70.64050293)
        mMap.addMarker(
                MarkerOptions().position(point723).title("Perú esq Alberto Figueroa").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point724 = LatLng(-33.42052730, -70.61690690)
        mMap.addMarker(
                MarkerOptions().position(point724).title("Avenida Sta. Maria 2020 2020").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point725 = LatLng(-33.42181300, -70.64051600)
        mMap.addMarker(
                MarkerOptions().position(point725).title("Avenida Peru").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point726 = LatLng(-33.42075235, -70.61455466)
        mMap.addMarker(
                MarkerOptions().position(point726).title("Santa Maria 2020").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point727 = LatLng(-33.50707650, -70.75628170)
        mMap.addMarker(
                MarkerOptions().position(point727).title("Maipu / Bailen").snippet("Papel, Cartón, Cartón para bebida")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point728 = LatLng(-33.47759800, -70.74098400)
        mMap.addMarker(
                MarkerOptions().position(point728).title("Avenida Los Pajaritos 4909").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point729 = LatLng(-33.45591700, -70.72061200)
        mMap.addMarker(
                MarkerOptions().position(point729).title("Avenida General Bonilla 6100").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point730 = LatLng(-33.44799800, -70.71025100)
        mMap.addMarker(
                MarkerOptions().position(point730).title("Calle La Comuna 5450").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point731 = LatLng(-33.43153100, -70.67846200)
        mMap.addMarker(
                MarkerOptions().position(point731).title("Herrera/Atacama").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point732 = LatLng(-33.42650600, -70.57877200)
        mMap.addMarker(
                MarkerOptions().position(point732).title("Avenida Isabel La Católica 4360").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point733 = LatLng(-33.44798300, -70.70981600)
        mMap.addMarker(
                MarkerOptions().position(point733).title("Calle La Comuna 5438").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point734 = LatLng(-33.53046340, -70.76026400)
        mMap.addMarker(
                MarkerOptions().position(point734).title("Camino Melipilla").snippet("Vidrio, Papel, Cartón, Cartón para bebida")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point735 = LatLng(-33.42852700, -70.66890900)
        mMap.addMarker(
                MarkerOptions().position(point735).title("Avenida Presidente Balmaceda con Ricardo Cumming null").snippet("Punto Limpio - Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point736 = LatLng(-33.42392500, -70.64880900)
        mMap.addMarker(
                MarkerOptions().position(point736).title("Los Olivos").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point737 = LatLng(-33.45056500, -70.71281400)
        mMap.addMarker(
                MarkerOptions().position(point737).title("Avenida Dorsal 5864").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point738 = LatLng(-33.42199200, -70.60860600)
        mMap.addMarker(
                MarkerOptions().position(point738).title("Nueva Providencia 2250").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point739 = LatLng(-33.44111470, -70.54332170)
        mMap.addMarker(
                MarkerOptions().position(point739).title("Carlos Ossandón 1255-1551").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point740 = LatLng(-33.42892300, -70.66945000)
        mMap.addMarker(
                MarkerOptions().position(point740).title("Presidente Balmaceda").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point741 = LatLng(-33.42211520, -70.60872610)
        mMap.addMarker(
                MarkerOptions().position(point741).title("Av. Providencia (Frente Restaurant Giratorío) 2250").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point742 = LatLng(-33.52596700, -70.75890400)
        mMap.addMarker(
                MarkerOptions().position(point742).title("Pasaje San Ramón 101").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point743 = LatLng(-33.42339000, -70.64234900)
        mMap.addMarker(
                MarkerOptions().position(point743).title("Fischer 395").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point744 = LatLng(-33.42971740, -70.67031970)
        mMap.addMarker(
                MarkerOptions().position(point744).title("Yungay/Cautín").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point745 = LatLng(-33.62500530, -70.71160540)
        mMap.addMarker(
                MarkerOptions().position(point745).title("Volcán Puntiagudo/Volcán Tinguiririca").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point746 = LatLng(-33.62292530, -70.71421080)
        mMap.addMarker(
                MarkerOptions().position(point746).title("Lomas de Mirasur 884").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point747 = LatLng(-33.42387300, -70.64015100)
        mMap.addMarker(
                MarkerOptions().position(point747).title("Avenida Peru").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point748 = LatLng(-33.46660200, -70.72948500)
        mMap.addMarker(
                MarkerOptions().position(point748).title("Gladys Marín Millie 6913-6947").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point749 = LatLng(-33.45801140, -70.72006060)
        mMap.addMarker(
                MarkerOptions().position(point749).title("Laguna Sur con esquina Avenida Oceanica").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point750 = LatLng(-33.46760100, -70.72996800)
        mMap.addMarker(
                MarkerOptions().position(point750).title("Avenida Gladys Marín Millie 6950").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point751 = LatLng(-33.42388916, -70.63983917)
        mMap.addMarker(
                MarkerOptions().position(point751).title("Perú esq Maestra Lidia Torres").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point752 = LatLng(-33.44214430, -70.54445630)
        mMap.addMarker(
                MarkerOptions().position(point752).title("Avenida Echeñique 8428").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point753 = LatLng(-33.42546310, -70.64869840)
        mMap.addMarker(
                MarkerOptions().position(point753).title("Juárez Larga 760").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point754 = LatLng(-33.43249570, -70.67496720)
        mMap.addMarker(
                MarkerOptions().position(point754).title("Mapocho/Libertad").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point755 = LatLng(-33.43249570, -70.67496720)
        mMap.addMarker(
                MarkerOptions().position(point755).title("Diego Rivera con Leonardo da Vinci, Villa Los Portales").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point756 = LatLng(-33.45144280, -70.71092150)
        mMap.addMarker(
                MarkerOptions().position(point756).title("Las Rejas Norte").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point757 = LatLng(-33.62765420, -70.70590150)
        mMap.addMarker(
                MarkerOptions().position(point757).title("Diego de Rivera").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point758 = LatLng(-33.50916900, -70.75330500)
        mMap.addMarker(
                MarkerOptions().position(point758).title("Primera Transversal 2000").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point759 = LatLng(-33.44408500, -70.69884800)
        mMap.addMarker(
                MarkerOptions().position(point759).title("Huérfanos 4651-4661").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point760 = LatLng(-33.44408250, -70.69879260)
        mMap.addMarker(
                MarkerOptions().position(point760).title("Huérfanos 4661").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point761 = LatLng(-33.50529500, -70.75179300)
        mMap.addMarker(
                MarkerOptions().position(point761).title("Capellán Benavides 2321").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point762 = LatLng(-33.42870800, -70.58098400)
        mMap.addMarker(
                MarkerOptions().position(point762).title("Juan De Austria Nº 1705 UV C- 3 San Pedro").snippet("Vidrio, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point763 = LatLng(-33.42652200, -70.59138640)
        mMap.addMarker(
                MarkerOptions().position(point763).title("Eliodoro Yañez 2995").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point764 = LatLng(-33.42427100, -70.61634800)
        mMap.addMarker(
                MarkerOptions().position(point764).title("La Concepción 236").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point765 = LatLng(-33.42619800, -70.64598610)
        mMap.addMarker(
                MarkerOptions().position(point765).title("Juárez Larga 616").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point766 = LatLng(-33.43604580, -70.68101570)
        mMap.addMarker(
                MarkerOptions().position(point766).title("San Pablo 3358").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point767 = LatLng(-33.51602600, -70.75427200)
        mMap.addMarker(
                MarkerOptions().position(point767).title("Cuatro Alamos 215").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point768 = LatLng(-33.42705444, -70.59519711)
        mMap.addMarker(
                MarkerOptions().position(point768).title("Juan de Dios Vial 1035").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point769 = LatLng(-33.44571100, -70.69866200)
        mMap.addMarker(
                MarkerOptions().position(point769).title("Nueva Imperial 4713").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point770 = LatLng(-33.44374640, -70.69513330)
        mMap.addMarker(
                MarkerOptions().position(point770).title("Cruchaga Montt/Huérfanos").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point771 = LatLng(-33.43184700, -70.57472200)
        mMap.addMarker(
                MarkerOptions().position(point771).title("Avenida Ossa 2294").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point772 = LatLng(-33.42696300, -70.64477900)
        mMap.addMarker(
                MarkerOptions().position(point772).title("Buenos Aires/Manzano").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point773 = LatLng(-33.43539900, -70.67695000)
        mMap.addMarker(
                MarkerOptions().position(point773).title("San Pablo 2989").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point774 = LatLng(-33.43076300, -70.57910200)
        mMap.addMarker(
                MarkerOptions().position(point774).title("Avenida Francisco Bilbao 4144").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point775 = LatLng(-33.43126700, -70.57872700)
        mMap.addMarker(
                MarkerOptions().position(point775).title("Avenida Francisco Bilbao 4144").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point776 = LatLng(-33.43958900, -70.55610500)
        mMap.addMarker(
                MarkerOptions().position(point776).title("Avenida Principe de Gales 7271").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point777 = LatLng(-33.46368590, -70.52056917)
        mMap.addMarker(
                MarkerOptions().position(point777).title("Alvaro Casanova 394").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point778 = LatLng(-33.42643820, -70.61442830)
        mMap.addMarker(
                MarkerOptions().position(point778).title("Carlos Antúnez 1801").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point779 = LatLng(-33.62799800, -70.69889100)
        mMap.addMarker(
                MarkerOptions().position(point779).title("Carretera 5 Sur km 17").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point780 = LatLng(-33.43796300, -70.67886500)
        mMap.addMarker(
                MarkerOptions().position(point780).title("Chacabuco").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point781 = LatLng(-33.42688000, -70.61602800)
        mMap.addMarker(
                MarkerOptions().position(point781).title("Providencia 1645").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point782 = LatLng(-33.46671700, -70.72268700)
        mMap.addMarker(
                MarkerOptions().position(point782).title("Cuadro Verde 160").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point783 = LatLng(-33.43081627, -70.58589605)
        mMap.addMarker(
                MarkerOptions().position(point783).title("Pocuro 3083").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point784 = LatLng(-33.42837180, -70.64047060)
        mMap.addMarker(
                MarkerOptions().position(point784).title("Buenos Aires/Loreto").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point785 = LatLng(-33.42722910, -70.61732290)
        mMap.addMarker(
                MarkerOptions().position(point785).title("Sta. Beatriz 47").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point786 = LatLng(-33.50910990, -70.74879470)
        mMap.addMarker(
                MarkerOptions().position(point786).title("5 de Abril 700").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point787 = LatLng(-33.42865753, -70.64105225)
        mMap.addMarker(
                MarkerOptions().position(point787).title("Loreto 382").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point788 = LatLng(-33.45761500, -70.71167000)
        mMap.addMarker(
                MarkerOptions().position(point788).title("Avenida Ecuador 5445").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point789 = LatLng(-33.51713820, -70.75057590)
        mMap.addMarker(
                MarkerOptions().position(point789).title("Elizabeth Heisse 500").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point790 = LatLng(-33.64776200, -70.62579120)
        mMap.addMarker(
                MarkerOptions().position(point790).title("Virginia Subercaseaux 5201").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point791 = LatLng(-33.42786670, -70.61691749)
        mMap.addMarker(
                MarkerOptions().position(point791).title("Alcalde Rafael Vives 56").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point792 = LatLng(-33.42789600, -70.61686200)
        mMap.addMarker(
                MarkerOptions().position(point792).title("Alcalde Rafael Vives 56").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point793 = LatLng(-33.44434850, -70.68988990)
        mMap.addMarker(
                MarkerOptions().position(point793).title("Las Acacias/Portales").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point794 = LatLng(-33.44434850, -70.68988990)
        mMap.addMarker(
                MarkerOptions().position(point794).title("Las Acacias/Portales").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point795 = LatLng(-33.43844600, -70.56499500)
        mMap.addMarker(
                MarkerOptions().position(point795).title("Avenida Principe de Gales 6540").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point796 = LatLng(-33.44443434, -70.55184740)
        mMap.addMarker(
                MarkerOptions().position(point796).title("Simón Bolívar 7724").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point797 = LatLng(-33.51726030, -70.74976650)
        mMap.addMarker(
                MarkerOptions().position(point797).title("Santa Gemita/Elizabeth Heisse").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point798 = LatLng(-33.43481340, -70.57634050)
        mMap.addMarker(
                MarkerOptions().position(point798).title("Calle Patricia Isidora 2130").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point799 = LatLng(-33.43785900, -70.67364400)
        mMap.addMarker(
                MarkerOptions().position(point799).title("Santo Domingo 2706").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        //800

        val point800 = LatLng(-33.43470400, -70.66326900)
        mMap.addMarker(
                MarkerOptions().position(point800).title("San Pablo 1825").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point801 = LatLng(-33.43325300, -70.65769500)
        mMap.addMarker(
                MarkerOptions().position(point801).title("General Mackenna").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point802 = LatLng(-33.45856340, -70.71010130)
        mMap.addMarker(
                MarkerOptions().position(point802).title("Las Catalpas (Esquina Alameda)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point803 = LatLng(-33.43167778, -70.59227500)
        mMap.addMarker(
                MarkerOptions().position(point803).title("Avenida Pocuro 2801").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point804 = LatLng(-33.44102000, -70.67965000)
        mMap.addMarker(
                MarkerOptions().position(point804).title("Avenida Matucana 403").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point805 = LatLng(-33.42932050, -70.61704270)
        mMap.addMarker(
                MarkerOptions().position(point805).title("Antonio Varas 106").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point806 = LatLng(-33.44125000, -70.67980700)
        mMap.addMarker(
                MarkerOptions().position(point806).title("Matucana").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point807 = LatLng(-33.43714500, -70.66880600)
        mMap.addMarker(
                MarkerOptions().position(point807).title("Ricardo Cumming 662").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point808 = LatLng(-33.42986000, -70.62758300)
        mMap.addMarker(
                MarkerOptions().position(point808).title("Monte Carmelo 30").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point809 = LatLng(-33.43382500, -70.65597700)
        mMap.addMarker(
            MarkerOptions().position(point809).title("Teatinos 848-802").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point810 = LatLng(-33.49279300, -70.73825200)
        mMap.addMarker(
            MarkerOptions().position(point810).title("Primo de Rivera 1447").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point811 = LatLng(-33.43074799, -70.63619995)
        mMap.addMarker(
            MarkerOptions().position(point811).title("Pio Nono Esq. Santa Filomena").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point812 = LatLng(-33.46237900, -70.71300500)
        mMap.addMarker(
            MarkerOptions().position(point812).title("Calle Odebro 306").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point8139 = LatLng(-33.43021915, -70.62728941)
        mMap.addMarker(
            MarkerOptions().position(point8139).title("Monte Carmelo 30").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point813 = LatLng(-33.43239846, -70.59406140)
        mMap.addMarker(
            MarkerOptions().position(point813).title("Augusto Ovalle Castillo 1360").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point814 = LatLng(-33.44214360, -70.68004830)
        mMap.addMarker(
            MarkerOptions().position(point814).title("Matucana 464").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point815 = LatLng(-33.43088850, -70.63630560)
        mMap.addMarker(
            MarkerOptions().position(point815).title("Pio Nono").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point816 = LatLng(-33.44702700, -70.69016990)
        mMap.addMarker(
            MarkerOptions().position(point816).title("Las Acacias Esq. Paseo El Nogal 2500").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point817 = LatLng(-33.43249700, -70.59412600)
        mMap.addMarker(
            MarkerOptions().position(point817).title("Augusto Ovalle Castillo 1360").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point818 = LatLng(-33.60801400, -70.52292100)
        mMap.addMarker(
            MarkerOptions().position(point818).title("Calle 27 De Septiembre 04407").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point819 = LatLng(-33.45715700, -70.70596300)
        mMap.addMarker(
            MarkerOptions().position(point819).title("Avenida Ecuador").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point820 = LatLng(-33.44001691, -70.67409642)
        mMap.addMarker(
            MarkerOptions().position(point820).title("Catedral").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point821 = LatLng(-33.45981030, -70.70911670)
        mMap.addMarker(
            MarkerOptions().position(point821).title("Las Catalpas Oriente 99").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point8229 = LatLng(-33.43175800, -70.63971700)
        mMap.addMarker(
            MarkerOptions().position(point8229).title("Antonia López de Bello/Bombero Núñez").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point822 = LatLng(-33.44254300, -70.67911000)
        mMap.addMarker(
            MarkerOptions().position(point822).title("Huérfanos 3255").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point823 = LatLng(-33.61952380, -70.70335230)
        mMap.addMarker(
            MarkerOptions().position(point823).title("Parque Fray Jorge 236-246").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point824 = LatLng(-33.44395980, -70.55947880)
        mMap.addMarker(
            MarkerOptions().position(point824).title("Santa Rita 1123").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point825 = LatLng(-33.50109700, -70.74099080)
        mMap.addMarker(
            MarkerOptions().position(point825).title("2 Norte 1373").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point826 = LatLng(-33.50128400, -70.74097000)
        mMap.addMarker(
            MarkerOptions().position(point826).title("2 Norte 1373").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point827 = LatLng(-33.45108320, -70.69507760)
        mMap.addMarker(
            MarkerOptions().position(point827).title("Embajador Quintana/San Gumercindo").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point828 = LatLng(-33.45108320, -70.69507760)
        mMap.addMarker(
            MarkerOptions().position(point828).title("Embajador Quintana/San Gumercindo").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point829 = LatLng(-33.44762830, -70.68825180)
        mMap.addMarker(
            MarkerOptions().position(point829).title("Paseo Central (Esquina Las Encinas, Villa Portales)").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point830 = LatLng(-33.44760530, -70.68811120)
        mMap.addMarker(
            MarkerOptions().position(point830).title("Las Encinas Esq. Paseo Central 3000").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point831 = LatLng(-33.43310250, -70.64010570)
        mMap.addMarker(
            MarkerOptions().position(point831).title("Bombero Nuñez/Dardignac").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point832 = LatLng(-33.43343720, -70.64248610)
        mMap.addMarker(
            MarkerOptions().position(point832).title("Loreto/Bellavista").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point833 = LatLng(-33.43402950, -70.64484350)
        mMap.addMarker(
            MarkerOptions().position(point833).title("Avenida Avenida Santa María esq Loreto").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point834 = LatLng(-33.47037000, -70.52359360)
        mMap.addMarker(
            MarkerOptions().position(point834).title("Álvaro Casanova 916").snippet("Pila, Celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point837 = LatLng(-33.43331700, -70.63577600)
        mMap.addMarker(
            MarkerOptions().position(point837).title("Dardignac").snippet("Vidrio")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point838 = LatLng(-33.43286500, -70.61132800)
        mMap.addMarker(
                MarkerOptions().position(point838).title("Marchant Pereira 880").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point839 = LatLng(-33.43854500, -70.66239400)
        mMap.addMarker(
                MarkerOptions().position(point839).title("Almirante Barroso").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point840 = LatLng(-33.43354200, -70.63714700)
        mMap.addMarker(
                MarkerOptions().position(point840).title("Dardignac").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point841 = LatLng(-33.45102900, -70.54944560)
        mMap.addMarker(
                MarkerOptions().position(point841).title("Avenida Alcalde Fernando Castillo Velasco 7631").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point842 = LatLng(-33.43339180, -70.63459980)
        mMap.addMarker(
                MarkerOptions().position(point842).title("Plaza Camilo Mori, Antonia Lopez De Bello 120").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point843 = LatLng(-33.46337430, -70.70949530)
        mMap.addMarker(
                MarkerOptions().position(point843).title("Calle Las Lilas 5810").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point844 = LatLng(-33.44018600, -70.66670200)
        mMap.addMarker(
                MarkerOptions().position(point844).title("Compañía/Maturana").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point845 = LatLng(-33.46433260, -70.71000160)
        mMap.addMarker(
                MarkerOptions().position(point845).title("El Lingue").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point846 = LatLng(-33.43533300, -70.64514000)
        mMap.addMarker(
                MarkerOptions().position(point846).title("Ismael Valdes Vergara").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point847 = LatLng(-33.59775630, -70.51816720)
        mMap.addMarker(
                MarkerOptions().position(point847).title("San José de Maipo 7712").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point848 = LatLng(-33.43533300, -70.64514000)
        mMap.addMarker(
                MarkerOptions().position(point848).title("Avenida Matucana 100").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point849 = LatLng(-33.44284700, -70.67221600)
        mMap.addMarker(
                MarkerOptions().position(point849).title("Avenida Portales").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point850 = LatLng(-33.44453580, -70.56571150)
        mMap.addMarker(
                MarkerOptions().position(point850).title("Avenida Echeñique 6401").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point851 = LatLng(-33.44481100, -70.67627300)
        mMap.addMarker(
                MarkerOptions().position(point851).title("Moneda/Maipú").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point852 = LatLng(-33.50225400, -70.73772400)
        mMap.addMarker(
                MarkerOptions().position(point852).title("Avenida Américo Vespucio 1500").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point853 = LatLng(-33.45555500, -70.69662500)
        mMap.addMarker(
                MarkerOptions().position(point853).title("Avenida Alameda 4470").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point854 = LatLng(-33.43424700, -70.62926200)
        mMap.addMarker(
                MarkerOptions().position(point854).title("Avenida Providencia 410").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point855 = LatLng(-33.43689100, -70.59224600)
        mMap.addMarker(
                MarkerOptions().position(point855).title("El Bosque 1928").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point856 = LatLng(-33.43439637, -70.62909570)
        mMap.addMarker(
                MarkerOptions().position(point856).title("Avenida Providencia 410").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point857 = LatLng(-33.43706900, -70.59205600)
        mMap.addMarker(
                MarkerOptions().position(point857).title("El Bosque 1928").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point858 = LatLng(-33.44211600, -70.66779300)
        mMap.addMarker(
                MarkerOptions().position(point858).title("Cumming 221").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point859 = LatLng(-33.44025880, -70.57948100)
        mMap.addMarker(
                MarkerOptions().position(point859).title("Amapolas/Pasaje 12 (FTE. COLEGIO AMAPOLAS)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point860 = LatLng(-33.43576400, -70.60071200)
        mMap.addMarker(
                MarkerOptions().position(point860).title("California 2424").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point861 = LatLng(-33.43579717, -70.60092427)
        mMap.addMarker(
                MarkerOptions().position(point861).title("California 2424").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point862 = LatLng(-33.45398000, -70.69218600)
        mMap.addMarker(
                MarkerOptions().position(point862).title("Avenida Libertador Bernardo O´Higgins (Esquina Toro Mazotte)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point863 = LatLng(-33.43868840, -70.58889768)
        mMap.addMarker(
                MarkerOptions().position(point863).title("Dinamarca 1830").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point864 = LatLng(-33.43870500, -70.58898400)
        mMap.addMarker(
                MarkerOptions().position(point864).title("Dinamarca 1830").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point865 = LatLng(-33.44384200, -70.66797200)
        mMap.addMarker(
                MarkerOptions().position(point865).title("Moneda/Av. Ricardo Cumming").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point866 = LatLng(-33.45759800, -70.54536600)
        mMap.addMarker(
                MarkerOptions().position(point866).title("Jorge Alessandri 680").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point867 = LatLng(-33.46958310, -70.71104650)
        mMap.addMarker(
                MarkerOptions().position(point867).title("Plaza Taitao").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point868 = LatLng(-33.63145400, -70.57354000)
        mMap.addMarker(
                MarkerOptions().position(point868).title("Avenida Concha y Toro 2188").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point869 = LatLng(-33.45735000, -70.54639440)
        mMap.addMarker(
                MarkerOptions().position(point869).title("Avenida Alessandri 680").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point870 = LatLng(-33.43662507, -70.63055645)
        mMap.addMarker(
                MarkerOptions().position(point870).title("Seminario 15").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point871 = LatLng(-33.43669800, -70.63067400)
        mMap.addMarker(
                MarkerOptions().position(point871).title("Seminario 15").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point872 = LatLng(-33.47359500, -70.71449300)
        mMap.addMarker(
                MarkerOptions().position(point872).title("Las Estepas 845").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point873 = LatLng(-33.60680000, -70.53185300)
        mMap.addMarker(
                MarkerOptions().position(point873).title("Hermanos Carrera 40").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point874 = LatLng(-33.46633400, -70.53499000)
        mMap.addMarker(
                MarkerOptions().position(point874).title("Quebrada Umallani 710").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point875 = LatLng(-33.45143540, -70.55808430)
        mMap.addMarker(
                MarkerOptions().position(point875).title("Clorinda Hernríquez").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point876 = LatLng(-33.46414720, -70.70333740)
        mMap.addMarker(
                MarkerOptions().position(point876).title("Avenida 5 de Abril").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point877 = LatLng(-33.43783170, -70.60615530)
        mMap.addMarker(
                MarkerOptions().position(point877).title("Avenida Fco. Bilbao 2050").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point878 = LatLng(-33.62017000, -70.68945300)
        mMap.addMarker(
                MarkerOptions().position(point878).title("Pasaje Platón 1078").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point879 = LatLng(-33.47034800, -70.53167000)
        mMap.addMarker(
                MarkerOptions().position(point879).title("Avenida Valle Hermoso 1120").snippet("Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point880 = LatLng(-33.43776500, -70.62692500)
        mMap.addMarker(
                MarkerOptions().position(point880).title("Terranova 315").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point881 = LatLng(-33.43779819, -70.62693688)
        mMap.addMarker(
                MarkerOptions().position(point881).title("Terranova 315").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point882 = LatLng(-33.47068220, -70.53172940)
        mMap.addMarker(
                MarkerOptions().position(point882).title("Avenida Valle Hermoso 1120").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point883 = LatLng(-33.46207950, -70.69877260)
        mMap.addMarker(
                MarkerOptions().position(point883).title("Avenida 5 De Abril 4710").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point884 = LatLng(-33.46002500, -70.54631940)
        mMap.addMarker(
                MarkerOptions().position(point884).title("Avenida Jorge Alessandri 1347").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point885 = LatLng(-33.43952920, -70.63908320)
        mMap.addMarker(
                MarkerOptions().position(point885).title("Avenida Libertador Bernardo O´Higgins 240").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point886 = LatLng(-33.43858673, -70.61244161)
        mMap.addMarker(
                MarkerOptions().position(point886).title("Escuela de Telecomunicaciones 1265").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point887 = LatLng(-33.44322310, -70.65753710)
        mMap.addMarker(
                MarkerOptions().position(point887).title("San Martín 73").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point888 = LatLng(-33.46605020, -70.70319560)
        mMap.addMarker(
                MarkerOptions().position(point888).title("Calle Chacao 1036").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point889 = LatLng(-33.43931900, -70.60769800)
        mMap.addMarker(
                MarkerOptions().position(point889).title("Plaza Pedro de Valdivia 1783").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point890 = LatLng(-33.46868900, -70.70579240)
        mMap.addMarker(
                MarkerOptions().position(point890).title("Las Rejas Sur (Esquina Rio Quetro - Bandejón Central) 1278").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point891 = LatLng(-33.43934434, -70.60780439)
        mMap.addMarker(
                MarkerOptions().position(point891).title("Plaza Pedro de Valdivia 1783").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point892 = LatLng(-33.44029000, -70.64059840)
        mMap.addMarker(
                MarkerOptions().position(point892).title("José Victorino Lastarria").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point893 = LatLng(-33.45248600, -70.56077100)
        mMap.addMarker(
                MarkerOptions().position(point893).title("Avenida Larraín 6677").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point894 = LatLng(-33.43903900, -70.62101400)
        mMap.addMarker(
                MarkerOptions().position(point894).title("Alferez Real 930").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point895 = LatLng(-33.43906880, -70.62112465)
        mMap.addMarker(
                MarkerOptions().position(point895).title("Alferez Real 930").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point896 = LatLng(-33.44099800, -70.64121200)
        mMap.addMarker(
                MarkerOptions().position(point896).title("Avenida Libertador Bernardo O´Higgins 390").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point897 = LatLng(-33.43983800, -70.63016300)
        mMap.addMarker(
                MarkerOptions().position(point897).title("Seminario 78").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point898 = LatLng(-33.44313400, -70.65194950)
        mMap.addMarker(
                MarkerOptions().position(point898).title("Bandera 46").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point899 = LatLng(-33.44093100, -70.63963800)
        mMap.addMarker(
                MarkerOptions().position(point899).title("Portugal 56").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        //900

        val point900 = LatLng(-33.44197590, -70.64575180)
        mMap.addMarker(
                MarkerOptions().position(point900).title("Avenida Libertador Bernardo O´Higgins 651").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point901 = LatLng(-33.46195800, -70.54656900)
        mMap.addMarker(
                MarkerOptions().position(point901).title("Avenida Jorge Alessandri").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point902 = LatLng(-33.44033620, -70.62710960)
        mMap.addMarker(
                MarkerOptions().position(point902).title("Italia 620").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point903 = LatLng(-33.44261840, -70.59563630)
        mMap.addMarker(
                MarkerOptions().position(point903).title("Consejo de Indias 1317").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point904 = LatLng(-33.44290900, -70.59411100)
        mMap.addMarker(
                MarkerOptions().position(point904).title("Chile España 1276").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point905 = LatLng(-33.45272020, -70.56398960)
        mMap.addMarker(
                MarkerOptions().position(point905).title("Avenida Larrain 6374").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point906 = LatLng(-33.44281200, -70.59553300)
        mMap.addMarker(
                MarkerOptions().position(point906).title("El Aguilucho 3440").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point907 = LatLng(-33.48876600, -70.51995100)
        mMap.addMarker(
                MarkerOptions().position(point907).title("Avenida Diagonal Las Torres 2700").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point908 = LatLng(-33.45274300, -70.56419900)
        mMap.addMarker(
                MarkerOptions().position(point908).title("Avenida Larraín 6366").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point909 = LatLng(-33.44332900, -70.59423800)
        mMap.addMarker(
                MarkerOptions().position(point909).title("Chile España 1276").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point910 = LatLng(-33.45360100, -70.67716600)
        mMap.addMarker(
                MarkerOptions().position(point910).title("Conferencia 231").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point911 = LatLng(-33.49252980, -70.72246060)
        mMap.addMarker(
                MarkerOptions().position(point911).title("Lo Errazuriz 7060").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point912 = LatLng(-33.49271400, -70.72236500)
        mMap.addMarker(
                MarkerOptions().position(point912).title("Lo Errazuriz 7069").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point913 = LatLng(-33.45453900, -70.67795400)
        mMap.addMarker(
                MarkerOptions().position(point913).title("Grajales 3091").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point914 = LatLng(-33.50830550, -70.73012360)
        mMap.addMarker(
                MarkerOptions().position(point914).title("Primavera (Esquina Los Tilos)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point915 = LatLng(-33.61898240, -70.68176570)
        mMap.addMarker(
                MarkerOptions().position(point915).title("Camino Padre Hurtado").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point916 = LatLng(-33.44231800, -70.61360900)
        mMap.addMarker(
                MarkerOptions().position(point916).title("Carlos Wilson 1616").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point917 = LatLng(-33.51004600, -70.73045800)
        mMap.addMarker(
                MarkerOptions().position(point917).title("5 de Abril (Esquina Los Tilos)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point918 = LatLng(-33.45402100, -70.67560800)
        mMap.addMarker(
                MarkerOptions().position(point918).title("Grajales 2849").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point919 = LatLng(-33.44286200, -70.63178600)
        mMap.addMarker(
                MarkerOptions().position(point919).title("Ramon Carnicer 185").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point920 = LatLng(-33.44255180, -70.62585310)
        mMap.addMarker(
                MarkerOptions().position(point920).title("Italia 850").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point921 = LatLng(-33.44292569, -70.63172295)
        mMap.addMarker(
                MarkerOptions().position(point921).title("Ramon Carnicer 185").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point922 = LatLng(-33.44849260, -70.58080830)
        mMap.addMarker(
                MarkerOptions().position(point922).title("SIMÓN BOLIVAR ESQ. COVENTRY").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point923 = LatLng(-33.44438700, -70.59833800)
        mMap.addMarker(
                MarkerOptions().position(point923).title("Arzobispo Fuenzalida 3000").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point924 = LatLng(-33.60245400, -70.70434910)
        mMap.addMarker(
                MarkerOptions().position(point924).title("Bulnes").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point925 = LatLng(-33.44463530, -70.59815590)
        mMap.addMarker(
                MarkerOptions().position(point925).title("Pedro Lautarro Ferrer 3181").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point926 = LatLng(-33.60566600, -70.54109700)
        mMap.addMarker(
                MarkerOptions().position(point926).title("Las Brisas del parque sur y Villa Franca").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point927 = LatLng(-33.62830400, -70.58739000)
        mMap.addMarker(
                MarkerOptions().position(point927).title("Calle La Colonia 01114").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point928 = LatLng(-33.50320100, -70.72599800)
        mMap.addMarker(
                MarkerOptions().position(point928).title("El Mirador 1380").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point929 = LatLng(-33.45137300, -70.66372500)
        mMap.addMarker(
                MarkerOptions().position(point929).title("Grajales").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point930 = LatLng(-33.46163070, -70.55633520)
        mMap.addMarker(
                MarkerOptions().position(point930).title("Diego Rojas 900").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point931 = LatLng(-33.44631200, -70.64165800)
        mMap.addMarker(
                MarkerOptions().position(point931).title("Calle General Cofre 462").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point932 = LatLng(-33.61555400, -70.55950200)
        mMap.addMarker(
                MarkerOptions().position(point932).title("Finlandia y Circunvalación").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point933 = LatLng(-33.60719930, -70.69451270)
        mMap.addMarker(
                MarkerOptions().position(point933).title("Avenida Portales Oriente").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point934 = LatLng(-33.60998000, -70.55092300)
        mMap.addMarker(
                MarkerOptions().position(point934).title("Eyzaguirre Con Pie Andino").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point935 = LatLng(-33.44589600, -70.63503100)
        mMap.addMarker(
                MarkerOptions().position(point935).title("Marin").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point936 = LatLng(-33.62785600, -70.59468800)
        mMap.addMarker(
                MarkerOptions().position(point936).title("Calle Valle Central 1037").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point937 = LatLng(-33.62986500, -70.60883100)
        mMap.addMarker(
                MarkerOptions().position(point937).title("Calle Vivaldi 01633").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point938 = LatLng(-33.45296100, -70.66515400)
        mMap.addMarker(
                MarkerOptions().position(point938).title("Club Hípico").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point939 = LatLng(-33.44527930, -70.61986760)
        mMap.addMarker(
                MarkerOptions().position(point939).title("Sta. Isabel 891").snippet("Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point940 = LatLng(-33.44546540, -70.62125820)
        mMap.addMarker(
                MarkerOptions().position(point940).title("Santa Isabel 735").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point941 = LatLng(-33.49681150, -70.71969110)
        mMap.addMarker(
                MarkerOptions().position(point941).title("Lo Errazuriz (Esquina Belo Horizonte)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point942 = LatLng(-33.44595000, -70.61421200)
        mMap.addMarker(
                MarkerOptions().position(point942).title("Manuel Montt 2007").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point943 = LatLng(-33.44596700, -70.61584700)
        mMap.addMarker(
                MarkerOptions().position(point943).title("Santa Isabel 1200").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point944 = LatLng(-33.47083400, -70.54547950)
        mMap.addMarker(
                MarkerOptions().position(point944).title("Avenida Las Parcelas 8240").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point945 = LatLng(-33.59632680, -70.70515470)
        mMap.addMarker(
                MarkerOptions().position(point945).title("San José").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point946 = LatLng(-33.62690000, -70.59552800)
        mMap.addMarker(
                MarkerOptions().position(point946).title("Valle Central 1037").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point947 = LatLng(-33.45382400, -70.66432600)
        mMap.addMarker(
                MarkerOptions().position(point947).title("Almirante Latorre").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point948 = LatLng(-33.44641369, -70.61491085)
        mMap.addMarker(
                MarkerOptions().position(point948).title("Santa Isabel 1200").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point949 = LatLng(-33.45526500, -70.66750000)
        mMap.addMarker(
                MarkerOptions().position(point949).title("Avenida República 440").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point950 = LatLng(-33.44641369, -70.61491085)
        mMap.addMarker(
                MarkerOptions().position(point950).title("Santa Isabel 105").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point951 = LatLng(-33.46431400, -70.55651100)
        mMap.addMarker(
                MarkerOptions().position(point951).title("Diego Rojas 900").snippet("Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point952 = LatLng(-33.44932200, -70.64359700)
        mMap.addMarker(
                MarkerOptions().position(point952).title("Plaza San Isidro").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point953 = LatLng(-33.46238300, -70.56066100)
        mMap.addMarker(
                MarkerOptions().position(point953).title("José Arrieta 6682").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point954 = LatLng(-33.48304700, -70.53448500)
        mMap.addMarker(
                MarkerOptions().position(point954).title("Antupiren 9390").snippet("Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point955 = LatLng(-33.45368600, -70.66019600)
        mMap.addMarker(
                MarkerOptions().position(point955).title("Avenida Av. Ejercito Libertador 539").snippet("Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point956 = LatLng(-33.44792000, -70.63017400)
        mMap.addMarker(
                MarkerOptions().position(point956).title("Gral Bustamante").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point957 = LatLng(-33.61406100, -70.56369800)
        mMap.addMarker(
                MarkerOptions().position(point957).title("Nonato Coo 0232").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point958 = LatLng(-33.45427400, -70.66013500)
        mMap.addMarker(
                MarkerOptions().position(point958).title("Ejército Libertador").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point959 = LatLng(-33.62372600, -70.59082500)
        mMap.addMarker(
                MarkerOptions().position(point959).title("San Salvador 0780").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point960 = LatLng(-33.45452900, -70.58284700)
        mMap.addMarker(
                MarkerOptions().position(point960).title("Irarrázaval 4354").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point961 = LatLng(-33.47652700, -70.54366260)
        mMap.addMarker(
                MarkerOptions().position(point961).title("Av. Grecia esquina Consistorial (Strip Center)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point962 = LatLng(-33.59295380, -70.70407610)
        mMap.addMarker(
                MarkerOptions().position(point962).title("Arturo Prat").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point963 = LatLng(-33.62089800, -70.58349400)
        mMap.addMarker(
                MarkerOptions().position(point963).title("Presidente Salvador Allende y Los cerezos").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point964 = LatLng(-33.45322700, -70.65266900)
        mMap.addMarker(
                MarkerOptions().position(point964).title("Nataniel Cox 620").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point965 = LatLng(-33.46693900, -70.68452150)
        mMap.addMarker(
                MarkerOptions().position(point965).title("Antofagasta").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point966 = LatLng(-33.46693900, -70.68452150)
        mMap.addMarker(
                MarkerOptions().position(point966).title("Av. Tobalaba con Orientales, Peñalolén(Municipalidad)").snippet("Papel, Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point967 = LatLng(-33.47668100, -70.54381100)
        mMap.addMarker(
                MarkerOptions().position(point967).title("Avenida Grecia 8585").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point968 = LatLng(-33.47847400, -70.69920300)
        mMap.addMarker(
                MarkerOptions().position(point968).title("Urosfato (Esquina Avenida Ferrocarril) 2144").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point969 = LatLng(-33.59551660, -70.70085450)
        mMap.addMarker(
                MarkerOptions().position(point969).title("Supermercado Montserrat , Covadonga 225").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point970 = LatLng(-33.59556000, -70.70056400)
        mMap.addMarker(
                MarkerOptions().position(point970).title("Covadonga 255").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point971 = LatLng(-33.61788200, -70.57761400)
        mMap.addMarker(
                MarkerOptions().position(point971).title("Tocornal Grez 440").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point972 = LatLng(-33.59200900, -70.70333900)
        mMap.addMarker(
                MarkerOptions().position(point972).title("Bernardo O´Higgins").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point973 = LatLng(-33.46300200, -70.67509700)
        mMap.addMarker(
                MarkerOptions().position(point973).title("Conferencia").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point974 = LatLng(-33.59859700, -70.69569800)
        mMap.addMarker(
                MarkerOptions().position(point974).title("San Jose 1100").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point975 = LatLng(-33.46726200, -70.55928800)
        mMap.addMarker(
                MarkerOptions().position(point975).title("Avenida Oriental 6940").snippet("Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point976 = LatLng(-33.59417450, -70.69979230)
        mMap.addMarker(
                MarkerOptions().position(point976).title("Arturo Prat con J Pérez (Fuera de Supermercado Tottus)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point977 = LatLng(-33.59403100, -70.69970700)
        mMap.addMarker(
                MarkerOptions().position(point977).title("Arturo Prat 177").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point978 = LatLng(-33.49988200, -70.71387000)
        mMap.addMarker(
                MarkerOptions().position(point978).title("Lo Errazuriz (Esquina San Marcos)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point979 = LatLng(-33.59204410, -70.70084150)
        mMap.addMarker(
                MarkerOptions().position(point979).title("Bulnes 357").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point980 = LatLng(-33.46598600, -70.56417600)
        mMap.addMarker(
                MarkerOptions().position(point980).title("Avenida El Parque 1 1233").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point981 = LatLng(-33.46529400, -70.67583700)
        mMap.addMarker(
                MarkerOptions().position(point981).title("Perta de Vera").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point982 = LatLng(-33.45268400, -70.63416700)
        mMap.addMarker(
                MarkerOptions().position(point982).title("Portugal").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point983 = LatLng(-33.60014300, -70.54996600)
        mMap.addMarker(
                MarkerOptions().position(point983).title("Trasmontes con Argones 1 Oriente").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point984 = LatLng(-33.45866200, -70.58247800)
        mMap.addMarker(
                MarkerOptions().position(point984).title("Duble Almeyda 4685").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        //985


        val point986 = LatLng(-33.45295900, -70.61527900)
        mMap.addMarker(
                MarkerOptions().position(point986).title("Irarrázaval 1510").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        parte2()

    }

    private fun parte2(){

        val point987 = LatLng(-33.47554860, -70.55149610)
        mMap.addMarker(
                MarkerOptions().position(point987).title("Violeta Cousiño Norte c/ Los Flamencos").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point988 = LatLng(-33.48090000, -70.69619000)
        mMap.addMarker(
                MarkerOptions().position(point988).title("Dagoberto Godoy 182").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point989 = LatLng(-33.48113600, -70.69569400)
        mMap.addMarker(
                MarkerOptions().position(point989).title("Dagoberto Godoy 145").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point990 = LatLng(-33.45871000, -70.65568500)
        mMap.addMarker(
                MarkerOptions().position(point990).title("San Ignacio 999").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point991 = LatLng(-33.49471700, -70.70748900)
        mMap.addMarker(
                MarkerOptions().position(point991).title("Avenida Cerrillos 139(Esquina Camino Melipilla)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point992 = LatLng(-33.51725600, -70.71732000)
        mMap.addMarker(
                MarkerOptions().position(point992).title("Aeropuerto").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point993 = LatLng(-33.48002260, -70.69237390)
        mMap.addMarker(
                MarkerOptions().position(point993).title("Avenida Santa Maria").snippet("Vidrio, Cartón")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point994 = LatLng(-33.61002300, -70.57143400)
        mMap.addMarker(
                MarkerOptions().position(point994).title("Calle Manuel Rodriguez 307").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point995 = LatLng(-33.48186500, -70.69409010)
        mMap.addMarker(
                MarkerOptions().position(point995).title("Av. Pedro Aguirre Cerda/ Av. siete (Metro Cerrillos)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point996 = LatLng(-33.45674800, -70.64128100)
        mMap.addMarker(
                MarkerOptions().position(point996).title("San Isidro").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point997 = LatLng(-33.46944600, -70.67679900)
        mMap.addMarker(
                MarkerOptions().position(point997).title("Santa Margarita").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point998 = LatLng(-33.48177600, -70.69376100)
        mMap.addMarker(
                MarkerOptions().position(point998).title("Buzeta (Esquina Avenida Siete) 4500").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point999 = LatLng(-33.57328800, -70.71039600)
        mMap.addMarker(
                MarkerOptions().position(point999).title("Lo Blanco 3291").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        //1000

        val point1000 = LatLng(-33.58965300, -70.69787600)
        mMap.addMarker(
                MarkerOptions().position(point1000).title("Villa Venezuela Gran Avenida Jose Miguel Carrera").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1001 = LatLng(-33.45566200, -70.63144700)
        mMap.addMarker(
                MarkerOptions().position(point1001).title("Avenida Matta 129").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1002 = LatLng(-33.51454900, -70.52575700)
        mMap.addMarker(
                MarkerOptions().position(point1002).title("Alto Macul 6544").snippet("Vidrio, Papel, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1003 = LatLng(-33.47196200, -70.56115000)
        mMap.addMarker(
                MarkerOptions().position(point1003).title("Avenida Grecia 6940").snippet("Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1004 = LatLng(-33.61918800, -70.60603900)
        mMap.addMarker(
                MarkerOptions().position(point1004).title("Calle Hidra 2657").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1005 = LatLng(-33.61197580, -70.57809630)
        mMap.addMarker(
                MarkerOptions().position(point1005).title("Centro Comercial Plaza Puente 26,nivel -1,sector estacionamientos, Avenida Concha y Toro").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1006 = LatLng(-33.45609000, -70.63117600)
        mMap.addMarker(
                MarkerOptions().position(point1006).title("Santa Elena").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1007 = LatLng(-33.45567320, -70.61816060)
        mMap.addMarker(
                MarkerOptions().position(point1007).title("JOSÉ DGO. CAÑAS ESQ. JOSÉ M. INFANTE").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1008 = LatLng(-33.45599000, -70.62674700)
        mMap.addMarker(
                MarkerOptions().position(point1008).title("Avenida Grecia 245").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1009 = LatLng(-33.45767630, -70.60007150)
        mMap.addMarker(
                MarkerOptions().position(point1009).title("EX.FERNANDEZ C/ J.DGO.CAÑAS").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1010 = LatLng(-33.45884700, -70.64643100)
        mMap.addMarker(
                MarkerOptions().position(point1010).title("Avenida Matta 919").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1011 = LatLng(-33.47233200, -70.56187400)
        mMap.addMarker(
                MarkerOptions().position(point1011).title("Avenida Grecia 6891").snippet("Punto limpio - Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1012 = LatLng(-33.45664500, -70.60864210)
        mMap.addMarker(
                MarkerOptions().position(point1012).title("Calle José Domingo Cañas 2206").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1013 = LatLng(-33.49498000, -70.70423100)
        mMap.addMarker(
                MarkerOptions().position(point1013).title("Pedro Aguirre Cerda 6100").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1014 = LatLng(-33.45610000, -70.62465700)
        mMap.addMarker(
                MarkerOptions().position(point1014).title("Lo Encalada 465").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1015 = LatLng(-33.51749000, -70.52568100)
        mMap.addMarker(
                MarkerOptions().position(point1015).title("Camino Las Cumbres 6829").snippet("Vidrio, Papel, Cartón para bebida, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1016 = LatLng(-33.61815850, -70.63859720)
        mMap.addMarker(
                MarkerOptions().position(point1016).title("Los Paltos (Población Huertos José Maza)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1017 = LatLng(-33.60212100, -70.56028400)
        mMap.addMarker(
                MarkerOptions().position(point1017).title("Calle 1 708").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1018 = LatLng(-33.45971800, -70.64902100)
        mMap.addMarker(
                MarkerOptions().position(point1018).title("Avenida Matta").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1019 = LatLng(-33.45691570, -70.60924090)
        mMap.addMarker(
                MarkerOptions().position(point1019).title("JOSE DOMINGO CAÑAS/CAMPO DE DEPORTES").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1020 = LatLng(-33.46838100, -70.67172300)
        mMap.addMarker(
                MarkerOptions().position(point1020).title("Manuel de Amat").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1021 = LatLng(-33.61201570, -70.58052000)
        mMap.addMarker(
                MarkerOptions().position(point1021).title("Tocornal Grez 47").snippet("Punto limpio - Papel, Cartón, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1022 = LatLng(-33.51797646, -70.71520150)
        mMap.addMarker(
                MarkerOptions().position(point1022).title("Avenida Américo Vespucio 1501").snippet("Punto limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1023 = LatLng(-33.60101800, -70.56041600)
        mMap.addMarker(
                MarkerOptions().position(point1023).title("Domingo Tocornal 01313").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1024 = LatLng(-33.45908610, -70.60002670)
        mMap.addMarker(
                MarkerOptions().position(point1024).title("EDO. CASTILLO VELASCO C/EX. FERNANDEZ").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1025 = LatLng(-33.59609200, -70.55498500)
        mMap.addMarker(
                MarkerOptions().position(point1025).title("Avenida San Carlos 1871").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1026 = LatLng(-33.59856800, -70.55876300)
        mMap.addMarker(
                MarkerOptions().position(point1026).title("Tome Con Caleta Brava").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1027 = LatLng(-33.61677800, -70.61246300)
        mMap.addMarker(
                MarkerOptions().position(point1027).title("Avenida Eyzaguirre 3208").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1028 = LatLng(-33.46440900, -70.65550100)
        mMap.addMarker(
                MarkerOptions().position(point1028).title("Victoria").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1029 = LatLng(-33.47025770, -70.57174700)
        mMap.addMarker(
                MarkerOptions().position(point1029).title("Avenida Grecia 6083").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1030 = LatLng(-33.46964600, -70.57457000)
        mMap.addMarker(
                MarkerOptions().position(point1030).title("Avenida Grecia 5791").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1031 = LatLng(-33.60557300, -70.57388700)
        mMap.addMarker(
                MarkerOptions().position(point1031).title("Eduardo Cordero Con Santa Helena").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1032 = LatLng(-33.60973100, -70.58398200)
        mMap.addMarker(
                MarkerOptions().position(point1032).title("Tocornal y Choapa").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1033 = LatLng(-33.47269500, -70.67225800)
        mMap.addMarker(
                MarkerOptions().position(point1033).title("Concha Castillo").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1034 = LatLng(-33.60336600, -70.57043000)
        mMap.addMarker(
                MarkerOptions().position(point1034).title("Profesor Alcaino 0440").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1035 = LatLng(-33.46782400, -70.58039100)
        mMap.addMarker(
                MarkerOptions().position(point1035).title("Avenida Grecia 4847").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1036 = LatLng(-33.56585300, -70.70697000)
        mMap.addMarker(
                MarkerOptions().position(point1036).title("Arturo Gordon 12651").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1037 = LatLng(-33.48827380, -70.54971718)
        mMap.addMarker(
                MarkerOptions().position(point1037).title("Consistorial 3349").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1038 = LatLng(-33.46321300, -70.64378200)
        mMap.addMarker(
                MarkerOptions().position(point1038).title("Juan Vicuña y Victoria").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1039 = LatLng(-33.60944700, -70.58678300)
        mMap.addMarker(
                MarkerOptions().position(point1039).title("Alcalde Juan de Dios Malebrán y Francisco Carbonel").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1040 = LatLng(-33.46155600, -70.63317700)
        mMap.addMarker(
                MarkerOptions().position(point1040).title("Cuevas").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1041 = LatLng(-33.46719030, -70.65728260)
        mMap.addMarker(
                MarkerOptions().position(point1041).title("O´Higgins").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1042 = LatLng(-33.46661100, -70.65366100)
        mMap.addMarker(
                MarkerOptions().position(point1042).title("Aldunate y Pedro Lagos").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1043 = LatLng(-33.59085500, -70.55537400)
        mMap.addMarker(
                MarkerOptions().position(point1043).title("San Francisco 1833").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1044 = LatLng(-33.46639010, -70.65160670)
        mMap.addMarker(
                MarkerOptions().position(point1044).title("Pedro Lagos").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1045 = LatLng(-33.51794400, -70.70855700)
        mMap.addMarker(
                MarkerOptions().position(point1045).title("Avenida Américo Vespucio 2500").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1046 = LatLng(-33.59378300, -70.55937400)
        mMap.addMarker(
                MarkerOptions().position(point1046).title("Avenida Av. Mexico 1589, Entre San Carlos Y Las Nieves").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1047 = LatLng(-33.51091800, -70.70545100)
        mMap.addMarker(
                MarkerOptions().position(point1047).title("Manutara 3009-3011").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1048 = LatLng(-33.48005500, -70.67920330)
        mMap.addMarker(
                MarkerOptions().position(point1048).title("Tres Sur Esq. Calle Nino Garcia 6210").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1049 = LatLng(-33.59676000, -70.56397500)
        mMap.addMarker(
                MarkerOptions().position(point1049).title("Catelta El Membrillo con Av. San Carlos").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1050 = LatLng(-33.46254740, -70.61528190)
        mMap.addMarker(
                MarkerOptions().position(point1050).title("LOS JAZMINES/MARATHON (FRENTE ISP)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1051 = LatLng(-33.59334800, -70.55967400)
        mMap.addMarker(
                MarkerOptions().position(point1051).title("Avenida Mexico 1915").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1052 = LatLng(-33.47362100, -70.66790300)
        mMap.addMarker(
                MarkerOptions().position(point1052).title("Avenida Pedro Montt 1850").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1053 = LatLng(-33.57605000, -70.54287700)
        mMap.addMarker(
                MarkerOptions().position(point1053).title("Cachicura 7004").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1054 = LatLng(-33.46523300, -70.59731300)
        mMap.addMarker(
                MarkerOptions().position(point1054).title("Avenida José Pedro Alessandri 1166").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1055 = LatLng(-33.46595100, -70.64698200)
        mMap.addMarker(
                MarkerOptions().position(point1055).title("Arturo Prat 1480").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1056 = LatLng(-33.59597600, -70.56417300)
        mMap.addMarker(
                MarkerOptions().position(point1056).title("Caleta Membrillo").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1057 = LatLng(-33.59262500, -70.55957000)
        mMap.addMarker(
                MarkerOptions().position(point1057).title("Avenida Las Nieves Oriente 1717").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1058 = LatLng(-33.47416200, -70.66788400)
        mMap.addMarker(
                MarkerOptions().position(point1058).title("Pedro Montt").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1059 = LatLng(-33.46564483, -70.59728241)
        mMap.addMarker(
                MarkerOptions().position(point1059).title("Portal Ñuñoa").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1060 = LatLng(-33.60575400, -70.58386200)
        mMap.addMarker(
                MarkerOptions().position(point1060).title("Teniente Bello 460").snippet("Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1061 = LatLng(-33.47019800, -70.65837100)
        mMap.addMarker(
                MarkerOptions().position(point1061).title("Rondizzoni").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1062 = LatLng(-33.46373400, -70.62100300)
        mMap.addMarker(
                MarkerOptions().position(point1062).title("Salvador Sur 1253").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1063 = LatLng(-33.46786400, -70.59214100)
        mMap.addMarker(
                MarkerOptions().position(point1063).title("Quillagua 3858").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1064 = LatLng(-33.46786400, -70.59214100)
        mMap.addMarker(
                MarkerOptions().position(point1064).title("Quillagua 3858").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1065 = LatLng(-33.47337000, -70.66395500)
        mMap.addMarker(
                MarkerOptions().position(point1065).title("Pedro Montt").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1066 = LatLng(-33.59196900, -70.56049300)
        mMap.addMarker(
                MarkerOptions().position(point1066).title("Avenida Mexico 2051").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1067 = LatLng(-33.46880400, -70.65026600)
        mMap.addMarker(
                MarkerOptions().position(point1067).title("Sargento Aldea").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1068 = LatLng(-33.51894400, -70.53614800)
        mMap.addMarker(
                MarkerOptions().position(point1068).title("Camino Del Monte 6037").snippet("Papel, Cartón para bebida, Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1069 = LatLng(-33.60124300, -70.57761400)
        mMap.addMarker(
                MarkerOptions().position(point1069).title("Avenida Concha y Toro 1036").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1070 = LatLng(-33.58857000, -70.55792200)
        mMap.addMarker(
                MarkerOptions().position(point1070).title("San Francisco 2244").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1071 = LatLng(-33.46751000, -70.59829700)
        mMap.addMarker(
                MarkerOptions().position(point1071).title("Avenida José Pedro Alessandri 1372").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1072 = LatLng(-33.47052740, -70.65232740)
        mMap.addMarker(
                MarkerOptions().position(point1072).title("Lord Cochrane 1819").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1073 = LatLng(-33.48877700, -70.55757200)
        mMap.addMarker(
                MarkerOptions().position(point1073).title("Sánchez Fontecilla 12000").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1074 = LatLng(-33.51583150, -70.70276920)
        mMap.addMarker(
                MarkerOptions().position(point1074).title("Avenida Av. Angel Fantuzzi 8000").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1075 = LatLng(-33.46695650, -70.63443690)
        mMap.addMarker(
                MarkerOptions().position(point1075).title("Sierra Bella").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1076 = LatLng(-33.58997000, -70.56171400)
        mMap.addMarker(
                MarkerOptions().position(point1076).title("Avenida Mexico 2227").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1077 = LatLng(-33.48933800, -70.55749500)
        mMap.addMarker(
                MarkerOptions().position(point1077).title("Jumbo - Sánchez Fontecilla 12000").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1078 = LatLng(-33.48812690, -70.55898740)
        mMap.addMarker(
                MarkerOptions().position(point1078).title("Punto Limpio Jumbo Peñalolén/Avenida Sánchez Fontecilla 12000").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1079 = LatLng(-33.58347700, -70.55489700)
        mMap.addMarker(
                MarkerOptions().position(point1079).title("Punta Blanca 2439").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1080 = LatLng(-33.60898200, -70.62636600)
        mMap.addMarker(
                MarkerOptions().position(point1080).title("Santa Rosa 821").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1081 = LatLng(-33.46653010, -70.62238430)
        mMap.addMarker(
                MarkerOptions().position(point1081).title("LO ENCALADA ESQ. CARLOS DITTBORN").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1082 = LatLng(-33.47228200, -70.58745600)
        mMap.addMarker(
                MarkerOptions().position(point1082).title("Jorge Monckeberg 1911").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1083 = LatLng(-33.58328600, -70.55542000)
        mMap.addMarker(
                MarkerOptions().position(point1083).title("Punta Blanca 2493").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1084 = LatLng(-33.46874200, -70.63759100)
        mMap.addMarker(
                MarkerOptions().position(point1084).title("Ñuble").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1085 = LatLng(-33.51340990, -70.54151809)
        mMap.addMarker(
                MarkerOptions().position(point1085).title("Avenida Departamental 4200").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1086 = LatLng(-33.50513000, -70.69534700)
        mMap.addMarker(
                MarkerOptions().position(point1086).title("Buenaventura 3972").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1087 = LatLng(-33.47628000, -70.58017000)
        mMap.addMarker(
                MarkerOptions().position(point1087).title("Fernando Cifuentes 4834").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1088 = LatLng(-33.59696100, -70.57634200)
        mMap.addMarker(
                MarkerOptions().position(point1088).title("Avenida Concha y Toro 1477").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1089 = LatLng(-33.51722717, -70.70046997)
        mMap.addMarker(
                MarkerOptions().position(point1089).title("Avenida Presidente Eduardo Frei esq. Can Mayor").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1090 = LatLng(-33.51898193, -70.70048523)
        mMap.addMarker(
                MarkerOptions().position(point1090).title("Plaza La Habana").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1091 = LatLng(-33.60089600, -70.58809800)
        mMap.addMarker(
                MarkerOptions().position(point1091).title("Juan de Dios Malebrán 1147").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1092 = LatLng(-33.59360100, -70.57273900)
        mMap.addMarker(
                MarkerOptions().position(point1092).title("Avenida Las Nieves Oriente 359").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1093 = LatLng(-33.58986700, -70.56725400)
        mMap.addMarker(
                MarkerOptions().position(point1093).title("Portal Andino Con Nonato").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1094 = LatLng(-33.59354600, -70.57327200)
        mMap.addMarker(
                MarkerOptions().position(point1094).title("Nemesio Vicuña 2001-2013").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1095 = LatLng(-33.51439285, -70.69766235)
        mMap.addMarker(
                MarkerOptions().position(point1095).title("Calle Diecinueve Sur (Capilla María Madre de los Trabajadores)").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1096 = LatLng(-33.47239300, -70.64212100)
        mMap.addMarker(
                MarkerOptions().position(point1096).title("Santa Rosa 2055").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1097 = LatLng(-33.50812200, -70.69380400)
        mMap.addMarker(
                MarkerOptions().position(point1097).title("Cardenal Jose María Caro").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1098 = LatLng(-33.58573800, -70.56331100)
        mMap.addMarker(
                MarkerOptions().position(point1098).title("Avenida Av. Mexico con Av. Troncal San Francisco").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1099 = LatLng(-33.47060000, -70.62947400)
        mMap.addMarker(
                MarkerOptions().position(point1099).title("Portugal").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // 1100

        val point1100 = LatLng(-33.47125800, -70.63454600)
        mMap.addMarker(
                MarkerOptions().position(point1100).title("Arauco").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1101 = LatLng(-33.50627899, -70.69200134)
        mMap.addMarker(
                MarkerOptions().position(point1101).title("Buenaventura esq con Avda. Central Cardenal Raúl Silva Henríquez").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point1102 = LatLng(-33.59355200, -70.57563200)
        mMap.addMarker(
                MarkerOptions().position(point1102).title("On Panta con Pto. Mayor").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point11022 = LatLng(-33.47481300, -70.64817300)

        mMap.addMarker(
                MarkerOptions().position(point11022).title("San Diego 2189").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1103 = LatLng(-33.47382590, -70.59784350)
        mMap.addMarker(
                MarkerOptions().position(point1103).title("Rodrigo de Araya 3265").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1104 = LatLng(-33.60420200, -70.62581300)
        mMap.addMarker(
                MarkerOptions().position(point1104).title("Los Jesuitas 2831").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1105 = LatLng(-33.47245360, -70.63561610)
        mMap.addMarker(
                MarkerOptions().position(point1105).title("Carmen").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1106 = LatLng(-33.47565600, -70.64885400)
        mMap.addMarker(
                MarkerOptions().position(point1106).title("Placer").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1107 = LatLng(-33.47460100, -70.64498900)
        mMap.addMarker(
                MarkerOptions().position(point1107).title("Bio Bio 835").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1108 = LatLng(-33.47256150, -70.60639860)
        mMap.addMarker(
                MarkerOptions().position(point1108).title("PEDRO DE VALDIVIA (ESQ. ZAÑARTU) 5317").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1109 = LatLng(-33.47536500, -70.64391700)
        mMap.addMarker(
                MarkerOptions().position(point1109).title("Placer").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1110 = LatLng(-33.51958186, -70.54693988)
        mMap.addMarker(
                MarkerOptions().position(point1110).title("Las Perdices/San Francisco").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point1111 = LatLng(-33.49998100, -70.56086000)
        mMap.addMarker(
                MarkerOptions().position(point1111).title("Avenida Tobalaba 13651").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1112 = LatLng(-33.48720200, -70.57659100)
        mMap.addMarker(
                MarkerOptions().position(point1112).title("Avenida Tobalaba 13651").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1113 = LatLng(-33.48720200, -70.57659100)
        mMap.addMarker(
                MarkerOptions().position(point1113).title("Avenida Américo Vespucio 3300").snippet("Punto Limpio - Vidrio, Papel, Cartón, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1114 = LatLng(-33.48996933, -70.66002295)
        mMap.addMarker(
                MarkerOptions().position(point1114).title("Calle Monja Alferez 4").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1115 = LatLng(-33.58415520, -70.66086440)
        mMap.addMarker(
                MarkerOptions().position(point1115).title("Villa Jacarandá , Villa Los Eucaliptus 717").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )
        val point1116 = LatLng(-33.58652100, -70.58634100)
        mMap.addMarker(
                MarkerOptions().position(point1116).title("Luis Matte Con Coquimbo").snippet("Plástico")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val point1117 = LatLng(-33.59355200, -70.57563200)
        mMap.addMarker(
            MarkerOptions().position(point1117).title("On Panta con Pto. Mayor").snippet("Vidrio, Papel, Cartón, Plástico, Metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )



    }

    }
