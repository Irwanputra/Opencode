package ads_mobile_sdk;

import dev.epro.r0.F2522870689781627311;
import java.io.Serializable;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class pm3 {
    public static final Unsafe a;
    public static final Class b;
    public static final yu c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(16:3|(1:(1:6)(1:(1:40)))(1:41)|7|(1:9)|(1:11)(1:38)|12|(3:14|15|16)|30|31|32|(1:34)|(1:21)|22|(1:24)|25|26)|42|7|(0)|(0)(0)|12|(0)|30|31|32|(0)|(1:21)|22|(0)|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        if (r0.getType() == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    static {
        /*
            sun.misc.Unsafe r0 = a()
            ads_mobile_sdk.pm3.a = r0
            java.lang.Class r1 = ads_mobile_sdk.qe.a()
            ads_mobile_sdk.pm3.b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r2 = d(r1)
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r3 = d(r3)
            r4 = 1
            r5 = 0
            r6 = 0
            if (r0 != 0) goto L1e
            goto L34
        L1e:
            boolean r7 = ads_mobile_sdk.qe.b()
            if (r7 == 0) goto L36
            if (r2 == 0) goto L2c
            dev.epro.r0.I1123763153108354587 r2 = new dev.epro.r0.I1123763153108354587
            r2.<init>(r0, r4)
            goto L3c
        L2c:
            if (r3 == 0) goto L34
            dev.epro.r0.I1123763153108354587 r2 = new dev.epro.r0.I1123763153108354587
            r2.<init>(r0, r5)
            goto L3c
        L34:
            r2 = r6
            goto L3c
        L36:
            dev.epro.r0.I1123763153108354587 r2 = new dev.epro.r0.I1123763153108354587
            r3 = 2
            r2.<init>(r0, r3)
        L3c:
            ads_mobile_sdk.pm3.c = r2
            if (r2 != 0) goto L41
            goto L44
        L41:
            r2.b()
        L44:
            if (r2 != 0) goto L48
            r0 = r5
            goto L4c
        L48:
            boolean r0 = r2.mo9a()
        L4c:
            ads_mobile_sdk.pm3.d = r0
            java.lang.Class<byte[]> r0 = byte[].class
            b(r0)
            java.lang.Class<boolean[]> r0 = boolean[].class
            b(r0)
            c(r0)
            java.lang.Class<int[]> r0 = int[].class
            b(r0)
            c(r0)
            java.lang.Class<long[]> r0 = long[].class
            b(r0)
            c(r0)
            java.lang.Class<float[]> r0 = float[].class
            b(r0)
            c(r0)
            java.lang.Class<double[]> r0 = double[].class
            b(r0)
            c(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            b(r0)
            c(r0)
            boolean r0 = ads_mobile_sdk.qe.b()
            java.lang.Class<java.nio.Buffer> r3 = java.nio.Buffer.class
            if (r0 == 0) goto L97
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L92
            goto L93
        L92:
            r0 = r6
        L93:
            if (r0 == 0) goto L97
        L95:
            r6 = r0
            goto La8
        L97:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L9e
            goto L9f
        L9e:
            r0 = r6
        L9f:
            if (r0 == 0) goto La8
            java.lang.Class r3 = r0.getType()
            if (r3 != r1) goto La8
            goto L95
        La8:
            if (r6 == 0) goto Lb4
            if (r2 != 0) goto Lad
            goto Lb4
        Lad:
            java.lang.Object r0 = r2.a
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0
            r0.objectFieldOffset(r6)
        Lb4:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Lbd
            goto Lbe
        Lbd:
            r4 = r5
        Lbe:
            ads_mobile_sdk.pm3.e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pm3.<clinit>():void");
    }

    public static Unsafe a() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new F2522870689781627311((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger logger = Logger.getLogger(pm3.class.getName());
            Level level = Level.WARNING;
            logger.getClass();
            return null;
        }
    }

    public static void b(Class cls) {
        if (d) {
            ((Unsafe) c.a).arrayBaseOffset(cls);
        }
    }

    public static void c(Class cls) {
        if (d) {
            ((Unsafe) c.a).arrayIndexScale(cls);
        }
    }

    public static boolean d(Class cls) {
        if (!qe.b()) {
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

    public static void a(int i, long j, Object obj) {
        c.a(i, j, obj);
    }

    public static void a(long j, Object obj, Serializable serializable) {
        c.a(j, obj, serializable);
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(pm3.class.getName());
        Level level = Level.WARNING;
        String.valueOf(th);
        logger.getClass();
    }
}
