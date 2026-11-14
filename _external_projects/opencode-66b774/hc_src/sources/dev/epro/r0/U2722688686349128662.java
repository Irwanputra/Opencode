package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U2722688686349128662 extends Z4899479314060394891 implements Q15035754882231748864 {
    public static final U2722688686349128662 b = new U2722688686349128662(P2382941533350862833.p);

    @Override // dev.epro.r0.Q15035754882231748864
    public final boolean b() {
        return true;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final U16840712152025914198 g(boolean z, boolean z2, C9424689592673022017 c9424689592673022017) {
        return F15788397839700158005.a;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final boolean isCancelled() {
        return false;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final U16840712152025914198 j(F4096073349764486348 f4096073349764486348) {
        return F15788397839700158005.a;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final CancellationException o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final boolean p() {
        return false;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final B13085836186769537379 u(U4020053660465689583 u4020053660465689583) {
        return F15788397839700158005.a;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final Object v(R4833348786910499294 r4833348786910499294) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // dev.epro.r0.Q15035754882231748864, dev.epro.r0.E5386183571211952538
    public final void c(CancellationException cancellationException) {
    }
}
