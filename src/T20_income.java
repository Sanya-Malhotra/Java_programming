// T20_players.java - abstract class and interface
abstract class T20_players{
    abstract void minimum_income();
    abstract void match_income();
}

interface T20_income{
    void minimum_income();
    void match_income();
}

// RCB.java - subclass of T20_players
class RCB extends T20_players{
    void minimum_income(){
        System.out.println("Minimum income for RCB player is INR 20,00,000");
    }
    void match_income(){
        System.out.println("Match income for RCB player is INR 15,000 per match");
    }
}

// LSG.java - class implementing T20_income interface
class LSG implements T20_income{
    public void minimum_income(){
        System.out.println("Minimum income for LSG player is INR 15,00,000");
    }
    public void match_income(){
        System.out.println("Match income for LSG player is INR 10,000 per match");
    }
}

// BCCI_players.java - main class
public class BCCI_players {
    public static void main(String[] args) {
        RCB Virat_kohli = new RCB();
        LSG Gautam_Gambhir = new LSG();
        LSG Naveen_Ulfaq = new LSG();
        
        Virat_kohli.minimum_income();
        Virat_kohli.match_income();
        
        Gautam_Gambhir.minimum_income();
        Gautam_Gambhir.match_income();
        
        Naveen_Ulfaq.minimum_income();
        Naveen_Ulfaq.match_income();
    }
}