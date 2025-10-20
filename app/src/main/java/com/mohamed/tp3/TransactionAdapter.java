package com.mohamed.tp3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class TransactionAdapter extends ArrayAdapter<Transaction> {
private ArrayList<Transaction> transactions ;
private Context context ;
    public TransactionAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Transaction> objects) {
        super(context, resource, objects);
        this.transactions = objects ;
        this.context = context;
    }
    @SuppressLint({"ViewHolder", "SetTextI18n"})
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_item, parent, false);
        TextView title = convertView.findViewById(R.id.title);
        TextView price = convertView.findViewById(R.id.price);
        TextView date = convertView.findViewById(R.id.date);
        ImageView image = convertView.findViewById(R.id.image_list);

        Transaction transaction = transactions.get(position);

        title.setText(transaction.getTitle());
        price.setText(transaction.getPrice() + " MAD");
        date.setText(transaction.getDate().toString());
        image.setImageResource(R.drawable.ic_launcher_background);


        return convertView;
    }

}
