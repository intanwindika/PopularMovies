package com.example.aprivate.populermovie.features.main.model.main.model;

import com.example.aprivate.populermovie.R;

/**
 * Created by private on 24/10/2017.
 */

public class HeaderItem implements MainItem {

    public final String headerTitle;

    public HeaderItem(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    @Override
    public int getType() {
        return R.layout.main_header_item;
    }

    @Override
    public int getItemSize() {
        return 2;
    }
}
