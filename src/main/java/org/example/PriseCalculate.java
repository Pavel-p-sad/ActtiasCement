package org.example;
public class PriseCalculate {
    private double startSale;
    private double stepSale;
    private double allPrise;
    private double sale;
    public PriseCalculate(double startSale, double stepSale,  double allPrise) {
        this.startSale = startSale;
        this.stepSale = stepSale;
        this.allPrise = allPrise;
        this.sale = startSale;
    }
    public double calcPrice(int amount) {
        if (sale > 0 && sale - stepSale >= 0) {
            double result = allPrise * amount * (1 - sale);
            sale -= stepSale;
            return result;
        } else if (sale > 0 && sale - stepSale < 0) {
            double result = allPrise * amount * (1 - sale);
            sale = 0.0;
            return result;
        } else {
        return allPrise * amount;
        }
    }
}
