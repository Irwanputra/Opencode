package dev.epro.r0;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class Z14368087615735085238 extends E890218321994133736 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, Z14368087615735085238> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C10101319439186475078 unknownFields;

    public Z14368087615735085238() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C10101319439186475078.f;
    }

    public static Z14368087615735085238 j(Class cls) {
        Z14368087615735085238 z14368087615735085238 = defaultInstanceMap.get(cls);
        if (z14368087615735085238 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                z14368087615735085238 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (z14368087615735085238 != null) {
            return z14368087615735085238;
        }
        try {
            Z14368087615735085238 a = ((Z14368087615735085238) Z3287610729711297369.a.allocateInstance(cls)).a();
            if (a != null) {
                defaultInstanceMap.put(cls, a);
                return a;
            }
            Z3383101362411723454.r();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object m(Method method, Z14368087615735085238 z14368087615735085238, Object... objArr) {
        try {
            return method.invoke(z14368087615735085238, objArr);
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

    public static final boolean n(Z14368087615735085238 z14368087615735085238, boolean z) {
        byte byteValue = ((Byte) z14368087615735085238.i(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
        c2256474256246444038.getClass();
        boolean c = c2256474256246444038.a(z14368087615735085238.getClass()).c(z14368087615735085238);
        if (z) {
            z14368087615735085238.i(2);
        }
        return c;
    }

    public static Z14368087615735085238 s(Z14368087615735085238 z14368087615735085238, N17666688112968464504 n17666688112968464504, R4931231174251890987 r4931231174251890987) {
        M18082356575916498704 m18082356575916498704 = (M18082356575916498704) n17666688112968464504;
        byte[] bArr = m18082356575916498704.d;
        int l = m18082356575916498704.l();
        int size = m18082356575916498704.size();
        H17306840337920354701 h17306840337920354701 = new H17306840337920354701(bArr, l, size, true);
        try {
            h17306840337920354701.e(size);
            Z14368087615735085238 r = z14368087615735085238.r();
            try {
                C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
                c2256474256246444038.getClass();
                Y3341182438442346389 a = c2256474256246444038.a(r.getClass());
                E17564419012940707302 e17564419012940707302 = h17306840337920354701.c;
                if (e17564419012940707302 == null) {
                    e17564419012940707302 = new E17564419012940707302(h17306840337920354701);
                }
                a.g(r, e17564419012940707302, r4931231174251890987);
                a.b(r);
                if (h17306840337920354701.i != 0) {
                    throw new N11355818201711573941("Protocol message end-group tag did not match expected tag.");
                }
                if (n(r, true)) {
                    return r;
                }
                throw new N11355818201711573941(new U10024139115995659738().getMessage());
            } catch (N11355818201711573941 e) {
                throw e;
            } catch (U10024139115995659738 e2) {
                throw new N11355818201711573941(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof N11355818201711573941) {
                    throw ((N11355818201711573941) e3.getCause());
                }
                throw new N11355818201711573941(e3.getMessage(), e3);
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof N11355818201711573941) {
                    throw ((N11355818201711573941) e4.getCause());
                }
                throw e4;
            }
        } catch (N11355818201711573941 e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static Z14368087615735085238 t(Z14368087615735085238 z14368087615735085238, byte[] bArr, R4931231174251890987 r4931231174251890987) {
        int length = bArr.length;
        if (length != 0) {
            Z14368087615735085238 r = z14368087615735085238.r();
            try {
                C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
                c2256474256246444038.getClass();
                Y3341182438442346389 a = c2256474256246444038.a(r.getClass());
                D15735805680132151670 d15735805680132151670 = new D15735805680132151670();
                r4931231174251890987.getClass();
                a.j(r, bArr, 0, length, d15735805680132151670);
                a.b(r);
                z14368087615735085238 = r;
            } catch (N11355818201711573941 e) {
                throw e;
            } catch (U10024139115995659738 e2) {
                throw new N11355818201711573941(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof N11355818201711573941) {
                    throw ((N11355818201711573941) e3.getCause());
                }
                throw new N11355818201711573941(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw N11355818201711573941.e();
            }
        }
        if (z14368087615735085238 == null || n(z14368087615735085238, true)) {
            return z14368087615735085238;
        }
        throw new N11355818201711573941(new U10024139115995659738().getMessage());
    }

    public static void u(Class cls, Z14368087615735085238 z14368087615735085238) {
        z14368087615735085238.p();
        defaultInstanceMap.put(cls, z14368087615735085238);
    }

    @Override // dev.epro.r0.E890218321994133736
    public final int b(Y3341182438442346389 y3341182438442346389) {
        int i;
        int i2;
        if (o()) {
            if (y3341182438442346389 == null) {
                C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
                c2256474256246444038.getClass();
                i2 = c2256474256246444038.a(getClass()).i(this);
            } else {
                i2 = y3341182438442346389.i(this);
            }
            if (i2 >= 0) {
                return i2;
            }
            S10973172697741180971.m(G6547577305291411977.n(i2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (y3341182438442346389 == null) {
            C2256474256246444038 c22564742562464440382 = C2256474256246444038.c;
            c22564742562464440382.getClass();
            i = c22564742562464440382.a(getClass()).i(this);
        } else {
            i = y3341182438442346389.i(this);
        }
        v(i);
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
        c2256474256246444038.getClass();
        return c2256474256246444038.a(getClass()).e(this, (Z14368087615735085238) obj);
    }

    @Override // dev.epro.r0.E890218321994133736
    public final void g(A5011514514014580540 a5011514514014580540) {
        C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
        c2256474256246444038.getClass();
        Y3341182438442346389 a = c2256474256246444038.a(getClass());
        H12843822278061842084 h12843822278061842084 = a5011514514014580540.a;
        if (h12843822278061842084 == null) {
            h12843822278061842084 = new H12843822278061842084(a5011514514014580540);
        }
        a.h(this, h12843822278061842084);
    }

    public final T2502439376570223027 h() {
        return (T2502439376570223027) i(5);
    }

    public final int hashCode() {
        if (o()) {
            C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
            c2256474256246444038.getClass();
            return c2256474256246444038.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C2256474256246444038 c22564742562464440382 = C2256474256246444038.c;
        c22564742562464440382.getClass();
        int f = c22564742562464440382.a(getClass()).f(this);
        this.memoizedHashCode = f;
        return f;
    }

    public abstract Object i(int i);

    @Override // dev.epro.r0.Y337325536156316681
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Z14368087615735085238 a() {
        return (Z14368087615735085238) i(6);
    }

    public final T3521423756786688980 l() {
        return (T3521423756786688980) i(7);
    }

    public final boolean o() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void p() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // dev.epro.r0.E890218321994133736
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final T2502439376570223027 d() {
        return (T2502439376570223027) i(5);
    }

    public final Z14368087615735085238 r() {
        return (Z14368087615735085238) i(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = J847310018696174808.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        J847310018696174808.c(this, sb, 0);
        return sb.toString();
    }

    public final void v(int i) {
        if (i < 0) {
            S10973172697741180971.m(G6547577305291411977.n(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }
}
