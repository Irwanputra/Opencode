package dev.epro.r0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class O14224444921942744471 extends K2428887461904078363 {
    public static final Z11244019023321623390 A;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final I1208608441944109573 k;
    public Map l;
    public int m;
    public final M13389864142310742121 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y3978536533230235023 f399o;
    public volatile boolean p;
    public X7175349259954592591 q;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList t;
    public final ArrayList u;
    public final LinkedHashMap v;
    public final LinkedHashMap w;
    public X7175349259954592591 x;
    public volatile A2789795882633926065 y;
    public volatile A2789795882633926065 z;

    static {
        int iWeefxkvxzftq;
        izmyclvb.dpqpjfpoanwt1(179);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iWeefxkvxzftq = weefxkvxzftq(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iWeefxkvxzftq != 0) {
                switch (iWeefxkvxzftq) {
                    case 1:
                        A = (Z11244019023321623390) objArr[1];
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
    public /* synthetic */ O14224444921942744471(Context context, String str, int i, int i2, int i3, I1208608441944109573 i1208608441944109573, int i4, O18369580107802500074 o18369580107802500074) {
        Object[] objArrBjvkbfxqsgst = bjvkbfxqsgst(context, str, i, i2, i3, i1208608441944109573, i4, o18369580107802500074);
        this((Context) objArrBjvkbfxqsgst[0], (String) objArrBjvkbfxqsgst[1], ((Integer) objArrBjvkbfxqsgst[2]).intValue(), ((Integer) objArrBjvkbfxqsgst[3]).intValue(), ((Integer) objArrBjvkbfxqsgst[4]).intValue(), (I1208608441944109573) objArrBjvkbfxqsgst[5]);
        kfylurhzppxc();
    }

    private static native Object[] bjvkbfxqsgst(Context context, String str, int i, int i2, int i3, I1208608441944109573 i1208608441944109573, int i4, O18369580107802500074 o18369580107802500074);

    private native void kfylurhzppxc();

    private native void mjxtvyozicjb(Context context, String str, int i, int i2, int i3, I1208608441944109573 i1208608441944109573);

    private static native int weefxkvxzftq(Object[] objArr);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object a(Map map, K14749510448791472029 k14749510448791472029);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object b(R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.K2428887461904078363, dev.epro.r0.N10074157612675057572
    public final native void e(Map map);

    @Override // dev.epro.r0.K2428887461904078363
    public final native H13181800873099545702 f(C13199856549537327585 c13199856549537327585);

    public final native void n();

    public final native void o();

    public final native Object p(Map map, boolean z, K14749510448791472029 k14749510448791472029);

    public final native Object q(Map map, H11447663531303461354 h11447663531303461354);

    public final native Object r(Exception exc, Z9935799240085017032 z9935799240085017032);

    public final native boolean s(Map map);

    public final native Object t(JSONObject jSONObject, E8498068484119189664 e8498068484119189664, boolean z, boolean z2, Z9935799240085017032 z9935799240085017032);

    public final native void u();

    public final native Object v(K8819398004986373241 k8819398004986373241, K14749510448791472029 k14749510448791472029);

    public final native Object w(K14749510448791472029 k14749510448791472029);

    public final native Object x(E8498068484119189664 e8498068484119189664, int i, K14749510448791472029 k14749510448791472029);

    public final native void y();

    public final native Object z(Map map, K14749510448791472029 k14749510448791472029);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1407);
        }

        private native void mdtsatrutqxd();

        private native void zmhschklzyhi(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            zmhschklzyhi(o18369580107802500074);
        }

        private Z11244019023321623390() {
            mdtsatrutqxd();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O14224444921942744471(Context context, String str, int i, int i2, int i3, I1208608441944109573 i1208608441944109573) {
        super(context);
        context.getClass();
        str.getClass();
        i1208608441944109573.getClass();
        mjxtvyozicjb(context, str, i, i2, i3, i1208608441944109573);
    }
}
