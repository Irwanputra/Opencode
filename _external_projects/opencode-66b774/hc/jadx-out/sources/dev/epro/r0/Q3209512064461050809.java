package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public enum Q3209512064461050809 {
    DOUBLE_QUOTED('\"'),
    SINGLE_QUOTED('\''),
    LITERAL('|'),
    FOLDED('>'),
    /* JADX INFO: Fake field, exist only in values array */
    JSON_SCALAR_STYLE('J'),
    PLAIN(null);

    public final Character a;

    Q3209512064461050809(Character ch) {
        this.a = ch;
    }

    public static Q3209512064461050809 a(Character ch) {
        char cCharValue = ch.charValue();
        if (cCharValue == '\"') {
            return DOUBLE_QUOTED;
        }
        if (cCharValue == '\'') {
            return SINGLE_QUOTED;
        }
        if (cCharValue == '>') {
            return FOLDED;
        }
        if (cCharValue == '|') {
            return LITERAL;
        }
        S10973172697741180971.n("Unknown scalar style character: ", ch);
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Scalar style: '" + this.a + "'";
    }
}
