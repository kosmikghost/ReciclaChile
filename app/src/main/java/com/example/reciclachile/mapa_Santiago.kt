package com.example.reciclachile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class mapa_Santiago : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa__santiago)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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

        // Add a marker in Sydney and move the camera

        // Add a marker in Sydney and move the camera
        val santiago = LatLng(-33.448760060942966, -70.6524823222668)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santiago, 10f))


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
                .title("Av. Lo Blanco # 550, paradero 39 de Gran Avenida").snippet("Vidrio")
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
            MarkerOptions().position(point18).title("Gran Avenida Jose Miguel Carrera 12552")
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

        val point200 = LatLng(-33.53762535, -70.62086102)
        mMap.addMarker(
            MarkerOptions().position(point200).title("Cardenal Raúl Silva Henríquez 8283")
                .snippet("Punto Verde")
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
            MarkerOptions().position(point309).title("Dieciocho de Septiembre 1066")
                .snippet("pila, celular")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point310 = LatLng(-33.489689, -70.592613)
        mMap.addMarker(
            MarkerOptions().position(point310).title("Arturo Gordon 3898")
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
            MarkerOptions().position(point324).title("Los Plátanos 2200")
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
            MarkerOptions().position(point335).title("Monja Alférez 4074-4070")
                .snippet("Punto limpio -  vidrio, papel, cartón, cartón para bebida, plástico")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        )

        val point336 = LatLng(-33.580513, -70.669445)
        mMap.addMarker(
            MarkerOptions().position(point336).title("Vecinal Sur 1446-1382")
                .snippet("vidrio, papel, cartón para bebida, metal")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point337 = LatLng(-33.570613, -70.679797)
        mMap.addMarker(
            MarkerOptions().position(point337).title("Los Boldos 12436")
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
            MarkerOptions().position(point339).title("Av. Central 498")
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
            MarkerOptions().position(point343).title("Ramón Cruz Montt 3262")
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
        val point365 = LatLng(-33.501158, -70.680344)
        mMap.addMarker(
                MarkerOptions().position(point365).title("Avenida Américo Vespucio 3300")
                        .snippet("Punto limpio - vidrio, papel, cartón, plástico, metal")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
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
                MarkerOptions().position(point598).title("Carmen Esq. Nueva San Martin 1500").snippet("Vidrio")
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
        val point698 = LatLng(-33.41818900, -70.64196800)
        mMap.addMarker(
                MarkerOptions().position(point698).title("Plaza Villa San Cristóbal").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )
        val point699 = LatLng(-33.44062100, -70.53497500)
        mMap.addMarker(
                MarkerOptions().position(point699).title("Avenida Principe de Gales 9140").snippet("Pila, Celular")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        // 700

        val point700 = LatLng(-33.42877150, -70.68254000)
        mMap.addMarker(
                MarkerOptions().position(point700).title("Avenida Matucana / Mapocho").snippet("Vidrio")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )


    }
    }
