package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzakw {
    private final Object zzdez = new Object();
    private final List<Runnable> zzdfa = new ArrayList();
    private boolean zzdfb = false;

    public final void zza(final Runnable runnable, final Executor executor) {
        synchronized (this.zzdez) {
            if (this.zzdfb) {
                executor.execute(runnable);
            } else {
                this.zzdfa.add(new Runnable(executor, runnable) { // from class: com.google.android.gms.internal.zzakx
                    private final Executor zzdfc;
                    private final Runnable zzdfd;

                    {
                        this.zzdfc = executor;
                        this.zzdfd = runnable;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzdfc.execute(this.zzdfd);
                    }
                });
            }
        }
    }

    public final void zzre() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.zzdez) {
            if (this.zzdfb) {
                return;
            }
            arrayList.addAll(this.zzdfa);
            this.zzdfa.clear();
            this.zzdfb = true;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
    }
}
