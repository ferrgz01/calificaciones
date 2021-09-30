public class Actividad6 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Alfredo";
        Double promedio = promedio(alumno.calificacion);
        String calificacion = calificacion(promedio);
        imprimirCalificacion(alumno, promedio, calificacion);

    }

    public static Double promedio(Double[] calificacion) {
        double suma=0;
        Double promedio;
        /*código para calcular el promedio*/
        for (int i=0;i<5;i++){
            suma+=calificacion[i];
        }
        promedio=suma/5;
        return promedio;
    }

    public static String calificacion(Double promedio) {
        String calificacion = "";
        if (promedio <= 50) {
            calificacion = "F";
        }
        if (promedio >= 51 && promedio <= 60) {
            calificacion = "E";
        }
        if (promedio >= 61 && promedio <= 70) {
            calificacion = "D";
        }
        if (promedio >= 71 && promedio <= 80) {
            calificacion = "C";
        }
        if (promedio >= 81 && promedio <= 90){
            calificacion = "B";
        }
        if (promedio >= 91 && promedio <= 100) {
            calificacion = "A";
        }
        /*completar este código */
        return calificacion;
    }

    public static void imprimirCalificacion(Alumno alumno, Double promedio, String calificacion) {
        System.out.println("Nombre del estudiante: " + alumno.nombre);
        /*aqui debe de ir un for para imprimir las calificaciones*/
        for(int i=0;i<5;i++){
            System.out.println("Calificación "+(i+1)+": "+alumno.calificacion[i]);
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}

