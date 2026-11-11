package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.zzahh;
import com.google.android.gms.internal.zzajr;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzzv;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaf implements zzcr, Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final List<Object[]> f2661;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final AtomicReference<zzcr> f2662;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public zzakd f2663;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public CountDownLatch f2664;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Context f2665;

    public zzaf(zzbt zzbtVar) {
        Context context = zzbtVar.zzair;
        zzakd zzakdVar = zzbtVar.zzaty;
        this.f2661 = new Vector();
        this.f2662 = new AtomicReference<>();
        this.f2664 = new CountDownLatch(1);
        this.f2665 = context;
        this.f2663 = zzakdVar;
        zzkb.zzia();
        if (zzajr.zzqz()) {
            zzahh.zza(this);
        } else {
            run();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Context m1219(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f2663.zzdel;
            if (!((Boolean) zzkb.zzif().zzd(zznh.zzblj)).booleanValue() && z2) {
                z = true;
            }
            this.f2662.set(zzcu.zza(this.f2663.zzcv, m1219(this.f2665), z));
        } finally {
            this.f2664.countDown();
            this.f2665 = null;
            this.f2663 = null;
        }
    }

    @Override // com.google.android.gms.internal.zzcr
    public final String zza(Context context) {
        boolean z;
        zzcr zzcrVar;
        try {
            this.f2664.await();
            z = true;
        } catch (InterruptedException e) {
            zzakb.zzc("Interrupted during GADSignals creation.", e);
            z = false;
        }
        if (!z || (zzcrVar = this.f2662.get()) == null) {
            return "";
        }
        m1220();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzcrVar.zza(context);
    }

    @Override // com.google.android.gms.internal.zzcr
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.zzcr
    public final void zza(int i, int i2, int i3) {
        zzcr zzcrVar = this.f2662.get();
        if (zzcrVar == null) {
            this.f2661.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            m1220();
            zzcrVar.zza(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.zzcr
    public final void zza(MotionEvent motionEvent) {
        zzcr zzcrVar = this.f2662.get();
        if (zzcrVar == null) {
            this.f2661.add(new Object[]{motionEvent});
        } else {
            m1220();
            zzcrVar.zza(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.zzcr
    public final void zzb(View view) {
        zzcr zzcrVar = this.f2662.get();
        if (zzcrVar != null) {
            zzcrVar.zzb(view);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1220() {
        if (this.f2661.isEmpty()) {
            return;
        }
        for (Object[] objArr : this.f2661) {
            if (objArr.length == 1) {
                this.f2662.get().zza((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                this.f2662.get().zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f2661.clear();
    }

    @Override // com.google.android.gms.internal.zzcr
    public final String zza(Context context, String str, View view, Activity activity) {
        boolean z;
        zzcr zzcrVar;
        try {
            this.f2664.await();
            z = true;
        } catch (InterruptedException e) {
            zzakb.zzc("Interrupted during GADSignals creation.", e);
            z = false;
        }
        if (!z || (zzcrVar = this.f2662.get()) == null) {
            return "";
        }
        m1220();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzcrVar.zza(context, str, view, activity);
    }
}
