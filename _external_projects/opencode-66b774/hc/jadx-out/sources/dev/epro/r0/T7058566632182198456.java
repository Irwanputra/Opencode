package dev.epro.r0;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T7058566632182198456 extends SegmentFinder {
    public final /* synthetic */ F6353700998356592239 a;

    public T7058566632182198456(F6353700998356592239 f6353700998356592239) {
        this.a = f6353700998356592239;
    }

    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.a(i);
    }
}
