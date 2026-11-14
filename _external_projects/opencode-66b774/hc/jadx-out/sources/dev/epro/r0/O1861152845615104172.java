package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O1861152845615104172 {
    public final long a;
    public final long b;
    public final B1029012102904255937 c;
    public final boolean d;
    public final V5656221289452463152 e;
    public final Y15793652731717703673 f;
    public final X16708831732427990575 g;
    public final boolean h;
    public final N2892298408695128503 i;
    public final ArrayList j;
    public int k;
    public int l;
    public int m;

    public O1861152845615104172(long j, long j2, B1029012102904255937 b1029012102904255937, boolean z, V5656221289452463152 v5656221289452463152, Y15793652731717703673 y15793652731717703673, X16708831732427990575 x16708831732427990575, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = b1029012102904255937;
        this.d = z;
        this.e = v5656221289452463152;
        this.f = y15793652731717703673;
        this.g = x16708831732427990575;
        this.h = z2;
        int i = K4706456930588538344.a;
        this.i = new N2892298408695128503(6);
        this.j = new ArrayList();
        this.k = -1;
        this.l = -1;
        this.m = -1;
    }

    public final int a(int i, Y16367081738320461687 y16367081738320461687, Y16367081738320461687 y163670817383204616872) {
        if (i == -1) {
            int iOrdinal = U8836654130139556418.y(y16367081738320461687, y163670817383204616872).ordinal();
            if (iOrdinal == 0) {
                return this.m - 1;
            }
            if (iOrdinal == 1) {
                return this.m;
            }
            if (iOrdinal != 2) {
                Z3383101362411723454.g();
                return 0;
            }
        }
        return i;
    }
}
