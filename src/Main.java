public class Main
{
    public static void main(String[] args)
    {
        int favNum = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);
        boolean done = false;

        do {
            System.out.print("Enter your fav num [1-10]: ");
            if (in.hasNextInt()) {
                favNum = in.nextInt();
                in.nextLine();
                if (favNum >= 1 && favNum <= 10) {
                    System.out.println("\nYou said your fav num is " + favNum);
                    done = true;
                } else {
                    System.out.println("You said your fav num is " + favNum + "but is out of range");
                }
            }else
            {
                trash = in.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        }while(!done);
    }
}