package dev.epro.r0;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class F11254987978987383037 {
    public final int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public F11254987978987383037(N12245111110189169079 n12245111110189169079) {
        boolean z;
        long j;
        int remaining;
        this.e = new HashMap();
        ByteBuffer byteBuffer = (ByteBuffer) n12245111110189169079.c;
        ByteBuffer slice = byteBuffer.slice();
        slice.order(byteBuffer.order());
        int remaining2 = slice.remaining();
        slice.position(8);
        if (slice.remaining() < 20) {
            throw new I3603276906376719046("XML chunk's header too short. Required at least 20 bytes. Available: " + slice.remaining() + " bytes");
        }
        long j2 = slice.getInt() & 4294967295L;
        if (j2 > 2147483647L) {
            throw new I3603276906376719046(E12098517352909843120.k(j2, "Too many strings: "));
        }
        int i = (int) j2;
        this.a = i;
        long j3 = slice.getInt() & 4294967295L;
        if (j3 > 2147483647L) {
            throw new I3603276906376719046(E12098517352909843120.k(j3, "Too many styles: "));
        }
        long j4 = slice.getInt();
        long j5 = slice.getInt() & 4294967295L;
        long j6 = slice.getInt() & 4294967295L;
        ByteBuffer h = n12245111110189169079.h();
        if (i > 0) {
            z = false;
            long j7 = remaining2;
            j = 0;
            int i2 = (int) (j5 - j7);
            if (j3 <= 0) {
                remaining = h.remaining();
            } else {
                if (j6 < j5) {
                    throw new I3603276906376719046(L11610354117192841236.p(j5, ")", E12098517352909843120.r("Styles offset (", ") < strings offset (", j6)));
                }
                remaining = (int) (j6 - j7);
            }
            this.d = I18375393507362144511.f(i2, remaining, h);
        } else {
            z = false;
            j = 0;
            this.d = ByteBuffer.allocate(0);
        }
        this.b = (256 & j4) != j ? true : z;
        this.c = h;
    }

    public boolean a() {
        ArrayList arrayList = (ArrayList) this.c;
        if (!((ArrayList) this.e).isEmpty()) {
            return true;
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((P15728539964912394135) obj).b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b() {
        ArrayList arrayList = (ArrayList) this.c;
        if (!((ArrayList) this.d).isEmpty()) {
            return true;
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((P15728539964912394135) obj).c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String c(long j) {
        byte[] bArr;
        String str;
        byte[] bArr2;
        HashMap hashMap = (HashMap) this.e;
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        if (j < 0) {
            throw new I3603276906376719046(E12098517352909843120.k(j, "Unsuported string index: "));
        }
        int i = this.a;
        if (j >= i) {
            StringBuilder r = E12098517352909843120.r("Unsuported string index: ", ", max: ", j);
            r.append(i - 1);
            throw new I3603276906376719046(r.toString());
        }
        int i2 = (int) j;
        String str2 = (String) hashMap.get(Integer.valueOf(i2));
        if (str2 != null) {
            return str2;
        }
        long j2 = ((ByteBuffer) this.c).getInt(i2 * 4) & 4294967295L;
        if (j2 >= byteBuffer.capacity()) {
            throw new I3603276906376719046("Offset of string idx " + i2 + " out of bounds: " + j2 + ", max: " + (byteBuffer.capacity() - 1));
        }
        byteBuffer.position((int) j2);
        int i3 = 0;
        if (this.b) {
            if ((byteBuffer.get() & 128) != 0) {
                byteBuffer.get();
            }
            byte b = byteBuffer.get();
            int i4 = b & 255;
            if ((b & 128) != 0) {
                i4 = (byteBuffer.get() & 255) | ((b & Byte.MAX_VALUE) << 8);
            }
            if (byteBuffer.hasArray()) {
                bArr2 = byteBuffer.array();
                i3 = byteBuffer.arrayOffset() + byteBuffer.position();
                byteBuffer.position(byteBuffer.position() + i4);
            } else {
                bArr2 = new byte[i4];
                byteBuffer.get(bArr2);
            }
            if (bArr2[i3 + i4] != 0) {
                throw new I3603276906376719046("UTF-8 encoded form of string not NULL terminated");
            }
            try {
                str = new String(bArr2, i3, i4, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Z3383101362411723454.m("UTF-8 character encoding not supported", e);
                return null;
            }
        } else {
            short s = byteBuffer.getShort();
            int i5 = s & 65535;
            if ((32768 & s) != 0) {
                i5 = ((s & Short.MAX_VALUE) << 16) | (65535 & byteBuffer.getShort());
            }
            if (i5 > 1073741823) {
                throw new I3603276906376719046(G6547577305291411977.o(i5, "String too long: ", " uint16s"));
            }
            int i6 = i5 * 2;
            if (byteBuffer.hasArray()) {
                bArr = byteBuffer.array();
                i3 = byteBuffer.arrayOffset() + byteBuffer.position();
                byteBuffer.position(byteBuffer.position() + i6);
            } else {
                bArr = new byte[i6];
                byteBuffer.get(bArr);
            }
            int i7 = i3 + i6;
            if (bArr[i7] != 0 || bArr[i7 + 1] != 0) {
                throw new I3603276906376719046("UTF-16 encoded form of string not NULL terminated");
            }
            try {
                str = new String(bArr, i3, i6, "UTF-16LE");
            } catch (UnsupportedEncodingException e2) {
                Z3383101362411723454.m("UTF-16LE character encoding not supported", e2);
                return null;
            }
        }
        hashMap.put(Integer.valueOf(i2), str);
        return str;
    }

    public F11254987978987383037(int i) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = i;
    }
}
