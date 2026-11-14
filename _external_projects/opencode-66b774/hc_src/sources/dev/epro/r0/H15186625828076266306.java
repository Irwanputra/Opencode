package dev.epro.r0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H15186625828076266306 extends Q10607868841417046693 implements R8015591507171738907 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(H15186625828076266306.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long j = T5284056093300834442.a.objectFieldOffset(H15186625828076266306.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public H15186625828076266306() {
        super(1);
        this.owner$volatile = S10823041268949770285.d;
    }

    @Override // dev.epro.r0.R8015591507171738907
    public final void b(Object obj) {
        while (this.f()) {
            Unsafe unsafe = T5284056093300834442.a;
            long j2 = j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            D14731132657808549702 d14731132657808549702 = S10823041268949770285.d;
            if (objectVolatile != d14731132657808549702) {
                if (objectVolatile != obj && obj != null) {
                    D11988991656201568495.o("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    H15186625828076266306 h15186625828076266306 = this;
                    if (T5284056093300834442.a.compareAndSwapObject(h15186625828076266306, j, objectVolatile, d14731132657808549702)) {
                        h15186625828076266306.e();
                        return;
                    } else {
                        if (T5284056093300834442.a.getObjectVolatile(h15186625828076266306, j2) != objectVolatile) {
                            this = h15186625828076266306;
                            break;
                        }
                        this = h15186625828076266306;
                    }
                }
            }
        }
        S10973172697741180971.m("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r0.d(r1, r4.b);
     */
    @Override // dev.epro.r0.R8015591507171738907
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dev.epro.r0.R4833348786910499294 r5) {
        /*
            r4 = this;
            boolean r0 = r4.g()
            dev.epro.r0.O9245300239821758723 r1 = dev.epro.r0.O9245300239821758723.a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            dev.epro.r0.R4833348786910499294 r5 = dev.epro.r0.E18444280280170001567.H(r5)
            dev.epro.r0.H7219028874700587498 r5 = dev.epro.r0.V12319504402545346730.H(r5)
            dev.epro.r0.F999240139382904323 r0 = new dev.epro.r0.F999240139382904323     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = dev.epro.r0.Q10607868841417046693.e     // Catch: java.lang.Throwable -> L3c
            int r2 = r2.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3c
            int r3 = r4.a     // Catch: java.lang.Throwable -> L3c
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L28
            dev.epro.r0.Q2768324090487661247 r4 = r4.b     // Catch: java.lang.Throwable -> L3c
            r0.d(r1, r4)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r2 = r4.d(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L16
        L2e:
            java.lang.Object r4 = r5.r()
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L37
            goto L38
        L37:
            r4 = r1
        L38:
            if (r4 != r5) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            r4 = move-exception
            r5.B()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H15186625828076266306.c(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final boolean f() {
        return Math.max(T5284056093300834442.a.getIntVolatile(this, Q10607868841417046693.f), 0) == 0;
    }

    public final boolean g() {
        H15186625828076266306 h15186625828076266306;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j2 = Q10607868841417046693.f;
            int intVolatile = unsafe.getIntVolatile(this, j2);
            if (intVolatile > this.a) {
                while (true) {
                    Unsafe unsafe2 = T5284056093300834442.a;
                    long j3 = Q10607868841417046693.f;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j3);
                    int i2 = this.a;
                    if (intVolatile2 <= i2) {
                        h15186625828076266306 = this;
                        break;
                    }
                    H15186625828076266306 h151866258280762663062 = this;
                    h15186625828076266306 = h151866258280762663062;
                    if (unsafe2.compareAndSwapInt(h151866258280762663062, j3, intVolatile2, i2)) {
                        break;
                    }
                    this = h15186625828076266306;
                }
            } else {
                h15186625828076266306 = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(h15186625828076266306, j2, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(h15186625828076266306, j, (Object) null);
                    return true;
                }
            }
            this = h15186625828076266306;
        }
    }

    public final String toString() {
        return "Mutex@" + D15445857918358799638.I(this) + "[isLocked=" + f() + ",owner=" + T5284056093300834442.a.getObjectVolatile(this, j) + ']';
    }
}
