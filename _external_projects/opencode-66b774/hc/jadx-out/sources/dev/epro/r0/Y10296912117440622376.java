package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y10296912117440622376 implements U16443665883761795894 {
    public final CharSequence a;
    public final int b;
    public final L12639328004344855510 c;

    public Y10296912117440622376(CharSequence charSequence, int i, L12639328004344855510 l12639328004344855510) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = l12639328004344855510;
    }

    @Override // dev.epro.r0.U16443665883761795894
    public final Iterator iterator() {
        return new G12653093637352814222(this);
    }
}
