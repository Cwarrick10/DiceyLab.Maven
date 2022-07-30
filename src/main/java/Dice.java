public class Dice {
    Dice dice = new Dice(2); // for craps
    Dice dice = new Dice(5); // for yatzee

    Integer toss = dice.tossAndSum();

    private Integer tossAndSum() {
        int dice1= (int)(Math.random()*6+1);
        int dice2= (int) (Math.random()*6+1);

        return null;
    }



    }
