package com.example.aprivate.populermovie.features.main.model.main.view;

/**
 * Created by private on 24/10/2017.
 */
import android.view.View;
import android.widget.TextView;

import com.example.aprivate.populermovie.R;
import com.example.aprivate.populermovie.features.main.model.main.model.HeaderItem;
import com.example.aprivate.populermovie.features.main.model.main.model.MainItem;
public class HeaderViewHolder extends BaseViewHolder {
    TextView headerField;

    public HeaderViewHolder(View itemView) {
        super(itemView);
        headerField = itemView.findViewById(R.id.main_header_field);
    }

    @Override
    public void bindView(MainItem item) {
        final HeaderItem headerItem = (HeaderItem) item;
        headerField.setText(headerItem.getHeaderTitle());
    }
}
