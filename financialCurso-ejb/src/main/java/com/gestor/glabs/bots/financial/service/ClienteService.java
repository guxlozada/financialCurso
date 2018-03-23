/*
 * To change this license header, choose License Headers in Project Properties. To change this template file, choose Tools |
 * Templates and open the template in the editor.
 */
package com.gestor.glabs.bots.financial.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.gestor.glabs.mongopersistence.Cliente;
import com.gestor.glabs.mongopersistence.MongoPersistence;

/**
 * @author Hendrix
 */
@Stateless
@LocalBean
@Path("")
public class ClienteService {
    @Inject
    MongoPersistence mp;

    @GET
    @Produces
    public Cliente findbyCedula(String cedula) {
        Logger.global.log(Level.INFO, "Iniciando findbyCedula cedula: " + cedula);
        Cliente res = this.mp.context().createQuery(Cliente.class).field("cedula").equal(cedula).get();
        Logger.global.log(Level.INFO, "El cliente es: " + res.getNombreCompleto());
        return res;
    }

    public void createCliente(Cliente cliente) {
        try {
            Logger.global.log(Level.INFO, "Iniciando createCliente cedula: " + cliente.getCedula());
            cliente.setNombreCompleto(cliente.getApellido() + "/" + cliente.getNombre());
            this.mp.context().save(cliente);
        } catch (Exception e) {
            throw new RuntimeException("Ocurrio un error al crear:" + e.getMessage());
        }
    }

    public void updateteCliente(Cliente cliente) {
        try {
            Logger.global.log(Level.INFO, "Iniciando updateteCliente cedula: " + cliente.getCedula());
            Cliente clienteTmp = this.findbyCedula(cliente.getCedula());
            UpdateOperations upd =
                    this.mp.context()
                            .createUpdateOperations(Cliente.class)
                            .set("nombre", cliente.getNombre())
                            .set("apellido", cliente.getApellido())
                            .set("nombreCompleto", cliente.getApellido() + " " + cliente.getNombre());
            this.mp.context().update(clienteTmp, upd);
        } catch (Exception e) {
            throw new RuntimeException("Ocurrio un error al actualizar:" + e.getMessage());
        }
    }

    public void deleteCliente(String cedula) {
        try {
            Logger.global.log(Level.INFO, "Iniciando deleteCliente cedula: " + cedula);
            Query<Cliente> qry = this.mp.context().createQuery(Cliente.class).field("cedula").equal(cedula);
            this.mp.context().delete(qry);
        } catch (Exception e) {
            throw new RuntimeException("Ocurrio un error al delete:" + e.getMessage());
        }
    }
}
