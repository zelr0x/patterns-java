package ff.zelr0x.patternsjava.visitor;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VisitorTest {

    @Test
    public void works() throws Exception {
        List<Element> elements = List.of(new ElementA(), new ElementB(),
                new ElementC(), new ElementB(), new ElementC());
        var greetingVisitor = new GreetingVisitor();
        for (var el : elements) {
            var got = tapSystemOut(() ->  el.accept(greetingVisitor));
            assertTrue(got.startsWith(GreetingVisitor.GREET.apply(el)));
        }
    }
}
