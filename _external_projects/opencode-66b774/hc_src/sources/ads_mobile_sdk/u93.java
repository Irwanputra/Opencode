package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class u93 {
    public static final u93 b;
    public static final u93 c;
    public static final u93 d;
    public static final u93 e;
    public static final /* synthetic */ u93[] f;
    public final long a;

    static {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        u93 u93Var = new u93("FAST", 0, M9216324016624295870.Z(30, n13798149404328803870));
        b = u93Var;
        u93 u93Var2 = new u93("MEDIUM", 1, M9216324016624295870.Z(100, n13798149404328803870));
        c = u93Var2;
        u93 u93Var3 = new u93("SLOW", 2, M9216324016624295870.Z(300, n13798149404328803870));
        d = u93Var3;
        u93 u93Var4 = new u93("SUPER_SLOW", 3, M9216324016624295870.Z(1000, n13798149404328803870));
        e = u93Var4;
        f = new u93[]{u93Var, u93Var2, u93Var3, u93Var4};
    }

    public u93(String str, int i, long j) {
        this.a = j;
    }

    public static u93[] values() {
        return (u93[]) f.clone();
    }
}
