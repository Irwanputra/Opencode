package p131.p135.p138;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p131.p135.p136.C1973;
import p131.p135.p142.InterfaceC2025;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class HandlerC2005 extends Handler {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC2025 f8728;

    public HandlerC2005(InterfaceC2025 interfaceC2025) {
        super(Looper.getMainLooper());
        this.f8728 = interfaceC2025;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        InterfaceC2025 interfaceC2025 = this.f8728;
        if (interfaceC2025 != null) {
            C1973 c1973 = (C1973) message.obj;
            interfaceC2025.mo4014(c1973.f8591, c1973.f8592);
        }
    }
}
