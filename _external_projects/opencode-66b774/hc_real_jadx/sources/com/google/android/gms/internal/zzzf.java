package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.js.JavascriptEngineFactory;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzzf extends zzyk<zzzf> {
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzakd zzarf;
    private String zzaro;
    private final zzcv zzbuv;
    private final com.google.android.gms.ads.internal.zzba zzclf;
    private JavascriptEngineFactory zzclp;
    private zzakv<zzanh> zzclq;
    private final com.google.android.gms.ads.internal.gmsg.zzz zzclu;
    private final zzox zzclv;
    private static final long zzclr = TimeUnit.SECONDS.toMillis(60);
    private static final Object sLock = new Object();
    private static boolean zzcls = false;
    private static com.google.android.gms.ads.internal.js.zzn zzclt = null;

    public zzzf(Context context, com.google.android.gms.ads.internal.zzba zzbaVar, String str, zzcv zzcvVar, zzakd zzakdVar) {
        zzakb.zzct("Webview loading for native ads.");
        this.mContext = context;
        this.zzclf = zzbaVar;
        this.zzbuv = zzcvVar;
        this.zzarf = zzakdVar;
        this.zzaro = str;
        this.zzclp = new JavascriptEngineFactory();
        zzbs.zzej();
        zzakv<zzanh> zza = zzanr.zza(context, zzakdVar, (String) zzkb.zzif().zzd(zznh.zzbol), zzcvVar, zzbaVar.zzbq());
        this.zzclu = new com.google.android.gms.ads.internal.gmsg.zzz(context);
        this.zzclv = new zzox(zzbaVar, str);
        zzakv<zzanh> zza2 = zzakl.zza(zza, new zzakg(this) { // from class: com.google.android.gms.internal.zzzg
            private final zzzf zzclw;

            {
                this.zzclw = this;
            }

            @Override // com.google.android.gms.internal.zzakg
            public final zzakv zzc(Object obj) {
                return this.zzclw.zzh((zzanh) obj);
            }
        }, zzala.zzdff);
        this.zzclq = zza2;
        zzakj.zza(zza2, "WebViewNativeAdsUtil.constructor");
    }

    public final /* synthetic */ zzakv zza(JSONObject jSONObject, zzanh zzanhVar) {
        jSONObject.put("ads_id", this.zzaro);
        zzanhVar.zzb("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return zzakl.zzi(new JSONObject());
    }

    public final /* synthetic */ void zza(zzanh zzanhVar, zzyl zzylVar, zzalf zzalfVar, zzanh zzanhVar2, Map map) {
        JSONObject jSONObject;
        boolean z;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str);
                z = true;
            } else {
                jSONObject = new JSONObject(str2);
                z = false;
            }
            if (this.zzaro.equals(jSONObject.optString("ads_id", ""))) {
                zzanhVar.zzb("/nativeAdPreProcess", zzylVar.zzcke);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                zzalfVar.set(jSONObject2);
            }
        } catch (Throwable th) {
            zzakb.zzb("Error while preprocessing json.", th);
            zzalfVar.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.zzyk, com.google.android.gms.internal.zzzb
    public final void zza(String str, com.google.android.gms.ads.internal.gmsg.zzt zztVar) {
        zzakl.zza(this.zzclq, new zzzl(this, str, zztVar), zzala.zzdfe);
    }

    @Override // com.google.android.gms.internal.zzzb
    public final void zza(String str, JSONObject jSONObject) {
        zzakl.zza(this.zzclq, new zzzn(this, str, jSONObject), zzala.zzdfe);
    }

    public final /* synthetic */ zzakv zzb(JSONObject jSONObject, zzanh zzanhVar) {
        jSONObject.put("ads_id", this.zzaro);
        zzanhVar.zzb("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return zzakl.zzi(new JSONObject());
    }

    @Override // com.google.android.gms.internal.zzyk, com.google.android.gms.internal.zzzb
    public final void zzb(String str, com.google.android.gms.ads.internal.gmsg.zzt zztVar) {
        zzakl.zza(this.zzclq, new zzzm(this, str, zztVar), zzala.zzdfe);
    }

    public final /* synthetic */ zzakv zzc(JSONObject jSONObject, final zzanh zzanhVar) {
        jSONObject.put("ads_id", this.zzaro);
        final zzalf zzalfVar = new zzalf();
        final zzyl zzylVar = new zzyl();
        com.google.android.gms.ads.internal.gmsg.zzt<? super zzanh> zztVar = new com.google.android.gms.ads.internal.gmsg.zzt(this, zzanhVar, zzylVar, zzalfVar) { // from class: com.google.android.gms.internal.zzzk
            private final zzzf zzclw;
            private final zzanh zzcly;
            private final zzyl zzclz;
            private final zzalf zzcma;

            {
                this.zzclw = this;
                this.zzcly = zzanhVar;
                this.zzclz = zzylVar;
                this.zzcma = zzalfVar;
            }

            @Override // com.google.android.gms.ads.internal.gmsg.zzt
            public final void zza(Object obj, Map map) {
                this.zzclw.zza(this.zzcly, this.zzclz, this.zzcma, (zzanh) obj, map);
            }
        };
        zzylVar.zzcke = zztVar;
        zzanhVar.zza("/nativeAdPreProcess", zztVar);
        zzanhVar.zzb("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return zzalfVar;
    }

    public final /* synthetic */ zzakv zzh(zzanh zzanhVar) {
        zzakb.zzct("Javascript has loaded for native ads.");
        zzani zzsz = zzanhVar.zzsz();
        com.google.android.gms.ads.internal.zzba zzbaVar = this.zzclf;
        zzsz.zza(zzbaVar, zzbaVar, zzbaVar, zzbaVar, false, null, new com.google.android.gms.ads.internal.zzw(this.mContext, null, null), null, null);
        zzanhVar.zzsz().zza("/logScionEvent", this.zzclu);
        zzanhVar.zzsz().zza("/logScionEvent", this.zzclv);
        return zzakl.zzi(zzanhVar);
    }

    @Override // com.google.android.gms.internal.zzzb
    public final zzakv<JSONObject> zzi(final JSONObject jSONObject) {
        return zzakl.zza(this.zzclq, new zzakg(this, jSONObject) { // from class: com.google.android.gms.internal.zzzh
            private final zzzf zzclw;
            private final JSONObject zzclx;

            {
                this.zzclw = this;
                this.zzclx = jSONObject;
            }

            @Override // com.google.android.gms.internal.zzakg
            public final zzakv zzc(Object obj) {
                return this.zzclw.zzc(this.zzclx, (zzanh) obj);
            }
        }, zzala.zzdfe);
    }

    @Override // com.google.android.gms.internal.zzzb
    public final zzakv<JSONObject> zzj(final JSONObject jSONObject) {
        return zzakl.zza(this.zzclq, new zzakg(this, jSONObject) { // from class: com.google.android.gms.internal.zzzi
            private final zzzf zzclw;
            private final JSONObject zzclx;

            {
                this.zzclw = this;
                this.zzclx = jSONObject;
            }

            @Override // com.google.android.gms.internal.zzakg
            public final zzakv zzc(Object obj) {
                return this.zzclw.zzb(this.zzclx, (zzanh) obj);
            }
        }, zzala.zzdfe);
    }

    @Override // com.google.android.gms.internal.zzzb
    public final zzakv<JSONObject> zzk(final JSONObject jSONObject) {
        return zzakl.zza(this.zzclq, new zzakg(this, jSONObject) { // from class: com.google.android.gms.internal.zzzj
            private final zzzf zzclw;
            private final JSONObject zzclx;

            {
                this.zzclw = this;
                this.zzclx = jSONObject;
            }

            @Override // com.google.android.gms.internal.zzakg
            public final zzakv zzc(Object obj) {
                return this.zzclw.zza(this.zzclx, (zzanh) obj);
            }
        }, zzala.zzdfe);
    }

    @Override // com.google.android.gms.internal.zzzb
    public final void zzls() {
        zzakl.zza(this.zzclq, new zzzo(this), zzala.zzdfe);
    }
}
