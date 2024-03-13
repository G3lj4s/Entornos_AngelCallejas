import kotlin.random.Random

fun main() {
    val matriz = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    val sumaFilas = Array(matriz.size){0}
    val sumaColum = Array(matriz[0].size){0}


    imprimirMatriz(matriz)
    sumarFilas(matriz, sumaFilas)

    sumaColumnas(matriz,sumaColum)
    println("La suma de las filas es \n${sumaFilas.contentToString()}")
    println("La suma de las columnas es \n${sumaColum.contentToString()}")



}

private fun imprimirMatriz(matriz: Array<Array<Int>>) {
    for (fila in matriz.indices) {
        for (columna in matriz[fila].indices) {
            print("${matriz[fila][columna]} ")
        }
        println()
    }
}


private fun sumaColumnas (matriz:Array<Array<Int>>, sumaColumnas:Array<Int>){
    sumarFilas(matriz, sumaColumnas)
}

private fun sumarFilas(matriz: Array<Array<Int>>, sumaFilas: Array<Int>) {
    var fila: Int = 0
    var columna: Int = 0

    while (fila < matriz.size) {

        while (columna < matriz[0].size) {
            sumaFilas[fila] += matriz[fila][columna]
            columna++
        }
        columna = 0
        fila++
    }
}




