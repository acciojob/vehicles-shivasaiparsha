package com.driver;

public class Boat implements WaterVehicle{

     String name;
     int capacity;
     Boat(String name, int capacity)
     {
         this.name=name;
         this.capacity=capacity;

     }

     public String getVehicleName()
     {
         return this.name;
     }

     public int getVehicleCapacity()
     {
         return this.capacity;
     }
}
