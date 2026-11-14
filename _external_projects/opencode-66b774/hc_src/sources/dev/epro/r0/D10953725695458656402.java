package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D10953725695458656402 extends M8821877208104636290 {
    public final int a;
    public final int b;

    public D10953725695458656402(int i, int i2, String str) {
        super(str);
        this.a = i2;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = this.a;
        StringBuilder g = X2485016533998461232.g("unacceptable code point '", new String(Character.toChars(i)), "' (0x");
        g.append(Integer.toHexString(i).toUpperCase());
        g.append(") ");
        g.append(getMessage());
        g.append("\nin \"'reader'\", position ");
        g.append(this.b);
        return g.toString();
    }
}
