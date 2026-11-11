package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p131.p161.p162.p193.p205.C2508;
import p131.p161.p162.p193.p205.C2518;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzdm {
    private static final String TAG = "zzdm";
    public Context zzair;
    private ExecutorService zzais;
    private DexClassLoader zzait;
    private zzcx zzaiu;
    private byte[] zzaiv;
    private boolean zzaiy;
    private zzcp zzajb;
    private Map<Pair<String, String>, zzer> zzaje;
    private volatile AdvertisingIdClient zzaiw = null;
    private volatile boolean zzahr = false;
    private Future zzaix = null;
    private volatile zzaz zzaiz = null;
    private Future zzaja = null;
    private boolean zzajc = false;
    private boolean zzajd = false;
    private boolean zzajf = false;
    private boolean zzajg = true;
    private boolean zzajh = false;

    public final class zza extends BroadcastReceiver {
        private zza() {
        }

        public /* synthetic */ zza(zzdm zzdmVar, zzdn zzdnVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                zzdm.this.zzajg = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                zzdm.this.zzajg = false;
            }
        }
    }

    private zzdm(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.zzaiy = z;
        this.zzair = z ? applicationContext : context;
        this.zzaje = new HashMap();
    }

    public static zzdm zza(Context context, String str, String str2, boolean z) {
        zzdm zzdmVar = new zzdm(context);
        try {
            zzdmVar.zzais = Executors.newCachedThreadPool();
            zzdmVar.zzahr = z;
            if (z) {
                zzdmVar.zzaix = zzdmVar.zzais.submit(new zzdn(zzdmVar));
            }
            zzdmVar.zzais.execute(new zzdp(zzdmVar));
            try {
                C2518 c2518 = C2518.f9865;
                zzdmVar.zzajc = C2518.m4530(zzdmVar.zzair) > 0;
                zzdmVar.zzajd = c2518.m4531(zzdmVar.zzair) == 0;
            } catch (Throwable unused) {
            }
            zzdmVar.zza(0, true);
            if (zzdr.zzau() && ((Boolean) zzkb.zzif().zzd(zznh.zzbnv)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzdn zzdnVar = null;
            zzcx zzcxVar = new zzcx(null);
            zzdmVar.zzaiu = zzcxVar;
            try {
                zzdmVar.zzaiv = zzcxVar.zzl(str);
                try {
                    try {
                        File cacheDir = zzdmVar.zzair.getCacheDir();
                        if (cacheDir == null && (cacheDir = zzdmVar.zzair.getDir("dex", 0)) == null) {
                            throw new zzdj();
                        }
                        File file = new File(String.format("%s/%s.jar", cacheDir, "1505450608132"));
                        if (!file.exists()) {
                            byte[] zzb = zzdmVar.zzaiu.zzb(zzdmVar.zzaiv, str2);
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            fileOutputStream.write(zzb, 0, zzb.length);
                            fileOutputStream.close();
                        }
                        zzdmVar.zzb(cacheDir, "1505450608132");
                        try {
                            zzdmVar.zzait = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzdmVar.zzair.getClassLoader());
                            zzb(file);
                            zzdmVar.zza(cacheDir, "1505450608132");
                            zzm(String.format("%s/%s.dex", cacheDir, "1505450608132"));
                            if (((Boolean) zzkb.zzif().zzd(zznh.zzbnn)).booleanValue() && !zzdmVar.zzajh) {
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("android.intent.action.USER_PRESENT");
                                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                                zzdmVar.zzair.registerReceiver(new zza(zzdmVar, zzdnVar), intentFilter);
                                zzdmVar.zzajh = true;
                            }
                            zzdmVar.zzajb = new zzcp(zzdmVar);
                            zzdmVar.zzajf = true;
                        } catch (Throwable th) {
                            zzb(file);
                            zzdmVar.zza(cacheDir, "1505450608132");
                            zzm(String.format("%s/%s.dex", cacheDir, "1505450608132"));
                            throw th;
                        }
                    } catch (zzcy e) {
                        throw new zzdj(e);
                    } catch (NullPointerException e2) {
                        throw new zzdj(e2);
                    }
                } catch (FileNotFoundException e3) {
                    throw new zzdj(e3);
                } catch (IOException e4) {
                    throw new zzdj(e4);
                }
            } catch (zzcy e5) {
                throw new zzdj(e5);
            }
        } catch (zzdj unused2) {
        }
        return zzdmVar;
    }

    private final void zza(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        zzb(file3);
                        return;
                    }
                    zzbd zzbdVar = new zzbd();
                    zzbdVar.zzgn = Build.VERSION.SDK.getBytes();
                    zzbdVar.zzgm = str.getBytes();
                    byte[] bytes = this.zzaiu.zzc(this.zzaiv, bArr).getBytes();
                    zzbdVar.data = bytes;
                    zzbdVar.zzgl = zzbw.zzb(bytes);
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] zzc = zzfjs.zzc(zzbdVar);
                        fileOutputStream.write(zzc, 0, zzc.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        zzb(file3);
                    } catch (zzcy | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        zzb(file3);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        zzb(file3);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (zzcy | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            }
        } catch (zzcy | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(int i, zzaz zzazVar) {
        Long l;
        String str;
        if (i >= 4) {
            return false;
        }
        if (zzazVar == null) {
            return true;
        }
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbny)).booleanValue() && ((str = zzazVar.zzcw) == null || str.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
            return true;
        }
        if (!((Boolean) zzkb.zzif().zzd(zznh.zzbnz)).booleanValue()) {
            return false;
        }
        zzbe zzbeVar = zzazVar.zzfi;
        return zzbeVar == null || (l = zzbeVar.zzgg) == null || l.longValue() == -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaq() {
        try {
            if (this.zzaiw == null && this.zzaiy) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzair);
                advertisingIdClient.start();
                this.zzaiw = advertisingIdClient;
            }
        } catch (IOException | C2508 unused) {
            this.zzaiw = null;
        }
    }

    private final zzaz zzar() {
        try {
            PackageInfo packageInfo = this.zzair.getPackageManager().getPackageInfo(this.zzair.getPackageName(), 0);
            Context context = this.zzair;
            return zzcbm.zzm(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void zzb(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            String.format("File %s not found. No need for deletion", file.getAbsolutePath());
        }
    }

    private final boolean zzb(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                zzb(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        zzb(file2);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        return false;
                    }
                    zzbd zzbdVar = (zzbd) zzfjs.zza(new zzbd(), bArr);
                    if (str.equals(new String(zzbdVar.zzgm)) && Arrays.equals(zzbdVar.zzgl, zzbw.zzb(zzbdVar.data)) && Arrays.equals(zzbdVar.zzgn, Build.VERSION.SDK.getBytes())) {
                        byte[] zzb = this.zzaiu.zzb(this.zzaiv, new String(zzbdVar.data));
                        file3.createNewFile();
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            fileOutputStream.write(zzb, 0, zzb.length);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                            return true;
                        } catch (zzcy | IOException | NoSuchAlgorithmException unused4) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (fileOutputStream == null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException unused8) {
                                throw th;
                            }
                        }
                    }
                    zzb(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused9) {
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (zzcy | IOException | NoSuchAlgorithmException unused10) {
                fileOutputStream = null;
            }
        } catch (zzcy | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void zzm(String str) {
        zzb(new File(str));
    }

    public final Context getContext() {
        return this.zzair;
    }

    public final boolean isInitialized() {
        return this.zzajf;
    }

    public final Method zza(String str, String str2) {
        zzer zzerVar = this.zzaje.get(new Pair(str, str2));
        if (zzerVar == null) {
            return null;
        }
        return zzerVar.zzbd();
    }

    public final void zza(int i, boolean z) {
        if (this.zzajd) {
            Future<?> submit = this.zzais.submit(new zzdo(this, i, z));
            if (i == 0) {
                this.zzaja = submit;
            }
        }
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzaje.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzaje.put(new Pair<>(str, str2), new zzer(this, str, str2, clsArr));
        return true;
    }

    public final int zzac() {
        if (this.zzajb != null) {
            return zzcp.zzac();
        }
        return Integer.MIN_VALUE;
    }

    public final ExecutorService zzag() {
        return this.zzais;
    }

    public final DexClassLoader zzah() {
        return this.zzait;
    }

    public final zzcx zzai() {
        return this.zzaiu;
    }

    public final byte[] zzaj() {
        return this.zzaiv;
    }

    public final boolean zzak() {
        return this.zzajc;
    }

    public final zzcp zzal() {
        return this.zzajb;
    }

    public final boolean zzam() {
        return this.zzajd;
    }

    public final boolean zzan() {
        return this.zzajg;
    }

    public final zzaz zzao() {
        return this.zzaiz;
    }

    public final Future zzap() {
        return this.zzaja;
    }

    public final AdvertisingIdClient zzas() {
        if (!this.zzahr) {
            return null;
        }
        if (this.zzaiw != null) {
            return this.zzaiw;
        }
        Future future = this.zzaix;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.zzaix = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzaix.cancel(true);
            }
        }
        return this.zzaiw;
    }

    public final zzaz zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return zzar();
    }
}
