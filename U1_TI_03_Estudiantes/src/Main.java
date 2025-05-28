public class Main {
    public static void main(String[] args) {
        Model.Estudiante estudiante1 = new Model.Estudiante();
        Model.Estudiante estudiante2 = new Model.Estudiante();
        Model.Estudiante estudiante3 = new Model.Estudiante();
        Model.Estudiante estudiante4 = new Model.Estudiante();
        Model.Estudiante estudiante5 = new Model.Estudiante();

        estudiante1.setNombre("Alan");
        estudiante1.setMatricula("2024057");
        estudiante1.setNota(0, 80);
        estudiante1.setNota(1, 85);
        estudiante1.setNota(2, 88);
        estudiante1.setNota(3, 90);
        estudiante1.setNota(4, 79);

        estudiante2.setNombre("Brayan");
        estudiante2.setMatricula("2024031");
        estudiante2.setNota(0, 70);
        estudiante2.setNota(1, 70);
        estudiante2.setNota(2, 88);
        estudiante2.setNota(3, 86);
        estudiante2.setNota(4, 90);

        estudiante3.setNombre("Osvaldo");
        estudiante3.setMatricula("2024051");
        estudiante3.setNota(0, 90);
        estudiante3.setNota(1, 90);
        estudiante3.setNota(2, 88);
        estudiante3.setNota(3, 95);
        estudiante3.setNota(4, 98);

        estudiante4.setNombre("Nicho");
        estudiante4.setMatricula("2024050");
        estudiante4.setNota(0, 80);
        estudiante4.setNota(1, 90);
        estudiante4.setNota(2, 78);
        estudiante4.setNota(3, 85);
        estudiante4.setNota(4, 85);

        estudiante5.setNombre("Jared");
        estudiante5.setMatricula("2024034");
        estudiante5.setNota(0, 65);
        estudiante5.setNota(1, 75);
        estudiante5.setNota(2, 68);
        estudiante5.setNota(3, 73);
        estudiante5.setNota(4, 55);

        System.out.println("Estudiante 1: " + estudiante1.getNombre());
        System.out.println("Matrícula: " + estudiante1.getMatricula());
        System.out.println("Promedio: " + estudiante1.calcularPromedio());
        System.out.println("Aprobado: " + estudiante1.aprobado());

        System.out.println("Estudiante 2: " + estudiante2.getNombre());
        System.out.println("Matrícula: " + estudiante2.getMatricula());
        System.out.println("Promedio: " + estudiante2.calcularPromedio());
        System.out.println("Aprobado: " + estudiante2.aprobado());

        System.out.println("Estudiante 3: " + estudiante3.getNombre());
        System.out.println("Matrícula: " + estudiante3.getMatricula());
        System.out.println("Promedio: " + estudiante3.calcularPromedio());
        System.out.println("Aprobado: " + estudiante3.aprobado());

        System.out.println("Estudiante 4: " + estudiante4.getNombre());
        System.out.println("Matrícula: " + estudiante4.getMatricula());
        System.out.println("Promedio: " + estudiante4.calcularPromedio());
        System.out.println("Aprobado: " + estudiante4.aprobado() );

        System.out.println("Estudiante 5: " + estudiante5.getNombre());
        System.out.println("Matrícula: " + estudiante5.getMatricula());
        System.out.println("Promedio: " + estudiante5.calcularPromedio());
        System.out.println("Aprobado: " + estudiante5.aprobado());
    }
}