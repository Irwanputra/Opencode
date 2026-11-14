package ads_mobile_sdk;

import dev.epro.r0.Q6203700555324584864;
import dev.epro.r0.Y5459655644324746057;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class zb3 implements Y5459655644324746057 {
    public final vi3 a;

    public zb3(vi3 vi3Var) {
        this.a = vi3Var;
    }

    @Override // dev.epro.r0.Y5459655644324746057
    public final boolean a(rm2 rm2Var) {
        return false;
    }

    @Override // dev.epro.r0.Y5459655644324746057
    public final boolean b(rm2 rm2Var) {
        vi3 vi3Var = this.a;
        if (rm2Var == null || rm2Var.equals(rm2.q())) {
            vi3Var.b(yk0.EVENT_ID_ORCAS_VALIDATOR_INIT_METADATA_NOT_FOUND);
            return false;
        }
        short p = (short) rm2Var.s().r().p();
        int q = rm2Var.s().r().q();
        byte[] b = Q6203700555324584864.b();
        b.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort(p);
        allocate.putInt(q);
        byte[] array = allocate.array();
        array.getClass();
        if (Arrays.equals(array, b)) {
            return true;
        }
        vi3Var.b(yk0.EVENT_ID_ORCAS_VALIDATOR_INIT_VM_VERSION_MISMATCH);
        return false;
    }
}
