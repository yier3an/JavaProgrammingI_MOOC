
public class PaymentCard
{
    private double balance;

    public PaymentCard (double balance)
    {
        this.balance = balance;
    }

    public void eatAffordably()
    {
        double remain = balance - 2.6;
        if (remain >= 0)
            balance = remain;
    }

    public void eatHeartily()
    {
        double remain = balance - 4.6;
        if (remain >= 0)
            balance = remain;
    }

    public void addMoney (double money)
    {
        if (money >= 0)
        {
            double total = balance + money;

            if (total > 150)
            {
                balance = 150;
            }
            else
            {
                balance = total;
            }
        }
    }

    public String toString()
    {
        return "The card has a balance of "  + balance + " euros";
    }
}
