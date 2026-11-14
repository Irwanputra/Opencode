package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C1221266843376284542 {
    public final android.content.Context a;
    public final dev.epro.r0.R8540738700654750557 b;
    public final long c;
    public final dev.epro.r0.D6962450040782876658 d;

    public C1221266843376284542(android.content.Context context, dev.epro.r0.R8540738700654750557 r8540738700654750557, long j, dev.epro.r0.D6962450040782876658 d6962450040782876658) {
        this.a = context;
        this.b = r8540738700654750557;
        this.c = j;
        this.d = d6962450040782876658;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dev.epro.r0.C1221266843376284542.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dev.epro.r0.C1221266843376284542 c1221266843376284542 = (dev.epro.r0.C1221266843376284542) obj;
        if (!dev.epro.r0.S10823041268949770285.t(this.a, c1221266843376284542.a) || !dev.epro.r0.S10823041268949770285.t(this.b, c1221266843376284542.b)) {
            return false;
        }
        long j = c1221266843376284542.c;
        int i = dev.epro.r0.U10174709222559481877.i;
        return dev.epro.r0.P15388715743159210616.a(this.c, j) && this.d.equals(c1221266843376284542.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = dev.epro.r0.U10174709222559481877.i;
        return this.d.hashCode() + dev.epro.r0.G6547577305291411977.j(iHashCode, this.c, 31);
    }
}
