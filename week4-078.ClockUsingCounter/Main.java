

public class Main {

    public static void main(String[] args) throws Exception {
        
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
                
        seconds.setValue(40);
        minutes.setValue(06);
        hours.setValue(18);

       
        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            // advance minutes
            // if minutes become zero, advance hours
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            
        }
    }
}
