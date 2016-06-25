package com.example.prashant.tourguideapp;

/**
 * Created by prashant on 6/25/16.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
  LayoutInflater inflater;

  public PlaceAdapter(Context context, ArrayList<Place> locations) {
    super(context, 0, locations);
    inflater = (LayoutInflater) context.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
  }

  @Override public View getView(int i, View convertView, ViewGroup viewGroup) {
    ViewHolder holder = null;
    View rowView = convertView;
    if (rowView == null) {
      holder = new ViewHolder();
      rowView = inflater.inflate(R.layout.list_item_layout, null);
      holder.placeName = (TextView) rowView.findViewById(R.id.location_name);
      holder.placeImage = (ImageView) rowView.findViewById(R.id.location_image);
      rowView.setTag(holder);
    } else {
      holder = (ViewHolder) rowView.getTag();
    }
    holder.placeName.setText(getItem(i).getName());
    String imageUrl = getItem(i).getImageUrl();
    if (imageUrl != null) {
      new DownloadImageTask(holder.placeImage).execute(imageUrl);
    }
    return rowView;
  }

  public class ViewHolder {
    TextView placeName;
    ImageView placeImage;
  }
}