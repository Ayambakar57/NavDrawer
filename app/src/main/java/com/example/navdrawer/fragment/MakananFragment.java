package com.example.navdrawer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawer.Item;
import com.example.navdrawer.MyAdapter;
import com.example.navdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class MakananFragment extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<Item> listData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_makanan, container, false);

        // Initialize the RecyclerView
        recyclerView = view.findViewById(R.id.rvMakanan);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize the list of items
        listData = new ArrayList<>();

        listData.add(new Item(R.drawable.kupattahu, "Kupat Tahu", "Kupat tahu adalah makanan khas magelang"));
        listData.add(new Item(R.drawable.mendoan, "Mendoan", "Tempe mendoan adalah tempe diiris tipis yang digoreng dengan tepung dan seringkali disajikan dengan mencelupkannya ke kecap manis dan sedikit potongan cabe rawit. "));
        listData.add(new Item(R.drawable.segogodog, "Sego Godog", "Makanan yang unik ini terdiri dari nasi yang direndam dalam kuah yang pedas dan berempah. Menunya terdiri dari telur, suwiran ayam, kol, wortel, seledri dan bawang yang kemudian dicampur dengan nasi."));
        listData.add(new Item(R.drawable.sopsenerek, "Sop senerek", "Sajian ini terdiri dari sop kacang merah dan beberapa sayuran lain yang di atasnya diberikan potongan daging. Sopnya bening dan sering kali pedas."));
        listData.add(new Item(R.drawable.tahubacem, "Tahu Bacem", "Tahu bacem adalah tahu yang direndam dalam berbagai bumbu-bumbu istimewa dan kemudian perlahan direbus sehingga membuat tahunya menjadi penuh citarasa."));
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
