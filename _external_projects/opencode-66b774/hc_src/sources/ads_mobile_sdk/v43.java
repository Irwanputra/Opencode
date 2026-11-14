package ads_mobile_sdk;

import dev.epro.r0.C8804068735739007381;
import dev.epro.r0.Z11123542482871484238;
import java.io.FileInputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class v43 implements C8804068735739007381 {
    public static final v43 a = new v43();
    public static final k43 b = k43.o();

    @Override // dev.epro.r0.C8804068735739007381
    public final Object getDefaultValue() {
        return b;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final Object readFrom(FileInputStream fileInputStream) {
        try {
            return k43.a(fileInputStream);
        } catch (Exception e) {
            xv.c("Stored shared settings data has been corrupted: " + e, null);
            k43 k43Var = b;
            k43Var.getClass();
            return k43Var;
        }
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final void writeTo(Object obj, Z11123542482871484238 z11123542482871484238) {
        ((k43) obj).a(z11123542482871484238);
    }
}
