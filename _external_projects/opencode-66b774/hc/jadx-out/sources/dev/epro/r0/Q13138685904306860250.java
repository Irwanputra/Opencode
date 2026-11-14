package dev.epro.r0;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q13138685904306860250 implements P14572820171047441271 {
    public final ByteBuffer a;

    public Q13138685904306860250(ByteBuffer byteBuffer, byte b) {
        switch (b) {
            case 1:
                this.a = byteBuffer;
                return;
            default:
                if (byteBuffer != null) {
                    this.a = byteBuffer;
                    return;
                } else {
                    Z3383101362411723454.k("buf == null");
                    throw null;
                }
        }
    }

    public I15162792415829416729 a() {
        int iPosition;
        int iPosition2;
        int i;
        ByteBuffer byteBuffer = this.a;
        int iPosition3 = byteBuffer.position();
        if (!byteBuffer.hasRemaining()) {
            return null;
        }
        byte b = byteBuffer.get();
        int i2 = b & 31;
        if (i2 == 31) {
            i2 = 0;
            while (byteBuffer.hasRemaining()) {
                byte b2 = byteBuffer.get();
                if (i2 > 16777215) {
                    throw new I6359084623320895730("Tag number too large");
                }
                i2 = (i2 << 7) | (b2 & 127);
                if ((b2 & 128) == 0) {
                }
            }
            throw new I6359084623320895730("Truncated tag number");
        }
        boolean z = (b & 32) != 0;
        if (!byteBuffer.hasRemaining()) {
            throw new I6359084623320895730("Missing length");
        }
        byte b3 = byteBuffer.get();
        int i3 = b3 & 255;
        if ((b3 & 128) == 0) {
            i = b3 & 127;
            iPosition2 = byteBuffer.position() - iPosition3;
            d(i);
        } else if (i3 != 128) {
            int i4 = b3 & 127;
            if (i4 > 4) {
                throw new I6359084623320895730(G6547577305291411977.o(i4, "Length too large: ", " bytes"));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                if (!byteBuffer.hasRemaining()) {
                    throw new I6359084623320895730("Truncated length");
                }
                byte b4 = byteBuffer.get();
                if (i5 > 8388607) {
                    throw new I6359084623320895730("Length too large");
                }
                i5 = (i5 << 8) | (b4 & 255);
            }
            iPosition2 = byteBuffer.position() - iPosition3;
            d(i5);
            i = i5;
        } else {
            int iPosition4 = byteBuffer.position() - iPosition3;
            if (z) {
                int iPosition5 = byteBuffer.position();
                while (byteBuffer.hasRemaining()) {
                    if (byteBuffer.remaining() <= 1 || byteBuffer.getShort(byteBuffer.position()) != 0) {
                        a();
                    } else {
                        iPosition = byteBuffer.position() - iPosition5;
                        byteBuffer.position(byteBuffer.position() + 2);
                    }
                }
                throw new I6359084623320895730("Truncated indefinite-length contents: " + (byteBuffer.position() - iPosition5) + " bytes read");
            }
            int i7 = 0;
            boolean z2 = false;
            while (byteBuffer.hasRemaining()) {
                byte b5 = byteBuffer.get();
                int i8 = i7 + 1;
                if (i8 < 0) {
                    throw new I6359084623320895730("Indefinite-length contents too long");
                }
                if (b5 != 0) {
                    z2 = false;
                } else if (z2) {
                    iPosition = i7 - 1;
                } else {
                    z2 = true;
                }
                i7 = i8;
            }
            throw new I6359084623320895730(G6547577305291411977.o(i7, "Truncated indefinite-length contents: ", " bytes read"));
            iPosition2 = iPosition4;
            i = iPosition;
        }
        int iPosition6 = byteBuffer.position();
        byteBuffer.position(iPosition3);
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(iPosition6);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(iLimit);
        byteBufferSlice.position(iPosition2);
        byteBufferSlice.limit(iPosition2 + i);
        ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
        byteBufferSlice.clear();
        return new I15162792415829416729(byteBufferSlice, byteBufferSlice2, (b & 255) >> 6, i2);
    }

    @Override // dev.epro.r0.P14572820171047441271
    public void b(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        try {
            this.a.put(byteBuffer);
        } catch (BufferOverflowException e) {
            Z3383101362411723454.q(G6547577305291411977.o(iRemaining, "Insufficient space in output buffer for ", " bytes"), e);
        }
    }

    @Override // dev.epro.r0.P14572820171047441271
    public void c(int i, byte[] bArr, int i2) throws IOException {
        try {
            this.a.put(bArr, 0, i2);
        } catch (BufferOverflowException e) {
            Z3383101362411723454.q(G6547577305291411977.o(i2, "Insufficient space in output buffer for ", " bytes"), e);
        }
    }

    public void d(int i) throws I6359084623320895730 {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= i) {
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            StringBuilder sbQ = E12098517352909843120.q(i, "Truncated contents. Need: ", " bytes, available: ");
            sbQ.append(byteBuffer.remaining());
            throw new I6359084623320895730(sbQ.toString());
        }
    }
}
