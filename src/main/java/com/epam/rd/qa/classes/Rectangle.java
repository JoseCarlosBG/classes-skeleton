package com.epam.rd.qa.classes;

public class Rectangle {
    private double sideA, sideB;

    public Rectangle(double a, double b){
        if ((a==0) || (b==0)){
            throw new IllegalArgumentException();
        }
        if ((a<0) || (b<0)){
            throw new IllegalArgumentException();
        }
        sideA=a;
        sideB=b;
    }

    public Rectangle(double side){
        if (side==0){
            throw new IllegalArgumentException();
        }
        if (side<0){
            throw new IllegalArgumentException();
        }
        sideA=side;
        sideB=side;
    }

    public Rectangle(){
        sideA=4;
        sideB=3;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public double area(){
        return sideA*sideB;
    }

    public double perimeter(){
        return sideA*2+sideB*2;
    }

    public boolean isSquare(){
        return getSideA() == getSideB();
    }

    public void replaceSides(){
        double temp;
        temp=sideA;
        sideA=sideB;
        sideB=temp;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (int)this.sideA;
        hash = 31 * hash + (int)this.sideB;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r;
        if (obj instanceof Rectangle){
            r=(Rectangle) obj;
            return r.getSideA() == this.getSideA() && (r.getSideB() == this.getSideB());
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Side A=" + this.getSideA() + ", Side B=" + getSideB();
    }
}
