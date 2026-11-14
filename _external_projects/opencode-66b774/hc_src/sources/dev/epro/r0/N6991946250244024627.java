package dev.epro.r0;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N6991946250244024627 {
    public final Field a;
    public final J16229365650376721338 b;
    public final Q9140341247415722307 c;
    public final int d;
    public final int e;
    public final R14870022343596685520 f;
    public final boolean g;

    public N6991946250244024627(Field field, J16229365650376721338 j16229365650376721338) {
        this.a = field;
        this.b = j16229365650376721338;
        Q9140341247415722307 type = j16229365650376721338.type();
        this.c = type;
        Q4387574467995849280 cls = j16229365650376721338.cls();
        this.d = C775827382551829194.O(cls == Q4387574467995849280.c ? j16229365650376721338.tagNumber() != -1 ? Q4387574467995849280.b : Q4387574467995849280.a : cls);
        this.e = j16229365650376721338.tagNumber() != -1 ? j16229365650376721338.tagNumber() : (type == Q9140341247415722307.b || type == Q9140341247415722307.a) ? -1 : C775827382551829194.P(type);
        R14870022343596685520 tagging = j16229365650376721338.tagging();
        this.f = tagging;
        if ((tagging != R14870022343596685520.b && tagging != R14870022343596685520.c) || j16229365650376721338.tagNumber() != -1) {
            this.g = j16229365650376721338.optional();
        } else {
            throw new K6445406877359976829("Tag number must be specified when tagging mode is " + tagging);
        }
    }

    public final void a(I15162792415829416729 i15162792415829416729, Object obj) {
        int i = i15162792415829416729.b;
        int i2 = this.d;
        int i3 = this.e;
        if (i3 != -1) {
            int i4 = i15162792415829416729.c;
            if (i != i2 || i4 != i3) {
                throw new U3857775939438126659("Tag mismatch. Expected: " + C775827382551829194.X(i2, i3) + ", but found " + C775827382551829194.X(i, i4));
            }
        } else if (i != i2) {
            throw new U3857775939438126659("Tag mismatch. Expected class: " + C775827382551829194.Y(i2) + ", but found " + C775827382551829194.Y(i));
        }
        if (this.f == R14870022343596685520.b) {
            try {
                i15162792415829416729 = new Q13138685904306860250(((ByteBuffer) i15162792415829416729.e).slice(), (byte) 0).a();
            } catch (I6359084623320895730 e) {
                throw new K6445406877359976829("Failed to read contents of EXPLICIT data value", e);
            }
        }
        Field field = this.a;
        Q9140341247415722307 q9140341247415722307 = this.c;
        try {
            int ordinal = q9140341247415722307.ordinal();
            if (ordinal != 6 && ordinal != 7) {
                field.set(obj, C775827382551829194.F(q9140341247415722307, i15162792415829416729, field.getType()));
            } else if (V12599130403671467129.class.equals(field.getType())) {
                field.set(obj, C775827382551829194.F(q9140341247415722307, i15162792415829416729, field.getType()));
            } else {
                field.set(obj, S2941385686793915703.T(i15162792415829416729, S2941385686793915703.G(field)));
            }
        } catch (ReflectiveOperationException e2) {
            throw new K6445406877359976829("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e2);
        }
    }
}
