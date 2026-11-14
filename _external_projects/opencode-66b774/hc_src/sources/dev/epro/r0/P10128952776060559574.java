package dev.epro.r0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import dev.epro.r0.F16625700751214468455;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class P10128952776060559574 implements Application.ActivityLifecycleCallbacks {
    public static final /* synthetic */ int i = 0;
    public final Context a;
    public final F5424571050510598400 b;
    public final ConnectivityManager c;
    public final Q16245624053836091346 d;
    public A2789795882633926065 e;
    public X7175349259954592591 f;
    public int g;
    public volatile boolean h;

    public static final /* synthetic */ class H4191455248956457601 extends H4611829575853284164 implements L12639328004344855510 {
        static {
            izmyclvb.dpqpjfpoanwt1(1553);
        }

        private native void kqnfpisiupux();

        @Override // dev.epro.r0.L12639328004344855510
        public final native Object invoke(Object obj, Object obj2);

        public H4191455248956457601(Object obj) {
            super(2, obj, D5801834531757281099.class, izmyclvb.sb250e956f549(573), izmyclvb.sb250e956f549(574), 0);
            kqnfpisiupux();
        }
    }

    public static final /* synthetic */ class W6795409416048214137 extends H4611829575853284164 implements F4096073349764486348 {
        static {
            izmyclvb.dpqpjfpoanwt1(1487);
        }

        private native void xvtpiqlipvkj();

        @Override // dev.epro.r0.F4096073349764486348
        public final native Object invoke(Object obj);

        public W6795409416048214137(Object obj) {
            super(1, obj, P10128952776060559574.class, izmyclvb.sb250e956f549(575), izmyclvb.sb250e956f549(576), 0);
            xvtpiqlipvkj();
        }
    }

    public static final class Y11460403151847909905 extends R14062301455140331524 implements L12639328004344855510 {
        public boolean t;
        public /* synthetic */ Object u;

        static {
            izmyclvb.dpqpjfpoanwt1(457);
        }

        private native void yppjdujmgvhg();

        @Override // dev.epro.r0.B401944902727389462
        public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

        @Override // dev.epro.r0.L12639328004344855510
        public final native Object invoke(Object obj, Object obj2);

        @Override // dev.epro.r0.B401944902727389462
        public final native Object invokeSuspend(Object obj);

        public Y11460403151847909905(R4833348786910499294 r4833348786910499294) {
            super(2, r4833348786910499294);
            yppjdujmgvhg();
        }
    }

    public static final class Y6921797927338498306 extends R14062301455140331524 implements F4096073349764486348 {
        public F16625700751214468455.Z11244019023321623390 t;
        public boolean u;

        static {
            izmyclvb.dpqpjfpoanwt1(1375);
        }

        private native void fdgitchalncs();

        @Override // dev.epro.r0.F4096073349764486348
        public final native Object invoke(Object obj);

        @Override // dev.epro.r0.B401944902727389462
        public final native Object invokeSuspend(Object obj);

        public Y6921797927338498306(R4833348786910499294 r4833348786910499294) {
            super(1, r4833348786910499294);
            fdgitchalncs();
        }
    }

    static {
        izmyclvb.dpqpjfpoanwt1(153);
        fzzppdfuiioo();
    }

    private native void aikzrfasqidz(Context context);

    private static native void fzzppdfuiioo();

    public final native boolean a();

    public final native Object b(K14749510448791472029 k14749510448791472029);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityCreated(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityStopped(Activity activity);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(819);
        }

        private native void aruscvtcmibi();

        private native void fdyctvtshzhi(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            fdyctvtshzhi(o18369580107802500074);
        }

        private Z11244019023321623390() {
            aruscvtcmibi();
        }
    }

    public P10128952776060559574(Context context) {
        context.getClass();
        aikzrfasqidz(context);
    }
}
