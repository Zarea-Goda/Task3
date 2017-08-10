package com.example.zare3.task3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CallsFragment extends Fragment {

    private RecyclerView recyclerView;

    public CallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_calls, container, false);
        View view = inflater.inflate(R.layout.fragment_calls, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
//        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CallsAdapter adapter = new CallsAdapter(createDummyData(), getActivity());
        recyclerView.setAdapter(adapter);
        return view;

    }

    private List<Calls> createDummyData() {

        List<Calls> call = new ArrayList<>();

        Calls c1 = new Calls();
        c1.setName("Mohamed Yehia");
        c1.setTell_number("01221749182");
        c1.setImg("https://firebasestorage.googleapis.com/v0/b/ai-calendar-3ff7b.appspot.com/o/users%2FPiVKAe4Y4zXP3glujlifSmKUCUE2%2F83397?alt=media&token=479fc702-4cd1-4ffd-bfe8-28626104eb56");

        Calls c2 = new Calls();
        c2.setName("Zare3 Goda ");
        c2.setTell_number("01123123539");
       // c2.setImg("R.drawable.call");

        Calls c3 = new Calls();
        c3.setName("Al omda ");
        c3.setTell_number("01014140915");
        //c3.setImg("R.drawable.call");

        Calls c4 = new Calls();
        c4.setName("Ahmed Safwat ");
        c4.setTell_number("01149829124");
        //c4.setImg("R.drawable.call");

        Calls c5 = new Calls();
        c5.setName("Mohamed Goda ");
        c5.setTell_number("01123124436");
        //c5.setImg("R.drawable.call");

        Calls c6 = new Calls();
        c6.setName("Goda AbdEljwad ");
        c6.setTell_number("01152848319");
        //c6.setImg("R.drawable.call");

        Calls c7 = new Calls();
        c7.setName("Yasser Sallam ");
        c7.setTell_number("01148294556");
        //c7.setImg("R.drawable.call");

        Calls c8 = new Calls();
        c8.setName("Zizo Mohamed ");
        c8.setTell_number("01141732218");
        //c8.setImg("R.drawable.call");

        Calls c9 = new Calls();
        c9.setName("Zizo Sakr ");
        c9.setTell_number("01152685826");
        //c9.setImg("R.drawable.call");

        Calls c10 = new Calls();
        c10.setName("Fawzy Kapo ");
        c10.setTell_number("01140874030");
        //c10.setImg("R.drawable.call");

        call.add(c1);
        call.add(c2);
        call.add(c3);
        call.add(c4);
        call.add(c5);
        call.add(c6);
        call.add(c7);
        call.add(c8);
        call.add(c9);
        call.add(c10);
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


        return call;
    }


}
