package p131.p161.p162.p193.p194.p199;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.zzab;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzvj;
import com.google.android.gms.internal.zzvm;
import java.util.Map;
import p131.p161.p162.p193.p203.BinderC2454;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2399 implements zzt<zzanh> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzab f9725;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzvm f9726;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzvj f9727;

    public C2399(zzvj zzvjVar, zzab zzabVar, zzvm zzvmVar) {
        this.f9727 = zzvjVar;
        this.f9725 = zzabVar;
        this.f9726 = zzvmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(zzanh zzanhVar, Map map) {
        zzanh zzanhVar2 = zzanhVar;
        zzanhVar2.getClass();
        View view = (View) zzanhVar2;
        try {
            zzvj zzvjVar = this.f9727;
            if (zzvjVar != null) {
                if (!zzvjVar.getOverrideClickHandling()) {
                    this.f9727.zzh(new BinderC2454(view));
                    this.f9725.f2658.onAdClicked();
                    return;
                } else {
                    View.OnClickListener onClickListener = zzanhVar2.getOnClickListener();
                    if (onClickListener != null) {
                        onClickListener.onClick((View) zzanhVar2);
                        return;
                    }
                    return;
                }
            }
            zzvm zzvmVar = this.f9726;
            if (zzvmVar != null) {
                if (!zzvmVar.getOverrideClickHandling()) {
                    this.f9726.zzh(new BinderC2454(view));
                    this.f9725.f2658.onAdClicked();
                } else {
                    View.OnClickListener onClickListener2 = zzanhVar2.getOnClickListener();
                    if (onClickListener2 != null) {
                        onClickListener2.onClick((View) zzanhVar2);
                    }
                }
            }
        } catch (RemoteException e) {
            zzakb.zzc("Unable to call handleClick on mapper", e);
        }
    }
}
