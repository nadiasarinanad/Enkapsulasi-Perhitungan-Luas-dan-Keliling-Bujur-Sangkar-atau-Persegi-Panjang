
public class BangunDatar {
    int p; //panjang
    int l; //lebar
    int s; //sisi
    //konstruktor untuk persegi panjang
    
    BangunDatar(int p, int l) {
        this.p = p;
        this.l = l;
    }
    
    // Konstruktor untuk BujurSangkar
    BangunDatar(int s) {
        this.s = s;
    }
    
    void setPL(int p, int l) {
        this.p = p;
        this.l = l;
    }
    
    void setS(int s){
        this.s = s;
    }
    
    int getP(){
        return p;
    }
    
    int getL(){
        return l;
    }
    
    int getS(){
        return s;
    }
}
