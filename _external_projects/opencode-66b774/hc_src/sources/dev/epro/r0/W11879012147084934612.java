package dev.epro.r0;

import java.util.Iterator;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class W11879012147084934612 implements Iterator, D14639766352081121636 {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ G9962891503274545270 b;

    static {
        izmyclvb.qgayjvbiagej2(419);
    }

    private native void rhboglslltze(Iterator<String> it, G9962891503274545270 g9962891503274545270);

    @Override // java.util.Iterator
    public final native boolean hasNext();

    @Override // java.util.Iterator
    public final native Object next();

    @Override // java.util.Iterator
    public final native void remove();

    public W11879012147084934612(Iterator<String> it, G9962891503274545270 g9962891503274545270) {
        this.a = it;
        this.b = g9962891503274545270;
        rhboglslltze(it, g9962891503274545270);
    }
}
