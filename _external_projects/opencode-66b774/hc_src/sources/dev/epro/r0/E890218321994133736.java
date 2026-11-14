package dev.epro.r0;

import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class E890218321994133736 implements Y337325536156316681 {
    protected int memoizedHashCode;

    public abstract int b(Y3341182438442346389 y3341182438442346389);

    public final String c(String str) {
        return E12098517352909843120.m("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public abstract T2502439376570223027 d();

    public final byte[] e() {
        try {
            int b = ((Z14368087615735085238) this).b(null);
            byte[] bArr = new byte[b];
            Logger logger = A5011514514014580540.e;
            A5011514514014580540 a5011514514014580540 = new A5011514514014580540(bArr, b);
            g(a5011514514014580540);
            if (a5011514514014580540.h() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            Z3383101362411723454.m(c("byte array"), e);
            return null;
        }
    }

    public final M18082356575916498704 f() {
        try {
            int b = ((Z14368087615735085238) this).b(null);
            M18082356575916498704 m18082356575916498704 = N17666688112968464504.b;
            byte[] bArr = new byte[b];
            Logger logger = A5011514514014580540.e;
            A5011514514014580540 a5011514514014580540 = new A5011514514014580540(bArr, b);
            g(a5011514514014580540);
            if (a5011514514014580540.h() == 0) {
                return new M18082356575916498704(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            Z3383101362411723454.m(c("ByteString"), e);
            return null;
        }
    }

    public abstract void g(A5011514514014580540 a5011514514014580540);
}
