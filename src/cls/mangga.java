/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls;

/**
 *
 * @author Hades
 */
public class mangga {
    private String mode;
    private double h;
    private double s;
    private double v;
    private double brix;
    private String kategori;
    private double SquareDistance;

    public mangga() {
    }

    public mangga(String mode, double h, double s, double v, double brix, String kategori, double SquareDistance) {
        this.mode = mode;
        this.h = h;
        this.s = s;
        this.v = v;
        this.brix = brix;
        this.kategori = kategori;
        this.SquareDistance = SquareDistance;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getBrix() {
        return brix;
    }

    public void setBrix(double brix) {
        this.brix = brix;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getSquareDistance() {
        return SquareDistance;
    }

    public void setSquareDistance(double SquareDistance) {
        this.SquareDistance = SquareDistance;
    }

    @Override
    public String toString() {
        return "mangga{" + "mode=" + mode + ", h=" + h + ", s=" + s + ", v=" + v + ", brix=" + brix + ", kategori=" + kategori + '}';
    }
    
    
}
