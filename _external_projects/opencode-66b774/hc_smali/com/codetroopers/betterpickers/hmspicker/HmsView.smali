.class public Lcom/codetroopers/betterpickers/hmspicker/HmsView;
.super Landroid/widget/LinearLayout;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public 〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public final ぁごぐすすぃ:Landroid/graphics/Typeface;

.field public くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public ぺぁあねじ:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/hmspicker/HmsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    iput-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぁごぐすすぃ:Landroid/graphics/Typeface;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    return-void
.end method


# virtual methods
.method public onFinishInflate()V
    .registers 3

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->hours_ones:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->minutes_tens:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->minutes_ones:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->seconds_tens:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->seconds_ones:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->minus_label:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->〳ぜぞぜべっ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_4b

    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ()V

    :cond_4b
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_52

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ()V

    :cond_52
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_59

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ()V

    :cond_59
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_67

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぁごぐすすぃ:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_67
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_75

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぁごぐすすぃ:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_75
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

    iput-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    .line 1
    :cond_15
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_1e

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1e
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_27

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_27
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_30

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_30
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_39

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_39
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_42

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_42
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->〳ぜぞぜべっ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_4b

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_4b
    return-void
.end method

.method public setTime(IIIII)V
    .registers 13

    const/4 v1, 0x0

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->setTime(ZIIIII)V

    return-void
.end method

.method public setTime(ZIIIII)V
    .registers 11

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->〳ぜぞぜべっ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    goto :goto_9

    :cond_7
    const/16 p1, 0x8

    :goto_9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const/4 v0, 0x1

    const-string v2, "%d"

    if-eqz p1, :cond_22

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v3, v1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_22
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_35

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_35
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_48

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_48
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->なぎぱいぢぎ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_5b

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5b
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_6e

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6e
    return-void
.end method
