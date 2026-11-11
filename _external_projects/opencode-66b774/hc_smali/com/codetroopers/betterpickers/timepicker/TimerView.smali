.class public Lcom/codetroopers/betterpickers/timepicker/TimerView;
.super Landroid/widget/LinearLayout;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public 〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public ぁごぐすすぃ:Landroid/graphics/Typeface;

.field public くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public final なぎぱいぢぎ:Landroid/graphics/Typeface;

.field public びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public ぺぁあねじ:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/timepicker/TimerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    iput-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    return-void
.end method


# virtual methods
.method public onFinishInflate()V
    .registers 3

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->hours_tens:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->minutes_tens:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->hours_ones:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->minutes_ones:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->hours_seperator:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〳ぜぞぜべっ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぁごぐすすぃ:Landroid/graphics/Typeface;

    :cond_3f
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_4d

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_4d
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_5b

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_5b
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

    iput-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    .line 1
    :cond_15
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_1e

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1e
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_27

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_27
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_30

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_30
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_39

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_39
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〳ぜぞぜべっ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_42

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぺぁあねじ:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_42
    return-void
.end method

.method public setTime(IIII)V
    .registers 12

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const-string v1, "-"

    const-string v2, "%d"

    const/4 v3, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_4f

    const/4 v6, -0x2

    if-ne p1, v6, :cond_13

    const/4 p1, 0x4

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4f

    :cond_13
    if-ne p1, v3, :cond_2a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    goto :goto_4a

    :cond_2a
    new-array v6, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v6, v5

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぁごぐすすぃ:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ()V

    :goto_4a
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_4f
    :goto_4f
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_8a

    if-ne p2, v3, :cond_6a

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object p2, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    goto :goto_8a

    :cond_6a
    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v0, v5

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object p2, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->ぁごぐすすぃ:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ()V

    :cond_8a
    :goto_8a
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_ad

    if-ne p3, v3, :cond_99

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_ad

    :cond_99
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->づざかべべ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v5

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_ad
    :goto_ad
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_d0

    if-ne p4, v3, :cond_bc

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_d0

    :cond_bc
    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v5

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimerView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    :cond_d0
    :goto_d0
    return-void
.end method
