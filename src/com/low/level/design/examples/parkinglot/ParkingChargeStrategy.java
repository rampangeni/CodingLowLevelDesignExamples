package com.low.level.design.examples.parkinglot;

public interface ParkingChargeStrategy {
    int getCharge(int parkHours);
}
