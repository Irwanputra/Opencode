package ads_mobile_sdk;

import dev.epro.r0.C8804068735739007381;
import dev.epro.r0.Z11123542482871484238;
import java.io.FileInputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class hf implements C8804068735739007381 {
    public static final hf a = new hf();
    public static final ze b = ze.o();

    @Override // dev.epro.r0.C8804068735739007381
    public final Object getDefaultValue() {
        return b;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final Object readFrom(FileInputStream fileInputStream) {
        try {
            return ze.a(fileInputStream);
        } catch (Exception unused) {
            ze zeVar = b;
            zeVar.getClass();
            return zeVar;
        }
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final void writeTo(Object obj, Z11123542482871484238 z11123542482871484238) {
        ((ze) obj).a(z11123542482871484238);
    }
}
