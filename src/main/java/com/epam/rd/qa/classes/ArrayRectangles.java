package com.epam.rd.qa.classes;

public class ArrayRectangles {
    private final Rectangle[] array;

    public ArrayRectangles(int size) {
        if (size<=0){
            throw new IllegalArgumentException();
        }
        else{
            array = new Rectangle[size];
        }
    }

    public ArrayRectangles(Rectangle... rectangles) {
        if ((rectangles==null) || (rectangles.length==0)){
            throw new IllegalArgumentException();
        }
        else{
            array=rectangles;
        }
    }

    public boolean addRectangle(Rectangle rectangle) {
        boolean result= false;
        int i=0;
        while ((i<array.length) && !result){
            if(array[i]==null){
                array[i]=rectangle;
                result=true;
            }
            else{
                i++;
            }
        }
        return result;
    }

    public int size() {
        int count=0;
        while (count<array.length){
            if(array[count]==null){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }

    public int indexMaxArea() {
        double max=array[0].area();
        int i=1;
        int pos=0;
        while (i<array.length){
            if (max<array[i].area()){
                max=array[i].area();
                pos=i;
            }
            i++;
        }
        return pos;
    }

    public int indexMinPerimeter() {
        double min=array[0].perimeter();
        int i=1;
        int pos=0;
        while (i<array.length){
            if (min>array[i].perimeter()){
                min=array[i].perimeter();
                pos=i;
            }
            i++;
        }
        return pos;
    }

    public int numberSquares() {
        int num=0;
        for (Rectangle r : array){
            if (r.isSquare()){
                num++;
            }
        }
        return num;
    }
}
