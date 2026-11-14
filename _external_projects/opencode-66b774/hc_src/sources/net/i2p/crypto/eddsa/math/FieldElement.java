package net.i2p.crypto.eddsa.math;

import dev.epro.r0.S10973172697741180971;
import java.io.Serializable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public abstract class FieldElement implements Serializable {
    private static final long serialVersionUID = 1239527465875676L;
    protected final Field f;

    public FieldElement(Field field) {
        if (field != null) {
            this.f = field;
        } else {
            S10973172697741180971.j("field cannot be null");
            throw null;
        }
    }

    public abstract FieldElement add(FieldElement fieldElement);

    public FieldElement addOne() {
        return add(this.f.ONE);
    }

    public abstract FieldElement cmov(FieldElement fieldElement, int i);

    public FieldElement divide(FieldElement fieldElement) {
        return multiply(fieldElement.invert());
    }

    public abstract FieldElement invert();

    public boolean isNegative() {
        return this.f.getEncoding().isNegative(this);
    }

    public abstract boolean isNonZero();

    public abstract FieldElement multiply(FieldElement fieldElement);

    public abstract FieldElement negate();

    public abstract FieldElement pow22523();

    public abstract FieldElement square();

    public abstract FieldElement squareAndDouble();

    public abstract FieldElement subtract(FieldElement fieldElement);

    public FieldElement subtractOne() {
        return subtract(this.f.ONE);
    }

    public byte[] toByteArray() {
        return this.f.getEncoding().encode(this);
    }
}
