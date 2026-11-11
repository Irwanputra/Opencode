.class public Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;
.super Landroid/view/View;
.source ""

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:F

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:I

.field public いいにぽつ:F

.field public final くし〴〺ぅ:Landroid/graphics/Paint;

.field public づざかべべ:Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;

.field public てぜきぽく:Z

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;

.field public びぐびあび:Landroidx/viewpager/widget/ViewPager;

.field public へぬ〴づぞ:Landroid/graphics/Paint;

.field public ぺぁあねじ:I

.field public ぺふねづ〺:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->くし〴〺ぅ:Landroid/graphics/Paint;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->いいにぽつ:F

    const/4 p1, -0x1

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->のぷのちつ:Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->くし〴〺ぅ:Landroid/graphics/Paint;

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->いいにぽつ:F

    const/4 v0, -0x1

    iput v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->のぷのちつ:Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->dialog_text_color_holo_dark:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->〺つふすそ:I

    sget-object v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogFragment_bpKeyboardIndicatorColor:I

    iget v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->〺つふすそ:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->〺つふすそ:I

    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->へぬ〴づぞ:Landroid/graphics/Paint;

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p3, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->へぬ〴づぞ:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 1
    sget-object p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/は〲ぱなで;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    move-result p1

    .line 2
    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺぁあねじ:I

    return-void
.end method


