.class public Lcom/codetroopers/betterpickers/calendardatepicker/SimpleMonthView;
.super Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/graphics/Canvas;IIIIIIIIIZ)V
    .registers 12

    iget p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->ぉざぅち〻:I

    if-ne p2, p4, :cond_14

    int-to-float p2, p5

    sget p3, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->けときぜと:I

    div-int/lit8 p3, p3, 0x3

    sub-int p3, p6, p3

    int-to-float p3, p3

    sget p7, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->げがぴうあだ:I

    int-to-float p7, p7

    iget-object p8, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->ぁごぐすすぃ:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p7, p8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_14
    iget-boolean p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->ぇぬぎばつ:Z

    if-eqz p2, :cond_21

    iget p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->は〲ぱなで:I

    if-ne p2, p4, :cond_21

    iget-object p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->びぐびあび:Landroid/graphics/Paint;

    iget p3, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->ぉひのべい:I

    goto :goto_2a

    :cond_21
    iget-object p2, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->びぐびあび:Landroid/graphics/Paint;

    if-eqz p11, :cond_28

    iget p3, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->じぜこほぱ:I

    goto :goto_2a

    :cond_28
    iget p3, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->ぺづげぺが:I

    :goto_2a
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, p2, p3

    const-string p3, "%d"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    int-to-float p3, p5

    int-to-float p4, p6

    iget-object p5, p0, Lcom/codetroopers/betterpickers/calendardatepicker/MonthView;->びぐびあび:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method
