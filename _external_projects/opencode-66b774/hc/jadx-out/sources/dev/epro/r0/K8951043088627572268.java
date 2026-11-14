package dev.epro.r0;

import android.content.Context;
import dev.epro.r0.L11552167475775786673;
import java.util.Arrays;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class K8951043088627572268 extends K2428887461904078363 implements L11657701423026125920 {
    public static final Z11244019023321623390 E;
    public Map A;
    public volatile A2789795882633926065 B;
    public A2789795882633926065 C;
    public final Object D;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public W4445408150576281555 k;
    public F6942723054099263096 l;
    public V4617472272554968715 m;
    public T3983923074066333145 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final G2603555235288011698 f335o;
    public final M13389864142310742121 p;
    public final E13395689114940028192 q;
    public volatile L11552167475775786673.Y6921797927338498306 r;
    public X7175349259954592591 s;
    public X7175349259954592591 t;
    public X7175349259954592591 u;
    public int v;
    public volatile boolean w;
    public final W6885733510616988743 x;
    public X7175349259954592591 y;
    public A3366276765765134789 z;

    static {
        int iWkmorozqgtyr;
        izmyclvb.dpqpjfpoanwt1(2314);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iWkmorozqgtyr = wkmorozqgtyr(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iWkmorozqgtyr != 0) {
                switch (iWkmorozqgtyr) {
                    case 1:
                        E = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ K8951043088627572268(Context context, String str, int i, int i2, int i3, int i4, O18369580107802500074 o18369580107802500074) {
        Object[] objArrAoafjmxzrkfs = aoafjmxzrkfs(context, str, i, i2, i3, i4, o18369580107802500074);
        this((Context) objArrAoafjmxzrkfs[0], (String) objArrAoafjmxzrkfs[1], ((Integer) objArrAoafjmxzrkfs[2]).intValue(), ((Integer) objArrAoafjmxzrkfs[3]).intValue(), ((Integer) objArrAoafjmxzrkfs[4]).intValue());
        actejncxqzii();
    }

    private native void actejncxqzii();

    private static native Object[] aoafjmxzrkfs(Context context, String str, int i, int i2, int i3, int i4, O18369580107802500074 o18369580107802500074);

    private native void epqqgzelhbxx(Context context, String str, int i, int i2, int i3);

    private static native int wkmorozqgtyr(Object[] objArr);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object a(Map map, K14749510448791472029 k14749510448791472029);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object b(R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.K2428887461904078363, dev.epro.r0.N10074157612675057572
    public final native void e(Map map);

    @Override // dev.epro.r0.K2428887461904078363
    public final native H13181800873099545702 f(C13199856549537327585 c13199856549537327585);

    @Override // dev.epro.r0.K2428887461904078363
    public final native void m(X11638668447546090163 x11638668447546090163);

    public final native void n(boolean z);

    public final native Object o(W4445408150576281555 w4445408150576281555, int i, K14749510448791472029 k14749510448791472029);

    public final native void p(Throwable th);

    public final native Object q(Map map, long j, Q7086272697370073556 q7086272697370073556);

    public final native boolean r();

    public final native Object s(int i, int i2, Q7086272697370073556 q7086272697370073556);

    public final native void t();

    public final native Object u(K14749510448791472029 k14749510448791472029);

    public final native void v();

    public final native Object w(O10781065997450475496 o10781065997450475496, T375046127829823728 t375046127829823728);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(784);
        }

        private native void shyyamtrjeki(O18369580107802500074 o18369580107802500074);

        private native void zmcvjgxvkfol();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            shyyamtrjeki(o18369580107802500074);
        }

        private Z11244019023321623390() {
            zmcvjgxvkfol();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8951043088627572268(Context context, String str, int i, int i2, int i3) {
        super(context);
        context.getClass();
        str.getClass();
        epqqgzelhbxx(context, str, i, i2, i3);
    }
}
