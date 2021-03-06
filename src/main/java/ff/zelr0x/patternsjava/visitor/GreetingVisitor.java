package ff.zelr0x.patternsjava.visitor;

import java.util.function.Function;

public class GreetingVisitor implements ElementVisitor {
    public static final Function<Element, String> GREET =
            (el) -> "Hello, " + el.getClass().getSimpleName(); // For testing

    @Override
    public void visit(ElementA el) {
        System.out.println(GREET.apply(el));
    }

    @Override
    public void visit(ElementB el) {
        System.out.println(GREET.apply(el));
    }

    @Override
    public void visit(ElementC el) {
        System.out.println(GREET.apply(el));
    }
}
