package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzahh {
    public static final ThreadPoolExecutor zzdar;
    private static final ThreadPoolExecutor zzdas;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(20, 20, 1L, timeUnit, new LinkedBlockingQueue(), zzcc("Default"));
        zzdar = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 1L, timeUnit, new LinkedBlockingQueue(), zzcc("Loader"));
        zzdas = threadPoolExecutor2;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
    }

    public static zzakv<Void> zza(int i, Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor;
        Callable zzahjVar;
        if (i == 1) {
            threadPoolExecutor = zzdas;
            zzahjVar = new zzahi(runnable);
        } else {
            threadPoolExecutor = zzdar;
            zzahjVar = new zzahj(runnable);
        }
        return zza(threadPoolExecutor, zzahjVar);
    }

    public static zzakv<Void> zza(Runnable runnable) {
        return zza(0, runnable);
    }

    public static <T> zzakv<T> zza(ExecutorService executorService, Callable<T> callable) {
        zzalf zzalfVar = new zzalf();
        try {
            zzalfVar.zza(new zzahl(zzalfVar, executorService.submit(new zzahk(zzalfVar, callable))), zzala.zzdfe);
        } catch (RejectedExecutionException e) {
            zzakb.zzc("Thread execution is rejected.", e);
            zzalfVar.setException(e);
        }
        return zzalfVar;
    }

    private static ThreadFactory zzcc(String str) {
        return new zzahm(str);
    }
}
