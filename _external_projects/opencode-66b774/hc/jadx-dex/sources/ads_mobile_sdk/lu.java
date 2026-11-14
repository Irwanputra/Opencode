package ads_mobile_sdk;

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
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class lu {
    public static final dev.epro.r0.P5733283974459951585 b;
    public static final ads_mobile_sdk.lu c;
    public static final ads_mobile_sdk.lu d;
    public static final ads_mobile_sdk.lu e;
    public static final ads_mobile_sdk.lu f;
    public static final ads_mobile_sdk.lu g;
    public static final ads_mobile_sdk.lu h;
    public static final ads_mobile_sdk.lu i;
    public static final /* synthetic */ ads_mobile_sdk.lu[] j;
    public final dev.epro.r0.U15842361112894803844 a;

    static {
        dev.epro.r0.U15842361112894803844 u15842361112894803844P = dev.epro.r0.N7756202525712935399.p(10, 9);
        u15842361112894803844P.getClass();
        ads_mobile_sdk.lu luVar = new ads_mobile_sdk.lu("TOP_LEFT", 0, u15842361112894803844P);
        c = luVar;
        dev.epro.r0.U15842361112894803844 u15842361112894803844P2 = dev.epro.r0.N7756202525712935399.p(10, 14);
        u15842361112894803844P2.getClass();
        ads_mobile_sdk.lu luVar2 = new ads_mobile_sdk.lu("TOP_CENTER", 1, u15842361112894803844P2);
        d = luVar2;
        dev.epro.r0.U15842361112894803844 u15842361112894803844P3 = dev.epro.r0.N7756202525712935399.p(10, 11);
        u15842361112894803844P3.getClass();
        ads_mobile_sdk.lu luVar3 = new ads_mobile_sdk.lu("TOP_RIGHT", 2, u15842361112894803844P3);
        e = luVar3;
        java.lang.Object[] objArr = {13};
        dev.epro.r0.E3422549137300678133.M(1, objArr);
        dev.epro.r0.U15842361112894803844 u15842361112894803844M = dev.epro.r0.N7756202525712935399.m(1, objArr);
        u15842361112894803844M.getClass();
        ads_mobile_sdk.lu luVar4 = new ads_mobile_sdk.lu("CENTER", 3, u15842361112894803844M);
        f = luVar4;
        dev.epro.r0.U15842361112894803844 u15842361112894803844P4 = dev.epro.r0.N7756202525712935399.p(12, 9);
        u15842361112894803844P4.getClass();
        ads_mobile_sdk.lu luVar5 = new ads_mobile_sdk.lu("BOTTOM_LEFT", 4, u15842361112894803844P4);
        g = luVar5;
        dev.epro.r0.U15842361112894803844 u15842361112894803844P5 = dev.epro.r0.N7756202525712935399.p(12, 14);
        u15842361112894803844P5.getClass();
        ads_mobile_sdk.lu luVar6 = new ads_mobile_sdk.lu("BOTTOM_CENTER", 5, u15842361112894803844P5);
        h = luVar6;
        dev.epro.r0.U15842361112894803844 u15842361112894803844P6 = dev.epro.r0.N7756202525712935399.p(12, 11);
        u15842361112894803844P6.getClass();
        ads_mobile_sdk.lu luVar7 = new ads_mobile_sdk.lu("BOTTOM_RIGHT", 6, u15842361112894803844P6);
        i = luVar7;
        j = new ads_mobile_sdk.lu[]{luVar, luVar2, luVar3, luVar4, luVar5, luVar6, luVar7};
        b = new dev.epro.r0.P5733283974459951585((byte) 9);
    }

    public lu(java.lang.String str, int i2, dev.epro.r0.U15842361112894803844 u15842361112894803844) {
        this.a = u15842361112894803844;
    }

    public static ads_mobile_sdk.lu[] values() {
        return (ads_mobile_sdk.lu[]) j.clone();
    }
}
