package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class cu0 extends ads_mobile_sdk.g {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    private static final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.Object> parserOrInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    public ads_mobile_sdk.bm3 b;
    private int memoizedSerializedSize;

    public cu0() {
        this.a = 0;
        this.memoizedSerializedSize = -1;
        this.b = ads_mobile_sdk.bm3.f;
    }

    public static ads_mobile_sdk.cu0 a(ads_mobile_sdk.cu0 cu0Var, ads_mobile_sdk.tu tuVar, ads_mobile_sdk.nl0 nl0Var) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0Var2 = (ads_mobile_sdk.cu0) cu0Var.a(4, (ads_mobile_sdk.cu0) null);
        try {
            ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
            hn2Var.getClass();
            dev.epro.r0.G18207276409179303092 g18207276409179303092A = hn2Var.a(cu0Var2.getClass());
            dev.epro.r0.E17564419012940707302 e17564419012940707302 = tuVar.d;
            if (e17564419012940707302 == null) {
                e17564419012940707302 = new dev.epro.r0.E17564419012940707302(tuVar);
            }
            g18207276409179303092A.a(cu0Var2, e17564419012940707302, nl0Var);
            g18207276409179303092A.c(cu0Var2);
            return cu0Var2;
        } catch (ads_mobile_sdk.yi1 e) {
            if (e.a) {
                throw new ads_mobile_sdk.yi1(e.getMessage(), e);
            }
            throw e;
        } catch (dev.epro.r0.B13173120941733133417 e2) {
            dev.epro.r0.Z3383101362411723454.o(e2.getMessage());
            return null;
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof ads_mobile_sdk.yi1) {
                throw ((ads_mobile_sdk.yi1) e3.getCause());
            }
            throw new ads_mobile_sdk.yi1(e3.getMessage(), e3);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof ads_mobile_sdk.yi1) {
                throw ((ads_mobile_sdk.yi1) e4.getCause());
            }
            throw e4;
        }
    }

    public abstract java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var);

    public final ads_mobile_sdk.au0 e() {
        return (ads_mobile_sdk.au0) a(5, (ads_mobile_sdk.cu0) null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
        hn2Var.getClass();
        return hn2Var.a(getClass()).b(this, (ads_mobile_sdk.cu0) obj);
    }

    public final int hashCode() {
        if (j()) {
            ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
            hn2Var.getClass();
            return hn2Var.a(getClass()).d(this);
        }
        int i = this.a;
        if (i != 0) {
            return i;
        }
        ads_mobile_sdk.hn2 hn2Var2 = ads_mobile_sdk.hn2.c;
        hn2Var2.getClass();
        int iD = hn2Var2.a(getClass()).d(this);
        this.a = iD;
        return iD;
    }

    public final ads_mobile_sdk.bu0 i() {
        java.lang.Class<?> cls = getClass();
        java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.Object> concurrentMap = parserOrInstanceMap;
        java.lang.Object obj = concurrentMap.get(cls);
        if (obj == null) {
            a(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            dev.epro.r0.S10973172697741180971.m("Default instance cannot be null.");
            return null;
        }
        if (obj instanceof ads_mobile_sdk.bu0) {
            return (ads_mobile_sdk.bu0) obj;
        }
        ads_mobile_sdk.bu0 bu0Var = new ads_mobile_sdk.bu0((ads_mobile_sdk.cu0) obj);
        return concurrentMap.replace(cls, obj, bu0Var) ? bu0Var : (ads_mobile_sdk.bu0) concurrentMap.get(cls);
    }

    public final boolean j() {
        return this.memoizedSerializedSize < 0;
    }

    public final void k() {
        ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
        hn2Var.getClass();
        hn2Var.a(getClass()).c(this);
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final void l() {
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final ads_mobile_sdk.au0 n() {
        ads_mobile_sdk.au0 au0Var = (ads_mobile_sdk.au0) a(5, (ads_mobile_sdk.cu0) null);
        au0Var.a(this);
        return au0Var;
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        char[] cArr = ads_mobile_sdk.np1.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        ads_mobile_sdk.np1.a(this, sb, 0);
        return sb.toString();
    }

    public static void a(ads_mobile_sdk.cu0 cu0Var) {
        if (cu0Var == null || m2a(cu0Var)) {
            return;
        }
        dev.epro.r0.Z3383101362411723454.o(new dev.epro.r0.B13173120941733133417().getMessage());
    }

    @Override // ads_mobile_sdk.g
    public final int a(dev.epro.r0.G18207276409179303092 g18207276409179303092) {
        int iB;
        int iB2;
        if (j()) {
            if (g18207276409179303092 == null) {
                ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
                hn2Var.getClass();
                iB2 = hn2Var.a(getClass()).b(this);
            } else {
                iB2 = g18207276409179303092.b(this);
            }
            if (iB2 >= 0) {
                return iB2;
            }
            dev.epro.r0.S10973172697741180971.m(dev.epro.r0.G6547577305291411977.n(iB2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize & MEMOIZED_SERIALIZED_SIZE_MASK;
        if (i != MEMOIZED_SERIALIZED_SIZE_MASK) {
            return i;
        }
        if (g18207276409179303092 == null) {
            ads_mobile_sdk.hn2 hn2Var2 = ads_mobile_sdk.hn2.c;
            hn2Var2.getClass();
            iB = hn2Var2.a(getClass()).b(this);
        } else {
            iB = g18207276409179303092.b(this);
        }
        a(iB);
        return iB;
    }

    public static java.lang.Object a(java.lang.reflect.Method method, ads_mobile_sdk.cu0 cu0Var, java.lang.Object... objArr) {
        try {
            return method.invoke(cu0Var, objArr);
        } catch (java.lang.IllegalAccessException e) {
            dev.epro.r0.Z3383101362411723454.m("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (!(cause instanceof java.lang.RuntimeException)) {
                if (!(cause instanceof java.lang.Error)) {
                    dev.epro.r0.Z3383101362411723454.m("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((java.lang.Error) cause);
            }
            throw ((java.lang.RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m2a(ads_mobile_sdk.cu0 cu0Var) {
        java.lang.Object objA = cu0Var.a(1, (ads_mobile_sdk.cu0) null);
        if (objA != null) {
            if (objA instanceof java.lang.Byte) {
                byte bByteValue = ((java.lang.Byte) objA).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue == 0) {
                        return false;
                    }
                }
            }
            ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
            hn2Var.getClass();
            boolean zA = hn2Var.a(cu0Var.getClass()).a(cu0Var);
            cu0Var.a(2, zA ? cu0Var : null);
            return zA;
        }
        return true;
    }

    public static ads_mobile_sdk.cu0 a(ads_mobile_sdk.cu0 cu0Var, byte[] bArr, int i, ads_mobile_sdk.nl0 nl0Var) throws ads_mobile_sdk.yi1 {
        if (i == 0) {
            return cu0Var;
        }
        ads_mobile_sdk.cu0 cu0Var2 = (ads_mobile_sdk.cu0) cu0Var.a(4, (ads_mobile_sdk.cu0) null);
        try {
            ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
            hn2Var.getClass();
            dev.epro.r0.G18207276409179303092 g18207276409179303092A = hn2Var.a(cu0Var2.getClass());
            g18207276409179303092A.a(cu0Var2, bArr, 0, i, new dev.epro.r0.D15735805680132151670());
            g18207276409179303092A.c(cu0Var2);
            return cu0Var2;
        } catch (ads_mobile_sdk.yi1 e) {
            if (e.a) {
                throw new ads_mobile_sdk.yi1(e.getMessage(), e);
            }
            throw e;
        } catch (dev.epro.r0.B13173120941733133417 e2) {
            dev.epro.r0.Z3383101362411723454.o(e2.getMessage());
            return null;
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof ads_mobile_sdk.yi1) {
                throw ((ads_mobile_sdk.yi1) e3.getCause());
            }
            throw new ads_mobile_sdk.yi1(e3.getMessage(), e3);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            dev.epro.r0.Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static void a(java.lang.Class cls, ads_mobile_sdk.cu0 cu0Var) {
        cu0Var.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
        parserOrInstanceMap.put(cls, cu0Var);
    }

    public final void a(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & MEMOIZED_SERIALIZED_SIZE_MASK) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            dev.epro.r0.S10973172697741180971.m(dev.epro.r0.G6547577305291411977.n(i, "serialized size must be non-negative, was "));
        }
    }

    public final void a(ads_mobile_sdk.yu yuVar) {
        ads_mobile_sdk.hn2 hn2Var = ads_mobile_sdk.hn2.c;
        hn2Var.getClass();
        dev.epro.r0.G18207276409179303092 g18207276409179303092A = hn2Var.a(getClass());
        ads_mobile_sdk.w8 w8Var = (ads_mobile_sdk.w8) yuVar.a;
        if (w8Var == null) {
            w8Var = new ads_mobile_sdk.w8(yuVar);
        }
        g18207276409179303092A.a(this, w8Var);
    }

    public static ads_mobile_sdk.cu0 a(java.lang.Class cls) {
        java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.Object> concurrentMap = parserOrInstanceMap;
        java.lang.Object obj = concurrentMap.get(cls);
        if (obj == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                obj = concurrentMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (obj == null) {
            try {
                obj = ((ads_mobile_sdk.au0) ((ads_mobile_sdk.cu0) ads_mobile_sdk.pm3.a.allocateInstance(cls)).a(5, (ads_mobile_sdk.cu0) null)).a;
                if (obj != null) {
                    concurrentMap.put(cls, obj);
                } else {
                    dev.epro.r0.Z3383101362411723454.r();
                    return null;
                }
            } catch (java.lang.InstantiationException e2) {
                throw new java.lang.IllegalStateException(e2);
            }
        }
        if (obj instanceof ads_mobile_sdk.cu0) {
            return (ads_mobile_sdk.cu0) obj;
        }
        return ((ads_mobile_sdk.bu0) obj).a;
    }
}
