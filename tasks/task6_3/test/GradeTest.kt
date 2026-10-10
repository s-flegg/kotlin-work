// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    // copied from guide
    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }
    // written by me
    // out of bounds
    // negative
    @Test
    fun `Mark of -10 gives a ?`() {
        assertEquals("?", grade(-10))
    }
    @Test
    fun `Mark of -1 gives a ?`() {
        assertEquals("?", grade(-1))
    }
    // over 100
    @Test
    fun `Mark of 101 gives a ?`() {
        assertEquals("?", grade(101))
    }
    @Test
    fun `Mark of 150 gives a ?`() {
        assertEquals("?", grade(150))
    }
    // Fail
    @Test
    fun `Mark of 0 gives a Fail`() {
        assertEquals("Fail", grade(0))
    }
    @Test
    fun `Mark of 20 gives a Fail`() {
        assertEquals("Fail", grade(20))
    }
    @Test
    fun `Mark of 39 gives a Fail`() {
        assertEquals("Fail", grade(39))
    }
    // Pass
    @Test
    fun `Mark of 40 gives a Pass`() {
        assertEquals("Pass", grade(40))
    }
    @Test
    fun `Mark of 69 gives a Pass`() {
        assertEquals("Pass", grade(69))
    }
    // Distinction
    @Test
    fun `Mark of 70 gives a Distinction`() {
        assertEquals("Distinction", grade(70))
    }
    @Test
    fun `Mark of 85 gives a Distinction`() {
        assertEquals("Distinction", grade(85))
    }
    @Test
    fun `Mark of 100 gives a Distinction`() {
        assertEquals("Distinction", grade(100))
    }










}
