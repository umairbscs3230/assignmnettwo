package com.example.umairbscs.assignmnettwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<flag> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();
        data.add(new flag("AUSTRIA",R.drawable.australia));
        data.add(new flag("GERMANY",R.drawable.germany));
        data.add(new flag("INDIA",R.drawable.india));
        data.add(new flag("ITALY",R.drawable.italy));
        data.add(new flag("MEXICO",R.drawable.mexico));
        data.add(new flag("AUSTRIA",R.drawable.australia));
        data.add(new flag("GERMANY",R.drawable.germany));
        data.add(new flag("INDIA",R.drawable.india));
        data.add(new flag("ITALY",R.drawable.italy));
        data.add(new flag("MEXICO",R.drawable.mexico));
        data.add(new flag("GERMANY",R.drawable.germany));
        data.add(new flag("INDIA",R.drawable.india));
        data.add(new flag("ITALY",R.drawable.italy));
        data.add(new flag("MEXICO",R.drawable.mexico));
        data.add(new flag("INDIA",R.drawable.india));
        data.add(new flag("ITALY",R.drawable.italy));
        data.add(new flag("MEXICO",R.drawable.mexico));


        //AGAIN FOR CHECKING
        data.add(new flag("INDIA",R.drawable.india));
        data.add(new flag("ITALY",R.drawable.italy));

        RecyclerView rc = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerAdapter radapter = new RecyclerAdapter(this,data);
        rc.setLayoutManager(new GridLayoutManager(this,3));
        rc.setAdapter(radapter);

    }
}
