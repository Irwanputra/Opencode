package dev.epro.r0;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P15195429501092761164 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ C18359104897526640234 a;

    public P15195429501092761164(C18359104897526640234 c18359104897526640234) {
        this.a = c18359104897526640234;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        this.a.D();
        C18359104897526640234 c18359104897526640234 = this.a;
        synchronized (c18359104897526640234.e) {
            if (c18359104897526640234.j) {
                c18359104897526640234.j = false;
                ArrayList arrayList = c18359104897526640234.g;
                c18359104897526640234.g = c18359104897526640234.h;
                c18359104897526640234.h = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.D();
        C18359104897526640234 c18359104897526640234 = this.a;
        synchronized (c18359104897526640234.e) {
            if (c18359104897526640234.g.isEmpty()) {
                c18359104897526640234.c.removeFrameCallback(this);
                c18359104897526640234.j = false;
            }
        }
    }
}
