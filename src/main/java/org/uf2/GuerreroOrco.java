package org.uf2;
/*
 Guerrero Orco:
 ○ Atributos:
 ■ Nombre
 ■ Fuerza: Entre 6 y 8 (valor aleatorio).
 ■ Defensa: Entre 4 y 7 (valor aleatorio).
■ Agilidad: Entre 3 y 6 (valor aleatorio).
 ■ Puntos de Vida (PV): Entre 80 y 100 (valor aleatorio).
 ■ Combates ganados: Inicialmente 0.
 ■ Combates perdidos: Inicialmente 0.
 ■ Puntos de batalla: Inicialmente 100*/

import java.io.Serializable;

public class GuerreroOrco extends Heroe implements Serializable {

    @Override
    public String toString() {
        return "GuerreroOrco{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", defensa=" + defensa +
                ", agilidad=" + agilidad +
                ", inteligencia=" + inteligencia +
                ", resistencia=" + resistencia +
                ", puntosVida=" + puntosVida +
                ", combatesGanados=" + combatesGanados +
                ", combatesPerdidos=" + combatesPerdidos +
                ", puntosBatalla=" + puntosBatalla +
                '}';
    }

    public GuerreroOrco(String nombre) {

        super(nombre,
                fuerzaHeroe(6, 3),
                defensaHeroe(4, 4),
                agilidadHeroe(3, 4),
                puntosVidaHeroe(80, 21),
                0,
                0,
                0,
                0

        );

    }
}
