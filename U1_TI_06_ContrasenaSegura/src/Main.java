import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        UsuarioSeguro usuario = new UsuarioSeguro();

        System.out.println("Ingresa el nombre de usuario");
        usuario.setNombreUsuario(entrada.nextLine());

        System.out.println("Ingresa la contraseña");
        usuario.setPassword(entrada.nextLine());

        System.out.println("Vuelve a ingresar la contraseña para acceder");
        usuario.autenticar(entrada.nextLine());
    }
}
