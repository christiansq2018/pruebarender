package com.lta.gestionempleados.controller;

import com.lta.gestionempleados.exception.ResourceNotFoundException;
import com.lta.gestionempleados.model.Empleado;
import com.lta.gestionempleados.repository.EmpleadoRepository;
import com.lta.gestionempleados.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController {

    @Autowired
    IEmpleadoService iEmpleadoService;

    //este metodo sirve para listar todos los empleados
    @GetMapping("/empleados")
    public List<Empleado> listarTodosLosEmpleados() {
        return iEmpleadoService.listarTodosLosEmpleados();
    }


    //este metodo sirve para guardar el empleado
    @PostMapping("/empleados")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
        return iEmpleadoService.guardarEmpleado(empleado);
    }

    //este metodo sirve para buscar un empleado
    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id){
        return ResponseEntity.ok(iEmpleadoService.obtenerEmpleadoPorId(id).getBody());
    }

    //este metodo sirve para actualizar empleado
    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id,@RequestBody Empleado detallesEmpleado){
        return ResponseEntity.ok(iEmpleadoService.actualizarEmpleado(id,detallesEmpleado).getBody());
    }

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarEmpleado(@PathVariable Long id){
        return ResponseEntity.ok(iEmpleadoService.eliminarEmpleado(id).getBody());
    }

}
