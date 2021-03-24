package com.scproduction.bestband;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBandAdapter extends RecyclerView.Adapter<ListBandAdapter.ListViewHolder> {
    private ArrayList<Band> listBand;
    private Context context;

    public ListBandAdapter(ArrayList<Band> list) {
        this.listBand = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_band, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder,final int position) {
        final Band band = listBand.get(position);
        Glide.with(holder.itemView.getContext())
                .load(band.getPhoto())
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgPhoto);
        holder.tvName.setText(band.getName());
        holder.genre.setText(band.getGenre());
        holder.tvYearsActive.setText(band.getYearsActive());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailBand.class);
                Bundle bundle = new Bundle();

                bundle.putString("name", band.getName());
                bundle.putString("genre", band.getGenre());
                bundle.putString("yearsActive", band.getYearsActive());
                bundle.putString("member", band.getMember());
                bundle.putString("information", band.getInformation());
                bundle.putInt("logo", band.getLogo());
                bundle.putInt("banner", band.getPhoto());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBand.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, genre, tvYearsActive;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            genre = itemView.findViewById(R.id.tv_item_genres);
            tvYearsActive = itemView.findViewById(R.id.tv_item_years_active);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Band data);
    }
}
