package com.example.moaathalrajab.week4demo1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends ArrayAdapter<String> implements View.OnClickListener {

    private final Context mContext;
    private final String[] lstItems;

    public MyAdapter(@NonNull Context context, int resource, @NonNull String[] objects) {
        super(context, resource, objects);

        this.mContext=context;
        this.lstItems=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.itemlayout, parent, false);
        TextView tv1=(TextView) rowView.findViewById(R.id.text2);
        ImageView img1=(ImageView) rowView.findViewById(R.id.image_view1);
        tv1.setText(lstItems[position]);
        img1.setOnClickListener(this);

        return rowView;

    }

    @Override
    public void onClick(View view) {

            Toast.makeText(mContext, "You clicked the ICON", Toast.LENGTH_SHORT).show();

    }
}
