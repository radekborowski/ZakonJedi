public class R2D2 {
    int szybkoscporuszania;
    int wagawlasna;

    int mocRazeniaPradem;
    double szybkoscNaprawcza;

    public R2D2(int szybkoscporuszania, int wagawlasna, int mocRazeniaPradem, double szybkoscNaprawcza) {
        this.szybkoscporuszania = szybkoscporuszania;
        this.wagawlasna = wagawlasna;
        this.mocRazeniaPradem = mocRazeniaPradem;
        this.szybkoscNaprawcza = szybkoscNaprawcza;
    }

    @Override
    public String toString() {
        return "R2D2{" +
                "szybkoscporuszania=" + szybkoscporuszania +
                ", wagawlasna=" + wagawlasna +
                ", mocRazeniaPradem=" + mocRazeniaPradem +
                ", szybkoscNaprawcza=" + szybkoscNaprawcza +
                '}';
    }
}
