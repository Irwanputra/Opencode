.class public Landroidx/appcompat/widget/ActionBarOverlayLayout;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぉざぅち〻/へぬ〴づぞ;
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺぁあねじ;
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぁごぐすすぃ;
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〳ぜぞぜべっ;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UnknownNullness"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;,
        Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;
    }
.end annotation


# static fields
.field public static final ぉひのべい:[I


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:I

.field public 〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

.field public ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

.field public いいにぽつ:Z

.field public final ぅみぱぎぎ:Ljava/lang/Runnable;

.field public ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;

.field public final ぇぬぎばつ:Landroid/graphics/Rect;

.field public ぉ〲なぱぽた:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

.field public final ぉざぅち〻:Landroid/graphics/Rect;

.field public final おぐぴう〸ず:Landroid/graphics/Rect;

.field public くし〴〺ぅ:I

.field public final ごづごきえ:Landroid/graphics/Rect;

.field public final ざっざへづ:Landroid/graphics/Rect;

.field public final ざとぅぼこ〺:Landroid/graphics/Rect;

.field public final じぜこほぱ:Ljava/lang/Runnable;

.field public づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

.field public てぜきぽく:Z

.field public でどあくず:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

.field public final どぇぞほだ:Landroid/animation/AnimatorListenerAdapter;

.field public なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

.field public なぶひせが:Landroid/view/ViewPropertyAnimator;

.field public のぷのちつ:I

.field public final は〲ぱなで:Landroid/graphics/Rect;

.field public びえぁぜい:Landroid/widget/OverScroller;

.field public びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

.field public ぶでにく〼〳:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

.field public へぬ〴づぞ:I

.field public ぺぁあねじ:Z

.field public final ぺづげぺが:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

.field public ぺふねづ〺:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarSize:I

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    const v2, 0x1010059

    aput v2, v0, v1

    sput-object v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉひのべい:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    iput p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->くし〴〺ぅ:I

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇぬぎばつ:Landroid/graphics/Rect;

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻:Landroid/graphics/Rect;

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざとぅぼこ〺:Landroid/graphics/Rect;

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->は〲ぱなで:Landroid/graphics/Rect;

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ごづごきえ:Landroid/graphics/Rect;

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざっざへづ:Landroid/graphics/Rect;

    sget-object p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->でどあくず:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぶでにく〼〳:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉ〲なぱぽた:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$げつ〴ぬぐ;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->どぇぞほだ:Landroid/animation/AnimatorListenerAdapter;

    new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$〺つふすそ;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$〺つふすそ;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぅみぱぎぎ:Ljava/lang/Runnable;

    new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$くし〴〺ぅ;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->じぜこほぱ:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇぬぎばつ(Landroid/content/Context;)V

    new-instance p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    invoke-direct {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺづげぺが:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    return-void
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 2

    instance-of p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    return p1
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 7

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3d

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_3d

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_27

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBottom()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getTranslationY()F

    move-result v2

    add-float/2addr v2, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr v2, v0

    float-to-int v0, v2

    goto :goto_28

    :cond_27
    const/4 v0, 0x0

    :goto_28
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_3d
    return-void
.end method

.method public fitSystemWindows(Landroid/graphics/Rect;)Z
    .registers 9

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_b

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_b
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v2, p1

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->へぬ〴づぞ(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざとぅぼこ〺:Landroid/graphics/Rect;

    invoke-virtual {v1, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざとぅぼこ〺:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    .line 1
    sget-object v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇとしたべど;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_34

    const/4 v4, 0x2

    :try_start_28
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    aput-object v1, v4, v3

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_32} :catch_33

    goto :goto_34

    :catch_33
    nop

    .line 2
    :cond_34
    :goto_34
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->は〲ぱなで:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざとぅぼこ〺:Landroid/graphics/Rect;

    invoke-virtual {p1, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_46

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->は〲ぱなで:Landroid/graphics/Rect;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざとぅぼこ〺:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    const/4 v0, 0x1

    :cond_46
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇぬぎばつ:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    invoke-virtual {p1, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_58

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇぬぎばつ:Landroid/graphics/Rect;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    const/4 v0, 0x1

    :cond_58
    if-eqz v0, :cond_5d

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_5d
    return v3
.end method

.method public generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 1
    new-instance v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 4

    .line 1
    new-instance v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    new-instance v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getActionBarHideOffset()I
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getTranslationY()F

    move-result v0

    float-to-int v0, v0

    neg-int v0, v0

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return v0
.end method

.method public getNestedScrollAxes()I
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺづげぺが:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ()I

    move-result v0

    return v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 10

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    .line 1
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;-><init>(Landroid/view/WindowInsets;)V

    .line 4
    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result p1

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v1

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v2

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ()I

    move-result v4

    invoke-direct {v3, p1, v1, v2, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->へぬ〴づぞ(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z

    move-result p1

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    .line 5
    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_46

    .line 6
    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->いいにぽつ()Landroid/view/WindowInsets;

    move-result-object v2

    if-eqz v2, :cond_43

    invoke-virtual {p0, v2, v1}, Landroid/view/View;->computeSystemWindowInsets(Landroid/view/WindowInsets;Landroid/graphics/Rect;)Landroid/view/WindowInsets;

    move-result-object v1

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぺふねづ〺(Landroid/view/WindowInsets;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    goto :goto_46

    :cond_43
    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 7
    :cond_46
    :goto_46
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->top:I

    iget v4, v1, Landroid/graphics/Rect;->right:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 8
    iget-object v5, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;

    invoke-virtual {v5, v2, v3, v4, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;->〳ぜぞぜべっ(IIII)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v1

    .line 9
    iput-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->でどあくず:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぶでにく〼〳:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v2, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_66

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->でどあくず:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぶでにく〼〳:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    const/4 p1, 0x1

    :cond_66
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇぬぎばつ:Landroid/graphics/Rect;

    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    invoke-virtual {v1, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_78

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇぬぎばつ:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    invoke-virtual {p1, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_79

    :cond_78
    move v2, p1

    :goto_79
    if-eqz v2, :cond_7e

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 10
    :cond_7e
    iget-object p1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;->げつ〴ぬぐ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->げつ〴ぬぐ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object p1

    .line 12
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;->〺つふすそ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->いいにぽつ()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇぬぎばつ(Landroid/content/Context;)V

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぷぞてのほき(Landroid/view/View;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 10

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p3

    const/4 p4, 0x0

    :goto_d
    if-ge p4, p1, :cond_37

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_34

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, p2

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, p3

    add-int/2addr v1, v3

    add-int/2addr v2, v0

    invoke-virtual {p5, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    :cond_34
    add-int/lit8 p4, p4, 0x1

    goto :goto_d

    :cond_37
    return-void
.end method

.method public onMeasure(II)V
    .registers 15

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v1

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, v3

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, v0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v8

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getMeasuredState()I

    move-result v0

    invoke-static {v2, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v9

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ざっざへづ(Landroid/view/View;)I

    move-result v0

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4a

    const/4 v0, 0x1

    goto :goto_4b

    :cond_4a
    const/4 v0, 0x0

    :goto_4b
    if-eqz v0, :cond_5f

    iget v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〺つふすそ:I

    iget-boolean v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->いいにぽつ:Z

    if-eqz v3, :cond_71

    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarContainer;->getTabContainer()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_71

    iget v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〺つふすそ:I

    add-int/2addr v1, v3

    goto :goto_71

    :cond_5f
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_70

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v1

    goto :goto_71

    :cond_70
    const/4 v1, 0x0

    :cond_71
    :goto_71
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻:Landroid/graphics/Rect;

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず:Landroid/graphics/Rect;

    invoke-virtual {v3, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x15

    if-lt v10, v11, :cond_83

    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->でどあくず:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iput-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    goto :goto_8a

    :cond_83
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ごづごきえ:Landroid/graphics/Rect;

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざとぅぼこ〺:Landroid/graphics/Rect;

    invoke-virtual {v3, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    :goto_8a
    iget-boolean v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺぁあねじ:Z

    if-nez v3, :cond_a7

    if-nez v0, :cond_a7

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻:Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v1

    iput v3, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v2

    iput v3, v0, Landroid/graphics/Rect;->bottom:I

    if-lt v10, v11, :cond_f8

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    .line 1
    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;

    invoke-virtual {v0, v2, v1, v2, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〳ぜぞぜべっ;->〳ぜぞぜべっ(IIII)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v0

    goto :goto_e9

    :cond_a7
    if-lt v10, v11, :cond_ec

    .line 2
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result v0

    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v3

    add-int/2addr v3, v1

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v1

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ()I

    move-result v4

    add-int/2addr v4, v2

    invoke-static {v0, v3, v1, v4}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ(IIII)Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    const/16 v2, 0x1d

    if-lt v10, v2, :cond_d3

    .line 3
    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;

    invoke-direct {v2, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V

    goto :goto_e2

    :cond_d3
    const/16 v2, 0x14

    if-lt v10, v2, :cond_dd

    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;

    invoke-direct {v2, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$げつ〴ぬぐ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V

    goto :goto_e2

    :cond_dd
    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;

    invoke-direct {v2, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V

    .line 4
    :goto_e2
    invoke-virtual {v2, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;->くし〴〺ぅ(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;)V

    .line 5
    invoke-virtual {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;->げつ〴ぬぐ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v0

    .line 6
    :goto_e9
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    goto :goto_f8

    :cond_ec
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ごづごきえ:Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v1

    iput v3, v0, Landroid/graphics/Rect;->top:I

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    :cond_f8
    :goto_f8
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻:Landroid/graphics/Rect;

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->へぬ〴づぞ(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z

    if-lt v10, v11, :cond_11a

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉ〲なぱぽた:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11a

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉ〲なぱぽた:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    invoke-static {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びぐびあび(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    goto :goto_134

    :cond_11a
    if-ge v10, v11, :cond_134

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざっざへづ:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ごづごきえ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_134

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ざっざへづ:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ごづごきえ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ごづごきえ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ContentFrameLayout;->げつ〴ぬぐ(Landroid/graphics/Rect;)V

    :cond_134
    :goto_134
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, v2

    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v2

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v0

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getMeasuredState()I

    move-result v2

    invoke-static {v9, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v3, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v1, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    shl-int/lit8 v2, v2, 0x10

    invoke-static {v0, p2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 14

    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺふねづ〺:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_3e

    if-nez p4, :cond_8

    goto :goto_3e

    .line 1
    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びえぁぜい:Landroid/widget/OverScroller;

    float-to-int v4, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    invoke-virtual/range {v0 .. v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びえぁぜい:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I

    move-result p1

    iget-object p3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p3}, Landroid/widget/FrameLayout;->getHeight()I

    move-result p3

    const/4 p4, 0x1

    if-le p1, p3, :cond_28

    const/4 p2, 0x1

    :cond_28
    if-eqz p2, :cond_33

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず()V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->じぜこほぱ:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_3b

    .line 3
    :cond_33
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず()V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぅみぱぎぎ:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 4
    :goto_3b
    iput-boolean p4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->てぜきぽく:Z

    return p4

    :cond_3e
    :goto_3e
    return p2
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 4

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .registers 5

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .registers 6

    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->のぷのちつ:I

    add-int/2addr p1, p3

    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->のぷのちつ:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .registers 4

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺづげぺが:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;

    .line 1
    iput p3, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/いいにぽつ;->げつ〴ぬぐ:I

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->getActionBarHideOffset()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->のぷのちつ:I

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず()V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;

    if-eqz p1, :cond_1d

    check-cast p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;

    .line 3
    iget-object p2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ごづごきえ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;

    if-eqz p2, :cond_1d

    invoke-virtual {p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;->げつ〴ぬぐ()V

    const/4 p2, 0x0

    iput-object p2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ごづごきえ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぁごぐすすぃ;

    :cond_1d
    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .registers 4

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_10

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_10

    :cond_d
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺふねづ〺:Z

    return p1

    :cond_10
    :goto_10
    const/4 p1, 0x0

    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .registers 5

    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺふねづ〺:Z

    if-eqz p1, :cond_25

    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->てぜきぽく:Z

    if-nez p1, :cond_25

    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->のぷのちつ:I

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    const-wide/16 v1, 0x258

    if-gt p1, v0, :cond_1d

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず()V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぅみぱぎぎ:Ljava/lang/Runnable;

    invoke-virtual {p0, p1, v1, v2}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_25

    .line 2
    :cond_1d
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず()V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->じぜこほぱ:Ljava/lang/Runnable;

    invoke-virtual {p0, p1, v1, v2}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 3
    :cond_25
    :goto_25
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;

    if-eqz p1, :cond_2e

    check-cast p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2e
    return-void
.end method

.method public onWindowSystemUiVisibilityChanged(I)V
    .registers 9

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_9

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowSystemUiVisibilityChanged(I)V

    :cond_9
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->へぬ〴づぞ:I

    xor-int/2addr v0, p1

    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->へぬ〴づぞ:I

    and-int/lit8 v1, p1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_19

    const/4 v1, 0x1

    goto :goto_1a

    :cond_19
    const/4 v1, 0x0

    :goto_1a
    and-int/lit16 p1, p1, 0x100

    if-eqz p1, :cond_20

    const/4 p1, 0x1

    goto :goto_21

    :cond_20
    const/4 p1, 0x0

    :goto_21
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;

    if-eqz v4, :cond_48

    xor-int/lit8 v5, p1, 0x1

    move-object v6, v4

    check-cast v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;

    .line 1
    iput-boolean v5, v6, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ぇぬぎばつ:Z

    if-nez v1, :cond_3d

    if-nez p1, :cond_31

    goto :goto_3d

    .line 2
    :cond_31
    check-cast v4, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;

    .line 3
    iget-boolean p1, v4, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ぉざぅち〻:Z

    if-nez p1, :cond_48

    iput-boolean v3, v4, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ぉざぅち〻:Z

    invoke-virtual {v4, v3}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ぶでにく〼〳(Z)V

    goto :goto_48

    .line 4
    :cond_3d
    :goto_3d
    check-cast v4, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;

    .line 5
    iget-boolean p1, v4, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ぉざぅち〻:Z

    if-eqz p1, :cond_48

    iput-boolean v2, v4, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ぉざぅち〻:Z

    invoke-virtual {v4, v3}, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->ぶでにく〼〳(Z)V

    :cond_48
    :goto_48
    and-int/lit16 p1, v0, 0x100

    if-eqz p1, :cond_53

    .line 6
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;

    if-eqz p1, :cond_53

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぷぞてのほき(Landroid/view/View;)V

    :cond_53
    return-void
.end method

.method public onWindowVisibilityChanged(I)V
    .registers 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V

    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->くし〴〺ぅ:I

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;

    if-eqz v0, :cond_d

    check-cast v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;

    .line 1
    iput p1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->おぐぴう〸ず:I

    :cond_d
    return-void
.end method

.method public setActionBarHideOffset(I)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    neg-int p1, p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    return-void
.end method

.method public setActionBarVisibilityCallback(Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;)V
    .registers 3

    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_1a

    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/ActionBarOverlayLayout$びぐびあび;

    iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->くし〴〺ぅ:I

    check-cast p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;

    .line 1
    iput v0, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/〻ぞまぎな〻;->おぐぴう〸ず:I

    .line 2
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->へぬ〴づぞ:I

    if-eqz p1, :cond_1a

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onWindowSystemUiVisibilityChanged(I)V

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぷぞてのほき(Landroid/view/View;)V

    :cond_1a
    return-void
.end method

.method public setHasNonEmbeddedTabs(Z)V
    .registers 2

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->いいにぽつ:Z

    return-void
.end method

.method public setHideOnContentScrollEnabled(Z)V
    .registers 3

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺふねづ〺:Z

    if-eq p1, v0, :cond_f

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺふねづ〺:Z

    if-nez p1, :cond_f

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->おぐぴう〸ず()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    :cond_f
    return-void
.end method

.method public setIcon(I)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setIcon(I)V

    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setLogo(I)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->おぐぴう〸ず(I)V

    return-void
.end method

.method public setMenu(Landroid/view/Menu;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setMenu(Landroid/view/Menu;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;)V

    return-void
.end method

.method public setMenuPrepared()V
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setMenuPrepared()V

    return-void
.end method

.method public setOverlayMode(Z)V
    .registers 3

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぺぁあねじ:Z

    if-eqz p1, :cond_14

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v0, 0x13

    if-ge p1, v0, :cond_14

    const/4 p1, 0x1

    goto :goto_15

    :cond_14
    const/4 p1, 0x0

    :goto_15
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〳ぜぞぜべっ:Z

    return-void
.end method

.method public setShowingForActionMode(Z)V
    .registers 2

    return-void
.end method

.method public setUiOptions(I)V
    .registers 2

    return-void
.end method

.method public setWindowCallback(Landroid/view/Window$Callback;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setWindowCallback(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public setWindowTitle(Ljava/lang/CharSequence;)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public 〳ぜぞぜべっ(Landroid/view/View;II[II)V
    .registers 6

    if-nez p5, :cond_5

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_5
    return-void
.end method

.method public 〺つふすそ()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->〺つふすそ()Z

    move-result v0

    return v0
.end method

.method public ぁごぐすすぃ(Landroid/view/View;I)V
    .registers 3

    if-nez p2, :cond_5

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStopNestedScroll(Landroid/view/View;)V

    :cond_5
    return-void
.end method

.method public いいにぽつ()V
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->なぎぱいぢぎ()V

    return-void
.end method

.method public final ぇぬぎばつ(Landroid/content/Context;)V
    .registers 6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉひのべい:[I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〺つふすそ:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-nez v3, :cond_20

    const/4 v3, 0x1

    goto :goto_21

    :cond_20
    const/4 v3, 0x0

    :goto_21
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v3, 0x13

    if-ge v0, v3, :cond_32

    const/4 v1, 0x1

    :cond_32
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->〳ぜぞぜべっ:Z

    new-instance v0, Landroid/widget/OverScroller;

    invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びえぁぜい:Landroid/widget/OverScroller;

    return-void
.end method

.method public ぉざぅち〻()V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    if-nez v0, :cond_4d

    sget v0, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->action_bar_activity_content:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->びぐびあび:Landroidx/appcompat/widget/ContentFrameLayout;

    sget v0, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->action_bar_container:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContainer;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->づざかべべ:Landroidx/appcompat/widget/ActionBarContainer;

    sget v0, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->action_bar:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1
    instance-of v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    if-eqz v1, :cond_25

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    goto :goto_2f

    :cond_25
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    if-eqz v1, :cond_32

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    move-result-object v0

    .line 2
    :goto_2f
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    goto :goto_4d

    .line 3
    :cond_32
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Can\'t make a decor toolbar out of "

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4d
    :goto_4d
    return-void
.end method

.method public おぐぴう〸ず()V
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぅみぱぎぎ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->じぜこほぱ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぶひせが:Landroid/view/ViewPropertyAnimator;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    :cond_11
    return-void
.end method

.method public くし〴〺ぅ()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->くし〴〺ぅ()Z

    move-result v0

    return v0
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->げつ〴ぬぐ()Z

    move-result v0

    return v0
.end method

.method public づざかべべ()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->づざかべべ()Z

    move-result v0

    return v0
.end method

.method public てぜきぽく(Landroid/view/View;IIIII)V
    .registers 7

    if-nez p6, :cond_5

    invoke-virtual/range {p0 .. p5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScroll(Landroid/view/View;IIII)V

    :cond_5
    return-void
.end method

.method public なぎぱいぢぎ(Landroid/view/View;Landroid/view/View;II)V
    .registers 5

    if-nez p4, :cond_5

    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_5
    return-void
.end method

.method public のぷのちつ(Landroid/view/View;Landroid/view/View;II)Z
    .registers 5

    if-nez p4, :cond_a

    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result p1

    if-eqz p1, :cond_a

    const/4 p1, 0x1

    goto :goto_b

    :cond_a
    const/4 p1, 0x0

    :goto_b
    return p1
.end method

.method public びぐびあび()Z
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->びぐびあび()Z

    move-result v0

    return v0
.end method

.method public final へぬ〴づぞ(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z
    .registers 9

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    const/4 v0, 0x1

    if-eqz p3, :cond_13

    iget p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, p2, Landroid/graphics/Rect;->left:I

    if-eq p3, v1, :cond_13

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/4 p3, 0x1

    goto :goto_14

    :cond_13
    const/4 p3, 0x0

    :goto_14
    if-eqz p4, :cond_1f

    iget p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, p2, Landroid/graphics/Rect;->top:I

    if-eq p4, v1, :cond_1f

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/4 p3, 0x1

    :cond_1f
    if-eqz p6, :cond_2a

    iget p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget p6, p2, Landroid/graphics/Rect;->right:I

    if-eq p4, p6, :cond_2a

    iput p6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 p3, 0x1

    :cond_2a
    if-eqz p5, :cond_35

    iget p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    if-eq p4, p2, :cond_35

    iput p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_36

    :cond_35
    move v0, p3

    :goto_36
    return v0
.end method

.method public ぺぁあねじ(I)V
    .registers 3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ぉざぅち〻()V

    const/4 v0, 0x2

    if-eq p1, v0, :cond_19

    const/4 v0, 0x5

    if-eq p1, v0, :cond_13

    const/16 v0, 0x6d

    if-eq p1, v0, :cond_e

    goto :goto_1e

    :cond_e
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setOverlayMode(Z)V

    goto :goto_1e

    :cond_13
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->ごづごきえ()V

    goto :goto_1e

    :cond_19
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->は〲ぱなで()V

    :goto_1e
    return-void
.end method

.method public ぺふねづ〺(Landroid/view/View;IIIII[I)V
    .registers 8

    if-nez p6, :cond_5

    .line 1
    invoke-virtual/range {p0 .. p5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScroll(Landroid/view/View;IIII)V

    :cond_5
    return-void
.end method
