package com.google.android.gms.ads.internal.gmsg;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzafi;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzaog;
import com.google.android.gms.internal.zzaoh;
import com.google.android.gms.internal.zzaou;
import com.google.android.gms.internal.zzaow;
import com.google.android.gms.internal.zzaoy;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzwr;
import com.google.android.gms.internal.zzzv;
import java.net.URISyntaxException;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzab<T extends zzaog & zzaoh & zzaou & zzaow & zzaoy> implements zzt<T> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public zzje f2600;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public zzn f2601;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public zzq f2602;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public com.google.android.gms.ads.internal.zzw f2603;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public zzwr f2604;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public zzb f2605;

    public zzab(Context context, zzakd zzakdVar, zzcv zzcvVar, zzq zzqVar, zzje zzjeVar, zzb zzbVar, zzn zznVar, com.google.android.gms.ads.internal.zzw zzwVar, zzwr zzwrVar) {
        this.f2602 = zzqVar;
        this.f2600 = zzjeVar;
        this.f2605 = zzbVar;
        this.f2603 = zzwVar;
        this.f2604 = zzwrVar;
        this.f2601 = zznVar;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m1204(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return zzbs.zzek().zzqg();
        }
        if ("l".equalsIgnoreCase(str)) {
            return zzbs.zzek().zzqf();
        }
        if ("c".equalsIgnoreCase(str)) {
            return zzbs.zzek().zzqh();
        }
        return -1;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map map) {
        zzaog zzaogVar = (zzaog) obj;
        String zzb = zzafi.zzb((String) map.get("u"), zzaogVar.getContext());
        String str = (String) map.get("a");
        if (str == null) {
            zzakb.zzcu("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzw zzwVar = this.f2603;
        if (zzwVar != null && !zzwVar.zzda()) {
            this.f2603.zzt(zzb);
            return;
        }
        if ("expand".equalsIgnoreCase(str)) {
            if (((zzaoh) zzaogVar).zztc()) {
                zzakb.zzcu("Cannot expand WebView that is already expanded.");
                return;
            } else {
                m1205(false);
                ((zzaou) zzaogVar).zza("1".equals(map.get("custom_close")), m1204(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str)) {
            m1205(false);
            zzaou zzaouVar = (zzaou) zzaogVar;
            if (zzb != null) {
                zzaouVar.zza("1".equals(map.get("custom_close")), m1204(map), zzb);
                return;
            } else {
                zzaouVar.zza("1".equals(map.get("custom_close")), m1204(map), (String) map.get("html"), (String) map.get("baseurl"));
                return;
            }
        }
        if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m1205(true);
            zzaogVar.getContext();
            if (TextUtils.isEmpty(zzb)) {
                zzakb.zzcu("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzaou) zzaogVar).zza(new com.google.android.gms.ads.internal.overlay.zzc(new zzac(zzaogVar.getContext(), ((zzaow) zzaogVar).zztb(), (View) ((zzaoy) zzaogVar)).zzm(map)));
                return;
            } catch (ActivityNotFoundException e) {
                zzakb.zzcu(e.getMessage());
                return;
            }
        }
        m1205(true);
        String str2 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                intent = Intent.parseUri(str2, 0);
            } catch (URISyntaxException e2) {
                String valueOf = String.valueOf(str2);
                zzakb.zzb(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
            }
        }
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            String uri = data.toString();
            if (!TextUtils.isEmpty(uri)) {
                try {
                    zzbs.zzei();
                    uri = zzahn.zza(zzaogVar.getContext(), ((zzaow) zzaogVar).zztb(), uri, (View) ((zzaoy) zzaogVar), zzaogVar.zzsi());
                } catch (Exception e3) {
                    zzakb.zzb("Error occurred while adding signals.", e3);
                    zzbs.zzem().zza(e3, "OpenGmsgHandler.onGmsg");
                }
                try {
                    data = Uri.parse(uri);
                } catch (Exception e4) {
                    String valueOf2 = String.valueOf(uri);
                    zzakb.zzb(valueOf2.length() != 0 ? "Error parsing the uri: ".concat(valueOf2) : new String("Error parsing the uri: "), e4);
                    zzbs.zzem().zza(e4, "OpenGmsgHandler.onGmsg");
                }
            }
            intent.setData(data);
        }
        if (intent != null) {
            ((zzaou) zzaogVar).zza(new com.google.android.gms.ads.internal.overlay.zzc(intent));
            return;
        }
        if (!TextUtils.isEmpty(zzb)) {
            zzbs.zzei();
            zzb = zzahn.zza(zzaogVar.getContext(), ((zzaow) zzaogVar).zztb(), zzb, (View) ((zzaoy) zzaogVar), zzaogVar.zzsi());
        }
        ((zzaou) zzaogVar).zza(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), zzb, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1205(boolean z) {
        zzwr zzwrVar = this.f2604;
        if (zzwrVar != null) {
            zzwrVar.zzl(z);
        }
    }
}
