package com.google.android.gms.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdvo extends WeakReference<Throwable> {
    private final int zzmal;

    public zzdvo(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zzmal = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzdvo.class) {
            if (this == obj) {
                return true;
            }
            zzdvo zzdvoVar = (zzdvo) obj;
            if (this.zzmal == zzdvoVar.zzmal && get() == zzdvoVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzmal;
    }
}
