.class public Lcom/github/clans/fab/Label$くし〴〺ぅ;
.super Landroid/graphics/drawable/Drawable;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/clans/fab/Label;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/graphics/Paint;

.field public final synthetic くし〴〺ぅ:Lcom/github/clans/fab/Label;

.field public げつ〴ぬぐ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/Label;Lcom/github/clans/fab/Label$げつ〴ぬぐ;)V
    .registers 6

    .line 1
    iput-object p1, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->くし〴〺ぅ:Lcom/github/clans/fab/Label;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance p2, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->〺つふすそ:Landroid/graphics/Paint;

    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, v0, p2}, Landroid/widget/TextView;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object p2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    .line 3
    iget v0, p1, Lcom/github/clans/fab/Label;->いいにぽつ:I

    .line 4
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->〺つふすそ:Landroid/graphics/Paint;

    .line 5
    sget-object v0, Lcom/github/clans/fab/Label;->ごづごきえ:Landroid/graphics/Xfermode;

    .line 6
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {p1}, Landroid/widget/TextView;->isInEditMode()Z

    move-result p2

    if-nez p2, :cond_43

    iget-object p2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    .line 7
    iget v0, p1, Lcom/github/clans/fab/Label;->〺つふすそ:I

    int-to-float v0, v0

    .line 8
    iget v1, p1, Lcom/github/clans/fab/Label;->くし〴〺ぅ:I

    int-to-float v1, v1

    .line 9
    iget v2, p1, Lcom/github/clans/fab/Label;->びぐびあび:I

    int-to-float v2, v2

    .line 10
    iget p1, p1, Lcom/github/clans/fab/Label;->づざかべべ:I

    .line 11
    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :cond_43
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 7

    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->くし〴〺ぅ:Lcom/github/clans/fab/Label;

    .line 1
    iget v2, v1, Lcom/github/clans/fab/Label;->〺つふすそ:I

    .line 2
    iget v1, v1, Lcom/github/clans/fab/Label;->くし〴〺ぅ:I

    .line 3
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->くし〴〺ぅ:Lcom/github/clans/fab/Label;

    .line 4
    iget v3, v2, Lcom/github/clans/fab/Label;->〺つふすそ:I

    .line 5
    iget v2, v2, Lcom/github/clans/fab/Label;->びぐびあび:I

    .line 6
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->くし〴〺ぅ:Lcom/github/clans/fab/Label;

    .line 7
    iget v4, v3, Lcom/github/clans/fab/Label;->〳ぜぞぜべっ:I

    int-to-float v4, v4

    .line 8
    iget v3, v3, Lcom/github/clans/fab/Label;->ぺぁあねじ:I

    int-to-float v3, v3

    .line 9
    invoke-direct {v0, v1, v2, v4, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v1, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->くし〴〺ぅ:Lcom/github/clans/fab/Label;

    .line 10
    iget v1, v1, Lcom/github/clans/fab/Label;->のぷのちつ:I

    int-to-float v1, v1

    .line 11
    iget-object v2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->くし〴〺ぅ:Lcom/github/clans/fab/Label;

    .line 12
    iget v1, v1, Lcom/github/clans/fab/Label;->のぷのちつ:I

    int-to-float v1, v1

    .line 13
    iget-object v2, p0, Lcom/github/clans/fab/Label$くし〴〺ぅ;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public getOpacity()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public setAlpha(I)V
    .registers 2

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 2

    return-void
.end method
