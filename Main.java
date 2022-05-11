import static java.lang.Math.*;



public  class Main
{
    /*
     * Mein neuer Kommentar
     */
    public static void main(String args[])
    {
        System.out.println ("Hallo Welt!");
        
        int sum = 0;
        for (int i = 1; i <= 50 ; ++i)
        {
            sum += i;
        }
        System.out.println(sum);
        
        int mul = 1;
        for (int i = 1; i <= 50 ; ++i)
        {
            mul *= i;
        }
        System.out.println(mul);
        
        
        // 1 + 1/2²2 + 1/3²2 + 1/42²2
        
        
        
        double reihe = 0;
        for (int i = 0; i<=10; i++)
        { reihe += 1/math.pow(i/2)  // muss complet
        
        
        }
            System.out.println(reihe);
        
    }
}
