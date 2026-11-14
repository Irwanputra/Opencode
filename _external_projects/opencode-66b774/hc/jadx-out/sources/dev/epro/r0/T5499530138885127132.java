package dev.epro.r0;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T5499530138885127132 implements N8760694116812456657 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ T5499530138885127132(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.N8760694116812456657
    public final void b(Throwable th) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((F4096073349764486348) obj).invoke(th);
                break;
            default:
                ((U16840712152025914198) obj).a();
                break;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((F4096073349764486348) obj).getClass().getSimpleName() + '@' + D15445857918358799638.I(this) + ']';
            default:
                return "DisposeOnCancel[" + ((U16840712152025914198) obj) + ']';
        }
    }
}
