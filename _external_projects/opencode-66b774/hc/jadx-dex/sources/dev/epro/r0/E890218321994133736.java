package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E890218321994133736 implements dev.epro.r0.Y337325536156316681 {
    protected int memoizedHashCode;

    public abstract int b(dev.epro.r0.Y3341182438442346389 y3341182438442346389);

    public final java.lang.String c(java.lang.String str) {
        return dev.epro.r0.E12098517352909843120.m("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public abstract dev.epro.r0.T2502439376570223027 d();

    public final byte[] e() {
        try {
            int iB = ((dev.epro.r0.Z14368087615735085238) this).b((dev.epro.r0.Y3341182438442346389) null);
            byte[] bArr = new byte[iB];
            java.util.logging.Logger logger = dev.epro.r0.A5011514514014580540.e;
            dev.epro.r0.A5011514514014580540 a5011514514014580540 = new dev.epro.r0.A5011514514014580540(bArr, iB);
            g(a5011514514014580540);
            if (a5011514514014580540.h() == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e) {
            dev.epro.r0.Z3383101362411723454.m(c("byte array"), e);
            return null;
        }
    }

    public final dev.epro.r0.M18082356575916498704 f() {
        try {
            int iB = ((dev.epro.r0.Z14368087615735085238) this).b((dev.epro.r0.Y3341182438442346389) null);
            dev.epro.r0.M18082356575916498704 m18082356575916498704 = dev.epro.r0.N17666688112968464504.b;
            byte[] bArr = new byte[iB];
            java.util.logging.Logger logger = dev.epro.r0.A5011514514014580540.e;
            dev.epro.r0.A5011514514014580540 a5011514514014580540 = new dev.epro.r0.A5011514514014580540(bArr, iB);
            g(a5011514514014580540);
            if (a5011514514014580540.h() == 0) {
                return new dev.epro.r0.M18082356575916498704(bArr);
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e) {
            dev.epro.r0.Z3383101362411723454.m(c("ByteString"), e);
            return null;
        }
    }

    public abstract void g(dev.epro.r0.A5011514514014580540 a5011514514014580540);
}
