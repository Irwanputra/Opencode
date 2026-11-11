.class public Lcom/codetroopers/betterpickers/datepicker/DateView;
.super Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

.field public 〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public ぁごぐすすぃ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

.field public くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

.field public final づざかべべ:Landroid/graphics/Typeface;

.field public なぎぱいぢぎ:Landroid/graphics/Typeface;

.field public びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/datepicker/DateView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    iput-object p2, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->づざかべべ:Landroid/graphics/Typeface;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string p2, "fonts/Roboto-Bold.ttf"

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setWillNotDraw(Z)V

    return-void
.end method


# virtual methods
.method public getDate()Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;
    .registers 2

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    return-object v0
.end method

.method public getMonth()Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;
    .registers 2

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    return-object v0
.end method

.method public getYear()Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;
    .registers 2

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->ぁごぐすすぃ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    invoke-virtual {p1, p0}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->setTitleView(Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;)V

    return-void
.end method

.method public onFinishInflate()V
    .registers 5

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->month:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->date:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->year_label:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getDateFormatOrder(Landroid/content/Context;)[C

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v1, 0x0

    :goto_2d
    array-length v2, v0

    if-ge v1, v2, :cond_4d

    aget-char v2, v0, v1

    const/16 v3, 0x4d

    if-eq v2, v3, :cond_45

    const/16 v3, 0x64

    if-eq v2, v3, :cond_42

    const/16 v3, 0x79

    if-eq v2, v3, :cond_3f

    goto :goto_4a

    :cond_3f
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    goto :goto_47

    :cond_42
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    goto :goto_47

    :cond_45
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    :goto_47
    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :goto_4a
    add-int/lit8 v1, v1, 0x1

    goto :goto_2d

    :cond_4d
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_5b

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->づざかべべ:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_5b
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_69

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->づざかべべ:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_69
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ()V

    return-void
.end method

.method public setDate(Ljava/lang/String;II)V
    .registers 8

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    const/4 v1, 0x0

    const-string v2, "-"

    const/4 v3, 0x1

    if-eqz v0, :cond_3d

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_27

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->づざかべべ:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    goto :goto_3d

    :cond_27
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ()V

    :cond_3d
    :goto_3d
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_5d

    if-gtz p2, :cond_4c

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_58

    :cond_4c
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    :goto_58
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_5d
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz p1, :cond_8d

    if-gtz p3, :cond_6e

    const-string p2, "----"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_88

    :cond_6e
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    :goto_72
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x4

    if-ge p2, p3, :cond_7e

    invoke-static {v2, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_72

    :cond_7e
    iget-object p2, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    :goto_88
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    :cond_8d
    return-void
.end method

.method public setOnClick(Landroid/view/View$OnClickListener;)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

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

    iput-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    :cond_15
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ()V

    return-void
.end method

.method public setUnderlinePage(Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->ぁごぐすすぃ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    return-void
.end method

.method public final 〺つふすそ()V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〺つふすそ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->くし〴〺ぅ:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_12

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_12
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->びぐびあび:Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    if-eqz v0, :cond_1b

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DateView;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1b
    return-void
.end method

.method public げつ〴ぬぐ(I)Landroid/view/View;
    .registers 2

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
