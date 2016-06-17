/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Victor
 */
public enum Cursos {
  SI("Tarde"), ADS("manhã/noite"),
LOGISTICA("tarde/noite"),GE("manhã"),
GP("manhã/tarde");

private String periodo;
Cursos (String periodo){
    this.periodo = periodo;
}
}
