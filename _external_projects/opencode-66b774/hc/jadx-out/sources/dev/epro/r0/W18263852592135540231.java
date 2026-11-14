package dev.epro.r0;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W18263852592135540231 implements Choreographer.FrameCallback {
    public final /* synthetic */ H7219028874700587498 a;
    public final /* synthetic */ F4096073349764486348 b;

    public W18263852592135540231(H7219028874700587498 h7219028874700587498, X13682529397961211704 x13682529397961211704, F4096073349764486348 f4096073349764486348) {
        this.a = h7219028874700587498;
        this.b = f4096073349764486348;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object c10696704014433963524;
        try {
            c10696704014433963524 = this.b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            c10696704014433963524 = new C10696704014433963524(th);
        }
        this.a.resumeWith(c10696704014433963524);
    }
}
