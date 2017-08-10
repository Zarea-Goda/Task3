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

public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.RecyclerHolder> {

    private List<Chats> list;
    private Context mContext;

    public ChatsAdapter(List<Chats> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public ChatsAdapter.RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list, parent, false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, final int position) {

        Chats calls = list.get(position);
        holder.name.setText(calls.getName());
        holder.description.setText(calls.getTell_number());

        Picasso.with(mContext)
                .load(calls.getImg())
                .error(R.drawable.chat)
                .placeholder(R.drawable.chat)
                .into(holder.imageView);



//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            public int getPosition() {
//                return position;
//            }
//
//
//            @Override
//            public void onClick(View view) {
//                if (getPosition() == 0){
//                    Intent intent = new Intent(this,MessagesActivity.class);
//                    mContext.startActivity(intent);
//                } else if (getPosition() == 1){
//                    Intent intent = new Intent(Intent.ACTION_DIAL);
//                    mContext.startActivity(intent);
//                }
//            }
//        });

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