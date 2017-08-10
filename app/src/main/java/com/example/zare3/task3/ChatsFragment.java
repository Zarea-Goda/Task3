package com.example.zare3.task3;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static com.example.zare3.task3.R.drawable.call;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatsFragment extends Fragment {
    private RecyclerView recyclerView;

    public ChatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
//        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ChatsAdapter adapter = new ChatsAdapter(createDummyData(), getActivity());
        recyclerView.setAdapter(adapter);
        return view;

    }

    private List<Chats> createDummyData() {

        List<Chats> chat = new ArrayList<>();

        Chats c1 = new Chats();
        c1.setName("Mohamed Yehia");
        c1.setTell_number("01221749182");
        c1.setImg("https://firebasestorage.googleapis.com/v0/b/ai-calendar-3ff7b.appspot.com/o/users%2FPiVKAe4Y4zXP3glujlifSmKUCUE2%2F83397?alt=media&token=479fc702-4cd1-4ffd-bfe8-28626104eb56");

        Chats c2 = new Chats();
        c2.setName("Zare3 Goda ");
        c2.setTell_number("01123123539");
        c2.setImg("https://www.facebook.com/photo.php?fbid=941434172643039&set=picfp.100003293948719.941434135976376&type=3&theater");

        Chats c3 = new Chats();
        c3.setName("Al omda ");
        c3.setTell_number("01014140915");
        c3.setImg(String.valueOf(R.drawable.call));

        Chats c4 = new Chats();
        c4.setName("Ahmed Safwat ");
        c4.setTell_number("01149829124");
        c4.setImg("R.drawable.call");

        Chats c5 = new Chats();
        c5.setName("Mohamed Goda ");
        c5.setTell_number("01123124436");
        c5.setImg("R.drawable.call");

        Chats c6 = new Chats();
        c6.setName("Goda AbdEljwad ");
        c6.setTell_number("01152848319");
        c6.setImg("R.drawable.call");

        Chats c7 = new Chats();
        c7.setName("Yasser Sallam ");
        c7.setTell_number("01148294556");
        c7.setImg("R.drawable.call");

        Chats c8 = new Chats();
        c8.setName("Zizo Mohamed ");
        c8.setTell_number("01141732218");
        c8.setImg("R.drawable.call");

        Chats c9 = new Chats();
        c9.setName("Zizo Sakr ");
        c9.setTell_number("01152685826");
        c9.setImg("R.drawable.call");

        Chats c10 = new Chats();
        c10.setName("Fawzy Kapo ");
        c10.setTell_number("01140874030");
        c10.setImg("R.drawable.call");

        chat.add(c1);
        chat.add(c2);
        chat.add(c3);
        chat.add(c4);
        chat.add(c5);
        chat.add(c6);
        chat.add(c7);
        chat.add(c8);
        chat.add(c9);
        chat.add(c10);
//        call.add(c);

//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);
//        call.add(c);

        return chat;
    }


}
