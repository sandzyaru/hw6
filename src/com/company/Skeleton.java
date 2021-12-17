package com.company;

public class Skeleton extends Boss{
    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public Skeleton(int health, int damage, String defence, int numberOfArrows) {
        super(health, damage, defence);
        this.numberOfArrows=numberOfArrows;
    }
    public String printlinfo() {
        return super.printlinfo()+"\nNumber of arrows: "+getNumberOfArrows();
    }
}
