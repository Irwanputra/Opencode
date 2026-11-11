package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzuh;
import com.google.android.gms.internal.zzva;
import com.google.android.gms.internal.zzzv;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import org.json.JSONObject;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaq {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(com.google.android.gms.internal.zzanh r25, com.google.android.gms.internal.zzuo r26, java.util.concurrent.CountDownLatch r27) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzaq.zza(com.google.android.gms.internal.zzanh, com.google.android.gms.internal.zzuo, java.util.concurrent.CountDownLatch):boolean");
    }

    public static View zze(zzafo zzafoVar) {
        Object obj;
        if (zzafoVar == null) {
            zzakb.e("AdState is null");
            return null;
        }
        if (zzf(zzafoVar) && (obj = zzafoVar.zzciy) != null) {
            obj.getClass();
            return (View) obj;
        }
        try {
            zzva zzvaVar = zzafoVar.zzcet;
            InterfaceC2455 view = zzvaVar != null ? zzvaVar.getView() : null;
            if (view != null) {
                return (View) BinderC2454.m4502(view);
            }
            zzakb.zzcu("View in mediation adapter is null.");
            return null;
        } catch (RemoteException e) {
            zzakb.zzc("Could not get View from mediation adapter.", e);
            return null;
        }
    }

    public static boolean zzf(zzafo zzafoVar) {
        zzuh zzuhVar;
        return (zzafoVar == null || !zzafoVar.zzcow || (zzuhVar = zzafoVar.zzces) == null || zzuhVar.zzcdc == null) ? false : true;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String m1228(zzpq zzpqVar) {
        String str;
        InterfaceC2455 zzjr;
        if (zzpqVar == null) {
            zzakb.zzcu("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri uri = zzpqVar.getUri();
            if (uri != null) {
                return uri.toString();
            }
        } catch (RemoteException unused) {
            zzakb.zzcu("Unable to get image uri. Trying data uri next");
        }
        try {
            zzjr = zzpqVar.zzjr();
        } catch (RemoteException unused2) {
            str = "Unable to get drawable. Returning empty string";
        }
        if (zzjr == null) {
            zzakb.zzcu("Drawable is null. Returning empty string");
            return "";
        }
        Drawable drawable = (Drawable) BinderC2454.m4502(zzjr);
        if (drawable instanceof BitmapDrawable) {
            return m1230(((BitmapDrawable) drawable).getBitmap());
        }
        str = "Drawable is not an instance of BitmapDrawable. Returning empty string";
        zzakb.zzcu(str);
        return "";
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static JSONObject m1229(Bundle bundle, String str) {
        String valueOf;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (bundle.containsKey(next)) {
                    if ("image".equals(jSONObject2.getString(next))) {
                        Object obj = bundle.get(next);
                        if (obj instanceof Bitmap) {
                            valueOf = m1230((Bitmap) obj);
                            jSONObject.put(next, valueOf);
                        } else {
                            str2 = "Invalid type. An image type extra should return a bitmap";
                            zzakb.zzcu(str2);
                        }
                    } else if (bundle.get(next) instanceof Bitmap) {
                        str2 = "Invalid asset type. Bitmap should be returned only for image type";
                        zzakb.zzcu(str2);
                    } else {
                        valueOf = String.valueOf(bundle.get(next));
                        jSONObject.put(next, valueOf);
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m1230(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            zzakb.zzcu("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
    }
}
