package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M10231208252481466989 extends Q14045283675743224921 {
    public final /* synthetic */ M9197813449740923653 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M10231208252481466989(M9197813449740923653 m9197813449740923653, M9197813449740923653 m91978134497409236532, CharSequence charSequence) {
        super(m91978134497409236532, charSequence);
        this.f = m9197813449740923653;
    }

    @Override // dev.epro.r0.Q14045283675743224921
    public final int b(int i) {
        Object obj = this.f.b;
        CharSequence charSequence = this.c;
        int length = charSequence.length();
        U15853425786981391261.A(i, length);
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
