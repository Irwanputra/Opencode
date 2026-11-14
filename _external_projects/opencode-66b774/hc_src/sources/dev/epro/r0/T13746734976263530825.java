package dev.epro.r0;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T13746734976263530825 extends ThreadLocal {
    public final /* synthetic */ A14657410800553081874 a;

    public T13746734976263530825(A14657410800553081874 a14657410800553081874) {
        this.a = a14657410800553081874;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        A14657410800553081874 a14657410800553081874 = this.a;
        try {
            W8357658991043002609 w8357658991043002609 = W8357658991043002609.c;
            Mac mac = (Mac) w8357658991043002609.a.a(a14657410800553081874.b);
            mac.init(a14657410800553081874.c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
