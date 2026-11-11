.class public Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;
.super Landroid/view/View;
.source ""


# instance fields
.field public final 〺つふすそ:Landroid/graphics/Paint;

.field public ぁごぐすすぃ:Z

.field public くし〴〺ぅ:F

.field public づざかべべ:I

.field public なぎぱいぢぎ:D

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->〺つふすそ:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public getDisappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public getReappearAnimator()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/ぺぁあねじ;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    return-void
.end method

.method public setAnimationRadiusMultiplier(F)V
    .registers 2

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->くし〴〺ぅ:F

    return-void
.end method

.method public setSelection(IZZ)V
    .registers 6

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->づざかべべ:I

    int-to-double p1, p1

    const-wide v0, 0x400921fb54442d18L    # Math.PI

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, v0

    const-wide v0, 0x4066800000000000L    # 180.0

    div-double/2addr p1, v0

    iput-wide p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->なぎぱいぢぎ:D

    iput-boolean p3, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->ぁごぐすすぃ:Z

    return-void
.end method

.method public setTheme(Landroid/content/res/TypedArray;)V
    .registers 6

    iget-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->〺つふすそ:Landroid/graphics/Paint;

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogs_bpRadialPointerColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpBlue:I

    invoke-static {v2, v3}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogs_bpRadialPointerAlpha:I

    const/16 v1, 0x23

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/RadialSelectorView;->びぐびあび:I

    return-void
.end method
