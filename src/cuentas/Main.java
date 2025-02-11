package cuentas;

public class Main {

    public static void main(String[] args) {
        // Se cambia el nombre de miCuenta a cuenta1
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Llamada al nuevo método operativa_cuenta con un monto de prueba
        operativa_cuenta(cuenta1, 2300);
    }

    /**
     * Método que opera con la cuenta: consulta saldo, retira e ingresa dinero.
     *
     * @param cuenta1 Objeto de la cuenta con la que se va a operar.
     * @param cantidad Monto a retirar e ingresar (para pruebas).
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);
            System.out.println("Se ha retirado: " + cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("Ingreso realizado con éxito");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
