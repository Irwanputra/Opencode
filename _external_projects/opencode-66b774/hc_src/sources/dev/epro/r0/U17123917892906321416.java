package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U17123917892906321416 implements V14977941268796428117 {
    public final int a;
    public int b = -1;
    public int c = -1;

    public U17123917892906321416(int i) {
        this.a = i;
    }

    @Override // dev.epro.r0.V14977941268796428117
    public final boolean g(CharSequence charSequence, int i, int i2, D14027398382627356533 d14027398382627356533) {
        int i3 = this.a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    @Override // dev.epro.r0.V14977941268796428117
    public final Object a() {
        return this;
    }
}
