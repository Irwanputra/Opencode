package dev.epro.r0;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W7359389094007644644 extends V15243060514859040546 {
    public final HttpURLConnection i;
    public final AtomicBoolean j;
    public WritableByteChannel k;
    public OutputStream l;
    public final /* synthetic */ Z11821137052809198413 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7359389094007644644(Z11821137052809198413 z11821137052809198413, Executor executor, J3436373395468761580 j3436373395468761580, HttpURLConnection httpURLConnection, P15983149023236604271 p15983149023236604271) {
        super(executor, j3436373395468761580, p15983149023236604271);
        this.m = z11821137052809198413;
        this.j = new AtomicBoolean(false);
        this.i = httpURLConnection;
    }

    @Override // dev.epro.r0.V15243060514859040546
    public final void c(Exception exc) {
        this.m.b(new P13925373060833416406("Exception received from UploadDataProvider", exc));
    }
}
