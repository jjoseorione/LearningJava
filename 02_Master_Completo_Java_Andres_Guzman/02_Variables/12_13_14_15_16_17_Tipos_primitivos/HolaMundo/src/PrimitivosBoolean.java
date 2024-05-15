public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = false;
        boolean datoLogico1 = Boolean.TRUE;
        boolean datoLogico2 = Boolean.FALSE;
        System.out.println(datoLogico + " " + datoLogico1 + " " + datoLogico2);

        double d = 98765.43e-3;  //98.76543
        float f = 1.2345e-2f;     //0.012345

        datoLogico = (d > f);
        System.out.println("datoLogico = " + datoLogico);


    }
}
