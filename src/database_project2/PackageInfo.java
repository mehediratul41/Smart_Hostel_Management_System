/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

/**
 *
 * @author SARK
 */
public class PackageInfo {
    
    private int ac;
    private int nonAc;
    private int b;
    private int l;
    private int d;
    private int bl;
    private int bd;
    private int ld;
    private int bld;

    public PackageInfo() {
    }

    public PackageInfo(int ac, int nonAc, int b, int l, int d, int bl, int bd, int ld, int bld) {
        this.ac = ac;
        this.nonAc = nonAc;
        this.b = b;
        this.l = l;
        this.d = d;
        this.bl = bl;
        this.bd = bd;
        this.ld = ld;
        this.bld = bld;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getNonAc() {
        return nonAc;
    }

    public void setNonAc(int nonAc) {
        this.nonAc = nonAc;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getBl() {
        return bl;
    }

    public void setBl(int bl) {
        this.bl = bl;
    }

    public int getBd() {
        return bd;
    }

    public void setBd(int bd) {
        this.bd = bd;
    }

    public int getLd() {
        return ld;
    }

    public void setLd(int ld) {
        this.ld = ld;
    }

    public int getBld() {
        return bld;
    }

    public void setBld(int bld) {
        this.bld = bld;
    }
    
    
    
}
