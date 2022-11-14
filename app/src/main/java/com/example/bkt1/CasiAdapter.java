package com.example.bkt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CasiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Casi> casiList;

    public CasiAdapter(Context context, int layout, List<Casi> casiList) {
        this.context = context;
        this.layout = layout;
        this.casiList = casiList;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtten = (TextView) view.findViewById(R.id.textviewten);
        TextView txtmota = (TextView) view.findViewById(R.id.textviewmota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);

        Casi casi = casiList.get(i);
        txtten.setText(casi.getTen());
        imgHinh.setImageResource(casi.getHinhanh());

        return view;
    }
}
