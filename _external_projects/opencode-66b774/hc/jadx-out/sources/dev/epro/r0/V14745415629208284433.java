package dev.epro.r0;

import java.net.DatagramSocket;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class V14745415629208284433 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ I15982450409077447857 b;
    public final /* synthetic */ DatagramSocket c;
    public final /* synthetic */ AtomicLong d;
    public final /* synthetic */ AtomicReference e;
    public final /* synthetic */ DatagramSocket f;

    static {
        izmyclvb.qgayjvbiagej2(1474);
    }

    private native void rynbyagjcadb(I15982450409077447857 i15982450409077447857, DatagramSocket datagramSocket, AtomicLong atomicLong, AtomicReference atomicReference, DatagramSocket datagramSocket2, byte b);

    @Override // java.lang.Runnable
    public final native void run();

    public /* synthetic */ V14745415629208284433(I15982450409077447857 i15982450409077447857, DatagramSocket datagramSocket, AtomicLong atomicLong, AtomicReference atomicReference, DatagramSocket datagramSocket2, byte b) {
        this.a = b;
        this.b = i15982450409077447857;
        this.c = datagramSocket;
        this.d = atomicLong;
        this.e = atomicReference;
        this.f = datagramSocket2;
        rynbyagjcadb(i15982450409077447857, datagramSocket, atomicLong, atomicReference, datagramSocket2, b);
    }
}
