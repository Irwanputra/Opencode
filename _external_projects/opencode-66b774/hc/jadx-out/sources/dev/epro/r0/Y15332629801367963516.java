package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y15332629801367963516 {
    public static final Y15332629801367963516 a;
    public static final Y15332629801367963516 b;
    public static final Y15332629801367963516 c;
    public static final /* synthetic */ Y15332629801367963516[] d;

    static {
        Y15332629801367963516 y15332629801367963516 = new Y15332629801367963516("Unknown", 0);
        a = y15332629801367963516;
        Y15332629801367963516 y153326298013679635162 = new Y15332629801367963516("Dispatching", 1);
        b = y153326298013679635162;
        Y15332629801367963516 y153326298013679635163 = new Y15332629801367963516("NotDispatching", 2);
        c = y153326298013679635163;
        d = new Y15332629801367963516[]{y15332629801367963516, y153326298013679635162, y153326298013679635163};
    }

    public static Y15332629801367963516 valueOf(String str) {
        return (Y15332629801367963516) Enum.valueOf(Y15332629801367963516.class, str);
    }

    public static Y15332629801367963516[] values() {
        return (Y15332629801367963516[]) d.clone();
    }
}
