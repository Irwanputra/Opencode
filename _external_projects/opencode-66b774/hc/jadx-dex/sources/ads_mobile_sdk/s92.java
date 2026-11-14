package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class s92 implements dev.epro.r0.Y5459655644324746057 {
    public final dev.epro.r0.O16637889491137121389 a;
    public final ads_mobile_sdk.vi3 b;
    public final long c;

    public s92(dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.vi3 vi3Var, long j) {
        this.a = o16637889491137121389;
        this.b = vi3Var;
        this.c = j;
    }

    public final boolean a(ads_mobile_sdk.rm2 rm2Var) {
        ads_mobile_sdk.vi3 vi3Var = this.b;
        if (rm2Var == null || rm2Var.equals(ads_mobile_sdk.rm2.q())) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_METADATA_NOT_FOUND);
            return true;
        }
        short sP = (short) rm2Var.s().r().p();
        int iQ = rm2Var.s().r().q();
        byte[] bArrB = dev.epro.r0.Q6203700555324584864.b();
        bArrB.getClass();
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(6);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(sP);
        byteBufferAllocate.putInt(iQ);
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        if (!java.util.Arrays.equals(bArrArray, bArrB)) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_VM_VERSION_MISMATCH);
            return true;
        }
        long jP = rm2Var.s().p();
        this.a.getClass();
        boolean z = jP - java.lang.System.currentTimeMillis() <= this.c;
        if (z) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_PROGRAM_ALMOST_EXPIRED);
        }
        return z;
    }

    public final boolean b(ads_mobile_sdk.rm2 rm2Var) {
        ads_mobile_sdk.vi3 vi3Var = this.b;
        if (rm2Var == null || rm2Var.equals(ads_mobile_sdk.rm2.q())) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_VALIDATOR_INIT_METADATA_NOT_FOUND);
            return false;
        }
        short sP = (short) rm2Var.s().r().p();
        int iQ = rm2Var.s().r().q();
        byte[] bArrB = dev.epro.r0.Q6203700555324584864.b();
        bArrB.getClass();
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(6);
        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(sP);
        byteBufferAllocate.putInt(iQ);
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        if (java.util.Arrays.equals(bArrArray, bArrB)) {
            return true;
        }
        vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_VALIDATOR_INIT_VM_VERSION_MISMATCH);
        return false;
    }
}
