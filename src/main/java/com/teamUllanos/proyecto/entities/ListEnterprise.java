package com.teamUllanos.proyecto.entities;

import java.util.ArrayList;
import java.util.List;

//Esta clase muestra una lista general de todos las empresas existentes
public class ListEnterprise {
    private List<Enterprise> empresas;

    //Constructor
    public ListEnterprise(){
        empresas = new ArrayList<Enterprise>();
    }


    //Obtener lista de empresas
    public  List<Enterprise> getEnterprises(){
        return empresas;
    }


    //Buscar empresa por nombre
    public Enterprise findEnterprise(String nombre){
        for (Enterprise enterprise: empresas){
            if (enterprise.getName() == nombre){
                return enterprise;
            }
        }
        return  null;
    }

    //Agregar empresa
    public boolean addEnterprise(Enterprise enterprise){
        if (findEnterprise(enterprise.getName()) == null){
            empresas.add(enterprise);
            return true;
        }

        return false;
    }

    //Eliminar empresas
    public Enterprise deleteEnterprise(Enterprise enterprise){
        if (empresas.contains(enterprise)){
            empresas.remove(enterprise);
            return enterprise;
        }

        return null;
    }

    //Actualizar empresa
    public Enterprise updateEnterprise(Enterprise enterprise){
        Enterprise auxEnterprise = findEnterprise(enterprise.getName());
        if (auxEnterprise != null){
            empresas.set( empresas.indexOf(auxEnterprise),enterprise);
            return empresas.get(empresas.indexOf(enterprise));
        }

        return null;
    }
}
