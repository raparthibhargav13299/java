class challenge2
{
    public static void main(String[]args)
    {
        float ct=0,ft=0;
        System.out.println("\nSr.NO\tTemperature(Celsius)\tTemperature(Fahrenheit)");
        for(int i=1;i<=11;i++)
        {
           
            ft=(ct*9/5)+32;
            System.out.println(" "+i+"\t\t"+ct+"\t\t\t"+ft);
            ct=ct+10;
        }
    }
}