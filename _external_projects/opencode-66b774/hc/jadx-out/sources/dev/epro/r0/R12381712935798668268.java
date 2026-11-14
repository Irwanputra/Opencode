package dev.epro.r0;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R12381712935798668268 extends T18016951143603335921 {
    public static final Unsafe T;
    public static final long U;
    public static final long V;
    public static final long W;
    public static final long X;
    public static final long Y;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new F2522870689781627311((byte) 0));
            }
            try {
                V = unsafe.objectFieldOffset(R4225980552687347745.class.getDeclaredField("c"));
                U = unsafe.objectFieldOffset(R4225980552687347745.class.getDeclaredField("b"));
                W = unsafe.objectFieldOffset(R4225980552687347745.class.getDeclaredField("a"));
                X = unsafe.objectFieldOffset(R14797178970429462271.class.getDeclaredField("a"));
                Y = unsafe.objectFieldOffset(R14797178970429462271.class.getDeclaredField("b"));
                T = unsafe;
            } catch (NoSuchFieldException e) {
                Q11088980322693754445.k(e);
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (PrivilegedActionException e3) {
            Z3383101362411723454.m("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final G5604827203694114189 E(R4225980552687347745 r4225980552687347745) {
        G5604827203694114189 g5604827203694114189;
        G5604827203694114189 g56048272036941141892 = G5604827203694114189.d;
        do {
            g5604827203694114189 = r4225980552687347745.b;
            if (g56048272036941141892 == g5604827203694114189) {
                break;
            }
        } while (!v(r4225980552687347745, g5604827203694114189, g56048272036941141892));
        return g5604827203694114189;
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final R14797178970429462271 F(R4225980552687347745 r4225980552687347745) {
        R14797178970429462271 r14797178970429462271;
        R14797178970429462271 r147971789704294622712 = R14797178970429462271.c;
        do {
            r14797178970429462271 = r4225980552687347745.c;
            if (r147971789704294622712 == r14797178970429462271) {
                break;
            }
        } while (!x(r4225980552687347745, r14797178970429462271, r147971789704294622712));
        return r14797178970429462271;
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final void U(R14797178970429462271 r14797178970429462271, R14797178970429462271 r147971789704294622712) {
        T.putObject(r14797178970429462271, Y, r147971789704294622712);
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final void V(R14797178970429462271 r14797178970429462271, Thread thread) {
        T.putObject(r14797178970429462271, X, thread);
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final boolean v(R4225980552687347745 r4225980552687347745, G5604827203694114189 g5604827203694114189, G5604827203694114189 g56048272036941141892) {
        while (true) {
            Unsafe unsafe = T;
            long j = U;
            R4225980552687347745 r42259805526873477452 = r4225980552687347745;
            G5604827203694114189 g56048272036941141893 = g5604827203694114189;
            G5604827203694114189 g56048272036941141894 = g56048272036941141892;
            if (unsafe.compareAndSwapObject(r42259805526873477452, j, g56048272036941141893, g56048272036941141894)) {
                return true;
            }
            if (unsafe.getObject(r42259805526873477452, j) != g56048272036941141893) {
                return false;
            }
            r4225980552687347745 = r42259805526873477452;
            g5604827203694114189 = g56048272036941141893;
            g56048272036941141892 = g56048272036941141894;
        }
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final boolean w(R4225980552687347745 r4225980552687347745, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = T;
            long j = W;
            R4225980552687347745 r42259805526873477452 = r4225980552687347745;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(r42259805526873477452, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(r42259805526873477452, j) != obj3) {
                return false;
            }
            r4225980552687347745 = r42259805526873477452;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // dev.epro.r0.T18016951143603335921
    public final boolean x(R4225980552687347745 r4225980552687347745, R14797178970429462271 r14797178970429462271, R14797178970429462271 r147971789704294622712) {
        while (true) {
            Unsafe unsafe = T;
            long j = V;
            R4225980552687347745 r42259805526873477452 = r4225980552687347745;
            R14797178970429462271 r147971789704294622713 = r14797178970429462271;
            R14797178970429462271 r147971789704294622714 = r147971789704294622712;
            if (unsafe.compareAndSwapObject(r42259805526873477452, j, r147971789704294622713, r147971789704294622714)) {
                return true;
            }
            if (unsafe.getObject(r42259805526873477452, j) != r147971789704294622713) {
                return false;
            }
            r4225980552687347745 = r42259805526873477452;
            r14797178970429462271 = r147971789704294622713;
            r147971789704294622712 = r147971789704294622714;
        }
    }
}
