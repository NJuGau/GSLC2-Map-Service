package id.ac.binus.gslc2_2501967253;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button alsutBtn, kmgBtn, senayanBtn, malangBtn, bandungBtn, bekasiBtn, semarangBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alsutBtn = findViewById(R.id.alsutBtn);
        kmgBtn = findViewById(R.id.kmgBtn);
        senayanBtn = findViewById(R.id.senayanBtn);
        malangBtn = findViewById(R.id.malangBtn);
        bandungBtn = findViewById(R.id.bandungBtn);
        bekasiBtn = findViewById(R.id.bekasiBtn);
        semarangBtn = findViewById(R.id.semarangBtn);

        alsutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMap(-6.223553971796866, 106.6493463573793, "BINUS @ Alam Sutera");
            }
        });

        kmgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMap(-6.201352441139078, 106.78234125963326, "BINUS @ Keamnggisan Kampus Anggrek");
            }
        });

        senayanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMap(-6.228335202736571, 106.79688610822363, "BINUS JWC Senayan");
            }
        });

        malangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMap(-7.9391785135212745, 112.68125010180738, "BINUS @ Malang");
            }
        });

        bandungBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMap(-6.912244457146717, 107.59425380054874, "BINUS @ Bandung");
            }
        });

        bekasiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMap(-6.219384192171201, 106.99974866252536, "BINUS @ Bekasi");
            }
        });

        semarangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoMap(-6.94780847920627, 110.38000513130856, "BINUS @ Semarang");
            }
        });
    }

    public void gotoMap(Double latitude, Double longitude, String title){
        Intent intent = new Intent();
        System.out.println(latitude + " " + longitude + " " + title);
        intent.putExtra("latitude", latitude);
        intent.putExtra("longitude", longitude);
        intent.putExtra("campus_name", title);
        setResult(RESULT_OK, intent);
        finish();
//        startActivity(intent);
    }
}