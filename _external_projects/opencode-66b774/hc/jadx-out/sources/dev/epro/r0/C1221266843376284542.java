package dev.epro.r0;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C1221266843376284542 {
    public final Context a;
    public final R8540738700654750557 b;
    public final long c;
    public final D6962450040782876658 d;

    public C1221266843376284542(Context context, R8540738700654750557 r8540738700654750557, long j, D6962450040782876658 d6962450040782876658) {
        this.a = context;
        this.b = r8540738700654750557;
        this.c = j;
        this.d = d6962450040782876658;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1221266843376284542.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C1221266843376284542 c1221266843376284542 = (C1221266843376284542) obj;
        if (!S10823041268949770285.t(this.a, c1221266843376284542.a) || !S10823041268949770285.t(this.b, c1221266843376284542.b)) {
            return false;
        }
        long j = c1221266843376284542.c;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.c, j) && this.d.equals(c1221266843376284542.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = U10174709222559481877.i;
        return this.d.hashCode() + G6547577305291411977.j(iHashCode, this.c, 31);
    }
}
