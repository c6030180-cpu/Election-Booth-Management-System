package com.example.election;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    TextView tvTotal, tvFixed, tvTentative, tvOpposite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        tvTotal = findViewById(R.id.tvTotal);
        tvFixed = findViewById(R.id.tvFixed);
        tvTentative = findViewById(R.id.tvTentative);
        tvOpposite = findViewById(R.id.tvOpposite);

        // Demo Data
        tvTotal.setText("Total Voters: 3500");
        tvFixed.setText("Fixed: 1200");
        tvTentative.setText("Tentative: 800");
        tvOpposite.setText("Opposite: 1500");
    }
}
