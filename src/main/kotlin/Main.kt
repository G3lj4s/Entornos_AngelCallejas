import kotlin.random.Random

fun main() {
    val matriz = Array(4) { Array<Int>(4) { Random.nextInt(1, 9) } }
    val sumaFilas = Array(matriz.size) { 0 }
    val sumaColumnas = Array(matriz[0].size) { 0 }

    println("Menú:")
    println("1. Imprimir la matriz")
    println("2. Calcular la suma de las filas")
    println("3. Calcular la suma de las columnas")
    println("4. Salir")

    val opcion = readLine()?.toIntOrNull()

    when (opcion) {
        1 -> imprimirMatriz(matriz)
        2 -> sumarFilas(matriz, sumaFilas)
        3 -> sumaColumnas(matriz, sumaColumnas)
        4 -> println("Hasta luego.")
        else -> println("Opción no válida. Introduce un número del 1 al 4.")
    }
}

private fun imprimirMatriz(matriz: Array<Array<Int>>) {
    for (fila in matriz.indices) {
        for (columna in matriz[fila].indices) {
            print("${matriz[fila][columna]} ")
        }
        println()
    }
}

private fun sumarFilas(matriz: Array<Array<Int>>, sumaFilas: Array<Int>) {
    for (fila in matriz.indices) {
        for (columna in matriz[fila].indices) {
            sumaFilas[fila] += matriz[fila][columna]
        }
    }
    println("La suma de las filas es \n${sumaFilas.contentToString()}")
}

private fun sumaColumnas(matriz: Array<Array<Int>>, sumaColumnas: Array<Int>) {
    for (columna in matriz[0].indices) {
        for (fila in matriz.indices) {
            sumaColumnas[columna] += matriz[fila][columna]
        }
    }
    println("La suma de las columnas es \n${sumaColumnas.contentToString()}")
}
