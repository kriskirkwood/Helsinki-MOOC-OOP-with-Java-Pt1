public class Reformatory {
    
    private int weightCalled;

    public int weight(Person person) {
        // return the weight of the person
        int weight = person.getWeight();
        weightCalled ++;
        return weight;
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        
        return weightCalled;
    }

}
