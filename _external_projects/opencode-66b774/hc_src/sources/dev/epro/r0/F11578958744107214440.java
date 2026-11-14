package dev.epro.r0;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class F11578958744107214440 extends K2428887461904078363 implements D1801154100011832581 {
    public static final Z11244019023321623390 r;
    public static final List s;
    public final String g;
    public final S17255966974483065294 h;
    public final S14249227312368728278 i;
    public final S17255966974483065294 j;
    public final S14249227312368728278 k;
    public A2789795882633926065 l;
    public Q3762757301212051156 m;
    public X7175349259954592591 n;

    /* renamed from: o, reason: collision with root package name */
    public X7175349259954592591 f231o;
    public boolean p;
    public boolean q;

    static {
        int xauqqrxhyndv;
        izmyclvb.dpqpjfpoanwt1(253);
        Object[] objArr = new Object[11];
        while (true) {
            try {
                xauqqrxhyndv = xauqqrxhyndv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (xauqqrxhyndv != 0) {
                switch (xauqqrxhyndv) {
                    case 1:
                        r = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        s = (List) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void pkxfuryvqmmo(Context context, String str);

    private static native int xauqqrxhyndv(Object[] objArr);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object a(Map map, K14749510448791472029 k14749510448791472029);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object b(R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.K2428887461904078363, dev.epro.r0.N10074157612675057572
    public final native void e(Map map);

    @Override // dev.epro.r0.K2428887461904078363
    public final native H13181800873099545702 f(C13199856549537327585 c13199856549537327585);

    public final native Object n(boolean z, K14749510448791472029 k14749510448791472029);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1689);
        }

        private native void rrequegeanuc(O18369580107802500074 o18369580107802500074);

        private native void svuvylvngqgn();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            rrequegeanuc(o18369580107802500074);
        }

        private Z11244019023321623390() {
            svuvylvngqgn();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F11578958744107214440(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        pkxfuryvqmmo(context, str);
    }
}
