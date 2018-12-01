package com.practica.hebert.fragmentsmenus.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practica.hebert.fragmentsmenus.R;
import com.practica.hebert.fragmentsmenus.adapters.MascotaAdapter;
import com.practica.hebert.fragmentsmenus.pojo.Mascota;
import com.practica.hebert.fragmentsmenus.presentador.IListaMascotasPresenter;
import com.practica.hebert.fragmentsmenus.presentador.ListaMascotasPresenter;

import java.util.ArrayList;

public class ListaMascotas extends Fragment implements IListaMascotas {

    private ArrayList<Mascota> mascotas ;
    private RecyclerView rvMascotas ;
    private IListaMascotasPresenter presenter ;

    public ListaMascotas() {}// Required empty public constructor


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lista_mascotas, container, false);
        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas) ;
        presenter = new ListaMascotasPresenter(this, getContext()) ;
        return v;
    } // fin del método onCreateView

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity()) ;
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm) ;
    } // fin del método generarLinearLayoutVertical

    @Override
    public MascotaAdapter crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdapter adapter = new MascotaAdapter(mascotas, getActivity()) ;
        return adapter ;
    } // fin del método crearAdaptador

    @Override
    public void inicializarAdaptadorRV(MascotaAdapter adapter) {
        rvMascotas.setAdapter(adapter);
    } // fin del método inicializarAdaptadorRV
} // fin de la clase ListaMascotas
