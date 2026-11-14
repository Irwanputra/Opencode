package dev.epro.r0;

import java.io.OutputStream;
import java.nio.channels.Channels;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class Q9808704968580942152 implements R5909351061398077004 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ V15243060514859040546 b;

    public /* synthetic */ Q9808704968580942152(V15243060514859040546 v15243060514859040546, byte b) {
        this.a = b;
        this.b = v15243060514859040546;
    }

    @Override // dev.epro.r0.R5909351061398077004
    /* renamed from: run */
    public final void mo18run() {
        byte b = this.a;
        V15243060514859040546 v15243060514859040546 = this.b;
        switch (b) {
            case 0:
                W7359389094007644644 w7359389094007644644 = (W7359389094007644644) v15243060514859040546;
                byte b2 = 1;
                if (w7359389094007644644.k == null) {
                    w7359389094007644644.m.l = 10;
                    w7359389094007644644.i.setDoOutput(true);
                    w7359389094007644644.i.connect();
                    w7359389094007644644.m.l = 12;
                    OutputStream outputStream = w7359389094007644644.i.getOutputStream();
                    w7359389094007644644.l = outputStream;
                    w7359389094007644644.k = Channels.newChannel(outputStream);
                }
                v15243060514859040546.a.set(0);
                v15243060514859040546.b(new Q9808704968580942152(v15243060514859040546, b2), "readFromProvider");
                break;
            default:
                v15243060514859040546.d.read(v15243060514859040546, v15243060514859040546.e);
                v15243060514859040546.c.execute(new W13948953340889349604(v15243060514859040546, (byte) 14));
                break;
        }
    }
}
