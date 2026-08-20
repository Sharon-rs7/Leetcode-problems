class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin=celsius+273.15;
        double Fahrenhit=celsius*1.80+32;
        return new double[]{Kelvin,Fahrenhit};
    }
}