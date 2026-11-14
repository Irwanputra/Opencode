package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J8834912944986221470 implements D9497773141868343380 {
    public final B13729205492206812220 b;
    public final F10342546226345611902 c;
    public final boolean d;
    public final D9497773141868343380 e;

    public J8834912944986221470(B13729205492206812220 b13729205492206812220, F10342546226345611902 f10342546226345611902, boolean z, D9497773141868343380 d9497773141868343380) {
        this.b = b13729205492206812220;
        this.c = f10342546226345611902;
        this.d = z;
        this.e = d9497773141868343380;
    }

    @Override // dev.epro.r0.D9497773141868343380
    public final float a(float f, float f2, float f3) {
        float intValue = ((Number) this.b.invoke()).intValue();
        boolean z = this.c == F10342546226345611902.b;
        if (this.d || !z) {
            f -= intValue;
        }
        return this.e.a(f, f2, f3 - intValue);
    }
}
