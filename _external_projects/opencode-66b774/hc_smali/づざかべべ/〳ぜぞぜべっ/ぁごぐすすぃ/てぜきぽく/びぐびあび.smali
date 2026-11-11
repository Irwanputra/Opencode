.class public Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;
.super Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;
.source ""


# static fields
.field public static ぺぁあねじ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    invoke-direct {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 1
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;->ぺぁあねじ:Ljava/lang/reflect/Method;

    if-nez p1, :cond_14

    :try_start_7
    const-class p1, Landroid/graphics/drawable/Drawable;

    const-string v0, "isProjected"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sput-object p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;->ぺぁあねじ:Ljava/lang/reflect/Method;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_14} :catch_14

    :catch_14
    :cond_14
    return-void
.end method

.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;Landroid/content/res/Resources;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;Landroid/content/res/Resources;)V

    .line 2
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;->ぺぁあねじ:Ljava/lang/reflect/Method;

    if-nez p1, :cond_14

    :try_start_7
    const-class p1, Landroid/graphics/drawable/Drawable;

    const-string p2, "isProjected"

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sput-object p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;->ぺぁあねじ:Ljava/lang/reflect/Method;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_14} :catch_14

    :catch_14
    :cond_14
    return-void
.end method


# virtual methods
.method public getDirtyBounds()Landroid/graphics/Rect;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    return-void
.end method

.method public isProjected()Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_16

    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;->ぺぁあねじ:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_16

    :try_start_9
    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_15} :catch_16

    return v0

    :catch_16
    :cond_16
    return v1
.end method

.method public setHotspot(FF)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    return-void
.end method

.method public setHotspotBounds(IIII)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V

    return-void
.end method

.method public setState([I)Z
    .registers 2

    invoke-super {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->setState([I)Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/4 p1, 0x1

    return p1

    :cond_b
    const/4 p1, 0x0

    return p1
.end method

.method public setTint(I)V
    .registers 3

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;->くし〴〺ぅ()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-super {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->setTint(I)V

    goto :goto_f

    :cond_a
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :goto_f
    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;->くし〴〺ぅ()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    iput-object p1, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->びぐびあび([I)Z

    goto :goto_17

    .line 2
    :cond_12
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :goto_17
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;->くし〴〺ぅ()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    iput-object p1, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->びぐびあび([I)Z

    goto :goto_17

    .line 2
    :cond_12
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :goto_17
    return-void
.end method

.method public くし〴〺ぅ()Z
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ne v0, v2, :cond_1a

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    instance-of v2, v0, Landroid/graphics/drawable/GradientDrawable;

    if-nez v2, :cond_19

    instance-of v2, v0, Landroid/graphics/drawable/DrawableContainer;

    if-nez v2, :cond_19

    instance-of v2, v0, Landroid/graphics/drawable/InsetDrawable;

    if-nez v2, :cond_19

    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v0, :cond_1a

    :cond_19
    const/4 v1, 0x1

    :cond_1a
    return v1
.end method
