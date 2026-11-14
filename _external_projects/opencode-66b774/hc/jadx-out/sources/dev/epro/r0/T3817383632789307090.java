package dev.epro.r0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T3817383632789307090 extends E10304945778167701561 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, T3817383632789307090> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected Q11287569198401486162 unknownFields;

    public T3817383632789307090() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = Q11287569198401486162.f;
    }

    public static T3817383632789307090 d(Class cls) {
        T3817383632789307090 t3817383632789307090 = defaultInstanceMap.get(cls);
        if (t3817383632789307090 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t3817383632789307090 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t3817383632789307090 != null) {
            return t3817383632789307090;
        }
        try {
            T3817383632789307090 t38173836327893070902 = (T3817383632789307090) ((T3817383632789307090) P4046997492550522548.a.allocateInstance(cls)).c(6);
            if (t38173836327893070902 != null) {
                defaultInstanceMap.put(cls, t38173836327893070902);
                return t38173836327893070902;
            }
            Z3383101362411723454.r();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object e(Method method, T3817383632789307090 t3817383632789307090, Object... objArr) {
        try {
            return method.invoke(t3817383632789307090, objArr);
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

    public static final boolean f(T3817383632789307090 t3817383632789307090, boolean z) {
        byte bByteValue = ((Byte) t3817383632789307090.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
        x8293765978123339002.getClass();
        boolean zC = x8293765978123339002.a(t3817383632789307090.getClass()).c(t3817383632789307090);
        if (z) {
            t3817383632789307090.c(2);
        }
        return zC;
    }

    public static void j(Class cls, T3817383632789307090 t3817383632789307090) {
        t3817383632789307090.h();
        defaultInstanceMap.put(cls, t3817383632789307090);
    }

    @Override // dev.epro.r0.E10304945778167701561
    public final int a(B8838962141159673445 b8838962141159673445) {
        int iG;
        int iG2;
        if (g()) {
            if (b8838962141159673445 == null) {
                X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
                x8293765978123339002.getClass();
                iG2 = x8293765978123339002.a(getClass()).g(this);
            } else {
                iG2 = b8838962141159673445.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            S10973172697741180971.m(G6547577305291411977.n(iG2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (b8838962141159673445 == null) {
            X8293765978123339002 x82937659781233390022 = X8293765978123339002.c;
            x82937659781233390022.getClass();
            iG = x82937659781233390022.a(getClass()).g(this);
        } else {
            iG = b8838962141159673445.g(this);
        }
        k(iG);
        return iG;
    }

    @Override // dev.epro.r0.E10304945778167701561
    public final void b(W12822723367527402820 w12822723367527402820) {
        X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
        x8293765978123339002.getClass();
        B8838962141159673445 b8838962141159673445A = x8293765978123339002.a(getClass());
        H12843822278061842084 h12843822278061842084 = w12822723367527402820.a;
        if (h12843822278061842084 == null) {
            h12843822278061842084 = new H12843822278061842084(w12822723367527402820);
        }
        b8838962141159673445A.h(this, h12843822278061842084);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
        x8293765978123339002.getClass();
        return x8293765978123339002.a(getClass()).f(this, (T3817383632789307090) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
            x8293765978123339002.getClass();
            return x8293765978123339002.a(getClass()).i(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        X8293765978123339002 x82937659781233390022 = X8293765978123339002.c;
        x82937659781233390022.getClass();
        int i2 = x82937659781233390022.a(getClass()).i(this);
        this.memoizedHashCode = i2;
        return i2;
    }

    public final T3817383632789307090 i() {
        return (T3817383632789307090) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            S10973172697741180971.m(G6547577305291411977.n(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = R6988991907010222968.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        R6988991907010222968.c(this, sb, 0);
        return sb.toString();
    }
}
