package ads_mobile_sdk;

import dev.epro.r0.E3422549137300678133;
import dev.epro.r0.N7756202525712935399;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.U15842361112894803844;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
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
public final class lu {
    public static final P5733283974459951585 b;
    public static final lu c;
    public static final lu d;
    public static final lu e;
    public static final lu f;
    public static final lu g;
    public static final lu h;
    public static final lu i;
    public static final /* synthetic */ lu[] j;
    public final U15842361112894803844 a;

    static {
        U15842361112894803844 u15842361112894803844P = N7756202525712935399.p(10, 9);
        u15842361112894803844P.getClass();
        lu luVar = new lu("TOP_LEFT", 0, u15842361112894803844P);
        c = luVar;
        U15842361112894803844 u15842361112894803844P2 = N7756202525712935399.p(10, 14);
        u15842361112894803844P2.getClass();
        lu luVar2 = new lu("TOP_CENTER", 1, u15842361112894803844P2);
        d = luVar2;
        U15842361112894803844 u15842361112894803844P3 = N7756202525712935399.p(10, 11);
        u15842361112894803844P3.getClass();
        lu luVar3 = new lu("TOP_RIGHT", 2, u15842361112894803844P3);
        e = luVar3;
        Object[] objArr = {13};
        E3422549137300678133.M(1, objArr);
        U15842361112894803844 u15842361112894803844M = N7756202525712935399.m(1, objArr);
        u15842361112894803844M.getClass();
        lu luVar4 = new lu("CENTER", 3, u15842361112894803844M);
        f = luVar4;
        U15842361112894803844 u15842361112894803844P4 = N7756202525712935399.p(12, 9);
        u15842361112894803844P4.getClass();
        lu luVar5 = new lu("BOTTOM_LEFT", 4, u15842361112894803844P4);
        g = luVar5;
        U15842361112894803844 u15842361112894803844P5 = N7756202525712935399.p(12, 14);
        u15842361112894803844P5.getClass();
        lu luVar6 = new lu("BOTTOM_CENTER", 5, u15842361112894803844P5);
        h = luVar6;
        U15842361112894803844 u15842361112894803844P6 = N7756202525712935399.p(12, 11);
        u15842361112894803844P6.getClass();
        lu luVar7 = new lu("BOTTOM_RIGHT", 6, u15842361112894803844P6);
        i = luVar7;
        j = new lu[]{luVar, luVar2, luVar3, luVar4, luVar5, luVar6, luVar7};
        b = new P5733283974459951585((byte) 9);
    }

    public lu(String str, int i2, U15842361112894803844 u15842361112894803844) {
        this.a = u15842361112894803844;
    }

    public static lu[] values() {
        return (lu[]) j.clone();
    }
}
