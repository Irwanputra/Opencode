package com.google.android.gms.ads.internal;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.zzadp;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzafq;
import com.google.android.gms.internal.zzafz;
import com.google.android.gms.internal.zzagb;
import com.google.android.gms.internal.zzaif;
import com.google.android.gms.internal.zzaji;
import com.google.android.gms.internal.zzajr;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzva;
import com.google.android.gms.internal.zzzv;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import p034.p080.C1493;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbt implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public final Context zzair;
    public String zzatw;
    public final zzakd zzaty;
    public zzagb zzaua;
    public zzaif zzaub;
    public zzjn zzauc;
    public zzafo zzaud;
    public zzafp zzaue;
    public zzafq zzauf;
    public String zzauv;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public zzld f2770;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f2771;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public zzkx f2773;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public zzqt f2774;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public zzaji f2775;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public zzrf f2776;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public List<Integer> f2778;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public zzlr f2779;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final zzcv f2780;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public List<String> f2781;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public zzoa f2783;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public zzke f2784;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1493<String, zzqz> f2785;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public zzkh f2788;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public zzpe f2790;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public zzadp f2791;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public zzbu f2793;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public zzmr f2795;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public zzqq f2796;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C1493<String, zzqw> f2797;
    public zzafz zzaux = null;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public View f2782 = null;
    public int zzauz = 0;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean f2786 = false;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public HashSet<zzafq> f2794 = null;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f2772 = -1;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f2777 = -1;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f2792 = true;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public boolean f2789 = true;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean f2787 = false;

    public zzbt(Context context, zzjn zzjnVar, String str, zzakd zzakdVar) {
        zznh.initialize(context);
        if (zzbs.zzem().zzpc() != null) {
            List<String> zzix = zznh.zzix();
            int i = zzakdVar.zzdej;
            if (i != 0) {
                zzix.add(Integer.toString(i));
            }
            zzbs.zzem().zzpc().zzg(zzix);
        }
        this.f2771 = UUID.randomUUID().toString();
        if (zzjnVar.zzbel || zzjnVar.zzben) {
            this.f2793 = null;
        } else {
            zzbu zzbuVar = new zzbu(context, str, zzakdVar.zzcv, this, this);
            this.f2793 = zzbuVar;
            zzbuVar.setMinimumWidth(zzjnVar.widthPixels);
            this.f2793.setMinimumHeight(zzjnVar.heightPixels);
            this.f2793.setVisibility(4);
        }
        this.zzauc = zzjnVar;
        this.zzatw = str;
        this.zzair = context;
        this.zzaty = zzakdVar;
        this.f2780 = new zzcv(new zzaf(this));
        this.f2775 = new zzaji(200L);
        this.f2785 = new C1493<>();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m1238(false);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m1238(true);
        this.f2787 = true;
    }

    public final void zza(HashSet<zzafq> hashSet) {
        this.f2794 = hashSet;
    }

    public final void zzf(boolean z) {
        zzafo zzafoVar;
        zzanh zzanhVar;
        if (this.zzauz == 0 && (zzafoVar = this.zzaud) != null && (zzanhVar = zzafoVar.zzciy) != null) {
            zzanhVar.stopLoading();
        }
        zzagb zzagbVar = this.zzaua;
        if (zzagbVar != null) {
            zzagbVar.cancel();
        }
        zzaif zzaifVar = this.zzaub;
        if (zzaifVar != null) {
            zzaifVar.cancel();
        }
        if (z) {
            this.zzaud = null;
        }
    }

    public final HashSet<zzafq> zzfh() {
        return this.f2794;
    }

    public final void zzfi() {
        zzanh zzanhVar;
        zzafo zzafoVar = this.zzaud;
        if (zzafoVar == null || (zzanhVar = zzafoVar.zzciy) == null) {
            return;
        }
        zzanhVar.destroy();
    }

    public final void zzfj() {
        zzva zzvaVar;
        zzafo zzafoVar = this.zzaud;
        if (zzafoVar == null || (zzvaVar = zzafoVar.zzcet) == null) {
            return;
        }
        try {
            zzvaVar.destroy();
        } catch (RemoteException unused) {
            zzakb.zzcu("Could not destroy mediation adapter.");
        }
    }

    public final boolean zzfk() {
        return this.zzauz == 0;
    }

    public final boolean zzfl() {
        return this.zzauz == 1;
    }

    public final String zzfm() {
        boolean z = this.f2792;
        return (z && this.f2789) ? "" : z ? this.f2787 ? "top-scrollable" : "top-locked" : this.f2789 ? this.f2787 ? "bottom-scrollable" : "bottom-locked" : "";
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1237(View view) {
        zzcr zzaf;
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbnp)).booleanValue() && (zzaf = this.f2780.zzaf()) != null) {
            zzaf.zzb(view);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1238(boolean z) {
        zzafo zzafoVar;
        zzanh zzanhVar;
        View findViewById;
        if (this.f2793 == null || (zzafoVar = this.zzaud) == null || (zzanhVar = zzafoVar.zzciy) == null || zzanhVar.zzsz() == null) {
            return;
        }
        if (!z || this.f2775.tryAcquire()) {
            if (this.zzaud.zzciy.zzsz().zzfv()) {
                int[] iArr = new int[2];
                this.f2793.getLocationOnScreen(iArr);
                zzkb.zzia();
                int zzd = zzajr.zzd(this.zzair, iArr[0]);
                zzkb.zzia();
                int zzd2 = zzajr.zzd(this.zzair, iArr[1]);
                if (zzd != this.f2772 || zzd2 != this.f2777) {
                    this.f2772 = zzd;
                    this.f2777 = zzd2;
                    this.zzaud.zzciy.zzsz().zza(this.f2772, this.f2777, !z);
                }
            }
            zzbu zzbuVar = this.f2793;
            if (zzbuVar == null || (findViewById = zzbuVar.getRootView().findViewById(R.id.content)) == null) {
                return;
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.f2793.getGlobalVisibleRect(rect);
            findViewById.getGlobalVisibleRect(rect2);
            if (rect.top != rect2.top) {
                this.f2792 = false;
            }
            if (rect.bottom != rect2.bottom) {
                this.f2789 = false;
            }
        }
    }
}
