package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria con operaciones básicas.
 */
public class CCuenta {

    // Atributos privados (encapsulados)
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nom   Nombre del titular de la cuenta.
     * @param cue   Número de cuenta.
     * @param sal   Saldo inicial de la cuenta.
     * @param tipo  Tipo de interés asociado.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }

    // Métodos getters y setters (Encapsulación)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInterés;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInterés = tipoInteres;
    }
}

