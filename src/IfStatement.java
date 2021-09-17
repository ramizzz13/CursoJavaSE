public class IfStatement {
    public static void main(String[] args) {
        boolean isBluethoothEnabled = false;
        int fileSended = 3;

        if (isBluethoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            fileSended--;
            System.out.println("Enciende tu Bluethooth para iniciar transferencia");
        }

        System.out.println(isBluethoothEnabled);
        System.out.println(fileSended);
    }
}
