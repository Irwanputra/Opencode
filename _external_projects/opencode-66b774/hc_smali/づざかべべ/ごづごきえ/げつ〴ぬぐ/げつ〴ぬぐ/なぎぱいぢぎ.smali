.class public abstract Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;
.super Landroid/graphics/drawable/Drawable;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/げつ〴ぬぐ;


# instance fields
.field public 〺つふすそ:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .registers 5

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_d

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_d

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    :cond_d
    return-void
.end method

.method public clearColorFilter()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    return-void

    :cond_8
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    return-void
.end method

.method public getCurrent()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getMinimumHeight()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    return v0

    :cond_9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    return v0
.end method

.method public getMinimumWidth()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    return v0

    :cond_9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    return v0
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_9
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public getState()[I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    return-object v0

    :cond_9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    return-object v0
.end method

.method public getTransparentRegion()Landroid/graphics/Region;
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region;

    move-result-object v0

    return-object v0

    :cond_9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region;

    move-result-object v0

    return-object v0
.end method

.method public jumpToCurrentState()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    .line 1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_7
    return-void
.end method

.method public onLevelChange(I)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    :cond_9
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLevelChange(I)Z

    move-result p1

    return p1
.end method

.method public setChangingConfigurations(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    return-void

    :cond_8
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    return-void
.end method

.method public setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void

    :cond_8
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setFilterBitmap(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    :cond_7
    return-void
.end method

.method public setHotspot(FF)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-static {v0, p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->のびぶけせ(Landroid/graphics/drawable/Drawable;FF)V

    :cond_7
    return-void
.end method

.method public setHotspotBounds(IIII)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-static {v0, p1, p2, p3, p4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぇいうげ〱〹(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_7
    return-void
.end method

.method public setState([I)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_9
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1
.end method
