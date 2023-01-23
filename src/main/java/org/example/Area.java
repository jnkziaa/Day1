package org.example;


class Area {

    int length, breadth;

    Area(){
    }

    public void setDims(int l, int b){

        this.length = l;
        this.breadth = b;

    }

    public int getArea(){
        return this.length * this.breadth;
    }



}
