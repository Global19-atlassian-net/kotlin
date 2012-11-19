package test

public trait TypeParamOfClassSubstituted: Object {

    public trait Super<T>: Object {
        public fun foo(): T
    }

    public trait Sub: Super<String> {
        override fun foo(): String
    }
}
