import jdk.nashorn.internal.objects.NativeFunction.apply

fun main(args: Array<String>) {
    val textView = TextView().apply {
        listeners.add(PrintingTextChangedListener())
    }

    with(textView) {
        text = "lorem ipsum"
        text = "some new text"
    }
}