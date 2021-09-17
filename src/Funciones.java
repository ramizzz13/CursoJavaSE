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

        System.out.println("Pesos a Dolares: " +  converToDollar(200, "MNX"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static  double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    public static  double converToDollar(double quantity, String currency){
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
