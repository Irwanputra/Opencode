package team.dev.epro.apkcustom.widgets.jsonhighlight;

import android.widget.MultiAutoCompleteTextView;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class KeywordTokenizer implements MultiAutoCompleteTextView.Tokenizer {
    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public int findTokenEnd(CharSequence charSequence, int i) {
        return charSequence.length();
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public int findTokenStart(CharSequence charSequence, int i) {
        String substring = charSequence.toString().substring(0, i);
        int max = Math.max(0, Math.max(substring.lastIndexOf(Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"))), Math.max(substring.lastIndexOf("\n"), substring.lastIndexOf(Crypt.a(Crypt.xrc("He:\u001ca=\u0019j=\u0019g;\u001dkk@1=\u001eei\u001cc9N1mI3<Kj"))))));
        if (max == 0) {
            return 0;
        }
        int i2 = max + 1;
        return i2 < charSequence.length() ? i2 : max;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public CharSequence terminateToken(CharSequence charSequence) {
        return charSequence;
    }
}
