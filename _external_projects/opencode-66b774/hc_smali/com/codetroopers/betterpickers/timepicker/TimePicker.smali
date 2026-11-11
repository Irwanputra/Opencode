.class public Lcom/codetroopers/betterpickers/timepicker/TimePicker;
.super Landroid/widget/LinearLayout;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/widget/ImageButton;

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Landroid/widget/Button;

.field public final いいにぽつ:Landroid/content/Context;

.field public ぇぬぎばつ:Z

.field public ぉざぅち〻:Landroid/view/View;

.field public おぐぴう〸ず:Landroid/widget/Button;

.field public final くし〴〺ぅ:[Landroid/widget/Button;

.field public ごづごきえ:I

.field public ざっざへづ:I

.field public ざとぅぼこ〺:Landroid/content/res/ColorStateList;

.field public づざかべべ:I

.field public てぜきぽく:[Ljava/lang/String;

.field public でどあくず:I

.field public なぎぱいぢぎ:Landroid/widget/Button;

.field public final のぷのちつ:Ljava/lang/String;

.field public は〲ぱなで:I

.field public びぐびあび:[I

.field public ぶでにく〼〳:I

.field public へぬ〴づぞ:I

.field public ぺぁあねじ:Lcom/codetroopers/betterpickers/timepicker/TimerView;

.field public ぺふねづ〺:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x4

    iput p2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ:I

    const/16 v0, 0xa

    new-array v0, v0, [Landroid/widget/Button;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    new-array p2, p2, [I

    iput-object p2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    const/4 p2, -0x1

    iput p2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    iput p2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぶでにく〼〳:I

    iput-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->いいにぽつ:Landroid/content/Context;

    .line 1
    invoke-static {p1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p2

    .line 2
    iput-boolean p2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->getLayoutId()I

    move-result v0

    invoke-virtual {p2, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->time_picker_ampm_label:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->のぷのちつ:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざとぅぼこ〺:Landroid/content/res/ColorStateList;

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->key_background_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->は〲ぱなで:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->button_background_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ごづごきえ:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->default_divider_color_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざっざへづ:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->ic_backspace_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->でどあくず:I

    return-void
.end method

.method private getEnteredTime()I
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    const/4 v1, 0x3

    aget v1, v0, v1

    mul-int/lit16 v1, v1, 0x3e8

    const/4 v2, 0x2

    aget v2, v0, v2

    mul-int/lit8 v2, v2, 0x64

    add-int/2addr v2, v1

    const/4 v1, 0x1

    aget v1, v0, v1

    mul-int/lit8 v1, v1, 0xa

    add-int/2addr v1, v2

    const/4 v2, 0x0

    aget v0, v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method private setKeyRange(I)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget-object v2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    array-length v3, v2

    if-ge v1, v3, :cond_14

    aget-object v2, v2, v1

    if-gt v1, p1, :cond_d

    const/4 v3, 0x1

    goto :goto_e

    :cond_d
    const/4 v3, 0x0

    :goto_e
    invoke-virtual {v2, v3}, Landroid/widget/Button;->setEnabled(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_14
    return-void
.end method


# virtual methods
.method public getHours()I
    .registers 8

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    const/4 v1, 0x3

    aget v2, v0, v1

    mul-int/lit8 v2, v2, 0xa

    const/4 v3, 0x2

    aget v0, v0, v3

    add-int/2addr v2, v0

    const/4 v0, 0x0

    const/4 v4, 0x1

    const/16 v5, 0xc

    if-ne v2, v5, :cond_1d

    iget v6, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    if-eq v6, v4, :cond_1c

    if-eq v6, v3, :cond_1b

    if-eq v6, v1, :cond_1a

    goto :goto_1d

    :cond_1a
    return v2

    :cond_1b
    return v0

    :cond_1c
    return v5

    :cond_1d
    :goto_1d
    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    if-ne v1, v4, :cond_23

    const/16 v0, 0xc

    :cond_23
    add-int/2addr v2, v0

    return v2
.end method

.method public getLayoutId()I
    .registers 2

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぁごぐすすぃ;->time_picker_view:I

    return v0
.end method

.method public getMinutes()I
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    const/4 v1, 0x1

    aget v1, v0, v1

    mul-int/lit8 v1, v1, 0xa

    const/4 v2, 0x0

    aget v0, v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public getTime()I
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    const/4 v1, 0x4

    aget v1, v0, v1

    mul-int/lit16 v1, v1, 0xe10

    const/4 v2, 0x3

    aget v2, v0, v2

    mul-int/lit16 v2, v2, 0x258

    add-int/2addr v2, v1

    const/4 v1, 0x2

    aget v1, v0, v1

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v0, v2

    mul-int/lit8 v2, v2, 0xa

    add-int/2addr v2, v1

    const/4 v1, 0x0

    aget v0, v0, v1

    add-int/2addr v2, v0

    return v2
.end method

.method public onClick(Landroid/view/View;)V
    .registers 7

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 1
    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->numbers_key:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, 0x0

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    goto/16 :goto_92

    :cond_18
    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-ne p1, v1, :cond_43

    iget-boolean p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    if-nez p1, :cond_28

    iget p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    if-eqz p1, :cond_28

    iput v2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    goto/16 :goto_92

    :cond_28
    iget p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    if-ltz p1, :cond_92

    const/4 p1, 0x0

    :goto_2d
    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    if-ge p1, v1, :cond_3b

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    add-int/lit8 v3, p1, 0x1

    aget v4, v1, v3

    aput v4, v1, p1

    move p1, v3

    goto :goto_2d

    :cond_3b
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    aput v2, p1, v1

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    goto :goto_92

    :cond_43
    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    if-ne p1, v1, :cond_6b

    .line 2
    invoke-direct {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->getEnteredTime()I

    iget-boolean p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    if-nez p1, :cond_5e

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ()Z

    move-result p1

    if-eqz p1, :cond_5a

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    :cond_5a
    const/4 p1, 0x2

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    goto :goto_92

    :cond_5e
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ()Z

    move-result p1

    if-eqz p1, :cond_92

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    goto :goto_92

    .line 3
    :cond_6b
    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    if-ne p1, v1, :cond_92

    .line 4
    invoke-direct {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->getEnteredTime()I

    iget-boolean p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    if-nez p1, :cond_85

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ()Z

    move-result p1

    if-eqz p1, :cond_82

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    :cond_82
    iput v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    goto :goto_92

    :cond_85
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ()Z

    move-result p1

    if-eqz p1, :cond_92

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->げつ〴ぬぐ(I)V

    .line 5
    :cond_92
    :goto_92
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ()V

    .line 6
    iget p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_9b

    goto :goto_9c

    :cond_9b
    const/4 v0, 0x0

    :goto_9c
    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-eqz p1, :cond_a3

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_a3
    return-void
.end method

.method public onFinishInflate()V
    .registers 11

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->first:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->second:I

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->third:I

    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->fourth:I

    invoke-virtual {p0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    sget v4, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->timer_time_text:I

    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/codetroopers/betterpickers/timepicker/TimerView;

    iput-object v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/timepicker/TimerView;

    sget v4, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->delete:I

    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageButton;

    iput-object v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    invoke-virtual {v4, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    invoke-virtual {v4, p0}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    sget v5, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_left:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    const/4 v7, 0x1

    aput-object v6, v4, v7

    iget-object v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    sget v6, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_middle:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/Button;

    const/4 v9, 0x2

    aput-object v8, v4, v9

    iget-object v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    sget v8, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_right:I

    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const/4 v9, 0x3

    aput-object v0, v4, v9

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    const/4 v9, 0x4

    aput-object v4, v0, v9

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    const/4 v9, 0x5

    aput-object v4, v0, v9

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/4 v4, 0x6

    aput-object v1, v0, v4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/4 v4, 0x7

    aput-object v1, v0, v4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/16 v4, 0x8

    aput-object v1, v0, v4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->setLeftRightEnabled(Z)V

    const/4 v0, 0x0

    :goto_c1
    const/16 v1, 0xa

    if-ge v0, v1, :cond_f2

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v1, v1, v0

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v1, v1, v0

    new-array v3, v7, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    const-string v4, "%d"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v1, v1, v0

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->numbers_key:I

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1, v3, v4}, Landroid/widget/Button;->setTag(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_c1

    :cond_f2
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ()V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->いいにぽつ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Ljava/text/DateFormatSymbols;

    invoke-direct {v1}, Ljava/text/DateFormatSymbols;-><init>()V

    invoke-virtual {v1}, Ljava/text/DateFormatSymbols;->getAmPmStrings()[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->てぜきぽく:[Ljava/lang/String;

    iget-boolean v3, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    if-eqz v3, :cond_121

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->time_picker_00_label:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->time_picker_30_label:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_131

    :cond_121
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->てぜきぽく:[Ljava/lang/String;

    aget-object v1, v1, v7

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :goto_131
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->ampm_label:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺふねづ〺:Landroid/widget/TextView;

    iput v2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->divider:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぉざぅち〻:Landroid/view/View;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ()V

    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .registers 4

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-ne p1, v1, :cond_24

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setPressed(Z)V

    iput v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    const/4 p1, 0x0

    .line 1
    :goto_e
    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ:I

    if-ge p1, v1, :cond_19

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    aput v0, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_e

    :cond_19
    const/4 p1, -0x1

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ()V

    .line 2
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ()V

    const/4 p1, 0x1

    return p1

    :cond_24
    return v0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;->〺つふすそ:I

    iput v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    iget-object v0, p1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;->くし〴〺ぅ:[I

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    if-nez v0, :cond_24

    iget v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ:I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    const/4 v0, -0x1

    iput v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    :cond_24
    iget p1, p1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;->びぐびあび:I

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;

    invoke-direct {v1, v0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    iput-object v0, v1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;->くし〴〺ぅ:[I

    iget v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    iput v0, v1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;->びぐびあび:I

    iget v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    iput v0, v1, Lcom/codetroopers/betterpickers/timepicker/TimePicker$SavedState;->〺つふすそ:I

    return-object v1
.end method

.method public setLeftRightEnabled(Z)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    if-nez p1, :cond_17

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_17
    return-void
.end method

.method public setSetButton(Landroid/widget/Button;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->おぐぴう〸ず:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ()V

    return-void
.end method

.method public setTheme(I)V
    .registers 4

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぶでにく〼〳:I

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

    iput-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざとぅぼこ〺:Landroid/content/res/ColorStateList;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpKeyBackground:I

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->は〲ぱなで:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->は〲ぱなで:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpButtonBackground:I

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ごづごきえ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ごづごきえ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpDividerColor:I

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざっざへづ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざっざへづ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpDeleteIcon:I

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->でどあくず:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->でどあくず:I

    :cond_3f
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび()V

    return-void
.end method

.method public final 〺つふすそ()Z
    .registers 5

    invoke-direct {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->getEnteredTime()I

    move-result v0

    iget-boolean v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_12

    if-lt v0, v3, :cond_11

    const/16 v1, 0xc

    if-gt v0, v1, :cond_11

    const/4 v2, 0x1

    :cond_11
    return v2

    :cond_12
    if-ltz v0, :cond_21

    const/16 v1, 0x17

    if-gt v0, v1, :cond_21

    iget v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_21

    const/4 v1, 0x2

    if-ge v0, v1, :cond_21

    const/4 v2, 0x1

    :cond_21
    return v2
.end method

.method public final くし〴〺ぅ()V
    .registers 7

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->おぐぴう〸ず:Landroid/widget/Button;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_f

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    return-void

    :cond_f
    iget-boolean v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_2c

    invoke-direct {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->getEnteredTime()I

    move-result v0

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->おぐぴう〸ず:Landroid/widget/Button;

    iget v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    const/4 v5, 0x2

    if-lt v4, v5, :cond_28

    const/16 v4, 0x3c

    if-lt v0, v4, :cond_27

    const/16 v4, 0x5f

    if-le v0, v4, :cond_28

    :cond_27
    const/4 v3, 0x1

    :cond_28
    invoke-virtual {v1, v3}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_34

    :cond_2c
    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    if-eqz v1, :cond_31

    const/4 v3, 0x1

    :cond_31
    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    :goto_34
    return-void
.end method

.method public final げつ〴ぬぐ(I)V
    .registers 6

    iget v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ:I

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_20

    :goto_8
    if-ltz v0, :cond_15

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    add-int/lit8 v2, v0, 0x1

    aget v3, v1, v0

    aput v3, v1, v2

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_15
    iget v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    :cond_20
    return-void
.end method

.method public final づざかべべ()V
    .registers 17

    move-object/from16 v0, p0

    .line 1
    iget-boolean v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x3

    if-nez v1, :cond_29

    iget v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    if-eqz v1, :cond_21

    if-eq v1, v2, :cond_1a

    if-eq v1, v4, :cond_13

    goto :goto_31

    :cond_13
    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺふねづ〺:Landroid/widget/TextView;

    iget-object v6, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->てぜきぽく:[Ljava/lang/String;

    aget-object v6, v6, v3

    goto :goto_25

    :cond_1a
    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺふねづ〺:Landroid/widget/TextView;

    iget-object v6, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->てぜきぽく:[Ljava/lang/String;

    aget-object v6, v6, v2

    goto :goto_25

    :cond_21
    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺふねづ〺:Landroid/widget/TextView;

    iget-object v6, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->のぷのちつ:Ljava/lang/String;

    :goto_25
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_31

    :cond_29
    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺふねづ〺:Landroid/widget/TextView;

    const/4 v6, 0x4

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    iput v5, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    .line 2
    :goto_31
    invoke-direct/range {p0 .. p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->getEnteredTime()I

    move-result v1

    iget-boolean v6, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    const/16 v7, 0x64

    if-eqz v6, :cond_4a

    invoke-virtual/range {p0 .. p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〺つふすそ()Z

    move-result v1

    iget-object v6, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    invoke-virtual {v6, v1}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v6, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {v6, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_66

    :cond_4a
    const/16 v6, 0xc

    if-le v1, v6, :cond_50

    if-lt v1, v7, :cond_5b

    :cond_50
    if-eqz v1, :cond_5b

    iget v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    if-eqz v1, :cond_57

    goto :goto_5b

    :cond_57
    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    const/4 v6, 0x1

    goto :goto_5e

    :cond_5b
    :goto_5b
    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    const/4 v6, 0x0

    :goto_5e
    invoke-virtual {v1, v6}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {v1, v6}, Landroid/widget/Button;->setEnabled(Z)V

    .line 3
    :goto_66
    invoke-virtual/range {p0 .. p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ()V

    .line 4
    invoke-direct/range {p0 .. p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->getEnteredTime()I

    move-result v1

    iget-boolean v6, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    const/16 v9, 0x6d

    const/16 v10, 0x6e

    const/16 v11, 0x69

    const/16 v12, 0x6a

    const/16 v13, 0x5f

    const/4 v14, 0x5

    const/16 v15, 0x9

    const/4 v3, -0x1

    const/16 v8, 0x74

    if-eqz v6, :cond_241

    iget v6, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    if-lt v6, v5, :cond_87

    goto/16 :goto_245

    :cond_87
    if-nez v1, :cond_94

    if-eq v6, v3, :cond_238

    if-eqz v6, :cond_238

    if-ne v6, v4, :cond_91

    goto/16 :goto_238

    :cond_91
    if-ne v6, v2, :cond_245

    goto :goto_c7

    :cond_94
    if-ne v1, v2, :cond_9f

    if-eqz v6, :cond_238

    if-ne v6, v4, :cond_9c

    goto/16 :goto_238

    :cond_9c
    if-ne v6, v2, :cond_245

    goto :goto_c7

    :cond_9f
    if-ne v1, v4, :cond_ae

    if-eq v6, v4, :cond_238

    if-ne v6, v2, :cond_a7

    goto/16 :goto_238

    :cond_a7
    if-nez v6, :cond_245

    invoke-direct {v0, v5}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->setKeyRange(I)V

    goto/16 :goto_23f

    :cond_ae
    if-gt v1, v14, :cond_b2

    goto/16 :goto_238

    :cond_b2
    if-gt v1, v15, :cond_b5

    goto :goto_c7

    :cond_b5
    const/16 v4, 0xa

    if-lt v1, v4, :cond_bf

    const/16 v4, 0xf

    if-gt v1, v4, :cond_bf

    goto/16 :goto_238

    :cond_bf
    const/16 v4, 0x10

    if-lt v1, v4, :cond_ca

    const/16 v4, 0x13

    if-gt v1, v4, :cond_ca

    :goto_c7
    const/4 v4, 0x0

    goto/16 :goto_258

    :cond_ca
    const/16 v4, 0x14

    if-lt v1, v4, :cond_d4

    const/16 v4, 0x19

    if-gt v1, v4, :cond_d4

    goto/16 :goto_238

    :cond_d4
    const/16 v4, 0x1a

    if-lt v1, v4, :cond_de

    const/16 v4, 0x1d

    if-gt v1, v4, :cond_de

    goto/16 :goto_245

    :cond_de
    const/16 v4, 0x1e

    if-lt v1, v4, :cond_e8

    const/16 v4, 0x23

    if-gt v1, v4, :cond_e8

    goto/16 :goto_238

    :cond_e8
    const/16 v4, 0x24

    if-lt v1, v4, :cond_f2

    const/16 v4, 0x27

    if-gt v1, v4, :cond_f2

    goto/16 :goto_245

    :cond_f2
    const/16 v4, 0x28

    if-lt v1, v4, :cond_fc

    const/16 v4, 0x2d

    if-gt v1, v4, :cond_fc

    goto/16 :goto_238

    :cond_fc
    const/16 v4, 0x2e

    if-lt v1, v4, :cond_106

    const/16 v4, 0x31

    if-gt v1, v4, :cond_106

    goto/16 :goto_245

    :cond_106
    const/16 v4, 0x32

    if-lt v1, v4, :cond_110

    const/16 v4, 0x37

    if-gt v1, v4, :cond_110

    goto/16 :goto_238

    :cond_110
    const/16 v4, 0x38

    if-lt v1, v4, :cond_11a

    const/16 v4, 0x3b

    if-gt v1, v4, :cond_11a

    goto/16 :goto_245

    :cond_11a
    const/16 v4, 0x3c

    if-lt v1, v4, :cond_124

    const/16 v4, 0x41

    if-gt v1, v4, :cond_124

    goto/16 :goto_238

    :cond_124
    const/16 v4, 0x46

    if-lt v1, v4, :cond_12e

    const/16 v4, 0x4b

    if-gt v1, v4, :cond_12e

    goto/16 :goto_238

    :cond_12e
    const/16 v4, 0x50

    if-lt v1, v4, :cond_138

    const/16 v4, 0x55

    if-gt v1, v4, :cond_138

    goto/16 :goto_238

    :cond_138
    const/16 v4, 0x5a

    if-lt v1, v4, :cond_140

    if-gt v1, v13, :cond_140

    goto/16 :goto_238

    :cond_140
    if-lt v1, v7, :cond_146

    if-gt v1, v11, :cond_146

    goto/16 :goto_238

    :cond_146
    if-lt v1, v12, :cond_14c

    if-gt v1, v9, :cond_14c

    goto/16 :goto_245

    :cond_14c
    if-lt v1, v10, :cond_154

    const/16 v4, 0x73

    if-gt v1, v4, :cond_154

    goto/16 :goto_238

    :cond_154
    if-lt v1, v8, :cond_15c

    const/16 v4, 0x77

    if-gt v1, v4, :cond_15c

    goto/16 :goto_245

    :cond_15c
    const/16 v4, 0x78

    if-lt v1, v4, :cond_166

    const/16 v4, 0x7d

    if-gt v1, v4, :cond_166

    goto/16 :goto_238

    :cond_166
    const/16 v4, 0x7e

    if-lt v1, v4, :cond_170

    const/16 v4, 0x81

    if-gt v1, v4, :cond_170

    goto/16 :goto_245

    :cond_170
    const/16 v4, 0x82

    if-lt v1, v4, :cond_17a

    const/16 v4, 0x87

    if-gt v1, v4, :cond_17a

    goto/16 :goto_238

    :cond_17a
    const/16 v4, 0x88

    if-lt v1, v4, :cond_184

    const/16 v4, 0x8b

    if-gt v1, v4, :cond_184

    goto/16 :goto_245

    :cond_184
    const/16 v4, 0x8c

    if-lt v1, v4, :cond_18e

    const/16 v4, 0x91

    if-gt v1, v4, :cond_18e

    goto/16 :goto_238

    :cond_18e
    const/16 v4, 0x92

    if-lt v1, v4, :cond_198

    const/16 v4, 0x95

    if-gt v1, v4, :cond_198

    goto/16 :goto_245

    :cond_198
    const/16 v4, 0x96

    if-lt v1, v4, :cond_1a2

    const/16 v4, 0x9b

    if-gt v1, v4, :cond_1a2

    goto/16 :goto_238

    :cond_1a2
    const/16 v4, 0x9c

    if-lt v1, v4, :cond_1ac

    const/16 v4, 0x9f

    if-gt v1, v4, :cond_1ac

    goto/16 :goto_245

    :cond_1ac
    const/16 v4, 0xa0

    if-lt v1, v4, :cond_1b6

    const/16 v4, 0xa5

    if-gt v1, v4, :cond_1b6

    goto/16 :goto_238

    :cond_1b6
    const/16 v4, 0xa6

    if-lt v1, v4, :cond_1c0

    const/16 v4, 0xa9

    if-gt v1, v4, :cond_1c0

    goto/16 :goto_245

    :cond_1c0
    const/16 v4, 0xaa

    if-lt v1, v4, :cond_1ca

    const/16 v4, 0xaf

    if-gt v1, v4, :cond_1ca

    goto/16 :goto_238

    :cond_1ca
    const/16 v4, 0xb0

    if-lt v1, v4, :cond_1d4

    const/16 v4, 0xb3

    if-gt v1, v4, :cond_1d4

    goto/16 :goto_245

    :cond_1d4
    const/16 v4, 0xb4

    if-lt v1, v4, :cond_1de

    const/16 v4, 0xb9

    if-gt v1, v4, :cond_1de

    goto/16 :goto_238

    :cond_1de
    const/16 v4, 0xba

    if-lt v1, v4, :cond_1e8

    const/16 v4, 0xbd

    if-gt v1, v4, :cond_1e8

    goto/16 :goto_245

    :cond_1e8
    const/16 v4, 0xbe

    if-lt v1, v4, :cond_1f1

    const/16 v4, 0xc3

    if-gt v1, v4, :cond_1f1

    goto :goto_238

    :cond_1f1
    const/16 v4, 0xc4

    if-lt v1, v4, :cond_1fa

    const/16 v4, 0xc7

    if-gt v1, v4, :cond_1fa

    goto :goto_245

    :cond_1fa
    const/16 v4, 0xc8

    if-lt v1, v4, :cond_203

    const/16 v4, 0xcd

    if-gt v1, v4, :cond_203

    goto :goto_238

    :cond_203
    const/16 v4, 0xce

    if-lt v1, v4, :cond_20c

    const/16 v4, 0xd1

    if-gt v1, v4, :cond_20c

    goto :goto_245

    :cond_20c
    const/16 v4, 0xd2

    if-lt v1, v4, :cond_215

    const/16 v4, 0xd7

    if-gt v1, v4, :cond_215

    goto :goto_238

    :cond_215
    const/16 v4, 0xd8

    if-lt v1, v4, :cond_21e

    const/16 v4, 0xdb

    if-gt v1, v4, :cond_21e

    goto :goto_245

    :cond_21e
    const/16 v4, 0xdc

    if-lt v1, v4, :cond_227

    const/16 v4, 0xe1

    if-gt v1, v4, :cond_227

    goto :goto_238

    :cond_227
    const/16 v4, 0xe2

    if-lt v1, v4, :cond_230

    const/16 v4, 0xe5

    if-gt v1, v4, :cond_230

    goto :goto_245

    :cond_230
    const/16 v4, 0xe6

    if-lt v1, v4, :cond_23a

    const/16 v4, 0xeb

    if-gt v1, v4, :cond_23a

    :cond_238
    :goto_238
    const/4 v4, 0x0

    goto :goto_27f

    :cond_23a
    const/16 v4, 0xec

    if-lt v1, v4, :cond_23f

    goto :goto_245

    :cond_23f
    :goto_23f
    const/4 v4, 0x0

    goto :goto_28a

    :cond_241
    iget v4, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->へぬ〴づぞ:I

    if-eqz v4, :cond_247

    :cond_245
    :goto_245
    const/4 v4, 0x0

    goto :goto_287

    :cond_247
    if-nez v1, :cond_255

    invoke-direct {v0, v15}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->setKeyRange(I)V

    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    const/4 v4, 0x0

    aget-object v1, v1, v4

    invoke-virtual {v1, v4}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_28a

    :cond_255
    const/4 v4, 0x0

    if-gt v1, v15, :cond_25c

    :goto_258
    invoke-direct {v0, v14}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->setKeyRange(I)V

    goto :goto_28a

    :cond_25c
    if-gt v1, v13, :cond_25f

    goto :goto_27f

    :cond_25f
    if-lt v1, v7, :cond_264

    if-gt v1, v11, :cond_264

    goto :goto_27f

    :cond_264
    if-lt v1, v12, :cond_269

    if-gt v1, v9, :cond_269

    goto :goto_287

    :cond_269
    if-lt v1, v10, :cond_270

    const/16 v5, 0x73

    if-gt v1, v5, :cond_270

    goto :goto_27f

    :cond_270
    if-lt v1, v8, :cond_277

    const/16 v5, 0x77

    if-gt v1, v5, :cond_277

    goto :goto_287

    :cond_277
    const/16 v5, 0x78

    if-lt v1, v5, :cond_283

    const/16 v5, 0x7d

    if-gt v1, v5, :cond_283

    :goto_27f
    invoke-direct {v0, v15}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->setKeyRange(I)V

    goto :goto_28a

    :cond_283
    const/16 v5, 0x7e

    if-lt v1, v5, :cond_28a

    :goto_287
    invoke-direct {v0, v3}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->setKeyRange(I)V

    .line 5
    :cond_28a
    :goto_28a
    invoke-virtual/range {p0 .. p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ()V

    .line 6
    iget v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    if-eq v1, v3, :cond_292

    goto :goto_293

    :cond_292
    const/4 v2, 0x0

    :goto_293
    iget-object v1, v0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-eqz v1, :cond_29a

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_29a
    return-void
.end method

.method public なぎぱいぢぎ()V
    .registers 10

    invoke-direct {p0}, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->getEnteredTime()I

    iget v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->づざかべべ:I

    const/4 v1, 0x2

    const/4 v2, -0x1

    if-le v0, v2, :cond_54

    const/4 v3, -0x2

    const/4 v4, 0x3

    if-ltz v0, :cond_23

    iget-object v5, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    aget v5, v5, v0

    iget-boolean v6, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    const/16 v7, 0x9

    if-eqz v6, :cond_1b

    if-lt v5, v4, :cond_1b

    if-le v5, v7, :cond_21

    :cond_1b
    if-nez v6, :cond_23

    if-lt v5, v1, :cond_23

    if-gt v5, v7, :cond_23

    :cond_21
    const/4 v5, -0x2

    goto :goto_24

    :cond_23
    const/4 v5, -0x1

    :goto_24
    if-lez v0, :cond_4c

    if-ge v0, v4, :cond_4c

    if-eq v5, v3, :cond_4c

    iget-object v6, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    aget v7, v6, v0

    mul-int/lit8 v7, v7, 0xa

    add-int/lit8 v8, v0, -0x1

    aget v6, v6, v8

    add-int/2addr v7, v6

    iget-boolean v6, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぇぬぎばつ:Z

    if-eqz v6, :cond_41

    const/16 v8, 0x18

    if-lt v7, v8, :cond_41

    const/16 v8, 0x19

    if-le v7, v8, :cond_4d

    :cond_41
    if-nez v6, :cond_4c

    const/16 v6, 0xd

    if-lt v7, v6, :cond_4c

    const/16 v6, 0xf

    if-gt v7, v6, :cond_4c

    goto :goto_4d

    :cond_4c
    move v3, v5

    :cond_4d
    :goto_4d
    if-ne v0, v4, :cond_55

    iget-object v3, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    aget v3, v3, v4

    goto :goto_55

    :cond_54
    const/4 v3, -0x1

    :cond_55
    :goto_55
    if-ge v0, v1, :cond_59

    const/4 v1, -0x1

    goto :goto_5d

    :cond_59
    iget-object v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    aget v1, v4, v1

    :goto_5d
    const/4 v4, 0x1

    if-ge v0, v4, :cond_62

    const/4 v4, -0x1

    goto :goto_66

    :cond_62
    iget-object v5, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    aget v4, v5, v4

    :goto_66
    if-gez v0, :cond_69

    goto :goto_6e

    :cond_69
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->びぐびあび:[I

    const/4 v2, 0x0

    aget v2, v0, v2

    :goto_6e
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/timepicker/TimerView;

    invoke-virtual {v0, v3, v1, v4, v2}, Lcom/codetroopers/betterpickers/timepicker/TimerView;->setTime(IIII)V

    return-void
.end method

.method public final びぐびあび()V
    .registers 6

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->くし〴〺ぅ:[Landroid/widget/Button;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_17

    aget-object v3, v0, v2

    if-eqz v3, :cond_14

    iget-object v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざとぅぼこ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget v4, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->は〲ぱなで:I

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_17
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぉざぅち〻:Landroid/view/View;

    if-eqz v0, :cond_20

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざっざへづ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_20
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    if-eqz v0, :cond_30

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざとぅぼこ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->なぎぱいぢぎ:Landroid/widget/Button;

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->は〲ぱなで:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_30
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺふねづ〺:Landroid/widget/TextView;

    if-eqz v0, :cond_40

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざとぅぼこ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺふねづ〺:Landroid/widget/TextView;

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->は〲ぱなで:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_40
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    if-eqz v0, :cond_50

    iget-object v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ざとぅぼこ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぁごぐすすぃ:Landroid/widget/Button;

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->は〲ぱなで:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_50
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_68

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ごづごきえ:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->〳ぜぞぜべっ:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->でどあくず:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_68
    iget-object v0, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/timepicker/TimerView;

    if-eqz v0, :cond_71

    iget v1, p0, Lcom/codetroopers/betterpickers/timepicker/TimePicker;->ぶでにく〼〳:I

    invoke-virtual {v0, v1}, Lcom/codetroopers/betterpickers/timepicker/TimerView;->setTheme(I)V

    :cond_71
    return-void
.end method
