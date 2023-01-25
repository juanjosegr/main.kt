class Coche (color:String, marca: String, modelo: String, caballos: Int, puertas: Int, matricula: String) {
    val color: String
    val marca: String
    val modelo: String
    val caballos: Int
    val puertas: Int
    val matricula: String
    init {
        this.color = color
        this.marca = marca
        this.modelo = modelo
        this.caballos = caballos
        this.puertas = puertas
        this. matricula = matricula
    }
    fun imprimir(){
        println("Tu coche es un $marca $modelo, de color $color, con $caballos cv, de $puertas puertas y con matricula de $matricula.")
    }
    override fun toString(): String {
        return "Tu coche es un $marca $modelo, de color $color, con $caballos cv, de $puertas puertas y con matricula de $matricula."
    }

}