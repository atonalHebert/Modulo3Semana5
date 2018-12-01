package com.practica.hebert.fragmentsmenus.fragments;

import com.practica.hebert.fragmentsmenus.adapters.MascotaAdapter;
import com.practica.hebert.fragmentsmenus.pojo.Mascota;

import java.util.ArrayList;

public interface IListaMascotas {
    public void generarLinearLayoutVertical() ;
    public MascotaAdapter crearAdaptador(ArrayList<Mascota> mascotas) ;
    public void inicializarAdaptadorRV(MascotaAdapter adapter) ;
} // fin de la interfaz IListaMascotas
