.class public Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/は〲ぱなで/ぉひのべい;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/view/ViewGroup;

.field public くし〴〺ぅ:Landroid/view/View;

.field public づざかべべ:Lづざかべべ/は〲ぱなで/ぉひのべい;

.field public なぎぱいぢぎ:Z

.field public びぐびあび:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 5

    :try_start_0
    const-class v0, Landroid/view/ViewGroup;

    const-string v1, "invalidateChildInParentFast"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-class v4, Landroid/graphics/Rect;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_17
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_17} :catch_17

    :catch_17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lづざかべべ/は〲ぱなで/ぉひのべい;)V
    .registers 5

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->びぐびあび:Ljava/util/ArrayList;

    iput-object p2, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/ViewGroup;

    iput-object p3, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getWidth()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setRight(I)V

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setBottom(I)V

    invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p4, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/は〲ぱなで/ぉひのべい;

    return-void
.end method


# virtual methods
.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 7

    const/4 v0, 0x2

    new-array v1, v0, [I

    new-array v0, v0, [I

    iget-object v2, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    iget-object v2, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v2, 0x0

    aget v3, v0, v2

    aget v4, v1, v2

    sub-int/2addr v3, v4

    int-to-float v3, v3

    const/4 v4, 0x1

    aget v0, v0, v4

    aget v1, v1, v4

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->translate(FF)V

    new-instance v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v3, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v0, v2, v2, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->びぐびあび:Ljava/util/ArrayList;

    if-nez v0, :cond_3d

    const/4 v0, 0x0

    goto :goto_41

    :cond_3d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_41
    if-ge v2, v0, :cond_51

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_41

    :cond_51
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .registers 10

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_43

    const/4 v0, 0x0

    aget v1, p1, v0

    const/4 v2, 0x1

    aget v3, p1, v2

    invoke-virtual {p2, v1, v3}, Landroid/graphics/Rect;->offset(II)V

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/ViewGroup;

    instance-of v3, v1, Landroid/view/ViewGroup;

    if-eqz v3, :cond_40

    aput v0, p1, v0

    aput v0, p1, v2

    const/4 v3, 0x2

    new-array v4, v3, [I

    new-array v5, v3, [I

    new-array v3, v3, [I

    .line 1
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v1, v3, v0

    aget v6, v5, v0

    sub-int/2addr v1, v6

    aput v1, v4, v0

    aget v1, v3, v2

    aget v3, v5, v2

    sub-int/2addr v1, v3

    aput v1, v4, v2

    .line 2
    aget v0, v4, v0

    aget v1, v4, v2

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Rect;->offset(II)V

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    move-result-object p1

    return-object p1

    :cond_40
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->invalidate(Landroid/graphics/Rect;)V

    :cond_43
    const/4 p1, 0x0

    return-object p1
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 6

    return-void
.end method

.method public verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->びぐびあび:Ljava/util/ArrayList;

    if-eqz v0, :cond_11

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_13

    :cond_11
    const/4 p1, 0x0

    goto :goto_14

    :cond_13
    :goto_13
    const/4 p1, 0x1

    :goto_14
    return p1
.end method

.method public final げつ〴ぬぐ()V
    .registers 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_18

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->びぐびあび:Ljava/util/ArrayList;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_18

    :cond_10
    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_18
    return-void
.end method
