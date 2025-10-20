package com.mohamed.tp3;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.mohamed.tp3.databinding.ActivityTransactionDetailsBinding;

public class TransactionDetails extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityTransactionDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTransactionDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            binding.imageDetail.setImageResource(extras.getInt("image"));
            binding.titleDetail.setText(extras.getString("title"));
            binding.priceDetail.setText(String.valueOf(extras.getDouble("price")));
            binding.dateDetail.setText(extras.getString("date"));
        }

    }


}