package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzcs implements zzcr {
    public MotionEvent zzagx;
    public double zzahg;
    private double zzahh;
    private double zzahi;
    public float zzahj;
    public float zzahk;
    public float zzahl;
    public float zzahm;
    public DisplayMetrics zzahp;
    public LinkedList<MotionEvent> zzagy = new LinkedList<>();
    public long zzagz = 0;
    public long zzaha = 0;
    public long zzahb = 0;
    public long zzahc = 0;
    public long zzahd = 0;
    public long zzahe = 0;
    public long zzahf = 0;
    private boolean zzahn = false;
    public boolean zzaho = false;

    public zzcs(Context context) {
        try {
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbnu)).booleanValue()) {
                zzbw.zzz();
            } else {
                zzbz.zzab();
            }
            this.zzahp = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String zza(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        int i;
        zzaz zza;
        try {
            if (z) {
                zza = zza(context, view, activity);
                this.zzahn = true;
            } else {
                zza = zza(context, null);
            }
            if (zza != null && zza.zzho() != 0) {
                return zzbw.zza(zza, str);
            }
            return Integer.toString(5);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            i = 7;
            return Integer.toString(i);
        } catch (Throwable unused2) {
            i = 3;
            return Integer.toString(i);
        }
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr);

    public abstract zzaz zza(Context context, View view, Activity activity);

    public abstract zzaz zza(Context context, zzaw zzawVar);

    @Override // com.google.android.gms.internal.zzcr
    public final String zza(Context context) {
        if (zzdr.zzau()) {
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbnw)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return zza(context, null, false, null, null, null);
    }

    @Override // com.google.android.gms.internal.zzcr
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.zzcr
    public final String zza(Context context, String str, View view, Activity activity) {
        return zza(context, str, true, view, activity, null);
    }

    @Override // com.google.android.gms.internal.zzcr
    public final void zza(int i, int i2, int i3) {
        MotionEvent motionEvent;
        MotionEvent motionEvent2 = this.zzagx;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        DisplayMetrics displayMetrics = this.zzahp;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            motionEvent = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.zzagx = motionEvent;
        this.zzaho = false;
    }

    @Override // com.google.android.gms.internal.zzcr
    public final void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.zzahn) {
            this.zzahc = 0L;
            this.zzahb = 0L;
            this.zzaha = 0L;
            this.zzagz = 0L;
            this.zzahd = 0L;
            this.zzahf = 0L;
            this.zzahe = 0L;
            Iterator<MotionEvent> it = this.zzagy.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.zzagy.clear();
            this.zzagx = null;
            this.zzahn = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzahg = 0.0d;
            this.zzahh = motionEvent.getRawX();
            this.zzahi = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.zzahh;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.zzahi;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.zzahg = Math.sqrt((d4 * d4) + (d2 * d2)) + this.zzahg;
            this.zzahh = rawX;
            this.zzahi = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzagx = obtain;
                    this.zzagy.add(obtain);
                    if (this.zzagy.size() > 6) {
                        this.zzagy.remove().recycle();
                    }
                    this.zzahb++;
                    this.zzahd = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zzaha += motionEvent.getHistorySize() + 1;
                    zzdq zzb = zzb(motionEvent);
                    if ((zzb == null || zzb.zzfm == null || zzb.zzajp == null) ? false : true) {
                        this.zzahe = zzb.zzfm.longValue() + zzb.zzajp.longValue() + this.zzahe;
                    }
                    if (this.zzahp != null && zzb != null && zzb.zzfk != null && zzb.zzajq != null) {
                        z = true;
                    }
                    if (z) {
                        this.zzahf = zzb.zzfk.longValue() + zzb.zzajq.longValue() + this.zzahf;
                    }
                } else if (action2 == 3) {
                    this.zzahc++;
                }
            } catch (zzdj unused) {
            }
        } else {
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbnr)).booleanValue()) {
                this.zzahj = motionEvent.getX();
                this.zzahk = motionEvent.getY();
                this.zzahl = motionEvent.getRawX();
                this.zzahm = motionEvent.getRawY();
            }
            this.zzagz++;
        }
        this.zzaho = true;
    }

    public abstract zzdq zzb(MotionEvent motionEvent);

    @Override // com.google.android.gms.internal.zzcr
    public void zzb(View view) {
    }
}
