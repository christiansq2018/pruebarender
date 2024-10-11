package com.lta.gestionempleados.service;

import com.lta.gestionempleados.model.Empleado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface IEmpleadoService {

    public List<Empleado> listarTodosLosEmpleados();

    public Empleado guardarEmpleado(Empleado empleado);

    public ResponseEntity<Empleado> obtenerEmpleadoPorId(Long id);

    public ResponseEntity<Empleado> actualizarEmpleado(Long id,Empleado detallesEmpleado);

    public ResponseEntity<Map<String,Boolean>> eliminarEmpleado(Long id);
}
