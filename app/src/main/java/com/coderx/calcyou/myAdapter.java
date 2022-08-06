package com.coderx.calcyou;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class myAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<history> arrayList;
    int resource;
    private String calc_str;
    private String result_str;


    public myAdapter(Context context, int i, ArrayList<history> arrayList) {
        this.context = context;
        this.resource = i;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public history getItem(int i) {

        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.history_layout, null, false);
        }
        TextView calc = view.findViewById(R.id.his_calculation_txt);
        TextView result = view.findViewById(R.id.his_result_txt);

        history h =getItem(i);
        calc_str =  h.getCalculation();
        calc.setText(calc_str);

        result_str = h.getResult();
        result.setText(result_str);

        return view;
    }

    public void clear() {
        arrayList.clear();
    }

    public void addItem(history h) {
        this.arrayList.add(h);

    }
}
