package com.teamUllanos.proyecto.entities;

import java.util.ArrayList;

//Esta clase muestra una lista general de todos los empleados existentes
public class ListEmployee {
    private ArrayList<Employee> empleados;

    //Constructor
    public ListEmployee(){
        empleados = new ArrayList<Employee>();
    }


    //Obtener empleados
    public ArrayList<Employee> getAll(){
        return empleados;
    }

    //Buscar empleados
    public Employee findEmpleado(long id){
        for (Employee empleado: empleados){
            if (empleado.getId() == id){
                return empleado;
            }
        }
        return  null;
    }

    //Agregar empleado
    public boolean addEmpleado(Employee empleado){
        if (findEmpleado(empleado.getId()) == null){
            empleados.add(empleado);
            return true;
        }

        return false;
    }

    //Eliminar empleados
    public Employee deleteEmpleado(Employee empleado){
        if (empleados.contains(empleado)){
            empleados.remove(empleado);
            return empleado;
        }

        return null;
    }

    //Actualizar empleados
    public Employee updateEmpleado(Employee empleado){
        Employee auxEmpleado = findEmpleado(empleado.getId());
        if (auxEmpleado != null){
            empleados.set( empleados.indexOf(auxEmpleado),empleado);
            return empleados.get(empleados.indexOf(empleado));
        }

        return null;
    }
}
