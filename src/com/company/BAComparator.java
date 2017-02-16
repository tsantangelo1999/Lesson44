package com.company;

import java.util.Comparator;

public class BAComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        BankAccount ba1 = (BankAccount)obj1;
        BankAccount ba2 = (BankAccount)obj2;
        if(ba1.balance < ba2.balance)
            return -1;
        else if(ba1.balance > ba2.balance)
            return 1;
        else
            return 0;
    }
}
