package ir.ac.shirazu.cse.shimadollahi.homegym;

public class Goal {
    private boolean hand,
            leg,
            butt,
            waistAndStomach,
            chest,
            neck,
            back,
            fullBody;

    public boolean isBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    public boolean isHand() {
        return hand;
    }

    public boolean isLeg() {
        return leg;
    }

    public boolean isButt() {
        return butt;
    }

    public boolean isWaistAndStomach() {
        return waistAndStomach;
    }

    public boolean isChest() {
        return chest;
    }

    public boolean isNeck() {
        return neck;
    }

    public boolean isFullBody() {
        return fullBody;
    }

    public void setHand(boolean hand) {
        this.hand = hand;
    }

    public void setLeg(boolean leg) {
        this.leg = leg;
    }

    public void setButt(boolean butt) {
        this.butt = butt;
    }

    public void setWaistAndStomach(boolean waistAndStomach) {
        this.waistAndStomach = waistAndStomach;
    }

    public void setChest(boolean chest) {
        this.chest = chest;
    }

    public void setNeck(boolean neck) {
        this.neck = neck;
    }

    public void setFullBody(boolean fullBody) {
        this.fullBody = fullBody;
    }
}
