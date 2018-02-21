package com.example.angelica.examenunidad1_angelica;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Angie on 20/02/2018.
 */

public class Adapter_Animales extends ArrayAdapter {
    private Activity context;
    ArrayList<Animales> animalesArrayList;
    private int resource;

    public Adapter_Animales(@NonNull Activity context, @LayoutRes int resource, ArrayList<Animales> animalesArrayList){
        super(context, resource, animalesArrayList);
        this.context = context;
        this.resource = resource;
        this.animalesArrayList = animalesArrayList;
    }


    @Override
    public int getCount() {
        return animalesArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return animalesArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null){
            if (context!= null){
                convertView = context.getLayoutInflater().inflate( resource,null);
                holder.txtItem = (TextView) convertView.findViewById(R.id.txtItem);
                convertView.setTag(holder);
            }
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        Animales animales = animalesArrayList.get(position);
        holder.txtItem.setText(animales.getTipoAnimal());
        holder.txtItem.setBackgroundColor(Color.BLUE);



        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null){
            if (context!= null){
                convertView = context.getLayoutInflater().inflate( resource,null);
                holder.txtItem = (TextView) convertView.findViewById(R.id.txtItem);
                convertView.setTag(holder);
            }
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        //Toast.makeText(context,""+position,Toast.LENGTH_SHORT).show();
        Animales animales = animalesArrayList.get(position);
        holder.txtItem.setText(animales.getTipoAnimal());
        holder.txtItem.setBackgroundColor(Color.BLUE);


        return convertView;
    }

    static  class ViewHolder{
        private TextView txtItem;
    }
}
