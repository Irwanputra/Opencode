.class public Lcom/github/clans/fab/Label;
.super Landroid/widget/TextView;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/clans/fab/Label$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static final ごづごきえ:Landroid/graphics/Xfermode;


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Z

.field public いいにぽつ:I

.field public ぇぬぎばつ:Landroid/view/animation/Animation;

.field public ぉざぅち〻:Z

.field public おぐぴう〸ず:Landroid/view/animation/Animation;

.field public くし〴〺ぅ:I

.field public ざとぅぼこ〺:Z

.field public づざかべべ:I

.field public てぜきぽく:I

.field public なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

.field public のぷのちつ:I

.field public は〲ぱなで:Landroid/view/GestureDetector;

.field public びぐびあび:I

.field public へぬ〴づぞ:Lcom/github/clans/fab/FloatingActionButton;

.field public ぺぁあねじ:I

.field public ぺふねづ〺:I


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    sput-object v0, Lcom/github/clans/fab/Label;->ごづごきえ:Landroid/graphics/Xfermode;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ざとぅぼこ〺:Z

    new-instance p1, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/github/clans/fab/Label$〺つふすそ;

    invoke-direct {v1, p0}, Lcom/github/clans/fab/Label$〺つふすそ;-><init>(Lcom/github/clans/fab/Label;)V

    invoke-direct {p1, v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p1, p0, Lcom/github/clans/fab/Label;->は〲ぱなで:Landroid/view/GestureDetector;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ざとぅぼこ〺:Z

    new-instance p1, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance v0, Lcom/github/clans/fab/Label$〺つふすそ;

    invoke-direct {v0, p0}, Lcom/github/clans/fab/Label$〺つふすそ;-><init>(Lcom/github/clans/fab/Label;)V

    invoke-direct {p1, p2, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p1, p0, Lcom/github/clans/fab/Label;->は〲ぱなで:Landroid/view/GestureDetector;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ざとぅぼこ〺:Z

    new-instance p1, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance p3, Lcom/github/clans/fab/Label$〺つふすそ;

    invoke-direct {p3, p0}, Lcom/github/clans/fab/Label$〺つふすそ;-><init>(Lcom/github/clans/fab/Label;)V

    invoke-direct {p1, p2, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p1, p0, Lcom/github/clans/fab/Label;->は〲ぱなで:Landroid/view/GestureDetector;

    return-void
.end method

.method private setBackgroundCompat(Landroid/graphics/drawable/Drawable;)V
    .registers 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_f

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_12

    :cond_f
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_12
    return-void
.end method

.method private setShadow(Lcom/github/clans/fab/FloatingActionButton;)V
    .registers 3

    invoke-virtual {p1}, Lcom/github/clans/fab/FloatingActionButton;->getShadowColor()I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/Label;->づざかべべ:I

    invoke-virtual {p1}, Lcom/github/clans/fab/FloatingActionButton;->getShadowRadius()I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/Label;->〺つふすそ:I

    invoke-virtual {p1}, Lcom/github/clans/fab/FloatingActionButton;->getShadowXOffset()I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/Label;->くし〴〺ぅ:I

    invoke-virtual {p1}, Lcom/github/clans/fab/FloatingActionButton;->getShadowYOffset()I

    move-result v0

    iput v0, p0, Lcom/github/clans/fab/Label;->びぐびあび:I

    invoke-virtual {p1}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result p1

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .registers 5

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 1
    iget p1, p0, Lcom/github/clans/fab/Label;->〳ぜぞぜべっ:I

    if-nez p1, :cond_d

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    iput p1, p0, Lcom/github/clans/fab/Label;->〳ぜぞぜべっ:I

    :cond_d
    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    .line 2
    iget-boolean p2, p0, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_20

    iget p2, p0, Lcom/github/clans/fab/Label;->〺つふすそ:I

    iget v1, p0, Lcom/github/clans/fab/Label;->くし〴〺ぅ:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v1, p2

    goto :goto_21

    :cond_20
    const/4 v1, 0x0

    :goto_21
    add-int/2addr p1, v1

    .line 3
    iget p2, p0, Lcom/github/clans/fab/Label;->ぺぁあねじ:I

    if-nez p2, :cond_2c

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result p2

    iput p2, p0, Lcom/github/clans/fab/Label;->ぺぁあねじ:I

    :cond_2c
    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result p2

    .line 4
    iget-boolean v1, p0, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_3d

    iget v0, p0, Lcom/github/clans/fab/Label;->〺つふすそ:I

    iget v1, p0, Lcom/github/clans/fab/Label;->びぐびあび:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3d
    add-int/2addr p2, v0

    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 4

    iget-object v0, p0, Lcom/github/clans/fab/Label;->へぬ〴づぞ:Lcom/github/clans/fab/FloatingActionButton;

    if-eqz v0, :cond_30

    invoke-virtual {v0}, Lcom/github/clans/fab/FloatingActionButton;->getOnClickListener()Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_30

    iget-object v0, p0, Lcom/github/clans/fab/Label;->へぬ〴づぞ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_30

    :cond_13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1e

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1e

    goto :goto_26

    :cond_1e
    invoke-virtual {p0}, Lcom/github/clans/fab/Label;->びぐびあび()V

    iget-object v0, p0, Lcom/github/clans/fab/Label;->へぬ〴づぞ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-virtual {v0}, Lcom/github/clans/fab/FloatingActionButton;->ぺふねづ〺()V

    :goto_26
    iget-object v0, p0, Lcom/github/clans/fab/Label;->は〲ぱなで:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_30
    :goto_30
    invoke-super {p0, p1}, Landroid/widget/TextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setCornerRadius(I)V
    .registers 2

    iput p1, p0, Lcom/github/clans/fab/Label;->のぷのちつ:I

    return-void
.end method

.method public setFab(Lcom/github/clans/fab/FloatingActionButton;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/Label;->へぬ〴づぞ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-direct {p0, p1}, Lcom/github/clans/fab/Label;->setShadow(Lcom/github/clans/fab/FloatingActionButton;)V

    return-void
.end method

.method public setHandleVisibilityChanges(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ざとぅぼこ〺:Z

    return-void
.end method

.method public setHideAnimation(Landroid/view/animation/Animation;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/Label;->ぇぬぎばつ:Landroid/view/animation/Animation;

    return-void
.end method

.method public setShowAnimation(Landroid/view/animation/Animation;)V
    .registers 2

    iput-object p1, p0, Lcom/github/clans/fab/Label;->おぐぴう〸ず:Landroid/view/animation/Animation;

    return-void
.end method

.method public setShowShadow(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    return-void
.end method

.method public setUsingStyle(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/github/clans/fab/Label;->ぉざぅち〻:Z

    return-void
.end method

.method public final 〺つふすそ(I)Landroid/graphics/drawable/Drawable;
    .registers 7

    new-instance v0, Landroid/graphics/drawable/shapes/RoundRectShape;

    const/16 v1, 0x8

    new-array v1, v1, [F

    iget v2, p0, Lcom/github/clans/fab/Label;->のぷのちつ:I

    int-to-float v3, v2

    const/4 v4, 0x0

    aput v3, v1, v4

    int-to-float v3, v2

    const/4 v4, 0x1

    aput v3, v1, v4

    int-to-float v3, v2

    const/4 v4, 0x2

    aput v3, v1, v4

    int-to-float v3, v2

    const/4 v4, 0x3

    aput v3, v1, v4

    int-to-float v3, v2

    const/4 v4, 0x4

    aput v3, v1, v4

    int-to-float v3, v2

    const/4 v4, 0x5

    aput v3, v1, v4

    int-to-float v3, v2

    const/4 v4, 0x6

    aput v3, v1, v4

    int-to-float v2, v2

    const/4 v3, 0x7

    aput v2, v1, v3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    new-instance v1, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {v1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-object v1
.end method

.method public くし〴〺ぅ()V
    .registers 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-boolean v0, p0, Lcom/github/clans/fab/Label;->ぉざぅち〻:Z

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroid/widget/TextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/github/clans/fab/Label;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    :cond_a
    iget-object v0, p0, Lcom/github/clans/fab/Label;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/StateListDrawable;

    const/4 v2, 0x1

    if-eqz v1, :cond_1f

    check-cast v0, Landroid/graphics/drawable/StateListDrawable;

    new-array v1, v2, [I

    const/4 v2, 0x0

    const v3, 0x10100a7

    aput v3, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/StateListDrawable;->setState([I)Z

    goto :goto_48

    :cond_1f
    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->げがぴうあだ()Z

    move-result v0

    if-eqz v0, :cond_48

    iget-object v0, p0, Lcom/github/clans/fab/Label;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v1, :cond_48

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    const/4 v1, 0x2

    new-array v3, v1, [I

    fill-array-data v3, :array_4a

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/RippleDrawable;->setState([I)Z

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v3

    div-int/2addr v3, v1

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v4

    div-int/2addr v4, v1

    int-to-float v1, v4

    invoke-virtual {v0, v3, v1}, Landroid/graphics/drawable/RippleDrawable;->setHotspot(FF)V

    invoke-virtual {v0, v2, v2}, Landroid/graphics/drawable/RippleDrawable;->setVisible(ZZ)Z

    :cond_48
    :goto_48
    return-void

    nop

    :array_4a
    .array-data 4
        0x101009e
        0x10100a7
    .end array-data
.end method

.method public final げつ〴ぬぐ()Landroid/graphics/drawable/Drawable;
    .registers 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const/4 v1, 0x1

    new-array v2, v1, [I

    const v3, 0x10100a7

    const/4 v4, 0x0

    aput v3, v2, v4

    iget v3, p0, Lcom/github/clans/fab/Label;->ぺふねづ〺:I

    invoke-virtual {p0, v3}, Lcom/github/clans/fab/Label;->〺つふすそ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v2, v4, [I

    iget v3, p0, Lcom/github/clans/fab/Label;->いいにぽつ:I

    invoke-virtual {p0, v3}, Lcom/github/clans/fab/Label;->〺つふすそ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->げがぴうあだ()Z

    move-result v2

    if-eqz v2, :cond_4d

    new-instance v2, Landroid/graphics/drawable/RippleDrawable;

    new-instance v3, Landroid/content/res/ColorStateList;

    new-array v5, v1, [[I

    new-array v6, v4, [I

    aput-object v6, v5, v4

    new-array v6, v1, [I

    iget v7, p0, Lcom/github/clans/fab/Label;->てぜきぽく:I

    aput v7, v6, v4

    invoke-direct {v3, v5, v6}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    const/4 v4, 0x0

    invoke-direct {v2, v3, v0, v4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Lcom/github/clans/fab/Label$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lcom/github/clans/fab/Label$げつ〴ぬぐ;-><init>(Lcom/github/clans/fab/Label;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setClipToOutline(Z)V

    iput-object v2, p0, Lcom/github/clans/fab/Label;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    return-object v2

    :cond_4d
    iput-object v0, p0, Lcom/github/clans/fab/Label;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public づざかべべ()V
    .registers 10

    iget-boolean v0, p0, Lcom/github/clans/fab/Label;->ぁごぐすすぃ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4a

    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    new-instance v4, Lcom/github/clans/fab/Label$くし〴〺ぅ;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/github/clans/fab/Label$くし〴〺ぅ;-><init>(Lcom/github/clans/fab/Label;Lcom/github/clans/fab/Label$げつ〴ぬぐ;)V

    aput-object v4, v3, v1

    invoke-virtual {p0}, Lcom/github/clans/fab/Label;->げつ〴ぬぐ()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    aput-object v1, v3, v2

    invoke-direct {v0, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iget v1, p0, Lcom/github/clans/fab/Label;->〺つふすそ:I

    iget v2, p0, Lcom/github/clans/fab/Label;->くし〴〺ぅ:I

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int v5, v2, v1

    iget v1, p0, Lcom/github/clans/fab/Label;->〺つふすそ:I

    iget v2, p0, Lcom/github/clans/fab/Label;->びぐびあび:I

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int v6, v2, v1

    iget v1, p0, Lcom/github/clans/fab/Label;->〺つふすそ:I

    iget v2, p0, Lcom/github/clans/fab/Label;->くし〴〺ぅ:I

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int v7, v2, v1

    iget v1, p0, Lcom/github/clans/fab/Label;->〺つふすそ:I

    iget v2, p0, Lcom/github/clans/fab/Label;->びぐびあび:I

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int v8, v2, v1

    const/4 v4, 0x1

    move-object v3, v0

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    goto :goto_57

    :cond_4a
    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/github/clans/fab/Label;->げつ〴ぬぐ()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-direct {v0, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    :goto_57
    invoke-direct {p0, v0}, Lcom/github/clans/fab/Label;->setBackgroundCompat(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public びぐびあび()V
    .registers 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-boolean v0, p0, Lcom/github/clans/fab/Label;->ぉざぅち〻:Z

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroid/widget/TextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/github/clans/fab/Label;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    :cond_a
    iget-object v0, p0, Lcom/github/clans/fab/Label;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/StateListDrawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_19

    check-cast v0, Landroid/graphics/drawable/StateListDrawable;

    new-array v1, v2, [I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/StateListDrawable;->setState([I)Z

    goto :goto_41

    :cond_19
    invoke-static {}, Lづざかべべ/は〲ぱなで/〺つふすそ;->げがぴうあだ()Z

    move-result v0

    if-eqz v0, :cond_41

    iget-object v0, p0, Lcom/github/clans/fab/Label;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v1, :cond_41

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    new-array v1, v2, [I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/RippleDrawable;->setState([I)Z

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/RippleDrawable;->setHotspot(FF)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/RippleDrawable;->setVisible(ZZ)Z

    :cond_41
    :goto_41
    return-void
.end method
