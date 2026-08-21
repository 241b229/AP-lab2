/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

abstract class BankAccount{
    protected String accNo;
    protected double balance;
    public BankAccount(String accNo,double balance){
        this.accNo=accNo;
        this.balance=balance;
    }
    public abstract void withdraw(double amt);
    public double getBalance(){
     return balance; }
}


