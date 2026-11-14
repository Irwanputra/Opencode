package dev.epro.r0;

import java.util.Base64;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W17049324151557986874 extends F7956685821435437215 {
    public final /* synthetic */ byte a;

    public /* synthetic */ W17049324151557986874() {
        this.a = (byte) 0;
    }

    @Override // dev.epro.r0.Q9935855302591369244
    public final Object a(J9761478802862050991 j9761478802862050991) {
        Base64.Decoder decoder;
        byte[] decode;
        int i;
        int i2;
        String substring;
        int i3 = 0;
        switch (this.a) {
            case 0:
                throw new P13193549499509261669(null, null, "could not determine a constructor for the tag " + j9761478802862050991.a, j9761478802862050991.b);
            case 1:
                String replaceAll = ((R17669967605394073670) j9761478802862050991).h.replaceAll("\\s", "");
                decoder = Base64.getDecoder();
                decode = decoder.decode(replaceAll);
                return decode;
            case 2:
                return U1644378183406225904.r.get(((R17669967605394073670) j9761478802862050991).h.toLowerCase());
            case 3:
                String replaceAll2 = ((R17669967605394073670) j9761478802862050991).h.replaceAll("_", "");
                if (replaceAll2.isEmpty()) {
                    F16470721565862751885 f16470721565862751885 = j9761478802862050991.b;
                    throw new P13193549499509261669("while constructing a float", f16470721565862751885, "found empty value", f16470721565862751885);
                }
                char charAt = replaceAll2.charAt(0);
                if (charAt == '-') {
                    replaceAll2 = replaceAll2.substring(1);
                    i = -1;
                } else {
                    if (charAt == '+') {
                        replaceAll2 = replaceAll2.substring(1);
                    }
                    i = 1;
                }
                String lowerCase = replaceAll2.toLowerCase();
                if (".inf".equals(lowerCase)) {
                    return Double.valueOf(i == -1 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
                }
                if (".nan".equals(lowerCase)) {
                    return Double.valueOf(Double.NaN);
                }
                if (replaceAll2.indexOf(58) == -1) {
                    return Double.valueOf(Double.valueOf(replaceAll2).doubleValue() * i);
                }
                String[] split = replaceAll2.split(":");
                int length = split.length;
                double d = 0.0d;
                int i4 = 1;
                while (i3 < length) {
                    d += Double.parseDouble(split[(length - i3) - 1]) * i4;
                    i4 *= 60;
                    i3++;
                }
                return Double.valueOf(i * d);
            case 4:
                String replace = ((R17669967605394073670) j9761478802862050991).h.replace("_", "");
                if (replace.isEmpty()) {
                    F16470721565862751885 f164707215658627518852 = j9761478802862050991.b;
                    throw new P13193549499509261669("while constructing an int", f164707215658627518852, "found empty value", f164707215658627518852);
                }
                char charAt2 = replace.charAt(0);
                if (charAt2 == '-') {
                    replace = replace.substring(1);
                    i2 = -1;
                } else {
                    if (charAt2 == '+') {
                        replace = replace.substring(1);
                    }
                    i2 = 1;
                }
                if ("0".equals(replace)) {
                    return 0;
                }
                int i5 = 2;
                if (replace.startsWith("0b")) {
                    substring = replace.substring(2);
                } else if (replace.startsWith("0x")) {
                    substring = replace.substring(2);
                    i5 = 16;
                } else {
                    if (!replace.startsWith("0")) {
                        if (replace.indexOf(58) == -1) {
                            return U1644378183406225904.f(i2, 10, replace);
                        }
                        String[] split2 = replace.split(":");
                        int length2 = split2.length;
                        int i6 = 1;
                        int i7 = 0;
                        while (i3 < length2) {
                            i7 = (int) ((Long.parseLong(split2[(length2 - i3) - 1]) * i6) + i7);
                            i6 *= 60;
                            i3++;
                        }
                        return U1644378183406225904.f(i2, 10, String.valueOf(i7));
                    }
                    substring = replace.substring(1);
                    i5 = 8;
                }
                return U1644378183406225904.f(i2, i5, substring);
            case 5:
                return null;
            default:
                return ((R17669967605394073670) j9761478802862050991).h;
        }
    }

    public /* synthetic */ W17049324151557986874(U1644378183406225904 u1644378183406225904, byte b) {
        this.a = b;
    }
}
