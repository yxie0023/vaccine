package edu.monash.dao;

public class HospitalList {

    private String fomalName;

    private String otherName;

    private String locationAddress;

    private String suburb;

    private String postcode;

    private String longitude;

    private String latitude;

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getFomalName() {
        return fomalName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getOtherName() {
        return otherName;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setFomalName(String fomalName) {
        this.fomalName = fomalName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
}

