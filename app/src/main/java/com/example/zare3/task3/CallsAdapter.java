package com.example.zare3.task3;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Zare3 on 09/08/2017.
 */

public class CallsAdapter extends RecyclerView.Adapter<CallsAdapter.RecyclerHolder> {

    private List<Calls> list;
    private Context mContext;

    public CallsAdapter(List<Calls> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public CallsAdapter.RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list, parent, false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerHolder holder, final int position) {

        Calls calls = list.get(position);
        holder.name.setText(calls.getName());
        holder.description.setText(calls.getTell_number());
        holder.imageView.setImageResource(R.drawable.person);

//        Picasso.with(mContext)
//                .load(calls.getImg())
//                .error(R.drawable.chat)
//                .placeholder(R.drawable.chat)
//                .into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            public int getPosition() {
                return position;
            }


            @Override
            public void onClick(View view) {
                if (getPosition() == 0){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01221749182"));
                    mContext.startActivity(callIntent);
                } else if (getPosition() == 1){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01123123539"));
                    mContext.startActivity(callIntent);
                } else if (getPosition() == 2){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01014140915" ));
                    mContext.startActivity(callIntent);
                } else if (getPosition() == 3){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01014140915" ));
                    mContext.startActivity(callIntent);
                }else if (getPosition() == 4){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01149829124" ));
                    mContext.startActivity(callIntent);
                }else if (getPosition() == 5){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01123124436" ));
                    mContext.startActivity(callIntent);
                }else if (getPosition() == 6){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:0115284319" ));
                    mContext.startActivity(callIntent);
                }else if (getPosition() == 7){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01148294556" ));
                    mContext.startActivity(callIntent);
                }else if (getPosition() == 8){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01141732218" ));
                    mContext.startActivity(callIntent);
                }else if (getPosition() == 9){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01152685826" ));
                    mContext.startActivity(callIntent);
                }else if (getPosition() == 10){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01140874030" ));
                    mContext.startActivity(callIntent);
                }else {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:122"));
                    mContext.startActivity(callIntent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView name;
        private TextView description;

        public RecyclerHolder(View view) {
            super(view);

            imageView = (ImageView) view.findViewById(R.id.item_img);
            name = (TextView) view.findViewById(R.id.item_name);
            description = (TextView) view.findViewById(R.id.tell_number);


        }
    }
}