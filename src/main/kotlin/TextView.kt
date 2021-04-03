import kotlin.properties.Delegates

class TextView {
    var listeners = mutableListOf<ITextChangeListener>()
    var text: String by Delegates.observable("<empty>") {_, oldText, newText ->
        listeners.forEach { textChangedListener ->
            textChangedListener.onTextChanged(oldText, newText)
        }
    }
}