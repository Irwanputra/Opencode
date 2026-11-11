.class public Lcom/codetroopers/betterpickers/recurrencepicker/WeekButton;
.super Landroid/widget/ToggleButton;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static setSuggestedWidth(I)V
    .registers 1

    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .registers 6

    invoke-super {p0, p1, p2}, Landroid/widget/ToggleButton;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/widget/ToggleButton;->getMeasuredHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/ToggleButton;->getMeasuredWidth()I

    move-result p2

    if-lez p1, :cond_31

    if-lez p2, :cond_31

    const/high16 v0, 0x40000000    # 2.0f

    if-ge p2, p1, :cond_21

    .line 1
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeightAndState()I

    move-result v1

    .line 2
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-eq v1, v0, :cond_31

    move p1, p2

    goto :goto_34

    :cond_21
    if-ge p1, p2, :cond_31

    .line 3
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidthAndState()I

    move-result v1

    .line 4
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-eq v1, v0, :cond_31

    move p2, p1

    goto :goto_34

    :cond_31
    move v2, p2

    move p2, p1

    move p1, v2

    :goto_34
    invoke-virtual {p0, p1, p2}, Landroid/widget/ToggleButton;->setMeasuredDimension(II)V

    return-void
.end method
