package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria. Así pues, recoge los 
 * métodos tanto para crear una cuenta bancaria como para poder gestionarla
 * y realizar operaciones tales como ingresar/retirar dinero, entre otras.
 * @author Daniel Ferrer Lázaro
 * @version 1.0
 */

public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta bancaria | IBAN */
    private String cuenta;
    /** Saldo de la cuenta bancaria */
    private double saldo;
    /** Tipo de interés de la cuenta bancaria */
    private double tipoInterés;

    /** Método constructor por defecto de la cuenta bancaria */
    public CCuenta()
    {
    }

    /** 
     * Método constructor de la cuenta bancaria. 
     * Inicializa la cuenta bancaria.
     * @param nom titular de la cuenta bancaria
     * @param cue número de cuenta bancaria
     * @param sal saldo de la cuenta bancaria
     * @param tipo tipo de interés de la misma
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** 
     * Método getter para obtener el saldo actual de la cuenta bancaria.
     * @return saldo saldo actual de la cuenta bancaria
     */
    public double estado()
    {
        return saldo;
    }
    
    /** 
     * Método ingresar. Nos permite realizar la operación para ingresar 
     * una cantidad en la cuenta bancaria.
     * @param cantidad importe a ingresar en la cuenta
     * @throws Exception Aviso de error si se introduce una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(saldo + cantidad);
    }

    /**
     * Método retirar. Permite realizar la operación de retirada de dinero
     * de la cuenta bancaria siempre que haya saldo suficiente.
     * @param cantidad cantidad de dinero a retirar de la cuenta
     * @throws Exception si la cantidad a retirar es superior al saldo o si
     *         la cantidad a retirar es negativa o igual a cero
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(saldo - cantidad);
    }

    /**
     * Método getter para obtener el nombre del titular de la cuenta.
     * @return nombre nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el número de cuenta bancaria.
     * @return cuenta número de cuenta bancaria
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método getter para obtener el tipo de interés aplicado 
     * a la cuenta bancaria.
     * @return tipoInterés tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setter para establecer el nombre del titular de la cuenta.
     * @param nombre nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método setter para establecer el número de la cuenta bancaria.
     * @param cuenta número de cuenta bancaria
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método setter para actualizar el saldo de la cuenta bancaria.
     * @param saldo saldo de la cuenta bancaria
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método setter para fijar el tipo de interés de la cuenta bancaria.
     * @param tipoInterés tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

