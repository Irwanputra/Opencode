package dev.epro.r0;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H8027516537527559298 extends L7743116545240101509 implements RunnableFuture {
    public volatile V7099331121715077141 h;

    public H8027516537527559298(Callable callable) {
        this.h = new V7099331121715077141(this, callable);
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final void c() {
        V7099331121715077141 v7099331121715077141;
        if (o() && (v7099331121715077141 = this.h) != null) {
            v7099331121715077141.c();
        }
        this.h = null;
    }

    @Override // dev.epro.r0.R4225980552687347745
    public final String i() {
        V7099331121715077141 v7099331121715077141 = this.h;
        if (v7099331121715077141 == null) {
            return super.i();
        }
        return "task=[" + v7099331121715077141 + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        V7099331121715077141 v7099331121715077141 = this.h;
        if (v7099331121715077141 != null) {
            v7099331121715077141.run();
        }
        this.h = null;
    }
}
