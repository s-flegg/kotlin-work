// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(text: String, toRedact: String, redactionChar: Char = 'X'): String {
    // check toRedact isn't empty
    // text can be as will return the same string
    if (toRedact.isEmpty()) {
        return text
    }

    // setup
    val redactLength = toRedact.length
    var matchedSoFar = 0
    var currMatching = false

    val result = buildString { // efficient way to build new string
        // loop through the text
        for (n in 0..text.length - 1) {
            // if in a matching
            if (currMatching) {
                // look for next char in toRedact
                if (text[n] == toRedact[matchedSoFar]) {
                    matchedSoFar++
                    // check if redaction string has been fully matched
                    if (matchedSoFar == redactLength) {
                        // add redaction chars to new text
                        for (i in 1..redactLength) {
                            append(redactionChar)
                        }
                        // reset
                        currMatching = false
                        matchedSoFar = 0
                    }
                } else {
                    // matching has been broken
                    // add unadded chars to new text
                    for (i in n-matchedSoFar..n) {
                        append(text[i])
                    }
                    // reset
                    currMatching = false
                    matchedSoFar = 0
                }
            } else {
                // not in matching
                // check for start of matching
                if (text[n] == toRedact[0]) {
                    matchedSoFar++
                    currMatching = true
                } else {
                    // not in matching and not starting one
                    append(text[n])
                }
            }
        }
    }
    return result
}