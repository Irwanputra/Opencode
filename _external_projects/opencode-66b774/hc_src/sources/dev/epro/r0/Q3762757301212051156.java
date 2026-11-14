package dev.epro.r0;

import android.content.Context;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class Q3762757301212051156 extends K2428887461904078363 {
    public static final P8646985343900033725 u;
    public final String g;
    public final CopyOnWriteArrayList h;
    public T13399098270394742793 i;
    public boolean j;
    public A2789795882633926065 k;
    public final ArrayList l;
    public final ConcurrentHashMap m;
    public final ConcurrentHashMap n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f453o;
    public final Set p;
    public final ConcurrentHashMap q;
    public final Set r;
    public boolean s;
    public volatile boolean t;

    static {
        int lsqevmxkzepp;
        izmyclvb.qgayjvbiagej2(781);
        Object[] objArr = new Object[6];
        while (true) {
            try {
                lsqevmxkzepp = lsqevmxkzepp(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (lsqevmxkzepp != 0) {
                switch (lsqevmxkzepp) {
                    case 1:
                        u = (P8646985343900033725) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int lsqevmxkzepp(Object[] objArr);

    public static native Integer n(Set set);

    private native void pfbqyfaprath(Context context, String str);

    public static native D17147830760578482761 s(ArrayList arrayList, String str, String str2, boolean z, F4096073349764486348 f4096073349764486348);

    public static native boolean u(Map map);

    public static native int x(Map map);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object a(Map map, K14749510448791472029 k14749510448791472029);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object b(R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.K2428887461904078363, dev.epro.r0.N10074157612675057572
    public final native void e(Map map);

    @Override // dev.epro.r0.K2428887461904078363
    public final native H13181800873099545702 f(C13199856549537327585 c13199856549537327585);

    public final native Object o(List list, AbstractMap abstractMap, K14749510448791472029 k14749510448791472029);

    public final native Object p(List list, AbstractMap abstractMap, Set set, B6422008915496466102 b6422008915496466102, String str, int i, int i2, K14749510448791472029 k14749510448791472029);

    public final native void q();

    public final native Object r(boolean z, K14749510448791472029 k14749510448791472029);

    public final native Object t(T13328233054345968915 t13328233054345968915, K14749510448791472029 k14749510448791472029);

    public final native Object v(String str, int i, List list, C13199856549537327585 c13199856549537327585, R14062301455140331524 r14062301455140331524);

    public final native Object w(N10074157612675057572 n10074157612675057572, T11338436074515341790 t11338436074515341790, Z2863930927384056858 z2863930927384056858);

    public final native Object y(String str, int i, int i2, int i3, K14749510448791472029 k14749510448791472029);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(540);
        }

        private native void krccrrfqqqsu();

        private native void xlpuvsnnajnh(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            xlpuvsnnajnh(o18369580107802500074);
        }

        private Z11244019023321623390() {
            krccrrfqqqsu();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3762757301212051156(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        pfbqyfaprath(context, str);
    }
}
