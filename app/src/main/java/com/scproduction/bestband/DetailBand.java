package com.scproduction.bestband;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailBand extends AppCompatActivity {
    private String title;
    String name, genre, yearsActive, member, information;
    int banner, logo;
    TextView bandName,bandGenre, bandYearsActive, bandMember, bandInformation;
    ImageView bandBanner, bandLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_band);

        Bundle bundle = getIntent().getExtras();

        name = bundle.getString("name");
        genre = bundle.getString("genre").substring(8);
        yearsActive = bundle.getString("yearsActive").substring(14);
        member = bundle.getString("member");
        information = bundle.getString("information");
        banner = bundle.getInt("banner");
        logo = bundle.getInt("logo");

        bandName = findViewById(R.id.band_name);
        bandGenre = findViewById(R.id.band_genre);
        bandYearsActive = findViewById(R.id.band_year_active);
        bandMember = findViewById(R.id.band_member);
        bandInformation = findViewById(R.id.band_information);
        bandBanner = findViewById(R.id.banner);
        bandLogo = findViewById(R.id.logo);

        title = name;
        setActionBarTitle(title);

        bandName.setText(name);
        bandGenre.setText(genre);
        bandYearsActive.setText(yearsActive);
        bandMember.setText(member);
        bandInformation.setText(information);

        Glide.with(DetailBand.this)
                .load(banner)
                .apply(new RequestOptions().override(350,350))
                .into(bandBanner);

        Glide.with(DetailBand.this)
                .load(logo)
                .apply(new RequestOptions().override(300,300))
                .into(bandLogo);
    }

    public void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

}