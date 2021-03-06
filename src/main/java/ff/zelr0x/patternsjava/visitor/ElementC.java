package ff.zelr0x.patternsjava.visitor;

public class ElementC implements Element {
    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}