public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();

        int i = 1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println("...___...");
    }

    public  static boolean turnOnOffLight(){
        //Operador terniario
        isTurnOnLight = (isTurnOnLight)?false:true;

        /*if (isTurnOnLight){
            isTurnOnLight = false;
        } else {
            isTurnOnLight = true;
        }*/

        return  isTurnOnLight;
    }
}
