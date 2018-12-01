package com.practica.hebert.fragmentsmenus.presentador;

import android.content.Context;

import com.practica.hebert.fragmentsmenus.db.ConstructorMascotas;
import com.practica.hebert.fragmentsmenus.fragments.IListaMascotas;
import com.practica.hebert.fragmentsmenus.pojo.Mascota;

import java.util.ArrayList;

public class ListaMascotasPresenter implements IListaMascotasPresenter {

    private IListaMascotas iListaMascotas ;
    private Context context ;
    private ArrayList<Mascota> mascotas ;
    private ConstructorMascotas constructorMascotas ;

    public ListaMascotasPresenter(IListaMascotas iListaMascotas, Context context){
        this.iListaMascotas = iListaMascotas ;
        this.context = context ;
        obtenerMascotasBaseDatos() ;
    } // fin del constructor

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context) ;
        mascotas = constructorMascotas.obtenerDatos() ;
        mostrarMascotasRV() ;
    } // fin del método obtenerMascotasBaseDatos

    @Override
    public void mostrarMascotasRV() {
        iListaMascotas.inicializarAdaptadorRV(iListaMascotas.crearAdaptador(mascotas)) ;
        iListaMascotas.generarLinearLayoutVertical() ;
    } // fin del método mostrarMascotasRV
} // fin de la clase ListaMascotasPresenter
