package dev.epro.r0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K17275736824900228431 {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public int a = 0;
    public int b = -1;
    public G7436022029974605191 c = G7436022029974605191.e;

    public static K17275736824900228431 b(Class cls) {
        ConcurrentHashMap concurrentHashMap = d;
        K17275736824900228431 k17275736824900228431 = (K17275736824900228431) concurrentHashMap.get(cls);
        if (k17275736824900228431 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                k17275736824900228431 = (K17275736824900228431) concurrentHashMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (k17275736824900228431 != null) {
            return k17275736824900228431;
        }
        try {
            K17275736824900228431 k172757368249002284312 = (K17275736824900228431) ((K17275736824900228431) J3288146055636008296.a.allocateInstance(cls)).a(6);
            if (k172757368249002284312 != null) {
                concurrentHashMap.put(cls, k172757368249002284312);
                return k172757368249002284312;
            }
            Z3383101362411723454.r();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object c(Method method, K17275736824900228431 k17275736824900228431, Object... objArr) {
        try {
            return method.invoke(k17275736824900228431, objArr);
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

    public static final boolean d(K17275736824900228431 k17275736824900228431, boolean z) {
        byte bByteValue = ((Byte) k17275736824900228431.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        X1177226880161088161 x1177226880161088161 = X1177226880161088161.c;
        x1177226880161088161.getClass();
        boolean zC = x1177226880161088161.a(k17275736824900228431.getClass()).c(k17275736824900228431);
        if (z) {
            k17275736824900228431.a(2);
        }
        return zC;
    }

    public Object a(int i) {
        C12371267504993118269 c12371267504993118269;
        switch (L11610354117192841236.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new T14602662695158654172(M732917612736502422.f, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", L6461040371150014214.class});
            case 3:
                return new M732917612736502422();
            case 4:
                return new F11604725069747397103(M732917612736502422.f);
            case 5:
                return M732917612736502422.f;
            case 6:
                C12371267504993118269 c123712675049931182692 = M732917612736502422.g;
                if (c123712675049931182692 != null) {
                    return c123712675049931182692;
                }
                synchronized (M732917612736502422.class) {
                    try {
                        c12371267504993118269 = M732917612736502422.g;
                        if (c12371267504993118269 == null) {
                            c12371267504993118269 = new C12371267504993118269();
                            M732917612736502422.g = c12371267504993118269;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c12371267504993118269;
            default:
                Z3383101362411723454.t();
                return null;
        }
    }

    public final boolean e() {
        return (this.b & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        X1177226880161088161 x1177226880161088161 = X1177226880161088161.c;
        x1177226880161088161.getClass();
        return x1177226880161088161.a(getClass()).f(this, (K17275736824900228431) obj);
    }

    public final K17275736824900228431 f() {
        return (K17275736824900228431) a(4);
    }

    public final int hashCode() {
        if (e()) {
            X1177226880161088161 x1177226880161088161 = X1177226880161088161.c;
            x1177226880161088161.getClass();
            return x1177226880161088161.a(getClass()).e(this);
        }
        int i = this.a;
        if (i != 0) {
            return i;
        }
        X1177226880161088161 x11772268801610881612 = X1177226880161088161.c;
        x11772268801610881612.getClass();
        int iE = x11772268801610881612.a(getClass()).e(this);
        this.a = iE;
        return iE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = H696994863481443468.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        H696994863481443468.c(this, sb, 0);
        return sb.toString();
    }
}
