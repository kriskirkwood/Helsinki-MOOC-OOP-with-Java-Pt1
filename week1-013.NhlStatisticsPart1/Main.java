
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("");
        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("");
        System.out.println("Sidney Crosby Stats");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        System.out.println("Phildelphia Flyers Stats");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("");
        System.out.println("Anaheim Ducks sorted by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
    }
}
