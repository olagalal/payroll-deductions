/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.ClaimCode;
import Database.Results;
import Database.TaxRate;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hodam
 */
public class Calculations {

    ClaimCode claimCode;
    TaxRate taxRate;
    Results res ;

    private String name = "";
    private String province = "";
    
    private int cc = 0;
    private int cp = 0 ;
    
    private int p = 0;
    private double i = 0;
    private double f = 0;
    private double f2 = 0;
    private double u1 = 0;
    private double hd = 0;
    private double f1 = 0;

    private double a = 0;

    private double r = 0;
    private double k = 0;
    private double k1 = 0;
    private double k2 = 0;
    private double k2q = 0;
    private double k3 = 0;
    private double k4 = 0;

    private double t3 = 0;

    private double t1 = 0;

    private double v = 0;
    private double kp = 0;
    private double k1p = 0;
    private double k2p = 0;
    private double k3p = 0;
    private double k4p = 0;

    private double t4 = 0;

    private double t2 = 0;

    private double t = 0;

    private double c = 0;
    private double ei = 0;
    
    private double tc = 0;
    private double tcp = 0;
    
    private double l = 0;
    
    private double v1 = 0;
    private double v2 = 0;
    private double s = 0;
    private double lcp = 0;

    private double cpp = 0 ;
    private double eip = 0 ;
    
    private double employerRrsp = 0;
    
