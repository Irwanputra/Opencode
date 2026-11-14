package dev.epro.r0;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X13396380553427713373 {
    public static final J10770752472956524045 i = new J10770752472956524045(9);
    public final short a;
    public final short b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    public X13396380553427713373(short s, short s2, long j, long j2, long j3, long j4, String str, int i2) {
        this.a = s;
        this.b = s2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = str;
        this.h = i2;
    }

    public static String a(int i2, int i3, ByteBuffer byteBuffer) {
        byte[] bArr;
        int i4;
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i4 = byteBuffer.arrayOffset() + i2;
        } else {
            bArr = new byte[i3];
            int position = byteBuffer.position();
            try {
                byteBuffer.position(i2);
                byteBuffer.get(bArr);
                byteBuffer.position(position);
                i4 = 0;
            } catch (Throwable th) {
                byteBuffer.position(position);
                throw th;
            }
        }
        return new String(bArr, i4, i3, StandardCharsets.UTF_8);
    }

    public static X13396380553427713373 b(ByteBuffer byteBuffer) {
        T3224757362656795885.d(byteBuffer);
        if (byteBuffer.remaining() < 46) {
            throw new G3596274300958059526("Input too short. Need at least: 46 bytes, available: " + byteBuffer.remaining() + " bytes", new BufferUnderflowException());
        }
        int position = byteBuffer.position();
        int i2 = byteBuffer.getInt();
        if (i2 != 33639248) {
            throw new G3596274300958059526("Not a Central Directory record. Signature: 0x" + Long.toHexString(i2 & 4294967295L));
        }
        byteBuffer.position(position + 8);
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        long j = byteBuffer.getInt() & 4294967295L;
        long j2 = byteBuffer.getInt() & 4294967295L;
        long j3 = byteBuffer.getInt() & 4294967295L;
        int i3 = byteBuffer.getShort() & 65535;
        int i4 = byteBuffer.getShort() & 65535;
        int i5 = byteBuffer.getShort() & 65535;
        byteBuffer.position(position + 42);
        long j4 = byteBuffer.getInt() & 4294967295L;
        byteBuffer.position(position);
        int i6 = i3 + 46 + i4 + i5;
        if (i6 > byteBuffer.remaining()) {
            StringBuilder q = E12098517352909843120.q(i6, "Input too short. Need: ", " bytes, available: ");
            q.append(byteBuffer.remaining());
            q.append(" bytes");
            throw new G3596274300958059526(q.toString(), new BufferUnderflowException());
        }
        String a = a(position + 46, i3, byteBuffer);
        byteBuffer.position(position);
        int limit = byteBuffer.limit();
        int i7 = position + i6;
        try {
            byteBuffer.limit(i7);
            byteBuffer.slice();
            byteBuffer.limit(limit);
            byteBuffer.position(i7);
            return new X13396380553427713373(s, s2, j, j2, j3, j4, a, i3);
        } catch (Throwable th) {
            byteBuffer.limit(limit);
            throw th;
        }
    }
}
