.class public Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;
.super Landroid/widget/LinearLayout;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/widget/Button;

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Landroid/widget/Button;

.field public final いいにぽつ:Landroid/content/Context;

.field public ぇぬぎばつ:Landroid/content/res/ColorStateList;

.field public ぉざぅち〻:I

.field public おぐぴう〸ず:Landroid/view/View;

.field public final くし〴〺ぅ:[Landroid/widget/Button;

.field public ごづごきえ:I

.field public ざっざへづ:I

.field public ざとぅぼこ〺:I

.field public づざかべべ:I

.field public てぜきぽく:Landroid/widget/TextView;

.field public でどあくず:I

.field public なぎぱいぢぎ:Landroid/widget/ImageButton;

.field public のぷのちつ:Landroid/widget/TextView;

.field public は〲ぱなで:I

.field public びぐびあび:[I

.field public へぬ〴づぞ:Landroid/widget/Button;

.field public ぺぁあねじ:Lcom/codetroopers/betterpickers/hmspicker/HmsView;

.field public ぺふねづ〺:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x5

    iput p2, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〺つふすそ:I

    const/16 v0, 0xa

    new-array v0, v0, [Landroid/widget/Button;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    new-array p2, p2, [I

    iput-object p2, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    const/4 p2, -0x1

    iput p2, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    iput p2, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ざっざへづ:I

    iput-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->いいにぽつ:Landroid/content/Context;

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->getLayoutId()I

    move-result p2

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぇぬぎばつ:Landroid/content/res/ColorStateList;

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->key_background_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぉざぅち〻:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->button_background_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ざとぅぼこ〺:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->default_divider_color_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->は〲ぱなで:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->ic_backspace_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ごづごきえ:I

    return-void
.end method


# virtual methods
.method public getHours()I
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    const/4 v1, 0x4

    aget v0, v0, v1

    return v0
.end method

.method public getLayoutId()I
    .registers 2

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぁごぐすすぃ;->hms_picker_view:I

    return v0
.end method

.method public getMinutes()I
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    const/4 v1, 0x3

    aget v1, v0, v1

    mul-int/lit8 v1, v1, 0xa

    const/4 v2, 0x2

    aget v0, v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public getSeconds()I
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

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

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

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
    .registers 9

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 1
    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->numbers_key:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_36

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 2
    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    iget v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〺つふすそ:I

    add-int/2addr v4, v2

    if-ge v1, v4, :cond_67

    if-ne v1, v2, :cond_1f

    if-eqz p1, :cond_67

    :cond_1f
    :goto_1f
    if-ltz v1, :cond_2c

    iget-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    add-int/lit8 v5, v1, 0x1

    aget v6, v4, v1

    aput v6, v4, v5

    add-int/lit8 v1, v1, -0x1

    goto :goto_1f

    :cond_2c
    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    aput p1, v1, v3

    goto :goto_67

    .line 3
    :cond_36
    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->なぎぱいぢぎ:Landroid/widget/ImageButton;

    if-ne p1, v1, :cond_55

    iget p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    if-ltz p1, :cond_67

    const/4 p1, 0x0

    :goto_3f
    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    if-ge p1, v1, :cond_4d

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    add-int/lit8 v4, p1, 0x1

    aget v5, v1, v4

    aput v5, v1, p1

    move p1, v4

    goto :goto_3f

    :cond_4d
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    aput v3, p1, v1

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    goto :goto_67

    :cond_55
    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    if-ne p1, v1, :cond_67

    .line 4
    iget p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->でどあくず:I

    if-ne p1, v0, :cond_5f

    const/4 p1, 0x1

    goto :goto_60

    :cond_5f
    const/4 p1, 0x0

    :goto_60
    if-eqz p1, :cond_65

    .line 5
    iput v3, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->でどあくず:I

    goto :goto_67

    :cond_65
    iput v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->でどあくず:I

    .line 6
    :cond_67
    :goto_67
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび()V

    .line 7
    iget p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    if-eq p1, v2, :cond_6f

    goto :goto_70

    :cond_6f
    const/4 v0, 0x0

    :goto_70
    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->なぎぱいぢぎ:Landroid/widget/ImageButton;

    if-eqz p1, :cond_77

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_77
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

    sget v4, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->hms_text:I

    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/codetroopers/betterpickers/hmspicker/HmsView;

    iput-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/hmspicker/HmsView;

    sget v4, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->delete:I

    invoke-virtual {p0, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageButton;

    iput-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->なぎぱいぢぎ:Landroid/widget/ImageButton;

    invoke-virtual {v4, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->なぎぱいぢぎ:Landroid/widget/ImageButton;

    invoke-virtual {v4, p0}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    sget v5, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_left:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    const/4 v7, 0x1

    aput-object v6, v4, v7

    iget-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    sget v6, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_middle:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/Button;

    const/4 v9, 0x2

    aput-object v8, v4, v9

    iget-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    sget v8, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->key_right:I

    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const/4 v9, 0x3

    aput-object v0, v4, v9

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    const/4 v9, 0x4

    aput-object v4, v0, v9

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    const/4 v9, 0x5

    aput-object v4, v0, v9

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/4 v4, 0x6

    aput-object v1, v0, v4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/4 v4, 0x7

    aput-object v1, v0, v4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/16 v4, 0x8

    aput-object v1, v0, v4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〳ぜぞぜべっ:Landroid/widget/Button;

    invoke-virtual {p0, v2}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->setRightEnabled(Z)V

    const/4 v0, 0x0

    :goto_c1
    const/16 v1, 0xa

    if-ge v0, v1, :cond_f2

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v1, v1, v0

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v1, v1, v0

    new-array v3, v7, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    const-string v4, "%d"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    aget-object v1, v1, v0

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->numbers_key:I

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1, v3, v4}, Landroid/widget/Button;->setTag(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_c1

    :cond_f2
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ()V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->いいにぽつ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->number_picker_plus_minus:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->hours_label:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぺふねづ〺:Landroid/widget/TextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->minutes_label:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->てぜきぽく:Landroid/widget/TextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->seconds_label:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->のぷのちつ:Landroid/widget/TextView;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->divider:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->おぐぴう〸ず:Landroid/view/View;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〺つふすそ()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび()V

    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .registers 4

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->なぎぱいぢぎ:Landroid/widget/ImageButton;

    if-ne p1, v1, :cond_22

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setPressed(Z)V

    const/4 p1, 0x0

    .line 1
    :goto_c
    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〺つふすそ:I

    if-ge p1, v1, :cond_17

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    aput v0, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_c

    :cond_17
    const/4 p1, -0x1

    iput p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ()V

    .line 2
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび()V

    const/4 p1, 0x1

    return p1

    :cond_22
    return v0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;->〺つふすそ:I

    iput v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    iget-object p1, p1, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;->くし〴〺ぅ:[I

    iput-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    if-nez p1, :cond_24

    iget p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〺つふすそ:I

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    const/4 p1, -0x1

    iput p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    :cond_24
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;

    invoke-direct {v1, v0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    iput-object v0, v1, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;->くし〴〺ぅ:[I

    iget v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    iput v0, v1, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker$SavedState;->〺つふすそ:I

    return-object v1
.end method

.method public setPlusMinusVisibility(I)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setVisibility(I)V

    :cond_7
    return-void
.end method

.method public setRightEnabled(Z)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〳ぜぞぜべっ:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    if-nez p1, :cond_d

    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〳ぜぞぜべっ:Landroid/widget/Button;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_d
    return-void
.end method

.method public setSetButton(Landroid/widget/Button;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->へぬ〴づぞ:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->げつ〴ぬぐ()V

    return-void
.end method

.method public setTheme(I)V
    .registers 4

    iput p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ざっざへづ:I

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

    iput-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぇぬぎばつ:Landroid/content/res/ColorStateList;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpKeyBackground:I

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぉざぅち〻:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぉざぅち〻:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpButtonBackground:I

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ざとぅぼこ〺:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ざとぅぼこ〺:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpDividerColor:I

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->は〲ぱなで:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->は〲ぱなで:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpDeleteIcon:I

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ごづごきえ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ごづごきえ:I

    :cond_3f
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->〺つふすそ()V

    return-void
.end method

.method public setTime(III)V
    .registers 7

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    const/4 v1, 0x4

    aput p1, v0, v1

    div-int/lit8 p1, p2, 0xa

    const/4 v2, 0x3

    aput p1, v0, v2

    rem-int/lit8 p2, p2, 0xa

    const/4 p1, 0x2

    aput p2, v0, p1

    div-int/lit8 p1, p3, 0xa

    const/4 p2, 0x1

    aput p1, v0, p2

    rem-int/lit8 p3, p3, 0xa

    const/4 p1, 0x0

    aput p3, v0, p1

    :goto_19
    if-ltz v1, :cond_27

    iget-object p1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    aget p1, p1, v1

    if-lez p1, :cond_24

    iput v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    goto :goto_27

    :cond_24
    add-int/lit8 v1, v1, -0x1

    goto :goto_19

    :cond_27
    :goto_27
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび()V

    return-void
.end method

.method public final 〺つふすそ()V
    .registers 6

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ:[Landroid/widget/Button;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_17

    aget-object v3, v0, v2

    if-eqz v3, :cond_14

    iget-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぇぬぎばつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぉざぅち〻:I

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_17
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->おぐぴう〸ず:Landroid/view/View;

    if-eqz v0, :cond_20

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->は〲ぱなで:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_20
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぺふねづ〺:Landroid/widget/TextView;

    if-eqz v0, :cond_30

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぇぬぎばつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぺふねづ〺:Landroid/widget/TextView;

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぉざぅち〻:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_30
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->てぜきぽく:Landroid/widget/TextView;

    if-eqz v0, :cond_40

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぇぬぎばつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->てぜきぽく:Landroid/widget/TextView;

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぉざぅち〻:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_40
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->のぷのちつ:Landroid/widget/TextView;

    if-eqz v0, :cond_50

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぇぬぎばつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->のぷのちつ:Landroid/widget/TextView;

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぉざぅち〻:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_50
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->なぎぱいぢぎ:Landroid/widget/ImageButton;

    if-eqz v0, :cond_68

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ざとぅぼこ〺:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->なぎぱいぢぎ:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ごづごきえ:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_68
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/hmspicker/HmsView;

    if-eqz v0, :cond_71

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ざっざへづ:I

    invoke-virtual {v0, v1}, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->setTheme(I)V

    :cond_71
    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    if-eqz v0, :cond_81

    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぇぬぎばつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぁごぐすすぃ:Landroid/widget/Button;

    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぉざぅち〻:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_81
    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 11

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->ぺぁあねじ:Lcom/codetroopers/betterpickers/hmspicker/HmsView;

    .line 1
    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->でどあくず:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_a

    const/4 v1, 0x1

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    .line 2
    :goto_b
    iget-object v4, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->びぐびあび:[I

    const/4 v5, 0x4

    aget v5, v4, v5

    const/4 v6, 0x3

    aget v6, v4, v6

    const/4 v7, 0x2

    aget v7, v4, v7

    aget v8, v4, v2

    aget v9, v4, v3

    move v2, v5

    move v3, v6

    move v4, v7

    move v5, v8

    move v6, v9

    invoke-virtual/range {v0 .. v6}, Lcom/codetroopers/betterpickers/hmspicker/HmsView;->setTime(ZIIIII)V

    return-void
.end method

.method public final げつ〴ぬぐ()V
    .registers 5

    iget-object v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->へぬ〴づぞ:Landroid/widget/Button;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

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

.method public final びぐびあび()V
    .registers 3

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->くし〴〺ぅ()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->げつ〴ぬぐ()V

    .line 1
    iget v0, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->づざかべべ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_d

    const/4 v0, 0x1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    iget-object v1, p0, Lcom/codetroopers/betterpickers/hmspicker/HmsPicker;->なぎぱいぢぎ:Landroid/widget/ImageButton;

    if-eqz v1, :cond_15

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_15
    return-void
.end method