    private double totalDeductions = 0;
    public Calculations() {
        try {
            taxRate = new TaxRate();
            claimCode = new ClaimCode();
            res = new Results();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getF2() {
        return f2;
    }

    public void setF2(double f2) {
        this.f2 = f2;
    }

    public double getU1() {
        return u1;
    }

    public void setU1(double u1) {
        this.u1 = u1;
    }

    public double getHd() {
        return hd;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    public double getF1() {
        return f1;
    }

    public void setF1(double f1) {
        this.f1 = f1;
    }

    public double getA() {
        return a;
    }

    public void setA() {
        a = (p * (i - f - f2 - u1)) - hd - f1;
    }

    public double getR() {
        return r;
    }

    public void setR() {
        try {
            r = taxRate.getV("federal", a);
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getK() {
        return k;
    }

    public void setK() {

        try {
            k = taxRate.getKP("federal", r);
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getEi() {
        return ei;
    }

    public void setEi(double ei) {
        this.ei = ei;
    }

    public double getK1() {
        return k1;
    }

    public void setK1() {
        try {
            k1 = claimCode.getK1("federal", cc);
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getK2() {
        return k2;
    }

    public void setK2() {
        k2 = (0.15 * p * ((c) + (ei)));
    }

    public double getK3() {
        return k3;
    }

    public void setK3(double k3) {
        this.k3 = k3;
    }

    public double getK4() {
        return k4;
    }

    public void setK4() {
        if ((0.15 * a) < (0.15 * 1195)) {
            k4 = 0.15 * a;
        } else {
            k4 = 0.15 * 1195;
        }
    }

    public double getT3() {
        return t3;
    }

    public void setT3() {
        t3 = (r * a) - k - k1 - k2 - k3 - k4;
    }

    public double getT1() {
        return t1;
    }

    public void setT1() {
        t1 = t3 - 750;
    }

    public double getV() {
        return v;
    }

    public void setV() {
        try {
            v = taxRate.getV(province, a);
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public double getKp() {
        return kp;
    }

    public void setKp() {
        try {
            kp = taxRate.getKP(province, v);
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getK1p() {
        return k1p;
    }

    public void setK1p() {
        try {
            k1p = claimCode.getK1(province, cc);
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getK2p() {
        return k2p;
    }

    public void setK2p() {
        try {
            k2p = (taxRate.getV(province, 1) * p * (c + ei));
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getK3p() {
        return k3p;
    }

    public void setK3p(double k3p) {
        this.k3p = k3p;
    }

    public double getK4p() {
        return k4p;
    }

    public void setK4p() {
        if (province == "yukon") {
            k4p = (0.064 * a < 0.064 * 1195) ? 0.064 * a : 0.064 * 1195;
        }
    }

    public double getT4() {
        return t4;
    }

    public void setT4() {
        t4 = (v * a) - kp - k1p - k2p - k3p - k4p;
        if (t4 < 0) {
            t4 = 0;
        }
    }

    public void setV1() {
        if (province == "prince_edward") {
            if (t4 > 12500) {
                v1 = .10 * (t4 - 12500);
            }
        } else if (province == "ontario") {
            if (t4 > 4638 && t4 <= 5936) {
                v1 = .20 * (t4 - 4638);
            } else if (t4 > 5936) {
                v1 = .20 * (t4 - 4638) + .36 * (t4 - 5936);
            }
        }
    }

    public void setV2() {
        if (province == "newfoundland") {
            if (a > 50000 && a <= 55000) {
                if (a - 50000 < 1000) {
                    v2 = .1 * (a - 50000);
                } else {
                    v2 = .1 * 1000;
                }
            } else if (a > 55000 && a <= 60000) {
                if (a - 55000 < 1000) {
                    v2 = 100 + .1 * (a - 55000);
                } else {
                    v2 = 100 + .1 * 1000;
                }
            } else if (a > 60000 && a <= 65000) {
                if (a - 60000 < 1000) {
                    v2 = 200 + .1 * (a - 60000);
                } else {
                    v2 = 200 + .1 * 1000;
                }
            } else if (a > 65000 && a <= 70000) {
                if (a - 65000 < 1000) {
                    v2 = 300 + .1 * (a - 65000);
                } else {
                    v2 = 300 + .1 * 1000;
                }
            } else if (a > 70000 && a <= 75000) {
                if (a - 70000 < 1000) {
                    v2 = 400 + .1 * (a - 70000);
                } else {
                    v2 = 400 + .1 * 1000;
                }
            } else if (a > 75000 && a <= 80000) {
                if (a - 75000 < 1000) {
                    v2 = 500 + .1 * (a - 75000);
                } else {
                    v2 = 500 + .1 * 1000;
                }
            } else if (a > 80000 && a <= 100000) {
                if (a - 80000 < 1000) {
                    v2 = 600 + .1 * (a - 80000);
                } else {
                    v2 = 600 + .1 * 1000;
                }
            } else if (a > 100000 && a <= 125000) {
                if (a - 100000 < 1000) {
                    v2 = 700 + .1 * (a - 100000);
                } else {
                    v2 = 700 + .1 * 1000;
                }
            } else if (a > 125000 && a <= 175000) {
                if (a - 1250000 < 1000) {
                    v2 = 800 + .1 * (a - 1250000);
                } else {
                    v2 = 800 + .1 * 1000;
                }
            } else if (a > 1750000 && a <= 250000) {
                if (a - 1750000 < 1000) {
                    v2 = 900 + .1 * (a - 1750000);
                } else {
                    v2 = 900 + .1 * 1000;
                }
            } else if (a > 250000 && a <= 300000) {
                if (a - 250000 < 1000) {
                    v2 = 1000 + .1 * (a - 250000);
                } else {
                    v2 = 1000 + .1 * 1000;
                }
            } else if (a > 300000 && a <= 350000) {
                if (a - 300000 < 1000) {
                    v2 = 1100 + .1 * (a - 300000);
                } else {
                    v2 = 1100 + .1 * 1000;
                }
            } else if (a > 350000 && a <= 400000) {
                if (a - 350000 < 1000) {
                    v2 = 1200 + .1 * (a - 350000);
                } else {
                    v2 = 1200 + .1 * 1000;
                }
            } else if (a > 400000 && a <= 450000) {
                if (a - 4000000 < 1000) {
                    v2 = 1300 + .1 * (a - 4000000);
                } else {
                    v2 = 1300 + .1 * 1000;
                }
            } else if (a > 450000 && a <= 500000) {
                if (a - 450000 < 1000) {
                    v2 = 1400 + .1 * (a - 450000);
                } else {
                    v2 = 1400 + .1 * 1000;
                }
            } else if (a > 500000 && a <= 550000) {
                if (a - 500000 < 1000) {
                    v2 = 1500 + .1 * (a - 500000);
                } else {
                    v2 = 1500 + .1 * 1000;
                }
            } else if (a > 550000 && a <= 600000) {
                if (a - 550000 < 1000) {
                    v2 = 1600 + .1 * (a - 550000);
                } else {
                    v2 = 1600 + .1 * 1000;
                }
            } else if (a > 600000) {
                if (a - 50000 < 1000) {
                    v2 = 1700 + .1 * (a - 50000);
                } else {
                    v2 = 1700 + .1 * 1000;
                }
            }
        } else if (province == "ontario") {
            if (a > 20000 && a <= 36000) {
                if (.06 * (a - 20000) < 300) {
                    v2 = .06 * (a - 20000);
                } else {
                    v2 = 300;
                }
            } else if (a > 36000 && a <= 48000) {
                if (300 + (.06 * (a - 36000)) < 450) {
                    v2 = 300 + (.06 * (a - 36000));
                } else {
                    v2 = 450;
                }
            } else if (a > 48000 && a <= 72000) {
                if (450 + (.25 * (a - 48000)) < 600) {
                    v2 = 450 + (.25 * (a - 48000));
                } else {
                    v2 = 600;
                }
            } else if (a > 72000 && a <= 200000) {
                if (600 + (.25 * (a - 72000)) < 750) {
                    v2 = 600 + (.25 * (a - 72000));
                } else {
                    v2 = 750;
                }
            } else if (a > 200000) {
                if (750 + (.25 * (a - 200000)) < 900) {
                    v2 = 750 + (.25 * (a - 200000));
                } else {
                    v2 = 900;
                }
            }
        }

    }

    public void setS() {
        if (province == "british_columbia") {
            if (a <= 20144) {
                if (t4 < 453) {
                    s = t4;
                } else {
                    s = 453;
                }
            } else if (a > 20144 && a <= 32868.72) {
                if (t4 < (453 - ((a - 20144) * .0365))) {
                    s = t4;
                } else {
                    s = 453 - ((a - 20144) * .0365);
                }
            }
        } else if (province == "ontario") {
            s = t4 + v1;
        }
    }

    public void setLcp() {
        if(province == "british_columbia" || province == "new_burnswick" || province == "newfoundland")
            lcp = 2000 ;
        else if (province == "manitoba")
            lcp = 1800 ;
        else if (province == "saskatchewan")
            lcp = 875 ;
        else if (province == "yukon")
            lcp = 1250 ;
    }

    public double getT2() {
        return t2;
    }

    public void setT2() {
        t2 = t4 + v1 + v2 - s - lcp;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getT() {
        return t;
    }

    public void setT() {
        t = ((t1 + t2) / p ) + l ;
    }

    public void setCpp() {
        cpp = (i+c) * .0495 ;
    }

    public void setEip() {
        eip = (i+ei) * .0166 ;
    }

    public void setEmployerRrsp(double employerRrsp) {
        this.employerRrsp = employerRrsp;
    }

    public double getEmployerRrsp() {
        return employerRrsp;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
    
    
    public void calculate(){
        System.out.println("1");
        setA();
        setR();
        setK();
        setK1();
        setK2();
        setK4();
        
        setT3();
        setT1();
        
        setV();
        setKp();
        setK1p();
        setK2p();
        setK4p();
        
        setT4();
        
        setV1();
        setV2();
        setS();
        setLcp();
        setT2();
        
        setT();
        setCpp();
        setEip();

        double totalIncome = i + employerRrsp ;
        double taxableIncome = (totalIncome-f-f2-u1) ;
        double netAmount = (totalIncome - t);
        
        totalDeductions = t + c + ei ;
        
        try {
            //res.insert(name , province, "ss", "ss", salary , i , taxableIncome , k1 , k2 , t , f + u1 , cpp, eip, totalDeductions , netAmount);
            res.insert(name , province , claimCode.searchCC(cc, "federal"), claimCode.searchCC(cp, province), i ,
                    totalIncome,taxableIncome, t1/p , t2/p , l , t1/p + t2/p , f+u1 , c , ei ,t ,netAmount);
        } catch (SQLException ex) {
            Logger.getLogger(Calculations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 
}