# virtual methods
.method public getSelectedColor()I
    .registers 2

    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->くし〴〺ぅ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 11

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_70

    if-nez v0, :cond_16

    goto :goto_70

    :cond_16
    iget-object v1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->のぷのちつ:Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;

    if-eqz v1, :cond_70

    iget v2, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    invoke-virtual {v1, v2}, Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;->げつ〴ぬぐ(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v1, v1

    iget v3, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->〳ぜぞぜべっ:F

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-lez v3, :cond_59

    iget v3, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    add-int/lit8 v0, v0, -0x1

    if-ge v3, v0, :cond_59

    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->のぷのちつ:Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;->げつ〴ぬぐ(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v0, v0

    iget v4, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->〳ぜぞぜべっ:F

    mul-float v3, v3, v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(FFFF)F

    move-result v2

    mul-float v0, v0, v4

    invoke-static {v5, v4, v1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(FFFF)F

    move-result v1

    :cond_59
    move v6, v1

    move v4, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    int-to-float v5, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v7, v0

    iget-object v8, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->くし〴〺ぅ:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_70
    :goto_70
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    check-cast p1, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;

    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget p1, p1, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;->〺つふすそ:I

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;

    invoke-direct {v1, v0}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    iput v0, v1, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;->〺つふすそ:I

    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 15

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    return v1

    :cond_8
    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    const/4 v2, 0x0

    if-eqz v0, :cond_135

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ()I

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_135

    :cond_19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-eqz v0, :cond_128

    const/4 v3, 0x3

    if-eq v0, v1, :cond_cd

    const/4 v4, 0x2

    if-eq v0, v4, :cond_64

    if-eq v0, v3, :cond_cd

    const/4 v3, 0x5

    if-eq v0, v3, :cond_52

    const/4 v3, 0x6

    if-eq v0, v3, :cond_31

    goto/16 :goto_134

    .line 1
    :cond_31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    .line 3
    iget v4, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    if-ne v3, v4, :cond_46

    if-nez v0, :cond_40

    const/4 v2, 0x1

    .line 4
    :cond_40
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 5
    iput v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    :cond_46
    iget v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    goto/16 :goto_132

    .line 8
    :cond_52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    .line 10
    iput v2, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->いいにぽつ:F

    .line 11
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    .line 12
    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    goto/16 :goto_134

    :cond_64
    iget v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    .line 15
    iget v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->いいにぽつ:F

    sub-float v0, p1, v0

    iget-boolean v3, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->てぜきぽく:Z

    if-nez v3, :cond_83

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺぁあねじ:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_83

    iput-boolean v1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->てぜきぽく:Z

    :cond_83
    iget-boolean v3, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->てぜきぽく:Z

    if-eqz v3, :cond_134

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->いいにぽつ:F

    iget-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    .line 16
    iget-boolean v3, p1, Landroidx/viewpager/widget/ViewPager;->げがぴうあだ:Z

    if-nez v3, :cond_c7

    .line 17
    iget-boolean v3, p1, Landroidx/viewpager/widget/ViewPager;->ぉ〲なぱぽた:Z

    if-eqz v3, :cond_94

    goto :goto_c5

    :cond_94
    iput-boolean v1, p1, Landroidx/viewpager/widget/ViewPager;->げがぴうあだ:Z

    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V

    const/4 v2, 0x0

    iput v2, p1, Landroidx/viewpager/widget/ViewPager;->ぅみぱぎぎ:F

    iput v2, p1, Landroidx/viewpager/widget/ViewPager;->ぺづげぺが:F

    iget-object v2, p1, Landroidx/viewpager/widget/ViewPager;->ぷぞてのほき:Landroid/view/VelocityTracker;

    if-nez v2, :cond_a9

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, p1, Landroidx/viewpager/widget/ViewPager;->ぷぞてのほき:Landroid/view/VelocityTracker;

    goto :goto_ac

    :cond_a9
    invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V

    :goto_ac
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide v3, v11

    move-wide v5, v11

    invoke-static/range {v3 .. v10}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    iget-object v3, p1, Landroidx/viewpager/widget/ViewPager;->ぷぞてのほき:Landroid/view/VelocityTracker;

    invoke-virtual {v3, v2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    iput-wide v11, p1, Landroidx/viewpager/widget/ViewPager;->ながふずは:J

    const/4 v2, 0x1

    :goto_c5
    if-eqz v2, :cond_134

    .line 18
    :cond_c7
    iget-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->いいにぽつ(F)V

    goto :goto_134

    :cond_cd
    iget-boolean v4, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->てぜきぽく:Z

    if-nez v4, :cond_119

    iget-object v4, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v4}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v4

    invoke-virtual {v4}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v5, v6

    const/high16 v7, 0x40c00000    # 6.0f

    div-float/2addr v5, v7

    iget v7, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    if-lez v7, :cond_100

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    sub-float v8, v6, v5

    cmpg-float v7, v7, v8

    if-gez v7, :cond_100

    if-eq v0, v3, :cond_ff

    iget-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_ff
    return v1

    :cond_100
    iget v7, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    sub-int/2addr v4, v1

    if-ge v7, v4, :cond_119

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    add-float/2addr v6, v5

    cmpl-float p1, p1, v6

    if-lez p1, :cond_119

    if-eq v0, v3, :cond_118

    iget-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    iget v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_118
    return v1

    :cond_119
    iput-boolean v2, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->てぜきぽく:Z

    const/4 p1, -0x1

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    iget-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    .line 19
    iget-boolean v0, p1, Landroidx/viewpager/widget/ViewPager;->げがぴうあだ:Z

    if-eqz v0, :cond_134

    .line 20
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->ぺぁあねじ()V

    goto :goto_134

    .line 21
    :cond_128
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 22
    iput v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぺふねづ〺:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    :goto_132
    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->いいにぽつ:F

    :cond_134
    :goto_134
    return v1

    :cond_135
    :goto_135
    return v2
.end method

.method public setCurrentItem(I)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_d

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewPager has not been bound."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->づざかべべ:Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;

    return-void
.end method

.method public setSelectedColor(I)V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->くし〴〺ぅ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTitleView(Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;)V
    .registers 2

    iput-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->のぷのちつ:Lcom/codetroopers/betterpickers/widget/PickerLinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .registers 4

    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    if-eqz v0, :cond_b

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;)V

    :cond_b
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v0

    if-eqz v0, :cond_1a

    iput-object p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->びぐびあび:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewPager does not have adapter instance."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setViewPager(Landroidx/viewpager/widget/ViewPager;I)V
    .registers 3

    invoke-virtual {p0, p1}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0, p2}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->setCurrentItem(I)V

    return-void
.end method

.method public 〺つふすそ(I)V
    .registers 3

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->なぎぱいぢぎ:I

    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->づざかべべ:Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;->〺つふすそ(I)V

    :cond_9
    return-void
.end method

.method public くし〴〺ぅ(I)V
    .registers 3

    iget v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->なぎぱいぢぎ:I

    if-nez v0, :cond_c

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->〳ぜぞぜべっ:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_c
    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->づざかべべ:Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;

    if-eqz v0, :cond_13

    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;->くし〴〺ぅ(I)V

    :cond_13
    return-void
.end method

.method public げつ〴ぬぐ(IFI)V
    .registers 5

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->ぁごぐすすぃ:I

    iput p2, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->〳ぜぞぜべっ:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;->づざかべべ:Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;

    if-eqz v0, :cond_e

    invoke-interface {v0, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;->げつ〴ぬぐ(IFI)V

    :cond_e
    return-void
.end method
