package com.example.rwash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.ViewHolder> {

    public LayoutInflater inflater;
    private ArrayList<Favorite> imageArrayList;

   public FavoriteAdapter(Context ctx, ArrayList<Favorite> imageArrayList) {

       inflater = LayoutInflater.from(ctx);
       this.imageArrayList = imageArrayList;
   }


    @Override
    public FavoriteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_list_fav, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(FavoriteAdapter.ViewHolder holder, int position) {

       holder.ivTempatFav.setImageResource(imageArrayList.get(position).getPic());
       holder.tvName.setText(imageArrayList.get(position).getNama());

    }

    @Override
    public int getItemCount() {
        return imageArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        ImageView ivTempatFav;

        public ViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView)itemView.findViewById(R.id.nama_tempat_fav);
            ivTempatFav = (ImageView)itemView.findViewById(R.id.gambar_fav);
        }
    }
}
