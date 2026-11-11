.class public Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;
.super Landroid/widget/TextView;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/graphics/Paint;

.field public くし〴〺ぅ:I

.field public づざかべべ:Z

.field public final びぐびあび:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/くし〴〺ぅ;->bpBlue:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->くし〴〺ぅ:I

    sget v0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/びぐびあび;->month_select_circle_radius:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->item_is_selected:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->びぐびあび:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->げつ〴ぬぐ()V

    return-void
.end method


# virtual methods
.method public getContentDescription()Ljava/lang/CharSequence;
    .registers 5

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    iget-boolean v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->づざかべべ:Z

    if-eqz v1, :cond_14

    iget-object v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->びぐびあび:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_14
    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 6

    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->づざかべべ:Z

    if-eqz v0, :cond_21

    invoke-virtual {p0}, Landroid/widget/TextView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    int-to-float v2, v2

    iget-object v3, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_21
    return-void
.end method

.method public setCircleColor(I)V
    .registers 2

    iput p1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->くし〴〺ぅ:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->げつ〴ぬぐ()V

    return-void
.end method

.method public final げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->〺つふすそ:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->〺つふすそ:Landroid/graphics/Paint;

    iget v1, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->くし〴〺ぅ:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->〺つふすそ:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->〺つふすそ:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/codetroopers/betterpickers/calendardatepicker/TextViewWithCircularIndicator;->〺つふすそ:Landroid/graphics/Paint;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method
