package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D16524099442378852760 extends K17198996250266005227 {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean[] b;

    public D16524099442378852760() {
        if ("-_.!~*'()@:$&,;=[]/".matches(".*[0-9A-Za-z].*")) {
            S10973172697741180971.j("Alphanumeric characters are always 'safe' and should not be explicitly specified");
            throw null;
        }
        char[] charArray = "-_.!~*'()@:$&,;=[]/".toCharArray();
        int iMax = 122;
        for (char c2 : charArray) {
            iMax = Math.max((int) c2, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (int i = 48; i <= 57; i++) {
            zArr[i] = true;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            zArr[i2] = true;
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            zArr[i3] = true;
        }
        for (char c3 : charArray) {
            zArr[c3] = true;
        }
        this.b = zArr;
    }
}
