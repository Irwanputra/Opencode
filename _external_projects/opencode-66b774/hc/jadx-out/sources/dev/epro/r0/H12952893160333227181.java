package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H12952893160333227181 implements S15709944382977446712 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public H12952893160333227181(J15730374346044043770 j15730374346044043770) {
        this.a = new HashMap((HashMap) j15730374346044043770.c);
        this.b = new HashMap((HashMap) j15730374346044043770.d);
        this.c = new HashMap((HashMap) j15730374346044043770.e);
        this.d = new HashMap((HashMap) j15730374346044043770.b);
    }

    @Override // dev.epro.r0.S15709944382977446712
    public final I1581330382723795749 a(Z1953481206310471956 z1953481206310471956) throws GeneralSecurityException {
        Class<?> cls = z1953481206310471956.getClass();
        HashMap map = this.a;
        if (map.containsKey(cls)) {
            return ((X18244299380549586254) map.get(z1953481206310471956.getClass())).b.a(z1953481206310471956);
        }
        throw new GeneralSecurityException(G6547577305291411977.s("No Key serializer for ", String.valueOf(z1953481206310471956.getClass()), " available"));
    }

    @Override // dev.epro.r0.S15709944382977446712
    public final Z1953481206310471956 b(I1581330382723795749 i1581330382723795749) throws GeneralSecurityException {
        String str = (String) i1581330382723795749.a;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return ((X17873598080297061904) map.get(str)).b.b(i1581330382723795749);
        }
        throw new GeneralSecurityException(G6547577305291411977.s("No Key Parser for requested key type ", str, " available"));
    }
}
