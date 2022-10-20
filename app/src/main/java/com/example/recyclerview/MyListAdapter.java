package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private Contact[] listdata;

    public MyListAdapter(Contact[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listitem = layoutInflater.inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(listitem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {
        final Contact myData = listdata[position];
        holder.textView.setText(listdata[position].getName());
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),
                        "click on "+myData.getName(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.nama);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
