public class Tuppel{
    int rad;
    int kolonne;


    public Tuppel(int r, int k){
        rad = r;
        kolonne = k;
    }
    @Override
    public String toString(){
        return "(" + rad + "," + kolonne + ")";
    }
}