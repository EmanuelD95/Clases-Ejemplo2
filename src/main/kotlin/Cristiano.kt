class Cristiano {
    var nombre: String = ""
    var apellido: String = ""
    var edadEspiritual: Int = 0
    var seDiscipula: Boolean = false

    fun mostrarNombreCompleto() {
        println("$nombre $apellido")
    }

    fun mostrarConPrefijo(prefijo: String) {
        println("$prefijo $apellido")
    }

    fun mostrarMadurezPorAnos() {
        if (edadEspiritual >= 5)
            println("Es maduro en la fe")
    }

    fun mostrarSiSeDiscipula() {
        if (seDiscipula)
            println("$nombre esta creciendo espiritualmente")
        else ("$nombre necesita disciplina")
    }

    fun actualizarEdad(nuevaEdad: Int) {
        edadEspiritual = nuevaEdad
    }
}