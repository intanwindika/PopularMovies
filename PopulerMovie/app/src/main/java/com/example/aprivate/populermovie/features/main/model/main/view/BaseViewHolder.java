package com.example.aprivate.populermovie.features.main.model.main.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.aprivate.populermovie.features.main.model.main.model.MainItem;

/**
 * Created by private on 19/10/2017.
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    BaseViewHolder(View itemView){super(itemView);}

    public abstract void bindView(MainItem item);
}
