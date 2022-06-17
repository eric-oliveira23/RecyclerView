package com.example.apprecyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.apprecyclerview.R;
import com.example.apprecyclerview.activity.adapter.Adapter;
import com.example.apprecyclerview.activity.model.Filme;
import com.example.apprecyclerview.activity.model.RecyclerItemClickListner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerFilmes;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerFilmes = findViewById(R.id.recyclerFilmes);

        //criar lista de filmes
        this.criarFilmes();

        //Adapter
        Adapter adapter = new Adapter(listaFilmes);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerFilmes.setLayoutManager(layoutManager);
        recyclerFilmes.setAdapter(adapter);
        recyclerFilmes.setHasFixedSize(true);
        recyclerFilmes.addItemDecoration
                (new DividerItemDecoration(this, LinearLayout.VERTICAL));

        recyclerFilmes.addOnItemTouchListener(

               new RecyclerItemClickListner(getApplicationContext(),
                       recyclerFilmes,
                       new RecyclerItemClickListner.OnItemClickListener() {
                           @Override
                           public void onItemClick(View view, int position) {
                               Filme filme = listaFilmes.get(position);
                               Toast.makeText(getApplicationContext(), "Item pressionado\n"+filme.getFilme(), Toast.LENGTH_SHORT).show();
                           }

                           @Override
                           public void onLongItemClick(View view, int position) {
                               Filme filme = listaFilmes.get(position);
                               Toast.makeText(getApplicationContext(), "Clique longo\n"+filme.getFilme(), Toast.LENGTH_SHORT).show();
                           }

                           @Override
                           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                           }
                       }
               )

        );

    }

    public void criarFilmes(){

        Filme filme = new Filme("Coraline","Drama","2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Piratas do Caribe","Ação","2012");
        this.listaFilmes.add(filme);

        filme = new Filme("Efeito Borboleta","Ficção","2009");
        this.listaFilmes.add(filme);

        filme = new Filme("Jobs, o sonho bilionário","Documentário","2024");
        this.listaFilmes.add(filme);

        filme = new Filme("Marginal Alado","Documentário","2022");
        this.listaFilmes.add(filme);

        filme = new Filme("Guerra Mundial Z","Apocalipse","2015");
        this.listaFilmes.add(filme);

    }

}