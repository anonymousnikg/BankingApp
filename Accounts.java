package OOPs;

public class Accounts {
    long acno;
    String name;
    float bal;

    public Accounts(){}

    public Accounts(long acno,String name,float bal){
        this.acno=acno;
        this.name=name;
        this.bal= bal;
    }

    void deposit(float amt){
        this.bal=this.bal+amt;
        System.out.println("Rs "+amt+"is Credited | Available Balance: "+this.bal);
    }

    void withdraw(float amt){
        if(this.bal>amt){
            this.bal=this.bal-amt;
            System.out.println("Rs "+amt+"is Debited | Available Balance: "+this.bal);
        }else{
            System.out.println("Error: Insufficient Balance");
        }
    }

    void getBalance(){
        System.out.println("A/C No. "+this.acno+" | Name:"+this.name+" | Balance: "+this.bal);
    }
}
