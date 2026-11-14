package dev.epro.r0;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y15061126039216380234 {
    public Interpolator c;
    public P5210161598916505319 d;
    public boolean e;
    public long b = -1;
    public final W18114953444375790413 f = new W18114953444375790413(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Q1445202285683234142) obj).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Q1445202285683234142 q1445202285683234142 = (Q1445202285683234142) obj;
            long j = this.b;
            if (j >= 0) {
                q1445202285683234142.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) q1445202285683234142.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                q1445202285683234142.d(this.f);
            }
            View view2 = (View) q1445202285683234142.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
