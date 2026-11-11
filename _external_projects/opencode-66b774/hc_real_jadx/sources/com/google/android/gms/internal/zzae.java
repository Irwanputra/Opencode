package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzae {
    public static boolean DEBUG = Log.isLoggable("Volley", 2);
    private static String TAG = "Volley";

    public static class zza {
        public static final boolean zzbl = zzae.DEBUG;
        private final List<zzaf> zzbm = new ArrayList();
        private boolean zzbn = false;

        public final void finalize() {
            if (this.zzbn) {
                return;
            }
            zzc("Request on the loose");
            zzae.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        public final synchronized void zza(String str, long j) {
            if (this.zzbn) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.zzbm.add(new zzaf(str, j, SystemClock.elapsedRealtime()));
        }

        public final synchronized void zzc(String str) {
            long j;
            this.zzbn = true;
            if (this.zzbm.size() == 0) {
                j = 0;
            } else {
                long j2 = this.zzbm.get(0).time;
                List<zzaf> list = this.zzbm;
                j = list.get(list.size() - 1).time - j2;
            }
            if (j <= 0) {
                return;
            }
            long j3 = this.zzbm.get(0).time;
            zzae.zzb("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzaf zzafVar : this.zzbm) {
                long j4 = zzafVar.time;
                zzae.zzb("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzafVar.zzbo), zzafVar.name);
                j3 = j4;
            }
        }
    }

    public static void zza(String str, Object... objArr) {
        if (DEBUG) {
            zzd(str, objArr);
        }
    }

    public static void zza(Throwable th, String str, Object... objArr) {
        zzd(str, objArr);
    }

    public static void zzb(String str, Object... objArr) {
        zzd(str, objArr);
    }

    public static void zzc(String str, Object... objArr) {
        zzd(str, objArr);
    }

    private static String zzd(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClass().equals(zzae.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(methodName).length() + String.valueOf(substring2).length() + 1);
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
