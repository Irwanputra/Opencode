package ads_mobile_sdk;

import dev.epro.r0.C8804068735739007381;
import dev.epro.r0.Z11123542482871484238;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 implements C8804068735739007381 {
    public static final dq0 a = new dq0();
    public static final cq0 b = cq0.q();

    @Override // dev.epro.r0.C8804068735739007381
    public final Object getDefaultValue() {
        return b;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final Object readFrom(FileInputStream fileInputStream) {
        try {
            return cq0.a(fileInputStream);
        } catch (Exception e) {
            xv.c("Stored data has been corrupted: " + e, null);
            cq0 cq0Var = b;
            cq0Var.getClass();
            return cq0Var;
        }
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final void writeTo(Object obj, Z11123542482871484238 z11123542482871484238) {
        ((cq0) obj).a(z11123542482871484238);
    }
}
