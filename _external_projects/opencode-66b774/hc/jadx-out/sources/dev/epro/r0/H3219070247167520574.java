package dev.epro.r0;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H3219070247167520574 {
    public static final J4250663911053539605 a = J4250663911053539605.a(new byte[0]);

    public static final J4250663911053539605 a(int i) {
        return J4250663911053539605.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final J4250663911053539605 b(int i) {
        return J4250663911053539605.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
