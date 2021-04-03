class PrintingTextChangedListener: ITextChangeListener {
    private var text = ""

    override fun onTextChanged(oldText: String, newText: String) {
       text = "Old text was $oldText and the new test is $newText"
        println(text)
    }
}