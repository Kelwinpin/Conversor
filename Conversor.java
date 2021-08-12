public class Conversor {
    private Dollar doll = new Dollar();
    private Euro euro = new Euro();

    public float converterEuro(float real){

        return real * euro.getVal();

    }

    public float converterdollar(float real){

        return real * doll.getVal();

    }
}
