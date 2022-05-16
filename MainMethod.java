package com.bridgelabz.DataStructure;

public class MainMethod {

    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(12);
        s.push(4);
        System.out.print(s.pop());
        s.show();
    }

}
