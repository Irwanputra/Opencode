package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q7752057199655583902 {
    public static final Q7752057199655583902 a;
    public static final /* synthetic */ Q7752057199655583902[] b;

    /* JADX INFO: Fake field, exist only in values array */
    Q7752057199655583902 EF0;

    static {
        Q7752057199655583902 q7752057199655583902 = new Q7752057199655583902("NONE", 0);
        Q7752057199655583902 q77520571996555839022 = new Q7752057199655583902("START", 1);
        Q7752057199655583902 q77520571996555839023 = new Q7752057199655583902("END", 2);
        Q7752057199655583902 q77520571996555839024 = new Q7752057199655583902("BOTH", 3);
        a = q77520571996555839024;
        b = new Q7752057199655583902[]{q7752057199655583902, q77520571996555839022, q77520571996555839023, q77520571996555839024};
    }

    public static Q7752057199655583902 valueOf(String str) {
        return (Q7752057199655583902) Enum.valueOf(Q7752057199655583902.class, str);
    }

    public static Q7752057199655583902[] values() {
        return (Q7752057199655583902[]) b.clone();
    }
}
