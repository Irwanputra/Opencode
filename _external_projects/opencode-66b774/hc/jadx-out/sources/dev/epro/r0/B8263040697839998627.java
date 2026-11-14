package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B8263040697839998627 extends B5998207562248239613 {
    public final U4520872804402815634 y;

    public B8263040697839998627(U4520872804402815634 u4520872804402815634) {
        this.y = u4520872804402815634;
    }

    @Override // dev.epro.r0.B5998207562248239613
    public final int h(int i, int i2, F10342546226345611902 f10342546226345611902, Z17471428274427141949 z17471428274427141949, int i3) {
        int iC0 = z17471428274427141949.c0(this.y.a);
        if (iC0 == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iC0;
        return f10342546226345611902 == F10342546226345611902.b ? (i - i2) - i4 : i4;
    }

    @Override // dev.epro.r0.B5998207562248239613
    public final Integer j(Z17471428274427141949 z17471428274427141949) {
        return Integer.valueOf(z17471428274427141949.c0(this.y.a));
    }
}
