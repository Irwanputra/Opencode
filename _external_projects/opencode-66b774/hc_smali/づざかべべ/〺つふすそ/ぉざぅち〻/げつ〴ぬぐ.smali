.class public abstract Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;
.super Landroid/view/ViewGroup;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;

.field public ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

.field public final くし〴〺ぅ:Landroid/content/Context;

.field public づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

.field public なぎぱいぢぎ:I

.field public びぐびあび:Landroidx/appcompat/widget/ActionMenuView;

.field public ぺぁあねじ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {p2, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;)V

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarPopupTheme:I

    const/4 v1, 0x1

    invoke-virtual {p3, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p3

    if-eqz p3, :cond_2a

    iget p3, p2, Landroid/util/TypedValue;->resourceId:I

    if-eqz p3, :cond_2a

    new-instance p3, Landroid/view/ContextThemeWrapper;

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {p3, p1, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/content/Context;

    goto :goto_2c

    :cond_2a
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/content/Context;

    :goto_2c
    return-void
.end method

.method public static synthetic 〺つふすそ(Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;I)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public static synthetic げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;I)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public getAnimatedVisibility()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;

    iget v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:I

    return v0

    :cond_9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    return v0
.end method

.method public getContentHeight()I
    .registers 2

    iget v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->なぎぱいぢぎ:I

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 6

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar:[I

    sget v1, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->actionBarStyle:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lづざかべべ/〺つふすそ/いいにぽつ;->ActionBar_height:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->setContentHeight(I)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p1, :cond_6a

    .line 1
    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->くし〴〺ぅ:Landroid/content/Context;

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    const/16 v3, 0x258

    if-gt v0, v3, :cond_5f

    if-gt v1, v3, :cond_5f

    const/16 v0, 0x2d0

    const/16 v3, 0x3c0

    if-le v1, v3, :cond_3f

    if-gt v2, v0, :cond_5f

    :cond_3f
    if-le v1, v0, :cond_44

    if-le v2, v3, :cond_44

    goto :goto_5f

    :cond_44
    const/16 v0, 0x1f4

    if-ge v1, v0, :cond_5d

    const/16 v0, 0x1e0

    const/16 v3, 0x280

    if-le v1, v3, :cond_50

    if-gt v2, v0, :cond_5d

    :cond_50
    if-le v1, v0, :cond_55

    if-le v2, v3, :cond_55

    goto :goto_5d

    :cond_55
    const/16 v0, 0x168

    if-lt v1, v0, :cond_5b

    const/4 v0, 0x3

    goto :goto_60

    :cond_5b
    const/4 v0, 0x2

    goto :goto_60

    :cond_5d
    :goto_5d
    const/4 v0, 0x4

    goto :goto_60

    :cond_5f
    :goto_5f
    const/4 v0, 0x5

    .line 3
    :goto_60
    iput v0, p1, Landroidx/appcompat/widget/ActionMenuPresenter;->ざとぅぼこ〺:I

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz p1, :cond_6a

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぉざぅち〻(Z)V

    :cond_6a
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    if-ne v0, v2, :cond_b

    iput-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぺぁあねじ:Z

    :cond_b
    iget-boolean v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぺぁあねじ:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1a

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-ne v0, v2, :cond_1a

    if-nez p1, :cond_1a

    iput-boolean v4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぺぁあねじ:Z

    :cond_1a
    const/16 p1, 0xa

    if-eq v0, p1, :cond_21

    const/4 p1, 0x3

    if-ne v0, p1, :cond_23

    :cond_21
    iput-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぺぁあねじ:Z

    :cond_23
    return v4
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_9

    iput-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->〳ぜぞぜべっ:Z

    :cond_9
    iget-boolean v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->〳ぜぞぜべっ:Z

    const/4 v3, 0x1

    if-nez v2, :cond_18

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez v0, :cond_18

    if-nez p1, :cond_18

    iput-boolean v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->〳ぜぞぜべっ:Z

    :cond_18
    if-eq v0, v3, :cond_1d

    const/4 p1, 0x3

    if-ne v0, p1, :cond_1f

    :cond_1d
    iput-boolean v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->〳ぜぞぜべっ:Z

    :cond_1f
    return v3
.end method

.method public abstract setContentHeight(I)V
.end method

.method public setVisibility(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-eq p1, v0, :cond_10

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->〺つふすそ()V

    :cond_d
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_10
    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;III)I
    .registers 6

    const/high16 v0, -0x80000000

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, v0, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr p2, p1

    sub-int/2addr p2, p4

    const/4 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public づざかべべ(IJ)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->〺つふすそ()V

    :cond_7
    const/4 v0, 0x0

    if-nez p1, :cond_2b

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_13

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    :cond_13
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->げつ〴ぬぐ(F)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    invoke-virtual {v0, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->くし〴〺ぅ(J)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;

    .line 1
    iget-object p3, p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;

    iput-object v0, p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iput p1, p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:I

    .line 2
    invoke-virtual {v0, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->びぐびあび(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    return-object v0

    :cond_2b
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    move-result-object v1

    invoke-virtual {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->げつ〴ぬぐ(F)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    invoke-virtual {v1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->くし〴〺ぅ(J)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;

    .line 3
    iget-object p3, p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;

    iput-object v1, p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iput p1, p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:I

    .line 4
    invoke-virtual {v1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->びぐびあび(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    return-object v1
.end method

.method public びぐびあび(Landroid/view/View;IIIZ)I
    .registers 8

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr p4, v1

    div-int/lit8 p4, p4, 0x2

    add-int/2addr p4, p3

    if-eqz p5, :cond_15

    sub-int p3, p2, v0

    add-int/2addr v1, p4

    invoke-virtual {p1, p3, p4, p2, v1}, Landroid/view/View;->layout(IIII)V

    goto :goto_1b

    :cond_15
    add-int p3, p2, v0

    add-int/2addr v1, p4

    invoke-virtual {p1, p2, p4, p3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_1b
    if-eqz p5, :cond_1e

    neg-int v0, v0

    :cond_1e
    return v0
.end method
