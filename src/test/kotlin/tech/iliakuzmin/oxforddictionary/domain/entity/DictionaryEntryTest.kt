package tech.iliakuzmin.oxforddictionary.domain.entity

import kotlin.test.Test
import kotlin.test.assertEquals

class DictionaryEntryTest {

    @Test
    fun `#hasExamples must return true when #examples is not empty`() {
        val model = DictionaryEntry(
            word = Word("word"),
            definition = Definition("definition"),
            transcription = Transcription("transcription"),
            examples = listOf(
                Example("exampleOne"),
                Example("exampleTwo"),
            )
        )
        val expectedOutput = true

        assertEquals(expectedOutput, model.hasExamples)
    }

    @Test
    fun `#hasExamples must return false when #examples is empty`() {
        val model = DictionaryEntry(
            word = Word("word"),
            definition = Definition("definition"),
            transcription = Transcription("transcription"),
            examples = emptyList()
        )
        val expectedOutput = false

        assertEquals(expectedOutput, model.hasExamples)
    }
}