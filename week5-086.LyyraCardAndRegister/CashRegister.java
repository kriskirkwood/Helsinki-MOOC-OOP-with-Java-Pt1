
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double economicalLunch = 2.5;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= economicalLunch) {
            this.cashInRegister += economicalLunch;
            this.economicalSold ++;
            return cashGiven - economicalLunch;
        } else {
            return cashGiven;
        }
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double gourmetLunch = 4.0;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= gourmetLunch) {
            this.cashInRegister += gourmetLunch;
            this.gourmetSold ++;
            return cashGiven - gourmetLunch;
        } else {
            return cashGiven;
        }
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        
    }
    
    public boolean payEconomical(LyyraCard card) {
        double ecoLunch = 2.5;
        if (card.balance() >= ecoLunch) {
            this.economicalSold ++;
            card.pay(ecoLunch);
            return true;
        } else {
            return false;
        }
          
    } 
    
    public boolean payGourmet(LyyraCard card) {
        double gourmetLunch = 4.0;
        if (card.balance() >= gourmetLunch) {
            this.gourmetSold ++;
            card.pay(gourmetLunch);
            return true;
        } else {
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}