.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final いいにぽつ:I


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public final 〺つふすそ:Landroid/view/View;

.field public ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

.field public final くし〴〺ぅ:Landroid/graphics/Path;

.field public final げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;

.field public final づざかべべ:Landroid/graphics/Paint;

.field public なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

.field public final びぐびあび:Landroid/graphics/Paint;

.field public ぺぁあねじ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_a

    const/4 v0, 0x2

    :goto_7
    sput v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ:I

    goto :goto_12

    :cond_a
    const/16 v1, 0x12

    if-lt v0, v1, :cond_10

    const/4 v0, 0x1

    goto :goto_7

    :cond_10
    const/4 v0, 0x0

    goto :goto_7

    :goto_12
    return-void
.end method

.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;

    check-cast p1, Landroid/view/View;

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->くし〴〺ぅ:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Paint;

    const/4 v1, 0x7

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->びぐびあび:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;)V
    .registers 7

    const/4 v0, 0x1

    if-nez p1, :cond_7

    const/4 p1, 0x0

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    goto :goto_3f

    :cond_7
    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    if-nez v1, :cond_19

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    .line 1
    iget v2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    iget v3, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    iget v4, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    invoke-direct {v1, v2, v3, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;-><init>(FFF)V

    .line 2
    iput-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    goto :goto_25

    .line 3
    :cond_19
    iget v2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    iget v3, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    iget v4, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    .line 4
    iput v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    iput v3, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    iput v4, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    .line 5
    :goto_25
    iget v1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;)F

    move-result p1

    const v2, 0x38d1b717    # 1.0E-4f

    add-float/2addr v1, v2

    cmpl-float p1, v1, p1

    if-ltz p1, :cond_35

    const/4 p1, 0x1

    goto :goto_36

    :cond_35
    const/4 p1, 0x0

    :goto_36
    if-eqz p1, :cond_3f

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    iput v1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    .line 6
    :cond_3f
    :goto_3f
    sget p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ:I

    if-ne p1, v0, :cond_59

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->くし〴〺ぅ:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->rewind()V

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    if-eqz p1, :cond_59

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->くし〴〺ぅ:Landroid/graphics/Path;

    iget v1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    iget v2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    iget p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    :cond_59
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public 〺つふすそ()V
    .registers 3

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ:I

    if-nez v0, :cond_17

    const/4 v0, 0x0

    iput-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぺぁあねじ:Z

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->びぐびあび:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_17
    return-void
.end method

.method public ぁごぐすすぃ()Z
    .registers 2

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;->びぐびあび()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぺぁあねじ()Z

    move-result v0

    if-nez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    return v0
.end method

.method public final いいにぽつ()Z
    .registers 2

    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_12

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    return v0
.end method

.method public くし〴〺ぅ(Landroid/graphics/Canvas;)V
    .registers 11

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぺぁあねじ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_77

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ:I

    if-eqz v0, :cond_56

    if-eq v0, v1, :cond_28

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1c

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;->〺つふすそ(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ()Z

    move-result v0

    if-eqz v0, :cond_98

    goto :goto_82

    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported strategy "

    invoke-static {v1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_28
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->くし〴〺ぅ:Landroid/graphics/Path;

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {v2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;->〺つふすそ(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ()Z

    move-result v2

    if-eqz v2, :cond_52

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v6, v2

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v7, v2

    iget-object v8, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_52
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_98

    :cond_56
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    iget v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    iget v3, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    iget-object v4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->びぐびあび:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ()Z

    move-result v0

    if-eqz v0, :cond_98

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    iget v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    iget v3, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    iget-object v4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_98

    :cond_77
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;

    invoke-interface {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;->〺つふすそ(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ()Z

    move-result v0

    if-eqz v0, :cond_98

    :goto_82
    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v5, v0

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v6, v0

    iget-object v7, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1
    :cond_98
    :goto_98
    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_a5

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a5

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    if-eqz v0, :cond_a5

    goto :goto_a6

    :cond_a5
    const/4 v1, 0x0

    :goto_a6
    if-eqz v1, :cond_d3

    .line 2
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    iget v1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    iget v2, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v3

    sub-float/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-float v0, v1

    neg-float v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_d3
    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 7

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ:I

    if-nez v0, :cond_55

    const/4 v0, 0x1

    iput-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〳ぜぞぜべっ:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぺぁあねじ:Z

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->buildDrawingCache()V

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_43

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    if-eqz v3, :cond_43

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    if-eqz v3, :cond_43

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {v4, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :cond_43
    if-eqz v2, :cond_51

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->びぐびあび:Landroid/graphics/Paint;

    new-instance v4, Landroid/graphics/BitmapShader;

    sget-object v5, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v4, v2, v5, v5}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_51
    iput-boolean v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〳ぜぞぜべっ:Z

    iput-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぺぁあねじ:Z

    :cond_55
    return-void
.end method

.method public final づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;)F
    .registers 8

    iget v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    iget v1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float v4, p1

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float v5, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->へぬ〴づぞ(FFFFFF)F

    move-result p1

    return p1
.end method

.method public なぎぱいぢぎ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return-object v0

    :cond_6
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    .line 1
    iget v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->げつ〴ぬぐ:F

    iget v3, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->〺つふすそ:F

    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    invoke-direct {v1, v2, v3, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;-><init>(FFF)V

    .line 2
    iget v0, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1c

    const/4 v0, 0x1

    goto :goto_1d

    :cond_1c
    const/4 v0, 0x0

    :goto_1d
    if-eqz v0, :cond_25

    .line 3
    invoke-virtual {p0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;)F

    move-result v0

    iput v0, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    :cond_25
    return-object v1
.end method

.method public びぐびあび()I
    .registers 2

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public final ぺぁあねじ()Z
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_17

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;->くし〴〺ぅ:F

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v3

    if-nez v0, :cond_11

    const/4 v0, 0x1

    goto :goto_12

    :cond_11
    const/4 v0, 0x0

    :goto_12
    if-eqz v0, :cond_15

    goto :goto_17

    :cond_15
    const/4 v0, 0x0

    goto :goto_18

    :cond_17
    :goto_17
    const/4 v0, 0x1

    .line 2
    :goto_18
    sget v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->いいにぽつ:I

    if-nez v3, :cond_24

    if-nez v0, :cond_23

    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぺぁあねじ:Z

    if-eqz v0, :cond_23

    const/4 v1, 0x1

    :cond_23
    return v1

    :cond_24
    xor-int/2addr v0, v2

    return v0
.end method
