.class public Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;
.super Landroid/graphics/drawable/Drawable;
.source ""

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/〺つふすそ;
.implements Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/げつ〴ぬぐ;


# static fields
.field public static final 〳ぜぞぜべっ:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public 〺つふすそ:I

.field public ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

.field public くし〴〺ぅ:Landroid/graphics/PorterDuff$Mode;

.field public づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

.field public なぎぱいぢぎ:Z

.field public びぐびあび:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->〳ぜぞぜべっ:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 1
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    invoke-direct {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;Landroid/content/res/Resources;)V
    .registers 3

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    if-eqz p1, :cond_12

    .line 3
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->〺つふすそ:Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz p1, :cond_12

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)V

    :cond_12
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getChangingConfigurations()I
    .registers 3

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->getChangingConfigurations()I

    move-result v1

    goto :goto_e

    :cond_d
    const/4 v1, 0x0

    :goto_e
    or-int/2addr v0, v1

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    if-eqz v0, :cond_16

    .line 1
    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->〺つふすそ:Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v1, :cond_a

    const/4 v1, 0x1

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    :goto_b
    if-eqz v1, :cond_16

    .line 2
    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->げつ〴ぬぐ:I

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    return-object v0

    :cond_16
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCurrent()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public getMinimumHeight()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    return v0
.end method

.method public getMinimumWidth()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public getState()[I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    return-object v0
.end method

.method public getTransparentRegion()Landroid/graphics/Region;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region;

    move-result-object v0

    return-object v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public isAutoMirrored()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result v0

    return v0
.end method

.method public isStateful()Z
    .registers 2

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->くし〴〺ぅ()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    if-eqz v0, :cond_d

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_16

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_16
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_20

    :cond_1e
    const/4 v0, 0x1

    goto :goto_21

    :cond_20
    const/4 v0, 0x0

    :goto_21
    return v0
.end method

.method public jumpToCurrentState()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->なぎぱいぢぎ:Z

    if-nez v0, :cond_2d

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_2d

    .line 1
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    invoke-direct {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    :cond_1a
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    if-eqz v0, :cond_2a

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_27

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    goto :goto_28

    :cond_27
    const/4 v1, 0x0

    :goto_28
    iput-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->〺つふすそ:Landroid/graphics/drawable/Drawable$ConstantState;

    :cond_2a
    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->なぎぱいぢぎ:Z

    :cond_2d
    return-object p0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_7
    return-void
.end method

.method public onLevelChange(I)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .registers 5

    invoke-virtual {p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setAlpha(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method public setAutoMirrored(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    return-void
.end method

.method public setChangingConfigurations(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public setDither(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    return-void
.end method

.method public setFilterBitmap(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    return-void
.end method

.method public setState([I)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->びぐびあび([I)Z

    move-result p1

    if-nez p1, :cond_11

    if-eqz v0, :cond_f

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

.method public setTint(I)V
    .registers 2

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    iput-object p1, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->びぐびあび([I)Z

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    iput-object p1, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->びぐびあび([I)Z

    return-void
.end method

.method public setVisible(ZZ)Z
    .registers 4

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    if-eqz p1, :cond_f

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

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .registers 3

    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final 〺つふすそ()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public くし〴〺ぅ()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method

.method public final げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_8
    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_36

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->setVisible(ZZ)Z

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {p0, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->setState([I)Z

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    if-eqz v0, :cond_36

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p1

    iput-object p1, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->〺つふすそ:Landroid/graphics/drawable/Drawable$ConstantState;

    :cond_36
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final びぐびあび([I)Z
    .registers 6

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->くし〴〺ぅ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    :cond_8
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;

    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    if-eqz v2, :cond_31

    if-eqz v0, :cond_31

    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v3

    invoke-virtual {v2, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    iget-boolean v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->びぐびあび:Z

    if-eqz v2, :cond_26

    iget v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:I

    if-ne p1, v2, :cond_26

    iget-object v2, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->くし〴〺ぅ:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, v2, :cond_36

    :cond_26
    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    iput p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->〺つふすそ:I

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->くし〴〺ぅ:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->びぐびあび:Z

    return p1

    :cond_31
    iput-boolean v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->びぐびあび:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    :cond_36
    return v1
.end method
