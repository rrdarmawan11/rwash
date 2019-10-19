package com.example.rwash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoriAdapter extends RecyclerView.Adapter<HistoriAdapter.ViewHolder>{

    public LayoutInflater inflater;
    private ArrayList<Histori> imageArrayListHistori;


    public HistoriAdapter(Context ctx, ArrayList<Histori> imageArrayListHistori) {

        inflater = LayoutInflater.from(ctx);
        this.imageArrayListHistori = imageArrayListHistori;

    }

    @Override
    public HistoriAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_list_fav, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoriAdapter.ViewHolder holder, int position) {

        holder.ivHistoriCuci.setImageResource(imageArrayListHistori.get(position).getPicHistori());
        holder.tvName.setText(imageArrayListHistori.get(position).getNamaHistori());

    }

    @Override
    public int getItemCount() { return imageArrayListHistori.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        ImageView ivHistoriCuci;

        public ViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.nama_tempat_fav);
            ivHistoriCuci= (ImageView) itemView.findViewById(R.id.gambar_fav);
        }
    }
}

