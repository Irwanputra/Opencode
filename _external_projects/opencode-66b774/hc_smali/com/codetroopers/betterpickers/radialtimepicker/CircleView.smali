.class public Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;
.super Landroid/view/View;
.source ""


# instance fields
.field public final 〺つふすそ:Landroid/graphics/Paint;

.field public くし〴〺ぅ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpWhite:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;->くし〴〺ぅ:I

    sget v1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->numbers_text_color:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;->びぐびあび:I

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    return-void
.end method

.method public setTheme(Landroid/content/res/TypedArray;)V
    .registers 5

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogs_bpRadialBackgroundColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->radial_gray_light:I

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;->くし〴〺ぅ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogs_bpRadialTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpBlue:I

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/CircleView;->びぐびあび:I

    return-void
.end method
