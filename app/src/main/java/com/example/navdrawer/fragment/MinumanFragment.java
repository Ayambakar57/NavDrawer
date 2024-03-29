package com.example.navdrawer.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawer.Item;
import com.example.navdrawer.MyAdapter;
import com.example.navdrawer.R;

import java.util.ArrayList;
import java.util.List;


public class MinumanFragment extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<Item> listData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_minuman, container, false);

        recyclerView = view.findViewById(R.id.rvMinuman);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        listData = new ArrayList<>();

        listData.add(new Item(R.drawable.esmahkota, "Es Mahkota", "I like this cuz this taste soo good"));
        listData.add(new Item(R.drawable.wedangkacang, "Wedang kacang", "Minuman ini bahan utamanya adalah kacang polong yang direbus bersama gula merah dan gula batu. Semua bahan direbus cukup lama dan menghasilkan rasa minuman yang lezat dengan kuah berwarna coklat kemerahan."));
        listData.add(new Item(R.drawable.pleret, "Es Pleret", " minuman istimewa yang dibuat dari tepung beras dan pati yang diproses dan dibentuk menjadi potongan-potongan kecil. Pleret ini kemudian dicampur dengan larutan gula aren, santan dan es serut. Minuman yang sangat enak untuk menyegarkan dahaga di tengah hari yang terik."));



        myAdapter = new MyAdapter(getContext(), listData);


        recyclerView.setAdapter(myAdapter);


        myAdapter.setItemClickListener(new MyAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, Item item) {

            }
        });

        return view;
    }
    }
