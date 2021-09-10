public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary = salary + 200;
        System.out.println("Salario mas bono: " + salary);

        //pension: $50 descuento
        salary = salary -50;
        System.out.println("Salario menos pension: " + salary);

        //2 horas extra $30 c/u
        //comida: $45
        salary = salary + (30*2) - 45;
        System.out.println("Salario mas horas extras y menos comidas: " + salary);

        //Acualizando cadenas de texto
        String employeeName = "Ramiz Perez";
        employeeName = employeeName + " Ordoñez";
        System.out.println("Nombre del empleado: " + employeeName);


    }
}
