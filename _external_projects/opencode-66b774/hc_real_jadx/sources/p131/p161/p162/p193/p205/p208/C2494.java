package p131.p161.p162.p193.p205.p208;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import p034.p095.C1687;
import p131.p161.p162.p193.p205.p210.C2516;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2494 extends AbstractC2488 implements Handler.Callback {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Context f9831;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Handler f9832;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final HashMap<C2503, ServiceConnectionC2498> f9833 = new HashMap<>();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C2516 f9830 = C2516.m4528();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final long f9829 = 5000;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final long f9834 = 300000;

    public C2494(Context context) {
        this.f9831 = context.getApplicationContext();
        this.f9832 = new Handler(context.getMainLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f9833) {
                C2503 c2503 = (C2503) message.obj;
                ServiceConnectionC2498 serviceConnectionC2498 = this.f9833.get(c2503);
                if (serviceConnectionC2498 != null && serviceConnectionC2498.f9840.isEmpty()) {
                    if (serviceConnectionC2498.f9839) {
                        serviceConnectionC2498.f9838.f9832.removeMessages(1, serviceConnectionC2498.f9841);
                        C2494 c2494 = serviceConnectionC2498.f9838;
                        C2516 c2516 = c2494.f9830;
                        c2494.f9831.unbindService(serviceConnectionC2498);
                        serviceConnectionC2498.f9839 = false;
                        serviceConnectionC2498.f9837 = 2;
                    }
                    this.f9833.remove(c2503);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.f9833) {
            C2503 c25032 = (C2503) message.obj;
            ServiceConnectionC2498 serviceConnectionC24982 = this.f9833.get(c25032);
            if (serviceConnectionC24982 != null && serviceConnectionC24982.f9837 == 3) {
                String.valueOf(c25032).length();
                new Exception();
                ComponentName componentName = serviceConnectionC24982.f9842;
                if (componentName == null) {
                    c25032.getClass();
                    componentName = null;
                }
                if (componentName == null) {
                    componentName = new ComponentName(c25032.f9847, "unknown");
                }
                serviceConnectionC24982.onServiceDisconnected(componentName);
            }
        }
        return true;
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2488
    /* renamed from: 〺つふすそ */
    public final void mo4516(C2503 c2503, ServiceConnection serviceConnection, String str) {
        C1687.m3726(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9833) {
            ServiceConnectionC2498 serviceConnectionC2498 = this.f9833.get(c2503);
            if (serviceConnectionC2498 == null) {
                String valueOf = String.valueOf(c2503);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!serviceConnectionC2498.f9840.contains(serviceConnection)) {
                String valueOf2 = String.valueOf(c2503);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            C2516 c2516 = serviceConnectionC2498.f9838.f9830;
            serviceConnectionC2498.f9840.remove(serviceConnection);
            if (serviceConnectionC2498.f9840.isEmpty()) {
                this.f9832.sendMessageDelayed(this.f9832.obtainMessage(0, c2503), this.f9829);
            }
        }
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2488
    /* renamed from: げつ〴ぬぐ */
    public final boolean mo4517(C2503 c2503, ServiceConnection serviceConnection, String str) {
        boolean z;
        C1687.m3726(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9833) {
            ServiceConnectionC2498 serviceConnectionC2498 = this.f9833.get(c2503);
            if (serviceConnectionC2498 == null) {
                serviceConnectionC2498 = new ServiceConnectionC2498(this, c2503);
                c2503.m4521();
                serviceConnectionC2498.f9840.add(serviceConnection);
                serviceConnectionC2498.m4520(str);
                this.f9833.put(c2503, serviceConnectionC2498);
            } else {
                this.f9832.removeMessages(0, c2503);
                if (serviceConnectionC2498.f9840.contains(serviceConnection)) {
                    String valueOf = String.valueOf(c2503);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                C2516 c2516 = serviceConnectionC2498.f9838.f9830;
                serviceConnectionC2498.f9841.m4521();
                serviceConnectionC2498.f9840.add(serviceConnection);
                int i = serviceConnectionC2498.f9837;
                if (i == 1) {
                    ((ServiceConnectionC2502) serviceConnection).onServiceConnected(serviceConnectionC2498.f9842, serviceConnectionC2498.f9843);
                } else if (i == 2) {
                    serviceConnectionC2498.m4520(str);
                }
            }
            z = serviceConnectionC2498.f9839;
        }
        return z;
    }
}
