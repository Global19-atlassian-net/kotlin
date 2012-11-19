package test;

import org.jetbrains.annotations.NotNull;
import jet.runtime.typeinfo.KotlinSignature;
import java.util.*;
import jet.*;

public interface TwoSuperclassesSupplementNotNull {

    public interface Super1 {
        @KotlinSignature("fun foo(): Function0<String?>")
        public Function0<String> foo();
    }

    public interface Super2 {
        @KotlinSignature("fun foo(): Function0<String>?")
        public Function0<String> foo();
    }

    public interface Sub extends Super1, Super2 {
        public Function0<String> foo();
    }
}
