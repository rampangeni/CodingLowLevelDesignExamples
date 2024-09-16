package com.low.level.design.examples.parkinglot;

public interface Parking {
    public Ticket park(Vehicle vehicle) throws ParkingFullException;

    public int unPark(Ticket ticket, ParkingChargeStrategy parkingCostStrategy) throws InvalidVehicleNumberException;
}
