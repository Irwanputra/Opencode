.class public Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;
.super Landroid/widget/FrameLayout;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:I

.field public final 〺つふすそ:I

.field public 〻ぞまぎな〻:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

.field public ぇぬぎばつ:[I

.field public ぉ〲なぱぽた:Landroid/os/Handler;

.field public ぉざぅち〻:Z

.field public おぐぴう〸ず:Landroid/view/View;

.field public final くし〴〺ぅ:I

.field public ごづごきえ:I

.field public ざっざへづ:F

.field public ざとぅぼこ〺:I

.field public づざかべべ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;

.field public てぜきぽく:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

.field public でどあくず:F

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

.field public は〲ぱなで:Z

.field public びぐびあび:I

.field public ぶでにく〼〳:Landroid/view/accessibility/AccessibilityManager;

.field public へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

.field public ぺぁあねじ:Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;

.field public ぺふねづ〺:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, -0x1

    iput p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざとぅぼこ〺:I

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぉ〲なぱぽた:Landroid/os/Handler;

    invoke-virtual {p0, p0}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〺つふすそ:I

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->くし〴〺ぅ:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->は〲ぱなで:Z

    new-instance v1, Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;

    invoke-direct {v1, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぺぁあねじ:Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance v1, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-direct {v1, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance v1, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-direct {v1, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぺふねづ〺:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance v1, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-direct {v1, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->てぜきぽく:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance v1, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-direct {v1, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance v1, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-direct {v1, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    const/16 v1, 0x169

    new-array v2, v1, [I

    .line 1
    iput-object v2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぇぬぎばつ:[I

    const/16 v2, 0x8

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/16 v4, 0x8

    const/4 v5, 0x1

    :goto_6c
    const/4 v6, 0x4

    if-ge v0, v1, :cond_8b

    iget-object v7, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぇぬぎばつ:[I

    aput v2, v7, v0

    if-ne v5, v4, :cond_86

    add-int/lit8 v2, v2, 0x6

    const/16 v4, 0x168

    if-ne v2, v4, :cond_7d

    const/4 v6, 0x7

    goto :goto_83

    :cond_7d
    rem-int/lit8 v4, v2, 0x1e

    if-nez v4, :cond_83

    const/16 v6, 0xe

    :cond_83
    :goto_83
    move v4, v6

    const/4 v5, 0x1

    goto :goto_88

    :cond_86
    add-int/lit8 v5, v5, 0x1

    :goto_88
    add-int/lit8 v0, v0, 0x1

    goto :goto_6c

    .line 2
    :cond_8b
    iput p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->びぐびあび:I

    iput-boolean v3, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぉざぅち〻:Z

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->おぐぴう〸ず:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->おぐぴう〸ず:Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpTransparent_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->おぐぴう〸ず:Landroid/view/View;

    invoke-virtual {p2, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->おぐぴう〸ず:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    const-string p2, "accessibility"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    iput-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぶでにく〼〳:Landroid/view/accessibility/AccessibilityManager;

    return-void
.end method

.method private getCurrentlyShowingValue()I
    .registers 3

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->getCurrentItemShowing()I

    move-result v0

    if-nez v0, :cond_9

    iget v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->なぎぱいぢぎ:I

    return v0

    :cond_9
    const/4 v1, 0x1

    if-ne v0, v1, :cond_f

    iget v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぁごぐすすぃ:I

    return v0

    :cond_f
    const/4 v0, -0x1

    return v0
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 6

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_35

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    new-instance v0, Landroid/text/format/Time;

    invoke-direct {v0}, Landroid/text/format/Time;-><init>()V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->getHours()I

    move-result v1

    iput v1, v0, Landroid/text/format/Time;->hour:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->getMinutes()I

    move-result v1

    iput v1, v0, Landroid/text/format/Time;->minute:I

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/format/Time;->normalize(Z)J

    move-result-wide v2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2, v3, v1}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v1

    :cond_35
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public getCurrentItemShowing()I
    .registers 3

    iget v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〳ぜぞぜべっ:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/4 v0, -0x1

    :cond_8
    return v0
.end method

.method public getHours()I
    .registers 2

    iget v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->なぎぱいぢぎ:I

    return v0
.end method

.method public getIsCurrentlyAmOrPm()I
    .registers 3

    iget v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->なぎぱいぢぎ:I

    const/16 v1, 0xc

    if-ge v0, v1, :cond_8

    const/4 v0, 0x0

    return v0

    :cond_8
    const/16 v1, 0x18

    if-ge v0, v1, :cond_e

    const/4 v0, 0x1

    return v0

    :cond_e
    const/4 v0, -0x1

    return v0
.end method

.method public getMinutes()I
    .registers 2

    iget v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぁごぐすすぃ:I

    return v0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/16 v0, 0x1000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    return-void
.end method

.method public onMeasure(II)V
    .registers 5

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 12

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    const/4 v3, -0x1

    if-eqz p2, :cond_c4

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eq p2, v1, :cond_76

    if-eq p2, v5, :cond_1f

    goto/16 :goto_c3

    :cond_1f
    iget-boolean p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぉざぅち〻:Z

    if-nez p2, :cond_24

    return v1

    :cond_24
    iget p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->でどあくず:F

    sub-float p2, v0, p2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget v5, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざっざへづ:F

    sub-float v5, p1, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    iget-boolean v7, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->は〲ぱなで:Z

    if-nez v7, :cond_46

    iget v7, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〺つふすそ:I

    int-to-float v8, v7

    cmpg-float v5, v5, v8

    if-gtz v5, :cond_46

    int-to-float v5, v7

    cmpg-float p2, p2, v5

    if-gtz p2, :cond_46

    goto/16 :goto_c3

    :cond_46
    iget p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざとぅぼこ〺:I

    if-eqz p2, :cond_5d

    if-ne p2, v1, :cond_4d

    goto :goto_5d

    :cond_4d
    iget p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ごづごきえ:I

    if-ne p2, v3, :cond_52

    goto :goto_c3

    :cond_52
    iput-boolean v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->は〲ぱなで:Z

    iget-object p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぉ〲なぱぽた:Landroid/os/Handler;

    invoke-virtual {p2, v6}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->げつ〴ぬぐ(FFZ[Ljava/lang/Boolean;)I

    return v1

    :cond_5d
    :goto_5d
    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぉ〲なぱぽた:Landroid/os/Handler;

    invoke-virtual {p1, v6}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざとぅぼこ〺:I

    if-eq v3, p1, :cond_c3

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p1, v3}, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->setAmOrPmPressed(I)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    goto :goto_c1

    :cond_76
    iget-boolean p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぉざぅち〻:Z

    if-nez p2, :cond_81

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->づざかべべ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;

    const/4 p2, 0x3

    invoke-interface {p1, p2, v1, v4}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;->げつ〴ぬぐ(IIZ)V

    return v1

    :cond_81
    iget-object p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぉ〲なぱぽた:Landroid/os/Handler;

    invoke-virtual {p2, v6}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざとぅぼこ〺:I

    if-eqz p2, :cond_99

    if-ne p2, v1, :cond_8d

    goto :goto_99

    :cond_8d
    iget p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ごづごきえ:I

    if-eq p2, v3, :cond_96

    iget-boolean p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->は〲ぱなで:Z

    invoke-virtual {p0, p1, v0, p2, v2}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->げつ〴ぬぐ(FFZ[Ljava/lang/Boolean;)I

    :cond_96
    iput-boolean v4, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->は〲ぱなで:Z

    return v1

    :cond_99
    :goto_99
    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p1, v3}, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->setAmOrPmPressed(I)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    iget p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざとぅぼこ〺:I

    if-ne v3, p1, :cond_c1

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p1, v3}, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->setAmOrPm(I)V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->getIsCurrentlyAmOrPm()I

    move-result p1

    if-eq p1, v3, :cond_c1

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->づざかべべ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;

    iget p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざとぅぼこ〺:I

    invoke-interface {p1, v5, p2, v4}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;->げつ〴ぬぐ(IIZ)V

    invoke-virtual {p0, v5, v3}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->くし〴〺ぅ(II)V

    :cond_c1
    :goto_c1
    iput v3, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざとぅぼこ〺:I

    :cond_c3
    :goto_c3
    return v4

    :cond_c4
    iget-boolean p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぉざぅち〻:Z

    if-nez p2, :cond_c9

    return v1

    :cond_c9
    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざっざへづ:F

    iput v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->でどあくず:F

    iput v3, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->びぐびあび:I

    iput-boolean v4, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->は〲ぱなで:Z

    iget-object p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v3, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ざとぅぼこ〺:I

    iget-object p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぶでにく〼〳:Landroid/view/accessibility/AccessibilityManager;

    .line 1
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p2

    .line 2
    invoke-virtual {p0, p1, v0, p2, v2}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->げつ〴ぬぐ(FFZ[Ljava/lang/Boolean;)I

    iput v3, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ごづごきえ:I

    return v1
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .registers 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_8

    return v0

    :cond_8
    const/16 p2, 0x1000

    const/4 v1, 0x0

    if-ne p1, p2, :cond_f

    const/4 p1, 0x1

    goto :goto_16

    :cond_f
    const/16 p2, 0x2000

    if-ne p1, p2, :cond_15

    const/4 p1, -0x1

    goto :goto_16

    :cond_15
    const/4 p1, 0x0

    :goto_16
    if-eqz p1, :cond_4c

    invoke-direct {p0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->getCurrentlyShowingValue()I

    move-result p2

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->getCurrentItemShowing()I

    move-result v2

    if-nez v2, :cond_27

    const/16 v3, 0x1e

    rem-int/lit8 p2, p2, 0xc

    goto :goto_2c

    :cond_27
    if-ne v2, v0, :cond_2b

    const/4 v3, 0x6

    goto :goto_2c

    :cond_2b
    const/4 v3, 0x0

    :goto_2c
    mul-int p2, p2, v3

    invoke-virtual {p0, p2, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->びぐびあび(II)I

    move-result p1

    div-int/2addr p1, v3

    if-nez v2, :cond_39

    const/16 p2, 0xc

    const/4 v3, 0x1

    goto :goto_3c

    :cond_39
    const/16 p2, 0x37

    const/4 v3, 0x0

    :goto_3c
    if-le p1, p2, :cond_40

    move p1, v3

    goto :goto_43

    :cond_40
    if-ge p1, v3, :cond_43

    move p1, p2

    :cond_43
    :goto_43
    invoke-virtual {p0, v2, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〺つふすそ(II)V

    iget-object p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->づざかべべ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;

    invoke-interface {p2, v2, p1, v1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;->げつ〴ぬぐ(IIZ)V

    return v0

    :cond_4c
    return v1
.end method

.method public setAmOrPm(I)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->setAmOrPm(I)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->くし〴〺ぅ(II)V

    return-void
.end method

.method public setCurrentItemShowing(IZ)V
    .registers 9

    const/4 v0, 0x1

    if-eqz p1, :cond_6

    if-eq p1, v0, :cond_6

    return-void

    :cond_6
    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->getCurrentItemShowing()I

    move-result v1

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〳ぜぞぜべっ:I

    const/4 v2, 0x0

    if-eqz p2, :cond_b6

    if-eq p1, v1, :cond_b6

    const/4 p2, 0x4

    new-array v1, p2, [Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-ne p1, v0, :cond_39

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぺふねづ〺:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;->getDisappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    move-result-object p1

    aput-object p1, v1, v2

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->getDisappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    move-result-object p1

    aput-object p1, v1, v0

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->てぜきぽく:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;->getReappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    move-result-object p1

    aput-object p1, v1, v4

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->getReappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    move-result-object p1

    aput-object p1, v1, v3

    goto :goto_5b

    :cond_39
    if-nez p1, :cond_5b

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぺふねづ〺:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;->getReappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    move-result-object p1

    aput-object p1, v1, v2

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->getReappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    move-result-object p1

    aput-object p1, v1, v0

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->てぜきぽく:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;->getDisappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    move-result-object p1

    aput-object p1, v1, v4

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->getDisappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;

    move-result-object p1

    aput-object p1, v1, v3

    :cond_5b
    :goto_5b
    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〻ぞまぎな〻:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

    if-eqz p1, :cond_6a

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;->びぐびあび()Z

    move-result p1

    if-eqz p1, :cond_6a

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〻ぞまぎな〻:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ()V

    :cond_6a
    new-instance p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;-><init>()V

    iput-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〻ぞまぎな〻:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

    .line 1
    iput-boolean v0, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:Z

    aget-object v3, v1, v2

    if-eqz v3, :cond_7f

    .line 2
    iput-boolean v0, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:Z

    new-instance v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    invoke-direct {v4, p1, v3}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;-><init>(Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;)V

    goto :goto_80

    :cond_7f
    const/4 v4, 0x0

    :goto_80
    if-ge v0, p2, :cond_b0

    .line 3
    aget-object p1, v1, v0

    .line 4
    iget-object v3, v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

    .line 5
    iget-object v3, v3, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Ljava/util/HashMap;

    .line 6
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$づざかべべ;

    if-nez v3, :cond_a3

    new-instance v3, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$づざかべべ;

    invoke-direct {v3, p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$づざかべべ;-><init>(Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;)V

    iget-object v5, v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

    .line 7
    iget-object v5, v5, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Ljava/util/HashMap;

    .line 8
    invoke-virtual {v5, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

    .line 9
    iget-object p1, p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Ljava/util/ArrayList;

    .line 10
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a3
    new-instance p1, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-object v5, v4, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$づざかべべ;

    invoke-direct {p1, v5, v2}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;-><init>(Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$づざかべべ;I)V

    invoke-virtual {v3, p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$づざかべべ;->げつ〴ぬぐ(Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_80

    .line 11
    :cond_b0
    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〻ぞまぎな〻:Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ()V

    goto :goto_d8

    :cond_b6
    const/16 p2, 0xff

    if-nez p1, :cond_bd

    const/16 v1, 0xff

    goto :goto_be

    :cond_bd
    const/4 v1, 0x0

    :goto_be
    if-ne p1, v0, :cond_c2

    const/16 v2, 0xff

    :cond_c2
    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぺふねづ〺:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    int-to-float p2, v1

    invoke-static {p1, p2}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/view/View;F)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-static {p1, p2}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/view/View;F)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->てぜきぽく:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    int-to-float p2, v2

    invoke-static {p1, p2}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/view/View;F)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-static {p1, p2}, Lなぎぱいぢぎ/ぁごぐすすぃ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/view/View;F)V

    :goto_d8
    return-void
.end method

.method public setOnValueSelectedListener(Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->づざかべべ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout$げつ〴ぬぐ;

    return-void
.end method

.method public setTheme(Landroid/content/res/TypedArray;)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぺぁあねじ:Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;

    invoke-virtual {v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;->setTheme(Landroid/content/res/TypedArray;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->いいにぽつ:Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;

    invoke-virtual {v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->setTheme(Landroid/content/res/TypedArray;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぺふねづ〺:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-virtual {v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;->setTheme(Landroid/content/res/TypedArray;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->てぜきぽく:Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;

    invoke-virtual {v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialTextsView;->setTheme(Landroid/content/res/TypedArray;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->setTheme(Landroid/content/res/TypedArray;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->setTheme(Landroid/content/res/TypedArray;)V

    return-void
.end method

.method public setTime(II)V
    .registers 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〺つふすそ(II)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->〺つふすそ(II)V

    return-void
.end method

.method public final 〺つふすそ(II)V
    .registers 5

    const/4 v0, 0x0

    if-nez p1, :cond_15

    invoke-virtual {p0, v0, p2}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->くし〴〺ぅ(II)V

    rem-int/lit8 p2, p2, 0xc

    mul-int/lit8 p2, p2, 0x1e

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {p1, p2, v0, v0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->setSelection(IZZ)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    :goto_11
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    goto :goto_25

    :cond_15
    const/4 v1, 0x1

    if-ne p1, v1, :cond_25

    invoke-virtual {p0, v1, p2}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->くし〴〺ぅ(II)V

    mul-int/lit8 p2, p2, 0x6

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    invoke-virtual {p1, p2, v0, v0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->setSelection(IZZ)V

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    goto :goto_11

    :cond_25
    :goto_25
    return-void
.end method

.method public final くし〴〺ぅ(II)V
    .registers 5

    if-nez p1, :cond_5

    iput p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->なぎぱいぢぎ:I

    goto :goto_20

    :cond_5
    const/4 v0, 0x1

    if-ne p1, v0, :cond_b

    iput p2, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->ぁごぐすすぃ:I

    goto :goto_20

    :cond_b
    const/4 v1, 0x2

    if-ne p1, v1, :cond_20

    if-nez p2, :cond_17

    iget p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->なぎぱいぢぎ:I

    rem-int/lit8 p1, p1, 0xc

    :goto_14
    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->なぎぱいぢぎ:I

    goto :goto_20

    :cond_17
    if-ne p2, v0, :cond_20

    iget p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->なぎぱいぢぎ:I

    rem-int/lit8 p1, p1, 0xc

    add-int/lit8 p1, p1, 0xc

    goto :goto_14

    :cond_20
    :goto_20
    return-void
.end method

.method public final げつ〴ぬぐ(FFZ[Ljava/lang/Boolean;)I
    .registers 5

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->getCurrentItemShowing()I

    move-result p1

    const/4 p2, -0x1

    if-nez p1, :cond_d

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->のぷのちつ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    :goto_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return p2

    :cond_d
    const/4 p3, 0x1

    if-ne p1, p3, :cond_13

    iget-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialPickerLayout;->へぬ〴づぞ:Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;

    goto :goto_9

    :cond_13
    return p2
.end method

.method public final びぐびあび(II)I
    .registers 6

    div-int/lit8 v0, p1, 0x1e

    mul-int/lit8 v0, v0, 0x1e

    add-int/lit8 v1, v0, 0x1e

    const/4 v2, 0x1

    if-ne p2, v2, :cond_a

    goto :goto_19

    :cond_a
    const/4 v2, -0x1

    if-ne p2, v2, :cond_12

    if-ne p1, v0, :cond_1a

    add-int/lit8 v0, v0, -0x1e

    goto :goto_1a

    :cond_12
    sub-int p2, p1, v0

    sub-int p1, v1, p1

    if-ge p2, p1, :cond_19

    goto :goto_1a

    :cond_19
    :goto_19
    move v0, v1

    :cond_1a
    :goto_1a
    return v0
.end method
