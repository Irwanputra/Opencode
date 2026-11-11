package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.zzbs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamd extends FrameLayout implements zzama {
    private final zzamp zzdgr;
    private final FrameLayout zzdgs;
    private final zznu zzdgt;
    private final zzamr zzdgu;
    private final long zzdgv;
    private zzamb zzdgw;
    private boolean zzdgx;
    private boolean zzdgy;
    private boolean zzdgz;
    private boolean zzdha;
    private long zzdhb;
    private long zzdhc;
    private String zzdhd;
    private Bitmap zzdhe;
    private ImageView zzdhf;
    private boolean zzdhg;

    public zzamd(Context context, zzamp zzampVar, int i, boolean z, zznu zznuVar, zzamo zzamoVar) {
        super(context);
        this.zzdgr = zzampVar;
        this.zzdgt = zznuVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzdgs = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        if (zzampVar.zzbq() == null) {
            throw new IllegalArgumentException("null reference");
        }
        zzamb zza = zzampVar.zzbq().zzaom.zza(context, zzampVar, i, z, zznuVar, zzamoVar);
        this.zzdgw = zza;
        if (zza != null) {
            frameLayout.addView(zza, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbin)).booleanValue()) {
                zzrw();
            }
        }
        this.zzdhf = new ImageView(context);
        this.zzdgv = ((Long) zzkb.zzif().zzd(zznh.zzbir)).longValue();
        boolean booleanValue = ((Boolean) zzkb.zzif().zzd(zznh.zzbip)).booleanValue();
        this.zzdha = booleanValue;
        if (zznuVar != null) {
            zznuVar.zzf("spinner_used", booleanValue ? "1" : "0");
        }
        this.zzdgu = new zzamr(this);
        zzamb zzambVar = this.zzdgw;
        if (zzambVar != null) {
            zzambVar.zza(this);
        }
        if (this.zzdgw == null) {
            zzg("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void zza(zzamp zzampVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        zzampVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzamp zzampVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        zzampVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzamp zzampVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        zzampVar.zza("onVideoEvent", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzdgr.zza("onVideoEvent", hashMap);
    }

    private final boolean zzry() {
        return this.zzdhf.getParent() != null;
    }

    private final void zzrz() {
        if (this.zzdgr.zzsi() == null || !this.zzdgy || this.zzdgz) {
            return;
        }
        this.zzdgr.zzsi().getWindow().clearFlags(NotificationCompat.FLAG_HIGH_PRIORITY);
        this.zzdgy = false;
    }

    public final void destroy() {
        this.zzdgu.pause();
        zzamb zzambVar = this.zzdgw;
        if (zzambVar != null) {
            zzambVar.stop();
        }
        zzrz();
    }

    @Override // com.google.android.gms.internal.zzama
    public final void onPaused() {
        zza("pause", new String[0]);
        zzrz();
        this.zzdgx = false;
    }

    public final void pause() {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        zzambVar.pause();
    }

    public final void play() {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        zzambVar.play();
    }

    public final void seekTo(int i) {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        zzambVar.seekTo(i);
    }

    public final void zza(float f, float f2) {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar != null) {
            zzambVar.zza(f, f2);
        }
    }

    public final void zzb(float f) {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        zzambVar.zzdgq.zzb(f);
        zzambVar.zzrm();
    }

    public final void zzcv(String str) {
        this.zzdhd = str;
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzdgs.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // com.google.android.gms.internal.zzama
    public final void zzf(int i, int i2) {
        if (this.zzdha) {
            zzmx<Integer> zzmxVar = zznh.zzbiq;
            int max = Math.max(i / ((Integer) zzkb.zzif().zzd(zzmxVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzkb.zzif().zzd(zzmxVar)).intValue(), 1);
            Bitmap bitmap = this.zzdhe;
            if (bitmap != null && bitmap.getWidth() == max && this.zzdhe.getHeight() == max2) {
                return;
            }
            this.zzdhe = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzdhg = false;
        }
    }

    @TargetApi(14)
    public final void zzf(MotionEvent motionEvent) {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        zzambVar.dispatchTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.zzama
    public final void zzg(String str, String str2) {
        zza("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.zzama
    public final void zzrn() {
        this.zzdgu.resume();
        zzahn.zzdaw.post(new zzame(this));
    }

    @Override // com.google.android.gms.internal.zzama
    public final void zzro() {
        if (this.zzdgw != null && this.zzdhc == 0) {
            zza("canplaythrough", "duration", String.valueOf(r0.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.zzdgw.getVideoWidth()), "videoHeight", String.valueOf(this.zzdgw.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.zzama
    public final void zzrp() {
        if (this.zzdgr.zzsi() != null && !this.zzdgy) {
            boolean z = (this.zzdgr.zzsi().getWindow().getAttributes().flags & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
            this.zzdgz = z;
            if (!z) {
                this.zzdgr.zzsi().getWindow().addFlags(NotificationCompat.FLAG_HIGH_PRIORITY);
                this.zzdgy = true;
            }
        }
        this.zzdgx = true;
    }

    @Override // com.google.android.gms.internal.zzama
    public final void zzrq() {
        zza("ended", new String[0]);
        zzrz();
    }

    @Override // com.google.android.gms.internal.zzama
    public final void zzrr() {
        if (this.zzdhg && this.zzdhe != null && !zzry()) {
            this.zzdhf.setImageBitmap(this.zzdhe);
            this.zzdhf.invalidate();
            this.zzdgs.addView(this.zzdhf, new FrameLayout.LayoutParams(-1, -1));
            this.zzdgs.bringChildToFront(this.zzdhf);
        }
        this.zzdgu.pause();
        this.zzdhc = this.zzdhb;
        zzahn.zzdaw.post(new zzamf(this));
    }

    @Override // com.google.android.gms.internal.zzama
    public final void zzrs() {
        if (this.zzdgx && zzry()) {
            this.zzdgs.removeView(this.zzdhf);
        }
        if (this.zzdhe != null) {
            ((C2510) zzbs.zzeo()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.zzdgw.getBitmap(this.zzdhe) != null) {
                this.zzdhg = true;
            }
            ((C2510) zzbs.zzeo()).getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (zzagf.zzpz()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                zzagf.v(sb.toString());
            }
            if (elapsedRealtime2 > this.zzdgv) {
                zzakb.zzcu("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzdha = false;
                this.zzdhe = null;
                zznu zznuVar = this.zzdgt;
                if (zznuVar != null) {
                    zznuVar.zzf("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final void zzrt() {
        if (this.zzdgw == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzdhd)) {
            zza("no_src", new String[0]);
        } else {
            this.zzdgw.setVideoPath(this.zzdhd);
        }
    }

    public final void zzru() {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        zzambVar.zzdgq.setMuted(true);
        zzambVar.zzrm();
    }

    public final void zzrv() {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        zzambVar.zzdgq.setMuted(false);
        zzambVar.zzrm();
    }

    @TargetApi(14)
    public final void zzrw() {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        TextView textView = new TextView(zzambVar.getContext());
        String valueOf = String.valueOf(this.zzdgw.zzri());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzdgs.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzdgs.bringChildToFront(textView);
    }

    public final void zzrx() {
        zzamb zzambVar = this.zzdgw;
        if (zzambVar == null) {
            return;
        }
        long currentPosition = zzambVar.getCurrentPosition();
        if (this.zzdhb == currentPosition || currentPosition <= 0) {
            return;
        }
        zza("timeupdate", "time", String.valueOf(currentPosition / 1000.0f));
        this.zzdhb = currentPosition;
    }
}
