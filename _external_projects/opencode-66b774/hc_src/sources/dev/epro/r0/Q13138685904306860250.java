package dev.epro.r0;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        int i;
        int i2;
        int i3;
        ByteBuffer byteBuffer = this.a;
        int position = byteBuffer.position();
        if (!byteBuffer.hasRemaining()) {
            return null;
        }
        byte b = byteBuffer.get();
        int i4 = b & 31;
        if (i4 == 31) {
            i4 = 0;
            while (byteBuffer.hasRemaining()) {
                byte b2 = byteBuffer.get();
                if (i4 > 16777215) {
                    throw new I6359084623320895730("Tag number too large");
                }
                i4 = (i4 << 7) | (b2 & Byte.MAX_VALUE);
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
        int i5 = b3 & 255;
        if ((b3 & 128) == 0) {
            i3 = b3 & Byte.MAX_VALUE;
            i2 = byteBuffer.position() - position;
            d(i3);
        } else if (i5 != 128) {
            int i6 = b3 & Byte.MAX_VALUE;
            if (i6 > 4) {
                throw new I6359084623320895730(G6547577305291411977.o(i6, "Length too large: ", " bytes"));
            }
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                if (!byteBuffer.hasRemaining()) {
                    throw new I6359084623320895730("Truncated length");
                }
                byte b4 = byteBuffer.get();
                if (i7 > 8388607) {
                    throw new I6359084623320895730("Length too large");
                }
                i7 = (i7 << 8) | (b4 & 255);
            }
            i2 = byteBuffer.position() - position;
            d(i7);
            i3 = i7;
        } else {
            int position2 = byteBuffer.position() - position;
            if (z) {
                int position3 = byteBuffer.position();
                while (byteBuffer.hasRemaining()) {
                    if (byteBuffer.remaining() <= 1 || byteBuffer.getShort(byteBuffer.position()) != 0) {
                        a();
                    } else {
                        i = byteBuffer.position() - position3;
                        byteBuffer.position(byteBuffer.position() + 2);
                    }
                }
                throw new I6359084623320895730("Truncated indefinite-length contents: " + (byteBuffer.position() - position3) + " bytes read");
            }
            int i9 = 0;
            boolean z2 = false;
            while (byteBuffer.hasRemaining()) {
                byte b5 = byteBuffer.get();
                int i10 = i9 + 1;
                if (i10 < 0) {
                    throw new I6359084623320895730("Indefinite-length contents too long");
                }
                if (b5 != 0) {
                    z2 = false;
                } else if (z2) {
                    i = i9 - 1;
                } else {
                    z2 = true;
                }
                i9 = i10;
            }
            throw new I6359084623320895730(G6547577305291411977.o(i9, "Truncated indefinite-length contents: ", " bytes read"));
            i2 = position2;
            i3 = i;
        }
        int position4 = byteBuffer.position();
        byteBuffer.position(position);
        int limit = byteBuffer.limit();
        byteBuffer.limit(position4);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(limit);
        slice.position(i2);
        slice.limit(i2 + i3);
        ByteBuffer slice2 = slice.slice();
        slice.clear();
        return new I15162792415829416729(slice, slice2, (b & 255) >> 6, i4);
    }

    @Override // dev.epro.r0.P14572820171047441271
    public void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        try {
            this.a.put(byteBuffer);
        } catch (BufferOverflowException e) {
            Z3383101362411723454.q(G6547577305291411977.o(remaining, "Insufficient space in output buffer for ", " bytes"), e);
        }
    }

    @Override // dev.epro.r0.P14572820171047441271
    public void c(int i, byte[] bArr, int i2) {
        try {
            this.a.put(bArr, 0, i2);
        } catch (BufferOverflowException e) {
            Z3383101362411723454.q(G6547577305291411977.o(i2, "Insufficient space in output buffer for ", " bytes"), e);
        }
    }

    public void d(int i) {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= i) {
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            StringBuilder q = E12098517352909843120.q(i, "Truncated contents. Need: ", " bytes, available: ");
            q.append(byteBuffer.remaining());
            throw new I6359084623320895730(q.toString());
        }
    }
}
