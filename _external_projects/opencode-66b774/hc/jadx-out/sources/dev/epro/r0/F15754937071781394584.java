package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F15754937071781394584 {
    public final V8323072410254082725 a;
    public final long b;
    public final F13667294285619437008 c;
    public final boolean d;

    public F15754937071781394584(V8323072410254082725 v8323072410254082725, long j, F13667294285619437008 f13667294285619437008, boolean z) {
        this.a = v8323072410254082725;
        this.b = j;
        this.c = f13667294285619437008;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F15754937071781394584)) {
            return false;
        }
        F15754937071781394584 f15754937071781394584 = (F15754937071781394584) obj;
        return this.a == f15754937071781394584.a && L2216691091636065972.b(this.b, f15754937071781394584.b) && this.c == f15754937071781394584.c && this.d == f15754937071781394584.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + G6547577305291411977.j(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + L2216691091636065972.h(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
