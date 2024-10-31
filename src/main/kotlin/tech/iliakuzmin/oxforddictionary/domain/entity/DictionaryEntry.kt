package tech.iliakuzmin.oxforddictionary.domain.entity

data class DictionaryEntry(
    val word: Word,
    val definition: Definition,
    val transcription: Transcription?,
    val examples: List<Example>
) {
    val hasExamples: Boolean
        get() = examples.isNotEmpty()
}
