package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p131.p155.p156.p157.C2098;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznk {
    private Context mContext;
    private String zzavn;
    private String zzbsa;
    private BlockingQueue<zznu> zzbsc;
    private ExecutorService zzbsd;
    private LinkedHashMap<String, String> zzbse = new LinkedHashMap<>();
    private Map<String, zzno> zzbsf = new HashMap();
    private AtomicBoolean zzbsg;
    private File zzbsh;

    public zznk(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.mContext = context;
        this.zzavn = str;
        this.zzbsa = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzbsg = atomicBoolean;
        atomicBoolean.set(((Boolean) zzkb.zzif().zzd(zznh.zzbjn)).booleanValue());
        if (this.zzbsg.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzbsh = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.zzbse.put(entry.getKey(), entry.getValue());
        }
        this.zzbsc = new ArrayBlockingQueue(30);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.zzbsd = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new zznl(this));
        Map<String, zzno> map2 = this.zzbsf;
        zzno zznoVar = zzno.zzbsk;
        map2.put("action", zznoVar);
        this.zzbsf.put("ad_format", zznoVar);
        this.zzbsf.put("e", zzno.zzbsl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzjb() {
        FileOutputStream fileOutputStream;
        while (true) {
            try {
                zznu take = this.zzbsc.take();
                String zzjg = take.zzjg();
                if (!TextUtils.isEmpty(zzjg)) {
                    Map<String, String> zza = zza(this.zzbse, take.zzjh());
                    Uri.Builder buildUpon = Uri.parse(this.zzbsa).buildUpon();
                    for (Map.Entry<String, String> entry : zza.entrySet()) {
                        buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    String m4198 = C2098.m4198(new StringBuilder(buildUpon.build().toString()), "&it=", zzjg);
                    if (this.zzbsg.get()) {
                        File file = this.zzbsh;
                        if (file != null) {
                            FileOutputStream fileOutputStream2 = null;
                            try {
                                try {
                                    fileOutputStream = new FileOutputStream(file, true);
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = null;
                                }
                            } catch (IOException e) {
                                e = e;
                            }
                            try {
                                fileOutputStream.write(m4198.getBytes());
                                fileOutputStream.write(10);
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    zzakb.zzc("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                                }
                            } catch (IOException e3) {
                                e = e3;
                                fileOutputStream2 = fileOutputStream;
                                zzakb.zzc("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e4) {
                                        zzakb.zzc("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                    }
                                }
                                throw th;
                            }
                        } else {
                            zzakb.zzcu("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        zzbs.zzei();
                        zzahn.zze(this.mContext, this.zzavn, m4198);
                    }
                }
            } catch (InterruptedException e5) {
                zzakb.zzc("CsiReporter:reporter interrupted", e5);
                return;
            }
        }
    }

    public final Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, zzam(key).zze((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    public final boolean zza(zznu zznuVar) {
        return this.zzbsc.offer(zznuVar);
    }

    public final zzno zzam(String str) {
        zzno zznoVar = this.zzbsf.get(str);
        return zznoVar != null ? zznoVar : zzno.zzbsj;
    }

    public final void zzg(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.zzbse.put("e", TextUtils.join(",", list));
    }
}
