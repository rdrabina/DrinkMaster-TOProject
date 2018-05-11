public class Ingredient {
    private double volume;
    private double percentage;
    private boolean liquid;


    public Ingredient(double volume, double percentage, boolean liquid) {
        this.volume = volume;
        this.percentage = percentage;
        this.liquid = liquid;
    }

    public double getVolume() {
        return volume;
    }

    public double getPercentage() {
        return percentage;
    }

    public boolean isLiquid() {
        return liquid;
    }
}
