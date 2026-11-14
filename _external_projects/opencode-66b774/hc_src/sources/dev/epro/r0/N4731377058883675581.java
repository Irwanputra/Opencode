package dev.epro.r0;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N4731377058883675581 extends L17338558938414325155 implements RandomAccess {
    public final L17338558938414325155 a;
    public final int b;
    public final int c;

    public N4731377058883675581(L17338558938414325155 l17338558938414325155, int i, int i2) {
        this.a = l17338558938414325155;
        this.b = i;
        C9869900372345142877.r(i, i2, l17338558938414325155.a());
        this.c = i2 - i;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, i2, ", size: "));
            return null;
        }
        return this.a.get(this.b + i);
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final List subList(int i, int i2) {
        C9869900372345142877.r(i, i2, this.c);
        int i3 = this.b;
        return new N4731377058883675581(this.a, i + i3, i3 + i2);
    }
}
