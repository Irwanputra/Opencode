package dev.epro.r0;

import android.os.Build;
import android.os.Process;
import android.os.Trace;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R9704326227384281667 {
    public final G8258332950539424676 a;
    public final Executor b;
    public final Executor c;
    public final /* synthetic */ Z11821137052809198413 d;

    public R9704326227384281667(Z11821137052809198413 z11821137052809198413, UrlRequest.Callback callback, Executor executor) {
        this.d = z11821137052809198413;
        this.a = new G8258332950539424676(callback);
        if (z11821137052809198413.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new Q15119607593561432156(executor, (byte) 0);
            this.c = executor;
        }
    }

    public final L3824616114245370575 a() {
        Map asMap;
        String str;
        int i;
        long length;
        long length2;
        int i2;
        Z11821137052809198413 z11821137052809198413 = this.d;
        N12175049621887677679 n12175049621887677679 = z11821137052809198413.f598o;
        if (n12175049621887677679 != null) {
            asMap = n12175049621887677679.g.getAsMap();
            N12175049621887677679 n121750496218876776792 = z11821137052809198413.f598o;
            str = n121750496218876776792.d;
            i = n121750496218876776792.b;
        } else {
            asMap = Collections.EMPTY_MAP;
            str = "";
            i = 0;
        }
        String str2 = str;
        TreeMap treeMap = z11821137052809198413.d;
        long j = 0;
        if (treeMap == null) {
            length = 0;
        } else {
            length = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                String str3 = (String) entry.getKey();
                if (str3 != null) {
                    length += (long) str3.length();
                }
                String str4 = (String) entry.getValue();
                if (str4 != null) {
                    length += (long) str4.length();
                }
            }
        }
        if (asMap == null) {
            length2 = 0;
        } else {
            length2 = 0;
            for (Map.Entry entry2 : asMap.entrySet()) {
                String str5 = (String) entry2.getKey();
                if (str5 != null) {
                    length2 += (long) str5.length();
                }
                if (entry2.getValue() != null) {
                    for (String str6 : (List) entry2.getValue()) {
                        if (str6 != null) {
                            length2 += (long) str6.length();
                        }
                    }
                }
            }
        }
        if (asMap.containsKey("Content-Length")) {
            try {
                j = Long.parseLong((String) ((List) asMap.get("Content-Length")).get(0));
            } catch (NumberFormatException unused) {
            }
        } else {
            j = -1;
        }
        long j2 = j;
        Duration durationOfSeconds = Duration.ofSeconds(0L);
        Duration durationOfSeconds2 = Duration.ofSeconds(0L);
        int i3 = z11821137052809198413.f.get();
        if (i3 == 6) {
            i2 = 2;
        } else if (i3 == 7) {
            i2 = 1;
        } else {
            if (i3 != 8) {
                S10973172697741180971.m(G6547577305291411977.o(i3, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                return null;
            }
            i2 = 3;
        }
        int i4 = i2;
        int i5 = z11821137052809198413.x;
        int i6 = z11821137052809198413.w;
        W7359389094007644644 w7359389094007644644 = z11821137052809198413.r;
        return new L3824616114245370575(length, -1L, length2, j2, i, durationOfSeconds, durationOfSeconds2, str2, i4, i5, i6, w7359389094007644644 != null ? w7359389094007644644.h : 0, z11821137052809198413.y, Process.myUid(), ImplVersion.getCronetVersion());
    }

    public final void b(R5909351061398077004 r5909351061398077004, String str) {
        Z11821137052809198413 z11821137052809198413 = this.d;
        try {
            c(new S8612901348883321174(z11821137052809198413, r5909351061398077004, (byte) 1), str);
        } catch (RejectedExecutionException e) {
            z11821137052809198413.b(new Y11848166026895390553("Exception posting task to executor", e));
        }
    }

    public final void c(Runnable runnable, String str) {
        U1748733558996603759.b("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str));
        try {
            this.b.execute(new J14815962332293901910(str, runnable, (byte) 1));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        this.d.c(new W13948953340889349604(this, (byte) 16), "maybeReportMetrics");
    }
}
