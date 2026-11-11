package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzym implements Callable<zzafo> {
    private static long zzckf = 10;
    private final Context mContext;
    private final zznu zzanj;
    private final zzzb zzarn;
    private final zzcv zzbuv;
    private final zzafp zzcjk;
    private final zzaiv zzckg;
    private final com.google.android.gms.ads.internal.zzba zzckh;
    private JSONObject zzckk;
    private final Object mLock = new Object();
    private boolean zzcki = false;
    private int mErrorCode = -2;
    private List<String> zzckj = null;
    private String zzckl = null;

    public zzym(Context context, com.google.android.gms.ads.internal.zzba zzbaVar, zzaiv zzaivVar, zzcv zzcvVar, zzafp zzafpVar, zznu zznuVar) {
        this.mContext = context;
        this.zzckh = zzbaVar;
        this.zzckg = zzaivVar;
        this.zzcjk = zzafpVar;
        this.zzbuv = zzcvVar;
        this.zzanj = zznuVar;
        this.zzarn = zzbaVar.zzdq();
    }

    private final zzafo zza(zzou zzouVar) {
        int i;
        synchronized (this.mLock) {
            int i2 = this.mErrorCode;
            i = (zzouVar == null && i2 == -2) ? 0 : i2;
        }
        zzou zzouVar2 = i != -2 ? null : zzouVar;
        zzafp zzafpVar = this.zzcjk;
        zzaat zzaatVar = zzafpVar.zzcqv;
        zzjj zzjjVar = zzaatVar.zzcnd;
        zzaax zzaaxVar = zzafpVar.zzcxy;
        return new zzafo(zzjjVar, null, zzaaxVar.zzcdk, i, zzaaxVar.zzcdl, this.zzckj, zzaaxVar.orientation, zzaaxVar.zzcdq, zzaatVar.zzcng, false, null, null, null, null, null, 0L, zzafpVar.zzauc, zzaaxVar.zzcov, zzafpVar.zzcxp, zzafpVar.zzcxq, zzaaxVar.zzcpb, this.zzckk, zzouVar2, null, null, null, zzaaxVar.zzcpo, zzaaxVar.zzcpp, null, zzaaxVar.zzcdn, this.zzckl, zzafpVar.zzcxw, zzaaxVar.zzaqv, zzafpVar.zzcxx);
    }

    private final zzakv<zzoi> zza(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? zzakl.zzi(new zzoi(null, Uri.parse(string), optDouble)) : this.zzckg.zza(string, new zzyq(this, z, optDouble, optBoolean, string));
        }
        zzd(0, z);
        return zzakl.zzi(null);
    }

    public static zzanh zzb(zzakv<zzanh> zzakvVar) {
        try {
            return zzakvVar.get(((Integer) zzkb.zzif().zzd(zznh.zzbot)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            zzakb.zzc("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException e2) {
            e = e2;
            zzakb.zzc("Exception occurred while waiting for video to load", e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            zzakb.zzc("Exception occurred while waiting for video to load", e);
            return null;
        } catch (TimeoutException e4) {
            e = e4;
            zzakb.zzc("Exception occurred while waiting for video to load", e);
            return null;
        }
    }

    private static Integer zzb(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzqm zzqmVar, String str) {
        try {
            zzqw zzs = this.zzckh.zzs(zzqmVar.getCustomTemplateId());
            if (zzs != null) {
                zzs.zzb(zzqmVar, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzakb.zzc(sb.toString(), e);
        }
    }

    private static String[] zzd(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    private static <V> zzakv<List<V>> zzl(List<zzakv<V>> list) {
        zzalf zzalfVar = new zzalf();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator<zzakv<V>> it = list.iterator();
        while (it.hasNext()) {
            it.next().zza(new zzyr(atomicInteger, size, zzalfVar, list), zzahh.zzdar);
        }
        return zzalfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> List<V> zzm(List<zzakv<V>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<zzakv<V>> it = list.iterator();
        while (it.hasNext()) {
            V v = it.next().get();
            if (v != null) {
                arrayList.add(v);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r4.length() != 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[Catch: Exception -> 0x017a, TimeoutException -> 0x017e, JSONException -> 0x0182, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, TryCatch #1 {InterruptedException | CancellationException | ExecutionException -> 0x0189, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x0038, B:8:0x0038, B:8:0x0038, B:10:0x003e, B:10:0x003e, B:10:0x003e, B:12:0x0046, B:12:0x0046, B:12:0x0046, B:14:0x0050, B:14:0x0050, B:14:0x0050, B:16:0x0068, B:16:0x0068, B:16:0x0068, B:17:0x0079, B:17:0x0079, B:17:0x0079, B:21:0x0083, B:21:0x0083, B:21:0x0083, B:23:0x0091, B:23:0x0091, B:23:0x0091, B:25:0x0097, B:25:0x0097, B:25:0x0097, B:26:0x009b, B:26:0x009b, B:26:0x009b, B:28:0x00a3, B:28:0x00a3, B:28:0x00a3, B:29:0x010c, B:29:0x010c, B:29:0x010c, B:34:0x0117, B:34:0x0117, B:34:0x0117, B:37:0x012b, B:37:0x012b, B:37:0x012b, B:38:0x015b, B:38:0x015b, B:38:0x015b, B:40:0x015f, B:40:0x015f, B:40:0x015f, B:41:0x0175, B:41:0x0175, B:41:0x0175, B:45:0x0127, B:45:0x0127, B:45:0x0127, B:47:0x00ad, B:47:0x00ad, B:47:0x00ad, B:49:0x00b5, B:49:0x00b5, B:49:0x00b5, B:50:0x00bf, B:50:0x00bf, B:50:0x00bf, B:52:0x00c7, B:52:0x00c7, B:52:0x00c7, B:54:0x00e4, B:54:0x00e4, B:54:0x00e4, B:55:0x00ea, B:55:0x00ea, B:55:0x00ea, B:57:0x00fa, B:57:0x00fa, B:57:0x00fa, B:58:0x0104, B:58:0x0104, B:58:0x0104, B:59:0x00ff, B:59:0x00ff, B:59:0x00ff, B:60:0x0108, B:60:0x0108, B:60:0x0108, B:65:0x004c, B:65:0x004c, B:65:0x004c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[Catch: Exception -> 0x017a, TimeoutException -> 0x017e, JSONException -> 0x0182, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, TryCatch #1 {InterruptedException | CancellationException | ExecutionException -> 0x0189, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x0038, B:8:0x0038, B:8:0x0038, B:10:0x003e, B:10:0x003e, B:10:0x003e, B:12:0x0046, B:12:0x0046, B:12:0x0046, B:14:0x0050, B:14:0x0050, B:14:0x0050, B:16:0x0068, B:16:0x0068, B:16:0x0068, B:17:0x0079, B:17:0x0079, B:17:0x0079, B:21:0x0083, B:21:0x0083, B:21:0x0083, B:23:0x0091, B:23:0x0091, B:23:0x0091, B:25:0x0097, B:25:0x0097, B:25:0x0097, B:26:0x009b, B:26:0x009b, B:26:0x009b, B:28:0x00a3, B:28:0x00a3, B:28:0x00a3, B:29:0x010c, B:29:0x010c, B:29:0x010c, B:34:0x0117, B:34:0x0117, B:34:0x0117, B:37:0x012b, B:37:0x012b, B:37:0x012b, B:38:0x015b, B:38:0x015b, B:38:0x015b, B:40:0x015f, B:40:0x015f, B:40:0x015f, B:41:0x0175, B:41:0x0175, B:41:0x0175, B:45:0x0127, B:45:0x0127, B:45:0x0127, B:47:0x00ad, B:47:0x00ad, B:47:0x00ad, B:49:0x00b5, B:49:0x00b5, B:49:0x00b5, B:50:0x00bf, B:50:0x00bf, B:50:0x00bf, B:52:0x00c7, B:52:0x00c7, B:52:0x00c7, B:54:0x00e4, B:54:0x00e4, B:54:0x00e4, B:55:0x00ea, B:55:0x00ea, B:55:0x00ea, B:57:0x00fa, B:57:0x00fa, B:57:0x00fa, B:58:0x0104, B:58:0x0104, B:58:0x0104, B:59:0x00ff, B:59:0x00ff, B:59:0x00ff, B:60:0x0108, B:60:0x0108, B:60:0x0108, B:65:0x004c, B:65:0x004c, B:65:0x004c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[Catch: Exception -> 0x017a, TimeoutException -> 0x017e, JSONException -> 0x0182, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, TryCatch #1 {InterruptedException | CancellationException | ExecutionException -> 0x0189, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x0038, B:8:0x0038, B:8:0x0038, B:10:0x003e, B:10:0x003e, B:10:0x003e, B:12:0x0046, B:12:0x0046, B:12:0x0046, B:14:0x0050, B:14:0x0050, B:14:0x0050, B:16:0x0068, B:16:0x0068, B:16:0x0068, B:17:0x0079, B:17:0x0079, B:17:0x0079, B:21:0x0083, B:21:0x0083, B:21:0x0083, B:23:0x0091, B:23:0x0091, B:23:0x0091, B:25:0x0097, B:25:0x0097, B:25:0x0097, B:26:0x009b, B:26:0x009b, B:26:0x009b, B:28:0x00a3, B:28:0x00a3, B:28:0x00a3, B:29:0x010c, B:29:0x010c, B:29:0x010c, B:34:0x0117, B:34:0x0117, B:34:0x0117, B:37:0x012b, B:37:0x012b, B:37:0x012b, B:38:0x015b, B:38:0x015b, B:38:0x015b, B:40:0x015f, B:40:0x015f, B:40:0x015f, B:41:0x0175, B:41:0x0175, B:41:0x0175, B:45:0x0127, B:45:0x0127, B:45:0x0127, B:47:0x00ad, B:47:0x00ad, B:47:0x00ad, B:49:0x00b5, B:49:0x00b5, B:49:0x00b5, B:50:0x00bf, B:50:0x00bf, B:50:0x00bf, B:52:0x00c7, B:52:0x00c7, B:52:0x00c7, B:54:0x00e4, B:54:0x00e4, B:54:0x00e4, B:55:0x00ea, B:55:0x00ea, B:55:0x00ea, B:57:0x00fa, B:57:0x00fa, B:57:0x00fa, B:58:0x0104, B:58:0x0104, B:58:0x0104, B:59:0x00ff, B:59:0x00ff, B:59:0x00ff, B:60:0x0108, B:60:0x0108, B:60:0x0108, B:65:0x004c, B:65:0x004c, B:65:0x004c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f A[Catch: Exception -> 0x017a, TimeoutException -> 0x017e, JSONException -> 0x0182, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, TryCatch #1 {InterruptedException | CancellationException | ExecutionException -> 0x0189, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x0038, B:8:0x0038, B:8:0x0038, B:10:0x003e, B:10:0x003e, B:10:0x003e, B:12:0x0046, B:12:0x0046, B:12:0x0046, B:14:0x0050, B:14:0x0050, B:14:0x0050, B:16:0x0068, B:16:0x0068, B:16:0x0068, B:17:0x0079, B:17:0x0079, B:17:0x0079, B:21:0x0083, B:21:0x0083, B:21:0x0083, B:23:0x0091, B:23:0x0091, B:23:0x0091, B:25:0x0097, B:25:0x0097, B:25:0x0097, B:26:0x009b, B:26:0x009b, B:26:0x009b, B:28:0x00a3, B:28:0x00a3, B:28:0x00a3, B:29:0x010c, B:29:0x010c, B:29:0x010c, B:34:0x0117, B:34:0x0117, B:34:0x0117, B:37:0x012b, B:37:0x012b, B:37:0x012b, B:38:0x015b, B:38:0x015b, B:38:0x015b, B:40:0x015f, B:40:0x015f, B:40:0x015f, B:41:0x0175, B:41:0x0175, B:41:0x0175, B:45:0x0127, B:45:0x0127, B:45:0x0127, B:47:0x00ad, B:47:0x00ad, B:47:0x00ad, B:49:0x00b5, B:49:0x00b5, B:49:0x00b5, B:50:0x00bf, B:50:0x00bf, B:50:0x00bf, B:52:0x00c7, B:52:0x00c7, B:52:0x00c7, B:54:0x00e4, B:54:0x00e4, B:54:0x00e4, B:55:0x00ea, B:55:0x00ea, B:55:0x00ea, B:57:0x00fa, B:57:0x00fa, B:57:0x00fa, B:58:0x0104, B:58:0x0104, B:58:0x0104, B:59:0x00ff, B:59:0x00ff, B:59:0x00ff, B:60:0x0108, B:60:0x0108, B:60:0x0108, B:65:0x004c, B:65:0x004c, B:65:0x004c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127 A[Catch: Exception -> 0x017a, TimeoutException -> 0x017e, JSONException -> 0x0182, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, TryCatch #1 {InterruptedException | CancellationException | ExecutionException -> 0x0189, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x0038, B:8:0x0038, B:8:0x0038, B:10:0x003e, B:10:0x003e, B:10:0x003e, B:12:0x0046, B:12:0x0046, B:12:0x0046, B:14:0x0050, B:14:0x0050, B:14:0x0050, B:16:0x0068, B:16:0x0068, B:16:0x0068, B:17:0x0079, B:17:0x0079, B:17:0x0079, B:21:0x0083, B:21:0x0083, B:21:0x0083, B:23:0x0091, B:23:0x0091, B:23:0x0091, B:25:0x0097, B:25:0x0097, B:25:0x0097, B:26:0x009b, B:26:0x009b, B:26:0x009b, B:28:0x00a3, B:28:0x00a3, B:28:0x00a3, B:29:0x010c, B:29:0x010c, B:29:0x010c, B:34:0x0117, B:34:0x0117, B:34:0x0117, B:37:0x012b, B:37:0x012b, B:37:0x012b, B:38:0x015b, B:38:0x015b, B:38:0x015b, B:40:0x015f, B:40:0x015f, B:40:0x015f, B:41:0x0175, B:41:0x0175, B:41:0x0175, B:45:0x0127, B:45:0x0127, B:45:0x0127, B:47:0x00ad, B:47:0x00ad, B:47:0x00ad, B:49:0x00b5, B:49:0x00b5, B:49:0x00b5, B:50:0x00bf, B:50:0x00bf, B:50:0x00bf, B:52:0x00c7, B:52:0x00c7, B:52:0x00c7, B:54:0x00e4, B:54:0x00e4, B:54:0x00e4, B:55:0x00ea, B:55:0x00ea, B:55:0x00ea, B:57:0x00fa, B:57:0x00fa, B:57:0x00fa, B:58:0x0104, B:58:0x0104, B:58:0x0104, B:59:0x00ff, B:59:0x00ff, B:59:0x00ff, B:60:0x0108, B:60:0x0108, B:60:0x0108, B:65:0x004c, B:65:0x004c, B:65:0x004c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad A[Catch: Exception -> 0x017a, TimeoutException -> 0x017e, JSONException -> 0x0182, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, InterruptedException | CancellationException | ExecutionException -> 0x0189, TryCatch #1 {InterruptedException | CancellationException | ExecutionException -> 0x0189, blocks: (B:3:0x0004, B:5:0x0010, B:8:0x0038, B:8:0x0038, B:8:0x0038, B:10:0x003e, B:10:0x003e, B:10:0x003e, B:12:0x0046, B:12:0x0046, B:12:0x0046, B:14:0x0050, B:14:0x0050, B:14:0x0050, B:16:0x0068, B:16:0x0068, B:16:0x0068, B:17:0x0079, B:17:0x0079, B:17:0x0079, B:21:0x0083, B:21:0x0083, B:21:0x0083, B:23:0x0091, B:23:0x0091, B:23:0x0091, B:25:0x0097, B:25:0x0097, B:25:0x0097, B:26:0x009b, B:26:0x009b, B:26:0x009b, B:28:0x00a3, B:28:0x00a3, B:28:0x00a3, B:29:0x010c, B:29:0x010c, B:29:0x010c, B:34:0x0117, B:34:0x0117, B:34:0x0117, B:37:0x012b, B:37:0x012b, B:37:0x012b, B:38:0x015b, B:38:0x015b, B:38:0x015b, B:40:0x015f, B:40:0x015f, B:40:0x015f, B:41:0x0175, B:41:0x0175, B:41:0x0175, B:45:0x0127, B:45:0x0127, B:45:0x0127, B:47:0x00ad, B:47:0x00ad, B:47:0x00ad, B:49:0x00b5, B:49:0x00b5, B:49:0x00b5, B:50:0x00bf, B:50:0x00bf, B:50:0x00bf, B:52:0x00c7, B:52:0x00c7, B:52:0x00c7, B:54:0x00e4, B:54:0x00e4, B:54:0x00e4, B:55:0x00ea, B:55:0x00ea, B:55:0x00ea, B:57:0x00fa, B:57:0x00fa, B:57:0x00fa, B:58:0x0104, B:58:0x0104, B:58:0x0104, B:59:0x00ff, B:59:0x00ff, B:59:0x00ff, B:60:0x0108, B:60:0x0108, B:60:0x0108, B:65:0x004c, B:65:0x004c, B:65:0x004c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzng, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.zzafo call() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzym.call():com.google.android.gms.internal.zzafo");
    }

    private final boolean zznh() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcki;
        }
        return z;
    }

    private final void zzz(int i) {
        synchronized (this.mLock) {
            this.zzcki = true;
            this.mErrorCode = i;
        }
    }

    public final zzakv<zzoi> zza(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, z, z2);
    }

    public final List<zzakv<zzoi>> zza(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            zzd(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(zza(jSONObject2, false, z2));
        }
        return arrayList;
    }

    public final Future<zzoi> zza(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        return zza(jSONObject2, jSONObject2.optBoolean("require", true), z);
    }

    public final zzakv<zzanh> zzc(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzakl.zzi(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            zzakb.zzcu("Required field 'vast_xml' is missing");
            return zzakl.zzi(null);
        }
        zzyt zzytVar = new zzyt(this.mContext, this.zzbuv, this.zzcjk, this.zzanj, this.zzckh);
        zzalf zzalfVar = new zzalf();
        zzbs.zzei();
        zzahn.runOnUiThread(new zzyu(zzytVar, optJSONObject, zzalfVar));
        return zzalfVar;
    }

    public final void zzd(int i, boolean z) {
        if (z) {
            zzz(i);
        }
    }

    public final zzakv<zzog> zzh(JSONObject jSONObject) {
        List<zzakv<zzoi>> list;
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzakl.zzi(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer zzb = zzb(optJSONObject, "text_color");
        Integer zzb2 = zzb(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        zzpe zzpeVar = this.zzcjk.zzcqv.zzauo;
        int i = (zzpeVar == null || zzpeVar.versionCode < 2) ? 1 : zzpeVar.zzbvh;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        ArrayList arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            list = zza(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(zza(optJSONObject, "image", false, false));
            list = arrayList;
        }
        return zzakl.zza(zzl(list), new zzyp(this, optString, zzb2, zzb, optInt, optInt3, optInt2, i, optBoolean), zzahh.zzdar);
    }
}
