package team.dev.epro.apkcustom.widgets.jsonhighlight;

import android.content.Context;
import java.util.regex.Pattern;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class JsonSyntaxManager {
    private static final Pattern PATTERN_PROPERTY = Pattern.compile("\".*\"(?=.*:)");
    private static final Pattern PATTERN_STRING = Pattern.compile("\".*\"(?!.*:)");
    private static final Pattern PATTERN_NUMBER = Pattern.compile("[0-9](?!.*\")");
    private static final Pattern PATTERN_PUNCTUATION = Pattern.compile("[{}\\[\\]);,]");
    private static final Pattern PATTERN_OPERATOR = Pattern.compile(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
    private static final Pattern PATTERN_BOOLEAN = Pattern.compile(Crypt.a(Crypt.xrc("H1:M3m\u001d`iN1<I`m\u001c6m\u001ajfI3>J7>Nal\u001db")));
    private static final Pattern PATTERN_NULL = Pattern.compile(Crypt.a(Crypt.xrc("H1m@c:KggLe9KkfAgj\u00196oI1oHb=\u001a6iJa")));

    public static void applyTheme(Context context, CodeView codeView) {
        codeView.resetSyntaxPatternList();
        codeView.addSyntaxPattern(PATTERN_PROPERTY, context.getResources().getColor(2131099835));
        codeView.addSyntaxPattern(PATTERN_STRING, context.getResources().getColor(2131099831));
        codeView.addSyntaxPattern(PATTERN_NUMBER, context.getResources().getColor(2131099833));
        codeView.addSyntaxPattern(PATTERN_PUNCTUATION, context.getResources().getColor(2131099834));
        codeView.addSyntaxPattern(PATTERN_OPERATOR, context.getResources().getColor(2131099724));
        codeView.addSyntaxPattern(PATTERN_NULL, context.getResources().getColor(2131099832));
        codeView.addSyntaxPattern(PATTERN_BOOLEAN, context.getResources().getColor(2131099889));
        codeView.setTextColor(context.getResources().getColor(2131099724));
        codeView.reHighlightSyntax();
    }
}
