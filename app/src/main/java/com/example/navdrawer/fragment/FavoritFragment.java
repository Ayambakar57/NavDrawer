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


public class FavoritFragment extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<Item> listData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorit, container, false);


        // Initialize the RecyclerView
        recyclerView = view.findViewById(R.id.rvFavorit);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize the list of items
        listData = new ArrayList<>();

        listData.add(new Item(R.drawable.kupattahu, "Kupat Tahu", "I like this cuz this taste soo good"));
        listData.add(new Item(R.drawable.mendoan, "Mendoan", "Nice for break ur fast and also good couple with coffee or tea in the rain"));
        listData.add(new Item(R.drawable.pleret, "Es Pleret", "Taste very refreshing for when u get hot cuz the temperature"));

        // Add items to the list
        // Example: listData.add(new Item("Item Name", R.drawable.item_image));

        // Initialize the adapter with the list of items
        myAdapter = new MyAdapter(getContext(), listData);

        // Set the adapter to the RecyclerView
        recyclerView.setAdapter(myAdapter);

        // Set an item click listener for the adapter
        myAdapter.setItemClickListener(new MyAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, Item item) {
                // Handle item click
                // For example, you can start a new activity or show a dialog
            }
        });

        return view; // This should be the last line in the method
    }
    }
