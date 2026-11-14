package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P5090644433574920637 implements Q15796038708469204840 {
    public static final M10846389789027735899 d = new M10846389789027735899((byte) 14);
    public final H4368712076085988621 a;
    public final Q15796038708469204840 b;
    public final Y3135070733400213774 c;

    public P5090644433574920637(H4368712076085988621 h4368712076085988621, Q15796038708469204840 q15796038708469204840, W8455343525638953052 w8455343525638953052) {
        this.a = h4368712076085988621;
        this.b = q15796038708469204840;
        this.c = new Y3135070733400213774(w8455343525638953052, (byte) 1);
    }

    @Override // dev.epro.r0.Q15796038708469204840
    public final J14024120050125738337 a(Class cls) {
        if (!this.a.containsKey(cls)) {
            return this.b.a(cls);
        }
        D11988991656201568495.j("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    @Override // dev.epro.r0.Q15796038708469204840
    public final J14024120050125738337 b(Class cls, X8580441079827879338 x8580441079827879338) {
        return this.a.containsKey(cls) ? this.c.b(cls, x8580441079827879338) : this.b.b(cls, x8580441079827879338);
    }
}
