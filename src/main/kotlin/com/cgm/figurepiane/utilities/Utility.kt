import com.cgm.figurepiane.interfaces.IShape

fun getValueFromCommandLine(context: String): String? {
    println("Insert value of $context")
    return readLine()
}

fun <T> printShapeArea(figure: T): Double where T : IShape {
    val errors = figure.calculateArea()
    errors.takeIf { it.isNotEmpty() }?.let { error("Cannot calculate shape area: $it") }
    return figure.getArea()
}

typealias Errors = List<String>