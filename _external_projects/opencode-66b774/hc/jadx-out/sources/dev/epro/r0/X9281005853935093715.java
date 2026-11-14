package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X9281005853935093715 extends D11883231851729262595 {
    public static final /* synthetic */ int c = 0;

    static {
        new X9281005853935093715();
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final D11883231851729262595 C(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        R10581505017215614416 r10581505017215614416 = (R10581505017215614416) g8001132634698687269.get(R10581505017215614416.c);
        if (r10581505017215614416 != null) {
            r10581505017215614416.b = true;
        } else {
            D11988991656201568495.j("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
