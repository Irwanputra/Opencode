package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public enum H17345613557654595427 {
    V1_0(new Integer[]{1, 0}),
    V1_1(new Integer[]{1, 1});

    public final Integer[] a;

    H17345613557654595427(Integer[] numArr) {
        this.a = numArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Integer[] numArr = this.a;
        sb.append(numArr[0]);
        sb.append(".");
        sb.append(numArr[1]);
        return "Version: ".concat(sb.toString());
    }
}
