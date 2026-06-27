class Solution {
    public double angleClock(int hour, int minutes) {
        double m_angle= minutes*6;
        double h_angle= (hour%12)*30+(0.5*minutes);
        double diff= Math.abs(h_angle-m_angle);

        return Math.min(diff,360-diff);

    }
}