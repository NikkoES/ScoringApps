package camp.bso.inf.scoringapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPersibActivity extends AppCompatActivity {

    private ImageView logoTim;
    private TextView namaTim, deskripsiTim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_persib);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detail Persib");


        logoTim = findViewById(R.id.logo_tim);
        namaTim = findViewById(R.id.nama_tim);
        deskripsiTim = findViewById(R.id.deskripsi_tim);

        logoTim.setImageResource(R.drawable.persib);
        namaTim.setText("PERSIB BANDUNG");
        deskripsiTim.setText("Persib (Persatuan Sepak Bola Indonesia Bandung) adalah sebuah tim sepak bola Indonesia terbesar yang berdiri pada 14 Maret 1933, klub ini berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga Super Indonesia. Julukan mereka adalah Maung Bandung dan Pangeran Biru. Sponsor utama dan terbesar masih di pegang Indofood dan apparel jersey yang terbaru adalah Sportama.");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return true;
    }
}
