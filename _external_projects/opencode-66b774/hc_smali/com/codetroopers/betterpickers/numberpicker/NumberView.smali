.class public Lcom/codetroopers/betterpickers/numberpicker/NumberView;
.super Landroid/widget/LinearLayout;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

.field public 〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public ぁごぐすすぃ:Landroid/graphics/Typeface;

.field public くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public final なぎぱいぢぎ:Landroid/graphics/Typeface;

.field public びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/numberpicker/NumberView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string p2, "fonts/AndroidClockMono-Thin.ttf"

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    return-void
.end method


# virtual methods
.method public onFinishInflate()V
    .registers 3

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->number:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->decimal:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->decimal_separator:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->minus_label:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_35

    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->ぁごぐすすぃ:Landroid/graphics/Typeface;

    :cond_35
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_43

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_43
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_51

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_51
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->げつ〴ぬぐ()V

    return-void
.end method

.method public setNumber(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .registers 9

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz p4, :cond_9

    const/4 p4, 0x0

    goto :goto_b

    :cond_9
    const/16 p4, 0x8

    :goto_b
    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const-string v0, ""

    const/4 v3, 0x1

    if-eqz p4, :cond_5d

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_39

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const-string p4, "-"

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object p4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    :goto_2e
    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :goto_33
    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_5d

    :cond_39
    iget-object p4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p3, :cond_52

    iget-object p4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->ぁごぐすすぃ:Landroid/graphics/Typeface;

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ()V

    goto :goto_33

    :cond_52
    iget-object p4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_2e

    :cond_5d
    :goto_5d
    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_88

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6d

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_88

    :cond_6d
    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_88
    :goto_88
    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_92

    if-eqz p3, :cond_8f

    const/4 v1, 0x0

    :cond_8f
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_92
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

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpTextColor:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    :cond_15
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->げつ〴ぬぐ()V

    return-void
.end method

.method public final げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_12

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_12
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_1b

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1b
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_24

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_24
    return-void
.end method
