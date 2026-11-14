package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F14219584781620110682 {
    public static final F14219584781620110682 a;
    public static final F14219584781620110682 b;
    public static final F14219584781620110682 c;
    public static final /* synthetic */ F14219584781620110682[] d;

    static {
        F14219584781620110682 f14219584781620110682 = new F14219584781620110682("None", 0);
        a = f14219584781620110682;
        F14219584781620110682 f142195847816201106822 = new F14219584781620110682("Cancelled", 1);
        b = f142195847816201106822;
        F14219584781620110682 f142195847816201106823 = new F14219584781620110682("Redirected", 2);
        c = f142195847816201106823;
        d = new F14219584781620110682[]{f14219584781620110682, f142195847816201106822, f142195847816201106823, new F14219584781620110682("RedirectCancelled", 3)};
    }

    public static F14219584781620110682 valueOf(String str) {
        return (F14219584781620110682) Enum.valueOf(F14219584781620110682.class, str);
    }

    public static F14219584781620110682[] values() {
        return (F14219584781620110682[]) d.clone();
    }
}
