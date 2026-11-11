package team.dev.epro.apkcustom.widgets.jsonhighlight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CodeView extends AppCompatMultiAutoCompleteTextView {
    private static final Pattern PATTERN_LINE = Pattern.compile(Crypt.a(Crypt.xrc("\u00197:Ngm\u001c4<\u00191fAff\u001b7m\u001bd=\u001a4jJkgO`oN`")), 8);
    private static final Pattern PATTERN_TRAILING_WHITE_SPACE = Pattern.compile("[\\t ]+$", 8);
    private static final String TAG = "CodeView";
    public int LINE_NUMBER_TEXTSIZE_GAP;
    private Rect _rect;
    private boolean dirty;
    private final float displayDensity;
    private boolean hasErrors;
    private int lineNumberMarginGap;
    private boolean lineNumberVisible;
    private Paint lpaint;
    private MultiAutoCompleteTextView.Tokenizer mAutoCompleteTokenizer;
    private final TextWatcher mEditorTextWatcher;
    private final SortedMap<Integer, Integer> mErrorHashSet;
    private List<Character> mIndentCharacterList;
    private boolean mRemoveErrorsWhenTextChanged;
    private final Map<Pattern, Integer> mSyntaxPatternMap;
    private int mUpdateDelayTime;
    private final Handler mUpdateHandler;
    private final Runnable mUpdateRunnable;
    private boolean modified;
    private int tabWidth;
    private int tabWidthInCharacters;

    public final class TabWidthSpan extends ReplacementSpan {
        private TabWidthSpan() {
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return CodeView.this.tabWidth;
        }
    }

    public CodeView(Context context) {
        super(context);
        this.lineNumberVisible = false;
        this.lineNumberMarginGap = 2;
        this.LINE_NUMBER_TEXTSIZE_GAP = 2;
        this.mUpdateDelayTime = 500;
        this.modified = true;
        this.mUpdateHandler = new Handler();
        this.displayDensity = getResources().getDisplayMetrics().density;
        this.mErrorHashSet = new TreeMap();
        this.mSyntaxPatternMap = new HashMap();
        this.mIndentCharacterList = Arrays.asList('{', '+', '-', '*', '/', '=');
        this.mUpdateRunnable = new Runnable() { // from class: team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView.2
            @Override // java.lang.Runnable
            public void run() {
                CodeView.this.highlightWithoutChange(CodeView.this.getText());
            }
        };
        this.mEditorTextWatcher = new TextWatcher() { // from class: team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView.3
            private int count;
            private int start;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CodeView.this.cancelHighlighterRender();
                if (CodeView.this.getSyntaxPatternsSize() > 0) {
                    CodeView.this.convertTabs(editable, this.start, this.count);
                    if (CodeView.this.modified) {
                        CodeView.this.dirty = true;
                        CodeView.this.mUpdateHandler.postDelayed(CodeView.this.mUpdateRunnable, CodeView.this.mUpdateDelayTime);
                        if (CodeView.this.mRemoveErrorsWhenTextChanged) {
                            CodeView.this.removeAllErrorLines();
                        }
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.start = i;
                this.count = i3;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        initEditorView();
    }

    public CodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lineNumberVisible = false;
        this.lineNumberMarginGap = 2;
        this.LINE_NUMBER_TEXTSIZE_GAP = 2;
        this.mUpdateDelayTime = 500;
        this.modified = true;
        this.mUpdateHandler = new Handler();
        this.displayDensity = getResources().getDisplayMetrics().density;
        this.mErrorHashSet = new TreeMap();
        this.mSyntaxPatternMap = new HashMap();
        this.mIndentCharacterList = Arrays.asList('{', '+', '-', '*', '/', '=');
        this.mUpdateRunnable = new Runnable() { // from class: team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView.2
            @Override // java.lang.Runnable
            public void run() {
                CodeView.this.highlightWithoutChange(CodeView.this.getText());
            }
        };
        this.mEditorTextWatcher = new TextWatcher() { // from class: team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView.3
            private int count;
            private int start;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CodeView.this.cancelHighlighterRender();
                if (CodeView.this.getSyntaxPatternsSize() > 0) {
                    CodeView.this.convertTabs(editable, this.start, this.count);
                    if (CodeView.this.modified) {
                        CodeView.this.dirty = true;
                        CodeView.this.mUpdateHandler.postDelayed(CodeView.this.mUpdateRunnable, CodeView.this.mUpdateDelayTime);
                        if (CodeView.this.mRemoveErrorsWhenTextChanged) {
                            CodeView.this.removeAllErrorLines();
                        }
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.start = i;
                this.count = i3;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        initEditorView();
    }

    public CodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineNumberVisible = false;
        this.lineNumberMarginGap = 2;
        this.LINE_NUMBER_TEXTSIZE_GAP = 2;
        this.mUpdateDelayTime = 500;
        this.modified = true;
        this.mUpdateHandler = new Handler();
        this.displayDensity = getResources().getDisplayMetrics().density;
        this.mErrorHashSet = new TreeMap();
        this.mSyntaxPatternMap = new HashMap();
        this.mIndentCharacterList = Arrays.asList('{', '+', '-', '*', '/', '=');
        this.mUpdateRunnable = new Runnable() { // from class: team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView.2
            @Override // java.lang.Runnable
            public void run() {
                CodeView.this.highlightWithoutChange(CodeView.this.getText());
            }
        };
        this.mEditorTextWatcher = new TextWatcher() { // from class: team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView.3
            private int count;
            private int start;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CodeView.this.cancelHighlighterRender();
                if (CodeView.this.getSyntaxPatternsSize() > 0) {
                    CodeView.this.convertTabs(editable, this.start, this.count);
                    if (CodeView.this.modified) {
                        CodeView.this.dirty = true;
                        CodeView.this.mUpdateHandler.postDelayed(CodeView.this.mUpdateRunnable, CodeView.this.mUpdateDelayTime);
                        if (CodeView.this.mRemoveErrorsWhenTextChanged) {
                            CodeView.this.removeAllErrorLines();
                        }
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i22, int i3) {
                this.start = i2;
                this.count = i3;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i22, int i3) {
            }
        };
        initEditorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence autoIndent(CharSequence charSequence, Spanned spanned, int i, int i2) {
        char charAt;
        int i3 = i - 1;
        int i4 = 0;
        boolean z = false;
        while (i3 > -1 && (charAt = spanned.charAt(i3)) != '\n') {
            if (charAt != ' ' && charAt != '\t') {
                if (!z) {
                    if (this.mIndentCharacterList.contains(Character.valueOf(charAt))) {
                        i4--;
                    }
                    z = true;
                }
                if (charAt == '(') {
                    i4--;
                } else if (charAt == ')') {
                    i4++;
                }
            }
            i3--;
        }
        String str = "";
        if (i3 > -1) {
            char charAt2 = spanned.charAt(i);
            int i5 = i3 + 1;
            int i6 = i5;
            while (true) {
                if (i6 >= i2) {
                    break;
                }
                char charAt3 = spanned.charAt(i6);
                if (charAt2 != '\n' && charAt3 == '/' && i6 + 1 < i2 && spanned.charAt(i6) == charAt3) {
                    i6 += 2;
                    break;
                }
                if (charAt3 != ' ' && charAt3 != '\t') {
                    break;
                }
                i6++;
            }
            StringBuilder m4207 = C2098.m4207("");
            m4207.append((Object) spanned.subSequence(i5, i6));
            str = m4207.toString();
        }
        if (i4 < 0) {
            str = C2098.m4205(str, "\t");
        }
        return ((Object) charSequence) + str;
    }

    private void clearSpans(Editable editable) {
        int length = editable.length();
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(0, length, ForegroundColorSpan.class);
        int length2 = foregroundColorSpanArr.length;
        while (true) {
            int i = length2 - 1;
            if (length2 <= 0) {
                break;
            }
            editable.removeSpan(foregroundColorSpanArr[i]);
            length2 = i;
        }
        BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) editable.getSpans(0, length, BackgroundColorSpan.class);
        int length3 = backgroundColorSpanArr.length;
        while (true) {
            int i2 = length3 - 1;
            if (length3 <= 0) {
                return;
            }
            editable.removeSpan(backgroundColorSpanArr[i2]);
            length3 = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void convertTabs(Editable editable, int i, int i2) {
        if (this.tabWidth < 1) {
            return;
        }
        String obj = editable.toString();
        int i3 = i2 + i;
        while (true) {
            int indexOf = obj.indexOf("\t", i);
            if (indexOf <= -1 || indexOf >= i3) {
                return;
            }
            int i4 = indexOf + 1;
            editable.setSpan(new TabWidthSpan(), indexOf, i4, 33);
            i = i4;
        }
    }

    private void createBackgroundColorSpan(Editable editable, Matcher matcher, int i) {
        editable.setSpan(new BackgroundColorSpan(i), matcher.start(), matcher.end(), 33);
    }

    private void createForegroundColorSpan(Editable editable, Matcher matcher, int i) {
        editable.setSpan(new ForegroundColorSpan(i), matcher.start(), matcher.end(), 33);
    }

    private Editable highlight(Editable editable) {
        try {
        } catch (IllegalStateException e) {
            e.getMessage();
        }
        if (editable.length() == 0) {
            return editable;
        }
        clearSpans(editable);
        highlightErrorLines(editable);
        highlightSyntax(editable);
        return editable;
    }

    private void highlightErrorLines(Editable editable) {
        if (this.mErrorHashSet.isEmpty()) {
            return;
        }
        int intValue = this.mErrorHashSet.lastKey().intValue();
        int i = 0;
        Matcher matcher = PATTERN_LINE.matcher(editable);
        while (matcher.find()) {
            if (this.mErrorHashSet.containsKey(Integer.valueOf(i))) {
                createBackgroundColorSpan(editable, matcher, this.mErrorHashSet.get(Integer.valueOf(i)).intValue());
            }
            i++;
            if (i > intValue) {
                return;
            }
        }
    }

    private void highlightSyntax(Editable editable) {
        if (this.mSyntaxPatternMap.isEmpty()) {
            return;
        }
        for (Pattern pattern : this.mSyntaxPatternMap.keySet()) {
            int intValue = this.mSyntaxPatternMap.get(pattern).intValue();
            Matcher matcher = pattern.matcher(editable);
            while (matcher.find()) {
                createForegroundColorSpan(editable, matcher, intValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void highlightWithoutChange(Editable editable) {
        this.modified = false;
        highlight(editable);
        this.modified = true;
    }

    private void initEditorView() {
        this._rect = new Rect();
        Paint paint = new Paint();
        this.lpaint = paint;
        paint.setAntiAlias(true);
        this.lpaint.setStyle(Paint.Style.FILL);
        this.lpaint.setColor(-1);
        this.lpaint.setTextSize(getTextSize() - this.LINE_NUMBER_TEXTSIZE_GAP);
        if (this.mAutoCompleteTokenizer == null) {
            this.mAutoCompleteTokenizer = new KeywordTokenizer();
        }
        setTokenizer(this.mAutoCompleteTokenizer);
        setHorizontallyScrolling(true);
        setFilters(new InputFilter[]{new InputFilter() { // from class: team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView.1
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return (CodeView.this.modified && i2 - i == 1 && i < charSequence.length() && i3 < spanned.length() && charSequence.charAt(i) == '\n') ? CodeView.this.autoIndent(charSequence, spanned, i3, i4) : charSequence;
            }
        }});
        addTextChangedListener(this.mEditorTextWatcher);
    }

    public void addErrorLine(int i, int i2) {
        this.mErrorHashSet.put(Integer.valueOf(i), Integer.valueOf(i2));
        this.hasErrors = true;
    }

    public void addSyntaxPattern(Pattern pattern, int i) {
        this.mSyntaxPatternMap.put(pattern, Integer.valueOf(i));
    }

    public void cancelHighlighterRender() {
        this.mUpdateHandler.removeCallbacks(this.mUpdateRunnable);
    }

    public void clearAutoIndentCharacterList() {
        this.mIndentCharacterList.clear();
    }

    public List<Character> getAutoIndentCharacterList() {
        return this.mIndentCharacterList;
    }

    public int getErrorsSize() {
        return this.mErrorHashSet.size();
    }

    public int getLineNumberMarginGap() {
        return this.lineNumberMarginGap;
    }

    public int getLineNumberTextColor() {
        return this.lpaint.getColor();
    }

    public int getSyntaxPatternsSize() {
        return this.mSyntaxPatternMap.size();
    }

    public String getTextWithoutTrailingSpace() {
        return PATTERN_TRAILING_WHITE_SPACE.matcher(getText()).replaceAll("");
    }

    public int getUpdateDelayTime() {
        return this.mUpdateDelayTime;
    }

    public boolean isHasError() {
        return this.hasErrors;
    }

    public boolean isLineNumberVisible() {
        return this.lineNumberVisible;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.lineNumberVisible) {
            this.lpaint.setTextSize(getTextSize() - this.LINE_NUMBER_TEXTSIZE_GAP);
            int baseline = getBaseline();
            int i = 0;
            String str = "";
            while (i < getLineCount()) {
                StringBuilder m4207 = C2098.m4207("");
                i++;
                m4207.append(i);
                str = m4207.toString();
                canvas.drawText(str, this._rect.left, baseline, this.lpaint);
                baseline += getLineHeight();
            }
            setPadding(((int) this.lpaint.measureText(str)) + this.lineNumberMarginGap, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onDraw(canvas);
    }

    public void reHighlightErrors() {
        highlightErrorLines(getEditableText());
    }

    public void reHighlightSyntax() {
        highlightSyntax(getEditableText());
    }

    public void removeAllErrorLines() {
        this.mErrorHashSet.clear();
        this.hasErrors = false;
    }

    public void removeErrorLine(int i) {
        this.mErrorHashSet.remove(Integer.valueOf(i));
        this.hasErrors = this.mErrorHashSet.size() > 0;
    }

    public void removeSyntaxPattern(Pattern pattern) {
        this.mSyntaxPatternMap.remove(pattern);
    }

    public void resetSyntaxPatternList() {
        this.mSyntaxPatternMap.clear();
    }

    public void setAutoCompleteTokenizer(MultiAutoCompleteTextView.Tokenizer tokenizer) {
        this.mAutoCompleteTokenizer = tokenizer;
    }

    public void setAutoIndentCharacterList(List<Character> list) {
        this.mIndentCharacterList = list;
    }

    public void setLineNumberMarginGap(int i) {
        this.lineNumberMarginGap = i;
    }

    public void setLineNumberTextColor(int i) {
        this.lpaint.setColor(i);
    }

    public void setLineNumberVisible(boolean z) {
        this.lineNumberVisible = z;
    }

    public void setRemoveErrorsWhenTextChanged(boolean z) {
        this.mRemoveErrorsWhenTextChanged = z;
    }

    public void setSyntaxPatternsMap(Map<Pattern, Integer> map) {
        if (!this.mSyntaxPatternMap.isEmpty()) {
            this.mSyntaxPatternMap.clear();
        }
        this.mSyntaxPatternMap.putAll(map);
    }

    public void setTabWidth(int i) {
        if (this.tabWidthInCharacters == i) {
            return;
        }
        this.tabWidthInCharacters = i;
        this.tabWidth = Math.round(getPaint().measureText(Crypt.a(Crypt.xrc("O`k\u001edjNc9@jj@`<LefA`n@dl\u001agjOfnA3"))) * i);
    }

    public void setTextHighlighted(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        cancelHighlighterRender();
        removeAllErrorLines();
        this.dirty = false;
        this.modified = false;
        setText(highlight(new SpannableStringBuilder(charSequence)));
        this.modified = true;
    }

    public void setUpdateDelayTime(int i) {
        this.mUpdateDelayTime = i;
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        getLocationOnScreen(new int[2]);
        getWindowVisibleDisplayFrame(new Rect());
        int selectionStart = getSelectionStart();
        Layout layout = getLayout();
        setDropDownVerticalOffset((int) (((layout.getLineForOffset(selectionStart) * 140) + 750) / this.displayDensity));
        setDropDownHorizontalOffset((int) (layout.getPrimaryHorizontal(selectionStart) / this.displayDensity));
        super.showDropDown();
    }
}
