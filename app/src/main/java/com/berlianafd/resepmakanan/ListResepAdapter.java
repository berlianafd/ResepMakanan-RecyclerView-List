package com.berlianafd.resepmakanan;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

class ListResepAdapter extends RecyclerView.Adapter<ListResepAdapter.ListViewHolder>  {
    private ArrayList<Resep> listResep;
    Dialog myDialog;
    public ListResepAdapter(ArrayList<Resep> list) {
        this.listResep = list;
    }

    @NonNull
    @Override
    public ListResepAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_resep, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListResepAdapter.ListViewHolder holder, int position) {
        Resep resep = listResep.get(position);
        Glide.with(holder.itemView.getContext())
                .load(resep.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(resep.getName());
        holder.tvDetail.setText(resep.getJenis());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailResep.class);
                intent.putExtra("nameResep",listResep.get(holder.getAdapterPosition()).getName());
                intent.putExtra("detailResep",listResep.get(holder.getAdapterPosition()).getDetail());
                intent.putExtra("urlResep",listResep.get(holder.getAdapterPosition()).getVideourl());
                v.getContext().startActivity(intent);
            }
        });

        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.setContentView(R.layout.popup_foto);

                ImageView img = (ImageView) myDialog.findViewById(R.id.potoview);

                img.setImageResource(listResep.get(holder.getAdapterPosition()).getPhoto());

                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        CardView cardView;


        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            cardView = itemView.findViewById(R.id.cardview);
            myDialog = new Dialog(itemView.getContext());
        }
    }
}
