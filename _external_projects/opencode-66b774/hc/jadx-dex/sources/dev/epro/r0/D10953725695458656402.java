package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D10953725695458656402 extends dev.epro.r0.M8821877208104636290 {
    public final int a;
    public final int b;

    public D10953725695458656402(int i, int i2, java.lang.String str) {
        super(str);
        this.a = i2;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        int i = this.a;
        java.lang.StringBuilder sbG = dev.epro.r0.X2485016533998461232.g("unacceptable code point '", new java.lang.String(java.lang.Character.toChars(i)), "' (0x");
        sbG.append(java.lang.Integer.toHexString(i).toUpperCase());
        sbG.append(") ");
        sbG.append(getMessage());
        sbG.append("\nin \"'reader'\", position ");
        sbG.append(this.b);
        return sbG.toString();
    }
}
