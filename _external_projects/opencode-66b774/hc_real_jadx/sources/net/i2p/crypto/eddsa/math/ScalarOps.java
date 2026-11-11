package net.i2p.crypto.eddsa.math;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface ScalarOps {
    byte[] multiplyAndAdd(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] reduce(byte[] bArr);
}
