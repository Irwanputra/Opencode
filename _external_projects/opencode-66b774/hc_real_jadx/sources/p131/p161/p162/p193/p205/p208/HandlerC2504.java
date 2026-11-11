package p131.p161.p162.p193.p205.p208;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.ぶでにく〼〳, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class HandlerC2504 extends Handler {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ AbstractC2501 f9850;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2504(AbstractC2501 abstractC2501, Looper looper) {
        super(looper);
        this.f9850 = abstractC2501;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m4522(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        TListener tlistener;
        InterfaceC2491 interfaceC2491;
        InterfaceC2491 interfaceC24912;
        ConnectionResult connectionResult;
        boolean zzakq;
        ConnectionResult connectionResult2;
        boolean z;
        if (this.f9850.zzfyx.get() != message.arg1) {
            if (m4522(message)) {
                ((AbstractC2479) message.obj).m4510();
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || i == 4 || i == 5) && !this.f9850.isConnecting()) {
            ((AbstractC2479) message.obj).m4510();
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.f9850.zzfyv = new ConnectionResult(message.arg2);
            zzakq = this.f9850.zzakq();
            if (zzakq) {
                z = this.f9850.zzfyw;
                if (!z) {
                    this.f9850.zza(3, (int) null);
                    return;
                }
            }
            connectionResult2 = this.f9850.zzfyv;
            ConnectionResult connectionResult3 = connectionResult2 != null ? this.f9850.zzfyv : new ConnectionResult(8);
            this.f9850.zzfym.mo4514(connectionResult3);
            this.f9850.onConnectionFailed(connectionResult3);
            return;
        }
        if (i2 == 5) {
            connectionResult = this.f9850.zzfyv;
            ConnectionResult connectionResult4 = connectionResult != null ? this.f9850.zzfyv : new ConnectionResult(8);
            this.f9850.zzfym.mo4514(connectionResult4);
            this.f9850.onConnectionFailed(connectionResult4);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f9850.zzfym.mo4514(connectionResult5);
            this.f9850.onConnectionFailed(connectionResult5);
            return;
        }
        if (i2 == 6) {
            this.f9850.zza(5, (int) null);
            interfaceC2491 = this.f9850.zzfyr;
            if (interfaceC2491 != null) {
                interfaceC24912 = this.f9850.zzfyr;
                interfaceC24912.onConnectionSuspended(message.arg2);
            }
            this.f9850.onConnectionSuspended(message.arg2);
            this.f9850.zza(5, 1, (int) null);
            return;
        }
        if (i2 == 2 && !this.f9850.isConnected()) {
            ((AbstractC2479) message.obj).m4510();
            return;
        }
        if (!m4522(message)) {
            new Exception();
            return;
        }
        AbstractC2479 abstractC2479 = (AbstractC2479) message.obj;
        synchronized (abstractC2479) {
            tlistener = abstractC2479.f9813;
            if (abstractC2479.f9811) {
                String.valueOf(abstractC2479).length();
            }
        }
        if (tlistener != 0) {
            try {
                abstractC2479.mo4509(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (abstractC2479) {
            abstractC2479.f9811 = true;
        }
        abstractC2479.m4510();
    }
}
