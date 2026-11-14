package dev.epro.r0;

import android.content.Context;
import dev.epro.mobile.ClientSession;
import dev.epro.mobile.FileDescriptorProtector;
import dev.epro.mobile.RetryHandler;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class H1372144443810590316 extends K2428887461904078363 implements RetryHandler {
    public static final Y6921797927338498306 s;
    public static final Object t;
    public static int u;
    public static final Z11244019023321623390 v;
    public final int g;
    public final Context h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final Object k;
    public final H15186625828076266306 l;
    public final A2789795882633926065 m;
    public X7175349259954592591 n;

    /* renamed from: o, reason: collision with root package name */
    public X7175349259954592591 f263o;
    public ClientSession p;
    public int q;
    public final AtomicInteger r;

    static {
        int nqzmblmkrnco;
        izmyclvb.dpqpjfpoanwt1(1250);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                nqzmblmkrnco = nqzmblmkrnco(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (nqzmblmkrnco != 0) {
                switch (nqzmblmkrnco) {
                    case 1:
                        s = (Y6921797927338498306) objArr[1];
                        continue;
                    case 2:
                        t = objArr[1];
                        continue;
                    case 3:
                        v = (Z11244019023321623390) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public /* synthetic */ H1372144443810590316(Context context, int i, int i2, O18369580107802500074 o18369580107802500074) {
        this(context, ((Integer) wpjtszspddrh(context, i, i2, o18369580107802500074)[0]).intValue());
        tqtisqpmevno();
    }

    private static native int nqzmblmkrnco(Object[] objArr);

    private native void qsvhlpqumsau(Context context, int i);

    private native void tqtisqpmevno();

    private static native Object[] wpjtszspddrh(Context context, int i, int i2, O18369580107802500074 o18369580107802500074);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object a(Map map, K14749510448791472029 k14749510448791472029);

    @Override // dev.epro.r0.N10074157612675057572
    public final native Object b(R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.K2428887461904078363
    public final native H13181800873099545702 f(C13199856549537327585 c13199856549537327585);

    public final native Object n(Map map, K14749510448791472029 k14749510448791472029);

    public final native void o();

    @Override // dev.epro.mobile.RetryHandler
    public final native void onRetry(int i, int i2);

    public final native ClientSession p(ClientSession clientSession);

    public final native ClientSession q();

    public final native Object r(ClientSession clientSession, Map map, K14749510448791472029 k14749510448791472029);

    public final native void s(ClientSession clientSession, String str);

    public final native Object t(ClientSession clientSession, Map map, K14749510448791472029 k14749510448791472029);

    public final native void u();

    public final native Object v(Map map, K14749510448791472029 k14749510448791472029);

    public final native Object w(ClientSession clientSession, Map map, K14749510448791472029 k14749510448791472029);

    public final native void x(ClientSession clientSession);

    public static final class Y6921797927338498306 {
        static {
            izmyclvb.dpqpjfpoanwt1(2228);
        }

        public static native boolean a(Y6921797927338498306 y6921797927338498306, Map map);

        private native void fkteomazknot();

        private native void fnyvqzqekwna(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Y6921797927338498306(O18369580107802500074 o18369580107802500074) {
            this();
            fnyvqzqekwna(o18369580107802500074);
        }

        private Y6921797927338498306() {
            fkteomazknot();
        }
    }

    public static final class Z11244019023321623390 implements FileDescriptorProtector {
        static {
            izmyclvb.dpqpjfpoanwt1(917);
        }

        private native void upifeiuxrnzj();

        @Override // dev.epro.mobile.FileDescriptorProtector
        public final native boolean protect(int i);

        public Z11244019023321623390() {
            upifeiuxrnzj();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1372144443810590316(Context context, int i) {
        super(context);
        context.getClass();
        qsvhlpqumsau(context, i);
    }
}
