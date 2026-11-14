package ads_mobile_sdk;

import dev.epro.r0.C9500329397830477148;
import dev.epro.r0.D13094341114488948592;
import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.Y16740175850512816666;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class ft3 {
    public static final ft3 c;
    public static final E2581631045160024594 d;
    public static final C9500329397830477148 e;
    public static final D13094341114488948592 f;
    public static final /* synthetic */ ft3[] g;
    public final gt3 a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    ft3 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    ft3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ft3 EF2;

    static {
        ft3 ft3Var = new ft3("DOUBLE", 0, gt3.e, 1);
        ft3 ft3Var2 = new ft3("FLOAT", 1, gt3.d, 5);
        gt3 gt3Var = gt3.c;
        ft3 ft3Var3 = new ft3("INT64", 2, gt3Var, 0);
        ft3 ft3Var4 = new ft3("UINT64", 3, gt3Var, 0);
        gt3 gt3Var2 = gt3.b;
        ft3 ft3Var5 = new ft3("INT32", 4, gt3Var2, 0);
        ft3 ft3Var6 = new ft3("FIXED64", 5, gt3Var, 1);
        ft3 ft3Var7 = new ft3("FIXED32", 6, gt3Var2, 5);
        ft3 ft3Var8 = new ft3("BOOL", 7, gt3.f, 0);
        c = ft3Var8;
        E2581631045160024594 e2581631045160024594 = new E2581631045160024594("STRING", 8, gt3.g, 2);
        d = e2581631045160024594;
        gt3 gt3Var3 = gt3.j;
        C9500329397830477148 c9500329397830477148 = new C9500329397830477148("GROUP", 9, gt3Var3, 3);
        e = c9500329397830477148;
        D13094341114488948592 d13094341114488948592 = new D13094341114488948592("MESSAGE", 10, gt3Var3, 2);
        f = d13094341114488948592;
        g = new ft3[]{ft3Var, ft3Var2, ft3Var3, ft3Var4, ft3Var5, ft3Var6, ft3Var7, ft3Var8, e2581631045160024594, c9500329397830477148, d13094341114488948592, new Y16740175850512816666("BYTES", 11, gt3.h, 2), new ft3("UINT32", 12, gt3Var2, 0), new ft3("ENUM", 13, gt3.i, 0), new ft3("SFIXED32", 14, gt3Var2, 5), new ft3("SFIXED64", 15, gt3Var, 1), new ft3("SINT32", 16, gt3Var2, 0), new ft3("SINT64", 17, gt3Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ft3(String str, int i, gt3 gt3Var, int i2) {
        this.a = gt3Var;
        this.b = i2;
    }

    public static ft3[] values() {
        return (ft3[]) g.clone();
    }
}
