public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un circulo
        //pi *r2
        circleArea(y);

        //Area de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*PI*r3
        sphereVolume(y);

        System.out.println("Pesos a Dolares: " +  convertToDollar(200, "MNX"));

    }

    /**
     * Descripción: Función que calcula el area de un circulo.
     * @param r Valor del radio que se utiliza para el calculo.
     * @return Regresa el valor del area del circulo.
     * @author Ramiz Perez
     */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Función de calcula el area de una esfera.
     * @param r Valor del radio que se utilizara para el calculo.
     * @return Regresa el valor del area de la esfera.
     * @author Ramiz Perez
     */
    public static  double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Función que calcula el volumen de un esfera.
     * @param r Valor del radio que se utilizara para el calculo.
     * @return Regresa el valor del volumen de la esfera.
     * @author Ramiz Perez
     */
    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares.
     * @param quantity Cantidad de dinero.
     * @param currency Tipo de moneda: solo acepta MNX or COP.
     * @return quantity Devuelve la cantidad actualizada en Dolares.
     * @author Ramiz Perez
     */
    public static  double convertToDollar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MNX":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
