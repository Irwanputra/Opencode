package dev.epro.r0;

import android.window.OnBackInvokedDispatcher;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U6333859635337865127 {
    public final Runnable a;
    public final O12494175665883759871 b = new O12494175665883759871(new W2269277550458425547(this, (byte) 18));

    public U6333859635337865127(Runnable runnable) {
        this.a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [dev.epro.r0.R1119249027005566153] */
    public final void a(I4293432593871965076 i4293432593871965076, Y8405992380652585640 y8405992380652585640) {
        y8405992380652585640.getClass();
        final R3192876217964974737 r3192876217964974737J = i4293432593871965076.j();
        if (((I1283052979100930176) r3192876217964974737J).h == Q14196755420833223976.a) {
            return;
        }
        G12293180102257068867 g12293180102257068867CreateNavigationEventHandler$activity = y8405992380652585640.createNavigationEventHandler$activity(new I15850359048462423476(i4293432593871965076, y8405992380652585640));
        final byte b = 0;
        g12293180102257068867CreateNavigationEventHandler$activity.g(false);
        J15730374346044043770.k(b().c, g12293180102257068867CreateNavigationEventHandler$activity);
        final F15441078260174406238 f15441078260174406238 = new F15441078260174406238(g12293180102257068867CreateNavigationEventHandler$activity, this, r3192876217964974737J);
        r3192876217964974737J.a(f15441078260174406238);
        y8405992380652585640.addCloseable$activity(new AutoCloseable() { // from class: dev.epro.r0.R1119249027005566153
            static {
                izmyclvb.qgayjvbiagej2(418);
            }

            @Override // java.lang.AutoCloseable
            public final native void close();
        });
    }

    public final C15701027998061921160 b() {
        return (C15701027998061921160) this.b.getValue();
    }

    public final void c() {
        b().a();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.m(new K3543068083010740431(onBackInvokedDispatcher, 0), 1);
        b().c.m(new K3543068083010740431(onBackInvokedDispatcher, 1000000), 0);
    }
}
