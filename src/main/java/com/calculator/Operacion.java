package com.calculator;

public class Operacion {
  private String tipo;
  private Numero numero1;
  private Numero numero2;

  public Operacion(String tipo, Numero numero1, Numero numero2) {
      this.tipo = tipo;
      this.numero1 = numero1;
      this.numero2 = numero2;
  }

  public String getTipo() {
      return tipo;
  }

  public Numero getNumero1() {
      return numero1;
  }

  public Numero getNumero2() {
      return numero2;
  }
}