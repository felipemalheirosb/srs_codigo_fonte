package com.basis.srs.rest;

import com.basis.srs.dominio.Reserva;
import com.basis.srs.repositorio.ReservaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequiredArgsConstructor
public class ReservaRecursos {

    private ReservaRepositorio repositorio;

    @GetMapping("/{id}")
    public ResponseEntity<Reserva> listarTodos(){
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Reserva>> pegarReservaPorId(@PathVariable Integer id){
        return null;

    }

    @PostMapping
    public ResponseEntity<Reserva> cadastrarReserva(@RequestBody Reserva reserva){
        return null;

    }

    @PutMapping
    public ResponseEntity<Reserva> alterarReserva(@RequestBody Reserva reserva){
        return null;

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Reserva>  deletarReserva(@PathVariable Reserva reserva ){
        return null;

    }







}
