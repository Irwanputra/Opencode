package ads_mobile_sdk;

import dev.epro.r0.B13173120941733133417;
import dev.epro.r0.D15735805680132151670;
import dev.epro.r0.E17564419012940707302;
import dev.epro.r0.G18207276409179303092;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3383101362411723454;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class cu0 extends g {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    private static final ConcurrentMap<Class<?>, Object> parserOrInstanceMap = new ConcurrentHashMap();
    public bm3 b;
    private int memoizedSerializedSize;

    public cu0() {
        this.a = 0;
        this.memoizedSerializedSize = -1;
        this.b = bm3.f;
    }

    public static cu0 a(cu0 cu0Var, tu tuVar, nl0 nl0Var) {
        cu0 cu0Var2 = (cu0) cu0Var.a(4, (cu0) null);
        try {
            hn2 hn2Var = hn2.c;
            hn2Var.getClass();
            G18207276409179303092 g18207276409179303092A = hn2Var.a(cu0Var2.getClass());
            E17564419012940707302 e17564419012940707302 = tuVar.d;
            if (e17564419012940707302 == null) {
                e17564419012940707302 = new E17564419012940707302(tuVar);
            }
            g18207276409179303092A.a(cu0Var2, e17564419012940707302, nl0Var);
            g18207276409179303092A.c(cu0Var2);
            return cu0Var2;
        } catch (yi1 e) {
            if (e.a) {
                throw new yi1(e.getMessage(), e);
            }
            throw e;
        } catch (B13173120941733133417 e2) {
            Z3383101362411723454.o(e2.getMessage());
            return null;
        } catch (IOException e3) {
            if (e3.getCause() instanceof yi1) {
                throw ((yi1) e3.getCause());
            }
            throw new yi1(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof yi1) {
                throw ((yi1) e4.getCause());
            }
            throw e4;
        }
    }

    public abstract Object a(int i, cu0 cu0Var);

    public final au0 e() {
        return (au0) a(5, (cu0) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hn2 hn2Var = hn2.c;
        hn2Var.getClass();
        return hn2Var.a(getClass()).b(this, (cu0) obj);
    }

    public final int hashCode() {
        if (j()) {
            hn2 hn2Var = hn2.c;
            hn2Var.getClass();
            return hn2Var.a(getClass()).d(this);
        }
        int i = this.a;
        if (i != 0) {
            return i;
        }
        hn2 hn2Var2 = hn2.c;
        hn2Var2.getClass();
        int iD = hn2Var2.a(getClass()).d(this);
        this.a = iD;
        return iD;
    }

    public final bu0 i() {
        Class<?> cls = getClass();
        ConcurrentMap<Class<?>, Object> concurrentMap = parserOrInstanceMap;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            a(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            S10973172697741180971.m("Default instance cannot be null.");
            return null;
        }
        if (obj instanceof bu0) {
            return (bu0) obj;
        }
        bu0 bu0Var = new bu0((cu0) obj);
        return concurrentMap.replace(cls, obj, bu0Var) ? bu0Var : (bu0) concurrentMap.get(cls);
    }

    public final boolean j() {
        return this.memoizedSerializedSize < 0;
    }

    public final void k() {
        hn2 hn2Var = hn2.c;
        hn2Var.getClass();
        hn2Var.a(getClass()).c(this);
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final void l() {
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final au0 n() {
        au0 au0Var = (au0) a(5, (cu0) null);
        au0Var.a(this);
        return au0Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = np1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        np1.a(this, sb, 0);
        return sb.toString();
    }

    public static void a(cu0 cu0Var) throws yi1 {
        if (cu0Var == null || m1a(cu0Var)) {
            return;
        }
        Z3383101362411723454.o(new B13173120941733133417().getMessage());
    }

    @Override // ads_mobile_sdk.g
    public final int a(G18207276409179303092 g18207276409179303092) {
        int iB;
        int iB2;
        if (j()) {
            if (g18207276409179303092 == null) {
                hn2 hn2Var = hn2.c;
                hn2Var.getClass();
                iB2 = hn2Var.a(getClass()).b(this);
            } else {
                iB2 = g18207276409179303092.b(this);
            }
            if (iB2 >= 0) {
                return iB2;
            }
            S10973172697741180971.m(G6547577305291411977.n(iB2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize & MEMOIZED_SERIALIZED_SIZE_MASK;
        if (i != MEMOIZED_SERIALIZED_SIZE_MASK) {
            return i;
        }
        if (g18207276409179303092 == null) {
            hn2 hn2Var2 = hn2.c;
            hn2Var2.getClass();
            iB = hn2Var2.a(getClass()).b(this);
        } else {
            iB = g18207276409179303092.b(this);
        }
        a(iB);
        return iB;
    }

    public static Object a(Method method, cu0 cu0Var, Object... objArr) {
        try {
            return method.invoke(cu0Var, objArr);
        } catch (IllegalAccessException e) {
            Z3383101362411723454.m("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    Z3383101362411723454.m("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m1a(cu0 cu0Var) {
        Object objA = cu0Var.a(1, (cu0) null);
        if (objA != null) {
            if (objA instanceof Byte) {
                byte bByteValue = ((Byte) objA).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue == 0) {
                        return false;
                    }
                }
            }
            hn2 hn2Var = hn2.c;
            hn2Var.getClass();
            boolean zA = hn2Var.a(cu0Var.getClass()).a(cu0Var);
            cu0Var.a(2, zA ? cu0Var : null);
            return zA;
        }
        return true;
    }

    public static cu0 a(cu0 cu0Var, byte[] bArr, int i, nl0 nl0Var) throws yi1 {
        if (i == 0) {
            return cu0Var;
        }
        cu0 cu0Var2 = (cu0) cu0Var.a(4, (cu0) null);
        try {
            hn2 hn2Var = hn2.c;
            hn2Var.getClass();
            G18207276409179303092 g18207276409179303092A = hn2Var.a(cu0Var2.getClass());
            g18207276409179303092A.a(cu0Var2, bArr, 0, i, new D15735805680132151670());
            g18207276409179303092A.c(cu0Var2);
            return cu0Var2;
        } catch (yi1 e) {
            if (e.a) {
                throw new yi1(e.getMessage(), e);
            }
            throw e;
        } catch (B13173120941733133417 e2) {
            Z3383101362411723454.o(e2.getMessage());
            return null;
        } catch (IOException e3) {
            if (e3.getCause() instanceof yi1) {
                throw ((yi1) e3.getCause());
            }
            throw new yi1(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static void a(Class cls, cu0 cu0Var) {
        cu0Var.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
        parserOrInstanceMap.put(cls, cu0Var);
    }

    public final void a(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & MEMOIZED_SERIALIZED_SIZE_MASK) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            S10973172697741180971.m(G6547577305291411977.n(i, "serialized size must be non-negative, was "));
        }
    }

    public final void a(yu yuVar) {
        hn2 hn2Var = hn2.c;
        hn2Var.getClass();
        G18207276409179303092 g18207276409179303092A = hn2Var.a(getClass());
        w8 w8Var = (w8) yuVar.a;
        if (w8Var == null) {
            w8Var = new w8(yuVar);
        }
        g18207276409179303092A.a((Object) this, w8Var);
    }

    public static cu0 a(Class cls) {
        ConcurrentMap<Class<?>, Object> concurrentMap = parserOrInstanceMap;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                obj = concurrentMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (obj == null) {
            try {
                obj = ((au0) ((cu0) pm3.a.allocateInstance(cls)).a(5, (cu0) null)).a;
                if (obj != null) {
                    concurrentMap.put(cls, obj);
                } else {
                    Z3383101362411723454.r();
                    return null;
                }
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            }
        }
        if (obj instanceof cu0) {
            return (cu0) obj;
        }
        return ((bu0) obj).a;
    }
}
