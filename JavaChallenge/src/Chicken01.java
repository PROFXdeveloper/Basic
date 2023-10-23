

public class Main {
     
  public static void main(String args[])
	{


   int chickenCount = 3;
   int eggsPerChicken = 5;

int totalEggs = (chickenCount * eggsPerChicken)+ ((chickenCount + 1) * eggsPerChicken) + (((chickenCount + 1) / 2) * eggsPerChicken);
  System.out.println(totalEggs + " First scenario");

    // scenario 2

chickenCount = 8;

eggsPerChicken = 4;

totalEggs = (chickenCount * eggsPerChicken) + ((chickenCount + 1) * eggsPerChicken) + (((chickenCount + 1) / 2) * eggsPerChicken);

    System.out.println(totalEggs + " Second scenario");

             }

}