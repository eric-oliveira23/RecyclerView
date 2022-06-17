package com.example.apprecyclerview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apprecyclerview.R;
import com.example.apprecyclerview.activity.model.Filme;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listaFilmes;

    public Adapter(List<Filme> lista) {

    this.listaFilmes = lista;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).

                inflate(R.layout.adapterlist, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Filme filme = listaFilmes.get(position);
        holder.title.setText(filme.getFilme());
        holder.year.setText(filme.getAno());
        holder.category.setText(filme.getCategoria());

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView year;
        TextView category;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.txtTitle);
            year = itemView.findViewById(R.id.txtYear);
            category = itemView.findViewById(R.id.txtCategory);

        }
    }


}
