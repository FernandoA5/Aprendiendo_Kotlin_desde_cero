const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "?"

val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main(){
    println("Bola mágica, elige una respuesta")
    println("1. Realizar Pregunta")
    println("2. Revisar respuestas")
    println("3. Salir")

    val valorIngresado = readLine()

    when(valorIngresado){
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }
}
fun salir(){
    println("Adios")
}
fun mostrarError(){
    println("Pendejo, esa opción es invalida")
}
fun mostrarRespuestas(){
    println("Selecciona una opción")
    println("1. Todas")
    println("2. Afirmativas")
    println("3. Negativas")
    println("4. Dudosas")
    val opcionIngresada = readLine()
    when(opcionIngresada){
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(tipoRespuesta= RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(tipoRespuesta= RESPUESTA_NEGATIVA)
        "4" -> mostrarRespuestasPorTipo(tipoRespuesta= RESPUESTA_DUDOSA)
        else -> println("Respuesta Invalida")
    }
}
fun mostrarRespuestasPorTipo(tipoRespuesta: String ="todos"){
    //val imprimirRespuestas : (Map<String, String>) -> Unit = { respuestas -> respuestas.keys.forEach { respuesta -> println(respuesta) }}

    when(tipoRespuesta){
        "todos" -> respuestas.keys.forEach { respuesta -> println(respuesta)}
        /*RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA}
            .also {
                respuestasPositivas -> println(respuestasPositivas.keys)
            }
        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA}
            .also {
                respuestasNegativas -> println(respuestasNegativas.keys)
            }
        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA}
            .also{ 
                respuestasDudosas -> println(respuestasDudosas.keys)
            }*/
        else -> respuestas.filterValues {values -> values == tipoRespuesta}.also{
            respuesta -> println(respuesta.keys)
        }
    }
}
fun realizarPregunta(){
    println("¿Qué pregunta deseas realizar?")
    readLine()
    println("La respuesta es: ")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}