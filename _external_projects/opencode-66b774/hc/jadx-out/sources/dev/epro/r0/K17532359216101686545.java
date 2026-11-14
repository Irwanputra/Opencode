package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K17532359216101686545 extends J9391192653199620777 {
    @Override // dev.epro.r0.J9391192653199620777
    public final void a(long j, Object obj) {
        ((R5425141374325592367) J3288146055636008296.j(j, obj)).a = false;
    }

    @Override // dev.epro.r0.J9391192653199620777
    public final void b(long j, Object obj, Object obj2) {
        R5425141374325592367 r5425141374325592367B = (R5425141374325592367) J3288146055636008296.j(j, obj);
        R5425141374325592367 r5425141374325592367 = (R5425141374325592367) J3288146055636008296.j(j, obj2);
        int size = r5425141374325592367B.size();
        int size2 = r5425141374325592367.size();
        if (size > 0 && size2 > 0) {
            if (!r5425141374325592367B.a) {
                r5425141374325592367B = r5425141374325592367B.b(size2 + size);
            }
            r5425141374325592367B.addAll(r5425141374325592367);
        }
        if (size > 0) {
            r5425141374325592367 = r5425141374325592367B;
        }
        J3288146055636008296.p(j, obj, r5425141374325592367);
    }

    @Override // dev.epro.r0.J9391192653199620777
    public final List c(long j, Object obj) {
        R5425141374325592367 r5425141374325592367 = (R5425141374325592367) J3288146055636008296.j(j, obj);
        if (r5425141374325592367.a) {
            return r5425141374325592367;
        }
        int size = r5425141374325592367.size();
        R5425141374325592367 r5425141374325592367B = r5425141374325592367.b(size == 0 ? 10 : size * 2);
        J3288146055636008296.p(j, obj, r5425141374325592367B);
        return r5425141374325592367B;
    }
}
