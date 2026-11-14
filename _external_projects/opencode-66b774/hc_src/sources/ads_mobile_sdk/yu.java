package ads_mobile_sdk;

import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.T18397286815848089648;
import java.lang.reflect.Field;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class yu {
    public Object a;

    public yu(P10813970601447104553 p10813970601447104553) {
        p10813970601447104553.getClass();
        this.a = p10813970601447104553;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a(byte b);

    public abstract void a(int i, boolean z);

    public abstract void a(int i, byte[] bArr);

    public abstract void a(int i, byte[] bArr, int i2);

    public abstract void a(Object obj, long j, double d);

    public abstract void a(Object obj, long j, float f);

    public abstract void a(Object obj, long j, boolean z);

    public abstract void a(String str);

    /* renamed from: a, reason: collision with other method in class */
    public boolean mo9a() {
        try {
            Class<?> cls = ((Unsafe) this.a).getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            pm3.a(th);
            return false;
        }
    }

    public abstract boolean a(long j, Object obj);

    public abstract double b(long j, Object obj);

    public abstract void b(int i, sq sqVar);

    public abstract void b(int i, String str);

    public abstract void b(g gVar);

    public abstract void b(sq sqVar);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r4.getType() == r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r4 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r4 = this;
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Object r4 = r4.a
            sun.misc.Unsafe r4 = (sun.misc.Unsafe) r4
            r1 = 0
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L38
            r4.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "getLong"
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r0}     // Catch: java.lang.Throwable -> L38
            r4.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L38
            sun.misc.Unsafe r4 = ads_mobile_sdk.pm3.a     // Catch: java.lang.Throwable -> L38
            boolean r4 = ads_mobile_sdk.qe.b()     // Catch: java.lang.Throwable -> L38
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            r3 = 0
            if (r4 == 0) goto L3a
            java.lang.String r4 = "effectiveDirectAddress"
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L33
            goto L34
        L33:
            r4 = r3
        L34:
            if (r4 == 0) goto L3a
        L36:
            r3 = r4
            goto L4b
        L38:
            r4 = move-exception
            goto L50
        L3a:
            java.lang.String r4 = "address"
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L41
            goto L42
        L41:
            r4 = r3
        L42:
            if (r4 == 0) goto L4b
            java.lang.Class r2 = r4.getType()     // Catch: java.lang.Throwable -> L38
            if (r2 != r0) goto L4b
            goto L36
        L4b:
            if (r3 != 0) goto L4e
            return r1
        L4e:
            r4 = 1
            return r4
        L50:
            ads_mobile_sdk.pm3.a(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yu.b():boolean");
    }

    public abstract float c(long j, Object obj);

    public abstract void c(long j);

    public abstract void d(int i, long j);

    public abstract void d(long j);

    public void destroy() {
        a().destroy();
    }

    public abstract void e(int i, int i2);

    public abstract void e(int i, long j);

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void k(int i);

    public abstract void l(int i);

    public abstract void m(int i);

    public yu(Map map) {
        map.getClass();
        this.a = map;
    }

    public static long b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(dev.epro.r0.C9731525580007922156 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.pk1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.pk1 r0 = (ads_mobile_sdk.pk1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.pk1 r0 = new ads_mobile_sdk.pk1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.util.Iterator r4 = r0.b
            java.lang.Object r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L3f
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            java.lang.Object r4 = r4.a
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L3f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r1 = r6.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r6.getValue()
            dev.epro.r0.O13596159851191883632 r6 = (dev.epro.r0.O13596159851191883632) r6
            r0.a = r5
            r0.b = r4
            r0.e = r2
            java.lang.Object r6 = r6.a(r5, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r1) goto L3f
            return r1
        L66:
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yu.a(dev.epro.r0.C9731525580007922156, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public Object a(String str, Object obj, F4096073349764486348 f4096073349764486348) {
        I16631908410500040363 i16631908410500040363;
        f4096073349764486348.getClass();
        dr0 dr0Var = (dr0) ((P10813970601447104553) this.a);
        dr0Var.getClass();
        f4096073349764486348.getClass();
        if (!dr0Var.g.get()) {
            IllegalStateException illegalStateException = new IllegalStateException("Flags have not been initialized!");
            ci3 ci3Var = xv.a;
            if (ci3Var != null) {
                ci3Var.a("Flags have not been initialized!", (Throwable) illegalStateException);
            }
        }
        Object obj2 = null;
        try {
            i16631908410500040363 = dr0Var.j;
        } catch (Throwable unused) {
        }
        if (i16631908410500040363 != null) {
            K15572083692188606544 w = i16631908410500040363.w(str);
            if (w != null) {
                obj2 = f4096073349764486348.invoke(w);
            }
            return obj2 == null ? obj : obj2;
        }
        S10823041268949770285.b0("flagJson");
        throw null;
    }

    public T18397286815848089648 a() {
        return (T18397286815848089648) this.a;
    }

    public void a(int i, long j, Object obj) {
        ((Unsafe) this.a).putInt(obj, j, i);
    }

    public void a(Object obj, long j, long j2) {
        ((Unsafe) this.a).putLong(obj, j, j2);
    }

    public void a(long j, Object obj, Object obj2) {
        ((Unsafe) this.a).putObject(obj, j, obj2);
    }

    public static int a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }
}
