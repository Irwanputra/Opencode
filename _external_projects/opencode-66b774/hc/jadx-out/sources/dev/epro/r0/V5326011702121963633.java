package dev.epro.r0;

import java.io.Closeable;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class V5326011702121963633 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Closeable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    static {
        izmyclvb.qgayjvbiagej2(1316);
    }

    private native void jcxgidxqpvzb(Object obj, Closeable closeable, Object obj2, Object obj3, Object obj4, Object obj5, byte b);

    @Override // java.lang.Runnable
    public final native void run();

    public /* synthetic */ V5326011702121963633(Object obj, Closeable closeable, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = closeable;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        jcxgidxqpvzb(obj, closeable, obj2, obj3, obj4, obj5, b);
    }
}
