package net.i2p.crypto.eddsa.math;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Encoding {
    protected Field f;

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
