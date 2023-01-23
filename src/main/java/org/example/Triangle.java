package org.example;

class Triangle{
    int a,b,c;
    public double getArea(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double getPerimeter(){
        int per = a + b + c;
        return per;
    }
}