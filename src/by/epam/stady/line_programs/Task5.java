package by.epam.stady.line_programs;

/* Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме : HHч MMмин SSс
*/

public class Task5 {
    public static void main(String[] args) {
       TimeFormat.changeTimeFormat(3662);

    }
}

class TimeFormat {

    public static void changeTimeFormat(int sec) {
        int hh = sec/3600;
        int mm = (sec - (hh * 3600))/60;
        int ss = sec - hh * 3600 - mm * 60;
        System.out.printf(" %02dч %02dмин %02dс ",hh ,mm ,ss );

    }
}
