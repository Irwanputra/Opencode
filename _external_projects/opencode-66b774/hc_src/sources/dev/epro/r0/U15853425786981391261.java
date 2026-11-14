package dev.epro.r0;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import net.zetetic.database.CursorWindow;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class U15853425786981391261 implements F12600208943493964396 {
    public static final F6906385643859317376 a;
    public static final F6906385643859317376 b;
    public static final Q10847809900677551877 c;
    public static final Q10847809900677551877 d;
    public static final double[][] e;
    public static final G15798799497496144130 f;
    public static final Type[] g;
    public static final B6440366792515411106 h;
    public static final L12293142626931145046 i;
    public static final X18244299380549586254 j;
    public static final X17873598080297061904 k;
    public static final S6349823729575121924 l;
    public static final Y13361005827119333637 m;
    public static final L905776418423859032 n;

    /* renamed from: o, reason: collision with root package name */
    public static final L905776418423859032 f521o;
    public static final L905776418423859032 p;
    public static final H2442898661687873181 q;
    public static Z7022156542152740569 r;

    public static void A(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            W4415201450379021245.a(s(i2, i3, "index"));
        }
    }

    public static void B(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? s(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? s(i3, i4, "end index") : E17665849472693074628.f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void C(String str, boolean z) {
        if (z) {
            return;
        }
        S10973172697741180971.m(str);
    }

    public static Handler D(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15025379344307230271.c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            Q11088980322693754445.k(cause);
            return null;
        }
    }

    public static boolean E(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return E(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static X14364139104409853146 F() {
        J12368838350359828847 j12368838350359828847 = new J12368838350359828847();
        j12368838350359828847.a = Math.max(1.0E-7f, Math.abs(0.1f));
        j12368838350359828847.b = Math.max(1.0E-4f, 1.0f) * (-4.2f);
        return new X14364139104409853146(j12368838350359828847);
    }

    public static final Q9908018528090167751 G(Y3847252189195102539 y3847252189195102539, F4096073349764486348 f4096073349764486348) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            R6653624393204003746 a2 = y3847252189195102539.a();
            H11725168162114556860 h11725168162114556860 = a2.c;
            if (h11725168162114556860.I() && h11725168162114556860.H()) {
                S6349823729575121924 g2 = a2.g();
                Q9908018528090167751 q9908018528090167751 = new Q9908018528090167751(48);
                M9197813449740923653 m9197813449740923653 = new M9197813449740923653((byte) 6);
                m9197813449740923653.o(C775827382551829194.V(g2));
                J(f4096073349764486348, q9908018528090167751, new M9197813449740923653((byte) 6), m9197813449740923653, a2, a2);
                return q9908018528090167751;
            }
            Q9908018528090167751 q99080185280901677512 = C4240022152304578596.a;
            q99080185280901677512.getClass();
            return q99080185280901677512;
        } finally {
            Trace.endSection();
        }
    }

    public static final void H(F4096073349764486348 f4096073349764486348, Q9908018528090167751 q9908018528090167751, M9197813449740923653 m9197813449740923653, M9197813449740923653 m91978134497409236532, R6653624393204003746 r6653624393204003746, R6653624393204003746 r66536243932040037462) {
        List i2;
        M9197813449740923653 m91978134497409236533 = m9197813449740923653;
        Region region = (Region) m91978134497409236533.b;
        M9197813449740923653 m91978134497409236534 = m91978134497409236532;
        Region region2 = (Region) m91978134497409236534.b;
        H11725168162114556860 h11725168162114556860 = r66536243932040037462.c;
        H11725168162114556860 h117251681621145568602 = r66536243932040037462.c;
        if (!h11725168162114556860.I() || !h117251681621145568602.H() || region2.isEmpty()) {
            if (r66536243932040037462.n()) {
                I(q9908018528090167751, r6653624393204003746, r66536243932040037462);
                return;
            }
            return;
        }
        S6349823729575121924 m2 = r66536243932040037462.m();
        if (m2.h()) {
            R16749699847173633337 f2 = r66536243932040037462.f();
            if (f2 == null) {
                I16141028645763443416 i16141028645763443416 = (I16141028645763443416) h117251681621145568602.F.d;
                m2 = V12319504402545346730.z(i16141028645763443416).E(i16141028645763443416, false);
            } else {
                R15896830329318850690 r15896830329318850690 = ((R15896830329318850690) f2).a;
                Object g2 = r66536243932040037462.d.a.g(E5458822993765169982.b);
                if (g2 == null) {
                    g2 = null;
                }
                m2 = E10717724117948616506.i(r15896830329318850690, g2 != null, false);
            }
        }
        I11366018238968599357 V = C775827382551829194.V(m2);
        m91978134497409236533.o(V);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i3 = r66536243932040037462.f;
            if (i3 == r6653624393204003746.f) {
                i3 = -1;
            }
            Rect bounds = region.getBounds();
            q9908018528090167751.i(i3, new D16246464706717523548(r66536243932040037462, new I11366018238968599357(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            i2 = r66536243932040037462.i((r3 & 1) != 0 ? !r66536243932040037462.b : false, (r3 & 2) == 0);
            int size = i2.size() - 1;
            while (-1 < size) {
                if (!((Boolean) f4096073349764486348.invoke(i2.get(size))).booleanValue()) {
                    H(f4096073349764486348, q9908018528090167751, m91978134497409236533, m91978134497409236534, r6653624393204003746, (R6653624393204003746) i2.get(size));
                }
                size--;
                m91978134497409236533 = m9197813449740923653;
                m91978134497409236534 = m91978134497409236532;
            }
            if (U(r66536243932040037462)) {
                region2.op(V.a, V.b, V.c, V.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void I(Q9908018528090167751 q9908018528090167751, R6653624393204003746 r6653624393204003746, R6653624393204003746 r66536243932040037462) {
        H11725168162114556860 h11725168162114556860;
        R6653624393204003746 l2 = r66536243932040037462.l();
        S6349823729575121924 g2 = (l2 == null || (h11725168162114556860 = l2.c) == null || !h11725168162114556860.I()) ? l : l2.g();
        int i2 = r66536243932040037462.f;
        if (i2 == r6653624393204003746.f) {
            i2 = -1;
        }
        q9908018528090167751.i(i2, new D16246464706717523548(r66536243932040037462, C775827382551829194.V(g2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(dev.epro.r0.F4096073349764486348 r17, dev.epro.r0.Q9908018528090167751 r18, dev.epro.r0.M9197813449740923653 r19, dev.epro.r0.M9197813449740923653 r20, dev.epro.r0.R6653624393204003746 r21, dev.epro.r0.R6653624393204003746 r22) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U15853425786981391261.J(dev.epro.r0.F4096073349764486348, dev.epro.r0.Q9908018528090167751, dev.epro.r0.M9197813449740923653, dev.epro.r0.M9197813449740923653, dev.epro.r0.R6653624393204003746, dev.epro.r0.R6653624393204003746):void");
    }

    public static Type K(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return K(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return K(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final Z7022156542152740569 L() {
        Z7022156542152740569 z7022156542152740569 = r;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Hub", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 d2 = G11450220448113054352.d(21.0f, 6.5f);
        d2.e(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        d2.e(0.0f, 0.07f, 0.0f, 0.14f, 0.01f, 0.21f);
        d2.i(-2.03f, 0.68f);
        d2.e(-0.64f, -1.21f, -1.82f, -2.09f, -3.22f, -2.32f);
        d2.r(5.91f);
        d2.d(14.04f, 5.57f, 15.0f, 4.4f, 15.0f, 3.0f);
        d2.e(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        d2.n(9.0f, 1.34f, 9.0f, 3.0f);
        d2.e(0.0f, 1.4f, 0.96f, 2.57f, 2.25f, 2.91f);
        d2.s(2.16f);
        d2.e(-1.4f, 0.23f, -2.58f, 1.11f, -3.22f, 2.32f);
        d2.h(5.99f, 9.71f);
        d2.d(6.0f, 9.64f, 6.0f, 9.57f, 6.0f, 9.5f);
        d2.e(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        d2.o(-3.0f, 1.34f, -3.0f, 3.0f);
        d2.o(1.34f, 3.0f, 3.0f, 3.0f);
        d2.e(1.06f, 0.0f, 1.98f, -0.55f, 2.52f, -1.37f);
        d2.i(2.03f, 0.68f);
        d2.e(-0.2f, 1.29f, 0.17f, 2.66f, 1.09f, 3.69f);
        d2.i(-1.41f, 1.77f);
        d2.d(6.85f, 17.09f, 6.44f, 17.0f, 6.0f, 17.0f);
        d2.e(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        d2.o(1.34f, 3.0f, 3.0f, 3.0f);
        d2.o(3.0f, -1.34f, 3.0f, -3.0f);
        d2.e(0.0f, -0.68f, -0.22f, -1.3f, -0.6f, -1.8f);
        d2.i(1.41f, -1.77f);
        d2.e(1.36f, 0.76f, 3.02f, 0.75f, 4.37f, 0.0f);
        d2.i(1.41f, 1.77f);
        d2.d(15.22f, 18.7f, 15.0f, 19.32f, 15.0f, 20.0f);
        d2.e(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        d2.o(3.0f, -1.34f, 3.0f, -3.0f);
        d2.o(-1.34f, -3.0f, -3.0f, -3.0f);
        d2.e(-0.44f, 0.0f, -0.85f, 0.09f, -1.23f, 0.26f);
        d2.i(-1.41f, -1.77f);
        d2.e(0.93f, -1.04f, 1.29f, -2.4f, 1.09f, -3.69f);
        d2.i(2.03f, -0.68f);
        d2.e(0.53f, 0.82f, 1.46f, 1.37f, 2.52f, 1.37f);
        d2.e(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        d2.n(22.66f, 6.5f, 21.0f, 6.5f);
        d2.c();
        d2.j(3.0f, 10.5f);
        d2.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d2.o(1.0f, 0.45f, 1.0f, 1.0f);
        d2.d(4.0f, 10.05f, 3.55f, 10.5f, 3.0f, 10.5f);
        d2.c();
        d2.j(6.0f, 21.0f);
        d2.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d2.o(1.0f, 0.45f, 1.0f, 1.0f);
        d2.d(7.0f, 20.55f, 6.55f, 21.0f, 6.0f, 21.0f);
        d2.c();
        d2.j(11.0f, 3.0f);
        d2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d2.o(1.0f, 0.45f, 1.0f, 1.0f);
        d2.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d2.n(11.0f, 3.55f, 11.0f, 3.0f);
        d2.c();
        d2.j(12.0f, 15.0f);
        d2.e(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        d2.e(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        d2.o(2.5f, 1.12f, 2.5f, 2.5f);
        d2.d(14.5f, 13.88f, 13.38f, 15.0f, 12.0f, 15.0f);
        d2.c();
        d2.j(18.0f, 19.0f);
        d2.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d2.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d2.o(-1.0f, -0.45f, -1.0f, -1.0f);
        d2.d(17.0f, 19.45f, 17.45f, 19.0f, 18.0f, 19.0f);
        d2.c();
        d2.j(21.0f, 10.5f);
        d2.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d2.e(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d2.o(1.0f, 0.45f, 1.0f, 1.0f);
        d2.d(22.0f, 10.05f, 21.55f, 10.5f, 21.0f, 10.5f);
        d2.c();
        Q17593287602150918564.a(q17593287602150918564, d2.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        r = b2;
        return b2;
    }

    public static final X13682529397961211704 M(G8001132634698687269 g8001132634698687269) {
        X13682529397961211704 x13682529397961211704 = (X13682529397961211704) g8001132634698687269.get(N5158094851646208854.j);
        if (x13682529397961211704 != null) {
            return x13682529397961211704;
        }
        S10973172697741180971.m("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static Class N(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) N(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return N(((WildcardType) type).getUpperBounds()[0]);
        }
        S10973172697741180971.l("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static Type O(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return a0(type, cls, K(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static native byte[] Q(String str, int i2, String str2, Integer num);

    public static final I1722681268793429505 R(I1722681268793429505 i1722681268793429505) {
        return i1722681268793429505.Q0(new E12121029824354643887(f521o));
    }

    public static final boolean S(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean T(R6653624393204003746 r6653624393204003746) {
        Y4989033692226475498 d2 = r6653624393204003746.d();
        A4559761392562572984 a4559761392562572984 = r6653624393204003746.d.a;
        return (d2 != null ? d2.n1() : false) || a4559761392562572984.c(D10671166500636893138.q) || a4559761392562572984.c(D10671166500636893138.p);
    }

    public static final boolean U(R6653624393204003746 r6653624393204003746) {
        if (!T(r6653624393204003746)) {
            E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
            if (e10198359844879945462.c) {
                return true;
            }
            A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
            Object[] objArr = a4559761392562572984.b;
            Object[] objArr2 = a4559761392562572984.c;
            long[] jArr = a4559761392562572984.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((P14992748401341948828) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static final I1722681268793429505 V(I1722681268793429505 i1722681268793429505) {
        return i1722681268793429505.Q0(new E12121029824354643887(p));
    }

    public static T16846362121353535418 W(M12396306005833971742 m12396306005833971742, D14731132657808549702 d14731132657808549702) {
        T5990920249823963282 e2;
        D14731132657808549702 d147311326578085497022;
        D14731132657808549702 d147311326578085497023 = D14731132657808549702.d0;
        D14731132657808549702 d147311326578085497024 = D14731132657808549702.b0;
        D14731132657808549702 d147311326578085497025 = D14731132657808549702.a0;
        D14731132657808549702 d147311326578085497026 = D14731132657808549702.Z;
        D14731132657808549702 d147311326578085497027 = D14731132657808549702.X;
        D14731132657808549702 d147311326578085497028 = D14731132657808549702.Y;
        D14731132657808549702 d147311326578085497029 = D14731132657808549702.W;
        F14641504636625371985 A = I13467738468329653747.A();
        String y = m12396306005833971742.x().y();
        A.e();
        ((I13467738468329653747) A.b).D(y);
        N17666688112968464504 z = m12396306005833971742.x().z();
        A.e();
        ((I13467738468329653747) A.b).E(z);
        A.e();
        ((I13467738468329653747) A.b).C(D16925706105132416423.RAW);
        try {
            I13467738468329653747 B = I13467738468329653747.B(((I13467738468329653747) A.b()).e(), R4931231174251890987.a());
            B4512085422902578073 b4512085422902578073 = B4512085422902578073.b;
            I1632105416032993715 d2 = I1632105416032993715.d(B.y(), O8620973563946607355.F(B.x()), B.z());
            if (((H12952893160333227181) b4512085422902578073.a.get()).d.containsKey((String) d2.c)) {
                H12952893160333227181 h12952893160333227181 = (H12952893160333227181) b4512085422902578073.a.get();
                h12952893160333227181.getClass();
                String str = (String) d2.c;
                HashMap hashMap = h12952893160333227181.d;
                if (!hashMap.containsKey(str)) {
                    throw new GeneralSecurityException(G6547577305291411977.s("No Parameters Parser for requested key type ", str, " available"));
                }
                e2 = ((L12293142626931145046) hashMap.get(str)).b.e(d2);
            } else {
                e2 = new V5443054910857193357(d2);
            }
            if (e2 instanceof T1031997469743650177) {
                d147311326578085497022 = d147311326578085497029;
            } else if (e2 instanceof E16335363679722729023) {
                d147311326578085497022 = d147311326578085497028;
            } else if (e2 instanceof H358978911853820691) {
                d147311326578085497022 = d147311326578085497027;
            } else if (e2 instanceof A17163912561928975531) {
                d147311326578085497022 = d147311326578085497026;
            } else if (e2 instanceof W4043777213630942564) {
                d147311326578085497022 = d147311326578085497025;
            } else {
                if (!(e2 instanceof Z14277976092397041931)) {
                    throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(e2)));
                }
                d147311326578085497022 = d147311326578085497024;
            }
            if (d14731132657808549702 == D14731132657808549702.k0) {
                d147311326578085497023 = D14731132657808549702.c0;
            } else if (d14731132657808549702 != D14731132657808549702.m0) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(d14731132657808549702)));
            }
            String y2 = m12396306005833971742.y();
            V6719956433280724295 v6719956433280724295 = (V6719956433280724295) e2;
            if (y2 == null) {
                W4415201450379021245.c("kekUri must be set");
                return null;
            }
            if (v6719956433280724295 == null) {
                W4415201450379021245.c("dekParametersForNewKeys must be set");
                return null;
            }
            if (v6719956433280724295.a()) {
                W4415201450379021245.c("dekParametersForNewKeys must not have ID Requirements");
                return null;
            }
            if ((d147311326578085497022 == d147311326578085497029 && (v6719956433280724295 instanceof T1031997469743650177)) || ((d147311326578085497022 == d147311326578085497028 && (v6719956433280724295 instanceof E16335363679722729023)) || ((d147311326578085497022 == d147311326578085497027 && (v6719956433280724295 instanceof H358978911853820691)) || ((d147311326578085497022 == d147311326578085497026 && (v6719956433280724295 instanceof A17163912561928975531)) || ((d147311326578085497022 == d147311326578085497025 && (v6719956433280724295 instanceof W4043777213630942564)) || (d147311326578085497022 == d147311326578085497024 && (v6719956433280724295 instanceof Z14277976092397041931))))))) {
                return new T16846362121353535418(d147311326578085497023, y2, d147311326578085497022, v6719956433280724295);
            }
            throw new GeneralSecurityException(E12098517352909843120.m("Cannot use parsing strategy ", d147311326578085497022.b, " when new keys are picked according to ", String.valueOf(v6719956433280724295), "."));
        } catch (IOException e3) {
            throw new GeneralSecurityException("Failed to parse proto", e3);
        }
    }

    public static final native byte[] X(String str, byte[] bArr);

    public static final native String Y(int i2);

    public static final native void Z(JSONObject jSONObject, Set set);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final dev.epro.r0.B13729205492206812220 r20, final dev.epro.r0.T15443218846549482730 r21, dev.epro.r0.I1722681268793429505 r22, dev.epro.r0.L12639328004344855510 r23, final dev.epro.r0.L12639328004344855510 r24, final dev.epro.r0.L12639328004344855510 r25, dev.epro.r0.I5573661370475160895 r26, long r27, long r29, long r31, long r33, dev.epro.r0.V11842483535419227802 r35, dev.epro.r0.M3727281027331139839 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U15853425786981391261.a(dev.epro.r0.B13729205492206812220, dev.epro.r0.T15443218846549482730, dev.epro.r0.I1722681268793429505, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.I5573661370475160895, long, long, long, long, dev.epro.r0.V11842483535419227802, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0144, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f A[EDGE_INSN: B:24:0x013f->B:25:0x013f BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [dev.epro.r0.W9347513935391659791] */
    /* JADX WARN: Type inference failed for: r12v4, types: [dev.epro.r0.W9347513935391659791] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type a0(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U15853425786981391261.a0(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static final void b(I1722681268793429505 i1722681268793429505, G15527156457921655762 g15527156457921655762, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2, int i3) {
        int i4;
        m3727281027331139839.b0(380139498);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= m3727281027331139839.f(g15527156457921655762) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i7 |= m3727281027331139839.h(t15443218846549482730) ? 2048 : 1024;
        }
        if (m3727281027331139839.R(i7 & 1, (i7 & 1171) != 1170)) {
            if (i5 != 0) {
                i1722681268793429505 = V10993962107938880611.a;
            }
            if (i6 != 0) {
                g15527156457921655762 = T13350664027331345869.b;
            }
            A10838822263452390785 c2 = Z6714950837425363575.c(g15527156457921655762, false);
            boolean f2 = m3727281027331139839.f(c2) | ((i7 & 7168) == 2048);
            Object M = m3727281027331139839.M();
            if (f2 || M == O9023047933786425027.a) {
                M = new T14793413619962821194(c2, t15443218846549482730, (byte) 9);
                m3727281027331139839.k0(M);
            }
            Z860808776098365610.s(i1722681268793429505, (L12639328004344855510) M, m3727281027331139839, i7 & 14, 0);
        } else {
            m3727281027331139839.U();
        }
        I1722681268793429505 i17226812687934295052 = i1722681268793429505;
        G15527156457921655762 g155271564579216557622 = g15527156457921655762;
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new Y9834606254624701618(i17226812687934295052, g155271564579216557622, t15443218846549482730, i2, i3, (byte) 1);
        }
    }

    public static final native String b0(J17212163343241671962 j17212163343241671962);

    public static final void c(boolean z, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, boolean z2, T1056749650218919949 t1056749650218919949, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        I1722681268793429505 i17226812687934295052;
        boolean z3;
        T1056749650218919949 t10567496502189199492;
        I1722681268793429505 i17226812687934295053;
        boolean z4;
        T1056749650218919949 t10567496502189199493;
        int i4;
        boolean z5;
        B13729205492206812220 b13729205492206812220;
        m3727281027331139839.b0(-1406741137);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(f4096073349764486348) ? 32 : 16;
        }
        int i5 = i3 | 3456;
        if ((i2 & 24576) == 0) {
            i5 = i3 | 11648;
        }
        int i6 = 196608 | i5;
        byte b2 = 0;
        if (m3727281027331139839.R(i6 & 1, (74899 & i6) != 74898)) {
            m3727281027331139839.W();
            if ((i2 & 1) == 0 || m3727281027331139839.z()) {
                T1056749650218919949 x = M18113111391818111737.x(m3727281027331139839);
                i17226812687934295053 = V10993962107938880611.a;
                z4 = true;
                t10567496502189199493 = x;
                i4 = i6 & (-57345);
                z5 = true;
            } else {
                m3727281027331139839.U();
                i17226812687934295053 = i1722681268793429505;
                i4 = i6 & (-57345);
                z4 = true;
                z5 = z2;
                t10567496502189199493 = t1056749650218919949;
            }
            m3727281027331139839.r();
            float floor = (float) Math.floor(((R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h)).K(2.0f));
            Y16443381041276641359 y16443381041276641359 = z ? Y16443381041276641359.a : Y16443381041276641359.b;
            if (f4096073349764486348 != null) {
                m3727281027331139839.a0(2066152950);
                boolean z6 = (i4 & 112) == 32 ? z4 : false;
                if ((i4 & 14) != 4) {
                    z4 = false;
                }
                boolean z7 = z6 | z4;
                Object M = m3727281027331139839.M();
                if (z7 || M == O9023047933786425027.a) {
                    M = new B15606428212249790928(b2, f4096073349764486348, z);
                    m3727281027331139839.k0(M);
                }
                b13729205492206812220 = (B13729205492206812220) M;
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(2066218639);
                m3727281027331139839.q(false);
                b13729205492206812220 = null;
            }
            boolean z8 = z5;
            r(y16443381041276641359, b13729205492206812220, new I1470541803076273897(floor, 0.0f, 2, 0, 26), new I1470541803076273897(floor, 0.0f, 0, 0, 30), i17226812687934295053, z8, t10567496502189199493, m3727281027331139839, (i4 << 6) & 33546240);
            i17226812687934295052 = i17226812687934295053;
            z3 = z8;
            t10567496502189199492 = t10567496502189199493;
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            z3 = z2;
            t10567496502189199492 = t1056749650218919949;
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new J1323968941346626023(z, f4096073349764486348, i17226812687934295052, z3, t10567496502189199492, i2);
        }
    }

    public static M12396306005833971742 c0(T16846362121353535418 t16846362121353535418) {
        V6719956433280724295 v6719956433280724295 = t16846362121353535418.d;
        HashMap hashMap = ((H12952893160333227181) B4512085422902578073.b.a.get()).c;
        if (!hashMap.containsKey(v6719956433280724295.getClass())) {
            throw new GeneralSecurityException(G6547577305291411977.s("No Key Format serializer for ", String.valueOf(v6719956433280724295.getClass()), " available"));
        }
        I1632105416032993715 f2 = ((B6440366792515411106) hashMap.get(v6719956433280724295.getClass())).b.f(v6719956433280724295);
        F14641504636625371985 A = I13467738468329653747.A();
        String str = (String) f2.c;
        A.e();
        ((I13467738468329653747) A.b).D(str);
        N17666688112968464504 n17666688112968464504 = (N17666688112968464504) f2.b;
        A.e();
        ((I13467738468329653747) A.b).E(n17666688112968464504);
        D16925706105132416423 V = O8620973563946607355.V((D14731132657808549702) f2.d);
        A.e();
        ((I13467738468329653747) A.b).C(V);
        try {
            I13467738468329653747 B = I13467738468329653747.B(((I13467738468329653747) A.b()).e(), R4931231174251890987.a());
            P12600058785035584028 z = M12396306005833971742.z();
            String str2 = t16846362121353535418.b;
            z.e();
            ((M12396306005833971742) z.b).C(str2);
            z.e();
            ((M12396306005833971742) z.b).B(B);
            return (M12396306005833971742) z.b();
        } catch (N11355818201711573941 e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r23, dev.epro.r0.Y16443381041276641359 r24, dev.epro.r0.I1722681268793429505 r25, dev.epro.r0.T1056749650218919949 r26, final dev.epro.r0.I1470541803076273897 r27, final dev.epro.r0.I1470541803076273897 r28, dev.epro.r0.M3727281027331139839 r29, int r30) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U15853425786981391261.d(boolean, dev.epro.r0.Y16443381041276641359, dev.epro.r0.I1722681268793429505, dev.epro.r0.T1056749650218919949, dev.epro.r0.I1470541803076273897, dev.epro.r0.I1470541803076273897, dev.epro.r0.M3727281027331139839, int):void");
    }

    public static final native void e(String str, long j2, long j3, long j4, I1722681268793429505 i1722681268793429505, boolean z, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final I1722681268793429505 e0(I1722681268793429505 i1722681268793429505) {
        return i1722681268793429505.Q0(new E12121029824354643887(n));
    }

    public static final native void f(boolean z, boolean z2, boolean z3, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, B13729205492206812220 b137292054922068122204, M3727281027331139839 m3727281027331139839, int i2);

    public static final native B17506143144194406905 f0(V2752370975180060115 v2752370975180060115);

    public static final native void g(long j2, F2652319623815706820 f2652319623815706820, D16513696335383100591 d16513696335383100591, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native String g0(byte[] bArr);

    public static final native void h(boolean z, String str, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2);

    public static String h0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final native void i(Z12230432157744414222 z12230432157744414222, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Removed duplicated region for block: B:119:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i0(android.view.inputmethod.EditorInfo r16, java.lang.CharSequence r17, long r18, dev.epro.r0.T8337309744439716006 r20) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U15853425786981391261.i0(android.view.inputmethod.EditorInfo, java.lang.CharSequence, long, dev.epro.r0.T8337309744439716006):void");
    }

    public static final native void j(Z12230432157744414222 z12230432157744414222, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2);

    public static native void j0(int i2, String str, String str2);

    public static final native void k(Z12230432157744414222 z12230432157744414222, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(String str, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ba, code lost:
    
        if (r53.g(false) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d5, code lost:
    
        if (r53.d(1) == false) goto L194;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0375 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(dev.epro.r0.I1722681268793429505 r41, final dev.epro.r0.G16768067413993841943 r42, final dev.epro.r0.T1241271073913685060 r43, final dev.epro.r0.Q12103736865181728683 r44, final boolean r45, final dev.epro.r0.N11829648573770870927 r46, int r47, final dev.epro.r0.P2382941533350862833 r48, dev.epro.r0.J13386303774951932313 r49, final dev.epro.r0.O15869581661108952313 r50, final dev.epro.r0.E12579343433108873398 r51, final dev.epro.r0.T15443218846549482730 r52, dev.epro.r0.M3727281027331139839 r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U15853425786981391261.m(dev.epro.r0.I1722681268793429505, dev.epro.r0.G16768067413993841943, dev.epro.r0.T1241271073913685060, dev.epro.r0.Q12103736865181728683, boolean, dev.epro.r0.N11829648573770870927, int, dev.epro.r0.P2382941533350862833, dev.epro.r0.J13386303774951932313, dev.epro.r0.O15869581661108952313, dev.epro.r0.E12579343433108873398, dev.epro.r0.T15443218846549482730, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void n(String str, int i2, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void o(A16842337154698931828 a16842337154698931828, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, L12639328004344855510 l126393280043448555103, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(boolean z, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(String str, int i2, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, boolean z, W17015830374102496917 w17015830374102496917, String str2, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final void r(Y16443381041276641359 y16443381041276641359, B13729205492206812220 b13729205492206812220, I1470541803076273897 i1470541803076273897, I1470541803076273897 i14705418030762738972, I1722681268793429505 i1722681268793429505, boolean z, T1056749650218919949 t1056749650218919949, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        Y16443381041276641359 y164433810412766413592;
        int i4;
        I1722681268793429505 i17226812687934295052;
        m3727281027331139839.b0(-406243761);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.d(y16443381041276641359.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(b13729205492206812220) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(i1470541803076273897) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.h(i14705418030762738972) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m3727281027331139839.f(t1056749650218919949) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= m3727281027331139839.f(null) ? 8388608 : 4194304;
        }
        if (m3727281027331139839.R(i3 & 1, (4793491 & i3) != 4793490)) {
            m3727281027331139839.W();
            if ((i2 & 1) != 0 && !m3727281027331139839.z()) {
                m3727281027331139839.U();
            }
            m3727281027331139839.r();
            I1722681268793429505 i17226812687934295053 = V10993962107938880611.a;
            if (b13729205492206812220 != null) {
                i4 = i3;
                y164433810412766413592 = y16443381041276641359;
                i17226812687934295052 = O8620973563946607355.Y(y164433810412766413592, M3862790495145116409.a(G18207866021774821160.d / 2.0f, 4, 0L, false), z, new H10924029057425269323(1), b13729205492206812220);
            } else {
                y164433810412766413592 = y16443381041276641359;
                i4 = i3;
                i17226812687934295052 = i17226812687934295053;
            }
            if (b13729205492206812220 != null) {
                F7206147944927503893 f7206147944927503893 = E11606037000563084849.a;
                i17226812687934295053 = D15216840398887440549.a;
            }
            int i5 = i4 << 6;
            d(z, y164433810412766413592, Q13169198992966610970.f0(i1722681268793429505.Q0(i17226812687934295053).Q0(i17226812687934295052), 2.0f), t1056749650218919949, i1470541803076273897, i14705418030762738972, m3727281027331139839, ((i4 >> 15) & 14) | ((i4 << 3) & 112) | ((i4 >> 9) & 7168) | (57344 & i5) | (i5 & 458752));
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new G13316295172010118610(y16443381041276641359, b13729205492206812220, i1470541803076273897, i14705418030762738972, i1722681268793429505, z, t1056749650218919949, i2);
        }
    }

    public static String s(int i2, int i3, String str) {
        if (i2 < 0) {
            return E17665849472693074628.f("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return E17665849472693074628.f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        S10973172697741180971.j(G6547577305291411977.n(i3, "negative size: "));
        return null;
    }

    public static void t(long j2, P5176232750190581838 p5176232750190581838, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            S10973172697741180971.j("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((P5124777957357031757) arrayList4.get(i9)).b() < i8) {
                S10973172697741180971.j("Failed requirement.");
                return;
            }
        }
        P5124777957357031757 p5124777957357031757 = (P5124777957357031757) arrayList.get(i3);
        P5124777957357031757 p51247779573570317572 = (P5124777957357031757) arrayList4.get(i4 - 1);
        if (i8 == p5124777957357031757.b()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            P5124777957357031757 p51247779573570317573 = (P5124777957357031757) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            p5124777957357031757 = p51247779573570317573;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (p5124777957357031757.e(i8) == p51247779573570317572.e(i8)) {
            int min = Math.min(p5124777957357031757.b(), p51247779573570317572.b());
            int i11 = 0;
            for (int i12 = i8; i12 < min && p5124777957357031757.e(i12) == p51247779573570317572.e(i12); i12++) {
                i11++;
            }
            long j4 = (p5176232750190581838.b / 4) + j2 + 2 + i11 + 1;
            p5176232750190581838.G(-i11);
            p5176232750190581838.G(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                p5176232750190581838.G(p5124777957357031757.e(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((P5124777957357031757) arrayList4.get(i5)).b()) {
                    p5176232750190581838.G(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    S10973172697741180971.m("Check failed.");
                    return;
                }
            }
            P5176232750190581838 p51762327501905818382 = new P5176232750190581838();
            p5176232750190581838.G(((int) ((p51762327501905818382.b / 4) + j4)) * (-1));
            t(j4, p51762327501905818382, i13, arrayList4, i5, i4, arrayList5);
            p5176232750190581838.C(p51762327501905818382);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((P5124777957357031757) arrayList4.get(i15 - 1)).e(i8) != ((P5124777957357031757) arrayList4.get(i15)).e(i8)) {
                i14++;
            }
        }
        long j5 = (p5176232750190581838.b / 4) + j2 + 2 + (i14 * 2);
        p5176232750190581838.G(i14);
        p5176232750190581838.G(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int e2 = ((P5124777957357031757) arrayList4.get(i16)).e(i8);
            if (i16 == i5 || e2 != ((P5124777957357031757) arrayList4.get(i16 - 1)).e(i8)) {
                p5176232750190581838.G(e2 & 255);
            }
        }
        P5176232750190581838 p51762327501905818383 = new P5176232750190581838();
        int i17 = i5;
        while (i17 < i4) {
            byte e3 = ((P5124777957357031757) arrayList4.get(i17)).e(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (e3 != ((P5124777957357031757) arrayList4.get(i19)).e(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((P5124777957357031757) arrayList4.get(i17)).b()) {
                p5176232750190581838.G(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                p5176232750190581838.G(((int) ((p51762327501905818383.b / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                t(j3, p51762327501905818383, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        p5176232750190581838.C(p51762327501905818383);
    }

    public static final float u(X14364139104409853146 x14364139104409853146, float f2, float f3) {
        X6460762560403092052 x6460762560403092052 = x14364139104409853146.a;
        I13752901056665676111 i13752901056665676111 = new I13752901056665676111(0.0f);
        int b2 = i13752901056665676111.b();
        int i2 = 0;
        while (i2 < b2) {
            i13752901056665676111.e(i2, x6460762560403092052.i(i2 == 0 ? f2 : 0.0f, i2 == 0 ? f3 : 0.0f));
            i2++;
        }
        return i13752901056665676111.a;
    }

    public static Type v(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new M17331104998503967627(v(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new S3746654492080191549(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new M17331104998503967627(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new W9347513935391659791(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void w(int i2, int i3) {
        String f2;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                f2 = E17665849472693074628.f("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    S10973172697741180971.j(G6547577305291411977.n(i3, "negative size: "));
                    return;
                }
                f2 = E17665849472693074628.f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(f2);
        }
    }

    public static void x(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void y(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static void z(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            S10973172697741180971.j("Primitive type is not allowed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float P(I11571046933844109529 i11571046933844109529) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d0(I11571046933844109529 i11571046933844109529, float f2) {
        throw null;
    }

    static {
        izmyclvb.qgayjvbiagej2(804);
        a = new F6906385643859317376(-1.0f);
        b = new F6906385643859317376(1.0f);
        c = new Q10847809900677551877(-1.0f);
        d = new Q10847809900677551877(1.0f);
        e = new double[][]{new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
        f = new G15798799497496144130(null, new M3397403720270972864());
        g = new Type[0];
        h = new B6440366792515411106(T16846362121353535418.class, new D11988991656201568495((byte) 9));
        i = new L12293142626931145046("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", new D11988991656201568495((byte) 10));
        j = new X18244299380549586254(H11662549649512977837.class, new D11988991656201568495((byte) 11));
        k = new X17873598080297061904("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", new D11988991656201568495((byte) 12));
        l = new S6349823729575121924(0.0f, 0.0f, 10.0f, 10.0f);
        m = new Y13361005827119333637((byte) 25);
        n = new L905776418423859032((byte) 26);
        f521o = new L905776418423859032((byte) 27);
        p = new L905776418423859032((byte) 28);
        q = new H2442898661687873181((byte) 4);
    }
}
