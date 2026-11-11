.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;


# instance fields
.field public final ぅみぱぎぎ:Landroid/view/View$OnLayoutChangeListener;

.field public ぇ〳〲〺すっ:Ljava/lang/CharSequence;

.field public ぉひのべい:I

.field public おかぷせ〱:I

.field public けときぜと:I

.field public final じぜこほぱ:Landroid/graphics/Rect;

.field public せづっ〸ちね:I

.field public final どぇぞほだ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

.field public final なぶひせが:Landroid/graphics/Paint$FontMetrics;

.field public final びえぁぜい:Landroid/content/Context;

.field public ぷぞてのほき:I

.field public ぺづげぺが:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance p2, Landroid/graphics/Paint$FontMetrics;

    invoke-direct {p2}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->なぶひせが:Landroid/graphics/Paint$FontMetrics;

    new-instance p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    invoke-direct {p2, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;)V

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->どぇぞほだ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    new-instance p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {p3, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;)V

    iput-object p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぅみぱぎぎ:Landroid/view/View$OnLayoutChangeListener;

    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->じぜこほぱ:Landroid/graphics/Rect;

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->びえぁぜい:Landroid/content/Context;

    .line 1
    iget-object p3, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p3, Landroid/text/TextPaint;->density:F

    .line 3
    iget-object p1, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 4
    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 15

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぉひのべい()F

    move-result v0

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->けときぜと:I

    int-to-double v1, v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->けときぜと:I

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v3, v1

    neg-double v1, v3

    double-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-super {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->draw(Landroid/graphics/Canvas;)V

    .line 1
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぇ〳〲〺すっ:Ljava/lang/CharSequence;

    if-nez v0, :cond_29

    goto :goto_77

    :cond_29
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    int-to-float v1, v1

    .line 3
    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->どぇぞほだ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 4
    iget-object v2, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 5
    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->なぶひせが:Landroid/graphics/Paint$FontMetrics;

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->なぶひせが:Landroid/graphics/Paint$FontMetrics;

    iget v3, v2, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    add-float/2addr v3, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v3, v2

    sub-float/2addr v1, v3

    float-to-int v1, v1

    .line 6
    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->どぇぞほだ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 7
    iget-object v3, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    if-eqz v3, :cond_62

    .line 8
    iget-object v2, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v3

    iput-object v3, v2, Landroid/text/TextPaint;->drawableState:[I

    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->どぇぞほだ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->びえぁぜい:Landroid/content/Context;

    .line 10
    iget-object v4, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    iget-object v5, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    iget-object v2, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;

    invoke-virtual {v4, v3, v5, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;->くし〴〺ぅ(Landroid/content/Context;Landroid/text/TextPaint;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;)V

    .line 11
    :cond_62
    iget-object v7, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぇ〳〲〺すっ:Ljava/lang/CharSequence;

    const/4 v8, 0x0

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v9

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v10, v0

    int-to-float v11, v1

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->どぇぞほだ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 12
    iget-object v12, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    move-object v6, p1

    .line 13
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 14
    :goto_77
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public getIntrinsicHeight()I
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->どぇぞほだ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 2
    invoke-virtual {v0}, Landroid/text/TextPaint;->getTextSize()F

    move-result v0

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->せづっ〸ちね:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .registers 4

    iget v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぺづげぺが:I

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    .line 1
    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぇ〳〲〺すっ:Ljava/lang/CharSequence;

    if-nez v1, :cond_b

    const/4 v1, 0x0

    goto :goto_15

    :cond_b
    iget-object v2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->どぇぞほだ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ(Ljava/lang/String;)F

    move-result v1

    :goto_15
    add-float/2addr v0, v1

    .line 2
    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぉひのべい:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .registers 3

    invoke-super {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 1
    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget-object p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    .line 3
    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->せづっ〸ちね()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/なぎぱいぢぎ;

    move-result-object p1

    .line 4
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;->ぺふねづ〺:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/なぎぱいぢぎ;

    .line 5
    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    return-void
.end method

.method public onStateChange([I)Z
    .registers 2

    invoke-super {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->onStateChange([I)Z

    move-result p1

    return p1
.end method

.method public final ぉひのべい()F
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->じぜこほぱ:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->おかぷせ〱:I

    sub-int/2addr v0, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぷぞてのほき:I

    sub-int/2addr v0, v1

    if-gez v0, :cond_26

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->じぜこほぱ:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->おかぷせ〱:I

    sub-int/2addr v0, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぷぞてのほき:I

    sub-int/2addr v0, v1

    :goto_24
    int-to-float v0, v0

    goto :goto_4c

    :cond_26
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->じぜこほぱ:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->おかぷせ〱:I

    sub-int/2addr v0, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぷぞてのほき:I

    add-int/2addr v0, v1

    if-lez v0, :cond_4b

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->じぜこほぱ:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->おかぷせ〱:I

    sub-int/2addr v0, v1

    iget v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぷぞてのほき:I

    add-int/2addr v0, v1

    goto :goto_24

    :cond_4b
    const/4 v0, 0x0

    :goto_4c
    return v0
.end method

.method public げつ〴ぬぐ()V
    .registers 1

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    return-void
.end method

.method public final せづっ〸ちね()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/なぎぱいぢぎ;
    .registers 8

    invoke-virtual {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->ぉひのべい()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-double v1, v1

    iget v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->けときぜと:I

    int-to-double v3, v3

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v1, v5

    double-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    neg-float v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/ぺぁあねじ;

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/ぁごぐすすぃ;

    iget v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぇとしたべど/げつ〴ぬぐ;->けときぜと:I

    int-to-float v3, v3

    invoke-direct {v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/ぁごぐすすぃ;-><init>(F)V

    invoke-direct {v1, v2, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/ぺぁあねじ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/なぎぱいぢぎ;F)V

    return-object v1
.end method
