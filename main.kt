const val PI = 3.14159265
fun main()
{
    ciclo_for()
}
fun ciclo_for(){
    val listaCosas = listOf("Telefono", "Hamburguesa", "Dinero", "Esta");
    for (cosa in listaCosas){
        println("La cosa aquí es: $cosa")
    }
    println("-----------------------")
    listaCosas.forEach {cosa -> println("En la mano tienes: $cosa")}
    println("-----------------------")
    val caracteresCosas = listaCosas.map {cosa -> cosa.length}
    println(caracteresCosas)
    println("-----------------------")
    val listaFiltrada = caracteresCosas.filter {cosas -> caracteresCosas > 5}
    println(listaFiltrada)
    
}
fun while_doWhile(){
    var contador =38
    while(contador > 0){
        println("Contador: ${contador}")
        contador--
    }
    do{
        val numero_aleatorio=(0..100).random()
        println("Número aleatorio: ${numero_aleatorio}")
    }while(numero_aleatorio > 50)
}
fun introduccion(){
    //INTRODUCCIÖN
    var variable_mutable: Int= 15
    val variable_inmutable: Int = 14
    //TIPOS DE DATOS
    val booleano = true
    val numeroLong = 3L
    val doble: Double = 2.7182
    val flotante = 1.2f
}
fun condicionales(){
    //CONDICIONALES
    val nombre ="Maria"
    if(nombre.isNotEmpty())
    {
        println("El largo de la variable es: ${nombre.length}")
    }
    else{
        println("Error: La variable está vacía")
    }
    println("-----------------------")
    val mensaje :String = if(nombre.length > 4) {"Tu nombre es largo"} 
    else if(nombre.isEmpty()) {"No tienes nombre"} 
    else {"Tu nombre es corto"} 
    println(mensaje)
    println("-----------------------")
    //when
    val nombreColor ="Verde"
    when (nombreColor){
        "Amarillo" -> println("Esto es amarillo")
        "Rojo", "Carmesí" -> println("Esto es rojo o parece rojo")
        else -> println("Ni idea de que es eso")
    }
    println("-----------------------")
    val code = 16
    when(code){
        in 200..299 -> println("Es como 200")
        in 400..500 -> println("Es un chingo")
        else -> println("Ni idea cuanto sea, al tanteo digo que es como... ${code}")
    }
    println("-----------------------")
    val talla = 41
    val otro_mensaje= when(talla){
        41, 43 -> "Talla: ${talla} disponible"
        43, 44 -> "Talla: No hay"
        45 -> "F"
        else -> "Tallas: Esta"
    }
    println(otro_mensaje)
}