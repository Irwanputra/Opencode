.class public Lcom/codetroopers/betterpickers/datepicker/DatePicker;
.super Landroid/widget/LinearLayout;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;,
        Lcom/codetroopers/betterpickers/datepicker/DatePicker$〺つふすそ;
    }
.end annotation


# static fields
.field public static おかぷせ〱:I = -0x1

.field public static けときぜと:I = -0x1

.field public static ぷぞてのほき:I = -0x1


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:I

.field public 〻ぞまぎな〻:Landroid/widget/Button;

.field public ぁごぐすすぃ:I

.field public final いいにぽつ:[Landroid/widget/Button;

.field public ぅみぱぎぎ:I

.field public ぇ〳〲〺すっ:Landroid/view/View;

.field public ぇぬぎばつ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

.field public ぉ〲なぱぽた:Z

.field public ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

.field public ぉひのべい:I

.field public おぐぴう〸ず:Landroid/widget/ImageButton;

.field public くし〴〺ぅ:I

.field public ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

.field public ざっざへづ:[Ljava/lang/String;

.field public ざとぅぼこ〺:Lcom/codetroopers/betterpickers/datepicker/DatePicker$〺つふすそ;

.field public じぜこほぱ:I

.field public せづっ〸ちね:I

.field public づざかべべ:[I

.field public てぜきぽく:Landroid/widget/Button;

.field public final でどあくず:Landroid/content/Context;

.field public どぇぞほだ:I

.field public なぎぱいぢぎ:[I

.field public なぶひせが:I

.field public のぷのちつ:Landroid/widget/Button;

.field public は〲ぱなで:Landroid/widget/ImageButton;

.field public びえぁぜい:Landroid/content/res/ColorStateList;

.field public びぐびあび:I

.field public ぶでにく〼〳:[C

.field public へぬ〴づぞ:Landroid/widget/Button;

.field public final ぺぁあねじ:[Landroid/widget/Button;

.field public ぺづげぺが:I

.field public final ぺふねづ〺:[Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x2

    iput p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〺つふすそ:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->くし〴〺ぅ:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    new-array p2, p2, [I

    iput-object p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    new-array p2, v0, [I

    iput-object p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    iput v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    iput v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    const/16 p2, 0xc

    new-array p2, p2, [Landroid/widget/Button;

    iput-object p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺぁあねじ:[Landroid/widget/Button;

    const/16 p2, 0xa

    new-array v0, p2, [Landroid/widget/Button;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->いいにぽつ:[Landroid/widget/Button;

    new-array p2, p2, [Landroid/widget/Button;

    iput-object p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺふねづ〺:[Landroid/widget/Button;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉ〲なぱぽた:Z

    iput v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->せづっ〸ちね:I

    iput-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->でどあくず:Landroid/content/Context;

    invoke-static {p1}, Landroid/text/format/DateFormat;->getDateFormatOrder(Landroid/content/Context;)[C

    move-result-object p2

    iput-object p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぶでにく〼〳:[C

    invoke-static {}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〺つふすそ()[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ざっざへづ:[Ljava/lang/String;

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getLayoutId()I

    move-result p2

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びえぁぜい:Landroid/content/res/ColorStateList;

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->key_background_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->button_background_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->どぇぞほだ:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->default_divider_color_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぅみぱぎぎ:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->default_keyboard_indicator_color_dark:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->じぜこほぱ:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->ic_backspace_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉひのべい:I

    sget p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/づざかべべ;->ic_check_dark:I

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺづげぺが:I

    return-void
.end method

.method private setDateKeyRange(I)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->いいにぽつ:[Landroid/widget/Button;

    array-length v3, v2

    if-ge v1, v3, :cond_18

    aget-object v3, v2, v1

    if-eqz v3, :cond_15

    aget-object v2, v2, v1

    if-gt v1, p1, :cond_11

    const/4 v3, 0x1

    goto :goto_12

    :cond_11
    const/4 v3, 0x0

    :goto_12
    invoke-virtual {v2, v3}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_18
    return-void
.end method

.method private setDateMinKeyRange(I)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->いいにぽつ:[Landroid/widget/Button;

    array-length v3, v2

    if-ge v1, v3, :cond_18

    aget-object v3, v2, v1

    if-eqz v3, :cond_15

    aget-object v2, v2, v1

    if-lt v1, p1, :cond_11

    const/4 v3, 0x1

    goto :goto_12

    :cond_11
    const/4 v3, 0x0

    :goto_12
    invoke-virtual {v2, v3}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_18
    return-void
.end method

.method private setYearKeyRange(I)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺふねづ〺:[Landroid/widget/Button;

    array-length v3, v2

    if-ge v1, v3, :cond_18

    aget-object v3, v2, v1

    if-eqz v3, :cond_15

    aget-object v2, v2, v1

    if-gt v1, p1, :cond_11

    const/4 v3, 0x1

    goto :goto_12

    :cond_11
    const/4 v3, 0x0

    :goto_12
    invoke-virtual {v2, v3}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_18
    return-void
.end method

.method private setYearMinKeyRange(I)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺふねづ〺:[Landroid/widget/Button;

    array-length v3, v2

    if-ge v1, v3, :cond_18

    aget-object v3, v2, v1

    if-eqz v3, :cond_15

    aget-object v2, v2, v1

    if-lt v1, p1, :cond_11

    const/4 v3, 0x1

    goto :goto_12

    :cond_11
    const/4 v3, 0x0

    :goto_12
    invoke-virtual {v2, v3}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_18
    return-void
.end method

.method public static 〺つふすそ()[Ljava/lang/String;
    .registers 6

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_a

    const/4 v3, 0x1

    goto :goto_b

    :cond_a
    const/4 v3, 0x0

    :goto_b
    const-string v4, "MMM"

    .line 1
    new-instance v5, Ljava/text/SimpleDateFormat;

    if-eqz v3, :cond_15

    invoke-direct {v5, v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    goto :goto_18

    :cond_15
    invoke-direct {v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    :goto_18
    if-eqz v3, :cond_20

    new-instance v3, Ljava/util/GregorianCalendar;

    invoke-direct {v3, v0}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/Locale;)V

    goto :goto_25

    :cond_20
    new-instance v3, Ljava/util/GregorianCalendar;

    invoke-direct {v3}, Ljava/util/GregorianCalendar;-><init>()V

    :goto_25
    invoke-virtual {v3, v2, v1}, Ljava/util/Calendar;->set(II)V

    const/4 v0, 0x5

    invoke-virtual {v3, v0, v2}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xb

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xc

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xd

    invoke-virtual {v3, v2, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xe

    invoke-virtual {v3, v2, v1}, Ljava/util/Calendar;->set(II)V

    new-array v2, v0, [Ljava/lang/String;

    :goto_42
    if-ge v1, v0, :cond_59

    const/4 v4, 0x2

    invoke-virtual {v3, v4, v1}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_42

    :cond_59
    return-object v2
.end method


# virtual methods
.method public getDayOfMonth()I
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    const/4 v1, 0x1

    aget v1, v0, v1

    mul-int/lit8 v1, v1, 0xa

    const/4 v2, 0x0

    aget v0, v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public getLayoutId()I
    .registers 2

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぁごぐすすぃ;->date_picker_view:I

    return v0
.end method

.method public getMonthOfYear()I
    .registers 2

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    return v0
.end method

.method public getYear()I
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

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

.method public onClick(Landroid/view/View;)V
    .registers 9

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 1
    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->は〲ぱなで:Landroid/widget/ImageButton;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_7c

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぶでにく〼〳:[C

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    aget-char p1, p1, v1

    const/16 v1, 0x4d

    if-eq p1, v1, :cond_73

    const/16 v1, 0x64

    if-eq p1, v1, :cond_46

    const/16 v1, 0x79

    if-eq p1, v1, :cond_21

    goto/16 :goto_19b

    :cond_21
    iget p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    if-ltz p1, :cond_3d

    const/4 p1, 0x0

    :goto_26
    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    if-ge p1, v1, :cond_34

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    add-int/lit8 v3, p1, 0x1

    aget v4, v1, v3

    aput v4, v1, p1

    move p1, v3

    goto :goto_26

    :cond_34
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    aput v2, p1, v1

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    goto/16 :goto_19b

    :cond_3d
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    if-lez p1, :cond_19b

    goto :goto_6a

    :cond_46
    iget p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    if-ltz p1, :cond_62

    const/4 p1, 0x0

    :goto_4b
    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    if-ge p1, v1, :cond_59

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    add-int/lit8 v3, p1, 0x1

    aget v4, v1, v3

    aput v4, v1, p1

    move p1, v3

    goto :goto_4b

    :cond_59
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    aput v2, p1, v1

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    goto/16 :goto_19b

    :cond_62
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    if-lez p1, :cond_19b

    :goto_6a
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    sub-int/2addr v1, v0

    goto/16 :goto_eb

    :cond_73
    iget p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_19b

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    goto/16 :goto_19b

    :cond_7c
    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->おぐぴう〸ず:Landroid/widget/ImageButton;

    const/4 v3, 0x2

    if-ne p1, v1, :cond_95

    .line 2
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    if-ge p1, v3, :cond_19b

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    goto/16 :goto_19b

    .line 3
    :cond_95
    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

    invoke-virtual {v1}, Lcom/codetroopers/betterpickers/datepicker/DateView;->getDate()Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    move-result-object v1

    if-ne p1, v1, :cond_a2

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    sget v0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->けときぜと:I

    goto :goto_bb

    :cond_a2
    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

    invoke-virtual {v1}, Lcom/codetroopers/betterpickers/datepicker/DateView;->getMonth()Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    move-result-object v1

    if-ne p1, v1, :cond_af

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    sget v0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぷぞてのほき:I

    goto :goto_bb

    :cond_af
    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

    invoke-virtual {v1}, Lcom/codetroopers/betterpickers/datepicker/DateView;->getYear()Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;

    move-result-object v1

    if-ne p1, v1, :cond_c0

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    sget v0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->おかぷせ〱:I

    :goto_bb
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    goto/16 :goto_19b

    :cond_c0
    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->date_keyboard:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "month"

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f0

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->date_month_int:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    if-ge p1, v3, :cond_19b

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/2addr v1, v0

    :goto_eb
    invoke-virtual {p1, v1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    goto/16 :goto_19b

    :cond_f0
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "date"

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14c

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->numbers_key:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 4
    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    iget v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〺つふすそ:I

    sub-int/2addr v4, v0

    if-ge v1, v4, :cond_125

    :goto_10f
    if-ltz v1, :cond_11c

    iget-object v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    add-int/lit8 v5, v1, 0x1

    aget v6, v4, v1

    aput v6, v4, v5

    add-int/lit8 v1, v1, -0x1

    goto :goto_10f

    :cond_11c
    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    aput p1, v1, v2

    :cond_125
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getDayOfMonth()I

    move-result p1

    const/4 v1, 0x4

    if-ge p1, v1, :cond_139

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getMonthOfYear()I

    move-result p1

    if-ne p1, v0, :cond_19b

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getDayOfMonth()I

    move-result p1

    const/4 v1, 0x3

    if-lt p1, v1, :cond_19b

    :cond_139
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    if-ge p1, v3, :cond_19b

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    goto :goto_19b

    .line 5
    :cond_14c
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "year"

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19b

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->numbers_key:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 6
    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    iget v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->くし〴〺ぅ:I

    sub-int/2addr v4, v0

    if-ge v1, v4, :cond_181

    :goto_16b
    if-ltz v1, :cond_178

    iget-object v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    add-int/lit8 v5, v1, 0x1

    aget v6, v4, v1

    aput v6, v4, v5

    add-int/lit8 v1, v1, -0x1

    goto :goto_16b

    :cond_178
    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    aput p1, v1, v2

    :cond_181
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getYear()I

    move-result p1

    const/16 v1, 0x3e8

    if-lt p1, v1, :cond_19b

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    if-ge p1, v3, :cond_19b

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 7
    :cond_19b
    :goto_19b
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ()V

    .line 8
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ()V

    return-void
.end method

.method public onFinishInflate()V
    .registers 5

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->divider:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぇ〳〲〺すっ:Landroid/view/View;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_d
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    array-length v3, v2

    if-ge v1, v3, :cond_17

    aput v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_17
    const/4 v1, 0x0

    :goto_18
    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    array-length v3, v2

    if-ge v1, v3, :cond_22

    aput v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_22
    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->keyboard_indicator:I

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    iput-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぇぬぎばつ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->keyboard_pager:I

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/viewpager/widget/ViewPager;

    iput-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    new-instance v1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$〺つふすそ;

    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->でどあくず:Landroid/content/Context;

    const-string v3, "layout_inflater"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/LayoutInflater;

    invoke-direct {v1, p0, v2}, Lcom/codetroopers/betterpickers/datepicker/DatePicker$〺つふすそ;-><init>(Lcom/codetroopers/betterpickers/datepicker/DatePicker;Landroid/view/LayoutInflater;)V

    iput-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ざとぅぼこ〺:Lcom/codetroopers/betterpickers/datepicker/DatePicker$〺つふすそ;

    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぇぬぎばつ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    iget-object v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v2}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->date_text:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/codetroopers/betterpickers/datepicker/DateView;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->せづっ〸ちね:I

    invoke-virtual {v0, v1}, Lcom/codetroopers/betterpickers/datepicker/DateView;->setTheme(I)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぇぬぎばつ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    invoke-virtual {v0, v1}, Lcom/codetroopers/betterpickers/datepicker/DateView;->setUnderlinePage(Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

    invoke-virtual {v0, p0}, Lcom/codetroopers/betterpickers/datepicker/DateView;->setOnClick(Landroid/view/View$OnClickListener;)V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/なぎぱいぢぎ;->delete:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->は〲ぱなで:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->は〲ぱなで:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->くし〴〺ぅ()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ()V

    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .registers 4

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->は〲ぱなで:Landroid/widget/ImageButton;

    if-ne p1, v1, :cond_37

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setPressed(Z)V

    const/4 p1, 0x0

    .line 1
    :goto_c
    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〺つふすそ:I

    if-ge p1, v1, :cond_17

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    aput v0, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_c

    :cond_17
    const/4 p1, 0x0

    :goto_18
    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->くし〴〺ぅ:I

    if-ge p1, v1, :cond_23

    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    aput v0, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_18

    :cond_23
    const/4 p1, -0x1

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび()V

    .line 2
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ()V

    return v1

    :cond_37
    return v0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 5

    instance-of v0, p1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->〺つふすそ:I

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    iget v0, p1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->くし〴〺ぅ:I

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    iget-object v0, p1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->びぐびあび:[I

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    iget-object v1, p1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->づざかべべ:[I

    iput-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    const/4 v2, -0x1

    if-nez v0, :cond_2c

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〺つふすそ:I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    iput v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    :cond_2c
    if-nez v1, :cond_36

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->くし〴〺ぅ:I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    iput v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    :cond_36
    iget p1, p1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->なぎぱいぢぎ:I

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;

    invoke-direct {v1, v0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    iput v0, v1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->なぎぱいぢぎ:I

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    iput-object v0, v1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->びぐびあび:[I

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    iput v0, v1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->〺つふすそ:I

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    iput-object v0, v1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->づざかべべ:[I

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    iput v0, v1, Lcom/codetroopers/betterpickers/datepicker/DatePicker$SavedState;->くし〴〺ぅ:I

    return-object v1
.end method

.method public setDate(III)V
    .registers 12

    iput p2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ:[I

    div-int/lit16 v1, p1, 0x3e8

    const/4 v2, 0x3

    aput v1, v0, v2

    rem-int/lit16 v1, p1, 0x3e8

    const/16 v3, 0x64

    div-int/2addr v1, v3

    const/4 v4, 0x2

    aput v1, v0, v4

    rem-int/lit8 v1, p1, 0x64

    const/16 v5, 0xa

    div-int/2addr v1, v5

    const/4 v6, 0x1

    aput v1, v0, v6

    rem-int/lit8 v1, p1, 0xa

    const/4 v7, 0x0

    aput v1, v0, v7

    const/16 v0, 0x3e8

    if-lt p1, v0, :cond_25

    iput v2, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    goto :goto_33

    :cond_25
    if-lt p1, v3, :cond_2a

    iput v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    goto :goto_33

    :cond_2a
    if-lt p1, v5, :cond_2f

    iput v6, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    goto :goto_33

    :cond_2f
    if-lez p1, :cond_33

    iput v7, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    :cond_33
    :goto_33
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ:[I

    div-int/lit8 v1, p3, 0xa

    aput v1, v0, v6

    rem-int/lit8 v1, p3, 0xa

    aput v1, v0, v7

    if-lt p3, v5, :cond_42

    iput v6, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    goto :goto_46

    :cond_42
    if-lez p3, :cond_46

    iput v7, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    :cond_46
    :goto_46
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぶでにく〼〳:[C

    array-length v1, v0

    if-ge v7, v1, :cond_69

    aget-char v0, v0, v7

    const/16 v1, 0x4d

    if-ne v0, v1, :cond_5a

    const/4 v1, -0x1

    if-ne p2, v1, :cond_5a

    :goto_54
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉざぅち〻:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v7, v6}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    goto :goto_69

    :cond_5a
    if-ne v0, v3, :cond_5f

    if-gtz p3, :cond_5f

    goto :goto_54

    :cond_5f
    const/16 v1, 0x79

    if-ne v0, v1, :cond_66

    if-gtz p1, :cond_66

    goto :goto_54

    :cond_66
    add-int/lit8 v7, v7, 0x1

    goto :goto_46

    :cond_69
    :goto_69
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぎぱいぢぎ()V

    return-void
.end method

.method public setSetButton(Landroid/widget/Button;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〻ぞまぎな〻:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->げつ〴ぬぐ()V

    return-void
.end method

.method public setTheme(I)V
    .registers 7

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->せづっ〸ちね:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_53

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpTextColor:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びえぁぜい:Landroid/content/res/ColorStateList;

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpKeyBackground:I

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpButtonBackground:I

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->どぇぞほだ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->どぇぞほだ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpCheckIcon:I

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺづげぺが:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺづげぺが:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpTitleDividerColor:I

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぅみぱぎぎ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぅみぱぎぎ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpKeyboardIndicatorColor:I

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->じぜこほぱ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->じぜこほぱ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpDeleteIcon:I

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉひのべい:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉひのべい:I

    .line 1
    :cond_53
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺぁあねじ:[Landroid/widget/Button;

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_58
    if-ge v2, v0, :cond_6b

    aget-object v3, p1, v2

    if-eqz v3, :cond_68

    iget-object v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びえぁぜい:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_68
    add-int/lit8 v2, v2, 0x1

    goto :goto_58

    :cond_6b
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->いいにぽつ:[Landroid/widget/Button;

    array-length v0, p1

    const/4 v2, 0x0

    :goto_6f
    if-ge v2, v0, :cond_82

    aget-object v3, p1, v2

    if-eqz v3, :cond_7f

    iget-object v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びえぁぜい:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_7f
    add-int/lit8 v2, v2, 0x1

    goto :goto_6f

    :cond_82
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺふねづ〺:[Landroid/widget/Button;

    array-length v0, p1

    :goto_85
    if-ge v1, v0, :cond_98

    aget-object v2, p1, v1

    if-eqz v2, :cond_95

    iget-object v3, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びえぁぜい:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget v3, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_95
    add-int/lit8 v1, v1, 0x1

    goto :goto_85

    :cond_98
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぇぬぎばつ:Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;

    if-eqz p1, :cond_a1

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->じぜこほぱ:I

    invoke-virtual {p1, v0}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->setSelectedColor(I)V

    :cond_a1
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぇ〳〲〺すっ:Landroid/view/View;

    if-eqz p1, :cond_aa

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぅみぱぎぎ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_aa
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->てぜきぽく:Landroid/widget/Button;

    if-eqz p1, :cond_ba

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びえぁぜい:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->てぜきぽく:Landroid/widget/Button;

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_ba
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->おぐぴう〸ず:Landroid/widget/ImageButton;

    if-eqz p1, :cond_d2

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->おぐぴう〸ず:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺづげぺが:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_d2
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->は〲ぱなで:Landroid/widget/ImageButton;

    if-eqz p1, :cond_ea

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->どぇぞほだ:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->は〲ぱなで:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉひのべい:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_ea
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->のぷのちつ:Landroid/widget/Button;

    if-eqz p1, :cond_fa

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びえぁぜい:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->のぷのちつ:Landroid/widget/Button;

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_fa
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->へぬ〴づぞ:Landroid/widget/Button;

    if-eqz p1, :cond_10a

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びえぁぜい:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->へぬ〴づぞ:Landroid/widget/Button;

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->なぶひせが:I

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_10a
    iget-object p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

    if-eqz p1, :cond_113

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->せづっ〸ちね:I

    invoke-virtual {p1, v0}, Lcom/codetroopers/betterpickers/datepicker/DateView;->setTheme(I)V

    :cond_113
    return-void
.end method

.method public setYearOptional(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉ〲なぱぽた:Z

    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->てぜきぽく:Landroid/widget/Button;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_8
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->おぐぴう〸ず:Landroid/widget/ImageButton;

    if-eqz v0, :cond_18

    .line 1
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getDayOfMonth()I

    move-result v2

    if-lez v2, :cond_14

    const/4 v2, 0x1

    goto :goto_15

    :cond_14
    const/4 v2, 0x0

    .line 2
    :goto_15
    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_18
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->のぷのちつ:Landroid/widget/Button;

    if-eqz v0, :cond_1f

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_1f
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->へぬ〴づぞ:Landroid/widget/Button;

    if-eqz v0, :cond_26

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_26
    return-void
.end method

.method public final げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〻ぞまぎな〻:Landroid/widget/Button;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getDayOfMonth()I

    move-result v1

    if-lez v1, :cond_1d

    iget-boolean v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぉ〲なぱぽた:Z

    if-nez v1, :cond_15

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getYear()I

    move-result v1

    if-lez v1, :cond_1d

    :cond_15
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getMonthOfYear()I

    move-result v1

    if-ltz v1, :cond_1d

    const/4 v1, 0x1

    goto :goto_1e

    :cond_1d
    const/4 v1, 0x0

    :goto_1e
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public づざかべべ()V
    .registers 3

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_10

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぁごぐすすぃ:I

    if-ne v0, v1, :cond_10

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->〳ぜぞぜべっ:I

    if-eq v0, v1, :cond_e

    goto :goto_10

    :cond_e
    const/4 v0, 0x0

    goto :goto_11

    :cond_10
    :goto_10
    const/4 v0, 0x1

    :goto_11
    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->は〲ぱなで:Landroid/widget/ImageButton;

    if-eqz v1, :cond_18

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    :cond_18
    return-void
.end method

.method public final なぎぱいぢぎ()V
    .registers 11

    .line 1
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->おぐぴう〸ず:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_12

    .line 2
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getDayOfMonth()I

    move-result v3

    if-lez v3, :cond_e

    const/4 v3, 0x1

    goto :goto_f

    :cond_e
    const/4 v3, 0x0

    .line 3
    :goto_f
    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 4
    :cond_12
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->げつ〴ぬぐ()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->づざかべべ()V

    .line 5
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getDayOfMonth()I

    move-result v0

    const/4 v3, 0x0

    :goto_20
    iget-object v4, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺぁあねじ:[Landroid/widget/Button;

    array-length v5, v4

    if-ge v3, v5, :cond_31

    aget-object v5, v4, v3

    if-eqz v5, :cond_2e

    aget-object v4, v4, v3

    invoke-virtual {v4, v2}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_2e
    add-int/lit8 v3, v3, 0x1

    goto :goto_20

    :cond_31
    const/16 v3, 0x1d

    if-le v0, v3, :cond_3e

    aget-object v3, v4, v2

    if-eqz v3, :cond_3e

    aget-object v3, v4, v2

    invoke-virtual {v3, v1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_3e
    const/16 v3, 0x1e

    const/16 v4, 0xa

    const/16 v5, 0x8

    const/4 v6, 0x5

    const/4 v7, 0x3

    if-le v0, v3, :cond_74

    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺぁあねじ:[Landroid/widget/Button;

    aget-object v3, v0, v7

    if-eqz v3, :cond_53

    aget-object v0, v0, v7

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_53
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺぁあねじ:[Landroid/widget/Button;

    aget-object v3, v0, v6

    if-eqz v3, :cond_5e

    aget-object v0, v0, v6

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_5e
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺぁあねじ:[Landroid/widget/Button;

    aget-object v3, v0, v5

    if-eqz v3, :cond_69

    aget-object v0, v0, v5

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_69
    iget-object v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ぺぁあねじ:[Landroid/widget/Button;

    aget-object v3, v0, v4

    if-eqz v3, :cond_74

    aget-object v0, v0, v4

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 6
    :cond_74
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getDayOfMonth()I

    move-result v0

    const/4 v3, 0x4

    const/16 v8, 0x9

    const/4 v9, -0x1

    if-lt v0, v3, :cond_7f

    goto :goto_85

    :cond_7f
    if-lt v0, v7, :cond_9a

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    if-ne v0, v2, :cond_89

    :goto_85
    invoke-direct {p0, v9}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->setDateKeyRange(I)V

    goto :goto_a7

    :cond_89
    if-eq v0, v7, :cond_96

    if-eq v0, v6, :cond_96

    if-eq v0, v5, :cond_96

    if-ne v0, v4, :cond_92

    goto :goto_96

    :cond_92
    invoke-direct {p0, v2}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->setDateKeyRange(I)V

    goto :goto_a7

    :cond_96
    :goto_96
    invoke-direct {p0, v1}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->setDateKeyRange(I)V

    goto :goto_a7

    :cond_9a
    const/4 v1, 0x2

    if-lt v0, v1, :cond_9e

    goto :goto_a0

    :cond_9e
    if-lt v0, v2, :cond_a4

    :goto_a0
    invoke-direct {p0, v8}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->setDateKeyRange(I)V

    goto :goto_a7

    :cond_a4
    invoke-direct {p0, v2}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->setDateMinKeyRange(I)V

    .line 7
    :goto_a7
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getYear()I

    move-result v0

    const/16 v1, 0x3e8

    if-lt v0, v1, :cond_b1

    const/4 v8, -0x1

    goto :goto_b3

    :cond_b1
    if-lt v0, v2, :cond_b7

    :goto_b3
    invoke-direct {p0, v8}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->setYearKeyRange(I)V

    goto :goto_ba

    :cond_b7
    invoke-direct {p0, v2}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->setYearMinKeyRange(I)V

    :goto_ba
    return-void
.end method

.method public びぐびあび()V
    .registers 5

    iget v0, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->びぐびあび:I

    if-gez v0, :cond_7

    const-string v0, ""

    goto :goto_b

    :cond_7
    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ざっざへづ:[Ljava/lang/String;

    aget-object v0, v1, v0

    :goto_b
    iget-object v1, p0, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->ごづごきえ:Lcom/codetroopers/betterpickers/datepicker/DateView;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getDayOfMonth()I

    move-result v2

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/datepicker/DatePicker;->getYear()I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/codetroopers/betterpickers/datepicker/DateView;->setDate(Ljava/lang/String;II)V

    return-void
.end method
