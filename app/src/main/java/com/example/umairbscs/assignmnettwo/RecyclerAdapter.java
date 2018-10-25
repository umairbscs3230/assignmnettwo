package com.example.umairbscs.assignmnettwo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder> {

    private Context context;
    private List<flag> data;

    public RecyclerAdapter(Context context, List<flag> data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflator=LayoutInflater.from(context);
        view=inflator.inflate(R.layout.flag_cardlayout,viewGroup,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder,final int i) {



        myViewHolder.flag_tittle.setText(data.get(i).getName());
        myViewHolder.flag_img.setImageResource(data.get(i).getThumbnail());
        myViewHolder.cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,CountryDescription.class);
                intent.putExtra("flag",data.get(i).getName());
                intent.putExtra("Thumbnail",data.get(i).getThumbnail());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    // Inner class
    public static class myViewHolder extends RecyclerView.ViewHolder{
        TextView flag_tittle;
        ImageView flag_img;
        CardView cc;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            flag_tittle = (TextView) itemView.findViewById(R.id.flag_tittle);
            flag_img = (ImageView) itemView.findViewById(R.id.flag_img);
            cc = (CardView) itemView.findViewById(R.id.cardview);

        }
    }
}
