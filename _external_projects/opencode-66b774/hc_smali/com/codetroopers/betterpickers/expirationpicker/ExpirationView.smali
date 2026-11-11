.class public Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;
.super Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;
.source ""


# instance fields
.field public 〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public ぁごぐすすぃ:Landroid/content/res/ColorStateList;

.field public くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public づざかべべ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

.field public なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public final びぐびあび:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p2

    const-string v0, "fonts/AndroidClockMono-Thin.ttf"

    invoke-static {p2, v0}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2

    iput-object p2, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->びぐびあび:Landroid/graphics/Typeface;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string p2, "fonts/Roboto-Bold.ttf"

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setWillNotDraw(Z)V

    return-void
.end method


# virtual methods
.method public getMonth()Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;
    .registers 2

    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    return-object v0
.end method

.method public getYear()Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;
    .registers 2

    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    invoke-virtual {p1, p0}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->setTitleView(Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;)V

    return-void
.end method

.method public onFinishInflate()V
    .registers 3

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->month:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->year_label:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->expiration_seperator:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_2f

    iget-object v1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->びぐびあび:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_2f
    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_38

    iget-object v1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->びぐびあび:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_38
    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_41

    iget-object v1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->びぐびあび:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_41
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ()V

    return-void
.end method

.method public setExpiration(Ljava/lang/String;I)V
    .registers 6

    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2a

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const-string v0, "--"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_25

    :cond_1b
    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    :goto_25
    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_2a
    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_5c

    if-gtz p2, :cond_3b

    const-string p2, "----"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_57

    :cond_3b
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    :goto_3f
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v0, 0x4

    if-ge p2, v0, :cond_4d

    const-string p2, "-"

    invoke-static {p1, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3f

    :cond_4d
    iget-object p2, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    :goto_57
    iget-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_5c
    return-void
.end method

.method public setOnClick(Landroid/view/View$OnClickListener;)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setTheme(I)V
    .registers 4

    const/4 v0, -0x1

    if-eq p1, v0, :cond_15

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpTitleColor:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    :cond_15
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ()V

    return-void
.end method

.method public setUnderlinePage(Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    return-void
.end method

.method public final 〺つふすそ()V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_12

    iget-object v1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_12
    iget-object v0, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_1b

    iget-object v1, p0, Lcom/codetroopers/betterpickers/expirationpicker/ExpirationView;->ぁごぐすすぃ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1b
    return-void
.end method

.method public げつ〴ぬぐ(I)Landroid/view/View;
    .registers 4

    const/4 v0, 0x2

    new-array v1, v0, [I

    fill-array-data v1, :array_12

    if-le p1, v0, :cond_a

    const/4 p1, 0x0

    return-object p1

    :cond_a
    aget p1, v1, p1

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    nop

    :array_12
    .array-data 4
        0x0
        0x2
    .end array-data
.end method
