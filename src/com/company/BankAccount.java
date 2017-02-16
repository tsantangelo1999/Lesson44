package com.company;

public class BankAccount implements Comparable
{
    public String name;
    public double balance;

    public BankAccount(String n, double b)
    {
        name = n;
        balance = b;
    }

    public int compareTo(Object bank)
    {
        BankAccount ba = (BankAccount)bank;
        //
        /*PROJECT 1
        if(balance < ba.balance)
            return -1;
        else if(balance > ba.balance)
            return 1;
        else
            return 0;
        */
        //
        //PROJECT 2
        if(name.charAt(0) < ba.name.charAt(0))
            return -1;
        else if(name.charAt(0) > ba.name.charAt(0))
            return 1;
        else
            return 0;
    }
}
