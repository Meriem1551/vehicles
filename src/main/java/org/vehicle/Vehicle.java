package org.vehicle;

public abstract class   Vehicle {
    public int id;
    public String brand;
    public float speed;
    int state;
    public Vehicle(int id, String brand, float speed, int state){
        this.id = id;
        this.brand = brand;
        this.speed=speed;
        this.state=state;
    }
    public int start()
    {
       return this.state=1;
    }
    public int stop(){
        return this.state=0;
    }
    public float accelerate(){
        return this.speed+5;
    }
    public float brake()
    {
        return this.speed -5;
    }
}
