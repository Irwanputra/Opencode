.class public Lcom/github/clans/fab/FloatingActionButton$づざかべべ;
.super Landroid/graphics/drawable/Drawable;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/clans/fab/FloatingActionButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/graphics/Paint;

.field public くし〴〺ぅ:F

.field public げつ〴ぬぐ:Landroid/graphics/Paint;

.field public final synthetic びぐびあび:Lcom/github/clans/fab/FloatingActionButton;


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionButton;Lcom/github/clans/fab/FloatingActionButton$げつ〴ぬぐ;)V
    .registers 7

    .line 1
    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->びぐびあび:Lcom/github/clans/fab/FloatingActionButton;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance p2, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->〺つふすそ:Landroid/graphics/Paint;

    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, v0, p2}, Landroid/widget/ImageButton;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    .line 3
    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ:I

    .line 4
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->〺つふすそ:Landroid/graphics/Paint;

    .line 5
    sget-object v0, Lcom/github/clans/fab/FloatingActionButton;->ぺがぅす〹ち:Landroid/graphics/Xfermode;

    .line 6
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {p1}, Landroid/widget/ImageButton;->isInEditMode()Z

    move-result p2

    if-nez p2, :cond_43

    iget-object p2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    int-to-float v0, v0

    iget v1, p1, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    int-to-float v1, v1

    iget v2, p1, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    int-to-float v2, v2

    iget v3, p1, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび:I

    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :cond_43
    invoke-static {p1}, Lcom/github/clans/fab/FloatingActionButton;->げつ〴ぬぐ(Lcom/github/clans/fab/FloatingActionButton;)I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    int-to-float p2, p2

    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->くし〴〺ぅ:F

    .line 7
    iget-boolean v0, p1, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    if-eqz v0, :cond_5a

    .line 8
    iget-boolean v0, p1, Lcom/github/clans/fab/FloatingActionButton;->ごまけがぢは:Z

    if-eqz v0, :cond_5a

    .line 9
    iget p1, p1, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    int-to-float p1, p1

    add-float/2addr p2, p1

    .line 10
    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->くし〴〺ぅ:F

    :cond_5a
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 6

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->びぐびあび:Lcom/github/clans/fab/FloatingActionButton;

    .line 1
    sget-object v1, Lcom/github/clans/fab/FloatingActionButton;->ぺがぅす〹ち:Landroid/graphics/Xfermode;

    invoke-virtual {v0}, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ()F

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->びぐびあび:Lcom/github/clans/fab/FloatingActionButton;

    .line 3
    invoke-virtual {v1}, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ()F

    move-result v1

    .line 4
    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->くし〴〺ぅ:F

    iget-object v3, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->げつ〴ぬぐ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->びぐびあび:Lcom/github/clans/fab/FloatingActionButton;

    .line 5
    invoke-virtual {v0}, Lcom/github/clans/fab/FloatingActionButton;->〺つふすそ()F

    move-result v0

    .line 6
    iget-object v1, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->びぐびあび:Lcom/github/clans/fab/FloatingActionButton;

    .line 7
    invoke-virtual {v1}, Lcom/github/clans/fab/FloatingActionButton;->くし〴〺ぅ()F

    move-result v1

    .line 8
    iget v2, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->くし〴〺ぅ:F

    iget-object v3, p0, Lcom/github/clans/fab/FloatingActionButton$づざかべべ;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

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
