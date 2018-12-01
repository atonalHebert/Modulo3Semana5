package com.practica.hebert.fragmentsmenus.db;

import android.content.Context;

import com.practica.hebert.fragmentsmenus.R;
import com.practica.hebert.fragmentsmenus.pojo.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {
    private Context context ;

    public ConstructorMascotas(Context context) {
        this.context = context ;
    } // fin del método ConstructorMascotas

    public ArrayList<Mascota> obtenerDatos(){
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>() ;
        mascotas.add(new Mascota(R.drawable.bulbasaur, "Bulbasaur" , (byte) 5)) ;
        mascotas.add(new Mascota(R.drawable.bulbasaur, "Bulbasaur" , (byte) 4)) ;
        mascotas.add(new Mascota(R.drawable.bulbasaur, "Bulbasaur" , (byte) 3)) ;
        mascotas.add(new Mascota(R.drawable.bulbasaur, "Bulbasaur" , (byte) 2)) ;
        mascotas.add(new Mascota(R.drawable.bulbasaur, "Bulbasaur" , (byte) 1)) ;
        mascotas.add(new Mascota(R.drawable.bulbasaur, "Bulbasaur" , (byte) 0)) ;
        return mascotas ;
    } // fin del método obtenerDatos
} // fin de la clase ConstructorMascotas
