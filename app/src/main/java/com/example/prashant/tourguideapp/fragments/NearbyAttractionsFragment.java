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
public class NearbyAttractionsFragment extends Fragment {
  private ArrayList<Place> attractions;
  ListView nearByList;

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_nearby_attractions_layout, container, false);
    nearByList = (ListView) view.findViewById(R.id.listViewNearBy);
    attractions = new ArrayList<>();
    attractions.add(new Place("Mysore Palace",
        "http://www.mysorepalace.gov.in/images/illuminated_Mysore_Palace.jpg%20(1).JPG"));
    attractions.add(new Place("Kodagu",
        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTD2-brfnP6h0SK3ZSHVnH01DhXhCC2KlQdD3RuUtMIojiMzTTPlg"));
    attractions.add(
        new Place("Wayand", "https://www.tourmyindia.com/images/coorg-weekend-tour3.jpg"));
    attractions.add(new Place("Nandi Hills",
        "http://d2847ql9t214mi.cloudfront.net/wp-content/uploads/2015/05/Coorg2.jpg"));
    // Connect the adapter with the dataset
    PlaceAdapter attractionsAdapter = new PlaceAdapter(this.getContext(), attractions);
    nearByList.setAdapter(attractionsAdapter);
    return view;
  }
}
