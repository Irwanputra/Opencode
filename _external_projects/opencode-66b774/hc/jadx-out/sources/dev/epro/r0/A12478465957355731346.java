package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A12478465957355731346 extends H677490115963445910 {
    public List h;
    public boolean i;

    public A12478465957355731346(Q3622318280241842965 q3622318280241842965, boolean z, List list, F16470721565862751885 f16470721565862751885, M11321907364395208344 m11321907364395208344) {
        super(q3622318280241842965, f16470721565862751885, null);
        this.i = false;
        if (list == null) {
            Z3383101362411723454.k("value in a Node is required.");
            throw null;
        }
        this.h = list;
        this.g = z;
    }

    @Override // dev.epro.r0.J9761478802862050991
    public final Q2936994053173258289 a() {
        return Q2936994053173258289.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (S16582019754975640369 s16582019754975640369 : this.h) {
            sb.append("{ key=");
            sb.append(s16582019754975640369.a);
            sb.append("; value=");
            J9761478802862050991 j9761478802862050991 = s16582019754975640369.b;
            if (j9761478802862050991 instanceof H677490115963445910) {
                sb.append(System.identityHashCode(j9761478802862050991));
            } else {
                sb.append(s16582019754975640369);
            }
            sb.append(" }");
        }
        return "<" + A12478465957355731346.class.getName() + " (tag=" + this.a + ", values=" + sb.toString() + ")>";
    }
}
