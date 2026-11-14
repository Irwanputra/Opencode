package dev.epro.r0;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Z3287610729711297369 {
    public static final Unsafe a;
    public static final Class b;
    public static final M2335452796812725357 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        Unsafe unsafe;
        char c2 = 1;
        I1710567001611842124 i1710567001611842124 = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new F2522870689781627311((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = E6993330184355272251.a;
        boolean zD = d(Long.TYPE);
        boolean zD2 = d(Integer.TYPE);
        byte b2 = 0;
        if (unsafe != null) {
            if (!E6993330184355272251.a()) {
                i1710567001611842124 = new I1710567001611842124(unsafe, (byte) 2);
            } else if (zD) {
                i1710567001611842124 = new I1710567001611842124(unsafe, c2 == true ? 1 : 0);
            } else if (zD2) {
                i1710567001611842124 = new I1710567001611842124(unsafe, b2);
            }
        }
        c = i1710567001611842124;
        d = i1710567001611842124 == null ? false : i1710567001611842124.j();
        e = i1710567001611842124 == null ? false : i1710567001611842124.i();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        if (fieldC != null && i1710567001611842124 != null) {
            i1710567001611842124.b.objectFieldOffset(fieldC);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        if (E6993330184355272251.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean d(Class cls) {
        if (!E6993330184355272251.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte e(long j, byte[] bArr) {
        return c.b(f + j, bArr);
    }

    public static byte f(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(long j, Object obj) {
        return c.b.getInt(obj, j);
    }

    public static long i(long j, Object obj) {
        return c.b.getLong(obj, j);
    }

    public static Object j(long j, Object obj) {
        return c.b.getObject(obj, j);
    }

    public static void k(Throwable th) {
        Logger logger = Logger.getLogger(Z3287610729711297369.class.getName());
        Level level = Level.WARNING;
        String.valueOf(th);
        logger.getClass();
    }

    public static void l(byte[] bArr, long j, byte b2) {
        c.f(f + j, bArr, b2);
    }

    public static void m(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int iH = h(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        o(((255 & b2) << i) | (iH & (~(255 << i))), j2, obj);
    }

    public static void n(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(((255 & b2) << i) | (h(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void o(int i, long j, Object obj) {
        c.b.putInt(obj, j, i);
    }

    public static void p(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void q(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }
}
