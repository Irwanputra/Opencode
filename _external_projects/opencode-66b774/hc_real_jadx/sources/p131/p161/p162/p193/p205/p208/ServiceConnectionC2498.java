package p131.p161.p162.p193.p205.p208;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p131.p161.p162.p193.p205.p210.C2516;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ServiceConnectionC2498 implements ServiceConnection {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public /* synthetic */ C2494 f9838;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f9839;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C2503 f9841;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ComponentName f9842;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public IBinder f9843;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Set<ServiceConnection> f9840 = new HashSet();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f9837 = 2;

    public ServiceConnectionC2498(C2494 c2494, C2503 c2503) {
        this.f9838 = c2494;
        this.f9841 = c2503;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f9838.f9833) {
            this.f9838.f9832.removeMessages(1, this.f9841);
            this.f9843 = iBinder;
            this.f9842 = componentName;
            Iterator<ServiceConnection> it = this.f9840.iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f9837 = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f9838.f9833) {
            this.f9838.f9832.removeMessages(1, this.f9841);
            this.f9843 = null;
            this.f9842 = componentName;
            Iterator<ServiceConnection> it = this.f9840.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f9837 = 2;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4520(String str) {
        this.f9837 = 3;
        C2494 c2494 = this.f9838;
        boolean m4529 = c2494.f9830.m4529(c2494.f9831, this.f9841.m4521(), this, this.f9841.f9848);
        this.f9839 = m4529;
        if (m4529) {
            Message obtainMessage = this.f9838.f9832.obtainMessage(1, this.f9841);
            C2494 c24942 = this.f9838;
            c24942.f9832.sendMessageDelayed(obtainMessage, c24942.f9834);
        } else {
            this.f9837 = 2;
            try {
                C2494 c24943 = this.f9838;
                C2516 c2516 = c24943.f9830;
                c24943.f9831.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
