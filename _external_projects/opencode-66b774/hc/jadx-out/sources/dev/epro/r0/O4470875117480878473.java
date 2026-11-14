package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O4470875117480878473 {
    public static final O4470875117480878473 a;
    public static final O4470875117480878473 b;
    public static final O4470875117480878473 c;
    public static final O4470875117480878473 d;
    public static final /* synthetic */ O4470875117480878473[] e;

    static {
        O4470875117480878473 o4470875117480878473 = new O4470875117480878473("IGNORED", 0);
        a = o4470875117480878473;
        O4470875117480878473 o44708751174808784732 = new O4470875117480878473("SCHEDULED", 1);
        b = o44708751174808784732;
        O4470875117480878473 o44708751174808784733 = new O4470875117480878473("DEFERRED", 2);
        c = o44708751174808784733;
        O4470875117480878473 o44708751174808784734 = new O4470875117480878473("IMMINENT", 3);
        d = o44708751174808784734;
        e = new O4470875117480878473[]{o4470875117480878473, o44708751174808784732, o44708751174808784733, o44708751174808784734};
    }

    public static O4470875117480878473 valueOf(String str) {
        return (O4470875117480878473) Enum.valueOf(O4470875117480878473.class, str);
    }

    public static O4470875117480878473[] values() {
        return (O4470875117480878473[]) e.clone();
    }
}
