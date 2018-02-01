package camp.bso.inf.scoringapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout detailPersib, detailPersija;
    private TextView tvScorePersib, tvScorePersija;
    private Button addScorePersib, addScorePersija, lessScorePersib, lessScorePersija, resetScore, btnBerita, btnMaps;

    ImageView logoTimSatu, logoTimDua;
    TextView namaTimSatu, namaTimDua;

    int scorePersib, scorePersija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //untuk enampilkan back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Scoring Board");

        bindView();

        //untuk mengatur view dan menerima passing data dari intent sebelumnya
        namaTimSatu.setText(getIntent().getStringExtra("namaTimSatu"));
        namaTimDua.setText(getIntent().getStringExtra("namaTimDua"));
        logoTimSatu.setImageResource(getIntent().getIntExtra("logoTimSatu",0));
        logoTimDua.setImageResource(getIntent().getIntExtra("logoTimDua",0));

        initScore();

        addActionButton();

    }

    private void addActionButton(){
        detailPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DetailPersibActivity.class);
                startActivity(i);
            }
        });

        detailPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), DetailPersijaActivity.class);
                startActivity(i);
            }
        });

        addScorePersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePersib = scorePersib + 1;
                tvScorePersib.setText(""+scorePersib);
            }
        });

        addScorePersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePersija = scorePersija + 1;
                tvScorePersija.setText(""+scorePersija);
            }
        });

        lessScorePersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePersib = scorePersib - 1;
                if(scorePersib<0){
                    scorePersib = 0;
                }
                tvScorePersib.setText(""+scorePersib);
            }
        });

        lessScorePersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePersija = scorePersija - 1;
                if(scorePersija<0){
                    scorePersija = 0;
                }
                tvScorePersija.setText(""+scorePersija);
            }
        });

        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initScore();
                tvScorePersija.setText(""+scorePersija);
                tvScorePersib.setText(""+scorePersib);
            }
        });

        btnBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                String url = "http://www.bola.com/indonesia/read/3243116/pesan-pasoepati-untuk-suporter-klub-8-besar-piala-presiden?medium=Headline&campaign=Headline_click_1";
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:-6.957563, 107.712083");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                i.setPackage("com.google.android.apps.maps");
                if(i.resolveActivity(getPackageManager())!=null){
                    startActivity(i);
                }
            }
        });
    }

    public void initScore(){
        scorePersija = 0;
        scorePersib = 0;
    }

    public void bindView(){
        detailPersib = findViewById(R.id.btn_detail_persib);
        detailPersija = findViewById(R.id.btn_detail_persija);

        tvScorePersib = findViewById(R.id.score_persib);
        tvScorePersija = findViewById(R.id.score_persija);

        addScorePersib = findViewById(R.id.add_score_persib);
        addScorePersija = findViewById(R.id.add_score_persija);

        lessScorePersib = findViewById(R.id.less_score_persib);
        lessScorePersija = findViewById(R.id.less_score_persija);

        resetScore = findViewById(R.id.reset_score);
        btnBerita = findViewById(R.id.btn_berita);
        btnMaps = findViewById(R.id.btn_maps);

        namaTimSatu = findViewById(R.id.nama_tim_satu);
        namaTimDua = findViewById(R.id.nama_tim_dua);
        logoTimSatu = findViewById(R.id.logo_tim_satu);
        logoTimDua = findViewById(R.id.logo_tim_dua);
    }


    //fungsi back ketika tombol back diklik
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
