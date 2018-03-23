/*
 * Gestorinc S.A. Sistema: Gestor G5 Creado: 4/8/2017 Los contenidos de este archivo son propiedad intelectual de Gestorinc S.A. y
 * se encuentran protegidos por la licencia: "GESTOR FIDUCIA/FONDOS G5". Usted puede encontrar una copia de esta licencia en:
 * http://www.gestorinc.com Copyright 2008-2017 Gestorinc S.A. Todos los derechos reservados.
 */
package com.gestor.glabs.mongopersistence;

import java.util.Date;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;

/**
 * @author Gestorinc S.A.
 * @version $Revision: $
 */
@Entity(noClassnameStored = true)
public class Cliente extends BaseEntity {
    @Indexed(options = @IndexOptions(unique = true))
    private String cedula;
    private String nombre;
    private String apellido;
    private String nombreCompleto;
    private String genero;
    private Date fechaNacimiento;
    private String mail;

    /**
     * Obtiene el atributo de clase: "cedula"
     * @return el/la cedula
     */
    public String getCedula() {
        return this.cedula;
    }

    /**
     * Asigna valor al atributo de clase: "cedula"
     * @param cedula el/la cedula para asignar el valor
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene el atributo de clase: "nombre"
     * @return el/la nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Asigna valor al atributo de clase: "nombre"
     * @param nombre el/la nombre para asignar el valor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el atributo de clase: "apellido"
     * @return el/la apellido
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Asigna valor al atributo de clase: "apellido"
     * @param apellido el/la apellido para asignar el valor
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el atributo de clase: "nombreCompleto"
     * @return el/la nombreCompleto
     */
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    /**
     * Asigna valor al atributo de clase: "nombreCompleto"
     * @param nombreCompleto el/la nombreCompleto para asignar el valor
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Obtiene el atributo de clase: "genero"
     * @return el/la genero
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * Asigna valor al atributo de clase: "genero"
     * @param genero el/la genero para asignar el valor
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene el atributo de clase: "fechaNacimiento"
     * @return el/la fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * Asigna valor al atributo de clase: "fechaNacimiento"
     * @param fechaNacimiento el/la fechaNacimiento para asignar el valor
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene el atributo de clase: "mail"
     * @return el/la mail
     */
    public String getMail() {
        return this.mail;
    }

    /**
     * Asigna valor al atributo de clase: "mail"
     * @param mail el/la mail para asignar el valor
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.toString();
    }
}
