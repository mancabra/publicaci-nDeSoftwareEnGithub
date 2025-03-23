/*
 * CLASES:
 * En java para nombrar clses se utiliza el PascalCase que consiste en escribir palabras compuestas
 * sin espacios, y con la primera letra de cada palabra en mayúscula.
 * No deberán de contener números o caracteres especiales.
 * En un archivo java se pueden definir múltiples clases, no hay un límite pero no es muy recomendable.
 */


/*
 * VARIABLES Y CONSTANTES:
 * En java para nombrar variables constantes y métodos se utiliza el camelCase que consiste en escribir palabras
 * compuestas sin espacios, y con la primera letra de cada palabra en mayúscula. Excepto la primera.
 */


public class Main {

    // EL CÓDIGO QUE PERTENECE A LA CLASE DEBERÁ DEFINIRSE DENTRO DE LAS LLAVES {} DE LA MISMA.

    /*
     * METODOS: Los métodos en java se componen de varios elementos que son los siguientes:
     *
     * MODIFICADOR DE ACCESO: Define el scope del método cambiando su alcance según el modificador utilizado.
     *   - public: Permite el acceso al método desde la clase o cualquier instacia sin importar su locación.
     *   - private: Solo permite que la clase acceda al método.
     *   - protected: Permite el acceso al método desdela misma clase, clases del mismo paquete y clases que hereden
     *     de ella sin importar su locación.
     *
     * TIPO DE VALOR DE RETORNO: Indica que el método retornara un objeto del tipo indicado; ya sea un objeto de alguna
     * clase nativa de java o que nosotros definamos, elemntos primitivos.
     *
     * NOTA: De no devolver nada el método deberá de llevar la palabra reservada void que indica que no tiene valor de
     * retorno, mientras que si se coloca un tipo de retorno el metodo debera terminar con la palabra reservada return
     * y el valor a retornar.
     *
     * NOMBRE: Todo método que definamos deberá llevar un nombre pues es con este atributo con el que haremos uso de el.
     *
     * PARÁMETROS: Son los elementos que se encuntran en dentro de los paréntesis de nuestro método, cada uno deberá ir
     * ir definido de la siguinete forma:
     *          TipoDelObjeto nombre,
     */

    public static void main(String[] args) {

        // TODO EL CÓDIGO DE UN MÉTODO CLASE DEBERÁ DEFINIRSE DENTRO DE LAS LLAVES {} DEL MISMO.
        // EN UNA APLICACIÓN JAVA EL MÉTODO MAIN SIEMPRE INICIARÁ LA EJECUCIÓN.
        // LA CLASE PRINCIPAL SERÁ LA QUE CONTENGA EL MÉTODO MAIN

        System.out.printf("Hello and welcome!");

    }
}
