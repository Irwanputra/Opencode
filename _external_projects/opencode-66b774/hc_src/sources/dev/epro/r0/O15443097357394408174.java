package dev.epro.r0;

import java.text.BreakIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O15443097357394408174 extends E686369837194379706 {
    public final BreakIterator j;

    public O15443097357394408174(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.j = characterInstance;
    }

    @Override // dev.epro.r0.E686369837194379706
    public final int D(int i) {
        return this.j.following(i);
    }

    @Override // dev.epro.r0.E686369837194379706
    public final int J(int i) {
        return this.j.preceding(i);
    }
}
