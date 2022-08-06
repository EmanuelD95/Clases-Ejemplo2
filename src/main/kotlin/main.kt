/**
 * TAREA-2:
 * Crear una clase "Cristiano" con atributos:
 * nombre
 * apellido
 * edad espiritual
 * se discipula
 *
 * Y con funciones:
 * mostrar nombre completo
 * mostrar apellido con prefijo ("Hno.", "Ps.")
 * mostrar "¡Es maduro en la fe!" si su edad espiritual es mayor o igual a 5
 * mostrar "$nombre está creciendo espiritualmente" si se discipula,
 * sino mostrar "$nombre necesita disciplina"
 * actualizar edad espiritual (Posteriormente imprimir si es maduro en la fe)
 *
 */
/**
 * TAREA-2:
 * Crear una clase "Cristiano" con atributos:
 * nombre
 * apellido
 * edad espiritual
 * se discipula
 *
 * Y con funciones:
 * mostrar nombre completo
 * mostrar apellido con prefijo ("Hno.", "Ps.")
 * mostrar "¡Es maduro en la fe!" si su edad espiritual es mayor o igual a 5
 * mostrar "$nombre está creciendo espiritualmente" si se discipula,
 * sino mostrar "$nombre necesita disciplina"
 * actualizar edad espiritual (Posteriormente imprimir si es maduro en la fe)
 *
 * NOTA: 13
 *
 */
fun main() {
    val mienbroDeLaIglesia = Cristiano()
    mienbroDeLaIglesia.nombre = "Juan"
    mienbroDeLaIglesia.apellido = "Robles"
    mienbroDeLaIglesia.edadEspiritual = 1
    mienbroDeLaIglesia.seDiscipula = false
    mienbroDeLaIglesia.mostrarNombreCompleto()
    mienbroDeLaIglesia.mostrarConPrefijo("Hno.")
    mienbroDeLaIglesia.mostrarMadurezPorAnos()
    mienbroDeLaIglesia.mostrarSiSeDiscipula()
    mienbroDeLaIglesia.actualizarEdad(6)
    mienbroDeLaIglesia.mostrarMadurezPorAnos()

    println("---------------")

    val mienbroDeLaIglesia2 = Cristiano()
    mienbroDeLaIglesia2.nombre = "Marcos"
    mienbroDeLaIglesia2.apellido = "Alfaro"
    mienbroDeLaIglesia2.edadEspiritual = 5
    mienbroDeLaIglesia2.seDiscipula = true
    mienbroDeLaIglesia2.mostrarNombreCompleto()
    mienbroDeLaIglesia2.mostrarConPrefijo("Ps.")
    mienbroDeLaIglesia2.mostrarMadurezPorAnos()
    mienbroDeLaIglesia2.mostrarSiSeDiscipula()
    mienbroDeLaIglesia2.actualizarEdad(7)
    mienbroDeLaIglesia2.mostrarMadurezPorAnos()
}
