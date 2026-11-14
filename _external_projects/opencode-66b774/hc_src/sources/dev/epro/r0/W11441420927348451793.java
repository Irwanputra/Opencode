package dev.epro.r0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W11441420927348451793 implements Handler.Callback {
    public final /* synthetic */ K4690422250417820120 a;

    public /* synthetic */ W11441420927348451793(K4690422250417820120 k4690422250417820120) {
        this.a = k4690422250417820120;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            K4690422250417820120 k4690422250417820120 = this.a;
            synchronized (k4690422250417820120.a) {
                try {
                    B7526239878873455655 b7526239878873455655 = (B7526239878873455655) message.obj;
                    F14087932618967811298 f14087932618967811298 = (F14087932618967811298) k4690422250417820120.a.get(b7526239878873455655);
                    if (f14087932618967811298 != null && f14087932618967811298.a.isEmpty()) {
                        if (f14087932618967811298.c) {
                            B7526239878873455655 b75262398788734556552 = f14087932618967811298.e;
                            K4690422250417820120 k46904222504178201202 = f14087932618967811298.g;
                            k46904222504178201202.c.removeMessages(1, b75262398788734556552);
                            k46904222504178201202.d.J(k46904222504178201202.b, f14087932618967811298);
                            f14087932618967811298.c = false;
                            f14087932618967811298.b = (byte) 2;
                        }
                        k4690422250417820120.a.remove(b7526239878873455655);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        K4690422250417820120 k46904222504178201203 = this.a;
        synchronized (k46904222504178201203.a) {
            try {
                B7526239878873455655 b75262398788734556553 = (B7526239878873455655) message.obj;
                F14087932618967811298 f140879326189678112982 = (F14087932618967811298) k46904222504178201203.a.get(b75262398788734556553);
                if (f140879326189678112982 != null && f140879326189678112982.b == 3) {
                    new StringBuilder(String.valueOf(b75262398788734556553).length() + 47);
                    new Exception();
                    ComponentName componentName = f140879326189678112982.f;
                    if (componentName == null) {
                        b75262398788734556553.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        b75262398788734556553.getClass();
                        componentName = new ComponentName("com.google.android.gms", "unknown");
                    }
                    f140879326189678112982.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
