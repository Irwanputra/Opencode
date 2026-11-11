package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Collections;
import java.util.Set;
import p034.p095.C1687;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzwr extends zzxb {
    private static Set<String> zzcgk;
    private final Object mLock;
    private int zzalv;
    private int zzalw;
    private final zzanh zzbyk;
    private final Activity zzcgb;
    private String zzcgl;
    private boolean zzcgm;
    private int zzcgn;
    private int zzcgo;
    private int zzcgp;
    private int zzcgq;
    private zzapa zzcgr;
    private ImageView zzcgs;
    private LinearLayout zzcgt;
    private zzxc zzcgu;
    private PopupWindow zzcgv;
    private RelativeLayout zzcgw;
    private ViewGroup zzcgx;

    static {
        Set m3724 = C1687.m3724(7);
        Collections.addAll(m3724, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        zzcgk = Collections.unmodifiableSet(m3724);
    }

    public zzwr(zzanh zzanhVar, zzxc zzxcVar) {
        super(zzanhVar, "resize");
        this.zzcgl = "top-right";
        this.zzcgm = true;
        this.zzcgn = 0;
        this.zzcgo = 0;
        this.zzalw = -1;
        this.zzcgp = 0;
        this.zzcgq = 0;
        this.zzalv = -1;
        this.mLock = new Object();
        this.zzbyk = zzanhVar;
        this.zzcgb = zzanhVar.zzsi();
        this.zzcgu = zzxcVar;
    }

    private final void zza(int i, int i2) {
        zzb(i, i2 - zzbs.zzei().zzh(this.zzcgb)[0], this.zzalv, this.zzalw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e7, code lost:
    
        if ((r5 + 50) <= r1[1]) goto L61;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int[] zzmq() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzwr.zzmq():int[]");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02af A[Catch: all -> 0x0324, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0117, B:60:0x011c, B:62:0x011e, B:64:0x0139, B:66:0x0141, B:68:0x0145, B:70:0x014d, B:72:0x0156, B:74:0x0162, B:75:0x0187, B:78:0x01b9, B:80:0x01c3, B:81:0x01f5, B:93:0x024a, B:94:0x024d, B:95:0x026e, B:97:0x0286, B:98:0x02a7, B:100:0x02af, B:101:0x02b6, B:102:0x02cc, B:106:0x02cf, B:108:0x02df, B:109:0x02e9, B:111:0x02f3, B:113:0x02fc, B:115:0x0308, B:116:0x0314, B:118:0x02e4, B:119:0x0251, B:120:0x0255, B:121:0x0259, B:122:0x025c, B:123:0x0260, B:124:0x0266, B:125:0x026a, B:126:0x01f9, B:129:0x0203, B:132:0x020d, B:135:0x0217, B:138:0x0221, B:141:0x022b, B:145:0x0184, B:146:0x0316, B:147:0x031b, B:149:0x031d, B:150:0x0322), top: B:3:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzwr.execute(java.util.Map):void");
    }

    public final void zza(int i, int i2, boolean z) {
        synchronized (this.mLock) {
            this.zzcgn = i;
            this.zzcgo = i2;
            if (this.zzcgv != null && z) {
                int[] zzmq = zzmq();
                if (zzmq != null) {
                    PopupWindow popupWindow = this.zzcgv;
                    zzkb.zzia();
                    int zzc = zzajr.zzc(this.zzcgb, zzmq[0]);
                    zzkb.zzia();
                    popupWindow.update(zzc, zzajr.zzc(this.zzcgb, zzmq[1]), this.zzcgv.getWidth(), this.zzcgv.getHeight());
                    zza(zzmq[0], zzmq[1]);
                } else {
                    zzl(true);
                }
            }
        }
    }

    public final void zzb(int i, int i2) {
        this.zzcgn = i;
        this.zzcgo = i2;
    }

    public final void zzl(boolean z) {
        synchronized (this.mLock) {
            PopupWindow popupWindow = this.zzcgv;
            if (popupWindow != null) {
                popupWindow.dismiss();
                RelativeLayout relativeLayout = this.zzcgw;
                Object obj = this.zzbyk;
                obj.getClass();
                relativeLayout.removeView((View) obj);
                ViewGroup viewGroup = this.zzcgx;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzcgs);
                    ViewGroup viewGroup2 = this.zzcgx;
                    Object obj2 = this.zzbyk;
                    obj2.getClass();
                    viewGroup2.addView((View) obj2);
                    this.zzbyk.zza(this.zzcgr);
                }
                if (z) {
                    zzbo("default");
                    zzxc zzxcVar = this.zzcgu;
                    if (zzxcVar != null) {
                        zzxcVar.zzcu();
                    }
                }
                this.zzcgv = null;
                this.zzcgw = null;
                this.zzcgx = null;
                this.zzcgt = null;
            }
        }
    }

    public final boolean zzmr() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcgv != null;
        }
        return z;
    }
}
