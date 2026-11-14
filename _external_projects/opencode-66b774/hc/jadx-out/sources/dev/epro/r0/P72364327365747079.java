package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P72364327365747079 {
    private static final /* synthetic */ F5641334525175164863 $ENTRIES;
    private static final /* synthetic */ P72364327365747079[] $VALUES;
    public static final J11378867428257506542 Companion;
    public static final P72364327365747079 ON_ANY;
    public static final P72364327365747079 ON_CREATE;
    public static final P72364327365747079 ON_DESTROY;
    public static final P72364327365747079 ON_PAUSE;
    public static final P72364327365747079 ON_RESUME;
    public static final P72364327365747079 ON_START;
    public static final P72364327365747079 ON_STOP;

    static {
        P72364327365747079 p72364327365747079 = new P72364327365747079("ON_CREATE", 0);
        ON_CREATE = p72364327365747079;
        P72364327365747079 p723643273657470792 = new P72364327365747079("ON_START", 1);
        ON_START = p723643273657470792;
        P72364327365747079 p723643273657470793 = new P72364327365747079("ON_RESUME", 2);
        ON_RESUME = p723643273657470793;
        P72364327365747079 p723643273657470794 = new P72364327365747079("ON_PAUSE", 3);
        ON_PAUSE = p723643273657470794;
        P72364327365747079 p723643273657470795 = new P72364327365747079("ON_STOP", 4);
        ON_STOP = p723643273657470795;
        P72364327365747079 p723643273657470796 = new P72364327365747079("ON_DESTROY", 5);
        ON_DESTROY = p723643273657470796;
        P72364327365747079 p723643273657470797 = new P72364327365747079("ON_ANY", 6);
        ON_ANY = p723643273657470797;
        P72364327365747079[] p72364327365747079Arr = {p72364327365747079, p723643273657470792, p723643273657470793, p723643273657470794, p723643273657470795, p723643273657470796, p723643273657470797};
        $VALUES = p72364327365747079Arr;
        $ENTRIES = new M665231115116566295(p72364327365747079Arr);
        Companion = new J11378867428257506542();
    }

    public static P72364327365747079 valueOf(String str) {
        return (P72364327365747079) Enum.valueOf(P72364327365747079.class, str);
    }

    public static P72364327365747079[] values() {
        return (P72364327365747079[]) $VALUES.clone();
    }

    public final Q14196755420833223976 a() {
        switch (Z5279258599918141656.a[ordinal()]) {
            case 1:
            case 2:
                return Q14196755420833223976.c;
            case 3:
            case 4:
                return Q14196755420833223976.d;
            case 5:
                return Q14196755420833223976.e;
            case 6:
                return Q14196755420833223976.a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                Z3383101362411723454.g();
                return null;
        }
    }
}
