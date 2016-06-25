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
public class LocalAttractionsFragment extends Fragment {
  private ArrayList<Place> attractions;
  ListView localList;

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_local_attractions_layout, container, false);
    localList = (ListView) view.findViewById(R.id.listViewLocalAttractions);
    attractions = new ArrayList<>();
    attractions.add(new Place("Iscon",
        "https://lh4.googleusercontent.com/-n2X2iEKnb4I/AAAAAAAAAAI/AAAAAAAAQNw/FvSPCm1RQeo/s0-c-k-no-ns/photo.jpg"));
    attractions.add(new Place("Banerghetta National Park",
        "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRltxRbIkFpzhd_GXCnO3pNRXRT8lM86le-NJ5f3UYtNgYby_4H"));
    attractions.add(new Place("Bangalore Palace",
        "http://images.mapsofindia.com/my-india/2014/01/banglore-palace-karnataka.jpg"));
    attractions.add(new Place("Lal Bagh",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOfdzxCNt28d67wCEa16KzqQiwwIpadMvVYqVJRojsZ920tE3BDw"));
    attractions.add(new Place("Wonderla",
        "http://a2.res.cloudinary.com/simplotel/image/upload/x_129,y_0,w_1108,h_623,r_0,c_crop,q_60,fl_progressive/w_455,c_fit/wonderla-amusement-parks-resort/panoramic_night_view_2_wonderla_amusement_park_bangalore_etgynl"));
    // Connect the adapter with the dataset
    PlaceAdapter attractionsAdapter = new PlaceAdapter(this.getContext(), attractions);
    localList.setAdapter(attractionsAdapter);
    return view;
  }
}
