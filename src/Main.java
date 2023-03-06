public class Main {

    //PUNTO A //

    /*public static void main(String[] args) {
        String cadena = "cadena de letras";
        char letra = 'a';
        int apariciones = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                apariciones++;
            }
        }
        System.out.println("la letra " + letra + " aparece " + apariciones + " veces en la cadena de letras");
    }

     */

    //PUNTO B //

   /* public static int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
        int[] resultado = new int[3];
        if (orden.equals("ascendente")) {
            if (num1 <= num2 && num1 <= num3) {
                resultado[0] = num1;
                if (num2 <= num3) {
                    resultado[1] = num2;
                    resultado[2] = num3;
                } else {
                    resultado[1] = num3;
                    resultado[2] = num2;
                }
            } else if (num2 <= num1 && num2 <= num3) {
                resultado[0] = num2;
                if (num1 <= num3) {
                    resultado[1] = num1;
                    resultado[2] = num3;
                } else {
                    resultado[1] = num3;
                    resultado[2] = num1;
                }
            } else {
                resultado[0] = num3;
                if (num1 <= num2) {
                    resultado[1] = num1;
                    resultado[2] = num2;
                } else {
                    resultado[1] = num2;
                    resultado[2] = num1;
                }
            }
        } else if (orden.equals("descendente")) {
            if (num1 >= num2 && num1 >= num3) {
                resultado[0] = num1;
                if (num2 >= num3) {
                    resultado[1] = num2;
                    resultado[2] = num3;
                } else {
                    resultado[1] = num3;
                    resultado[2] = num2;
                }
            } else if (num2 >= num1 && num2 >= num3) {
                resultado[0] = num2;
                if (num1 >= num3) {
                    resultado[1] = num1;
                    resultado[2] = num3;
                } else {
                    resultado[1] = num3;
                    resultado[2] = num1;
                }
            } else {
                resultado[0] = num3;
                if (num1 >= num2) {
                    resultado[1] = num1;
                    resultado[2] = num2;
                } else {
                    resultado[1] = num2;
                    resultado[2] = num1;
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] resultado = ordenarNumeros(3, 2, 1, "ascendente");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
}
 */

//PUNTO C //

   /* public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int X = 2;
        int suma = sumarX(numeros, X);
        System.out.println(suma);
    }

    public static int sumarX(int[] numeros, int X) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > X) {
                suma += numeros[i] +X;
            }
        }
        return suma;
    }
}
    */

    public static void main(String[] args) {
    String textoOriginal = "hola que tal";
    int desplazamiento = 2;
    String textoCifrado = CifradoCesar.codificar(textoOriginal, desplazamiento);
    System.out.println("Texto original: " + textoOriginal);
    System.out.println("Texto cifrado: " + textoCifrado);
    String textoDescifrado = CifradoCesar.decodificar(textoCifrado, desplazamiento);
    System.out.println("Texto descifrado: " + textoDescifrado);
}

//PUNTO NUMERO 2 //

    public class CifradoCesar {

        private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz ";

        public static String codificar(String texto, int desplazamiento) {
            StringBuilder cifrado = new StringBuilder();
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                int indice = ABECEDARIO.indexOf(caracter);
                if (indice == -1) {
                    cifrado.append(caracter);
                } else {
                    int indiceCifrado = (indice + desplazamiento) % ABECEDARIO.length();
                    cifrado.append(ABECEDARIO.charAt(indiceCifrado));
                }
            }
            return cifrado.toString();
        }

        public static String decodificar(String textoCifrado, int desplazamiento) {
            return codificar(textoCifrado, ABECEDARIO.length() - desplazamiento);
        }
    }
}