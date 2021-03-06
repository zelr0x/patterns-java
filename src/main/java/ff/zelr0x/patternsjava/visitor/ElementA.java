package ff.zelr0x.patternsjava.visitor;

public class ElementA implements Element {
    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}
