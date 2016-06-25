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
public class TechParkFragments extends Fragment {
  private ArrayList<Place> attractions;
  ListView techParkList;

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_tech_park_layout, container, false);
    techParkList = (ListView) view.findViewById(R.id.listViewTechPark);
    attractions = new ArrayList<>();
    attractions.add(
        new Place("International Tach Park", "http://www.itpbangalore.com/image/pic_about.jpg"));
    attractions.add(new Place("ITPL Tech Park",
        "http://blog.gyanlab" + ".com/wp-content/uploads/2015/08/ITPL_Wikipedia.jpg"));
    attractions.add(new Place("Hebbal",
        "https://grabhouse.s3.amazonaws.com/blog/wp-content/uploads/2014/12/Bangalore_India.jpg"));
    attractions.add(new Place("Electronic City",
        "https://mw2.google.com/mw-panoramio/photos/medium/72006413.jpg"));
    attractions.add(new Place("Infosys",
        "http://www.electronic-city.in/companies/profile/infosys/Bangalore_Infy.jpg"));
    // Connect the adapter with the dataset
    PlaceAdapter attractionsAdapter = new PlaceAdapter(this.getContext(), attractions);
    techParkList.setAdapter(attractionsAdapter);
    return view;
  }
}
