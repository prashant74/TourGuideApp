package com.example.prashant.tourguideapp;

/**
 * Created by prashant on 6/25/16.
 */
public class Place {
  private String name;
  private String imageUrl;

  public Place(String name, String imageUrl) {
    this.name = name;
    this.imageUrl = imageUrl;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
}
