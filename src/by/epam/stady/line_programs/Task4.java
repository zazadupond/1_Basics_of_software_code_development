package by.epam.stady.line_programs;

/* Дано действительное число R вида nnn.ddd ( три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа
*/

public class Task4 {

    public static void main(String[] args) {

        Change.changeSequence(123.456);
    }
}

class Change {

    public static void changeSequence(double natural_number) {

        String string_number = "" + natural_number; // изменим тип переменной double на String через конкатенацию

        string_number = new StringBuffer(string_number).reverse().toString(); // создадим обьект StringBuffer спарамерами строки, перевернем,вызовем метод ля возврата строки.

        System.out.println(string_number );

    }
}
