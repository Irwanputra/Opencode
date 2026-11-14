package dev.epro.r0;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K16124730071979655029 {
    public final Field a;
    public final Object b;
    public final J16229365650376721338 c;
    public final Q9140341247415722307 d;
    public final Q9140341247415722307 e;
    public final int f;
    public final int g;
    public final R14870022343596685520 h;
    public final boolean i;

    public K16124730071979655029(Object obj, Field field, J16229365650376721338 j16229365650376721338) throws W16495563625558853219 {
        this.b = obj;
        this.a = field;
        this.c = j16229365650376721338;
        Q9140341247415722307 q9140341247415722307Type = j16229365650376721338.type();
        this.d = q9140341247415722307Type;
        this.e = j16229365650376721338.elementType();
        Q4387574467995849280 q4387574467995849280Cls = j16229365650376721338.cls();
        this.f = C775827382551829194.O(q4387574467995849280Cls == Q4387574467995849280.c ? j16229365650376721338.tagNumber() != -1 ? Q4387574467995849280.b : Q4387574467995849280.a : q4387574467995849280Cls);
        this.g = j16229365650376721338.tagNumber() != -1 ? j16229365650376721338.tagNumber() : (q9140341247415722307Type == Q9140341247415722307.b || q9140341247415722307Type == Q9140341247415722307.a) ? -1 : C775827382551829194.P(q9140341247415722307Type);
        R14870022343596685520 r14870022343596685520Tagging = j16229365650376721338.tagging();
        this.h = r14870022343596685520Tagging;
        if ((r14870022343596685520Tagging != R14870022343596685520.b && r14870022343596685520Tagging != R14870022343596685520.c) || j16229365650376721338.tagNumber() != -1) {
            this.i = j16229365650376721338.optional();
        } else {
            throw new W16495563625558853219("Tag number must be specified when tagging mode is " + r14870022343596685520Tagging);
        }
    }

    public final byte[] a() {
        Object objD = P5201717407242849942.d(this.b, this.a);
        if (objD == null) {
            if (this.i) {
                return null;
            }
            throw new W16495563625558853219("Required field not set");
        }
        byte[] bArrR0 = Q13169198992966610970.r0(objD, this.d, this.e);
        R14870022343596685520 r14870022343596685520 = this.h;
        int iOrdinal = r14870022343596685520.ordinal();
        if (iOrdinal == 0) {
            return bArrR0;
        }
        int i = this.f;
        int i2 = this.g;
        if (iOrdinal == 1) {
            return P5201717407242849942.a(i, true, i2, bArrR0);
        }
        if (iOrdinal != 2) {
            throw new RuntimeException("Unknown tagging mode: " + r14870022343596685520);
        }
        byte b = bArrR0[0];
        if ((b & 31) == 31) {
            throw new W16495563625558853219("High-tag-number form not supported");
        }
        if (i2 >= 31) {
            throw new W16495563625558853219(G6547577305291411977.n(i2, "Unsupported high tag number: "));
        }
        byte b2 = (byte) (i2 | (b & (-32)));
        bArrR0[0] = b2;
        bArrR0[0] = (byte) ((b2 & 63) | (i << 6));
        return bArrR0;
    }
}
