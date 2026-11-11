.class public Lcom/github/clans/fab/FloatingActionButton$びぐびあび;
.super Landroid/graphics/drawable/ShapeDrawable;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/clans/fab/FloatingActionButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionButton;

.field public げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(Lcom/github/clans/fab/FloatingActionButton;Landroid/graphics/drawable/shapes/Shape;Lcom/github/clans/fab/FloatingActionButton$げつ〴ぬぐ;)V
    .registers 5

    .line 1
    iput-object p1, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionButton;

    invoke-direct {p0, p2}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {p1}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_16

    iget p2, p1, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    iget v0, p1, Lcom/github/clans/fab/FloatingActionButton;->なぎぱいぢぎ:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/2addr v0, p2

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    :goto_17
    iput v0, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->げつ〴ぬぐ:I

    invoke-virtual {p1}, Lcom/github/clans/fab/FloatingActionButton;->〳ぜぞぜべっ()Z

    move-result p2

    if-eqz p2, :cond_28

    iget p2, p1, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ:I

    iget p3, p1, Lcom/github/clans/fab/FloatingActionButton;->ぁごぐすすぃ:I

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    add-int/2addr p3, p2

    :cond_28
    iput p3, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->〺つふすそ:I

    .line 2
    iget-boolean p2, p1, Lcom/github/clans/fab/FloatingActionButton;->ざっざへづ:Z

    if-eqz p2, :cond_38

    .line 3
    iget p2, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->げつ〴ぬぐ:I

    .line 4
    iget p1, p1, Lcom/github/clans/fab/FloatingActionButton;->でどあくず:I

    add-int/2addr p2, p1

    .line 5
    iput p2, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->げつ〴ぬぐ:I

    add-int/2addr p3, p1

    iput p3, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->〺つふすそ:I

    :cond_38
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 7

    iget v0, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->げつ〴ぬぐ:I

    iget v1, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->〺つふすそ:I

    iget-object v2, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionButton;

    .line 1
    sget-object v3, Lcom/github/clans/fab/FloatingActionButton;->ぺがぅす〹ち:Landroid/graphics/Xfermode;

    invoke-virtual {v2}, Lcom/github/clans/fab/FloatingActionButton;->づざかべべ()I

    move-result v2

    .line 2
    iget v3, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->げつ〴ぬぐ:I

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->くし〴〺ぅ:Lcom/github/clans/fab/FloatingActionButton;

    .line 3
    invoke-virtual {v3}, Lcom/github/clans/fab/FloatingActionButton;->びぐびあび()I

    move-result v3

    .line 4
    iget v4, p0, Lcom/github/clans/fab/FloatingActionButton$びぐびあび;->〺つふすそ:I

    sub-int/2addr v3, v4

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    invoke-super {p0, p1}, Landroid/graphics/drawable/ShapeDrawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method
