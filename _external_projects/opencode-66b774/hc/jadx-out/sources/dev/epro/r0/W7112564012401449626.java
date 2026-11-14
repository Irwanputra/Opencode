package dev.epro.r0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class W7112564012401449626 {
    static {
        a(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    }

    public static void a(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            S10973172697741180971.j("invalid input length");
        } else {
            IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            intBufferAsIntBuffer.get(new int[intBufferAsIntBuffer.remaining()]);
        }
    }
}
