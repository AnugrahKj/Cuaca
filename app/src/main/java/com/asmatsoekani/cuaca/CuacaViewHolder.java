package com.asmatsoekani.cuaca;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder extends RecyclerView.ViewHolder {
    public ImageView cuacaImageView;
    public TextView namaTextView, deskripsiTextView, tglwaktuTextView, suhuTextView;

    public CuacaViewHolder(View itemView) {
        super(itemView);

        cuacaImageView = (ImageView) itemView.findViewById(R.id.cuacaImageView);
        namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        deskripsiTextView = (TextView) itemView.findViewById(R.id.deskripsiTextView);
        tglwaktuTextView = (TextView) itemView.findViewById(R.id.tglwaktuTextView);
        suhuTextView = (TextView) itemView.findViewById(R.id.suhuTextView);
    }
}
