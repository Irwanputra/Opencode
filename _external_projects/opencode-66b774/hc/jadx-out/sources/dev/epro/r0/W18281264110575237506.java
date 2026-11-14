package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W18281264110575237506 {
    public static final P5733283974459951585 f = new P5733283974459951585((byte) 2);
    public final N1420218926656397722 a;
    public final S16571168858015125610 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public W18281264110575237506(N1420218926656397722 n1420218926656397722, S16571168858015125610 s16571168858015125610, boolean z, boolean z2, boolean z3) {
        this.a = n1420218926656397722;
        this.b = s16571168858015125610;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", singleLine=");
        E12098517352909843120.u(sb, this.c, ", softWrap=", this.d, ", isKeyboardTypePhone=");
        return E12098517352909843120.o(sb, this.e, ")");
    }
}
