// !CHECK_TYPE
// IGNORE_FIR

interface Tr<T>
interface G<T> : Tr<T>

fun test(tr: Tr<String>?) {
    val v = tr as G
    checkSubtype<G<String>>(v)
}