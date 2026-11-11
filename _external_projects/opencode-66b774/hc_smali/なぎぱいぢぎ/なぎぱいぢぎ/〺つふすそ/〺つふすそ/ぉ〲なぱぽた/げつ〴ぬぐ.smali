.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:I

.field public final くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Z

.field public final びぐびあび:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->elevationOverlayEnabled:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->にぢ〱ぁな(Landroid/content/Context;IZ)Z

    move-result v0

    iput-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->elevationOverlayColor:I

    invoke-static {p1, v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->でどあくず(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->〺つふすそ:I

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorSurface:I

    invoke-static {p1, v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->でどあくず(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->びぐびあび:F

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(IF)I
    .registers 7

    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_48

    const/16 v0, 0xff

    .line 1
    invoke-static {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/げつ〴ぬぐ;->くし〴〺ぅ(II)I

    move-result v1

    iget v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ne v1, v2, :cond_10

    const/4 v1, 0x1

    goto :goto_11

    :cond_10
    const/4 v1, 0x0

    :goto_11
    if-eqz v1, :cond_48

    .line 2
    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->びぐびあび:F

    const/4 v2, 0x0

    cmpg-float v3, v1, v2

    if-lez v3, :cond_36

    cmpg-float v3, p2, v2

    if-gtz v3, :cond_1f

    goto :goto_36

    :cond_1f
    div-float/2addr p2, v1

    const/high16 v1, 0x40900000    # 4.5f

    float-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->log1p(D)D

    move-result-wide v2

    double-to-float p2, v2

    mul-float p2, p2, v1

    const/high16 v1, 0x40000000    # 2.0f

    add-float/2addr p2, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p2, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 3
    :cond_36
    :goto_36
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p2

    invoke-static {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/げつ〴ぬぐ;->くし〴〺ぅ(II)I

    move-result p1

    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;->〺つふすそ:I

    invoke-static {p1, v0, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ごまけがぢは(IIF)I

    move-result p1

    invoke-static {p1, p2}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/げつ〴ぬぐ;->くし〴〺ぅ(II)I

    move-result p1

    :cond_48
    return p1
.end method
