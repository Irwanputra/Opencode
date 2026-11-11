.class public Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;
.super Landroid/view/View;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:I

.field public final 〺つふすそ:Landroid/graphics/Paint;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:I

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:I

.field public ぺぁあねじ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->〺つふすそ:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    return-void
.end method

.method public setAmOrPm(I)V
    .registers 2

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->〳ぜぞぜべっ:I

    return-void
.end method

.method public setAmOrPmPressed(I)V
    .registers 2

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->ぺぁあねじ:I

    return-void
.end method

.method public setTheme(Landroid/content/res/TypedArray;)V
    .registers 5

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogs_bpAmPmCircleColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpBlue:I

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->づざかべべ:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->ぁごぐすすぃ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/いいにぽつ;->BetterPickersDialogs_bpAmPmTextColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpWhite:I

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->なぎぱいぢぎ:I

    const/16 p1, 0xc8

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->くし〴〺ぅ:I

    const/16 p1, 0x32

    iput p1, p0, Lcom/codetroopers/betterpickers/radialtimepicker/AmPmCirclesView;->びぐびあび:I

    return-void
.end method
