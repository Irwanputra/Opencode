package ads_mobile_sdk;

import dev.epro.r0.C8804068735739007381;
import dev.epro.r0.Z11123542482871484238;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 implements C8804068735739007381 {
    public static final mv1 a = new mv1();
    public static final zu1 b = zu1.q();

    @Override // dev.epro.r0.C8804068735739007381
    public final Object getDefaultValue() {
        return b;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final Object readFrom(FileInputStream fileInputStream) {
        try {
            return zu1.a(fileInputStream);
        } catch (Exception e) {
            xv.c("Stored data has been corrupted: " + e, null);
            zu1 zu1Var = b;
            zu1Var.getClass();
            return zu1Var;
        }
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final void writeTo(Object obj, Z11123542482871484238 z11123542482871484238) {
        ((zu1) obj).a(z11123542482871484238);
    }
}
