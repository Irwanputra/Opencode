package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O1447893190183080380 extends L17338558938414325155 {
    public final A4783298371339261043 a;
    public final int b;
    public final int c;

    public O1447893190183080380(A4783298371339261043 a4783298371339261043, int i, int i2) {
        this.a = a4783298371339261043;
        this.b = i;
        O8620973563946607355.z(i, i2, a4783298371339261043.a());
        this.c = i2 - i;
    }

    @Override // dev.epro.r0.U2917286957277769200
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O8620973563946607355.x(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // dev.epro.r0.L17338558938414325155, java.util.List
    public final List subList(int i, int i2) {
        O8620973563946607355.z(i, i2, this.c);
        int i3 = this.b;
        return new O1447893190183080380(this.a, i + i3, i3 + i2);
    }
}
