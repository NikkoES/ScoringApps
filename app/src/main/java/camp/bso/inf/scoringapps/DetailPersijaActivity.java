package camp.bso.inf.scoringapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPersijaActivity extends AppCompatActivity {

    private ImageView logoTim;
    private TextView namaTim, deskripsiTim, linkSumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_persija);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detail Persija");

        logoTim = findViewById(R.id.logo_tim);
        namaTim = findViewById(R.id.nama_tim);
        deskripsiTim = findViewById(R.id.deskripsi_tim);
        linkSumber = findViewById(R.id.link_sumber);

        logoTim.setImageResource(R.drawable.persija);
        namaTim.setText("PERSIJA JAKARTA");
        deskripsiTim.setText("Persija (singkatan dari Persatuan Sepak Bola Indonesia Jakarta) adalah sebuah klub sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga Indonesia.\n" +
                "Persija didirikan pada 28 November 1928, tepat sebulan setelah Sumpah Pemuda, dengan cikal bakal bernama Voetbalbond Indonesische Jacatra (VIJ). VIJ merupakan salah satu klub yang ikut mendirikan Persatuan sepak bola Seluruh Indonesia (PSSI) dengan keikutsertaan wakil VIJ, Mr. Soekardi dalam pembentukan PSSI di Societeit Hadiprojo Yogyakarta, Sabtu-19 April 1930.\n");
        linkSumber.setText("https://id.wikipedia.org/wiki/Persija_Jakarta");
        linkSumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                String url = "https://id.wikipedia.org/wiki/Persija_Jakarta";
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
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
