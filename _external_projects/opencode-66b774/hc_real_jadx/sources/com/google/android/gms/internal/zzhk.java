package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbs;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p034.p095.C1687;

@zzzv
@TargetApi(14)
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhk extends Thread {
    private final zzhf zzazc;
    private final zzzt zzazd;
    private boolean mStarted = false;
    private boolean zzazb = false;
    private boolean zzbn = false;
    private final Object mLock = new Object();
    private final int zzaya = ((Integer) zzkb.zzif().zzd(zznh.zzbjp)).intValue();
    private final int zzazf = ((Integer) zzkb.zzif().zzd(zznh.zzbjq)).intValue();
    private final int zzayc = ((Integer) zzkb.zzif().zzd(zznh.zzbjr)).intValue();
    private final int zzazg = ((Integer) zzkb.zzif().zzd(zznh.zzbjs)).intValue();
    private final int zzazh = ((Integer) zzkb.zzif().zzd(zznh.zzbjv)).intValue();
    private final int zzazi = ((Integer) zzkb.zzif().zzd(zznh.zzbjx)).intValue();
    private final int zzazj = ((Integer) zzkb.zzif().zzd(zznh.zzbjy)).intValue();
    private final int zzaze = ((Integer) zzkb.zzif().zzd(zznh.zzbjt)).intValue();
    private final String zzazk = (String) zzkb.zzif().zzd(zznh.zzbka);
    private final boolean zzazl = ((Boolean) zzkb.zzif().zzd(zznh.zzbkc)).booleanValue();

    public zzhk(zzhf zzhfVar, zzzt zzztVar) {
        this.zzazc = zzhfVar;
        this.zzazd = zzztVar;
        setName("ContentFetchTask");
    }

    private final zzho zza(View view, zzhe zzheVar) {
        boolean z;
        if (view == null) {
            return new zzho(this, 0, 0);
        }
        Context context = zzbs.zzel().getContext();
        if (context != null) {
            String str = (String) view.getTag(context.getResources().getIdentifier((String) zzkb.zzif().zzd(zznh.zzbjz), "id", context.getPackageName()));
            if (!TextUtils.isEmpty(this.zzazk) && str != null && str.equals(this.zzazk)) {
                return new zzho(this, 0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzho(this, 0, 0);
            }
            zzheVar.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzho(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzanh)) {
            zzheVar.zzgp();
            WebView webView = (WebView) view;
            if (C1687.m3665()) {
                zzheVar.zzgp();
                webView.post(new zzhm(this, zzheVar, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            return z ? new zzho(this, 0, 1) : new zzho(this, 0, 0);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzho(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            zzho zza = zza(viewGroup.getChildAt(i3), zzheVar);
            i += zza.zzazt;
            i2 += zza.zzazu;
        }
        return new zzho(this, i, i2);
    }

    private static boolean zzgu() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context context = zzbs.zzel().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            zzbs.zzem().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void zzgw() {
        synchronized (this.mLock) {
            this.zzazb = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzakb.zzbx(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[EXC_TOP_SPLITTER, LOOP:1: B:11:0x007b->B:18:0x007b, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
        L0:
            boolean r0 = zzgu()     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            if (r0 == 0) goto L55
            com.google.android.gms.internal.zzhg r0 = com.google.android.gms.ads.internal.zzbs.zzel()     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            if (r0 != 0) goto L19
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.zzakb.zzbx(r0)     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
        L15:
            r4.zzgw()     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            goto L5b
        L19:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L3b
            if (r2 == 0) goto L4a
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L3b
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L3b
            if (r2 == 0) goto L4a
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L3b
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L3b
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L3b
            r1 = r0
            goto L4a
        L3b:
            r0 = move-exception
            com.google.android.gms.internal.zzaft r2 = com.google.android.gms.ads.internal.zzbs.zzem()     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zza(r0, r3)     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.zzakb.zzbx(r0)     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
        L4a:
            if (r1 == 0) goto L5b
            com.google.android.gms.internal.zzhl r0 = new com.google.android.gms.internal.zzhl     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            r0.<init>(r4, r1)     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            r1.post(r0)     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            goto L5b
        L55:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.zzakb.zzbx(r0)     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            goto L15
        L5b:
            int r0 = r4.zzaze     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L64 java.lang.InterruptedException -> L72
            goto L78
        L64:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.zzakb.zzb(r1, r0)
            com.google.android.gms.internal.zzzt r1 = r4.zzazd
            java.lang.String r2 = "ContentFetchTask.run"
            r1.zza(r0, r2)
            goto L78
        L72:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.zzakb.zzb(r1, r0)
        L78:
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
        L7b:
            boolean r1 = r4.zzazb     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L8a
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.zzakb.zzbx(r1)     // Catch: java.lang.InterruptedException -> L7b java.lang.Throwable -> L8d
            java.lang.Object r1 = r4.mLock     // Catch: java.lang.InterruptedException -> L7b java.lang.Throwable -> L8d
            r1.wait()     // Catch: java.lang.InterruptedException -> L7b java.lang.Throwable -> L8d
            goto L7b
        L8a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            goto L0
        L8d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L90:
            throw r1
        L91:
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhk.run():void");
    }

    public final void wakeup() {
        synchronized (this.mLock) {
            this.zzazb = false;
            this.mLock.notifyAll();
            zzakb.zzbx("ContentFetchThread: wakeup");
        }
    }

    public final void zza(zzhe zzheVar, WebView webView, String str, boolean z) {
        zzheVar.zzgo();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzazl || TextUtils.isEmpty(webView.getTitle())) {
                    zzheVar.zza(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzheVar.zza(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzheVar.zzgj()) {
                this.zzazc.zzb(zzheVar);
            }
        } catch (JSONException unused) {
            zzakb.zzbx("Json string may be malformed.");
        } catch (Throwable th) {
            zzakb.zza("Failed to get webview content.", th);
            this.zzazd.zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzgt() {
        synchronized (this.mLock) {
            if (this.mStarted) {
                zzakb.zzbx("Content hash thread already started, quiting...");
            } else {
                this.mStarted = true;
                start();
            }
        }
    }

    public final zzhe zzgv() {
        return this.zzazc.zzgs();
    }

    public final boolean zzgx() {
        return this.zzazb;
    }

    public final void zzj(View view) {
        try {
            zzhe zzheVar = new zzhe(this.zzaya, this.zzazf, this.zzayc, this.zzazg, this.zzazh, this.zzazi, this.zzazj);
            zzho zza = zza(view, zzheVar);
            zzheVar.zzgq();
            if (zza.zzazt == 0 && zza.zzazu == 0) {
                return;
            }
            if (zza.zzazu == 0 && zzheVar.zzgr() == 0) {
                return;
            }
            if (zza.zzazu == 0 && this.zzazc.zza(zzheVar)) {
                return;
            }
            this.zzazc.zzc(zzheVar);
        } catch (Exception e) {
            zzakb.zzb("Exception in fetchContentOnUIThread", e);
            this.zzazd.zza(e, "ContentFetchTask.fetchContent");
        }
    }
}
