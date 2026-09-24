class Solution {
    public double[] convertTemperature(double celsius) {
        double CtoK = celsius + 273.15;
        double KtoF = celsius*1.80 + 32.00;
        return new double [] {CtoK,KtoF} ;
    }
}
