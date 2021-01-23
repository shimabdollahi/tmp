package ir.ac.shirazu.cse.shimadollahi.homegym;

public class Exercise {
    private final String name;
    private String description;
    private String imageReference; //or animation reference
    private boolean neckFocus,
            handFocus,
            chestFocus,
            waistAndStomachFocus,
            backFocus,
            buttFocus,
            legFocus;

    public Exercise(String name, String description, String imageReference, boolean neckFocus, boolean handFocus, boolean chestFocus, boolean waistAndStomachFocus, boolean backFocus, boolean buttFocus, boolean legFocus) {
        this.name = name;
        this.description = description;
        this.imageReference = imageReference;
        this.neckFocus = neckFocus;
        this.handFocus = handFocus;
        this.chestFocus = chestFocus;
        this.waistAndStomachFocus = waistAndStomachFocus;
        this.backFocus = backFocus;
        this.buttFocus = buttFocus;
        this.legFocus = legFocus;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageReference() {
        return imageReference;
    }

    public void setImageReference(String imageReference) {
        this.imageReference = imageReference;
    }

    public boolean isNeckFocus() {
        return neckFocus;
    }

    public void setNeckFocus(boolean neckFocus) {
        this.neckFocus = neckFocus;
    }

    public boolean isHandFocus() {
        return handFocus;
    }

    public void setHandFocus(boolean handFocus) {
        this.handFocus = handFocus;
    }

    public boolean isChestFocus() {
        return chestFocus;
    }

    public void setChestFocus(boolean chestFocus) {
        this.chestFocus = chestFocus;
    }

    public boolean isWaistAndStomachFocus() {
        return waistAndStomachFocus;
    }

    public void setWaistAndStomachFocus(boolean waistAndStomachFocus) {
        this.waistAndStomachFocus = waistAndStomachFocus;
    }

    public boolean isBackFocus() {
        return backFocus;
    }

    public void setBackFocus(boolean backFocus) {
        this.backFocus = backFocus;
    }

    public boolean isButtFocus() {
        return buttFocus;
    }

    public void setButtFocus(boolean buttFocus) {
        this.buttFocus = buttFocus;
    }

    public boolean isLegFocus() {
        return legFocus;
    }

    public void setLegFocus(boolean legFocus) {
        this.legFocus = legFocus;
    }
}
