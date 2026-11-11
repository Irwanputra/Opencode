.class public Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;
.super Landroid/widget/LinearLayout;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/widget/ImageButton;

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Landroid/widget/Button;

.field public final いいにぽつ:Landroid/content/Context;

.field public ぇぬぎばつ:Landroid/view/View;

.field public ぉざぅち〻:Landroid/content/res/ColorStateList;

.field public おぐぴう〸ず:Landroid/widget/Button;

.field public final くし〴〺ぅ:[Landroid/widget/Button;

.field public ごづごきえ:I

.field public ざっざへづ:I

.field public ざとぅぼこ〺:I

.field public づざかべべ:I

.field public てぜきぽく:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

.field public でどあくず:I

.field public なぎぱいぢぎ:Landroid/widget/Button;

.field public のぷのちつ:I

.field public は〲ぱなで:I

.field public びぐびあび:[I

.field public へぬ〴づぞ:Ljava/lang/String;

.field public ぺぁあねじ:Lcom/codetroopers/betterpickers/numberpicker/NumberView;

.field public ぺふねづ〺:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p2, 0x14

    iput p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〺つふすそ:I

    const/16 v0, 0xa

    new-array v0, v0, [Landroid/widget/Button;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    new-array p2, p2, [I

    iput-object p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    const/4 p2, -0x1

    iput p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    const-string v0, ""

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->へぬ〴づぞ:Ljava/lang/String;

    iput p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->でどあくず:I

    iput-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->いいにぽつ:Landroid/content/Context;

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->getLayoutId()I

    move-result p2

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->key_background_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざとぅぼこ〺:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->button_background_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->は〲ぱなで:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->ic_backspace_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざっざへづ:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->default_divider_color_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ごづごきえ:I

    return-void
.end method

.method private getEnteredNumberString()Ljava/lang/String;
    .registers 6

    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    const-string v1, ""

    :goto_4
    if-ltz v0, :cond_2d

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    aget v3, v2, v0

    const/4 v4, -0x1

    if-ne v3, v4, :cond_e

    goto :goto_2a

    :cond_e
    aget v2, v2, v0

    const/16 v3, 0xa

    if-ne v2, v3, :cond_1b

    const-string v2, "."

    invoke-static {v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    goto :goto_26

    :cond_1b
    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    aget v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_2a
    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    :cond_2d
    return-object v1
.end method


# virtual methods
.method public getDecimal()D
    .registers 3

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->getEnteredNumber()Ljava/math/BigDecimal;

    move-result-object v0

    sget-object v1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->remainder(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getEnteredNumber()Ljava/math/BigDecimal;
    .registers 6

    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    const-string v1, "0"

    :goto_4
    if-ltz v0, :cond_2d

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    aget v3, v2, v0

    const/4 v4, -0x1

    if-ne v3, v4, :cond_e

    goto :goto_2d

    :cond_e
    aget v2, v2, v0

    const/16 v3, 0xa

    if-ne v2, v3, :cond_1b

    const-string v2, "."

    invoke-static {v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    goto :goto_26

    :cond_1b
    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    aget v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    :cond_2d
    :goto_2d
    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_38

    const-string v0, "-"

    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_38
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public getErrorView()Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;
    .registers 2

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->てぜきぽく:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    return-object v0
.end method

.method public getIsNegative()Z
    .registers 3

    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    goto :goto_7

    :cond_6
    const/4 v1, 0x0

    :goto_7
    return v1
.end method

.method public getLayoutId()I
    .registers 2

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぁごぐすすぃ;->number_picker_view:I

    return v0
.end method

.method public getNumber()Ljava/math/BigInteger;
    .registers 4

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->getEnteredNumber()Ljava/math/BigDecimal;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toBigIntegerExact()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .registers 8

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->てぜきぽく:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    .line 1
    iget-object v2, v1, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;->くし〴〺ぅ:Landroid/os/Handler;

    iget-object v3, v1, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->numbers_key:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eqz v1, :cond_25

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->げつ〴ぬぐ(I)V

    goto :goto_61

    :cond_25
    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-ne p1, v1, :cond_44

    iget p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    if-ltz p1, :cond_61

    const/4 p1, 0x0

    :goto_2e
    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    if-ge p1, v1, :cond_3c

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    add-int/lit8 v4, p1, 0x1

    aget v5, v1, v4

    aput v5, v1, p1

    move p1, v4

    goto :goto_2e

    :cond_3c
    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    aput v3, p1, v1

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    goto :goto_61

    :cond_44
    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ:Landroid/widget/Button;

    if-ne p1, v1, :cond_52

    .line 3
    iget p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    if-nez p1, :cond_4e

    const/4 p1, 0x1

    goto :goto_4f

    :cond_4e
    const/4 p1, 0x0

    :goto_4f
    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    goto :goto_61

    .line 4
    :cond_52
    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    if-ne p1, v1, :cond_61

    .line 5
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〺つふすそ()Z

    move-result p1

    if-eqz p1, :cond_61

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->げつ〴ぬぐ(I)V

    .line 6
    :cond_61
    :goto_61
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ()V

    .line 7
    iget p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    if-eq p1, v3, :cond_69

    goto :goto_6a

    :cond_69
    const/4 v0, 0x0

    :goto_6a
    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-eqz p1, :cond_71

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_71
    return-void
.end method

.method public onFinishInflate()V
    .registers 12

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->divider:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぇぬぎばつ:Landroid/view/View;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->error:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->てぜきぽく:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_17
    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    array-length v3, v2

    if-ge v1, v3, :cond_22

    const/4 v3, -0x1

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_17

    :cond_22
    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->first:I

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->second:I

    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->third:I

    invoke-virtual {p0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    sget v4, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->fourth:I

    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    sget v5, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->number_text:I

    invoke-virtual {p0, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/codetroopers/betterpickers/numberpicker/NumberView;

    iput-object v5, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/numberpicker/NumberView;

    sget v5, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->delete:I

    invoke-virtual {p0, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageButton;

    iput-object v5, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    invoke-virtual {v5, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v5, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    invoke-virtual {v5, p0}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v5, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    sget v6, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_left:I

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    const/4 v8, 0x1

    aput-object v7, v5, v8

    iget-object v5, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/4 v7, 0x2

    sget v9, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_middle:I

    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/Button;

    aput-object v10, v5, v7

    iget-object v5, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/4 v7, 0x3

    sget v10, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_right:I

    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    aput-object v1, v5, v7

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/4 v5, 0x4

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    aput-object v7, v1, v5

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/4 v5, 0x5

    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Button;

    aput-object v7, v1, v5

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/4 v5, 0x6

    invoke-virtual {v2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    aput-object v2, v1, v5

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/4 v2, 0x7

    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    aput-object v5, v1, v2

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/16 v2, 0x8

    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    aput-object v5, v1, v2

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/16 v2, 0x9

    invoke-virtual {v3, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    aput-object v3, v1, v2

    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ:Landroid/widget/Button;

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    aput-object v2, v1, v0

    invoke-virtual {v4, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    .line 1
    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ:Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〺つふすそ()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〺つふすそ()Z

    move-result v1

    if-nez v1, :cond_f5

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_f5
    const/4 v1, 0x0

    :goto_f6
    const/16 v2, 0xa

    if-ge v1, v2, :cond_127

    .line 2
    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v2, v2, v1

    invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v2, v2, v1

    new-array v3, v8, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    const-string v4, "%d"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v2, v2, v1

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->numbers_key:I

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v3, v4}, Landroid/widget/Button;->setTag(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_f6

    :cond_127
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ()V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->いいにぽつ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ:Landroid/widget/Button;

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->number_picker_plus_minus:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->number_picker_seperator:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ:Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->label:I

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺふねづ〺:Landroid/widget/TextView;

    iput v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    if-eqz v1, :cond_163

    .line 3
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->へぬ〴づぞ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_163
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ()V

    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .registers 6

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->てぜきぽく:Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;

    .line 1
    iget-object v2, v1, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;->くし〴〺ぅ:Landroid/os/Handler;

    iget-object v3, v1, Lcom/codetroopers/betterpickers/numberpicker/NumberPickerErrorTextView;->〺つふすそ:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-ne p1, v1, :cond_2e

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setPressed(Z)V

    .line 3
    :goto_18
    iget p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〺つふすそ:I

    const/4 v1, -0x1

    if-ge v0, p1, :cond_24

    iget-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    aput v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_18

    :cond_24
    iput v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ()V

    .line 4
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ()V

    const/4 p1, 0x1

    return p1

    :cond_2e
    return v0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->〺つふすそ:I

    iput v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    iget-object v0, p1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->くし〴〺ぅ:[I

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    if-nez v0, :cond_24

    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〺つふすそ:I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    const/4 v0, -0x1

    iput v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    :cond_24
    iget p1, p1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->びぐびあび:I

    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;

    invoke-direct {v1, v0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    iput-object v0, v1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->くし〴〺ぅ:[I

    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    iput v0, v1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->びぐびあび:I

    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    iput v0, v1, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker$SavedState;->〺つふすそ:I

    return-object v1
.end method

.method public setDecimalVisibility(I)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    :cond_7
    return-void
.end method

.method public setLabelText(Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->へぬ〴づぞ:Ljava/lang/String;

    .line 1
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺふねづ〺:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    return-void
.end method

.method public setMax(Ljava/math/BigDecimal;)V
    .registers 2

    return-void
.end method

.method public setMin(Ljava/math/BigDecimal;)V
    .registers 2

    return-void
.end method

.method public setNumber(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)V
    .registers 6

    if-eqz p3, :cond_7

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_8

    :cond_7
    const/4 p3, 0x0

    :goto_8
    iput p3, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    if-eqz p2, :cond_39

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    .line 1
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0.0"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->setMaximumFractionDigits(I)V

    invoke-virtual {v0, p2, p3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    .line 2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p2, p3, v0}, Landroid/text/TextUtils;->substring(Ljava/lang/CharSequence;II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ(Ljava/lang/String;)V

    iget p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    iget-object p3, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    const/16 v0, 0xa

    aput v0, p3, p2

    :cond_39
    if-eqz p1, :cond_42

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ(Ljava/lang/String;)V

    :cond_42
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ()V

    return-void
.end method

.method public setPlusMinusVisibility(I)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ:Landroid/widget/Button;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    :cond_7
    return-void
.end method

.method public setSetButton(Landroid/widget/Button;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->おぐぴう〸ず:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび()V

    return-void
.end method

.method public setTheme(I)V
    .registers 4

    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->でどあくず:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3f

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpTextColor:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpKeyBackground:I

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざとぅぼこ〺:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざとぅぼこ〺:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpButtonBackground:I

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->は〲ぱなで:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->は〲ぱなで:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpDividerColor:I

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ごづごきえ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ごづごきえ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpDeleteIcon:I

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざっざへづ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざっざへづ:I

    :cond_3f
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ()V

    return-void
.end method

.method public 〳ぜぞぜべっ()V
    .registers 9

    invoke-direct {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->getEnteredNumberString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const-string v4, "0"

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-lt v3, v7, :cond_46

    aget-object v0, v1, v5

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/numberpicker/NumberView;

    aget-object v1, v1, v6

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ()Z

    move-result v2

    iget v3, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    if-ne v3, v6, :cond_2f

    const/4 v5, 0x1

    :cond_2f
    invoke-virtual {v0, v4, v1, v2, v5}, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->setNumber(Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_6c

    :cond_33
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/numberpicker/NumberView;

    aget-object v2, v1, v5

    aget-object v1, v1, v6

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ()Z

    move-result v3

    iget v4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    if-ne v4, v6, :cond_42

    const/4 v5, 0x1

    :cond_42
    invoke-virtual {v0, v2, v1, v3, v5}, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->setNumber(Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_6c

    :cond_46
    array-length v3, v1

    if-ne v3, v6, :cond_5a

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/numberpicker/NumberView;

    aget-object v1, v1, v5

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ()Z

    move-result v3

    iget v4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    if-ne v4, v6, :cond_56

    const/4 v5, 0x1

    :cond_56
    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->setNumber(Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_6c

    :cond_5a
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6c

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/numberpicker/NumberView;

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->のぷのちつ:I

    if-ne v1, v6, :cond_69

    const/4 v5, 0x1

    :cond_69
    invoke-virtual {v0, v4, v2, v6, v5}, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->setNumber(Ljava/lang/String;Ljava/lang/String;ZZ)V

    :cond_6c
    :goto_6c
    return-void
.end method

.method public final 〺つふすそ()Z
    .registers 2

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ぁごぐすすぃ()V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〺つふすそ()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 2
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび()V

    .line 3
    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_16

    const/4 v0, 0x1

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    :goto_17
    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-eqz v1, :cond_1e

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_1e
    return-void
.end method

.method public final くし〴〺ぅ()Z
    .registers 7

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_5
    if-ge v2, v1, :cond_11

    aget v4, v0, v2

    const/16 v5, 0xa

    if-ne v4, v5, :cond_e

    const/4 v3, 0x1

    :cond_e
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_11
    return v3
.end method

.method public final げつ〴ぬぐ(I)V
    .registers 8

    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〺つふすそ:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_3b

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    const/4 v1, 0x0

    aget v3, v0, v1

    if-nez v3, :cond_23

    aget v0, v0, v2

    const/4 v3, -0x1

    if-ne v0, v3, :cond_23

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ()Z

    move-result v0

    if-nez v0, :cond_23

    const/16 v0, 0xa

    if-eq p1, v0, :cond_23

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    aput p1, v0, v1

    goto :goto_3b

    :cond_23
    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    :goto_25
    if-ltz v0, :cond_32

    iget-object v3, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    add-int/lit8 v4, v0, 0x1

    aget v5, v3, v0

    aput v5, v3, v4

    add-int/lit8 v0, v0, -0x1

    goto :goto_25

    :cond_32
    iget v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    aput p1, v0, v1

    :cond_3b
    :goto_3b
    return-void
.end method

.method public final づざかべべ(Ljava/lang/String;)V
    .registers 6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_6
    if-ltz v0, :cond_1b

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    iget-object v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->びぐびあび:[I

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v3, v3, -0x30

    aput v3, v2, v1

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_1b
    return-void
.end method

.method public final なぎぱいぢぎ()V
    .registers 6

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_17

    aget-object v3, v0, v2

    if-eqz v3, :cond_14

    iget-object v4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget v4, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざとぅぼこ〺:I

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_17
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぇぬぎばつ:Landroid/view/View;

    if-eqz v0, :cond_20

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ごづごきえ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_20
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ:Landroid/widget/Button;

    if-eqz v0, :cond_30

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->なぎぱいぢぎ:Landroid/widget/Button;

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざとぅぼこ〺:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_30
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    if-eqz v0, :cond_40

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざとぅぼこ〺:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_40
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_58

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->は〲ぱなで:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ざっざへづ:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_58
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/numberpicker/NumberView;

    if-eqz v0, :cond_61

    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->でどあくず:I

    invoke-virtual {v0, v1}, Lcom/codetroopers/betterpickers/numberpicker/NumberView;->setTheme(I)V

    :cond_61
    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぺふねづ〺:Landroid/widget/TextView;

    if-eqz v0, :cond_6a

    iget-object v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->ぉざぅち〻:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_6a
    return-void
.end method

.method public final びぐびあび()V
    .registers 5

    iget-object v0, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->おぐぴう〸ず:Landroid/widget/Button;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget v1, p0, Lcom/codetroopers/betterpickers/numberpicker/NumberPicker;->づざかべべ:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_f

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    return-void

    :cond_f
    if-ltz v1, :cond_12

    const/4 v3, 0x1

    :cond_12
    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method
