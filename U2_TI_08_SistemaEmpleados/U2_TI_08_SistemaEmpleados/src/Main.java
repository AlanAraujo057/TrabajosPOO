//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("1", "Gadiel", (double)15000.0F, "Seguro médico");
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("2", "Alan", (double)1200.0F, 28);
        System.out.println("ID: " + empleadoTiempoCompleto.getId());
        System.out.println("Nombre: " + empleadoTiempoCompleto.getNombre());
        System.out.println("Salario: " + empleadoTiempoCompleto.calcularSalario());
        System.out.println("Beneficios: " + empleadoTiempoCompleto.getBeneficios());
        System.out.println("-------------------------------------");
        System.out.println("ID: " + empleadoPorHoras.getId());
        System.out.println("Nombre: " + empleadoPorHoras.getNombre());
        System.out.println("Horas trabajadas: " + empleadoPorHoras.getHorasTrabajadas());
        System.out.println("Salario: " + empleadoPorHoras.calcularSalario());
    }
}