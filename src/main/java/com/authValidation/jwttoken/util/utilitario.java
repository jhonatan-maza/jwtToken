package com.authValidation.jwttoken.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class utilitario {

    // Validar una dirección de correo electrónico usando el validador
    public static boolean emailValidator(String email)
    {
        // Obtener una instancia de la clase EmailValidator
        EmailValidator validator = EmailValidator.getInstance();

        // Devuelve verdadero si la dirección de correo electrónico es válida
        return validator.isValid(email);
    }

    public static boolean contrasenaSegura(String contrasena) {

        if (contrasena.length() > 6) { //una contraseña tiene más de 12 caracteres.
            boolean mayuscula = false;
            boolean numero = false;

            int i;
            char l;

            for (i = 0; i < contrasena.length(); i++) {
                l = contrasena.charAt(i);

                if (Character.isDigit(l)) {//mínimo un número.
                    numero = true;
                }
                if (Character.isUpperCase(l)) { // mínimo una letra mayúscula
                    mayuscula = true;
                }
            }

            return numero && mayuscula;
        } else {
            return false;
        }
    }

}
