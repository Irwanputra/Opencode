package com.google.android.gms.internal;

import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzai implements zzm {
    private static boolean DEBUG = zzae.DEBUG;

    @Deprecated
    private zzaq zzbp;
    private final zzah zzbq;
    private zzaj zzbr;

    public zzai(zzah zzahVar) {
        this(zzahVar, new zzaj(NotificationCompat.FLAG_BUBBLE));
    }

    private zzai(zzah zzahVar, zzaj zzajVar) {
        this.zzbq = zzahVar;
        this.zzbp = zzahVar;
        this.zzbr = zzajVar;
    }

    @Deprecated
    public zzai(zzaq zzaqVar) {
        this(zzaqVar, new zzaj(NotificationCompat.FLAG_BUBBLE));
    }

    @Deprecated
    private zzai(zzaq zzaqVar, zzaj zzajVar) {
        this.zzbp = zzaqVar;
        this.zzbq = new zzag(zzaqVar);
        this.zzbr = zzajVar;
    }

    private static List<zzl> zza(List<zzl> list, zzc zzcVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<zzl> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().getName());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<zzl> list2 = zzcVar.zzg;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (zzl zzlVar : zzcVar.zzg) {
                    if (!treeSet.contains(zzlVar.getName())) {
                        arrayList.add(zzlVar);
                    }
                }
            }
        } else if (!zzcVar.zzf.isEmpty()) {
            for (Map.Entry<String, String> entry : zzcVar.zzf.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new zzl(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    private static void zza(String str, zzr<?> zzrVar, zzad zzadVar) {
        zzaa zzi = zzrVar.zzi();
        int zzh = zzrVar.zzh();
        try {
            zzi.zza(zzadVar);
            zzrVar.zzb(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzh)));
        } catch (zzad e) {
            zzrVar.zzb(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzh)));
            throw e;
        }
    }

    private final byte[] zza(InputStream inputStream, int i) {
        zzat zzatVar = new zzat(this.zzbr, i);
        try {
            if (inputStream == null) {
                throw new zzab();
            }
            byte[] zzb = this.zzbr.zzb(1024);
            while (true) {
                int read = inputStream.read(zzb);
                if (read == -1) {
                    break;
                }
                zzatVar.write(zzb, 0, read);
            }
            byte[] byteArray = zzatVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused) {
                zzae.zza("Error occurred when closing InputStream", new Object[0]);
            }
            this.zzbr.zza(zzb);
            zzatVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzae.zza("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzbr.zza(null);
            zzatVar.close();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.zzm
    public zzp zzc(zzr<?> zzrVar) {
        zzad zzacVar;
        String str;
        List list;
        byte[] bArr;
        Map<String, String> map;
        zzap zza;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List emptyList = Collections.emptyList();
            zzap zzapVar = null;
            try {
                try {
                    zzc zze = zzrVar.zze();
                    if (zze == null) {
                        map = Collections.emptyMap();
                    } else {
                        HashMap hashMap = new HashMap();
                        String str2 = zze.zza;
                        if (str2 != null) {
                            hashMap.put("If-None-Match", str2);
                        }
                        long j = zze.zzc;
                        if (j > 0) {
                            hashMap.put("If-Modified-Since", zzao.zzb(j));
                        }
                        map = hashMap;
                    }
                    zza = this.zzbq.zza(zzrVar, map);
                } catch (IOException e) {
                    e = e;
                    list = emptyList;
                    bArr = null;
                }
                try {
                    int statusCode = zza.getStatusCode();
                    List<zzl> zzp = zza.zzp();
                    if (statusCode == 304) {
                        zzc zze2 = zzrVar.zze();
                        return zze2 == null ? new zzp(304, (byte[]) null, true, SystemClock.elapsedRealtime() - elapsedRealtime, zzp) : new zzp(304, zze2.data, true, SystemClock.elapsedRealtime() - elapsedRealtime, zza(zzp, zze2));
                    }
                    InputStream content = zza.getContent();
                    byte[] zza2 = content != null ? zza(content, zza.getContentLength()) : new byte[0];
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (DEBUG || elapsedRealtime2 > 3000) {
                        Object[] objArr = new Object[5];
                        objArr[0] = zzrVar;
                        objArr[1] = Long.valueOf(elapsedRealtime2);
                        objArr[2] = zza2 != null ? Integer.valueOf(zza2.length) : "null";
                        objArr[3] = Integer.valueOf(statusCode);
                        objArr[4] = Integer.valueOf(zzrVar.zzi().zzc());
                        zzae.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                    }
                    if (statusCode < 200 || statusCode > 299) {
                        throw new IOException();
                    }
                    return new zzp(statusCode, zza2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzp);
                } catch (IOException e2) {
                    e = e2;
                    list = emptyList;
                    bArr = null;
                    zzapVar = zza;
                    if (zzapVar == null) {
                        throw new zzq(e);
                    }
                    int statusCode2 = zzapVar.getStatusCode();
                    zzae.zzc("Unexpected response code %d for %s", Integer.valueOf(statusCode2), zzrVar.getUrl());
                    if (bArr != null) {
                        zzp zzpVar = new zzp(statusCode2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, (List<zzl>) list);
                        if (statusCode2 != 401 && statusCode2 != 403) {
                            if (statusCode2 >= 400 && statusCode2 <= 499) {
                                throw new zzg(zzpVar);
                            }
                            if (statusCode2 < 500 || statusCode2 > 599) {
                                throw new zzab(zzpVar);
                            }
                            throw new zzab(zzpVar);
                        }
                        zzacVar = new zza(zzpVar);
                        str = "auth";
                    } else {
                        zzacVar = new zzo();
                        str = "network";
                    }
                    zza(str, zzrVar, zzacVar);
                }
            } catch (MalformedURLException e3) {
                String valueOf = String.valueOf(zzrVar.getUrl());
                throw new RuntimeException(valueOf.length() != 0 ? "Bad URL ".concat(valueOf) : new String("Bad URL "), e3);
            } catch (SocketTimeoutException unused) {
                zzacVar = new zzac();
                str = "socket";
            }
            zza(str, zzrVar, zzacVar);
        }
    }
}
