package dev.epro.r0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class I10827619964430248728 extends L17990604304028499756 {
    private static final Map zzb = new ConcurrentHashMap();
    protected G17287098475146498869 zzc;
    private int zzd;

    public I10827619964430248728() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = G17287098475146498869.e;
    }

    public static I10827619964430248728 h(Class cls) {
        Map map = zzb;
        I10827619964430248728 i10827619964430248728 = (I10827619964430248728) map.get(cls);
        if (i10827619964430248728 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i10827619964430248728 = (I10827619964430248728) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (i10827619964430248728 != null) {
            return i10827619964430248728;
        }
        try {
            I10827619964430248728 i108276199644302487282 = (I10827619964430248728) ((I10827619964430248728) Q4627374422374928592.a.allocateInstance(cls)).f(6);
            if (i108276199644302487282 != null) {
                map.put(cls, i108276199644302487282);
                return i108276199644302487282;
            }
            Z3383101362411723454.r();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object i(Method method, I10827619964430248728 i10827619964430248728, Object... objArr) {
        try {
            return method.invoke(i10827619964430248728, objArr);
        } catch (IllegalAccessException e) {
            Z3383101362411723454.m("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            Z3383101362411723454.m("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void k(Class cls, I10827619964430248728 i10827619964430248728) {
        i10827619964430248728.j();
        zzb.put(cls, i10827619964430248728);
    }

    @Override // dev.epro.r0.L17990604304028499756
    public final void a(M15366967277392692994 m15366967277392692994) {
        L16757957611328596921 a = F13787414490045888232.c.a(getClass());
        M204440408817344908 m204440408817344908 = m15366967277392692994.e;
        if (m204440408817344908 == null) {
            m204440408817344908 = new M204440408817344908(m15366967277392692994);
        }
        a.a(this, m204440408817344908);
    }

    @Override // dev.epro.r0.L17990604304028499756
    public final int b(L16757957611328596921 l16757957611328596921) {
        if (e()) {
            int f = l16757957611328596921.f(this);
            if (f >= 0) {
                return f;
            }
            S10973172697741180971.m(G6547577305291411977.n(f, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = l16757957611328596921.f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f2;
            return f2;
        }
        S10973172697741180971.m(G6547577305291411977.n(f2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // dev.epro.r0.L17990604304028499756
    public final int c() {
        if (e()) {
            int f = F13787414490045888232.c.a(getClass()).f(this);
            if (f >= 0) {
                return f;
            }
            S10973172697741180971.m(G6547577305291411977.n(f, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = F13787414490045888232.c.a(getClass()).f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f2;
            return f2;
        }
        S10973172697741180971.m(G6547577305291411977.n(f2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void d() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return F13787414490045888232.c.a(getClass()).g(this, (I10827619964430248728) obj);
    }

    public abstract Object f(int i);

    public final T1232575005132407166 g() {
        return (T1232575005132407166) f(5);
    }

    public final int hashCode() {
        if (e()) {
            return F13787414490045888232.c.a(getClass()).e(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int e = F13787414490045888232.c.a(getClass()).e(this);
        this.zza = e;
        return e;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = H9499724100374326526.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        H9499724100374326526.c(this, sb, 0);
        return sb.toString();
    }
}
