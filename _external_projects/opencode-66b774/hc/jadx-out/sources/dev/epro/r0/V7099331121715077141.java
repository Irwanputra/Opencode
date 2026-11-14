package dev.epro.r0;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V7099331121715077141 extends Z13138252466311837697 {
    public final Callable c;
    public final /* synthetic */ H8027516537527559298 d;

    public V7099331121715077141(H8027516537527559298 h8027516537527559298, Callable callable) {
        this.d = h8027516537527559298;
        callable.getClass();
        this.c = callable;
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final void a(Throwable th) {
        this.d.l(th);
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final void b(Object obj) {
        this.d.k(obj);
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final Object e() {
        return this.c.call();
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final String f() {
        return this.c.toString();
    }
}
