public class Chair {
    private boolean arms;
    private boolean feet;
    private boolean stabilizer;
    private boolean cutSeat;
    private boolean back;
    private boolean packageChair;

    public Chair(){
        arms=false;
        feet=false;
        stabilizer=false;
        cutSeat=false;
        back=false;
        packageChair=false;
    }

    public void setArms(boolean arms) {
        this.arms = arms;
    }

    public void setFeet(boolean feet) {
        this.feet = feet;
    }

    public void setStabilizer(boolean stabilizer) {
        this.stabilizer = stabilizer;
    }

    public void setCutSeat(boolean cutSeat) {
        this.cutSeat = cutSeat;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    public void setPackageChair(boolean packageChair) {
        this.packageChair = packageChair;
    }
}
