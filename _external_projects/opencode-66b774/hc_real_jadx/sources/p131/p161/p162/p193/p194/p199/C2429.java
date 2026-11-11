package p131.p161.p162.p193.p194.p199;

import android.os.Debug;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import p131.p161.p162.p193.p205.p209.C2510;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2429 extends TimerTask {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ CountDownLatch f9762;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ Timer f9763;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public /* synthetic */ zza f9764;

    public C2429(zza zzaVar, CountDownLatch countDownLatch, Timer timer) {
        this.f9764 = zzaVar;
        this.f9762 = countDownLatch;
        this.f9763 = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (((Integer) zzkb.zzif().zzd(zznh.zzbpd)).intValue() != this.f9762.getCount()) {
            zzakb.zzbx("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.f9762.getCount() == 0) {
                this.f9763.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.f9764.zzano.zzair.getPackageName()).concat("_adsTrace_");
        try {
            zzakb.zzbx("Starting method tracing");
            this.f9762.countDown();
            ((C2510) zzbs.zzeo()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 20);
            sb.append(concat);
            sb.append(currentTimeMillis);
            Debug.startMethodTracing(sb.toString(), ((Integer) zzkb.zzif().zzd(zznh.zzbpe)).intValue());
        } catch (Exception e) {
            zzakb.zzc("Exception occurred while starting method tracing.", e);
        }
    }
}
