package com.masglobalconsulting.model;

import java.time.Duration;
import java.time.LocalDate;

public class TimeHappyBirthday implements InteraceForHappyBirthday {
    private int yearPresent = 2023;
    private int monthPresent = 8;
    private int dayPresent = 14;

    public boolean timePastBirthday(int year, int month, int day) {
        LocalDate fechaIni = LocalDate.of(year,month,day);
        LocalDate fechaFin = LocalDate.of(yearPresent, monthPresent, dayPresent);

        Duration duration = Duration.between(fechaIni.atStartOfDay(), fechaFin.atStartOfDay());

        System.out.println("Dias transcurridos de tu cumpleaños: " + duration.toDays() + " dias");
        System.out.println("Horas transcurridos de tu cumpleaños: " + duration.toHours() + " horas");
        System.out.println("Minutos transcurridos de tu cumpleaños: " + duration.toMinutes() + " minutos");
        System.out.println("");

        return true;
    }

    public boolean timeLeftBrithday(int year, int month, int day){
        LocalDate fechaIn = LocalDate.of(year,month,day);
        LocalDate fechaFi = LocalDate.of(2024, 1, 13);

        Duration duration = Duration.between(fechaIn.atStartOfDay(), fechaFi.atStartOfDay());

        System.out.println("Dias que faltan para tu cumpleaños: " + duration.toDays() + " dias");
        System.out.println("Horas que faltan para tu cumpleaños: " + duration.toHours() + " horas");
        System.out.println("Minutos que faltan para tu cumpleaños: " + duration.toMinutes() + " minutos");

        return true;

    }
}
