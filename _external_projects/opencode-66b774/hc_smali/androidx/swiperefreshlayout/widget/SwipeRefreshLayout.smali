.class public Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/づざかべべ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$ぁごぐすすぃ;,
        Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$〳ぜぞぜべっ;
    }
.end annotation


# static fields
.field public static final ぃぜぶの〸ぃ:[I

.field public static final ながふずは:Ljava/lang/String;


# instance fields
.field public final 〳ぜぞぜべっ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

.field public 〺つふすそ:Landroid/view/View;

.field public 〺でおいここ:Landroid/view/animation/Animation$AnimationListener;

.field public 〻ぞまぎな〻:F

.field public ぁごぐすすぃ:F

.field public final いいにぽつ:[I

.field public ぅみぱぎぎ:Landroid/view/animation/Animation;

.field public ぇ〳〲〺すっ:I

.field public final ぇとしたべど:Landroid/view/animation/Animation;

.field public ぇぬぎばつ:F

.field public ぉ〲なぱぽた:I

.field public ぉざぅち〻:Z

.field public ぉひのべい:Landroid/view/animation/Animation;

.field public おかぷせ〱:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$ぁごぐすすぃ;

.field public おぐぴう〸ず:F

.field public くし〴〺ぅ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$〳ぜぞぜべっ;

.field public けときぜと:Z

.field public final げがぴうあだ:Landroid/view/animation/Animation;

.field public final ごづごきえ:Landroid/view/animation/DecelerateInterpolator;

.field public ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

.field public ざとぅぼこ〺:I

.field public じぜこほぱ:Landroid/view/animation/Animation;

.field public せづっ〸ちね:Z

.field public づざかべべ:I

.field public てぜきぽく:Z

.field public でどあくず:I

.field public どぇぞほだ:Landroid/view/animation/Animation;

.field public なぎぱいぢぎ:F

.field public なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

.field public のぷのちつ:I

.field public は〲ぱなで:Z

.field public びえぁぜい:I

.field public びぐびあび:Z

.field public ぶでにく〼〳:I

.field public ぷぞてのほき:I

.field public へぬ〴づぞ:I

.field public final ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

.field public ぺづげぺが:Landroid/view/animation/Animation;

.field public final ぺふねづ〺:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const-class v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ながふずは:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x101000e

    aput v2, v0, v1

    sput-object v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぃぜぶの〸ぃ:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 8

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぎぱいぢぎ:F

    const/4 v1, 0x2

    new-array v2, v1, [I

    iput-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->いいにぽつ:[I

    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺふねづ〺:[I

    const/4 v1, -0x1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->でどあくず:I

    new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$げつ〴ぬぐ;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺でおいここ:Landroid/view/animation/Animation$AnimationListener;

    new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$づざかべべ;

    invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$づざかべべ;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇとしたべど:Landroid/view/animation/Animation;

    new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$なぎぱいぢぎ;

    invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$なぎぱいぢぎ;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->げがぴうあだ:Landroid/view/animation/Animation;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->づざかべべ:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x10e0001

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->のぷのちつ:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ごづごきえ:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v2, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42200000    # 40.0f

    mul-float v2, v2, v3

    float-to-int v2, v2

    iput v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぷぞてのほき:I

    .line 1
    new-instance v2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, -0x50506

    invoke-direct {v2, v3, v4}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    new-instance v2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ(I)V

    iget-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    const/high16 v2, 0x42800000    # 64.0f

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    int-to-float v1, v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぎぱいぢぎ:F

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    invoke-direct {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;-><init>()V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〳ぜぞぜべっ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    invoke-direct {v1, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;-><init>(Landroid/view/View;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    invoke-virtual {p0, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setNestedScrollingEnabled(Z)V

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぷぞてのほき:I

    neg-int v1, v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ(F)V

    sget-object v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぃぜぶの〸ぃ:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private setColorViewAlpha(I)V
    .registers 4

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 1
    iget-object v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 2
    iput p1, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method


# virtual methods
.method public dispatchNestedFling(FFZ)Z
    .registers 5

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    invoke-virtual {v0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .registers 4

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->〺つふすそ(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .registers 11

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->くし〴〺ぅ(II[I[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .registers 12

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->づざかべべ(IIII[I)Z

    move-result p1

    return p1
.end method

.method public getChildDrawingOrder(II)I
    .registers 4

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->でどあくず:I

    if-gez v0, :cond_5

    return p2

    :cond_5
    add-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_a

    return v0

    :cond_a
    if-lt p2, v0, :cond_e

    add-int/lit8 p2, p2, 0x1

    :cond_e
    return p2
.end method

.method public getNestedScrollAxes()I
    .registers 2

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〳ぜぞぜべっ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ()I

    move-result v0

    return v0
.end method

.method public getProgressCircleDiameter()I
    .registers 2

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぷぞてのほき:I

    return v0
.end method

.method public getProgressViewEndOffset()I
    .registers 2

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    return v0
.end method

.method public getProgressViewStartOffset()I
    .registers 2

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    return v0
.end method

.method public hasNestedScrollingParent()Z
    .registers 3

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->〳ぜぞぜべっ(I)Z

    move-result v0

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .registers 2

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    .line 1
    iget-boolean v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->びぐびあび:Z

    return v0
.end method

.method public onDetachedFromWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6e

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->げつ〴ぬぐ()Z

    move-result v1

    if-nez v1, :cond_6e

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    if-nez v1, :cond_6e

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->てぜきぽく:Z

    if-eqz v1, :cond_1d

    goto :goto_6e

    :cond_1d
    if-eqz v0, :cond_4a

    const/4 v1, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_45

    const/4 v1, 0x2

    if-eq v0, v1, :cond_31

    const/4 v1, 0x3

    if-eq v0, v1, :cond_45

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2d

    goto :goto_6b

    :cond_2d
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->いいにぽつ(Landroid/view/MotionEvent;)V

    goto :goto_6b

    :cond_31
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    if-ne v0, v3, :cond_36

    return v2

    :cond_36
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_3d

    return v2

    :cond_3d
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻(F)V

    goto :goto_6b

    :cond_45
    iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    iput v3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    goto :goto_6b

    :cond_4a
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_65

    return v2

    :cond_65
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇぬぎばつ:F

    :goto_6b
    iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    return p1

    :cond_6e
    :goto_6e
    return v2
.end method

.method public onLayout(ZIIII)V
    .registers 8

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-nez p3, :cond_f

    return-void

    :cond_f
    iget-object p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    if-nez p3, :cond_16

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ()V

    :cond_16
    iget-object p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    if-nez p3, :cond_1b

    return-void

    :cond_1b
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    add-int/2addr v0, p4

    add-int/2addr p2, p5

    invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p2}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result p2

    iget-object p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p3}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result p3

    iget-object p4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p2, p2, 0x2

    sub-int p5, p1, p2

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    add-int/2addr p1, p2

    add-int/2addr p3, v0

    invoke-virtual {p4, p5, v0, p1, p3}, Landroid/widget/ImageView;->layout(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .registers 6

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    if-nez p1, :cond_a

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ()V

    :cond_a
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    if-nez p1, :cond_f

    return-void

    :cond_f
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    sub-int/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぷぞてのほき:I

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぷぞてのほき:I

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/widget/ImageView;->measure(II)V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->でどあくず:I

    const/4 p1, 0x0

    :goto_4d
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-ge p1, p2, :cond_61

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    if-ne p2, v0, :cond_5e

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->でどあくず:I

    goto :goto_61

    :cond_5e
    add-int/lit8 p1, p1, 0x1

    goto :goto_4d

    :cond_61
    :goto_61
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 5

    invoke-virtual {p0, p2, p3, p4}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedFling(FFZ)Z

    move-result p1

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 4

    invoke-virtual {p0, p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .registers 9

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-lez p3, :cond_21

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    cmpl-float v2, v1, p1

    if-lez v2, :cond_21

    int-to-float v2, p3

    cmpl-float v3, v2, v1

    if-lez v3, :cond_17

    float-to-int v1, v1

    sub-int v1, p3, v1

    aput v1, p4, v0

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    goto :goto_1c

    :cond_17
    sub-float/2addr v1, v2

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    aput p3, p4, v0

    :goto_1c
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->づざかべべ(F)V

    :cond_21
    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->けときぜと:Z

    if-eqz v1, :cond_3e

    if-lez p3, :cond_3e

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_3e

    aget p1, p4, v0

    sub-int p1, p3, p1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-lez p1, :cond_3e

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_3e
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->いいにぽつ:[I

    const/4 v1, 0x0

    aget v2, p4, v1

    sub-int/2addr p2, v2

    aget v2, p4, v0

    sub-int/2addr p3, v2

    const/4 v2, 0x0

    invoke-virtual {p0, p2, p3, p1, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedPreScroll(II[I[I)Z

    move-result p2

    if-eqz p2, :cond_5c

    aget p2, p4, v1

    aget p3, p1, v1

    add-int/2addr p2, p3

    aput p2, p4, v1

    aget p2, p4, v0

    aget p1, p1, v0

    add-int/2addr p2, p1

    aput p2, p4, v0

    :cond_5c
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .registers 12

    iget-object v5, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺふねづ〺:[I

    move-object v0, p0

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedScroll(IIII[I)Z

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺふねづ〺:[I

    const/4 p2, 0x1

    aget p1, p1, p2

    add-int/2addr p5, p1

    if-gez p5, :cond_25

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->げつ〴ぬぐ()Z

    move-result p1

    if-nez p1, :cond_25

    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    add-float/2addr p1, p2

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->づざかべべ(F)V

    :cond_25
    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .registers 4

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〳ぜぞぜべっ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    .line 1
    iput p3, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:I

    and-int/lit8 p1, p3, 0x2

    .line 2
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->startNestedScroll(I)Z

    const/4 p1, 0x0

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->てぜきぽく:Z

    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .registers 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_10

    iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    if-nez p1, :cond_10

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_10

    const/4 p1, 0x1

    goto :goto_11

    :cond_10
    const/4 p1, 0x0

    :goto_11
    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .registers 4

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〳ぜぞぜべっ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->〺つふすそ(I)V

    .line 2
    iput-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->てぜきぽく:Z

    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_14

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->くし〴〺ぅ(F)V

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぁごぐすすぃ:F

    :cond_14
    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->stopNestedScroll()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_8d

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->げつ〴ぬぐ()Z

    move-result v1

    if-nez v1, :cond_8d

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    if-nez v1, :cond_8d

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->てぜきぽく:Z

    if-eqz v1, :cond_1b

    goto/16 :goto_8d

    :cond_1b
    const/4 v1, 0x1

    if-eqz v0, :cond_84

    const/high16 v3, 0x3f000000    # 0.5f

    if-eq v0, v1, :cond_65

    const/4 v4, 0x2

    if-eq v0, v4, :cond_42

    const/4 v3, 0x3

    if-eq v0, v3, :cond_41

    const/4 v3, 0x5

    if-eq v0, v3, :cond_33

    const/4 v2, 0x6

    if-eq v0, v2, :cond_2f

    goto :goto_8c

    :cond_2f
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->いいにぽつ(Landroid/view/MotionEvent;)V

    goto :goto_8c

    :cond_33
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    if-gez v0, :cond_3a

    return v2

    :cond_3a
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    goto :goto_8c

    :cond_41
    return v2

    :cond_42
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_4b

    return v2

    :cond_4b
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻(F)V

    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    if-eqz v0, :cond_8c

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->おぐぴう〸ず:F

    sub-float/2addr p1, v0

    mul-float p1, p1, v3

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_64

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->づざかべべ(F)V

    goto :goto_8c

    :cond_64
    return v2

    :cond_65
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_6e

    return v2

    :cond_6e
    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    if-eqz v1, :cond_80

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->おぐぴう〸ず:F

    sub-float/2addr p1, v0

    mul-float p1, p1, v3

    iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->くし〴〺ぅ(F)V

    :cond_80
    const/4 p1, -0x1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    return v2

    :cond_84
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    :cond_8c
    :goto_8c
    return v1

    :cond_8d
    :goto_8d
    return v2
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_c

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    instance-of v0, v0, Landroid/widget/AbsListView;

    if-nez v0, :cond_1a

    :cond_c
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    if-eqz v0, :cond_17

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〻ぞまぎな〻(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_1a

    :cond_17
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1a
    :goto_1a
    return-void
.end method

.method public setAnimationProgress(F)V
    .registers 3

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleX(F)V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleY(F)V

    return-void
.end method

.method public varargs setColorScheme([I)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V

    return-void
.end method

.method public varargs setColorSchemeColors([I)V
    .registers 4

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ()V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 1
    iget-object v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 2
    iput-object p1, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺぁあねじ:[I

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    .line 3
    iget-object v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v1, p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public varargs setColorSchemeResources([I)V
    .registers 6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    array-length v1, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    :goto_8
    array-length v3, p1

    if-ge v2, v3, :cond_16

    aget v3, p1, v2

    invoke-static {v0, v3}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_16
    invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    return-void
.end method

.method public setDistanceToTriggerSync(I)V
    .registers 2

    int-to-float p1, p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぎぱいぢぎ:F

    return-void
.end method

.method public setEnabled(Z)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setEnabled(Z)V

    if-nez p1, :cond_8

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ()V

    :cond_8
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .registers 3

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    invoke-virtual {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぺぁあねじ(Z)V

    return-void
.end method

.method public setOnChildScrollUpCallback(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$ぁごぐすすぃ;)V
    .registers 2

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->おかぷせ〱:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$ぁごぐすすぃ;

    return-void
.end method

.method public setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$〳ぜぞぜべっ;)V
    .registers 2

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->くし〴〺ぅ:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$〳ぜぞぜべっ;

    return-void
.end method

.method public setProgressBackgroundColor(I)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setProgressBackgroundColorSchemeResource(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeColor(I)V
    .registers 3

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->setBackgroundColor(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setProgressBackgroundColorSchemeColor(I)V

    return-void
.end method

.method public setProgressViewEndTarget(ZI)V
    .registers 3

    iput p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->は〲ぱなで:Z

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method public setProgressViewOffset(ZII)V
    .registers 4

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->は〲ぱなで:Z

    iput p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    iput p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->けときぜと:Z

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    return-void
.end method

.method public setRefreshing(Z)V
    .registers 5

    const/4 v0, 0x0

    if-eqz p1, :cond_4b

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    if-eq v1, p1, :cond_4b

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->けときぜと:Z

    if-nez p1, :cond_13

    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    add-int/2addr p1, v1

    goto :goto_15

    :cond_13
    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    :goto_15
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    iput-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->せづっ〸ちね:Z

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺でおいここ:Landroid/view/animation/Animation$AnimationListener;

    .line 1
    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->setAlpha(I)V

    new-instance v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/づざかべべ;

    invoke-direct {v0, p0}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/づざかべべ;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->どぇぞほだ:Landroid/view/animation/Animation;

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->のぷのちつ:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    if-eqz p1, :cond_3e

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 2
    iput-object p1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

    .line 3
    :cond_3e
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->どぇぞほだ:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_4e

    .line 4
    :cond_4b
    invoke-virtual {p0, p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->おぐぴう〸ず(ZZ)V

    :goto_4e
    return-void
.end method

.method public setSize(I)V
    .registers 4

    if-eqz p1, :cond_6

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    return-void

    :cond_6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    if-nez p1, :cond_13

    const/high16 v1, 0x42600000    # 56.0f

    goto :goto_15

    :cond_13
    const/high16 v1, 0x42200000    # 40.0f

    :goto_15
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぷぞてのほき:I

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-virtual {v0, p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ(I)V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSlingshotDistance(I)V
    .registers 2

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びえぁぜい:I

    return-void
.end method

.method public setTargetOffsetTopAndBottom(I)V
    .registers 3

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->bringToFront()V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getTop()I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    return-void
.end method

.method public startNestedScroll(I)Z
    .registers 4

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, p1, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->いいにぽつ(II)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .registers 3

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺぁあねじ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/なぎぱいぢぎ;->ぺふねづ〺(I)V

    return-void
.end method

.method public final 〺つふすそ()V
    .registers 4

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    if-nez v0, :cond_1d

    const/4 v0, 0x0

    :goto_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1d

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    goto :goto_1d

    :cond_1a
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_1d
    :goto_1d
    return-void
.end method

.method public final いいにぽつ(Landroid/view/MotionEvent;)V
    .registers 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    if-ne v1, v2, :cond_17

    if-nez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺:I

    :cond_17
    return-void
.end method

.method public final ぇぬぎばつ(II)Landroid/view/animation/Animation;
    .registers 4

    new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;

    invoke-direct {v0, p0, p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$くし〴〺ぅ;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;II)V

    const-wide/16 p1, 0x12c

    invoke-virtual {v0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 p2, 0x0

    .line 1
    iput-object p2, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

    .line 2
    invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-object v0
.end method

.method public final ぉざぅち〻(F)V
    .registers 5

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇぬぎばつ:F

    sub-float/2addr p1, v0

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->づざかべべ:I

    int-to-float v2, v1

    cmpl-float p1, p1, v2

    if-lez p1, :cond_1c

    iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    if-nez p1, :cond_1c

    int-to-float p1, v1

    add-float/2addr v0, p1

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->おぐぴう〸ず:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉざぅち〻:Z

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    const/16 v0, 0x4c

    invoke-virtual {p1, v0}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->setAlpha(I)V

    :cond_1c
    return-void
.end method

.method public final おぐぴう〸ず(ZZ)V
    .registers 5

    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    if-eq v0, p1, :cond_3e

    iput-boolean p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->せづっ〸ちね:Z

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ()V

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    if-eqz p1, :cond_39

    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺でおいここ:Landroid/view/animation/Animation$AnimationListener;

    .line 1
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぶでにく〼〳:I

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇとしたべど:Landroid/view/animation/Animation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇとしたべど:Landroid/view/animation/Animation;

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇとしたべど:Landroid/view/animation/Animation;

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ごづごきえ:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-eqz p2, :cond_2c

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 2
    iput-object p2, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

    .line 3
    :cond_2c
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇとしたべど:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_3e

    .line 4
    :cond_39
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺でおいここ:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざとぅぼこ〺(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_3e
    :goto_3e
    return-void
.end method

.method public final くし〴〺ぅ(F)V
    .registers 6

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぎぱいぢぎ:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_c

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->おぐぴう〸ず(ZZ)V

    goto/16 :goto_86

    :cond_c
    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび:Z

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 1
    iget-object v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    const/4 v2, 0x0

    .line 2
    iput v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    .line 3
    iput v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    .line 4
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/4 v0, 0x0

    .line 5
    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->は〲ぱなで:Z

    if-nez v1, :cond_25

    new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$びぐびあび;

    invoke-direct {v0, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$びぐびあび;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    :cond_25
    iget v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    if-eqz v1, :cond_52

    .line 6
    iput v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぶでにく〼〳:I

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleX()F

    move-result v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〻ぞまぎな〻:F

    new-instance v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/なぎぱいぢぎ;

    invoke-direct {v1, p0}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/なぎぱいぢぎ;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉひのべい:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x96

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    if-eqz v0, :cond_45

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 7
    iput-object v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

    .line 8
    :cond_45
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉひのべい:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_79

    .line 9
    :cond_52
    iput v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぶでにく〼〳:I

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->げがぴうあだ:Landroid/view/animation/Animation;

    invoke-virtual {v1}, Landroid/view/animation/Animation;->reset()V

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->げがぴうあだ:Landroid/view/animation/Animation;

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->げがぴうあだ:Landroid/view/animation/Animation;

    iget-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ごづごきえ:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-eqz v0, :cond_6d

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 10
    iput-object v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

    .line 11
    :cond_6d
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->げがぴうあだ:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 12
    :goto_79
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 13
    iget-object v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 14
    iget-boolean v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->へぬ〴づぞ:Z

    if-eqz v2, :cond_83

    iput-boolean p1, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->へぬ〴づぞ:Z

    .line 15
    :cond_83
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :goto_86
    return-void
.end method

.method public げつ〴ぬぐ()Z
    .registers 5

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->おかぷせ〱:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$ぁごぐすすぃ;

    if-eqz v0, :cond_b

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    invoke-interface {v0, p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$ぁごぐすすぃ;->げつ〴ぬぐ(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Landroid/view/View;)Z

    move-result v0

    return v0

    :cond_b
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->〺つふすそ:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/ListView;

    const/4 v2, -0x1

    if-eqz v1, :cond_40

    check-cast v0, Landroid/widget/ListView;

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-lt v1, v3, :cond_1f

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->canScrollList(I)Z

    move-result v0

    goto :goto_3f

    :cond_1f
    invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_27

    goto :goto_3c

    :cond_27
    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v1

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    if-gtz v1, :cond_3e

    invoke-virtual {v0}, Landroid/widget/ListView;->getListPaddingTop()I

    move-result v0

    if-ge v3, v0, :cond_3c

    goto :goto_3e

    :cond_3c
    :goto_3c
    const/4 v0, 0x0

    goto :goto_3f

    :cond_3e
    :goto_3e
    const/4 v0, 0x1

    :goto_3f
    return v0

    .line 2
    :cond_40
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    return v0
.end method

.method public ざとぅぼこ〺(Landroid/view/animation/Animation$AnimationListener;)V
    .registers 5

    new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$〺つふすそ;

    invoke-direct {v0, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$〺つふすそ;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぅみぱぎぎ:Landroid/view/animation/Animation;

    const-wide/16 v1, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 1
    iput-object p1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

    .line 2
    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぅみぱぎぎ:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final づざかべべ(F)V
    .registers 13

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 1
    iget-object v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 2
    iget-boolean v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->へぬ〴づぞ:Z

    const/4 v3, 0x1

    if-eq v2, v3, :cond_b

    iput-boolean v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->へぬ〴づぞ:Z

    .line 3
    :cond_b
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぎぱいぢぎ:F

    div-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-double v2, v0

    const-wide v4, 0x3fd999999999999aL    # 0.4

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    double-to-float v2, v2

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float v2, v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v2, v3

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぎぱいぢぎ:F

    sub-float/2addr v3, v4

    iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びえぁぜい:I

    if-lez v4, :cond_43

    goto :goto_4f

    :cond_43
    iget-boolean v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->けときぜと:Z

    if-eqz v4, :cond_4d

    iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    iget v5, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    sub-int/2addr v4, v5

    goto :goto_4f

    :cond_4d
    iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇ〳〲〺すっ:I

    :goto_4f
    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    mul-float v6, v4, v5

    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    move-result v3

    div-float/2addr v3, v4

    const/4 v6, 0x0

    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const/high16 v7, 0x40800000    # 4.0f

    div-float/2addr v3, v7

    float-to-double v7, v3

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v7, v9

    double-to-float v3, v7

    mul-float v3, v3, v5

    mul-float v7, v4, v3

    mul-float v7, v7, v5

    iget v8, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    mul-float v4, v4, v0

    add-float/2addr v4, v7

    float-to-int v0, v4

    add-int/2addr v8, v0

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_8b

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_8b
    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->は〲ぱなで:Z

    if-nez v0, :cond_99

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleX(F)V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleY(F)V

    :cond_99
    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->は〲ぱなで:Z

    if-eqz v0, :cond_a8

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぎぱいぢぎ:F

    div-float v0, p1, v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setAnimationProgress(F)V

    :cond_a8
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぎぱいぢぎ:F

    cmpg-float p1, p1, v0

    if-gez p1, :cond_cd

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 5
    iget-object p1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 6
    iget p1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    const/16 v0, 0x4c

    if-le p1, v0, :cond_eb

    .line 7
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->じぜこほぱ:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび(Landroid/view/animation/Animation;)Z

    move-result p1

    if-nez p1, :cond_eb

    .line 8
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 9
    iget-object p1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 10
    iget p1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    .line 11
    invoke-virtual {p0, p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇぬぎばつ(II)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->じぜこほぱ:Landroid/view/animation/Animation;

    goto :goto_eb

    .line 12
    :cond_cd
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 13
    iget-object p1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 14
    iget p1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    const/16 v0, 0xff

    if-ge p1, v0, :cond_eb

    .line 15
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺづげぺが:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->びぐびあび(Landroid/view/animation/Animation;)Z

    move-result p1

    if-nez p1, :cond_eb

    .line 16
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 17
    iget-object p1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 18
    iget p1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    .line 19
    invoke-virtual {p0, p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぇぬぎばつ(II)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぺづげぺが:Landroid/view/animation/Animation;

    :cond_eb
    :goto_eb
    const p1, 0x3f4ccccd    # 0.8f

    mul-float v0, v2, p1

    .line 20
    iget-object v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    .line 21
    iget-object v0, v4, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 22
    iput v6, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    .line 23
    iput p1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    .line 24
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 25
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 26
    iget-object v1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 27
    iget v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    cmpl-float v4, v0, v4

    if-eqz v4, :cond_10f

    iput v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    .line 28
    :cond_10f
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/high16 p1, -0x41800000    # -0.25f

    const v0, 0x3ecccccd    # 0.4f

    mul-float v2, v2, v0

    add-float/2addr v2, p1

    mul-float v3, v3, v5

    add-float/2addr v3, v2

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float v3, v3, p1

    .line 29
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    .line 30
    iget-object v0, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 31
    iput v3, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ:F

    .line 32
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 33
    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    sub-int/2addr v8, p1

    invoke-virtual {p0, v8}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    return-void
.end method

.method public final びぐびあび(Landroid/view/animation/Animation;)Z
    .registers 3

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p1

    if-nez p1, :cond_10

    const/4 p1, 0x1

    goto :goto_11

    :cond_10
    const/4 p1, 0x0

    :goto_11
    return p1
.end method

.method public へぬ〴づぞ()V
    .registers 3

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->なぶひせが:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;

    invoke-virtual {v0}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->stop()V

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/16 v0, 0xff

    invoke-direct {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorViewAlpha(I)V

    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->は〲ぱなで:Z

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setAnimationProgress(F)V

    goto :goto_27

    :cond_1f
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    :goto_27
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->へぬ〴づぞ:I

    return-void
.end method

.method public ぺぁあねじ(F)V
    .registers 4

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぶでにく〼〳:I

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ぉ〲なぱぽた:I

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float v1, v1, p1

    float-to-int p1, v1

    add-int/2addr v0, p1

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->ざっざへづ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getTop()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    return-void
.end method
