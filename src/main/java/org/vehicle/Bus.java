package org.vehicle;

public class Bus extends Vehicle{
    int numTraveler;
    int maxTraveler;
    public Bus(int id, String brand, float speed, int state, int numTraveler, int maxTraveler) {
        super(id, brand, speed, state);
        this.numTraveler=numTraveler;
        this.maxTraveler=maxTraveler;
    }
    public void ascend(int travelers){
        if(numTraveler!=maxTraveler) {
            numTraveler = numTraveler + travelers;
        }
        else{
            System.out.println("The bus is full!");
        }
    }
    public void descend(int travelers){
        if(numTraveler!=0){
            numTraveler = numTraveler - travelers;
        }
        else {
            System.out.println("The bus is empty! dont stop");
        }
    }
    public void showTraveler(){
        System.out.println("Number of traveler in this bus is: "+numTraveler);
    }
}
