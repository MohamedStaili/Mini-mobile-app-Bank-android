package com.mohamed.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;

import com.mohamed.tp3.databinding.ActivityTransactionsBinding;

import java.util.ArrayList;
import java.util.Date;

public class Transactions extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityTransactionsBinding binding;
    private ArrayList<Transaction> transactions;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTransactionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        listView = binding.transationList ;
        transactions = new ArrayList<>();

        transactions.add(new Transaction(R.drawable.ic_launcher_background, "Achat Supermarché", 230.50, new Date()));
        transactions.add(new Transaction(R.drawable.ic_launcher_background, "Restauration", 75.00, new Date()));
        transactions.add(new Transaction(R.drawable.ic_launcher_background, "Transport Bus", 10.00, new Date()));
        transactions.add(new Transaction(R.drawable.ic_launcher_background, "Facture Téléphone", 120.99, new Date()));
        transactions.add(new Transaction(R.drawable.ic_launcher_background, "Retrait DAB", 500.00, new Date()));
        transactions.add(new Transaction(R.drawable.ic_launcher_background, "Cadeau Ami", 200.00, new Date()));

        TransactionAdapter adapter = new TransactionAdapter(this, R.layout.list_item, transactions);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener((parent, view, position, id) -> {
            Transaction transaction = transactions.get(position);

            Intent intent = new Intent(Transactions.this, TransactionDetails.class);
            intent.putExtra("image", transaction.getImageId());
            intent.putExtra("title", transaction.getTitle());
            intent.putExtra("price", transaction.getPrice());
            intent.putExtra("date", transaction.getDate().toString());
            startActivity(intent);
        });



    }


}