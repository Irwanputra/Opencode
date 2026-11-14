package dev.epro.r0;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G5200290475234668330 implements D14012262140144083539 {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final D15128981762807597517 a;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        c = unsafe.objectFieldOffset(G5200290475234668330.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(G5200290475234668330.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(G5200290475234668330.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public G5200290475234668330(D15128981762807597517 d15128981762807597517, Throwable th) {
        this.a = d15128981762807597517;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            T5284056093300834442.a.putObjectVolatile(this, d, th);
            return;
        }
        if (th == c2) {
            return;
        }
        Unsafe unsafe = T5284056093300834442.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                Q11088980322693754445.i("State is ", objectVolatile);
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // dev.epro.r0.D14012262140144083539
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) T5284056093300834442.a.getObjectVolatile(this, d);
    }

    @Override // dev.epro.r0.D14012262140144083539
    public final D15128981762807597517 d() {
        return this.a;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return T5284056093300834442.a.getIntVolatile(this, c) != 0;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = T5284056093300834442.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                Q11088980322693754445.i("State is ", objectVolatile);
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, O4077903568229246.p);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + T5284056093300834442.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
    }
}
