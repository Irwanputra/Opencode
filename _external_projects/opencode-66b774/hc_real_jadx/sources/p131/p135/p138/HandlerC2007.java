package p131.p135.p138;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p131.p135.p136.C1973;
import p131.p135.p137.C1978;
import p131.p135.p142.InterfaceC2020;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class HandlerC2007 extends Handler {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC2020 f8731;

    public HandlerC2007(InterfaceC2020 interfaceC2020) {
        super(Looper.getMainLooper());
        this.f8731 = interfaceC2020;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        InterfaceC2020 interfaceC2020 = this.f8731;
        if (interfaceC2020 != null) {
            C1973 c1973 = (C1973) message.obj;
            long j = c1973.f8591;
            long j2 = c1973.f8592;
            ((C1978) interfaceC2020).f8605.f8642 = (int) ((j * 100) / j2);
        }
    }
}
