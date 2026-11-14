package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E4880248942576735123 implements U16443665883761795894 {
    public final U16443665883761795894 a;
    public final boolean b;
    public final F4096073349764486348 c;

    public E4880248942576735123(U16443665883761795894 u16443665883761795894, boolean z, F4096073349764486348 f4096073349764486348) {
        f4096073349764486348.getClass();
        this.a = u16443665883761795894;
        this.b = z;
        this.c = f4096073349764486348;
    }

    @Override // dev.epro.r0.U16443665883761795894
    public final Iterator iterator() {
        return new M7968841747429118896(this);
    }
}
