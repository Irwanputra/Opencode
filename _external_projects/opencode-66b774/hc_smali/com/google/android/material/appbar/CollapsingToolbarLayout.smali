.class public Lcom/google/android/material/appbar/CollapsingToolbarLayout;
.super Landroid/widget/FrameLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;,
        Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;
    }
.end annotation


# static fields
.field public static final ぉ〲なぱぽた:I


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:Z

.field public 〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

.field public ぁごぐすすぃ:I

.field public いいにぽつ:I

.field public ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

.field public ぉざぅち〻:I

.field public おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

.field public くし〴〺ぅ:I

.field public ごづごきえ:J

.field public ざっざへづ:I

.field public ざとぅぼこ〺:Z

.field public づざかべべ:Landroid/view/View;

.field public final てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

.field public でどあくず:Lcom/google/android/material/appbar/AppBarLayout$くし〴〺ぅ;

.field public なぎぱいぢぎ:Landroid/view/View;

.field public のぷのちつ:Z

.field public は〲ぱなで:Landroid/animation/ValueAnimator;

.field public びぐびあび:Landroidx/appcompat/widget/Toolbar;

.field public ぶでにく〼〳:I

.field public へぬ〴づぞ:Z

.field public ぺぁあねじ:I

.field public final ぺふねづ〺:Landroid/graphics/Rect;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_Design_CollapsingToolbar:I

    sput v0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉ〲なぱぽた:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 13

    sget v4, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉ〲なぱぽた:I

    invoke-static {p1, p2, p3, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〺つふすそ:Z

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺふねづ〺:Landroid/graphics/Rect;

    const/4 v6, -0x1

    iput v6, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ざっざへづ:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-direct {v7, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;-><init>(Landroid/view/View;)V

    iput-object v7, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/げつ〴ぬぐ;->づざかべべ:Landroid/animation/TimeInterpolator;

    .line 1
    iput-object v1, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->おかぷせ〱:Landroid/animation/TimeInterpolator;

    invoke-virtual {v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->のぷのちつ()V

    .line 2
    sget-object v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout:[I

    const/4 v8, 0x0

    new-array v5, v8, [I

    move-object v1, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_expandedTitleGravity:I

    const v0, 0x800053

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    invoke-virtual {v7, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ざっざへづ(I)V

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_collapsedTitleGravity:I

    const v0, 0x800013

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    invoke-virtual {v7, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぉざぅち〻(I)V

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_expandedTitleMargin:I

    invoke-virtual {p2, p3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->いいにぽつ:I

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺぁあねじ:I

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〳ぜぞぜべっ:I

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぁごぐすすぃ:I

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_expandedTitleMarginStart:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_67

    invoke-virtual {p2, p3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぁごぐすすぃ:I

    :cond_67
    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_expandedTitleMarginEnd:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_75

    invoke-virtual {p2, p3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺぁあねじ:I

    :cond_75
    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_expandedTitleMarginTop:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_83

    invoke-virtual {p2, p3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〳ぜぞぜべっ:I

    :cond_83
    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_expandedTitleMarginBottom:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_91

    invoke-virtual {p2, p3, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->いいにぽつ:I

    :cond_91
    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_titleEnabled:I

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_title:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setTitle(Ljava/lang/CharSequence;)V

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->TextAppearance_Design_CollapsingToolbar_Expanded:I

    invoke-virtual {v7, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->は〲ぱなで(I)V

    sget p3, Lづざかべべ/〺つふすそ/ぺぁあねじ;->TextAppearance_AppCompat_Widget_ActionBar_Title:I

    invoke-virtual {v7, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->おぐぴう〸ず(I)V

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_expandedTitleTextAppearance:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_bb

    invoke-virtual {p2, p3, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {v7, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->は〲ぱなで(I)V

    :cond_bb
    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_collapsedTitleTextAppearance:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_ca

    invoke-virtual {p2, p3, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {v7, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->おぐぴう〸ず(I)V

    :cond_ca
    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_scrimVisibleHeightTrigger:I

    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ざっざへづ:I

    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_maxLines:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_ea

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    .line 3
    iget p3, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->くねねぱす〻:I

    if-eq p1, p3, :cond_ea

    iput p1, v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->くねねぱす〻:I

    invoke-virtual {v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->なぎぱいぢぎ()V

    invoke-virtual {v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->のぷのちつ()V

    .line 4
    :cond_ea
    sget p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_scrimAnimationDuration:I

    const/16 p3, 0x258

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ごづごきえ:J

    sget p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_contentScrim:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setContentScrim(Landroid/graphics/drawable/Drawable;)V

    sget p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_statusBarScrim:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setStatusBarScrim(Landroid/graphics/drawable/Drawable;)V

    sget p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->CollapsingToolbarLayout_toolbarId:I

    invoke-virtual {p2, p1, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->くし〴〺ぅ:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, v8}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V

    new-instance p1, Lcom/google/android/material/appbar/CollapsingToolbarLayout$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout$げつ〴ぬぐ;-><init>(Lcom/google/android/material/appbar/CollapsingToolbarLayout;)V

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ち〴みぎ〻び(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぺふねづ〺;)V

    return-void
.end method

.method public static 〺つふすそ(Landroid/view/View;)I
    .registers 3

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_15

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p0, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p0, v0

    return p0

    :cond_15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    return p0
.end method

.method public static びぐびあび(Landroid/view/View;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;
    .registers 3

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->view_offset_helper:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    if-nez v1, :cond_12

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;-><init>(Landroid/view/View;)V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_12
    return-object v1
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 2

    instance-of p1, p1, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;

    return p1
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 8

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->げつ〴ぬぐ()V

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-nez v0, :cond_20

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_20

    iget v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    if-lez v1, :cond_20

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_20
    iget-boolean v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    if-eqz v0, :cond_2d

    iget-boolean v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->へぬ〴づぞ:Z

    if-eqz v0, :cond_2d

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/graphics/Canvas;)V

    :cond_2d
    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_61

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    if-lez v0, :cond_61

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    const/4 v1, 0x0

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v0

    goto :goto_40

    :cond_3f
    const/4 v0, 0x0

    :goto_40
    if-lez v0, :cond_61

    iget-object v2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぶでにく〼〳:I

    neg-int v3, v3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v4

    iget v5, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぶでにく〼〳:I

    sub-int/2addr v0, v5

    invoke-virtual {v2, v1, v3, v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_61
    return-void
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .registers 9

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2d

    iget v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    if-lez v3, :cond_2d

    .line 1
    iget-object v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->づざかべべ:Landroid/view/View;

    if-eqz v3, :cond_14

    if-ne v3, p0, :cond_11

    goto :goto_14

    :cond_11
    if-ne p2, v3, :cond_1a

    goto :goto_18

    :cond_14
    :goto_14
    iget-object v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-ne p2, v3, :cond_1a

    :goto_18
    const/4 v3, 0x1

    goto :goto_1b

    :cond_1a
    const/4 v3, 0x0

    :goto_1b
    if-eqz v3, :cond_2d

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    const/4 v0, 0x1

    goto :goto_2e

    :cond_2d
    const/4 v0, 0x0

    :goto_2e
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p1

    if-nez p1, :cond_38

    if-eqz v0, :cond_37

    goto :goto_38

    :cond_37
    const/4 v1, 0x0

    :cond_38
    :goto_38
    return v1
.end method

.method public drawableStateChanged()V
    .registers 5

    invoke-super {p0}, Landroid/widget/FrameLayout;->drawableStateChanged()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDrawableState()[I

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v1

    or-int/2addr v2, v1

    :cond_17
    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_26

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v3

    if-eqz v3, :cond_26

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v1

    or-int/2addr v2, v1

    :cond_26
    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    if-eqz v1, :cond_2f

    invoke-virtual {v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぉ〲なぱぽた([I)Z

    move-result v0

    or-int/2addr v2, v0

    :cond_2f
    if-eqz v2, :cond_34

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V

    :cond_34
    return-void
.end method

.method public generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 1
    new-instance v0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateDefaultLayoutParams()Landroid/widget/FrameLayout$LayoutParams;
    .registers 3

    .line 2
    new-instance v0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 1
    new-instance v0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;

    invoke-direct {v0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/FrameLayout$LayoutParams;
    .registers 4

    new-instance v0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public getCollapsedTitleGravity()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    return v0
.end method

.method public getCollapsedTitleTypeface()Landroid/graphics/Typeface;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->は〲ぱなで:Landroid/graphics/Typeface;

    if-eqz v0, :cond_7

    goto :goto_9

    :cond_7
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :goto_9
    return-object v0
.end method

.method public getContentScrim()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getExpandedTitleGravity()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぁごぐすすぃ:I

    return v0
.end method

.method public getExpandedTitleMarginBottom()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->いいにぽつ:I

    return v0
.end method

.method public getExpandedTitleMarginEnd()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺぁあねじ:I

    return v0
.end method

.method public getExpandedTitleMarginStart()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぁごぐすすぃ:I

    return v0
.end method

.method public getExpandedTitleMarginTop()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〳ぜぞぜべっ:I

    return v0
.end method

.method public getExpandedTitleTypeface()Landroid/graphics/Typeface;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ごづごきえ:Landroid/graphics/Typeface;

    if-eqz v0, :cond_7

    goto :goto_9

    :cond_7
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :goto_9
    return-object v0
.end method

.method public getMaxLines()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->くねねぱす〻:I

    return v0
.end method

.method public getScrimAlpha()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    return v0
.end method

.method public getScrimAnimationDuration()J
    .registers 3

    iget-wide v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ごづごきえ:J

    return-wide v0
.end method

.method public getScrimVisibleHeightTrigger()I
    .registers 3

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ざっざへづ:I

    if-ltz v0, :cond_5

    return v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v0

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇぬぎばつ(Landroid/view/View;)I

    move-result v1

    if-lez v1, :cond_21

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_21
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    return v0
.end method

.method public getStatusBarScrim()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->〻ぞまぎな〻:Ljava/lang/CharSequence;

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return-object v0
.end method

.method public onAttachedToWindow()V
    .registers 4

    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz v1, :cond_41

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v1

    .line 1
    invoke-virtual {p0, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 2
    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->でどあくず:Lcom/google/android/material/appbar/AppBarLayout$くし〴〺ぅ;

    if-nez v1, :cond_20

    new-instance v1, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;

    invoke-direct {v1, p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;-><init>(Lcom/google/android/material/appbar/CollapsingToolbarLayout;)V

    iput-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->でどあくず:Lcom/google/android/material/appbar/AppBarLayout$くし〴〺ぅ;

    :cond_20
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->でどあくず:Lcom/google/android/material/appbar/AppBarLayout$くし〴〺ぅ;

    .line 3
    iget-object v2, v0, Lcom/google/android/material/appbar/AppBarLayout;->ぺぁあねじ:Ljava/util/List;

    if-nez v2, :cond_2f

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/google/android/material/appbar/AppBarLayout;->ぺぁあねじ:Ljava/util/List;

    :cond_2f
    if-eqz v1, :cond_3e

    iget-object v2, v0, Lcom/google/android/material/appbar/AppBarLayout;->ぺぁあねじ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3e

    iget-object v0, v0, Lcom/google/android/material/appbar/AppBarLayout;->ぺぁあねじ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    :cond_3e
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぷぞてのほき(Landroid/view/View;)V

    :cond_41
    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 4

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->でどあくず:Lcom/google/android/material/appbar/AppBarLayout$くし〴〺ぅ;

    if-eqz v1, :cond_17

    instance-of v2, v0, Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz v2, :cond_17

    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 1
    iget-object v0, v0, Lcom/google/android/material/appbar/AppBarLayout;->ぺぁあねじ:Ljava/util/List;

    if-eqz v0, :cond_17

    if-eqz v1, :cond_17

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2
    :cond_17
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 14

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    const/4 v0, 0x0

    if-eqz p1, :cond_29

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_11
    if-ge v2, v1, :cond_29

    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_26

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v4

    if-ge v4, p1, :cond_26

    invoke-static {v3, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    :cond_26
    add-int/lit8 v2, v2, 0x1

    goto :goto_11

    :cond_29
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result p1

    const/4 v1, 0x0

    :goto_2e
    if-ge v1, p1, :cond_4b

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび(Landroid/view/View;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    move-result-object v2

    .line 1
    iget-object v3, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    iput v3, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->〺つふすそ:I

    iget-object v3, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    iput v3, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->くし〴〺ぅ:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2e

    .line 2
    :cond_4b
    iget-boolean p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    if-eqz p1, :cond_108

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    if-eqz p1, :cond_108

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->でどあくず(Landroid/view/View;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_64

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_64

    const/4 p1, 0x1

    goto :goto_65

    :cond_64
    const/4 p1, 0x0

    :goto_65
    iput-boolean p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->へぬ〴づぞ:Z

    if-eqz p1, :cond_108

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result p1

    if-ne p1, v1, :cond_71

    const/4 p1, 0x1

    goto :goto_72

    :cond_71
    const/4 p1, 0x0

    :goto_72
    iget-object v2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->づざかべべ:Landroid/view/View;

    if-eqz v2, :cond_77

    goto :goto_79

    :cond_77
    iget-object v2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    :goto_79
    invoke-virtual {p0, v2}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    iget-object v4, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺふねづ〺:Landroid/graphics/Rect;

    invoke-static {p0, v3, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〺つふすそ;->げつ〴ぬぐ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    iget-object v4, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺふねづ〺:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    iget-object v5, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-eqz p1, :cond_93

    invoke-virtual {v5}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginEnd()I

    move-result v5

    goto :goto_97

    :cond_93
    invoke-virtual {v5}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginStart()I

    move-result v5

    :goto_97
    add-int/2addr v4, v5

    iget-object v5, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺふねづ〺:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v2

    iget-object v6, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v6}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginTop()I

    move-result v6

    add-int/2addr v6, v5

    iget-object v5, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺふねづ〺:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    iget-object v7, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-eqz p1, :cond_b1

    invoke-virtual {v7}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginStart()I

    move-result v7

    goto :goto_b5

    :cond_b1
    invoke-virtual {v7}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginEnd()I

    move-result v7

    :goto_b5
    sub-int/2addr v5, v7

    iget-object v7, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺふねづ〺:Landroid/graphics/Rect;

    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v7, v2

    iget-object v2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->getTitleMarginBottom()I

    move-result v2

    sub-int/2addr v7, v2

    .line 3
    iget-object v2, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->づざかべべ:Landroid/graphics/Rect;

    invoke-static {v2, v4, v6, v5, v7}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->へぬ〴づぞ(Landroid/graphics/Rect;IIII)Z

    move-result v2

    if-nez v2, :cond_d4

    iget-object v2, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->づざかべべ:Landroid/graphics/Rect;

    invoke-virtual {v2, v4, v6, v5, v7}, Landroid/graphics/Rect;->set(IIII)V

    iput-boolean v1, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぉひのべい:Z

    invoke-virtual {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->てぜきぽく()V

    .line 4
    :cond_d4
    iget-object v2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    if-eqz p1, :cond_db

    iget v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺぁあねじ:I

    goto :goto_dd

    :cond_db
    iget v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぁごぐすすぃ:I

    :goto_dd
    iget-object v4, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺふねづ〺:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    iget v5, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〳ぜぞぜべっ:I

    add-int/2addr v4, v5

    sub-int/2addr p4, p2

    if-eqz p1, :cond_ea

    iget p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぁごぐすすぃ:I

    goto :goto_ec

    :cond_ea
    iget p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺぁあねじ:I

    :goto_ec
    sub-int/2addr p4, p1

    sub-int/2addr p5, p3

    iget p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->いいにぽつ:I

    sub-int/2addr p5, p1

    .line 5
    iget-object p1, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->びぐびあび:Landroid/graphics/Rect;

    invoke-static {p1, v3, v4, p4, p5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->へぬ〴づぞ(Landroid/graphics/Rect;IIII)Z

    move-result p1

    if-nez p1, :cond_103

    iget-object p1, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->びぐびあび:Landroid/graphics/Rect;

    invoke-virtual {p1, v3, v4, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    iput-boolean v1, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぉひのべい:Z

    invoke-virtual {v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->てぜきぽく()V

    .line 6
    :cond_103
    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->のぷのちつ()V

    :cond_108
    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-eqz p1, :cond_132

    iget-boolean p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    if-eqz p1, :cond_123

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 7
    iget-object p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->〻ぞまぎな〻:Ljava/lang/CharSequence;

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_123

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setTitle(Ljava/lang/CharSequence;)V

    :cond_123
    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->づざかべべ:Landroid/view/View;

    if-eqz p1, :cond_129

    if-ne p1, p0, :cond_12b

    :cond_129
    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    :cond_12b
    invoke-static {p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〺つふすそ(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setMinimumHeight(I)V

    :cond_132
    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result p1

    :goto_139
    if-ge v0, p1, :cond_149

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび(Landroid/view/View;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    move-result-object p2

    invoke-virtual {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->げつ〴ぬぐ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_139

    :cond_149
    return-void
.end method

.method public onMeasure(II)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->げつ〴ぬぐ()V

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result v0

    goto :goto_14

    :cond_13
    const/4 v0, 0x0

    :goto_14
    if-nez p2, :cond_26

    if-lez v0, :cond_26

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result p2

    add-int/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    :cond_26
    return-void
.end method

.method public onSizeChanged(IIII)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    iget-object p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-eqz p3, :cond_b

    const/4 p4, 0x0

    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_b
    return-void
.end method

.method public setCollapsedTitleGravity(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    if-eq v1, p1, :cond_b

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->のぷのちつ()V

    :cond_b
    return-void
.end method

.method public setCollapsedTitleTextAppearance(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->おぐぴう〸ず(I)V

    return-void
.end method

.method public setCollapsedTitleTextColor(I)V
    .registers 2

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setCollapsedTitleTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCollapsedTitleTextColor(Landroid/content/res/ColorStateList;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->てぜきぽく:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_b

    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->てぜきぽく:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->のぷのちつ()V

    :cond_b
    return-void
.end method

.method public setCollapsedTitleTypeface(Landroid/graphics/Typeface;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ざとぅぼこ〺(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public setContentScrim(Landroid/graphics/drawable/Drawable;)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_3b

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_a
    if-eqz p1, :cond_10

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_10
    iput-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2c

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, p1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1
    :cond_2c
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_38

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_3b

    :cond_38
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_3b
    :goto_3b
    return-void
.end method

.method public setContentScrimColor(I)V
    .registers 3

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setContentScrim(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setContentScrimResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setContentScrim(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setExpandedTitleColor(I)V
    .registers 2

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setExpandedTitleTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setExpandedTitleGravity(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぁごぐすすぃ:I

    if-eq v1, p1, :cond_b

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぁごぐすすぃ:I

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->のぷのちつ()V

    :cond_b
    return-void
.end method

.method public setExpandedTitleMargin(IIII)V
    .registers 5

    iput p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぁごぐすすぃ:I

    iput p2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〳ぜぞぜべっ:I

    iput p3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺぁあねじ:I

    iput p4, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->いいにぽつ:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public setExpandedTitleMarginBottom(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->いいにぽつ:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public setExpandedTitleMarginEnd(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぺぁあねじ:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public setExpandedTitleMarginStart(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぁごぐすすぃ:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public setExpandedTitleMarginTop(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〳ぜぞぜべっ:I

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public setExpandedTitleTextAppearance(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->は〲ぱなで(I)V

    return-void
.end method

.method public setExpandedTitleTextColor(Landroid/content/res/ColorStateList;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_b

    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->のぷのちつ()V

    :cond_b
    return-void
.end method

.method public setExpandedTitleTypeface(Landroid/graphics/Typeface;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->でどあくず(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public setMaxLines(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->くねねぱす〻:I

    if-eq p1, v1, :cond_e

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->くねねぱす〻:I

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->なぎぱいぢぎ()V

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->のぷのちつ()V

    :cond_e
    return-void
.end method

.method public setScrimAlpha(I)V
    .registers 3

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    if-eq p1, v0, :cond_20

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_f

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->どぇぞほだ(Landroid/view/View;)V

    :cond_f
    iput p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    .line 1
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_1d

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_20

    :cond_1d
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_20
    :goto_20
    return-void
.end method

.method public setScrimAnimationDuration(J)V
    .registers 3

    iput-wide p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ごづごきえ:J

    return-void
.end method

.method public setScrimVisibleHeightTrigger(I)V
    .registers 3

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ざっざへづ:I

    if-eq v0, p1, :cond_9

    iput p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ざっざへづ:I

    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ()V

    :cond_9
    return-void
.end method

.method public setScrimsShown(Z)V
    .registers 3

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x1

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setScrimsShown(ZZ)V

    return-void
.end method

.method public setScrimsShown(ZZ)V
    .registers 7

    iget-boolean v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ざとぅぼこ〺:Z

    if-eq v0, p1, :cond_62

    const/16 v0, 0xff

    const/4 v1, 0x0

    if-eqz p2, :cond_59

    if-eqz p1, :cond_c

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    .line 1
    :goto_d
    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->げつ〴ぬぐ()V

    iget-object p2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->は〲ぱなで:Landroid/animation/ValueAnimator;

    if-nez p2, :cond_39

    new-instance p2, Landroid/animation/ValueAnimator;

    invoke-direct {p2}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object p2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->は〲ぱなで:Landroid/animation/ValueAnimator;

    iget-wide v2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ごづごきえ:J

    invoke-virtual {p2, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->は〲ぱなで:Landroid/animation/ValueAnimator;

    iget v2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    if-le v0, v2, :cond_29

    sget-object v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/animation/TimeInterpolator;

    goto :goto_2b

    :cond_29
    sget-object v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/げつ〴ぬぐ;->びぐびあび:Landroid/animation/TimeInterpolator;

    :goto_2b
    invoke-virtual {p2, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object p2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->は〲ぱなで:Landroid/animation/ValueAnimator;

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/づざかべべ;

    invoke-direct {v2, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/づざかべべ;-><init>(Lcom/google/android/material/appbar/CollapsingToolbarLayout;)V

    invoke-virtual {p2, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_44

    :cond_39
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_44

    iget-object p2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->は〲ぱなで:Landroid/animation/ValueAnimator;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_44
    :goto_44
    iget-object p2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->は〲ぱなで:Landroid/animation/ValueAnimator;

    const/4 v2, 0x2

    new-array v2, v2, [I

    iget v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    aput v3, v2, v1

    const/4 v1, 0x1

    aput v0, v2, v1

    invoke-virtual {p2, v2}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    iget-object p2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->は〲ぱなで:Landroid/animation/ValueAnimator;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_60

    :cond_59
    if-eqz p1, :cond_5c

    goto :goto_5d

    :cond_5c
    const/4 v0, 0x0

    .line 2
    :goto_5d
    invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setScrimAlpha(I)V

    :goto_60
    iput-boolean p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ざとぅぼこ〺:Z

    :cond_62
    return-void
.end method

.method public setStatusBarScrim(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_56

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_a
    if-eqz p1, :cond_10

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_10
    iput-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_47

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p1

    if-eqz p1, :cond_23

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_23
    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぉねぞはがぞ(Landroid/graphics/drawable/Drawable;I)Z

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_37

    const/4 v0, 0x1

    goto :goto_38

    :cond_37
    const/4 v0, 0x0

    :goto_38
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぉざぅち〻:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1
    :cond_47
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_53

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_56

    :cond_53
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_56
    :goto_56
    return-void
.end method

.method public setStatusBarScrimColor(I)V
    .registers 3

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setStatusBarScrim(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStatusBarScrimResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setStatusBarScrim(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぇ〳〲〺すっ(Ljava/lang/CharSequence;)V

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleEnabled(Z)V
    .registers 3

    iget-boolean v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    if-eq p1, v0, :cond_13

    iput-boolean p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 2
    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->づざかべべ()V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    :cond_13
    return-void
.end method

.method public setVisibility(I)V
    .registers 4

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    const/4 p1, 0x0

    :goto_9
    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-eq v1, p1, :cond_18

    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_18
    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_27

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-eq v1, p1, :cond_27

    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_27
    return-void
.end method

.method public verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_11

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_f

    goto :goto_11

    :cond_f
    const/4 p1, 0x0

    goto :goto_12

    :cond_11
    :goto_11
    const/4 p1, 0x1

    :goto_12
    return p1
.end method

.method public final くし〴〺ぅ(Landroid/view/View;)I
    .registers 5

    invoke-static {p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび(Landroid/view/View;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->〺つふすそ:I

    sub-int/2addr v2, v0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    sub-int/2addr v2, p1

    iget p1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v2, p1

    return v2
.end method

.method public final げつ〴ぬぐ()V
    .registers 7

    iget-boolean v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〺つふすそ:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iput-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->づざかべべ:Landroid/view/View;

    iget v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->くし〴〺ぅ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2f

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    iput-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-eqz v1, :cond_2f

    .line 1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    :goto_1d
    if-eq v2, p0, :cond_2d

    if-eqz v2, :cond_2d

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_28

    move-object v1, v2

    check-cast v1, Landroid/view/View;

    :cond_28
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_1d

    .line 2
    :cond_2d
    iput-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->づざかべべ:Landroid/view/View;

    :cond_2f
    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    const/4 v2, 0x0

    if-nez v1, :cond_4c

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v1

    const/4 v3, 0x0

    :goto_39
    if-ge v3, v1, :cond_4a

    invoke-virtual {p0, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Landroidx/appcompat/widget/Toolbar;

    if-eqz v5, :cond_47

    move-object v0, v4

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    goto :goto_4a

    :cond_47
    add-int/lit8 v3, v3, 0x1

    goto :goto_39

    :cond_4a
    :goto_4a
    iput-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    :cond_4c
    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->づざかべべ()V

    iput-boolean v2, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〺つふすそ:Z

    return-void
.end method

.method public final づざかべべ()V
    .registers 4

    iget-boolean v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_17

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_17
    iget-boolean v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->のぷのちつ:Z

    if-eqz v0, :cond_3e

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_3e

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    if-nez v0, :cond_2e

    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    :cond_2e
    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_3e

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ:Landroid/view/View;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    :cond_3e
    return-void
.end method

.method public final なぎぱいぢぎ()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->おぐぴう〸ず:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1b

    :cond_8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    iget v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぶでにく〼〳:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->getScrimVisibleHeightTrigger()I

    move-result v1

    if-ge v0, v1, :cond_17

    const/4 v0, 0x1

    goto :goto_18

    :cond_17
    const/4 v0, 0x0

    :goto_18
    invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setScrimsShown(Z)V

    :cond_1b
    return-void
.end method
