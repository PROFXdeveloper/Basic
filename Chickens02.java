
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here


            // declaring variables
        
            int mondayEggs = 100, tuesdayEggs = 121, wednesdayEggs = 117;
        
            // finding daily average
        
            double dailyAverage =  (mondayEggs + tuesdayEggs + wednesdayEggs) / 3.0;
        
            // finding monthly average (daily*30)
        
            double monthlyAverage = dailyAverage * 30;
        
            // finding monthly profit (monthly*0.18)
        
            double monthlyProfit = monthlyAverage * 0.18;
        
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
