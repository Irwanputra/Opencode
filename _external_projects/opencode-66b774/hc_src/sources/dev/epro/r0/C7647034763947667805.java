package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C7647034763947667805 implements A8947685337014270457 {
    public final A3690406679562215731 a;

    public C7647034763947667805(A3690406679562215731 a3690406679562215731) {
        this.a = a3690406679562215731;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dev.epro.r0.E1113567452991644141] */
    @Override // dev.epro.r0.A8947685337014270457
    public final void a(byte[] bArr, byte[] bArr2) {
        List list;
        HashMap hashMap = this.a.a;
        List list2 = (List) hashMap.get(A3690406679562215731.b);
        if (bArr.length >= 5) {
            list = (List) hashMap.get(new J4250663911053539605(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            list2 = new ArrayList();
        } else if (list2 == null) {
            list2 = list;
        } else if (list != null) {
            list2 = new E1113567452991644141(list, list2);
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            try {
                ((H4081320665893287884) it.next()).a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        W4415201450379021245.c("invalid signature");
    }
}
