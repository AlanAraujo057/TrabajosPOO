public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario.equals("")) {
            this.nombreUsuario = nombreUsuario;
        }
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
            return;
        }

        boolean mayuscula=false;
        boolean minuscula=false;
        boolean digito=false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                mayuscula = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                minuscula = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                digito = true;
            }
        }

        if (!mayuscula) {
            System.out.println("Debe contener una mayúscula");
        }
        if (!minuscula) {
            System.out.println("Debe contener una minúscula");
        }
        if (!digito) {
            System.out.println("Debe contener un dígito");
        }

        if (mayuscula && minuscula && digito) {
            this.password = password;
        }
    }

    public boolean autenticar(String intentPassword) {
        if (intentPassword.equals(password)) {
            System.out.println("Acceso concedido");
            return true;
        } else {
            System.out.println("Acceso denegado");
            return false;
        }
    }
}
