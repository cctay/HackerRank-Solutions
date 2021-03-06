/*
Given an integer, this challenge is to display it in USA, India, China, and France
currency formats. India doesn't have a built-in Locale and HackerRank would show 
question marks for the Chinese ￥, French €, and a space required for the French
format, which PrintStream fixed.
*/

public static void main(String[] args) 
{
    // Read input
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    // Create locales
    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    // Print formatted currencies
    try 
    {
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        PrintStream out = new PrintStream(System.out , true , "UTF-8");
        out.println("China: " + china.format(payment));
        out.println("France: " + france.format(payment));
    }
    catch (Exception e) 
    {}
}
