class challenge8
{
    public static void main(String []args)
    {
        int invest=1000,price=100;
        double invs,newprice,tax,inrprofit,dollarprofit;

        System.out.println("Enter the amount invested by the company : ");
        System.out.println(invest);
        System.out.println("Enter the share price of the company : ");
        System.out.println(price);  
        
        invs=74.3*invest;
        newprice=74.3*100/40;
        tax=invs*10/100;
        inrprofit=invs-tax;
        dollarprofit=inrprofit/74.3;
        System.out.println("Investment amount after increase in exchange rate : "+invs);
        System.out.println("The new price of the stock : "+newprice);
        System.out.println("The tax to be paid on the total shares at 10% : "+tax);
        System.out.println("The total profit in INR : "+inrprofit);
        System.out.println("The total profit converted to dollars : "+dollarprofit);

    }
}