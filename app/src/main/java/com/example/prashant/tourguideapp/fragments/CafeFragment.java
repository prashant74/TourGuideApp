package com.example.prashant.tourguideapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.prashant.tourguideapp.Place;
import com.example.prashant.tourguideapp.PlaceAdapter;
import com.example.prashant.tourguideapp.R;
import java.util.ArrayList;

/**
 * Created by prashant on 6/25/16.
 */
public class CafeFragment extends Fragment {
  private ArrayList<Place> attractions;
  ListView cafeList;

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_cafe_layout, container, false);
    cafeList = (ListView) view.findViewById(R.id.listViewCafe);
    initData();
    // Connect the adapter with the dataset
    PlaceAdapter attractionsAdapter = new PlaceAdapter(this.getContext(), attractions);
    cafeList.setAdapter(attractionsAdapter);
    return view;
  }


  private void initData() {
    attractions = new ArrayList<>();
    attractions.add(new Place("Linto Cafe",
        "https://img.zmtcdn.com/data/pictures/3/18162883/2a3d8261199e4abdc8161d163a77a543.jpg?fit=around%7C200:200&crop=200:200;*,*"));
    attractions.add(new Place("People Tree Cafe",
        "https://img.zmtcdn.com/data/reviews_photos/74c/e89b2f7c81a18a170c9964308396774c_1460021595.jpg?fit=around%7C200:200&crop=200:200;*,*"));
    attractions.add(new Place("Starbucks",
        "https://img.zmtcdn.com/data/reviews_photos/e98/89197cbf46496dd8d6ba31cf0e297e98_1466598229.jpg?fit=around%7C200:200&crop=200:200;*,*"));
    attractions.add(new Place("Latte Coffee Lounge",
        "https://img.zmtcdn.com/data/pictures/9/55079/470d33d00635fff86be9033b18752174.jpg?fit=around%7C200:200&crop=200:200;*,*"));
    attractions.add(new Place("The chocolate room",
        "https://img.zmtcdn.com/data/reviews_photos/70c/60f2be192cabb6b800dce3aed58e870c_1454234344.jpg?fit=around%7C200:200&crop=200:200;*,*"));
  }
}
