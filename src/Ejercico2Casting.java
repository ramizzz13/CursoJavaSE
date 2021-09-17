public class Ejercico2Casting {
    /*Ejercicio 2

    Usando los dos tipos de casting que aprendiste (implícito y explícito),
    resuelve los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.

    char c = ‘z’; conviertelo a int
    int i = 250; conviertelo a long y luego de long a short
    double d = 301.067; conviertelo a long
    int i = 100; súmale 5000.66 y conviertelo a float
    int i = 737; multiplícalo por 100 y conviertelo a byte
    double d = 298.638; divídelo entre 25 y conviertelo a long*/

    public static void main(String[] args) {
        char c = 'z';
        int cI = c;
        System.out.println("Al convertir el valor de 'c=" + c + "', de tipo char a tipo int, ahora es: " + cI + ". Esto es un casting implicito con exactitud.");

        int i = 250;
        long iL = i;
        short iS = (short) iL;
        System.out.println("Al convertir el valor de 'i=" + i + "', de tipo int a tipo long, ahora es: " + iL + ". Esto es un casting implicito con exactitud.");
        System.out.println("Al convertir el valor de 'iL=" + iL + "', de tipo long a tipo short, ahora es: " + iS + ". Esto es un casting explicito con estimacion.");

        double d = 301.067;
        long dL = (long) d;
        System.out.println("Al convertir el valor de 'd=" + d + "', de tipo double a tipo long, ahora es: " + dL + ". Esto es un casting explicito con estimacion.");

        int i2 = 100;
        float iF = (float) (i2 + 5000.66);
        System.out.println("Al convertir el valor de 'i2=" + i2 + "', de tipo int a tipo float, ahora es: " + iF + ". Esto es un casting explicito con exactitud.");

        int i3 = 737;
        byte iB = (byte) (i3 * 100);
        System.out.println("Al convertir el valor de 'i3=" + i3 + "', de tipo int a tipo byte, ahora es: " + iB + ". Esto es un casting explicito con estimacion.");

        double d2 = 298.638;
        long dL2 = (long) (d2 / 25);
        System.out.println("Al convertir el valor de 'd2=" + d2 + "', de tipo double a tipo long, ahora es: " + dL2 + ". Esto es un casting explicito con estimacion.");
    }
}
