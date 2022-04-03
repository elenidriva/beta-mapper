package com.openfaas.function;

public class Fare {
    private String id;
    private int vendorId;
    private String pickupDateTime;
    private String dropoffDateTime;
    private int passengerCount;
    private double pickupLongitude;
    private double pickupLatitude;
    private double dropoffLongitude;
    private double dropoffLatitude;
    private String storeAndForwardFlag;
    private long tripDuration;

    public Fare() {
    }

    ;

    public Fare(String id, int vendorId, String pickupDateTime, String dropoffDateTime, int passengerCount, double pickupLongitude, double pickupLatitude, double dropoffLongitude, double dropoffLatitude, String storeAndForwardFlag, long tripDuration) {
        this.id = id;
        this.vendorId = vendorId;
        this.pickupDateTime = pickupDateTime;
        this.dropoffDateTime = dropoffDateTime;
        this.passengerCount = passengerCount;
        this.pickupLongitude = pickupLongitude;
        this.pickupLatitude = pickupLatitude;
        this.dropoffLongitude = dropoffLongitude;
        this.dropoffLatitude = dropoffLatitude;
        this.storeAndForwardFlag = storeAndForwardFlag;
        this.tripDuration = tripDuration;
    }

    public Fare(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getPickupDateTime() {
        return pickupDateTime;
    }

    public void setPickupDateTime(String pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
    }

    public String getDropoffDateTime() {
        return dropoffDateTime;
    }

    public void setDropoffDateTime(String dropoffDateTime) {
        this.dropoffDateTime = dropoffDateTime;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public double getPickupLongitude() {
        return pickupLongitude;
    }

    public void setPickupLongitude(double pickupLongitude) {
        this.pickupLongitude = pickupLongitude;
    }

    public double getPickupLatitude() {
        return pickupLatitude;
    }

    public void setPickupLatitude(double pickupLatitude) {
        this.pickupLatitude = pickupLatitude;
    }

    public double getDropoffLongitude() {
        return dropoffLongitude;
    }

    public void setDropoffLongitude(double dropoffLongitude) {
        this.dropoffLongitude = dropoffLongitude;
    }

    public double getDropoffLatitude() {
        return dropoffLatitude;
    }

    public void setDropoffLatitude(double dropoffLatitude) {
        this.dropoffLatitude = dropoffLatitude;
    }

    public String getStoreAndForwardFlag() {
        return storeAndForwardFlag;
    }

    public void setStoreAndForwardFlag(String storeAndForwardFlag) {
        this.storeAndForwardFlag = storeAndForwardFlag;
    }

    public long getTripDuration() {
        return tripDuration;
    }

    public void setTripDuration(long tripDuration) {
        this.tripDuration = tripDuration;
    }
}
