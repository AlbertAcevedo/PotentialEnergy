/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potentialenergy;

/**
 *
 * @author Alberto pc
 */
public class Particle {
    private final double charge;
    public int x;
    public int y;

    public Particle(double charge, int x, int y) {
        this.charge = charge;
        this.x = x;
        this.y = y;
    }

    public double getCharge() {
        return charge;
    }
    
    public double distance(Particle p){
        int distx = this.x - p.x;
        int disty = this.y - p.y;
        double sqnorm = Math.pow(distx, 2)+Math.pow(disty, 2);
        return Math.sqrt(sqnorm);
    }
    
}
