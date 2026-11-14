package dev.epro.r0;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C7718609449434082307 implements ScrollCaptureCallback {
    public final R6653624393204003746 a;
    public final I11366018238968599357 b;
    public final P16680885353687213831 c;
    public final S7974369370986781936 d;
    public final A2789795882633926065 e;
    public final R13382989801010358705 f;

    public C7718609449434082307(R6653624393204003746 r6653624393204003746, I11366018238968599357 i11366018238968599357, A2789795882633926065 a2789795882633926065, P16680885353687213831 p16680885353687213831, S7974369370986781936 s7974369370986781936) {
        this.a = r6653624393204003746;
        this.b = i11366018238968599357;
        this.c = p16680885353687213831;
        this.d = s7974369370986781936;
        this.e = new A2789795882633926065(a2789795882633926065.a.plus(L15474538540194079743.b));
        this.f = new R13382989801010358705(i11366018238968599357.b(), new D12899267686886439579(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r9, dev.epro.r0.I11366018238968599357 r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C7718609449434082307.a(android.view.ScrollCaptureSession, dev.epro.r0.I11366018238968599357, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        R7033599853981556291.E(this.e, U2722688686349128662.b, null, new Y14354959068095823168(this, runnable, null, (byte) 13), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        X7175349259954592591 x7175349259954592591E = R7033599853981556291.E(this.e, null, null, new O12152244488187446230((Object) this, (Object) scrollCaptureSession, (Object) rect, (Object) consumer, (R4833348786910499294) null, (byte) 6), 3);
        x7175349259954592591E.j(new A6662317080022852970(cancellationSignal, (byte) 18));
        cancellationSignal.setOnCancelListener(new B9951899438396776027(x7175349259954592591E, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(X7410747940286448830.u(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
