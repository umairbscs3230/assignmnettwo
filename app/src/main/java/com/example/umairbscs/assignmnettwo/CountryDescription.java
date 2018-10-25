package com.example.umairbscs.assignmnettwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryDescription extends AppCompatActivity {



    private TextView tt;
    private ImageView ii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_description);

        tt=(TextView) findViewById(R.id.des_text);
        ii=(ImageView) findViewById(R.id.flag_act_img);

        Intent intent = getIntent();
        String name =intent.getExtras().getString("flag");
        int img =intent.getExtras().getInt("Thumbnail");

        tt.setText(name);
        ii.setImageResource(img);
    }

}
