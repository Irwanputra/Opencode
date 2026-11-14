package dev.epro.r0;

import android.content.Context;
import dev.epro.xray.ConnectionDestinationListener;
import dev.epro.xray.Controller;
import dev.epro.xray.RuntimeCallback;
import dev.epro.xray.SocketProtector;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class I1208608441944109573 {
    public static final Y11460403151847909905 c;
    public static final Object d;
    public static final AtomicBoolean e;
    public static final Y6921797927338498306 f;
    public static final Z11244019023321623390 g;
    public static volatile Controller h;
    public static volatile M8128317349740850300 i;
    public static K12173450025780201993 j;
    public static X17069491719885005511 k;
    public static volatile long l;
    public final Context a;
    public final B18437066071346442440 b;

    static {
        int mgiirnozaqdv;
        izmyclvb.dpqpjfpoanwt1(1959);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                mgiirnozaqdv = mgiirnozaqdv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (mgiirnozaqdv != 0) {
                switch (mgiirnozaqdv) {
                    case 1:
                        c = (Y11460403151847909905) objArr[1];
                        continue;
                    case 2:
                        d = objArr[1];
                        continue;
                    case 3:
                        e = (AtomicBoolean) objArr[1];
                        continue;
                    case 4:
                        f = (Y6921797927338498306) objArr[1];
                        continue;
                    case 5:
                        g = (Z11244019023321623390) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void a(Controller controller, ConnectionDestinationListener connectionDestinationListener);

    public static native void d();

    private static native int mgiirnozaqdv(Object[] objArr);

    private native void qbkajjgncumz(Context context);

    public final native void b();

    public final native void c(String str, M8128317349740850300 m8128317349740850300, C17680375646888910079 c17680375646888910079);

    public final native String e(String str);

    public static final class Y11460403151847909905 {
        static {
            izmyclvb.dpqpjfpoanwt1(1621);
        }

        private native void giqtfvbjsoqu(O18369580107802500074 o18369580107802500074);

        private native void zgauwpbcgyzy();

        public /* synthetic */ Y11460403151847909905(O18369580107802500074 o18369580107802500074) {
            this();
            giqtfvbjsoqu(o18369580107802500074);
        }

        private Y11460403151847909905() {
            zgauwpbcgyzy();
        }
    }

    public static final class Y6921797927338498306 implements SocketProtector {
        static {
            izmyclvb.dpqpjfpoanwt1(299);
        }

        private native void entqqzjqhwpi();

        @Override // dev.epro.xray.SocketProtector
        public final native boolean protect(long j);

        public Y6921797927338498306() {
            entqqzjqhwpi();
        }
    }

    public static final class Z11244019023321623390 implements RuntimeCallback {
        static {
            izmyclvb.dpqpjfpoanwt1(2056);
        }

        private native void oiovdlwlrzpg();

        @Override // dev.epro.xray.RuntimeCallback
        public final native long onStarted();

        @Override // dev.epro.xray.RuntimeCallback
        public final native long onStatus(long j, String str);

        @Override // dev.epro.xray.RuntimeCallback
        public final native long onStopped();

        public Z11244019023321623390() {
            oiovdlwlrzpg();
        }
    }

    public I1208608441944109573(Context context) {
        context.getClass();
        qbkajjgncumz(context);
    }
}
