package Entities;

public class Box {
    public double length;
    public double width;
    public double height;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume(){
        return this.length * this.width * this.height;
    }
}
