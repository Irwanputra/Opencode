package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A12478465957355731346 extends dev.epro.r0.H677490115963445910 {
    public java.util.List h;
    public boolean i;

    public A12478465957355731346(dev.epro.r0.Q3622318280241842965 q3622318280241842965, boolean z, java.util.List list, dev.epro.r0.F16470721565862751885 f16470721565862751885, dev.epro.r0.M11321907364395208344 m11321907364395208344) {
        super(q3622318280241842965, f16470721565862751885, (dev.epro.r0.F16470721565862751885) null);
        this.i = false;
        if (list == null) {
            dev.epro.r0.Z3383101362411723454.k("value in a Node is required.");
            throw null;
        }
        this.h = list;
        ((dev.epro.r0.J9761478802862050991) this).g = z;
    }

    public final dev.epro.r0.Q2936994053173258289 a() {
        return dev.epro.r0.Q2936994053173258289.c;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (dev.epro.r0.S16582019754975640369 s16582019754975640369 : this.h) {
            sb.append("{ key=");
            sb.append(s16582019754975640369.a);
            sb.append("; value=");
            dev.epro.r0.J9761478802862050991 j9761478802862050991 = s16582019754975640369.b;
            if (j9761478802862050991 instanceof dev.epro.r0.H677490115963445910) {
                sb.append(java.lang.System.identityHashCode(j9761478802862050991));
            } else {
                sb.append(s16582019754975640369);
            }
            sb.append(" }");
        }
        return "<" + dev.epro.r0.A12478465957355731346.class.getName() + " (tag=" + ((dev.epro.r0.J9761478802862050991) this).a + ", values=" + sb.toString() + ")>";
    }
}
