package com.nttdata.msbankmovements.services;

import com.nttdata.msbankmovements.entity.Movimiento;

import java.util.List;

public interface IMovimientoService {

    Movimiento save(Movimiento movimiento);

    Movimiento update(Movimiento movimiento);

    List<Movimiento> getListAll();

    Movimiento getById(Integer id);

    boolean delete(Integer id);

}