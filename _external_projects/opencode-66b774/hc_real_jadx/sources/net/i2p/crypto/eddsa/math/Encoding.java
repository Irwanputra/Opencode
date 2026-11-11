package net.i2p.crypto.eddsa.math;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class Encoding {
    public Field f;

    public abstract FieldElement decode(byte[] bArr);

    public abstract byte[] encode(FieldElement fieldElement);

    public abstract boolean isNegative(FieldElement fieldElement);

    public synchronized void setField(Field field) {
        if (this.f != null) {
            throw new IllegalStateException("already set");
        }
        this.f = field;
    }
}
