package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C17777856232554783605 {
    public final int a;

    public static java.lang.String a(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : i == 10 ? "PasswordVisible" : i == 11 ? "PostalAddress" : i == 12 ? "PersonName" : i == 13 ? "EmailSubject" : i == 14 ? "ShortMessage" : i == 15 ? "LongMessage" : i == 16 ? "Filter" : i == 17 ? "Phonetic" : i == 18 ? "DateTime" : i == 19 ? "Date" : i == 20 ? "Time" : i == 21 ? "NumberSigned" : i == 22 ? "DecimalSigned" : i == 23 ? "DecimalPassword" : i == 24 ? "NumberPasswordSigned" : i == 25 ? "DecimalPasswordSigned" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.C17777856232554783605) {
            return this.a == ((dev.epro.r0.C17777856232554783605) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
