package p131.p161.p162.p163.p190;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぷぞてのほき.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2337 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C2337 f9621;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f9623 = new Object();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Handler f9622 = new Handler(Looper.getMainLooper(), new C2339());

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぷぞてのほき.びぐびあび$〺つふすそ, reason: contains not printable characters */
    public static class C2338 {
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぷぞてのほき.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2339 implements Handler.Callback {
        public C2339() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C2337 c2337 = C2337.this;
            C2338 c2338 = (C2338) message.obj;
            synchronized (c2337.f9623) {
                if (c2338 == null) {
                    c2338.getClass();
                    throw null;
                }
            }
            return true;
        }
    }
}
