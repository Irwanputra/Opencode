.class public Landroidx/appcompat/widget/AppCompatTextView;
.super Landroid/widget/TextView;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;
.implements Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/なぎぱいぢぎ;
.implements Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;


# instance fields
.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

.field public final くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

.field public づざかべべ:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u307a\u3075\u306d\u3065\u303a/\u304f\u3057\u3034\u303a\u3045;",
            ">;"
        }
    .end annotation
.end field

.field public final びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const v0, 0x1010084

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-static {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->げつ〴ぬぐ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びえぁぜい;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->びぐびあび(Landroid/util/AttributeSet;I)V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->づざかべべ(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;

    invoke-direct {p1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 2

    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ()V

    :cond_a
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_11
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .registers 2

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->づざかべべ:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_16
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .registers 2

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->びぐびあび:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_16
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .registers 2

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->くし〴〺ぅ:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_16
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .registers 2

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_12

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->なぎぱいぢぎ:[I

    return-object v0

    :cond_12
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .registers 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_d

    const/4 v1, 0x1

    :cond_d
    return v1

    :cond_e
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_17

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    .line 2
    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->げつ〴ぬぐ:I

    return v0

    :cond_17
    return v1
.end method

.method public getFirstBaselineToTopHeight()I
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getLastBaselineToBottomHeight()I
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〺つふすそ()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->くし〴〺ぅ()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->げつ〴ぬぐ:Landroid/content/res/ColorStateList;

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぅみぱぎぎ;->〺つふすそ:Landroid/graphics/PorterDuff$Mode;

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->づざかべべ:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_10

    const/4 v1, 0x0

    :try_start_5
    iput-object v1, p0, Landroidx/appcompat/widget/AppCompatTextView;->づざかべべ:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ;

    invoke-static {p0, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->へえどぜせ(Landroid/widget/TextView;Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ;)V
    :try_end_10
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_10} :catch_10
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_10} :catch_10

    .line 2
    :catch_10
    :cond_10
    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .registers 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_10

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;

    if-nez v0, :cond_b

    goto :goto_10

    :cond_b
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;->げつ〴ぬぐ()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0

    :cond_10
    :goto_10
    invoke-super {p0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public getTextMetricsParamsCompat()Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;
    .registers 2

    invoke-static {p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ばおぢでぎか(Landroid/widget/TextView;)Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;

    move-result-object v0

    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->くぎぶ〼のそ(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .registers 6

    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_10

    .line 1
    sget-boolean p2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-nez p2, :cond_10

    .line 2
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〺つふすそ()V

    :cond_10
    return-void
.end method

.method public onMeasure(II)V
    .registers 5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->づざかべべ:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_10

    const/4 v1, 0x0

    :try_start_5
    iput-object v1, p0, Landroidx/appcompat/widget/AppCompatTextView;->づざかべべ:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ;

    invoke-static {p0, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->へえどぜせ(Landroid/widget/TextView;Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ;)V
    :try_end_10
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_10} :catch_10
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_10} :catch_10

    .line 2
    :catch_10
    :cond_10
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_18

    sget-boolean p2, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-nez p2, :cond_18

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび()Z

    move-result p1

    if-eqz p1, :cond_18

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    .line 1
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->〺つふすそ()V

    :cond_18
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .registers 6

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_f

    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1, p2, p3, p4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぁごぐすすぃ(IIII)V

    :cond_f
    :goto_f
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .registers 4

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_f

    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〳ぜぞぜべっ([II)V

    :cond_f
    :goto_f
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .registers 3

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_f

    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ(I)V

    :cond_f
    :goto_f
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->づざかべべ()V

    :cond_a
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->なぎぱいぢぎ(I)V

    :cond_a
    return-void
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_a

    .line 1
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_a

    .line 1
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .registers 7

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_c

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_d

    :cond_c
    move-object p1, v1

    :goto_d
    if-eqz p2, :cond_14

    invoke-static {v0, p2}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_15

    :cond_14
    move-object p2, v1

    :goto_15
    if-eqz p3, :cond_1c

    invoke-static {v0, p3}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_1d

    :cond_1c
    move-object p3, v1

    :goto_1d
    if-eqz p4, :cond_23

    invoke-static {v0, p4}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_23
    invoke-virtual {p0, p1, p2, p3, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_2d

    .line 1
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_2d
    return-void
.end method

.method public setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_a

    .line 2
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_a
    return-void
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .registers 7

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_c

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_d

    :cond_c
    move-object p1, v1

    :goto_d
    if-eqz p2, :cond_14

    invoke-static {v0, p2}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_15

    :cond_14
    move-object p2, v1

    :goto_15
    if-eqz p3, :cond_1c

    invoke-static {v0, p3}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_1d

    :cond_1c
    move-object p3, v1

    :goto_1d
    if-eqz p4, :cond_23

    invoke-static {v0, p4}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_23
    invoke-virtual {p0, p1, p2, p3, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_2d

    .line 1
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_2d
    return-void
.end method

.method public setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz p1, :cond_a

    .line 2
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .registers 2

    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->いたぷすいだ(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_a

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    goto :goto_d

    :cond_a
    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->きぬどぼみ〸(Landroid/widget/TextView;I)V

    :goto_d
    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_a

    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    goto :goto_d

    :cond_a
    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->びちづぼぬ(Landroid/widget/TextView;I)V

    :goto_d
    return-void
.end method

.method public setLineHeight(I)V
    .registers 2

    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->にぢ〱ぁな(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setPrecomputedText(Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ;)V
    .registers 2

    invoke-static {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->へえどぜせ(Landroid/widget/TextView;Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->〳ぜぞぜべっ(Landroid/content/res/ColorStateList;)V

    :cond_7
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/びぐびあび;->ぺぁあねじ(Landroid/graphics/PorterDuff$Mode;)V

    :cond_7
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->いいにぽつ(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺふねづ〺(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->〺つふすそ()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .registers 4

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->なぎぱいぢぎ(Landroid/content/Context;I)V

    :cond_a
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_e

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatTextView;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;

    if-nez v0, :cond_b

    goto :goto_e

    .line 1
    :cond_b
    iput-object p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;->〺つふすそ:Landroid/view/textclassifier/TextClassifier;

    return-void

    .line 2
    :cond_e
    :goto_e
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u307a\u3075\u306d\u3065\u303a/\u304f\u3057\u3034\u303a\u3045;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatTextView;->づざかべべ:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Landroid/widget/TextView;->requestLayout()V

    :cond_7
    return-void
.end method

.method public setTextMetricsParamsCompat(Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;)V
    .registers 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_39

    .line 2
    iget-object v1, p1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;->〺つふすそ:Landroid/text/TextDirectionHeuristic;

    .line 3
    sget-object v2, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_e

    goto :goto_36

    :cond_e
    sget-object v2, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v1, v2, :cond_13

    goto :goto_36

    :cond_13
    sget-object v2, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v1, v2, :cond_19

    const/4 v3, 0x2

    goto :goto_36

    :cond_19
    sget-object v2, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v1, v2, :cond_1f

    const/4 v3, 0x3

    goto :goto_36

    :cond_1f
    sget-object v2, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v1, v2, :cond_25

    const/4 v3, 0x4

    goto :goto_36

    :cond_25
    sget-object v2, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    if-ne v1, v2, :cond_2b

    const/4 v3, 0x5

    goto :goto_36

    :cond_2b
    sget-object v2, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v1, v2, :cond_31

    const/4 v3, 0x6

    goto :goto_36

    :cond_31
    sget-object v2, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v1, v2, :cond_36

    const/4 v3, 0x7

    .line 4
    :cond_36
    :goto_36
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setTextDirection(I)V

    :cond_39
    const/16 v1, 0x17

    if-ge v0, v1, :cond_62

    .line 5
    iget-object v0, p1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 6
    invoke-virtual {v0}, Landroid/text/TextPaint;->getTextScaleX()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    .line 7
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 8
    invoke-virtual {v1, p1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextScaleX()F

    move-result p1

    cmpl-float p1, v0, p1

    if-nez p1, :cond_5e

    const/high16 p1, 0x40000000    # 2.0f

    div-float p1, v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr p1, v1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextScaleX(F)V

    :cond_5e
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextScaleX(F)V

    goto :goto_75

    :cond_62
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    .line 9
    iget-object v1, p1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 10
    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 11
    iget v0, p1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;->くし〴〺ぅ:I

    .line 12
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setBreakStrategy(I)V

    .line 13
    iget p1, p1, Lづざかべべ/〳ぜぞぜべっ/ぺふねづ〺/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:I

    .line 14
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHyphenationFrequency(I)V

    :goto_75
    return-void
.end method

.method public setTextSize(IF)V
    .registers 5

    sget-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_19

    :cond_8
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatTextView;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;

    if-eqz v1, :cond_19

    if-nez v0, :cond_19

    .line 1
    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->びぐびあび()Z

    move-result v0

    if-nez v0, :cond_19

    .line 2
    iget-object v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/てぜきぽく;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->ぁごぐすすぃ(IF)V

    :cond_19
    :goto_19
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;I)V
    .registers 11

    const/4 v0, 0x0

    if-eqz p1, :cond_4b

    if-lez p2, :cond_4b

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 1
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;

    if-eqz v1, :cond_43

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-ge v2, v3, :cond_3e

    .line 2
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;

    .line 3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->ぁごぐすすぃ(Landroid/graphics/Typeface;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_24

    move-object v3, v0

    goto :goto_30

    :cond_24
    iget-object v5, v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;

    :goto_30
    if-nez v3, :cond_33

    goto :goto_3b

    .line 4
    :cond_33
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v2, v1, v3, v0, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/くし〴〺ぅ;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v0

    :goto_3b
    if-eqz v0, :cond_3e

    goto :goto_4b

    .line 5
    :cond_3e
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_4b

    :cond_43
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4b
    :goto_4b
    if-eqz v0, :cond_4e

    move-object p1, v0

    .line 6
    :cond_4e
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void
.end method
