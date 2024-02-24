package org.vehicle;

public class Truck extends Vehicle{
    float loadMax;
    float weightLoading;
    public Truck(int id, String brand, float speed, int state, float loadMax, float weightLoading) {
        super(id, brand, speed, state);
        this.loadMax=loadMax;
        this.weightLoading=weightLoading;
    }
    public void load(float weight)
    {
        if(weightLoading!=loadMax) {
            weightLoading= weightLoading + weight;
        }
        else{
            System.out.println("insufficient storage ");
        }
    }
    public void unload(float weight){
        if(weightLoading != 0){
            weightLoading = weightLoading - weight;
        }
        else{
            System.out.println("empty truck!");
        }
    }
    public void showWeight()
    {
        System.out.println("The weight in this truck is: "+weightLoading);
    }
}
