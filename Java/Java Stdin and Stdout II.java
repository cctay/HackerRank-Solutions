/*
This challenge is to scan an integer, double, and String, and then print
them out in reverse order.
*/

public static void main(String[] args) 
{
    // Input order for tests is int, double, String
    // Must use nextLine to clear input buffer after nextInt, nextDouble
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    scan.nextLine();
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();

    // Print inputs in requested order of String, double, int
    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
}
