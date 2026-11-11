package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzft implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private final Context mApplicationContext;
    private zzaji zzavd;
    private final WeakReference<zzafo> zzavt;
    private WeakReference<ViewTreeObserver> zzavu;
    private final zzhd zzavv;
    public final zzfr zzavw;
    private final WindowManager zzavx;
    private final PowerManager zzavy;
    private final KeyguardManager zzavz;
    private final DisplayMetrics zzawa;
    private zzga zzawb;
    private boolean zzawc;
    private boolean zzawe;
    private boolean zzawf;
    private boolean zzawg;
    private BroadcastReceiver zzawh;
    private final Rect zzawk;
    private final zzfw zzawl;
    private float zzawm;
    private Object mLock = new Object();
    private boolean zzarz = false;
    private boolean zzawd = false;
    private final HashSet<Object> zzawi = new HashSet<>();
    private final HashSet<zzgo> zzawj = new HashSet<>();

    public zzft(Context context, zzjn zzjnVar, zzafo zzafoVar, zzakd zzakdVar, zzhd zzhdVar) {
        Rect rect = new Rect();
        this.zzawk = rect;
        this.zzavt = new WeakReference<>(zzafoVar);
        this.zzavv = zzhdVar;
        this.zzavu = new WeakReference<>(null);
        this.zzawe = true;
        this.zzawg = false;
        this.zzavd = new zzaji(200L);
        this.zzavw = new zzfr(UUID.randomUUID().toString(), zzakdVar, zzjnVar.zzbek, zzafoVar.zzcxj, zzafoVar.zzfv(), zzjnVar.zzben);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.zzavx = windowManager;
        this.zzavy = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.zzavz = (KeyguardManager) context.getSystemService("keyguard");
        this.mApplicationContext = context;
        zzfw zzfwVar = new zzfw(this, new Handler());
        this.zzawl = zzfwVar;
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zzfwVar);
        this.zzawa = context.getResources().getDisplayMetrics();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        rect.right = defaultDisplay.getWidth();
        rect.bottom = defaultDisplay.getHeight();
        zzfx();
    }

    private final boolean isScreenOn() {
        return Build.VERSION.SDK_INT >= 20 ? this.zzavy.isInteractive() : this.zzavy.isScreenOn();
    }

    private static int zza(int i, DisplayMetrics displayMetrics) {
        return (int) (i / displayMetrics.density);
    }

    private final JSONObject zza(View view, Boolean bool) {
        if (view == null) {
            return zzgc().put("isAttachedToWindow", false).put("isScreenOn", isScreenOn()).put("isVisible", false);
        }
        boolean isAttachedToWindow = zzbs.zzek().isAttachedToWindow(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            zzakb.zzb("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = view.getWidth() + i;
        rect.bottom = view.getHeight() + rect.top;
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject zzgc = zzgc();
        zzgc.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", isAttachedToWindow).put("viewBox", new JSONObject().put("top", zza(this.zzawk.top, this.zzawa)).put("bottom", zza(this.zzawk.bottom, this.zzawa)).put("left", zza(this.zzawk.left, this.zzawa)).put("right", zza(this.zzawk.right, this.zzawa))).put("adBox", new JSONObject().put("top", zza(rect.top, this.zzawa)).put("bottom", zza(rect.bottom, this.zzawa)).put("left", zza(rect.left, this.zzawa)).put("right", zza(rect.right, this.zzawa))).put("globalVisibleBox", new JSONObject().put("top", zza(rect2.top, this.zzawa)).put("bottom", zza(rect2.bottom, this.zzawa)).put("left", zza(rect2.left, this.zzawa)).put("right", zza(rect2.right, this.zzawa))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", zza(rect3.top, this.zzawa)).put("bottom", zza(rect3.bottom, this.zzawa)).put("left", zza(rect3.left, this.zzawa)).put("right", zza(rect3.right, this.zzawa))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", zza(rect4.top, this.zzawa)).put("bottom", zza(rect4.bottom, this.zzawa)).put("left", zza(rect4.left, this.zzawa)).put("right", zza(rect4.right, this.zzawa))).put("screenDensity", this.zzawa.density);
        zzgc.put("isVisible", (bool == null ? Boolean.valueOf(zzbs.zzei().zza(view, this.zzavy, this.zzavz)) : bool).booleanValue());
        return zzgc;
    }

    private final void zza(JSONObject jSONObject, boolean z) {
        try {
            JSONObject zzb = zzb(jSONObject);
            ArrayList arrayList = new ArrayList(this.zzawj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((zzgo) obj).zzb(zzb, z);
            }
        } catch (Throwable th) {
            zzakb.zzb("Skipping active view message.", th);
        }
    }

    private static JSONObject zzb(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    private final void zzfz() {
        zzga zzgaVar = this.zzawb;
        if (zzgaVar != null) {
            zzgaVar.zza(this);
        }
    }

    private final void zzgb() {
        ViewTreeObserver viewTreeObserver = this.zzavu.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(this);
    }

    private final JSONObject zzgc() {
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("afmaVersion", this.zzavw.zzfs()).put("activeViewJSON", this.zzavw.zzft());
        ((C2510) zzbs.zzeo()).getClass();
        JSONObject put2 = put.put("timestamp", SystemClock.elapsedRealtime()).put("adFormat", this.zzavw.zzfr()).put("hashCode", this.zzavw.zzfu()).put("isMraid", this.zzavw.zzfv()).put("isStopped", this.zzawd).put("isPaused", this.zzarz).put("isNative", this.zzavw.zzfw()).put("isScreenOn", isScreenOn());
        zzbs.zzei();
        JSONObject put3 = put2.put("appMuted", zzahn.zzdo());
        zzbs.zzei();
        put3.put("appVolume", zzahn.zzdn()).put("deviceVolume", this.zzawm);
        return jSONObject;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzl(2);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzl(1);
    }

    public final void pause() {
        synchronized (this.mLock) {
            this.zzarz = true;
            zzl(3);
        }
    }

    public final void resume() {
        synchronized (this.mLock) {
            this.zzarz = false;
            zzl(3);
        }
    }

    public final void stop() {
        synchronized (this.mLock) {
            this.zzawd = true;
            zzl(3);
        }
    }

    public final void zza(zzga zzgaVar) {
        synchronized (this.mLock) {
            this.zzawb = zzgaVar;
        }
    }

    public final void zza(zzgo zzgoVar) {
        if (this.zzawj.isEmpty()) {
            synchronized (this.mLock) {
                if (this.zzawh == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.zzawh = new zzfu(this);
                    zzbs.zzfg().zza(this.mApplicationContext, this.zzawh, intentFilter);
                }
            }
            zzl(3);
        }
        this.zzawj.add(zzgoVar);
        try {
            zzgoVar.zzb(zzb(zza(this.zzavv.zzgd(), (Boolean) null)), false);
        } catch (JSONException e) {
            zzakb.zzb("Skipping measurement update for new client.", e);
        }
    }

    public final void zza(zzgo zzgoVar, Map<String, String> map) {
        String valueOf = String.valueOf(this.zzavw.zzfu());
        zzakb.zzbx(valueOf.length() != 0 ? "Received request to untrack: ".concat(valueOf) : new String("Received request to untrack: "));
        zzb(zzgoVar);
    }

    public final void zzb(zzgo zzgoVar) {
        this.zzawj.remove(zzgoVar);
        zzgoVar.zzgh();
        if (this.zzawj.isEmpty()) {
            synchronized (this.mLock) {
                zzgb();
                synchronized (this.mLock) {
                    if (this.zzawh != null) {
                        try {
                            zzbs.zzfg().zza(this.mApplicationContext, this.zzawh);
                        } catch (IllegalStateException e) {
                            zzakb.zzb("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            zzbs.zzem().zza(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.zzawh = null;
                    }
                }
                this.mApplicationContext.getContentResolver().unregisterContentObserver(this.zzawl);
                int i = 0;
                this.zzawe = false;
                zzfz();
                ArrayList arrayList = new ArrayList(this.zzawj);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zzb((zzgo) obj);
                }
            }
        }
    }

    public final boolean zze(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zzavw.zzfu());
    }

    public final void zzf(Map<String, String> map) {
        zzl(3);
    }

    public final void zzfx() {
        zzbs.zzei();
        this.zzawm = zzahn.zzaq(this.mApplicationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000a, B:9:0x0024, B:11:0x0036, B:12:0x0041, B:13:0x003b, B:17:0x001c, B:20:0x0044), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000a, B:9:0x0024, B:11:0x0036, B:12:0x0041, B:13:0x003b, B:17:0x001c, B:20:0x0044), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzfy() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            boolean r1 = r5.zzawe     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L44
            r1 = 1
            r5.zzawf = r1     // Catch: java.lang.Throwable -> L46
            org.json.JSONObject r2 = r5.zzgc()     // Catch: java.lang.RuntimeException -> L19 org.json.JSONException -> L20 java.lang.Throwable -> L46
            java.lang.String r3 = "doneReasonCode"
            java.lang.String r4 = "u"
            r2.put(r3, r4)     // Catch: java.lang.RuntimeException -> L19 org.json.JSONException -> L20 java.lang.Throwable -> L46
            r5.zza(r2, r1)     // Catch: java.lang.RuntimeException -> L19 org.json.JSONException -> L20 java.lang.Throwable -> L46
            goto L24
        L19:
            r1 = move-exception
            java.lang.String r2 = "Failure while processing active view data."
        L1c:
            com.google.android.gms.internal.zzakb.zzb(r2, r1)     // Catch: java.lang.Throwable -> L46
            goto L24
        L20:
            r1 = move-exception
            java.lang.String r2 = "JSON failure while processing active view data."
            goto L1c
        L24:
            java.lang.String r1 = "Untracking ad unit: "
            com.google.android.gms.internal.zzfr r2 = r5.zzavw     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r2.zzfu()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L46
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L3b
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L46
            goto L41
        L3b:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L46
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L46
            r1 = r2
        L41:
            com.google.android.gms.internal.zzakb.zzbx(r1)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            goto L4a
        L49:
            throw r1
        L4a:
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzft.zzfy():void");
    }

    public final void zzg(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            if (!"1".equals(map.get("isVisible"))) {
                "true".equals(map.get("isVisible"));
            }
            Iterator<Object> it = this.zzawi.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final boolean zzga() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzawe;
        }
        return z;
    }

    public final void zzl(int i) {
        boolean z;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        synchronized (this.mLock) {
            Iterator<zzgo> it = this.zzawj.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().zzgg()) {
                    z = true;
                    break;
                }
            }
            if (z && this.zzawe) {
                View zzgd = this.zzavv.zzgd();
                boolean z2 = zzgd != null && zzbs.zzei().zza(zzgd, this.zzavy, this.zzavz);
                boolean z3 = zzgd != null && z2 && zzgd.getGlobalVisibleRect(new Rect(), null);
                if (this.zzavv.zzge()) {
                    zzfy();
                    return;
                }
                if (i == 1 && !this.zzavd.tryAcquire() && z3 == this.zzawg) {
                    return;
                }
                if (z3 || this.zzawg || i != 1) {
                    try {
                        zza(zza(zzgd, Boolean.valueOf(z2)), false);
                        this.zzawg = z3;
                    } catch (RuntimeException | JSONException e) {
                        zzakb.zza("Active view update failed.", e);
                    }
                    View zzgd2 = this.zzavv.zzgf().zzgd();
                    if (zzgd2 != null && (viewTreeObserver2 = zzgd2.getViewTreeObserver()) != (viewTreeObserver = this.zzavu.get())) {
                        zzgb();
                        if (!this.zzawc || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
                            this.zzawc = true;
                            viewTreeObserver2.addOnScrollChangedListener(this);
                            viewTreeObserver2.addOnGlobalLayoutListener(this);
                        }
                        this.zzavu = new WeakReference<>(viewTreeObserver2);
                    }
                    zzfz();
                }
            }
        }
    }
}
